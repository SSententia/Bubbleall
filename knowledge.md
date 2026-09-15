# Freebuff Desktop — BubbleAll workspace knowledge

## What this is

A reverse-engineering workspace for the Android app **BubbleAll** (`com.alexmanzana.bubbleall`, v12 / versionCode 30). The goal is to modify/add features to the app by editing the decompiled smali and rebuilding the APK, using JADX's Java decompilation as a human-readable reference.

## Layout

- `com.alexmanzana.bubbleall v12_antisplit.apk` — the original APK (signed with the store key; do not modify).
- `APKtool/` — **apktool 3.0.2 decompilation. This is the editable build tree.**
  - `smali/` → `classes.dex` — **all app classes live here** (`com/alexmanzana/bubbleall/…`): `BubbleService.smali`, `ShortcutActivity.smali`, `MenuActivity.smali`, `Settings*.smali`, etc.
  - `smali_classes2/`, `smali_classes3/` — library code (androidx, google), not app logic.
  - `res/`, `AndroidManifest.xml`, `apktool.yml` (sdkInfo: minSdk 23, targetSdk 34).
- `tools/` — source of generated smali (`tools/java/…` holds the Java origin of `APKtool/smali/…/utils/LatestImage.smali`) plus `tools/dexcheck.py`.
- `scripts/` — `gen-helper.sh` (Java → smali) and `build-apk.sh` (build, check, sign, optionally install).
- `JADX/` — **JADX "export as Gradle project" output. Read-only reference only.**
  - `app/src/main/java/com/alexmanzana/bubbleall/*.java` — decompiled Java/Kotlin source, 1:1 correspondence with the smali files above.
  - The Gradle project (`namespace com.alexmanzana.bubbleall`, compileSdk 34) is **not buildable** — decompiled code won't compile and resources/libs are absent. Use it only to understand logic.

## Commands (Windows/Git Bash)

- **Build, check, sign and install** (preferred):
  `bash scripts/build-apk.sh` then `bash scripts/build-apk.sh --install`.
- Raw apktool rebuild, if you only want the unsigned APK:
  `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`
- **An Android SDK does exist** at `D:/X/Programs/ASDK` (the earlier note that it did not is wrong):
  build-tools 35.0.0 ships `zipalign.exe`, `apksigner.bat` (0.9), `d8.bat`, `aapt2.exe` and
  `dexdump.exe`, and `platforms/android-35/android.jar` is available for compiling against.
  JDK 21 lives at `D:/X/Programs/JDK 21/jbr-21.0.11`. apktool is `/c/Windows/apktool_3.0.2.jar`
  and runs fine under the system JDK 25 (that JDK only breaks *Gradle* Kotlin DSL builds).
- **Signing happens here now**, with the debug keystore at
  `C:\Users\Pankaekz\.android\debug.keystore` (`androiddebugkey`, `android`/`android`). Sign every
  build with it: the first install needs an uninstall (signature differs from the Play build), but
  every rebuild after that is a plain `install -r` that **keeps app settings**. The old flow of
  signing off-machine (an on-device "apk-signer" app) is no longer necessary.
- Generate the helper smali after editing its Java: `bash scripts/gen-helper.sh`.
- JADX tree has no working build/test/lint commands.

## Gotchas

- **Signature mismatch**: a rebuilt APK is signed with a new key and cannot install over the Play Store version — uninstall first.
- **Multi-dex**: new classes should go in `smali/` (classes.dex), never add to `smali_classes2/3` unless it's a library class.
- **Adding new classes in smali is laborious**; prefer modifying methods of existing classes or adding resources (`res/`) for simple features. When a change needs real logic, write it as Java under `tools/java/`, compile against `android.jar` and turn it into smali with `scripts/gen-helper.sh` instead of hand-writing the body — then hand-write only a short delegating method.
- **The `outs` trap — hand-written invokes can pass the assembler and still kill the app.** smali
  sizes a method's outgoing-argument area (`outs`) from the register list, and a non-contiguous
  four-register invoke was written as `outs=3`. Nothing complains until the class is loaded:
  `java.lang.VerifyError: … invalid argument count (4) exceeds outsSize (3)`, which crashes the app
  the moment that class is touched. Keep hand-written invokes to ≤3 argument registers where you
  can, and always run the build script: it runs `tools/dexcheck.py` over every built dex and refuses
  to sign when any invoke exceeds its method's `outs`.
- **The other verifier trap — a register whose type changes across a try block.** Adding a guard
  before an existing `:try_start_0` turned register `v1` from the zero/null constant into a boolean,
  so the catch path's `return-object v1` became `VerifyError … failed to verify: [0x6D] returning
  register with conflict`. Like the `outs` trap it assembles and installs fine and only explodes
  when the class is first touched. Leave the registers an existing try block depends on untouched
  (use a scratch register), and rely on the build: `scripts/build-apk.sh --install` now launches the
  app after installing and **fails the build** on a `VerifyError` or a fatal exception in this
  package.
- **Uninstalling resets special permissions.** After an uninstall-first install the bubble never
  appears because `SYSTEM_ALERT_WINDOW` is back to `default`; restore it with
  `adb shell appops set com.alexmanzana.bubbleall SYSTEM_ALERT_WINDOW allow`. An uninstall also wipes
  app data — bubble prefs, saved tabs and all WebView cookies (so site logins must be redone once).
- **`adb push` into `DCIM/` does not get indexed.** A file pushed to `/sdcard/DCIM/Camera/` never
  received a `MediaStore` row on this device, so it cannot be used to fake "the newest image". To
  test media features, use the device's own screenshot.
- **Verify media work with shell commands, not guesswork.** `adb exec-out content read --uri
  content://media/external/images/media/<id>` dumps a row's bytes to the host (use `exec-out`, not
  `shell`, or line endings are mangled), and a missing row returns a "No item at …" error of fixed
  size, which is a handy way to find the highest existing id. Note this Android's `content` command
  has **no `query` subcommand**.
- **JADX output is reference-only** — never edit it expecting changes to land in the APK; edit smali instead.
- Hardcoded resource IDs in smali are re-linked by apktool on rebuild, but keep `R$*.smali` files intact.
- Modifying/redistributing a commercial app violates its license; keep changes for personal use.
