import sys, json, re, os, html, unicodedata, subprocess, random
S = sys.argv[1]; sys.path.insert(0, S + '/tm'); import tm, elenco
SIG = ["AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT","PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"]
NAC = json.load(open(S + '/nacionalidades.json'))
MAP = {'Goalkeeper': (0, 2, 0, 0), 'Centre-Back': (2, 7, 5, 0), 'Sweeper': (2, 7, 5, 0), 'Defender': (2, 7, 5, 0),
       'Left-Back': (1, 6, 10, 1), 'Right-Back': (1, 6, 10, 0), 'Defensive Midfield': (3, 7, 10, 0),
       'Central Midfield': (3, 11, 4, 0), 'Attacking Midfield': (3, 11, 4, 0), 'Left Midfield': (3, 11, 4, 1),
       'Right Midfield': (3, 11, 4, 0), 'Midfield': (3, 11, 4, 0), 'Left Winger': (4, 9, 13, 1), 'Right Winger': (4, 9, 13, 0),
       'Centre-Forward': (4, 9, 13, 0), 'Second Striker': (4, 9, 13, 0), 'Attack': (4, 9, 13, 0)}
def slug(s):
    s = unicodedata.normalize('NFKD', s).encode('ascii', 'ignore').decode().lower()
    return re.sub(r'[^a-z0-9]+', '-', s).strip('-')
def estadio(cid):
    h = tm.get('https://www.transfermarkt.com/x/startseite/verein/%s' % cid) or ''
    i = h.find('Stadium:')
    if i < 0: return '', 0
    t = re.sub(r'\s+', ' ', html.unescape(re.sub(r'<[^>]+>', ' ', h[i:i + 700])))
    m = re.match(r'Stadium:\s*(.*?)\s{2,}([\d.,]+) Seats', t.replace('\xa0', '  '))
    if not m: m = re.match(r'Stadium:\s*(.*?)\s+([\d.,]+) Seats', t)
    return (m.group(1).strip(), int(re.sub(r'[.,]', '', m.group(2)))) if m else ('', 0)
def titulares(js):
    quer = {0: 1, 2: 2, 3: 4, 4: 2}; esc = set()
    ordem = sorted(range(len(js)), key=lambda i: (-elenco.valor_eur(js[i]['valor']), abs(js[i]['idade'] - 27)))
    for lado in (1, 0):  # um lateral de cada lado
        for i in ordem:
            if MAP.get(js[i]['pos'], (9,))[0] == 1 and MAP[js[i]['pos']][3] == lado: esc.add(i); break
    for p, n in quer.items():
        for i in ordem:
            if n and i not in esc and MAP.get(js[i]['pos'], (9,))[0] == p: esc.add(i); n -= 1
    for i in ordem:  # completa até 11 se faltar alguma posição
        if len(esc) >= 11: break
        esc.add(i)
    return esc
def monta(o, cid, saida):
    js, _ = elenco.elenco(cid); temporada = '2026'
    js = [j for j in (js or []) if j['pos'] in MAP]
    if len(js) < 18:  # completa com o elenco das temporadas anteriores do mesmo clube
        vistos = {j['tid'] for j in js}
        for t in ('2025', '2024'):
            j2, _ = elenco.elenco(cid, t)
            for j in sorted([j for j in (j2 or []) if j['pos'] in MAP and j['tid'] not in vistos], key=lambda j: j['idade']):
                if len(js) >= 18: break
                js.append(j); vistos.add(j['tid'])
                if t not in temporada: temporada += '+' + t
            if len(js) >= 18: break
    est, cap = estadio(cid)
    fref = o.get('fref') or 'betfoot_bra-' + slug(re.sub(r'-[A-Z]{2}$', '', o['nome']) + ('-' + o['uf'].lower()))
    png = tm.get('https://tmssl.akamaized.net/images/wappen/head/%s.png' % cid, binary=True)
    cores = ('#ffffff', '#000000')
    if png:
        orig = os.path.join(saida, 'orig', fref + '.png'); open(orig, 'wb').write(png)
        r = subprocess.run(['java', '-Djava.awt.headless=true', '-cp', S + '/gerador', 'Escudo', orig,
                            os.path.join(saida, 'escudos', fref + '.png'), os.path.join(saida, 'escudosMini', fref + '.png')], capture_output=True, text=True)
        if r.returncode == 0 and r.stdout.strip(): cores = tuple(r.stdout.split())
    tit = titulares(js)
    linhas = ['\t'.join(['T', fref, o['nome'], str(SIG.index(o['uf'])), 'NIVEL', est, str(cap), '', cores[0], cores[1]])]
    ordemPos = sorted(range(len(js)), key=lambda i: (MAP[js[i]['pos']][0], 0 if i in tit else 1))
    for i in ordemPos:
        j = js[i]; p, c1, c2, lado = MAP[j['pos']]
        random.seed(j['tid'])
        linhas.append('\t'.join(['P', j['nome'], str(NAC.get(j['nac'][0] if j['nac'] else 'Brazil', 29)), str(j['idade'] or 25), str(p),
                                 '1' if i in tit else '0', str(c1), str(c2), str(lado), str(random.randint(1, 10)), str(j['tid'])]))
    open(os.path.join(saida, 'specs', fref + '.tsv'), 'w').write('\n'.join(linhas) + '\n')
    return dict(fref=fref, jogadores=len(js), temporada=temporada, estadio=est, cap=cap, escudo=bool(png), cores=cores)
if __name__ == '__main__':
    saida = S + '/novos'
    for d in ('orig', 'escudos', 'escudosMini', 'specs'): os.makedirs(os.path.join(saida, d), exist_ok=True)
    escolhas = [o for o in json.load(open(S + '/escolhas.json')) if o['tmid']]; rel = []
    for o in escolhas:
        r = monta(o, o['tmid'], saida); r.update(uf=o['uf'], div=o['div'], nome=o['nome'], tmid=o['tmid']); rel.append(r)
        print(o['uf'], o['div'], o['nome'], r['jogadores'], 'jog', r['temporada'], r['estadio'], r['cap'], r['cores'], flush=True)
    json.dump(rel, open(saida + '/relatorio.json', 'w'), ensure_ascii=False, indent=0)
