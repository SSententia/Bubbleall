#!/usr/bin/env bash
# Proves tools/refcheck.py actually fails on a broken smali reference.
#
# A checker that never fires is indistinguishable from one that works, and this one was vacuous
# twice while it was being written: CRLF line endings defeated every line-anchored pattern, and
# java.lang.Object -- which no dex dump contains -- made every class chain look unknowable. Both
# bugs cheerfully reported "0 unresolvable references" on a tree that had some. So: inject the two
# faults the checker exists to catch, and require that it catches them.
#
#   bash tools/refcheck_selftest.sh
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SCRATCH="$ROOT/.build/refcheck-selftest"
VIEWS="$SCRATCH/com/alexmanzana/bubbleall/views"
APP="$SCRATCH/com/alexmanzana/bubbleall"

rm -rf "$SCRATCH"
mkdir -p "$VIEWS"
cp "$ROOT/APKtool/smali/com/alexmanzana/bubbleall/views/AddView.smali" "$VIEWS/"
cp "$ROOT/APKtool/smali/com/alexmanzana/bubbleall/views/PickGalleryOption.smali" "$VIEWS/"
cp "$ROOT/APKtool/smali/com/alexmanzana/bubbleall/R\$id.smali" "$APP/"

if ! python "$ROOT/tools/refcheck.py" "$SCRATCH" | grep -q "0 unresolvable"; then
  echo "FAIL: the untouched copies should resolve" >&2
  exit 1
fi

# The two ways a hand edit goes wrong: a call site left behind by a re-signatured method, and a
# field whose type no longer matches the one its readers declare.
python - "$VIEWS/PickGalleryOption.smali" "$APP/R\$id.smali" <<'PY'
import pathlib
import sys

method = pathlib.Path(sys.argv[1])
text = method.read_text(encoding="utf-8")
method.write_text(text.replace(
    "bind(Landroid/content/Context;Landroid/view/View;Landroid/view/View;II)V",
    "bind(Landroid/content/Context;Landroid/view/View;Landroid/view/View;I)V"), encoding="utf-8")

fields = pathlib.Path(sys.argv[2])
text = fields.read_text(encoding="utf-8")
fields.write_text(text.replace(".field public static pickGalleryState:I",
                               ".field public static pickGalleryState:Z"), encoding="utf-8")
PY

FOUND="$(python "$ROOT/tools/refcheck.py" "$SCRATCH" | grep -c '^UNRESOLVED' || true)"
rm -rf "$SCRATCH"
if [ "${FOUND:-0}" -lt 2 ]; then
  echo "FAIL: refcheck.py reported $FOUND of the 2 injected faults" >&2
  exit 1
fi
echo "refcheck self-test: reports a wrong method descriptor and a wrong field type"
