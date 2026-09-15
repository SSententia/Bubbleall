# Attach the newest image on upload — implementation record

Status: **implemented, built, installed on device, verified end-to-end** (2026-09-14).

## The problem

Tapping an "upload media" button on ChatGPT or Google AI Studio inside the BubbleAll browser did
nothing at all. That was not an OS restriction or a permissions problem — it was a missing
override.

- The bubble browser is BubbleAll's own WebView: `com.alexmanzana.bubbleall.views.Web extends android.webkit.WebView`.
- `Web.<init>` (smali lines 199–201) installs `Web$2` as its `WebChromeClient`.
- `Web$2` implemented only `onReceivedIcon` and `onReceivedTitle`. A repo-wide grep for
  `onShowFileChooser` / `FileChooserParams` under `APKtool/smali/` returned **zero hits**.

So when a page fired `<input type=file>`, Chromium called `onShowFileChooser(...)`, the default
implementation did nothing, and the page never received a file. One missing method, one dead
button — in the Web panel, the Shortcut panel and every tab, since they all build a `Web`.

## What was changed

Three edits in the tree, plus build tooling.

| # | File | Change |
|---|---|---|
| 1 | `APKtool/AndroidManifest.xml` | Declare `android.permission.READ_MEDIA_IMAGES` (the app requested audio and video but never images) |
| 2 | `APKtool/smali/.../views/Web$2.smali` | Add the `onShowFileChooser` override — three instructions, delegating to the helper |
| 3 | `APKtool/smali/.../MainActivity.smali` | One `invoke-static` in `onCreate`, asking for photo access at app open |
| 4 | `APKtool/smali/.../utils/LatestImage.smali` | **New** helper holding all of the logic (generated — see below) |

Runtime behaviour:

- File inputs that accept images (`image/*`, `*/*`, no `accept` at all, or a known image
  extension) → the newest image in the gallery is attached and the site uploads it immediately.
- Video / audio / PDF inputs, and save/download targets (`MODE_SAVE`) → return `false`, i.e.
  exactly the old behaviour. Nothing else about the browser changes.
- Permission not granted → a toast, and the callback is still consumed so the WebView's file
  chooser does not wedge.

The newest image is the first row of `MediaStore.Images` ordered `_id DESC` — MediaStore assigns
ids monotonically, so the highest id is the most recently added item. One indexed single-row
query, closed immediately, so it is safe on the UI thread (unlike the `getInternalColors` storm
documented in `docs/on-device-debug-2026-09-14.md`).

## Deviation from the original plan

The plan called for hand-writing the whole method in smali. I wrote the logic in **Java** instead
and generated the smali from it, keeping the hand-written part to three instructions:

```
tools/java/com/alexmanzana/bubbleall/utils/LatestImage.java     <- the source of truth
tools/dex2smali/DecodeDex.java                                  <- drives baksmali, see below
scripts/gen-helper.sh                                           <- javac -> d8 -> smali
```

baksmali's CLI is not shipped inside apktool 3.0.2 (its library is, so `SmaliDecoder` is drivable
directly, which is what `DecodeDex` does). The generated smali is checked into the tree because
that is what apktool assembles; regenerate it with `scripts/gen-helper.sh` rather than editing it.

This turned out to matter. The hand-written version first shipped as:

```smali
iget-object v0, p0, ...Web$2;->this$0:Lcom/alexmanzana/bubbleall/views/Web;
invoke-static {v0, p1, p2, p3}, ...LatestImage;->handle(...)Z
```

which assembled cleanly, installed cleanly, and then **crashed the app the moment a Web panel
opened**:

```
java.lang.VerifyError: Verifier rejected class com.alexmanzana.bubbleall.views.Web$2:
  boolean onShowFileChooser(...) failed to verify:
  [0x2] invalid argument count (4) exceeds outsSize (3)
```

`dexdump` showed the cause: for that 4-register, non-contiguous list (`{v0, v2, v3, v4}`) smali
wrote `outs=3`. The runtime verifier requires every invoke's argument count to fit `outs`, so the
whole class was rejected on load. `p1` already *is* the WebView, so dropping the `this$0` load and
calling with three registers (`{v2, v3, v4}`) both simplifies the method and avoids the bug.

