#!/bin/sh
# Criado pelo Betfoot: abre o Betfoot com qualquer Java instalado.
cd "$(dirname "$0")" || exit 1
export JDK_JAVA_OPTIONS="--add-exports=java.desktop/sun.java2d=ALL-UNNAMED --add-opens=java.desktop/sun.java2d=ALL-UNNAMED"
JAVA=""
if [ -n "$JAVA_HOME" ] && [ -x "$JAVA_HOME/bin/java" ]; then JAVA="$JAVA_HOME/bin/java"; fi
if [ -z "$JAVA" ] && [ -x /usr/libexec/java_home ]; then H=$(/usr/libexec/java_home 2>/dev/null) && JAVA="$H/bin/java"; fi
if [ -z "$JAVA" ]; then for J in /opt/homebrew/opt/openjdk/bin/java /opt/homebrew/opt/openjdk@21/bin/java /usr/local/opt/openjdk/bin/java; do
  [ -x "$J" ] && JAVA="$J" && break; done; fi
if [ -z "$JAVA" ]; then JAVA=$(command -v java); fi
if [ -z "$JAVA" ]; then echo "Java não encontrado. Instale em https://adoptium.net e tente de novo."; read -r _; exit 1; fi
exec "$JAVA" -jar "bf26-27.jar"
