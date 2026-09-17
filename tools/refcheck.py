#!/usr/bin/env python3
"""Check that every smali reference resolves inside the smali tree.

Hand-editing smali has two ways to fail that only show up on a device. The first is the one
`tools/dexcheck.py` covers: an invoke that does not fit its method's outs area, which the runtime
rejects with a VerifyError. The second is this one: a call site whose target class, name,
descriptor or field type does not match anything that actually exists. The APK assembles,
installs, and then the first run of that code path throws

    java.lang.NoSuchMethodError: No virtual method bind(...)V in class .../PickGalleryOption;
    java.lang.NoSuchFieldError:  No field pickGalleryState:I in class .../R$id;

Because a descriptor is just text to the assembler, a renamed or re-signatured helper is caught by
nothing else in the build.Reports only *definite* misses: when the search runs off the edge of the tree (a class extending
  a framework or library class that is not part of this dump) the reference is skipped, since the
  inherited member may exist outside what we can see.

Misses are split in two. A reference *into* a bundled library or framework package (android,
androidx, kotlin, ...) is only reported, never fatal: those stubs are partial in this dump, so a
member "missing" there says nothing about our code. A reference into anything else -- our own
package, above all -- is fatal, because a name or descriptor we can see is wrong is wrong.

Usage: python tools/refcheck.py <smali-root> [...more roots]
       python tools/refcheck.py --owned com/alexmanzana/bubbleall/utils/ImagePicker <roots>
       python tools/refcheck.py --all <roots>          # library misses are fatal too
Exit code 1 if any unresolvable reference needs fixing.
"""
import re
import sys
from pathlib import Path

CLASS = re.compile(r"^\.class\s+(?:.*?\s)?(L[^;\s]+;)")
SUPER = re.compile(r"^\.super\s+(L[^;\s]+;)")
IMPLEMENTS = re.compile(r"^\.implements\s+(L[^;\s]+;)")
METHOD = re.compile(r"^\.method\s+(?:.*?\s)?([^\s(]+)(\(.*)$")
# invoke-virtual {v0, v1}, Lcom/foo/Bar;->baz(Ljava/lang/String;)V   (also /range)
INVOKE = re.compile(
    r"invoke-(?:virtual|super|direct|static|interface)(?:/range)?\s+\{[^}]*\},\s*"
    r"(L[^;\s]+;)->([^\s(]+)(\(.*)")
# sget-object v0, Lcom/foo/Bar;->BAZ:I   /   iget v0, v1, L...;->baz:L...;
FIELD_REF = re.compile(
    r"(?:s|i)(?:get|put)(?:-\w+)?\s+[^,]+,\s*(?:[^,]+,\s*)?(L[^;\s]+;)->([^\s:]+):(\S+)")
# a field declaration may carry an initialiser: .field public static foo:I = 0x7f090001
FIELD = re.compile(r"^\.field\s+(?:.*?\s)?([^\s:=]+):(\S+?)(?:\s*=\s*\S*)?$")


OBJECT = "Ljava/lang/Object;"
# java.lang.Object is never part of a dump, but it ends every class chain and it does declare
# members -- spelled out here so that walking up to Object counts as *seeing* the end of the
# chain instead of as running out of visibility (which would tolerate every reference).
OBJECT_MEMBERS = [
    ("<init>", "()V"),
    ("clone", "()Ljava/lang/Object;"),
    ("equals", "(Ljava/lang/Object;)Z"),
    ("finalize", "()V"),
    ("getClass", "()Ljava/lang/Class;"),
    ("hashCode", "()I"),
    ("notify", "()V"),
    ("notifyAll", "()V"),
    ("toString", "()Ljava/lang/String;"),
    ("wait", "()V"),
    ("wait", "(J)V"),
    ("wait", "(JI)V"),
]


