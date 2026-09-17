# Freebuff Desktop — BubbleAll workspace knowledge

## What this is

A reverse-engineering workspace for the Android app **BubbleAll** (`com.alexmanzana.bubbleall`, v12 / versionCode 30). The goal is to modify/add features to the app by editing the decompiled smali and rebuilding the APK, using JADX's Java decompilation as a human-readable reference.

## Layout

- `com.alexmanzana.bubbleall v12_antisplit.apk` — the original APK (signed with the store key; do not modify).
- `APKtool/` — **apktool 3.0.2 decompilation. This is the editable build tree.**
  - `smali/` → `classes.dex` — **all app classes live here** (`com/alexmanzana/bubbleall/…`): `BubbleService.smali`, `ShortcutActivity.smali`, `MenuActivity.smali`, `Settings*.smali`, etc.
  - `smali_classes2/`, `smali_classes3/` — library code (androidx, google), not app logic.
  - `res/`, `AndroidManifest.xml`, `apktool.yml` (sdkInfo: minSdk 23, targetSdk 34).
- `tools/` — source of generated smali plus `tools/dexcheck.py`.
  - `tools/java/…` — the Java origin of every generated helper below `APKtool/smali/com/alexmanzana/bubbleall/`:
    `utils/LatestImage.java` (attach the newest image), `utils/ImageCrop.java` (the crop screen),
    `views/AttachCropOption.java` (its config row).
  - `tools/stubs/…` — compile-time-only stubs for classes that live in the APK rather than in
    `android.jar` (`androidx.core.content.FileProvider`). They are compiled to a separate directory
    and never dexed, so no stub reaches the APK.
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
- Regenerate the helper smali after editing any helper Java: `bash scripts/gen-helper.sh`. It
  compiles every file under `tools/java` (and `tools/stubs`), dexes them together and copies
  **every** generated `.smali` — including the nested `ImageCrop$Root`/`$Click`/`$CropLayer` files —
  into `APKtool/smali`, then stop hand-editing those files: the next run overwrites them.
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
- **The crop screen is a third overlay window, not an activity.** `ImageCrop` adds its own
  `TYPE_APPLICATION_OVERLAY` window through the WebView's context (which is the service) and answers
  the pending `ValueCallback<Uri[]>` itself, so nothing depends on a background-activity-start
  exemption. It can never leave an upload button dead: if the window cannot be shown, `show()`
  returns false and `LatestImage` attaches the newest image the old way. Read the decision in logcat
  with `adb logcat -s BubbleUpload` — the line now carries `crop=true|false`.
- **The crop screen's opacity is deliberately split.** The photo is drawn by the window at alpha 1
  while the shade, marquee, handles and button bar follow `theme_alpha` (floored at 0.25 so the
  screen stays operable at full transparency). Setting window-level alpha — the way
  `BubbleService.applyAlpha()` does for the bubble and manager windows — would fade the photo too.
- **Cropped uploads go out through the app's FileProvider.** `ImageCrop` writes to
  `getCacheDir()` and shares it with `FileProvider.getUriForFile(..., "com.alexmanzana.bubbleall.fileprovider", ...)`;
  the provider's `<cache-path name="cache" path="."/>` already covers that directory, and the
  WebView reads it without an explicit grant because it is the same app. The preference that turns
  the screen on is `crop_before_attach` (boolean, default **true**) in `bubble_data_prefs`.
- **The gallery picker is a fourth overlay window.** `ImagePicker` (shown when `pick_from_gallery`
  is true in `bubble_data_prefs`, default **false**) is built the same way as the crop screen: a
  `TYPE_APPLICATION_OVERLAY` window, no activity, no `onActivityResult`. The page's own
  `FileChooserParams.getMode()` decides single vs multi (`MODE_OPEN_MULTIPLE` = 2), so a file input
  without `multiple` gets single-select instead of silently losing extra picks. Several images are
  answered in **one** `onReceiveValue(Uri[])` — a WebView file chooser can only be answered once —
  and because of that a crop cancelled mid-batch cancels the whole attach (all-or-nothing). Read the
  flow in logcat: `file chooser: ... picker=true`, `picker: opened on N image(s), multiple=...`,
  `picker: picked N image(s)`, one `crop ...` line per image, then `answered with N image(s), cropped`.
- **Picker thumbnails are windowed, not Glide.** Glide is bundled and would be the easy answer, but
  a helper class can only use it through hand-written stubs, and a descriptor that does not match
  the bundled version fails on the device with `NoSuchMethodError`. Instead the grid is a `ScrollView`
  of fixed-size cells and one worker decodes only the rows on screen ±1, recycling as they leave
  (`ContentResolver.loadThumbnail` on API 29+, downsampled file read below). Grid geometry therefore
  has to stay uniform: cell size and gap are what make "which rows are visible" computable.
- **Two checkers now guard hand-written smali, and both are self-tested.** `tools/dexcheck.py` catches
  an invoke that exceeds its method's `outs` (the `VerifyError` of September). `tools/refcheck.py`
  catches the *other* silent killer: a call site whose class, name, descriptor or field type does not
  match anything in the tree (`NoSuchMethodError` / `NoSuchFieldError` at first run). Both are wired
  into `scripts/build-apk.sh`; `refcheck` runs a self-test first, because a checker that never fires
  is indistinguishable from one that works. That self-test exists for a reason: `refcheck.py` was
  **vacuous twice** while being written — CRLF line endings defeated every line-anchored pattern, and
  `java.lang.Object`, which no dex dump contains, made every class chain look unknowable. Both bugs
  printed a confident "0 unresolvable references". Misses *into* bundled library stubs (android,
  androidx, kotlin) are reported but never fatal: those dumps are partial, so they say nothing about
  this project's code.
- **`gen-helper.sh` deletes the classes it owns before regenerating them.** Copying the new smali
  over the old tree leaves a stale `Foo$Old.smali` behind when an inner class is renamed or removed,
  and stale smali referencing a method that no longer exists assembles fine and fails at runtime.
- **`javac` needs `-encoding UTF-8` here** (it is on both invocations in `gen-helper.sh`). The default
  is the platform charset, Cp1252 on this machine, so a non-ASCII string literal — the crop screen's
  ellipsis — is read as mojibake and ships that way.
- **apktool on this machine is 3.0.3** (`C:/Windows/apktool_3.0.3.jar`); both scripts point at it.
  baksmali still has no CLI inside apktool, hence `tools/dex2smali/DecodeDex.java`.
- **JADX output is reference-only** — never edit it expecting changes to land in the APK; edit smali instead.
- Hardcoded resource IDs in smali are re-linked by apktool on rebuild, but keep `R$*.smali` files intact.
- Modifying/redistributing a commercial app violates its license; keep changes for personal use.
