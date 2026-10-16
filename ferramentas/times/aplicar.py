import sys, json, os, shutil, subprocess, glob
S = sys.argv[1]; J = '/Volumes/SSD_EXT/www/betfoot/jogo'
SIG = ["AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT","PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"]
plano = json.load(open(S + '/plano.json')); rel = json.load(open(S + '/novos/relatorio.json'))
CP = J + '/bf26-27.jar:' + S + '/gerador'
def java(*a): r = subprocess.run(['java', '-Djava.awt.headless=true', '-cp', CP] + list(a), capture_output=True, text=True); assert r.returncode == 0, r.stderr; return r.stdout
# 1. níveis dos times novos e geração dos .ban direto em jogo/teams
specs = []
import random
def lista(f): return [l.strip().lstrip('\ufeff') for l in open(S + '/nomes/arquivos/' + f, encoding='utf-8', errors='ignore') if l.strip() and '.' not in l and not any(c.isdigit() for c in l)]
NOMES, SOBRENOMES = lista('names/BRA.txt'), lista('surnames/BRA.txt')
# elenco mínimo: 2 G, 2 laterais de cada lado, 4 Z, 2 volantes + 3 meias, 3 A = 18
TIPOS = [((0, 2, 0, 0), 2), ((1, 6, 10, 1), 2), ((1, 6, 10, 0), 2), ((2, 7, 5, 0), 4), ((3, 7, 10, 0), 2), ((3, 11, 4, 0), 3), ((4, 9, 13, 0), 3)]
TITULARES = [((0, 2, 0, 0), 1), ((1, 6, 10, 1), 1), ((1, 6, 10, 0), 1), ((2, 7, 5, 0), 2), ((3, 7, 10, 0), 2), ((3, 11, 4, 0), 2), ((4, 9, 13, 0), 2)]
completados = []
def completa(linhas, fref):
    ps = [l.split('\t') for l in linhas[1:]]
    tipo = lambda c: (int(c[4]), int(c[6]), int(c[7]), int(c[8]))
    if len(ps) >= 18: return linhas
    rnd = random.Random(fref); usados = {c[1] for c in ps}; novos = 0
    for t, qtd in TIPOS:
        while sum(1 for c in ps if tipo(c) == t) < qtd:
            while True:
                nome = rnd.choice(NOMES) + ('' if rnd.random() < 0.3 else ' ' + rnd.choice(SOBRENOMES))
                if nome not in usados: break
            usados.add(nome); novos += 1
            ps.append(['P', nome, '29', str(rnd.randint(18, 33)), str(t[0]), '0', str(t[1]), str(t[2]), str(t[3]), str(rnd.randint(1, 10)), '0'])
    if novos:  # refaz os titulares em 4-4-2, mantendo os reais que já eram titulares
        for c in ps: c[5] = '0'
        for t, qtd in TITULARES:
            for c in sorted([c for c in ps if tipo(c) == t], key=lambda c: c[10] == '0')[:qtd]: c[5] = '1'
        ps.sort(key=lambda c: (int(c[4]), c[5] != '1'))
        completados.append((fref, novos))
    return [linhas[0]] + ['\t'.join(c) for c in ps]
for r in rel:
    p = plano[r['uf']]; nivel = p['novoA'] if r['div'] == 'A' else p['novoB']
    sp = S + '/novos/specs/' + r['fref'] + '.tsv'
    linhas = open(sp).read().rstrip('\n').split('\n')
    t = linhas[0].split('\t'); t[4] = str(nivel)
    if not t[5]: t[5], t[6] = 'Estádio Municipal', '5000'
    if t[6] == '0': t[6] = '5000'
    linhas[0] = '\t'.join(t)
    open(sp, 'w').write('\n'.join(completa(linhas, r['fref'])) + '\n'); specs.append(sp)
print(len(completados), 'elencos completados com jogadores gerados:', sum(n for _, n in completados), 'jogadores')
print(java('GeraTime', J + '/teams/betfoot_bra-galvez.ban', J + '/teams', *specs).count('gerado'), 'times gerados')
# 2. escudos
n = 0
for base in (S + '/novos', S + '/escudos_exist'):
    for d in ('escudos', 'escudosMini'):
        for f in glob.glob(base + '/' + d + '/*.png'):
            if os.path.basename(f).startswith('._'): continue
            shutil.copyfile(f, J + '/teams/' + d + '/' + os.path.basename(f)); n += 1
print(n, 'arquivos de escudo copiados')
# 3. níveis dos times existentes
for uf, p in plano.items():
    for f, nv in p['ajustes'].items():
        if f == 'oestesp_bra': continue
        java('AjustaDados', 'nivel', J + '/teams/' + f + '.ban', str(nv))
print(sum(len(p['ajustes']) for p in plano.values()), 'níveis ajustados')
# 4. configuração dos estaduais (PI e SE não tinham arquivo: partem do modelo de AL)
for uf, p in plano.items():
    dest = J + '/conf_estadual/' + uf + '.ces'; modelo = dest if os.path.exists(dest) else J + '/conf_estadual/AL.ces'
    java('AjustaDados', 'ces', modelo, dest, str(SIG.index(uf)), str(p['f1'] or 0), str(p['f2'] or 0))
print('27 estaduais configurados')
