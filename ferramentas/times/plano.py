import json, sys, statistics
S = sys.argv[1]; e = json.load(open(S + '/estados.json'))
OITO = {'GO', 'PA', 'PR', 'RJ', 'RS', 'SC'}          # 12 times com 8 no mata-mata
def formula(n, uf, div):
    if div == 1 and n == 12 and uf in OITO: return 5
    if div == 1 and n == 16: return 9                # Paulistão: 8 vão às quartas
    tab = {6: 0, 7: 11, 8: 1, 9: 12, 10: 2, 11: 3, 12: 4, 14: 6, 16: 8, 20: 10}
    return tab[max(k for k in tab if k <= n)] if n >= 6 else None
plano = {}
for uf, r in e.items():
    nv = r['nivel']
    nA = len(r['A']) + len(r['A_novo']); nB = len(r['B']) + len(r['B_novo'])
    ex = sorted(nv[f] for f in r['A'])
    med = int(statistics.median(ex)) if ex else 5
    pisoA = max(3, min(ex) if ex else med) if ex else med
    pisoA = max(pisoA, med - 2)                      # times de Série A muito abaixo da mediana sobem até aqui
    novoA = max(pisoA, min(med, 6))                   # novos da A: nível típico, sem passar de 6 (clubes pequenos)
    novoB = max(2, pisoA - 1)
    ajustes = {}
    for f in r['A']:
        if nv[f] < pisoA: ajustes[f] = pisoA
    for f in r['B']:
        if nv[f] > novoB: ajustes[f] = novoB
    pisoB = min([novoB] + [ajustes.get(f, nv[f]) for f in r['B']])
    for f in r['outros']:
        if nv[f] >= pisoB: ajustes[f] = max(1, pisoB - 1)
    f1 = formula(nA, uf, 1); f2 = formula(nB, uf, 2) if nB >= 6 else 0
    if uf == 'PE': f2 = formula(len(r['outros']), uf, 2) or 0   # PE: sem A2 em 2026; os demais disputam a 2ª divisão
    plano[uf] = dict(nA=nA, nB=nB, f1=f1, f2=f2, novoA=novoA, novoB=novoB, ajustes=ajustes)
    print(uf, 'A=%d(f%s) B=%d(f%s) | novos A nível %d, B %d | ajustes %s' % (nA, f1, nB, f2, novoA, novoB, ajustes))
json.dump(plano, open(S + '/plano.json', 'w'), indent=1)
