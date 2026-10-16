#!/usr/bin/env bash
# Gera o instalador do sistema atual compilando o codigo-fonte/ (recursos e bibliotecas de jogo/bf26-27.jar):
#   macOS   -> dist/Betfoot-26-27-<versão>-macos-<arq>.dmg
#   Windows -> dist/Betfoot-26-27-<versão>-windows-x64.exe   (Git Bash; precisa do WiX 3 no PATH)
#   Linux   -> dist/Betfoot-26-27-<versão>-linux-x86_64.AppImage   (baixa o appimagetool se não houver)
# Requer JDK 17+ (usa $JAVA_HOME ou o java do PATH). Os três saem juntos pelo GitHub Actions (.github/workflows).
set -euo pipefail

RAIZ=$(cd "$(dirname "$0")/.." && pwd)
VERSAO=${VERSAO:-1.0.0}
NOME="Betfoot 26-27"
OBRA="$RAIZ/build/pacote"
DIST="$RAIZ/dist"
MODULOS=java.base,java.desktop,java.prefs,java.sql,java.logging,jdk.unsupported,jdk.charsets,jdk.localedata,jdk.zipfs

if [ -z "${JAVA_HOME:-}" ]; then
  if [ -x /usr/libexec/java_home ]; then JAVA_HOME=$(/usr/libexec/java_home -v 17+); else
    JAVA_HOME=$(dirname "$(dirname "$(readlink -f "$(command -v javac)")")"); fi
fi
BIN="$JAVA_HOME/bin"

case "$(uname -s)" in
  Darwin) SO=macos ;;
  Linux) SO=linux ;;
  MINGW* | MSYS* | CYGWIN*) SO=windows ;;
  *) echo "sistema não suportado: $(uname -s)" >&2; exit 1 ;;
esac

rm -rf "$OBRA"
mkdir -p "$OBRA/classes" "$OBRA/jogo-classes" "$OBRA/recursos" "$OBRA/entrada" "$DIST"

# Bibliotecas (kryo etc.) e recursos (imagens, sons, arquivos/…) vêm de jogo/bf26-27.jar; as classes, do codigo-fonte/.
LIBS=$("$BIN/jar" --list --file "$RAIZ/jogo/bf26-27.jar" | grep '\.jar$' | tr -d '\r' | tr '\n' ' ')
(cd "$OBRA/entrada" && "$BIN/jar" --extract --file "$RAIZ/jogo/bf26-27.jar" $LIBS)
(cd "$OBRA/recursos" && "$BIN/jar" --extract --file "$RAIZ/jogo/bf26-27.jar")
find "$OBRA/recursos" -name '*.class' -delete
rm -rf "$OBRA/recursos/META-INF" "$OBRA/recursos/"*.jar
# Recursos alterados (ex.: aiconsj/tela_inicial.jpg) substituem os do jar.
find "$RAIZ/empacotamento/recursos" -name '._*' -delete
cp -R "$RAIZ/empacotamento/recursos/." "$OBRA/recursos/"

# Jogo: compila o codigo-fonte/ e junta os recursos em betfoot.jar.
# Roda dentro de build/pacote/entrada com caminhos relativos (funciona igual no Git Bash do Windows).
find "$RAIZ/codigo-fonte" -name '._*' -delete
(cd "$RAIZ" && find codigo-fonte -name '*.java' | sed 's|^|../../../|') > "$OBRA/fontes.txt"
SEP=$([ $SO = windows ] && echo ';' || echo ':')
(cd "$OBRA/entrada" && "$BIN/javac" -encoding UTF-8 -nowarn -proc:none --add-exports java.desktop/sun.java2d=ALL-UNNAMED \
  -cp "$(echo $LIBS | tr ' ' "$SEP")" -d ../jogo-classes @../fontes.txt)
cp -R "$OBRA/recursos/." "$OBRA/jogo-classes/"
"$BIN/jar" --create --file "$OBRA/entrada/betfoot.jar" -C "$OBRA/jogo-classes" .

