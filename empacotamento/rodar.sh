#!/usr/bin/env bash
# Compila o codigo-fonte/ e abre o jogo direto, sem gerar instalador (para testar mudanças de tela).
#   empacotamento/rodar.sh          compila e abre
#   empacotamento/rodar.sh --limpo  recomeça os dados de teste a partir de jogo/
#   empacotamento/rodar.sh --compilar  só compila
# Os dados (saves, options.bcf…) ficam em build/dev/dados, cópia de jogo/, para não alterar o repositório.
set -euo pipefail

RAIZ=$(cd "$(dirname "$0")/.." && pwd)
DEV="$RAIZ/build/dev"

if [ -z "${JAVA_HOME:-}" ]; then
  if [ -x /usr/libexec/java_home ] && /usr/libexec/java_home -v 17+ >/dev/null 2>&1; then
    JAVA_HOME=$(/usr/libexec/java_home -v 17+)
  elif [ -d /opt/homebrew/opt/openjdk@17 ]; then JAVA_HOME=/opt/homebrew/opt/openjdk@17
  else JAVA_HOME=$(dirname "$(dirname "$(readlink -f "$(command -v javac)")")"); fi
fi
BIN="$JAVA_HOME/bin"

[ "${1:-}" = "--limpo" ] && rm -rf "$DEV/dados"

# Bibliotecas e recursos do jar original (só na primeira vez).
if [ ! -d "$DEV/libs" ]; then
  mkdir -p "$DEV/libs" "$DEV/recursos"
  LIBS=$("$BIN/jar" --list --file "$RAIZ/jogo/bf26-27.jar" | grep '\.jar$' | tr -d '\r' | tr '\n' ' ')
  (cd "$DEV/libs" && "$BIN/jar" --extract --file "$RAIZ/jogo/bf26-27.jar" $LIBS)
  (cd "$DEV/recursos" && "$BIN/jar" --extract --file "$RAIZ/jogo/bf26-27.jar")
  find "$DEV/recursos" -name '*.class' -delete
  rm -rf "$DEV/recursos/META-INF" "$DEV/recursos/"*.jar
fi
CP=$(find "$DEV/libs" -name '*.jar' | tr '\n' ':')

# Classes + recursos alterados por cima dos originais.
rm -rf "$DEV/classes"
mkdir -p "$DEV/classes"
find "$RAIZ/codigo-fonte" -name '._*' -delete
find "$RAIZ/codigo-fonte" -name '*.java' > "$DEV/fontes.txt"
"$BIN/javac" -encoding UTF-8 -nowarn -proc:none --add-exports java.desktop/sun.java2d=ALL-UNNAMED \
  -cp "$CP" -d "$DEV/classes" @"$DEV/fontes.txt"
cp -R "$DEV/recursos/." "$DEV/classes/"
find "$RAIZ/empacotamento/recursos" -name '._*' -delete
cp -R "$RAIZ/empacotamento/recursos/." "$DEV/classes/"

if [ ! -d "$DEV/dados" ]; then
  mkdir -p "$DEV/dados"
  cp -R "$RAIZ/jogo/." "$DEV/dados/"
  rm -f "$DEV/dados/bf26-27.jar"
fi

[ "${1:-}" = "--compilar" ] && exit 0

cd "$DEV/dados"
exec "$BIN/java" --add-exports=java.desktop/sun.java2d=ALL-UNNAMED --add-opens=java.desktop/sun.java2d=ALL-UNNAMED \
  -Djpackage.app-version=dev -cp "$DEV/classes:$CP" nucleo.LancadorBetfoot
