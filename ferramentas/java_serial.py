"""Leitor/gravador próprio do protocolo Java Object Serialization v5.

Não executa classes Java. Estruturas desconhecidas permanecem como dados.
"""
from dataclasses import dataclass, field
import struct

class JavaString(str):
    pass

@dataclass(eq=False)
class ClassDesc:
    name: str
    uid: int
    flags: int
    fields: list = field(default_factory=list)
    parent: object = None
    annotations: list = field(default_factory=list)

@dataclass(eq=False)
class Obj:
    desc: ClassDesc
    fields: dict = field(default_factory=dict)
    extras: dict = field(default_factory=dict)

@dataclass(eq=False)
class Array:
    desc: ClassDesc
    items: list = field(default_factory=list)

@dataclass(eq=False)
class Block:
    data: bytes
    long: bool = False

@dataclass(eq=False)
class Enum:
    desc: ClassDesc
    name: str = ''


def utf_decode(data):
    units=[];i=0
    while i<len(data):
        c=data[i];i+=1
        if c<128:units.append(c)
        elif c&224==192:
            if i>=len(data):raise ValueError('UTF truncado')
            units.append((c&31)<<6 | data[i]&63);i+=1
        elif c&240==224:
            if i+1>=len(data):raise ValueError('UTF truncado')
            units.append((c&15)<<12 | (data[i]&63)<<6 | data[i+1]&63);i+=2
        else:raise ValueError('UTF modificado inválido')
    b=b''.join(struct.pack('>H',x) for x in units)
    return JavaString(b.decode('utf-16-be','surrogatepass'))


def utf_encode(s):
    raw=str(s).encode('utf-16-be','surrogatepass');out=bytearray()
    for i in range(0,len(raw),2):
        x=(raw[i]<<8)|raw[i+1]
        if 1<=x<=127:out.append(x)
        elif x<=2047:out.extend((192|(x>>6),128|(x&63)))
        else:out.extend((224|(x>>12),128|((x>>6)&63),128|(x&63)))
    return bytes(out)


def hierarchy(d):
    out=[]
    while d is not None:out.insert(0,d);d=d.parent
    return out


class Reader:
    def __init__(self,data):
        if len(data)>20_000_000:raise ValueError('Arquivo excede o limite')
        self.data=memoryview(data);self.pos=0;self.handles=[];self.depth=0
    def take(self,n):
        if n<0 or self.pos+n>len(self.data):raise ValueError(f'Fluxo truncado em {self.pos}')
        b=bytes(self.data[self.pos:self.pos+n]);self.pos+=n;return b
    def number(self,fmt):return struct.unpack('>'+fmt,self.take(struct.calcsize('>'+fmt)))[0]
    def utf(self):return utf_decode(self.take(self.number('H')))
    def handle(self,x):
        if len(self.handles)>100000:raise ValueError('Muitas referências')
        self.handles.append(x);return x
    def annotation(self):
        out=[]
        while True:
            if self.pos>=len(self.data):raise ValueError('Bloco truncado')
            if self.data[self.pos]==0x78:self.pos+=1;return out
            out.append(self.content())
    def content(self):
        self.depth+=1
        if self.depth>80:raise ValueError('Aninhamento excessivo')
        try:return self._content()
        finally:self.depth-=1
    def _content(self):
        tc=self.number('B')
        if tc==0x70:return None
        if tc==0x71:
            h=self.number('i')-0x7e0000
            if h<0 or h>=len(self.handles):raise ValueError('Referência inválida')
            return self.handles[h]
        if tc in (0x74,0x7c):
            n=self.number('H' if tc==0x74 else 'q')
            return self.handle(utf_decode(self.take(n)))
        if tc==0x72:
            d=ClassDesc(self.utf(),self.number('q'),0);self.handle(d)
            d.flags=self.number('B');n=self.number('H')
            if n>1000:raise ValueError('Muitos campos')
            for _ in range(n):
                t=chr(self.number('B'));name=self.utf();signature=self.content() if t in 'L[' else None
                d.fields.append((t,name,signature))
            d.annotations=self.annotation();d.parent=self.content();return d
        if tc==0x73:
            d=self.content()
            if not isinstance(d,ClassDesc):raise ValueError('Descritor ausente')
            obj=self.handle(Obj(d))
            for cls in hierarchy(d):
                if cls.flags&4:raise ValueError('Externalizable não suportado')
                if cls.flags&2:
                    for t,name,_ in cls.fields:obj.fields[name]=self.value(t)
                    if cls.flags&1:obj.extras[cls.name]=self.annotation()
            return obj
        if tc==0x75:
            d=self.content();a=self.handle(Array(d));n=self.number('i')
            if n<0 or n>1_000_000:raise ValueError('Array inválido')
            a.items=[self.value(d.name[1]) for _ in range(n)];return a
        if tc in (0x77,0x7a):return Block(self.take(self.number('B' if tc==0x77 else 'i')),tc==0x7a)
        if tc==0x7e:
            e=self.handle(Enum(self.content()));e.name=self.content();return e
        if tc==0x79:
            self.handles=[];return self.content()
        raise ValueError(f'Tag não suportada: {tc:02x}')
    def value(self,t):
        formats={'B':'b','C':'H','D':'d','F':'f','I':'i','J':'q','S':'h','Z':'B'}
        if t in 'L[':return self.content()
        if t not in formats:raise ValueError('Tipo de campo desconhecido')
        v=self.number(formats[t]);return bool(v) if t=='Z' else chr(v) if t=='C' else v
    def read(self):
        if self.take(4)!=b'\xac\xed\x00\x05':raise ValueError('Cabeçalho Java inválido')
        out=[]
        while self.pos<len(self.data):out.append(self.content())
        return out


