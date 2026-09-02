# Freebuff Desktop — BubbleAll workspace knowledge

## What this is

A reverse-engineering workspace for the Android app **BubbleAll** (`com.alexmanzana.bubbleall`, v12 / versionCode 30). The goal is to modify/add features to the app by editing the decompiled smali and rebuilding the APK, using JADX's Java decompilation as a human-readable reference.

## Layout

- `com.alexmanzana.bubbleall v12_antisplit.apk` — the original APK (signed with the store key; do not modify).
- `APKtool/` — **apktool 3.0.2 decompilation. This is the editable build tree.**
  - `smali/` → `classes.dex` — **all app classes live here** (`com/alexmanzana/bubbleall/…`): `BubbleService.smali`, `ShortcutActivity.smali`, `MenuActivity.smali`, `Settings*.smali`, etc.
  - `smali_classes2/`, `smali_classes3/` — library code (androidx, google), not app logic.
  - `res/`, `AndroidManifest.xml`, `apktool.yml` (sdkInfo: minSdk 23, targetSdk 34).
- `JADX/` — **JADX "export as Gradle project" output. Read-only reference only.**
  - `app/src/main/java/com/alexmanzana/bubbleall/*.java` — decompiled Java/Kotlin source, 1:1 correspondence with the smali files above.
  - The Gradle project (`namespace com.alexmanzana.bubbleall`, compileSdk 34) is **not buildable** — decompiled code won't compile and resources/libs are absent. Use it only to understand logic.

## Commands (Windows/Git Bash)

- Rebuild APK from the smali tree (verified working):
  `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`
- apktool is installed system-wide as `/c/Windows/apktool_3.0.2.jar` (+ `apktool.bat`); Java 25 is installed.
- Signing tools (`apksigner`, `zipalign`) are **NOT installed** — no Android SDK (`ANDROID_HOME` unset). Signing requires installing Android build-tools or the single-jar `uber-apk-signer`.
- A debug keystore exists at `C:\Users\Pankaekz\.android\debug.keystore` (default `android`/`android`).
- JADX tree has no working build/test/lint commands.

## Gotchas

- **Signature mismatch**: a rebuilt APK is signed with a new key and cannot install over the Play Store version — uninstall first.
- **Multi-dex**: new classes should go in `smali/` (classes.dex), never add to `smali_classes2/3` unless it's a library class.
- **Adding new classes in smali is laborious**; prefer modifying methods of existing classes or adding resources (`res/`) for simple features.
- **JADX output is reference-only** — never edit it expecting changes to land in the APK; edit smali instead.
- Hardcoded resource IDs in smali are re-linked by apktool on rebuild, but keep `R$*.smali` files intact.
- Modifying/redistributing a commercial app violates its license; keep changes for personal use.
