#!/usr/bin/env bash
# Regenerates the APKtool smali for every helper under tools/java from its Java source.
#
# The smali tree is what apktool assembles, but the Java sources are far easier to reason about,
# so the Java is the origin and this script produces the smali: javac -> d8 -> baksmali.
# baksmali's CLI is not shipped inside apktool, hence the tiny DecodeDex driver.
#
#   tools/java/com/alexmanzana/bubbleall/...   the sources (one package tree, mirroring the app)
#   tools/stubs/androidx/...                   compile-time-only stubs, never dexed
#   APKtool/smali/com/alexmanzana/bubbleall/... the generated smali apktool actually builds
#
# Every generated class is copied into the tree, including the synthetic lambda/inner-class files
# d8 and javac emit (ImageCrop$Root, ImageCrop$Click, ...), because those are separate smali files
# the runtime loads by name.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
JDK="D:/X/Programs/JDK 21/jbr-21.0.11"
SDK="D:/X/Programs/ASDK"
BT="$SDK/build-tools/35.0.0"
ANDROID_JAR="$SDK/platforms/android-35/android.jar"
APKTOOL_JAR="C:/Windows/apktool_3.0.3.jar"   # Windows form: it ends up inside a ;-joined -cp

# The JVM is a Windows binary, so anything embedded in a classpath must be a Windows path.
winpath() { cygpath -w "$1" 2>/dev/null || echo "$1"; }

JAVA="$JDK/bin/java"
JAVAC="$JDK/bin/javac"

SRC="$ROOT/tools/java"
STUBS="$ROOT/tools/stubs"
WORK="$ROOT/.build/helper"
DEST="$ROOT/APKtool/smali"

for tool in "$JAVAC" "$ANDROID_JAR" "$APKTOOL_JAR" "$BT/d8.bat"; do
  [ -e "$tool" ] || { echo "missing: $tool" >&2; exit 1; }
done

rm -rf "$WORK"
mkdir -p "$WORK/classes" "$WORK/stubclasses" "$WORK/dex" "$WORK/smali" "$WORK/tools"

# Source lists are expanded by the shell rather than passed through an @argfile: Git Bash
# translates Unix paths on the command line for the native Windows javac/d8, but it cannot
# rewrite the contents of an argument file.
SOURCES=$(find "$SRC" -name '*.java')
[ -n "$SOURCES" ] || { echo "no sources under $SRC" >&2; exit 1; }

if [ -d "$STUBS" ]; then
  STUB_SOURCES=$(find "$STUBS" -name '*.java' || true)
  if [ -n "$STUB_SOURCES" ]; then
    echo "== javac (compile-time stubs; not dexed) =="
    "$JAVAC" -nowarn -encoding UTF-8 -source 8 -target 8 -classpath "$ANDROID_JAR" \
      -d "$WORK/stubclasses" $STUB_SOURCES
  fi
fi

echo "== javac (helpers, against android.jar) =="
# -encoding UTF-8 is not optional: javac otherwise reads the source in the platform charset
# (Cp1252 here), and a non-ASCII string literal such as the crop screen's ellipsis ships mangled.
"$JAVAC" -nowarn -encoding UTF-8 -source 8 -target 8 \
  -classpath "$ANDROID_JAR;$(winpath "$WORK/stubclasses")" \
  -d "$WORK/classes" $SOURCES

echo "== d8 =="
CLASSES=$(find "$WORK/classes" -name '*.class')
[ -n "$CLASSES" ] || { echo "javac produced no classes" >&2; exit 1; }
"$BT/d8.bat" --min-api 23 --lib "$ANDROID_JAR" --output "$WORK/dex" $CLASSES 2>&1 \
  | grep -v "^WARNING" || true
[ -f "$WORK/dex/classes.dex" ] || { echo "d8 produced no dex" >&2; exit 1; }

echo "== dex -> smali =="
# SmaliDecoder reads dex out of a zip container, so wrap the bare dex first.
DEX_WIN="$(winpath "$WORK/dex/classes.dex")"
ZIP_WIN="$(winpath "$WORK/dex/helper.zip")"
python -c "
import zipfile
z = zipfile.ZipFile(r'$ZIP_WIN', 'w')
z.write(r'$DEX_WIN', 'classes.dex')
z.close()
"
"$JAVAC" -nowarn -cp "$APKTOOL_JAR" -d "$WORK/tools" "$ROOT/tools/dex2smali/DecodeDex.java"
"$JAVA" -cp "$APKTOOL_JAR;$(winpath "$WORK/tools")" DecodeDex \
  "$ZIP_WIN" "$(winpath "$WORK/smali")"

COUNT="$(find "$WORK/smali" -name '*.smali' | wc -l)"
[ "$COUNT" -gt 0 ] || { echo "no smali produced" >&2; exit 1; }

# Everything this script owns is regenerated wholesale, so a class that disappears from the Java
# (a renamed or removed inner class) must not be left behind: a stale ImageCrop$Old.smali still
# calling a method that no longer exists assembles fine and then fails the runtime verifier.
# Only files named exactly like a generated top-level class, or one of its $inner classes, are
# deleted -- the app's own classes in the same packages (AddView, Web, ...) never match.
echo "== drop previously generated classes =="
CLEARED=0
while IFS= read -r rel; do
  dir="$(dirname "$rel")"
  base="$(basename "$rel")"
  top="${base%%\$*}"
  top="${top%.smali}"
  target="$DEST/$dir"
  [ -d "$target" ] || continue
  for stale in "$target/$top.smali" "$target/$top"\$*.smali; do
    [ -e "$stale" ] || continue
    rm -f "$stale"
    CLEARED=$((CLEARED + 1))
  done
done < <(find "$WORK/smali" -name '*.smali' | sed "s|^$WORK/smali/||")
echo "   removed $CLEARED stale file(s)"

# The generated tree holds only this project's own helper packages, so copying it over APKtool's
# smali tree replaces exactly the files this script owns and nothing else.
cp -r "$WORK/smali/." "$DEST/"
echo "== wrote $COUNT smali file(s) under ${DEST#"$ROOT"/} =="
find "$WORK/smali" -name '*.smali' | sed "s|^$WORK/smali|  |"
