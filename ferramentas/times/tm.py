import re, time, os, html, urllib.request, urllib.parse, hashlib
UA = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0 Safari/537.36"
CACHE = os.path.join(os.path.dirname(__file__), 'cache')
os.makedirs(CACHE, exist_ok=True)
def get(url, binary=False):
    k = os.path.join(CACHE, hashlib.md5(url.encode()).hexdigest())
    if os.path.exists(k):
        d = open(k, 'rb').read()
        return d if binary else d.decode('utf-8', 'replace')
    for tent in range(4):
        try:
            req = urllib.request.Request(url, headers={'User-Agent': UA, 'Accept-Language': 'en'})
            d = urllib.request.urlopen(req, timeout=30).read()
            open(k, 'wb').write(d); time.sleep(1.2)
            return d if binary else d.decode('utf-8', 'replace')
        except Exception as e:
            if getattr(e, 'code', 0) == 404: return None
            time.sleep(5 * (tent + 1))
    return None
def busca(q):
    h = get('https://www.transfermarkt.com/schnellsuche/ergebnis/schnellsuche?query=' + urllib.parse.quote(q)) or ''
    res = []
    for m in re.finditer(r'<td class="hauptlink"><a title="([^"]*)" href="/([^"/]+)/startseite/verein/(\d+)">', h):
        cid = m.group(3)
        if any(r['id'] == cid for r in res): continue
        t = h[m.end():m.end() + 1200]
        comp = re.search(r'pokalwettbewerb/(BR[A-Z]{2})"', t[:400]) or re.search(r'wettbewerb/([A-Z0-9]+)"', t[:400])
        pais = re.search(r'title="([^"]+)" alt="[^"]*" class="flaggenrahmen"', t)
        full = re.search(r'title="Squad ([^"]*)"', t)
        res.append(dict(id=cid, nome=html.unescape(m.group(1)), completo=html.unescape(full.group(1)) if full else '',
                        pais=pais.group(1) if pais else '', comp=comp.group(1) if comp else ''))
    return res