# Lançador: copia os dados para a pasta do usuário e chama nucleo.LancadorBetfoot (ver Betfoot.java).
"$BIN/javac" --release 17 -encoding UTF-8 -d "$OBRA/classes" "$RAIZ/empacotamento/Betfoot.java"
printf 'Main-Class: betfoot.Betfoot\nClass-Path: betfoot.jar %s\n' "$LIBS" > "$OBRA/manifesto.txt"
"$BIN/jar" --create --file "$OBRA/entrada/betfoot-launcher.jar" --manifest "$OBRA/manifesto.txt" -C "$OBRA/classes" .

# Dados do jogo (lidos e gravados em user.dir) num zip; sem atalhos, backups e metadados do macOS (ver Dados.java).
"$BIN/java" "$RAIZ/empacotamento/Dados.java" "$RAIZ/jogo" "$OBRA/entrada/jogo.zip" \
  "$VERSAO-$(git -C "$RAIZ" rev-parse --short HEAD 2>/dev/null || date +%s)"

COMUM=(--name "$NOME" --app-version "$VERSAO" --vendor "Betfoot" --description "Betfoot com a temporada 2026/2027"
  --input "$OBRA/entrada" --main-jar betfoot-launcher.jar --main-class betfoot.Betfoot --dest "$OBRA/saida"
  --add-modules "$MODULOS" --jlink-options "--strip-debug --no-man-pages --no-header-files"
  --java-options "--add-exports=java.desktop/sun.java2d=ALL-UNNAMED"
  --java-options "--add-opens=java.desktop/sun.java2d=ALL-UNNAMED")
ICONES="$RAIZ/empacotamento/icones"

case $SO in
  macos)
    ARQ=$(uname -m)
    "$BIN/jpackage" "${COMUM[@]}" --type dmg --icon "$ICONES/betfoot.icns" \
      --mac-package-identifier br.betfoot.bf2627 --mac-package-name "$NOME"
    mv "$OBRA/saida/"*.dmg "$DIST/Betfoot-26-27-$VERSAO-macos-$ARQ.dmg"
    ;;
  windows)
    "$BIN/jpackage" "${COMUM[@]}" --type exe --icon "$ICONES/betfoot.ico" \
      --win-menu --win-menu-group "Betfoot" --win-shortcut --win-dir-chooser --win-per-user-install \
      --win-upgrade-uuid 6f4c2a52-8f0e-4f3b-9d2a-2026b0f02627
    mv "$OBRA/saida/"*.exe "$DIST/Betfoot-26-27-$VERSAO-windows-x64.exe"
    ;;
  linux)
    "$BIN/jpackage" "${COMUM[@]}" --type app-image --icon "$ICONES/betfoot.png"
    APPDIR="$OBRA/Betfoot.AppDir"
    mkdir -p "$APPDIR"
    mv "$OBRA/saida/$NOME" "$APPDIR/app"
    cp "$ICONES/betfoot.png" "$APPDIR/betfoot.png"
    cat > "$APPDIR/AppRun" <<'EOF'
#!/bin/sh
AQUI=$(dirname "$(readlink -f "$0")")
exec "$AQUI/app/bin/Betfoot 26-27" "$@"
EOF
    chmod +x "$APPDIR/AppRun"
    cat > "$APPDIR/betfoot.desktop" <<'EOF'
[Desktop Entry]
Type=Application
Name=Betfoot 26/27
Comment=Betfoot com a temporada 2026/2027
Exec=AppRun
Icon=betfoot
Categories=Game;SportsGame;
Terminal=false
EOF
    TOOL=$(command -v appimagetool || true)
    if [ -z "$TOOL" ]; then
      TOOL="$RAIZ/build/appimagetool-x86_64.AppImage"
      [ -x "$TOOL" ] || { curl -fsSL -o "$TOOL" \
        https://github.com/AppImage/appimagetool/releases/download/continuous/appimagetool-x86_64.AppImage && chmod +x "$TOOL"; }
    fi
    ARCH=x86_64 APPIMAGE_EXTRACT_AND_RUN=1 "$TOOL" --no-appstream "$APPDIR" "$DIST/Betfoot-26-27-$VERSAO-linux-x86_64.AppImage"
    ;;
esac

ls -l "$DIST"
