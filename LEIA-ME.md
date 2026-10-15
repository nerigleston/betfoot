# Betfoot

Betfoot 26/27: elencos 2026/27, temporada inicial 2026/2027, Copa do Mundo 2026 e competições europeias no formato
de fase de liga.

## Estrutura

| Pasta | Conteúdo |
|---|---|
| `codigo-fonte/` | Código-fonte Java do jogo (pacotes `a`, `b`, `best`, `c`, `components`, `d`, `e`, `est`, `f`, `forms`, `g`, `h`). |
| `jogo/` | Instalação de teste: `bf26-27.jar` (o jogo compilado) e os dados (`teams/`, `conf_*`, `selecoes/`, `img/`…). |
| `ferramentas/` | `ajustar_ligas.py` (regulamentos 2026 das ligas nacionais), `java_serial.py` e `mapa-classes.tsv`. |
| `empacotamento/` | Instaladores: `build.sh`, o lançador (`Lancador.java`) e os ícones. |

## Jogar

- **Instaladores** (Java embutido, não precisa instalar nada): Windows `.exe`, macOS `.dmg`, Linux `.AppImage` — ver
  [Instaladores](#instaladores).
- **Direto do jar:** `jogo/Abrir Betfoot 2026.command` (precisa de Java 17+; o atalho já libera `sun.java2d`).

Comece sempre um **Novo jogo**.

## Compilar o código-fonte

Java 17+ e as bibliotecas do Kryo (`kryo-4.0.2`, `minlog-1.3.0`, `objenesis-2.1`, `reflectasm-1.10.1-shaded`):

```sh
find codigo-fonte -name '._*' -delete
find codigo-fonte -name '*.java' > /tmp/fontes.txt
javac -encoding UTF-8 -nowarn --add-exports java.desktop/sun.java2d=ALL-UNNAMED \
  -cp "kryo-4.0.2.jar:minlog-1.3.0.jar:objenesis-2.1.jar:reflectasm-1.10.1-shaded.jar" \
  -d classes @/tmp/fontes.txt
```

Os recursos (imagens, sons, `arquivos/…`) ficam dentro do `jogo/bf26-27.jar`.

### Nomes das classes

As classes têm nomes curtos (`a.hU`, `best.f`, `f.q`…). Como o sistema de arquivos do macOS não diferencia maiúsculas
de minúsculas, as classes cujo nome só difere por maiúscula ganharam sufixo `_0` no código-fonte (ex.: `a.aA` →
`a/aa_0.java`, `best.f` → `best/f_0.java`, `f.J` → `f/j_0.java`, `h.a` → `h/a_0.java`). A classe `a.do` (palavra
reservada do Java) é `a/do_1.java`. A correspondência completa com o `bf26-27.jar` está em `ferramentas/mapa-classes.tsv`
— útil para conferir o bytecode (`javap -c -p -cp jogo/bf26-27.jar best.f`).

O Kryo grava o nome das classes nos saves; um jar compilado com os nomes do código-fonte não abre saves do `bf26-27.jar`.

## Temporada 2026

| Classe | O quê |
|---|---|
| `best/f_0.java` | ano-base da carreira `rM = 2026`; a tela lista `rM + i` → 2026, 2027 |
| `a/ay_0.java`, `components/ay.java` | rótulos das telas com 2026 |
| `a/hU.java` | tela "Configurações iniciais": temporadas 2026/2027 e "Usar grupos da Copa do Mundo 2026" |
| `best/a.java` → `g()` | calendário com as datas das competições continentais |
| `f/q.java` | Copa do Mundo no formato 2026 |
| `f/v.java`, `f/x.java`, `f/j_0.java` | Champions, Liga Europa e Conference com fase de liga |
| `f/LigaSuica.java` | sorteio e montagem da fase de liga |

### Copa do Mundo 2026 (`f/q.java`)

- **1ª Copa da carreira (2026, sede EUA/México/Canadá)**: com "Usar grupos da Copa do Mundo 2026" marcado, usa os
  12 grupos reais do sorteio; sem a opção, as 3 sedes + vagas por confederação (16 UEFA, 6 CONMEBOL, 9+ CAF,
  8+ AFC, 3 CONCACAF, 1 OFC, 2 de repescagem) e sorteio por potes.
- **Copas seguintes**: 48 classificados, 4 potes de 12 por força, 12 grupos de 4.
- **Mata-mata de 32**: 1º e 2º de cada grupo + 8 melhores terceiros (comparador de classificação do próprio jogo,
  `h.a_0.abn`). Os terceiros vão para as vagas permitidas pelo regulamento (testado nas 495 combinações) e a chave
  segue os jogos 73-104 da FIFA (ex.: 2A×2B, 1E×3º, oitavas 74×77, 73×75…).
- A 1ª Copa usa as cidades e estádios de 2026.

Grupos reais: A México, África do Sul, Coreia do Sul, Rep. Tcheca · B Canadá, Suíça, Bósnia, Catar ·
C Brasil, Marrocos, Escócia, Haiti · D EUA, Austrália, Paraguai, Turquia · E Alemanha, Costa do Marfim, Equador,
Curaçao · F Holanda, Japão, Suécia, Tunísia · G Bélgica, Egito, Irã, Nova Zelândia · H Espanha, Cabo Verde,
Uruguai, Arábia Saudita · I França, Noruega, Senegal, Iraque · J Argentina, Áustria, Argélia, Jordânia ·
K Portugal, Colômbia, RD Congo, Uzbequistão · L Inglaterra, Croácia, Gana, Panamá.

### Competições europeias (formato 2024/25 em diante)

| Competição | Classe | Fase de liga | Mata-mata |
|---|---|---|---|
| Liga dos Campeões | `f/v.java` | 36 clubes (30 diretos + 6 das preliminares), 4 potes de 9, 8 jogos | 1º-8º oitavas; 9º-24º playoff; 25º-36º fora |
| Liga Europa | `f/x.java` | 36 (16 diretos + 10 da Champions + 10 das preliminares), 8 jogos | idem |
| Conference | `f/j_0.java` | 36 (4 diretos novos + 10 das outras copas + 22 das preliminares), 6 potes de 6, 6 jogos | idem |

- `f/LigaSuica.java`: sorteio por potes sem adversário repetido e sem clubes do mesmo país (relaxa só quando é
  impossível, ex.: 5 ingleses no mesmo pote), divisão em rodadas, criação da liga (`f.s` sem gerador + jogos `best.I`
  nas próximas datas livres), playoff 9x24/10x23… e oitavas 1-8/4-5/2-7/3-6.
- Fim da liga: o motor chama a competição pelo código da liga (4005 → `v.yt()`, 6005 → `x.Be()`, 12005 → `j_0.Be()`).
- Playoff da Champions usa o código 4001 (o motor chama `v.g(vencedores, perdedores)`); Liga Europa e Conference têm
  o playoff preso à liga (códigos 6006/12006, oitavas em `afT`).
- Não há repasse de 3º colocados entre as copas (Champions → Liga Europa → Conference), como no formato real.

### Calendário (`best/a.java` → `g()`)

Sequência fixa `a.b(dia da semana, tipo)`; tipo 4 = continentais (Champions, Libertadores…), 6 = Liga Europa e
Sul-Americana, 12 = Conference, 100/200 = pausas. São 27 datas do tipo 4, 21 do tipo 6 e 23 da Conference.

## Instaladores

`empacotamento/build.sh` gera o instalador do sistema em que roda (o `jpackage` não faz pacote de outro sistema), com
um Java 21 reduzido embutido, em `dist/`:

| Sistema | Arquivo | Observação |
|---|---|---|
| Windows | `Betfoot-26-27-<versão>-windows-x64.exe` | instala por usuário (sem admin), atalho no menu Iniciar e na área de trabalho; precisa do WiX 3 para gerar |
| macOS | `Betfoot-26-27-<versão>-macos-arm64.dmg` / `-macos-x86_64.dmg` | Apple Silicon / Intel; sem assinatura: na 1ª vez, botão direito > Abrir (ou `xattr -cr "/Applications/Betfoot 26-27.app"`) |
| Linux | `Betfoot-26-27-<versão>-linux-x86_64.AppImage` | `chmod +x` e abrir; baixa o `appimagetool` sozinho |

O GitHub Actions (`.github/workflows/instaladores.yml`) gera os três a cada push na `main` (ficam nos *artifacts* da
execução) e, numa tag `v*` (`git tag v1.0.0 && git push --tags`), publica uma Release com eles.

O jogo lê e grava tudo em `user.dir` (saves, `options.bcf`, `teams/`, `conf_*`), e a pasta do app instalado não é
gravável. Por isso os dados de `jogo/` vão num `jogo.zip` dentro do app (`empacotamento/Dados.java`; nomes em UTF-8,
porque 4 times de `teams/` têm caracteres de uso privado no nome, ex.: `cracvia_pl.ban`, que o WiX recusa) e o
lançador (`empacotamento/Lancador.java`) os extrai para uma pasta do usuário, aponta o `user.dir` para lá e chama
`best.h2` no mesmo processo:

- Windows `%APPDATA%\Betfoot 26-27` · macOS `~/Library/Application Support/Betfoot 26-27` · Linux `~/.local/share/betfoot-26-27`
- Numa versão nova, cada arquivo só é atualizado se o usuário não o alterou (hashes em `.instalado`); `sav/` e
  `options.bcf` nunca são sobrescritos. Saída do jogo em `betfoot.log`, na mesma pasta.
- O registro do jogo fica nas Preferences do Java (`Preferences.userRoot()`), fora da pasta, e vale para o app instalado.

Ícones: `java empacotamento/Icone.java empacotamento/icones` gera o `.png` e o `.ico`; o `.icns` sai do `iconutil -c icns`
sobre o `betfoot.iconset` gerado junto (macOS).

## Brasileirão 2026 (`jogo/conf_ligas_nacionais/BRA.cfg`)

Arquivo de dados que o próprio jogo grava em "Ligas Nacionais > configurar". `ferramentas/ajustar_ligas.py jogo`
aplica os regulamentos de 2026 (original guardado em `BRA.cfg.original`):

| Divisão | Formato |
|---|---|
| Série A | 20 times, 38 rodadas, 4 rebaixados |
| Série B | 2 sobem direto; 3º×6º e 4º×5º em ida e volta valem as outras 2 vagas (`vagasSobemPeloMataMata=2`) |
| Série C | turno único, 2 quadrangulares (1-4-5-8 / 2-3-6-7), final; **2 rebaixados** |
| Série D | **96 times, 16 grupos de 6**, ida e volta; 4 por grupo → mata-mata de 64 |

Limite do motor: divisões têm tamanho fixo, então sobem da D tantos quantos caem da C (2). Na realidade sobem 6,
porque a Série C passa a 24 clubes em 2027. A Série D via estaduais (opção "Jogar estaduais") usa outro caminho do
motor (`best/Z.java`, divisão 4).

## Mapa

| Onde | O quê |
|---|---|
| `best/f_0.java` | estado da carreira (Serializable, vai no save): `rM` ano-base, `op()` lê o ano, `H()` nº de temporadas |
| `best/p_0.java` → `dg()` | início da carreira |
| `a/iu_0.java` → `mW()` | monta a lista "Temporada de início" |
| `best/aq.java` | tabelas fixas: grupos padrão da Libertadores (`sP`, `sQ`), nomes de fases etc. |
| `arquivos/default_lang.xml` (dentro do jar) | nomes dos países: chave `P<índice>` (ex.: `P39` = Catar) |
| `est/Options.java` | preferências gravadas em `options.bcf` |
| `est/ConfigLigaType.java`, `a/dK.java` | regulamento das ligas nacionais e a tela que o edita |
| `best/Z.java` (~linha 120) | monta as divisões de cada país a partir do `.cfg` |
| `f/b_0.java` → `BQ()` | playoff de acesso (`vagasSobemPeloMataMata`) |
| `f/s.java` | liga/fase de grupos: `a(ArrayList, …)` gera a tabela (todos contra todos, via `best/t.java`) |
| `f/z.java`, `f/g_0.java` | mata-mata (2 a 128 times) |
| `f/r.java`, `f/H.java` | Libertadores e Sul-Americana |

A Copa e as taças internacionais só ficam disponíveis no Betfoot registrado.