def index(roots):
    classes, methods, fields = {}, set(), set()
    for name, descriptor in OBJECT_MEMBERS:
        methods.add((OBJECT, name, descriptor))
    for root in roots:
        for path in sorted(Path(root).rglob("*.smali")):
            current = None
            # splitlines() rather than split("\n"): most of this tree is checked out with CRLF,
            # and a trailing \r defeats every line-anchored pattern here.
            for line in path.read_text(encoding="utf-8", errors="replace").splitlines():
                line = line.strip()
                if not current:
                    m = CLASS.match(line)
                    if m:
                        current = m.group(1)
                        classes.setdefault(current, {"super": None, "interfaces": []})
                    continue
                m = SUPER.match(line)
                if m:
                    classes[current]["super"] = m.group(1)
                    continue
                m = IMPLEMENTS.match(line)
                if m:
                    classes[current]["interfaces"].append(m.group(1))
                    continue
                m = METHOD.match(line)
                if m:
                    methods.add((current, m.group(1), m.group(2)))
                    continue
                m = FIELD.match(line)
                if m:
                    fields.add((current, m.group(1), m.group(2)))
    return classes, methods, fields


def hierarchy(start, classes, seen=None):
    """Every class in [start]'s super/interface chain that this dump contains.

    Returns (chain, complete): complete is False when the walk left the tree, which is the signal
    that a member we cannot find may still be inherited from something outside the dump.
    """
    seen = seen if seen is not None else set()
    chain, complete = [], True
    stack = [start]
    while stack:
        name = stack.pop()
        if name in seen:
            continue
        seen.add(name)
        if name == OBJECT:
            chain.append(name)                   # the known end of the chain, not a blind spot
            continue
        info = classes.get(name)
        if info is None:
            complete = False                     # not part of this dump: cannot decide
            continue
        chain.append(name)
        if info["super"]:
            stack.append(info["super"])
        stack.extend(info["interfaces"])
    return chain, complete


def resolves(chain, complete, members, name, descriptor):
    """True when some class in [chain] declares the member, or it may live outside the dump."""
    for owner in chain:
        if (owner, name, descriptor) in members:
            return True
    return not complete                            # unresolved, but out of sight: tolerate


# Bundled libraries and the framework: their classes exist in this dump only in part, so a
# missing member there is not something this project can fix or should block a build on.
LIBRARIES = ("Landroid/", "Ljava/", "Ljavax/", "Lkotlin/", "Landroidx/", "Lcom/google/",
             "Lcom/bumptech/", "Lcom/airbnb/", "Lorg/", "Ldalvik/", "Lsun/")


def scan(roots, classes, methods, fields):
    misses = []
    for root in roots:
        for path in sorted(Path(root).rglob("*.smali")):
            for number, raw in enumerate(
                    path.read_text(encoding="utf-8", errors="replace").splitlines(), 1):
                line = raw.strip()
                if line.startswith("#"):
                    continue
                m = INVOKE.search(line)
                if m:
                    owner, name, descriptor = m.group(1), m.group(2), m.group(3)
                    chain, complete = hierarchy(owner, classes)
                    if not resolves(chain, complete, methods, name, descriptor):
                        misses.append((str(path), number,
                                       f"{owner}->{name}{descriptor}", owner))
                    continue
                m = FIELD_REF.search(line)
                if m:
                    owner, name, kind = m.group(1), m.group(2), m.group(3)
                    chain, complete = hierarchy(owner, classes)
                    if not resolves(chain, complete, fields, name, kind):
                        misses.append((str(path), number,
                                       f"{owner}->{name}:{kind}", owner))
    return misses


def main(argv):
    owned, everything = [], False
    while "--owned" in argv:
        cut = argv.index("--owned")
        owned.extend(argv[cut + 1:cut + 2])
        del argv[cut:cut + 2]
    if "--all" in argv:
        argv.remove("--all")
        everything = True
    roots = argv[1:] or ["APKtool/smali"]
    classes, methods, fields = index(roots)
    print(f"indexed {len(classes)} class(es), {len(methods)} method(s), {len(fields)} field(s)")
    misses = scan(roots, classes, methods, fields)
    if owned:
        misses = [m for m in misses if any(o in m[3] for o in owned)]
    actionable = [m for m in misses
                  if everything or not m[3].startswith(LIBRARIES)]
    library = [m for m in misses if m not in actionable]
    for path, line, reference, _ in library:
        print(f"in a bundled library, ignored: {path}:{line}\n      {reference}")
    for path, line, reference, _ in actionable:
        print(f"UNRESOLVED: {path}:{line}\n      {reference}")
    print(f"{len(actionable)} unresolvable reference(s) to fix"
          f" ({len(library)} more inside bundled library stubs)")
    return 1 if actionable else 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