class Writer:
    def __init__(self):self.data=bytearray(b'\xac\xed\x00\x05');self.handles={};self.next=0
    def number(self,fmt,v):self.data.extend(struct.pack('>'+fmt,v))
    def utf(self,s):
        b=utf_encode(s)
        if len(b)>65535:raise ValueError('UTF do descritor muito longo')
        self.number('H',len(b));self.data.extend(b)
    def ref(self,x):
        k=id(x)
        if k in self.handles:
            self.number('B',0x71);self.number('i',self.handles[k]+0x7e0000);return True
        return False
    def handle(self,x):self.handles[id(x)]=self.next;self.next+=1
    def annotations(self,items):
        for x in items:self.content(x)
        self.number('B',0x78)
    def content(self,x):
        if x is None:self.number('B',0x70);return
        if isinstance(x,Block):
            self.number('B',0x7a if x.long else 0x77);self.number('i' if x.long else 'B',len(x.data));self.data.extend(x.data);return
        if self.ref(x):return
        if isinstance(x,str):
            b=utf_encode(x);long=len(b)>65535
            self.number('B',0x7c if long else 0x74);self.number('q' if long else 'H',len(b));self.data.extend(b);self.handle(x);return
        if isinstance(x,ClassDesc):
            self.number('B',0x72);self.utf(x.name);self.number('q',x.uid);self.handle(x)
            self.number('B',x.flags);self.number('H',len(x.fields))
            for t,n,signature in x.fields:
                self.number('B',ord(t));self.utf(n)
                if t in 'L[':self.content(signature)
            self.annotations(x.annotations);self.content(x.parent);return
        if isinstance(x,Obj):
            self.number('B',0x73);self.content(x.desc);self.handle(x)
            for d in hierarchy(x.desc):
                if d.flags&2:
                    for t,n,_ in d.fields:self.value(t,x.fields.get(n))
                    if d.flags&1:self.annotations(x.extras.get(d.name,[]))
            return
        if isinstance(x,Array):
            self.number('B',0x75);self.content(x.desc);self.handle(x);self.number('i',len(x.items))
            for v in x.items:self.value(x.desc.name[1],v)
            return
        if isinstance(x,Enum):
            self.number('B',0x7e);self.content(x.desc);self.handle(x);self.content(x.name);return
        raise ValueError(f'Tipo não gravável: {type(x)}')
    def value(self,t,v):
        if t in 'L[':self.content(v);return
        fmt={'B':'b','C':'H','D':'d','F':'f','I':'i','J':'q','S':'h','Z':'B'}[t]
        self.number(fmt,ord(v) if t=='C' else int(v or 0) if t in 'BIJSZ' else v or 0)


def read(data):return Reader(data).read()
def write(objects):
    w=Writer()
    for o in objects:w.content(o)
    return bytes(w.data)
def list_items(obj):
    if not isinstance(obj,Obj) or obj.desc.name!='java.util.ArrayList':raise ValueError('ArrayList esperado')
    return [x for x in obj.extras.get('java.util.ArrayList',[]) if not isinstance(x,Block)]
def java_list(desc,items):
    return Obj(desc,{'size':len(items)},{desc.name:[Block(struct.pack('>i',len(items))),*items]})
