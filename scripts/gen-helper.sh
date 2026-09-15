#!/usr/bin/env bash
# Regenerates APKtool/smali/.../utils/LatestImage.smali from tools/java/.../LatestImage.java.
#
# The smali tree is what apktool assembles, but the Java source is far easier to reason about,
# so the Java is the origin and this script produces the smali: javac -> d8 -> baksmali.
# baksmali's CLI is not shipped inside apktool 3.0.2, hence the tiny DecodeDex driver.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
JDK="D:/X/Programs/JDK 21/jbr-21.0.11"
SDK="D:/X/Programs/ASDK"
BT="$SDK/build-tools/35.0.0"
ANDROID_JAR="$SDK/platforms/android-35/android.jar"
APKTOOL_JAR="C:/Windows/apktool_3.0.2.jar"   # Windows form: it ends up inside a ;-joined -cp

# The JVM is a Windows binary, so anything embedded in a classpath must be a Windows path.
winpath() { cygpath -w "$1" 2>/dev/null || echo "$1"; }

JAVA="$JDK/bin/java"
JAVAC="$JDK/bin/javac"

SRC="$ROOT/tools/java/com/alexmanzana/bubbleall/utils/LatestImage.java"
WORK="$ROOT/.build/helper"
DEST_DIR="$ROOT/APKtool/smali/com/alexmanzana/bubbleall/utils"

for tool in "$JAVAC" "$ANDROID_JAR" "$APKTOOL_JAR" "$BT/d8.bat"; do
  [ -e "$tool" ] || { echo "missing: $tool" >&2; exit 1; }
done

rm -rf "$WORK"
mkdir -p "$WORK/classes" "$WORK/dex" "$WORK/smali" "$WORK/tools"

echo "== javac (against android.jar) =="
"$JAVAC" -nowarn -source 8 -target 8 -classpath "$ANDROID_JAR" \
  -d "$WORK/classes" "$SRC"

echo "== d8 =="
"$BT/d8.bat" --min-api 23 --lib "$ANDROID_JAR" --output "$WORK/dex" \
  "$WORK/classes/com/alexmanzana/bubbleall/utils/LatestImage.class" 2>&1 \
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

GENERATED="$(find "$WORK/smali" -name 'LatestImage.smali' -print -quit)"
[ -n "$GENERATED" ] || { echo "no LatestImage.smali produced" >&2; exit 1; }

mkdir -p "$DEST_DIR"
cp "$GENERATED" "$DEST_DIR/LatestImage.smali"
echo "== wrote ${DEST_DIR#$ROOT/}/LatestImage.smali =="
