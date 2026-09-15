#!/usr/bin/env python3
"""Verify every invoke in a dex fits its method's outgoing-argument area.

Hand-editing smali can produce an invoke whose argument count exceeds the method's declared
outs size. The dex assembler accepts it, the APK installs, and then the runtime rejects the
whole class with a VerifyError the first time it is loaded:

    java.lang.VerifyError: ... onShowFileChooser(...) failed to verify:
        invalid argument count (4) exceeds outsSize (3)

That failure is invisible until the code path actually runs, so check it at build time.

Usage: python tools/dexcheck.py <classes.dex> [...more dex files]
Exit code 1 if any invoke would be rejected by the verifier.
"""
import re
import subprocess
import sys
from pathlib import Path

DEXDUMP = "D:/X/Programs/ASDK/build-tools/35.0.0/dexdump.exe"

HEADER = re.compile(r"\s+(registers|ins|outs)\s*:\s*(\d+)")
NAME = re.compile(r"name\s+:\s*'(.*)'")
CLASS = re.compile(r"\(in (L[^;]+;)\)")
INVOKE = re.compile(r"invoke-(\w+)\s+\{([^}]*)\}")


def dump(dex: Path) -> str:
    return subprocess.run(
        [DEXDUMP, "-d", str(dex)],
        capture_output=True, text=True, errors="replace", check=True,
    ).stdout


def check(dex: Path) -> int:
    lines = dump(dex).split("\n")
    problems = []
    for i, line in enumerate(lines):
        if line.strip() != "code          -":
            continue
        name, owner = "?", "?"
        for j in range(i - 1, max(0, i - 14), -1):
            m = NAME.search(lines[j])
            if m:
                name = m.group(1)
                break
        for j in range(i - 1, max(0, i - 14), -1):
            m = CLASS.search(lines[j])
            if m:
                owner = m.group(1)
                break
        hdr = {}
        for k in range(i, min(i + 8, len(lines))):
            m = HEADER.match(lines[k])
            if m:
                hdr[m.group(1)] = int(m.group(2))
        if "outs" not in hdr:
            continue
        args_max = 0
        worst = None
        for k in range(i, min(i + 20000, len(lines))):
            stripped = lines[k].strip()
            if stripped.startswith("catches"):
                break
            if stripped == "code          -" and k > i:
                break
            m = INVOKE.search(lines[k])
            if not m:
                continue
            body = m.group(2).strip()
            if ".." in body:
                lo, hi = [p.strip() for p in body.split("..")]
                count = int(hi.lstrip("vp")) - int(lo.lstrip("vp")) + 1
            else:
                count = len([p for p in body.split(",") if p.strip()])
            if count > args_max:
                args_max, worst = count, stripped
        if args_max > hdr["outs"]:
            problems.append(
                f"{owner}.{name}: passes {args_max} argument registers but outs={hdr['outs']}\n"
                f"      {worst}"
            )
    for p in problems:
        print("VERIFY-FAIL RISK:", p)
    print(f"{dex.name}: {len(problems)} method(s) whose invokes exceed outs")
    return 1 if problems else 0


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(2)
    rc = 0
    for arg in sys.argv[1:]:
        rc |= check(Path(arg))
    sys.exit(rc)
