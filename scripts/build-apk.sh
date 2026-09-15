#!/usr/bin/env bash
# Builds the patched APK from the APKtool/ tree: apktool -> zipalign -> apksigner.
#
#   scripts/build-apk.sh              build only (dist/bubbleall-patched.apk)
#   scripts/build-apk.sh --install    also install on the connected device
#
# Signing uses the debug keystore. That signature differs from the Play Store build, so the very
# first install needs an uninstall (which drops app settings); every install after that is a
# plain -r update that keeps them.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SDK="D:/X/Programs/ASDK"
BT="$SDK/build-tools/35.0.0"
ADB="$SDK/platform-tools/adb.exe"
APKTOOL_JAR="C:/Windows/apktool_3.0.2.jar"
KEYSTORE="C:/Users/Pankaekz/.android/debug.keystore"
KEY_ALIAS="androiddebugkey"
PACKAGE="com.alexmanzana.bubbleall"
DIST="$ROOT/dist"

winpath() { cygpath -w "$1" 2>/dev/null || echo "$1"; }

for tool in "$APKTOOL_JAR" "$BT/zipalign.exe" "$BT/apksigner.bat"; do
  [ -e "$tool" ] || { echo "missing: $tool" >&2; exit 1; }
done

rm -rf "$DIST"
mkdir -p "$DIST"

echo "== apktool build =="
java -jar "$APKTOOL_JAR" b "$ROOT/APKtool" -o "$DIST/bubbleall-unsigned.apk"

# Hand-edited smali can assemble an invoke that the runtime verifier later rejects
# (VerifyError on class load), so check the built dex before signing anything.
echo "== dex check =="
python -c "
import zipfile, pathlib
z = zipfile.ZipFile(r'$(winpath "$DIST/bubbleall-unsigned.apk")')
for name in [n for n in z.namelist() if n.endswith('.dex')]:
    pathlib.Path('.build').mkdir(exist_ok=True)
    pathlib.Path('.build', name).write_bytes(z.read(name))
    print('extracted', name)
"
python "$ROOT/tools/dexcheck.py" .build/classes.dex .build/classes2.dex .build/classes3.dex \
  || { echo "refusing to sign: a class would VerifyError at runtime" >&2; exit 1; }

echo "== zipalign =="
"$BT/zipalign.exe" -f -p 4 "$DIST/bubbleall-unsigned.apk" "$DIST/bubbleall-aligned.apk"

echo "== sign =="
"$BT/apksigner.bat" sign \
  --ks "$(winpath "$KEYSTORE")" --ks-key-alias "$KEY_ALIAS" \
  --ks-pass pass:android --key-pass pass:android \
  --out "$DIST/bubbleall-patched.apk" \
  "$DIST/bubbleall-aligned.apk" 2>&1 | grep -v "^WARNING" || true

echo "== verify =="
"$BT/apksigner.bat" verify --print-certs "$DIST/bubbleall-patched.apk" 2>&1 | grep -v "^WARNING"
ls -la "$DIST/bubbleall-patched.apk"

if [ "${1:-}" = "--install" ]; then
  echo "== install =="
  if "$ADB" install -r "$DIST/bubbleall-patched.apk" 2>&1 | tee /tmp/install.log | grep -q "Success"; then
    echo "updated in place (settings preserved)"
  else
    echo "in-place update refused; signatures differ, so reinstalling from scratch"
    grep -i "FAILED\|Error" /tmp/install.log || true
    "$ADB" uninstall "$PACKAGE" || true
    "$ADB" install "$DIST/bubbleall-patched.apk"
  fi
  "$ADB" shell dumpsys package "$PACKAGE" | grep -E "versionName|READ_MEDIA_IMAGES" | head -5

  # Hand-edited smali assembles fine and passes the outs check, yet ART's verifier can still reject
  # the class at load time -- and a VerifyError only shows up when that code path first runs. Two
  # such bugs have shipped here already (an invoke whose outs_size was short, and a register whose
  # type changed across a try block). One launch settles it in seconds.
  echo "== smoke check =="
  "$ADB" logcat -b all -c >/dev/null 2>&1 || true
  "$ADB" shell am start -a android.intent.action.MAIN -c android.intent.category.LAUNCHER \
    -n "$PACKAGE/.MainActivity" >/dev/null 2>&1 || true
  sleep 6
  if "$ADB" logcat -d 2>/dev/null | grep -qE "VerifyError|Process: $PACKAGE, PID"; then
    echo "FAIL: installed, but the app dies on launch:" >&2
    "$ADB" logcat -d 2>/dev/null | grep -E "VerifyError|Process: $PACKAGE, PID|AndroidRuntime" | head -12 >&2
    exit 1
  fi
  echo "app launches clean"
fi
