import sys, json, re, unicodedata, difflib
sys.path.insert(0, sys.argv[1] + '/tm'); import tm
S = sys.argv[1]
fal = json.load(open(S + '/faltando.json'))
def n(s):
    s = unicodedata.normalize('NFKD', s).encode('ascii', 'ignore').decode().lower()
    return ' '.join(re.sub(r'[^a-z0-9]', ' ', s).split())
def variantes(nome, uf):
    base = re.sub(r'-[A-Z]{2,3}$', '', nome).strip()
    v = [base, base + ' ' + uf]
    w = [x for x in base.split() if x.lower() not in ('de', 'do', 'da', 'fc', 'ec', 'sc', 'ac', 'atlético', 'esporte', 'clube', 'sport')]
    if w and ' '.join(w) != base: v.append(' '.join(w))
    if len(w) > 1: v.append(max(w, key=len))
    return list(dict.fromkeys(v))
res = []
for o in fal:
    cands = {}
    for q in variantes(o['nome'], o['uf']):
        for r in tm.busca(q):
            if r['pais'] != 'Brazil' or re.search(r'U\d\d|\bB\b|Sub-?\d|Youth|Juniores', r['nome'] + ' ' + r['completo']): continue
            sc = difflib.SequenceMatcher(None, n(re.sub(r'-[A-Z]{2}$', '', o['nome'])), n(r['nome'])).ratio()
            if r['comp'] == 'BR' + o['uf']: sc += 1
            if '(%s)' % o['uf'] in r['completo'] or '(%s)' % o['uf'] in r['nome']: sc += 0.6
            if r['id'] not in cands or cands[r['id']][0] < sc: cands[r['id']] = (sc, r)
        best = sorted(cands.values(), key=lambda x: -x[0])[:3]
        if best and best[0][0] >= 1.6: break
    o['cands'] = [dict(score=round(s, 2), **r) for s, r in best]
    res.append(o)
    print(o['uf'], o['div'], o['nome'], '->', [(c['id'], c['nome'], c['comp'], c['score']) for c in o['cands'][:2]], flush=True)
json.dump(res, open(S + '/resolvidos.json', 'w'), ensure_ascii=False, indent=0)