`tools/dexcheck.py` now checks every method in every built dex for this, and `build-apk.sh` refuses
to sign if any invoke exceeds its method's `outs`. The failure mode is otherwise invisible until
the exact code path runs on a real device.

## Build and install

`knowledge.md` claimed signing tools were not installed; that was stale. Everything needed is on
this machine: build-tools 35.0.0 (`zipalign`, `apksigner` 0.9, `d8`), `platforms/android-35/android.jar`,
JDK 21, and apktool 3.0.2.

```
scripts/build-apk.sh              # apktool b -> dexcheck -> zipalign -> apksigner
scripts/build-apk.sh --install    # ...then install, uninstalling first if signatures differ
```

Signing now happens on the PC with `~/.android/debug.keystore`. The repo's previous
`bubbleall-patched.apk` was **unsigned** (its installed copy reports `apkSigningVersion=2`), so it
had been signed off-machine — probably the on-device "apk-signer" app. Moving signing here means
every rebuild from now on is a plain `install -r` that preserves app settings.

## Verification on the device

Device: realme RMX3933, Android 14 / API 34, not rooted.

1. **Permission arrives.** Launching the app raised the system dialog "Allow BubbleAll to access
   photos and video on this device?"; granting it set `READ_MEDIA_IMAGES: granted=true`. (The dialog
   says "photos and video" because the app also declares `READ_MEDIA_VIDEO`.)
2. **The override is a real override.** Its descriptor is byte-identical to the framework's:
   `(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z`.
3. **A real upload button fires it.** With the bubble browser on a page with a genuine `<input
   type=file>`, one tap produced:
   ```
   I BubbleUpload: file chooser: mode=0 image=true handled=true uri=content://media/external/images/media/1000260933
   ```
   `mode=0` is a real upload, `image=true` means the accept types were recognised as images.
4. **It picked the newest image.** `content://media/external/images/media/1000260934` and up all
   return "No item", so `1000260933` is the highest id in `MediaStore.Images` — the most recently
   added image.
5. **The WebView accepted the file.** Reading that URI back (`adb exec-out content read`) yielded
   1,423,898 bytes, and the page showed it in its own editor as `IMG_20260914_135556.jpg`,
   1.42 MB, compressed to 206 kB. So the URI was readable under the new permission, the MIME type
   resolved, and the site received the file — the full path works, from tap to upload.

## Not verified on device

The video/audio/PDF branch (`image=false` → leave untouched) was reviewed but not exercised, since
reaching a non-image upload input needs a site that has one. The consequence of a bug there is only
the pre-existing behaviour, so the risk is low.

## Operational findings worth knowing

- **Uninstalling resets the overlay permission.** After the reinstall the bubble never appeared —
  `SYSTEM_ALERT_WINDOW` was back to `default`. Fixed with
  `adb shell appops set com.alexmanzana.bubbleall SYSTEM_ALERT_WINDOW allow`. Expect to do this
  after any uninstall-first install.
- **Uninstalling wipes app data**, which includes the bubble's saved tabs, its main-page setting and
  all WebView cookies — so site logins (ChatGPT, AI Studio) are gone and must be redone once. This
  only happens on the first signature change; later rebuilds keep everything.
- **`adb push` into `DCIM/` is not indexed.** A file pushed to `/sdcard/DCIM/Camera/` never got a
  `MediaStore` row on this device, so it cannot be used to fake "the newest image" in a test. Use the
  device's own screenshot instead.
- **The SHORT_SERVICE ANR is still there** (see `docs/on-device-debug-2026-09-14.md`): the bubble
  service still blows its 3-minute budget and raises an ANR dialog. It did not stop the upload test
  from passing, but any long session with the bubble open will still hit it.

## Follow-ups

A long-press escape hatch to choose a different image when the newest one is the wrong one;
extending the same override to `video/*` and `audio/*` using the permissions the app already holds;
and a toggle in Bubble settings, which is mostly a `layout_add_window.xml` plus adapter job.
