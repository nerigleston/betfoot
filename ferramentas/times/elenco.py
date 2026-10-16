import re, html, sys
sys.path.insert(0, __file__.rsplit('/', 1)[0]); import tm
def elenco(cid, temporada=None):
    url = 'https://www.transfermarkt.com/x/kader/verein/%s/plus/1' % cid + ('/saison_id/%s' % temporada if temporada else '')
    h = tm.get(url)
    if not h: return None, None
    rows = re.findall(r'<tr class="(?:odd|even)">(.*?)</tr>\s*(?=<tr class="(?:odd|even)">|</tbody>)', h, re.S)
    js = []
    for r in rows:
        pid = re.search(r'/profil/spieler/(\d+)"', r)
        nome = re.search(r'<td class="hauptlink">\s*<a[^>]*>([^<]+)</a>', r)
        tds = [html.unescape(re.sub(r'<[^>]+>', '', x)).strip() for x in re.findall(r'<td[^>]*>(.*?)</td>', r, re.S)]
        pos = next((t for t in tds if t in POS), '')
        idade = re.search(r'\((\d+)\)', ' '.join(tds))
        pe = next((t for t in tds if t in ('right', 'left', 'both')), '')
        nac = re.findall(r'title="([^"]+)" alt="[^"]*" class="flaggenrahmen"', r)
        val = re.search(r'class="rechts hauptlink">\s*<a[^>]*>([^<]+)</a>', r)
        js.append(dict(tid=int(pid.group(1)) if pid else 0, nome=html.unescape(nome.group(1)).strip() if nome else '', pos=pos,
                       idade=int(idade.group(1)) if idade else 0, pe=pe, nac=nac, valor=val.group(1).strip() if val else '-'))
    return js, h
POS = ['Goalkeeper', 'Centre-Back', 'Left-Back', 'Right-Back', 'Defensive Midfield', 'Central Midfield', 'Attacking Midfield',
       'Left Midfield', 'Right Midfield', 'Left Winger', 'Right Winger', 'Centre-Forward', 'Second Striker', 'Defender', 'Midfield', 'Attack', 'Sweeper']
def valor_eur(v):
    m = re.match(r'€([\d.]+)(k|m)', v or '')
    if not m: return 0
    return float(m.group(1)) * (1000 if m.group(2) == 'k' else 1000000)
