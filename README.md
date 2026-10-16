# Betfoot 26/27

Jogo de gerenciamento de futebol com a temporada 2026/2027: elencos reais de 2026, todos os estaduais brasileiros
com Série A e Série B, Copa do Mundo 2026 no formato de 48 seleções e competições europeias no formato de fase de liga.

## Download

Versão atual: **1.2.3** — [todas as versões](https://github.com/nerigleston/betfoot/releases)

| Sistema | Instalador |
|---|---|
| Windows 10/11 (64 bits) | [Betfoot-26-27-1.2.3-windows-x64.exe](https://github.com/nerigleston/betfoot/releases/download/v1.2.3/Betfoot-26-27-1.2.3-windows-x64.exe) |
| macOS Apple Silicon (M1, M2, M3, M4…) | [Betfoot-26-27-1.2.3-macos-arm64.dmg](https://github.com/nerigleston/betfoot/releases/download/v1.2.3/Betfoot-26-27-1.2.3-macos-arm64.dmg) |
| macOS Intel | [Betfoot-26-27-1.2.3-macos-x86_64.dmg](https://github.com/nerigleston/betfoot/releases/download/v1.2.3/Betfoot-26-27-1.2.3-macos-x86_64.dmg) |
| Linux (64 bits) | [Betfoot-26-27-1.2.3-linux-x86_64.AppImage](https://github.com/nerigleston/betfoot/releases/download/v1.2.3/Betfoot-26-27-1.2.3-linux-x86_64.AppImage) |

Os instaladores já trazem o Java: não é preciso instalar mais nada.

### Instalação

- **Windows**: abra o `.exe` e siga o instalador. Ele instala só para o seu usuário (não pede administrador) e cria
  atalhos no menu Iniciar e na área de trabalho. Se o Windows SmartScreen avisar, clique em "Mais informações" >
  "Executar assim mesmo" (o instalador não é assinado).
- **macOS**: abra o `.dmg` e arraste o **Betfoot 26-27** para a pasta Aplicativos. O app não é assinado pela Apple,
  então na primeira vez o macOS mostra *"Betfoot 26-27" Not Opened / não foi aberto* (ou diz que o app está
  danificado). Para liberar, escolha uma das formas:
  - **Terminal** (mais rápido): rode o comando abaixo e abra o app normalmente.
    ```sh
    xattr -cr "/Applications/Betfoot 26-27.app"
    ```
    Se aparecer "Permission denied", use `sudo xattr -cr "/Applications/Betfoot 26-27.app"` e digite a senha do Mac.
  - **Ajustes do Sistema**: no aviso clique em **Concluído** (não em "Mover para o Lixo"), abra **Ajustes do Sistema >
    Privacidade e Segurança**, role até o fim e clique em **Abrir Mesmo Assim** ao lado de "Betfoot 26-27"; abra o app
    de novo e confirme com a senha. (No macOS 15 Sequoia ou mais novo, o antigo "botão direito > Abrir" não libera mais.)

  É preciso liberar de novo a cada versão nova instalada.
- **Linux**: dê permissão de execução e abra: `chmod +x Betfoot-26-27-1.2.3-linux-x86_64.AppImage && ./Betfoot-26-27-1.2.3-linux-x86_64.AppImage`.

Os saves e os dados do jogo ficam numa pasta do usuário, que é mantida ao instalar uma versão nova:
Windows `%APPDATA%\Betfoot 26-27` · macOS `~/Library/Application Support/Betfoot 26-27` · Linux `~/.local/share/betfoot-26-27`.

Comece sempre um **Novo jogo**: saves de versões anteriores à 1.1.0 não abrem.

## O que tem no jogo

- **Temporada 2026/2027**: a carreira começa em 2026, com elencos de 2026 tirados do Transfermarkt.
- **Estaduais 2026 completos**: os 27 estaduais com os participantes reais da Série A e, onde existe, da Série B
  (ex.: Paraibano com 10 clubes na A e a Segundona; Paulistão A1 e A2; Gauchão A1 e A2). São 470 clubes brasileiros,
  todos com escudo.
- **Copa do Mundo 2026**: 48 seleções, 12 grupos (os grupos reais do sorteio, se marcado "Usar grupos da Copa do Mundo
  2026") e mata-mata de 32 com os 8 melhores terceiros.
- **Champions, Liga Europa e Conference** no formato de fase de liga (36 clubes).
- **Brasileirão 2026**: Séries A a D com os regulamentos de 2026.

### Atalhos

Os atalhos se adaptam ao sistema:

| Ação | Windows / Linux | macOS |
|---|---|---|
| Salvar jogo | F2 | ⌘S |
| Preferências | F3 | ⌘, |
| Tabelas | F5 ou Ctrl+T | ⌘T |
| Finanças | Ctrl+F | ⌘F |
| Calendário, academia, busca, clube, amistosos, artilheiros, campeões | F4, F6–F11 | ⌘4, ⌘6–⌘9, ⌘0, ⌘- |
| Velocidade da partida | F1–F6 | ⌘1–⌘6 |
| Menu do jogador (tabelas, escalação, partida) | botão direito | botão direito, clique com dois dedos ou Ctrl+clique |

No macOS, fn+F1…F11 também funciona. Abrir um jogador nas tabelas, a busca e o calendário usam clique duplo.

## Divisões de início de carreira

O jogo distribui os clubes nas divisões pelo nível (os mais fortes em cima), o que não reproduz o calendário real.
Por isso a carreira começa com as divisões reais de 2026, lidas por `nucleo/DivisoesIniciais.java`:

- `jogo/conf_ligas_nacionais/divisoes.txt`: Séries A, B, C (20 clubes cada) e D (96) do Brasileirão.
- `jogo/conf_estadual/divisoes.txt`: 1ª e 2ª divisão de cada estadual.

Formato: uma linha por clube, `<divisão>`, tab, `<arquivo do time>` (o resto da linha é comentário). As listas valem só
no início da carreira; depois o acesso e o rebaixamento seguem normalmente. Clubes fora das listas são distribuídos
pelo nível, como antes. Com "Jogar estaduais" ligado, a Série D sai dos estaduais; o time de técnico humano que não
estiver nas Séries A, B ou C tem vaga garantida nela.

## Estaduais 2026

Cada estado tem até duas divisões configuradas em `jogo/conf_estadual/<UF>.ces`. No início da carreira o jogo ordena
os clubes do estado pelo nível e preenche a 1ª divisão com o número de clubes da fórmula; os seguintes formam a 2ª.
A divisão de cada clube em 2026 vem de `jogo/conf_estadual/divisoes.txt` (ver [Divisões de início de carreira](#divisões-de-início-de-carreira)).

| UF | Série A | Série B | UF | Série A | Série B | UF | Série A | Série B |
|---|---|---|---|---|---|---|---|---|
| AC | 8 | – | GO | 12 | 9 | PI | 8 | 6 |
| AL | 8 | 6 | MA | 8 | 12 | PR | 12 | 9 |
| AM | 8 | 6 | MG | 12 | 11 | RJ | 12 | 11 |
| AP | 8 | – | MS | 10 | 8 | RN | 8 | 6 |
| BA | 10 | 9 | MT | 10 | – | RO | 7 | – |
| CE | 10 | 10 | PA | 12 | 9 | RR | 8 | – |
| DF | 10 | – | PB | 10 | 8 | RS | 11 | 14 |
| ES | 9 | – | PE | 8 | 7 | SC | 12 | 10 |
| SE | 9 | – | SP | 16 | 16 | TO | 7 | – |

- Os clubes novos vieram do Transfermarkt (elenco, estádio e escudo; cores tiradas do escudo). Onde o Transfermarkt
  tinha menos de 18 jogadores, o elenco foi completado com jogadores gerados a partir das listas de nomes do jogo.
- Sem Série B: estados em que a 2ª divisão não existe em 2026, não foi encontrada ou tem menos de 6 clubes (mínimo do jogo).
- Pernambuco: em 2026/27 a 2ª divisão foi absorvida pelo novo formato; os demais clubes pernambucanos formam a 2ª divisão.
- Faltam 4 clubes de Série A sem dados no Transfermarkt: River (RR), Inter de Santa Maria (RS), América de Propriá (SE)
  e União (TO); também o Rio Branco de Venda Nova (ES).
- Fórmulas novas no código (`nucleo/ConstantesJogo.java`, `sL`/`sN`): 7 clubes em turno e returno e 9 clubes em turno
  único, ambas com 4 classificados.

## Tela inicial

A imagem da tela inicial (`empacotamento/recursos/aiconsj/tela_inicial.jpg`, 532×300) substitui a do jar no build.
Ela é montada por `ferramentas/tela-inicial/MontaTela.java` a partir de um fundo (`ferramentas/tela-inicial/fundo.png`)
e dos ícones e textos da tela original, que ficam nas mesmas posições porque as áreas de clique dependem delas:
`java ferramentas/tela-inicial/MontaTela.java <tela_original.jpg> <fundo.png> empacotamento/recursos/aiconsj/tela_inicial.jpg`.

## Estrutura

| Pasta | Conteúdo |
|---|---|
| `codigo-fonte/` | Código-fonte Java do jogo (pacotes por função: `nucleo`, `motor`, `competicoes`, `telas`, `editor`, `est`, `modelos`, `persistencia`…). |
| `jogo/` | Instalação de teste: `bf26-27.jar` (o jogo compilado) e os dados (`teams/`, `conf_*`, `selecoes/`, `img/`…). |
| `ferramentas/` | `ajustar_ligas.py` (regulamentos 2026 das ligas nacionais), `java_serial.py` e `mapa-classes.tsv`. |
| `empacotamento/` | Instaladores: `build.sh`, o lançador (`Betfoot.java`) e os ícones. |

## Compilar o código-fonte

Java 17+ e as bibliotecas do Kryo (`kryo-4.0.2`, `minlog-1.3.0`, `objenesis-2.1`, `reflectasm-1.10.1-shaded`):

```sh
find codigo-fonte -name '._*' -delete
find codigo-fonte -name '*.java' > /tmp/fontes.txt
javac -encoding UTF-8 -nowarn --add-exports java.desktop/sun.java2d=ALL-UNNAMED \
  -cp "kryo-4.0.2.jar:minlog-1.3.0.jar:objenesis-2.1.jar:reflectasm-1.10.1-shaded.jar" \
  -d classes @/tmp/fontes.txt
```

Os recursos (imagens, sons, `arquivos/…`) e as bibliotecas ficam dentro do `jogo/bf26-27.jar`; o `empacotamento/build.sh` compila o código-fonte e monta o `betfoot.jar` com eles.

### Nomes das classes

As classes e os pacotes foram renomeados para descrever o que fazem (ex.: `telas/`, `nucleo/`, `competicoes/`, `comparadores/`). A correspondência com o `bf26-27.jar`, que mantém os nomes originais, está em `ferramentas/mapa-classes.tsv`: a coluna 1 é o nome no código-fonte, a coluna 2 é o nome no jar. Para conferir o bytecode, use os nomes do jar, por exemplo `javap -c -p -cp jogo/bf26-27.jar best.f`.

Os arquivos de dados de `jogo/` foram gravados com os nomes originais das classes. O pacote `est` (`Options`, `ConfigLigaType`…) mantém o nome original, e os times e jogadores (`e.t`/`e.g` no jar) são lidos como `modelos.ModeloTime2`/`modelos.ModeloJogador2` por `persistencia/EntradaObjetosCompativel.java`. O Kryo grava o nome das classes nos saves, então saves feitos pelo `bf26-27.jar` não abrem no jogo compilado do código-fonte.

## Temporada 2026

| Classe | O quê |
|---|---|
| `nucleo/EstadoCarreira.java` | ano-base da carreira `rM = 2026`; a tela lista `rM + i` → 2026, 2027 |
| `telas/TelaEstatisticasCompeticao.java`, `components/PainelHistoricoTemporada.java` | rótulos das telas com 2026 |
| `telas/TelaConfiguracoesIniciais.java` | tela "Configurações iniciais": temporadas 2026/2027 e "Usar grupos da Copa do Mundo 2026" |
| `nucleo/Calendario.java` → `g()` | calendário com as datas das competições continentais |
| `competicoes/CompeticaoCopaDoMundo.java` | Copa do Mundo no formato 2026 |
| `competicoes/CompeticaoChampionsLeague.java`, `competicoes/CompeticaoLigaEuropa.java`, `competicoes/CompeticaoConferenceLeague.java` | Champions, Liga Europa e Conference com fase de liga |
| `competicoes/LigaSuica.java` | sorteio e montagem da fase de liga |

### Copa do Mundo 2026 (`competicoes/CompeticaoCopaDoMundo.java`)

- **1ª Copa da carreira (2026, sede EUA/México/Canadá)**: com "Usar grupos da Copa do Mundo 2026" marcado, usa os
  12 grupos reais do sorteio; sem a opção, as 3 sedes + vagas por confederação (16 UEFA, 6 CONMEBOL, 9+ CAF,
  8+ AFC, 3 CONCACAF, 1 OFC, 2 de repescagem) e sorteio por potes.
- **Copas seguintes**: 48 classificados, 4 potes de 12 por força, 12 grupos de 4.
- **Mata-mata de 32**: 1º e 2º de cada grupo + 8 melhores terceiros (comparador de classificação do próprio jogo,
  `comparadores.ColecaoComparadoresSorteio.abn`). Os terceiros vão para as vagas permitidas pelo regulamento (testado nas 495 combinações) e a chave
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
| Liga dos Campeões | `competicoes/CompeticaoChampionsLeague.java` | 36 clubes (30 diretos + 6 das preliminares), 4 potes de 9, 8 jogos | 1º-8º oitavas; 9º-24º playoff; 25º-36º fora |
| Liga Europa | `competicoes/CompeticaoLigaEuropa.java` | 36 (16 diretos + 10 da Champions + 10 das preliminares), 8 jogos | idem |
| Conference | `competicoes/CompeticaoConferenceLeague.java` | 36 (4 diretos novos + 10 das outras copas + 22 das preliminares), 6 potes de 6, 6 jogos | idem |

- `competicoes/LigaSuica.java`: sorteio por potes sem adversário repetido e sem clubes do mesmo país (relaxa só quando é
  impossível, ex.: 5 ingleses no mesmo pote), divisão em rodadas, criação da liga (`competicoes.LigaPontosCorridos` sem gerador + jogos `nucleo.ModeloPartida`
  nas próximas datas livres), playoff 9x24/10x23… e oitavas 1-8/4-5/2-7/3-6.
- Fim da liga: o motor chama a competição pelo código da liga (4005 → `v.yt()`, 6005 → `x.Be()`, 12005 → `j_0.Be()`).
- Playoff da Champions usa o código 4001 (o motor chama `v.g(vencedores, perdedores)`); Liga Europa e Conference têm
  o playoff preso à liga (códigos 6006/12006, oitavas em `afT`).
- Não há repasse de 3º colocados entre as copas (Champions → Liga Europa → Conference), como no formato real.

### Calendário (`nucleo/Calendario.java` → `g()`)

Sequência fixa `Calendario.b(dia da semana, tipo)`; tipo 4 = continentais (Champions, Libertadores…), 6 = Liga Europa e
Sul-Americana, 12 = Conference, 100/200 = pausas. São 27 datas do tipo 4, 21 do tipo 6 e 23 da Conference.

### Teclado e mouse por sistema (`nucleo/Plataforma.java`)

- Atalhos com Cmd no macOS e Ctrl nos demais; teclas F com equivalente ⌘+número no macOS; menu mostra o atalho do sistema.
- Clique secundário aceita também Ctrl+clique (macOS).
- Clique tolerante: o Java descarta o clique quando o cursor se mexe entre apertar e soltar (comum no trackpad), o que
  obrigava a tocar duas vezes. Um filtro instalado no início do jogo gera o clique quando o botão é solto a até 6 pixels.

## Gerar os instaladores

`empacotamento/build.sh` compila o `codigo-fonte/` e gera o instalador do sistema em que roda (o `jpackage` não faz pacote de outro sistema), com
um Java 21 reduzido embutido, em `dist/`:

| Sistema | Arquivo | Observação |
|---|---|---|
| Windows | `Betfoot-26-27-<versão>-windows-x64.exe` | instala por usuário (sem admin), atalho no menu Iniciar e na área de trabalho; precisa do WiX 3 para gerar |
| macOS | `Betfoot-26-27-<versão>-macos-arm64.dmg` / `-macos-x86_64.dmg` | Apple Silicon / Intel; sem assinatura: liberar com `xattr -cr "/Applications/Betfoot 26-27.app"` ou em Ajustes do Sistema > Privacidade e Segurança > Abrir Mesmo Assim (ver [Instalação](#instalação)) |
| Linux | `Betfoot-26-27-<versão>-linux-x86_64.AppImage` | `chmod +x` e abrir; baixa o `appimagetool` sozinho |

O GitHub Actions (`.github/workflows/instaladores.yml`) gera os três a cada push na `main` (ficam nos *artifacts* da
execução) e, numa tag `v*` (`git tag v1.0.0 && git push --tags`), publica uma Release com eles.

O jogo lê e grava tudo em `user.dir` (saves, `options.bcf`, `teams/`, `conf_*`), e a pasta do app instalado não é
gravável. Por isso os dados de `jogo/` vão num `jogo.zip` dentro do app (`empacotamento/Dados.java`; nomes em UTF-8,
porque 4 times de `teams/` têm caracteres de uso privado no nome, ex.: `cracvia_pl.ban`, que o WiX recusa) e o
lançador (`empacotamento/Betfoot.java`) os extrai para uma pasta do usuário, aponta o `user.dir` para lá e chama
`nucleo.LancadorBetfoot` no mesmo processo:

- Windows `%APPDATA%\Betfoot 26-27` · macOS `~/Library/Application Support/Betfoot 26-27` · Linux `~/.local/share/betfoot-26-27`
- Numa versão nova, cada arquivo só é atualizado se o usuário não o alterou (hashes em `.instalado`); `sav/` e
  `options.bcf` nunca são sobrescritos. Saída do jogo em `betfoot.log`, na mesma pasta.

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
motor (`nucleo/LigaNacional.java`, divisão 4).

## Mapa

| Onde | O quê |
|---|---|
| `nucleo/EstadoCarreira.java` | estado da carreira (Serializable, vai no save): `rM` ano-base, `op()` lê o ano, `H()` nº de temporadas |
| `nucleo/IniciadorCarreira.java` → `dg()` | início da carreira |
| `telas/TelaMelhoresTemporada.java` → `mW()` | monta a lista "Temporada de início" |
| `nucleo/ConstantesJogo.java` | tabelas fixas: grupos padrão da Libertadores (`sP`, `sQ`), nomes de fases etc. |
| `arquivos/default_lang.xml` (dentro do jar) | nomes dos países: chave `P<índice>` (ex.: `P39` = Catar) |
| `est/Options.java` | preferências gravadas em `options.bcf` |
| `est/ConfigLigaType.java`, `telas/PainelConfigFormatoLiga.java` | regulamento das ligas nacionais e a tela que o edita |
| `nucleo/LigaNacional.java` (~linha 120) | monta as divisões de cada país a partir do `.cfg` |
| `competicoes/CompeticaoLigaNacional.java` → `BQ()` | playoff de acesso (`vagasSobemPeloMataMata`) |
| `competicoes/LigaPontosCorridos.java` | liga/fase de grupos: `a(ArrayList, …)` gera a tabela (todos contra todos, via `nucleo/GeradorChaveamento.java`) |
| `competicoes/ChaveMataMata.java`, `competicoes/GeradorChaveMataMata.java` | mata-mata (2 a 128 times) |
| `competicoes/CompeticaoLibertadores.java`, `competicoes/CompeticaoSulAmericana.java` | Libertadores e Sul-Americana |


## Ferramentas dos times (`ferramentas/times/`)

Usadas para criar os clubes dos estaduais 2026 a partir do Transfermarkt (Python 3 + JDK; as classes Java compilam
contra `jogo/bf26-27.jar`, para gravar os arquivos com os mesmos nomes de classe dos dados existentes):

| Arquivo | O quê |
|---|---|
| `tm.py`, `elenco.py` | busca de clubes e leitura de elencos do Transfermarkt (com cache e pausa entre requisições) |
| `resolver.py` | acha o id do Transfermarkt de cada clube (confere país e estado) |
| `clubes-transfermarkt.json` | clubes dos estaduais 2026 com o id escolhido e a confiança |
| `constroi.py` | baixa elenco, estádio e escudo e gera a especificação de cada time |
| `plano.py` | níveis e fórmulas por estado para cada clube cair na divisão real |
| `aplicar.py` | gera os `.ban`, copia escudos, ajusta níveis e grava os `.ces` |
| `GeraTime.java`, `Escudo.java`, `AjustaDados.java` | gravação dos times, redimensionamento do escudo (60×60 e 18×18) e cores, níveis e `.ces` |
