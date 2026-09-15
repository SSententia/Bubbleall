# Crop the newest image before attaching it — implementation record

Status: **implemented, built and dex-checked** (2026-09-15). Not yet exercised on a device — the
phone was `unauthorized` over ADB for this session; see *Verification* for the exact steps.

## The request

The 2026-09-14 change made every `<input type=file>` in the bubble browser attach the newest
gallery image immediately. That is one tap, but it also means whatever the screenshot happens to
contain is what gets uploaded. This adds a **toggle** — *Crop before attaching* — that puts the
image on a full-screen crop screen first, modelled on FloatingOCR's: the photo covers the whole
display at full opacity, while the crop chrome (shade, marquee, handles, button bar) follows the
bubble's own Transparency setting instead of being an opaque slab.

## What was changed

| # | File | Change |
|---|---|---|
| 1 | `tools/java/.../utils/ImageCrop.java` | **New** — the whole crop screen (window, decode, crop view, output) |
| 2 | `tools/java/.../views/AttachCropOption.java` | **New** — config-row binding + the `crop_before_attach` flag |
| 3 | `tools/java/.../utils/LatestImage.java` | Branch into the crop screen, with a fallback; also read MediaStore's `ORIENTATION` |
| 4 | `tools/stubs/androidx/core/content/FileProvider.java` | **New** — compile-time-only stub (never dexed) |
| 5 | `scripts/gen-helper.sh` | Compiles every helper + stubs, dexes all of them, copies *all* generated smali |
| 6 | `APKtool/res/drawable/ic_baseline_crop_24.xml` | **New** crop icon |
| 7 | `APKtool/res/values/strings.xml` | `text_crop_attach`, `text_crop_attach_d` |
| 8 | `APKtool/res/values/ids.xml` + `public.xml` + `smali/.../R$id.smali` | Five new ids, `0x7f0902ba`–`0x7f0902be` |
| 9 | `APKtool/res/layout/layout_add_window.xml` | The new config row (title, description, icon button, On/Off label) |
| 10 | `APKtool/smali/.../views/AddView.smali` | Tints the row from the theme and calls `AttachCropOption.bind` |
| 11 | `APKtool/smali/.../utils/ImageCrop*.smali`, `LatestImage*.smali`, `views/AttachCropOption*.smali` | Generated — edit the Java, then `scripts/gen-helper.sh` |

Nothing about the previous behaviour changed when the toggle is off.

## Runtime flow

```
tap "upload" on the page
  Web$2.onShowFileChooser                      (unchanged, 3-instruction delegate)
    → LatestImage.handle
        mode == MODE_SAVE or a non-image input  → return false (untouched, exactly as before)
        no photo permission                     → toast, callback consumed
        crop_before_attach == false             → attach the newest image (the 09-14 path)
        crop_before_attach == true              → ImageCrop.show(...)
              ├ true   → the crop screen now owns the callback; handle() returns true
              └ false  → attach the newest image anyway   ← the safety net
  crop screen: Cancel / BACK → callback.onReceiveValue(null)
               Attach        → crop → cache file → FileProvider content:// → callback
               whole image, no drag → the original URI is handed back untouched (no re-encode)
```

The crop screen is a third `TYPE_APPLICATION_OVERLAY` window next to the bubble and the manager
window, so it needs no activity and no background-activity-start exemption. The manager window
uses `FLAG_WATCH_OUTSIDE_TOUCH`, and nothing in the app handles `ACTION_OUTSIDE`, so taps on the
crop screen cannot close the panel underneath it — the WebView stays alive, which is what keeps
the pending `ValueCallback` valid.

## Decisions worth knowing

- **The photo is opaque; the chrome is not.** The window's alpha stays 1 and only the marquee,
  shade, handles and bar follow `theme_alpha` (the same value `applyAlpha()` uses for the bubble
  and manager windows). `MIN_CHROME_ALPHA = 0.25` puts a floor under it: at `theme_alpha = 0` an
  invisible frame and an invisible button bar would make the screen impossible to operate.
- **The default frame is the whole image.** Attach with no drag uploads exactly what the old path
  uploaded, so "crop" stays an explicit act rather than a surprise. Dragging a handle inward
  reveals the shade.
- **Full image, every time.** The photo is letterboxed above the button bar, so no handle or
  button can end up off-screen or under a system bar, and a crop of the status-bar region of a
  screenshot is still possible.
- **The toggle is on by default** — it is the feature — but off is one tap away in *Bubble config*,
  and the fallback above means a broken crop screen degrades to the old behaviour instead of a
  dead upload button.
- **Decode is off the UI thread**, bounded at 3200 px on the long edge; screenshots stay 1:1 so the
  crop keeps its original pixels. `MediaStore`'s `ORIENTATION` is applied, so camera photos are not
  sideways. It is queried separately from the `_ID` lookup so a missing column cannot break
  finding the image.
- **Output**: PNG through `Bitmap.CompressFormat.PNG` when the source is `image/png`, otherwise
  JPEG at quality 95, written to `getCacheDir()` and shared through the app's existing
  `com.alexmanzana.bubbleall.fileprovider` (its `<cache-path>` already covers that directory).
- **Runtime context**: the screen is added through the WebView's own context, which is the
  service — the same context the app already uses for its overlay windows.

## Verification

Build gates (all green):

```
bash scripts/gen-helper.sh      # 11 smali files: ImageCrop + 5 nested, LatestImage + Newest, AttachCropOption + 1
bash scripts/build-apk.sh       # apktool → dexcheck → zipalign → apksigner
```

Evidence gathered from the built artifacts:

- `dexcheck.py` reports **0** methods whose invokes exceed their `outs` in all three dex files, and
  the rebuilt `AddView.listenerConfig$lambda$0` really does declare `outs: 6` with a widest invoke
  of 5 argument registers — the trap that bit this project twice does not apply here.
- The five new ids resolve to exactly the constants in `R$id.smali`
  (`0x7f0902ba…0x7f0902be`, dumped from the built `resources.arsc`), and the new layout is present
  with those ids and the two new string ids.
- `dexdump` shows the intended call graph: `Web$2.onShowFileChooser → LatestImage.handle →
  AttachCropOption.enabled + ImageCrop.show`, and `ImageCrop.save →
  androidx.core.content.FileProvider.getUriForFile` (the real class, not the stub).
- The stub is compile-time only: it lands in `.build/helper/stubclasses`, is never passed to `d8`,
  and `git status` shows no `androidx` file touched.

**Not verified on device.** `adb devices` reported the phone as `unauthorized` for this session, so
nothing was installed. The two things to exercise first are the ones smali cannot check:

1. `bash scripts/build-apk.sh --install` (the very first install after a signature change needs an
   uninstall — see `knowledge.md` for the permission/cookie fallout).
2. In the browser panel, tap an image upload button and watch
   `adb logcat -s BubbleUpload` for `crop=true`, then drag a handle and Attach. Expect the uploaded
   image to be the cropped region. Cancel and BACK should both leave the page's input untouched.
3. Set Transparency low in the bubble config first: the frame, shade and button bar should fade
   together while the photo stays fully opaque.

## Follow-ups

Choose a different image instead of only the newest one; rotate the crop; remember the last crop
per site; delete old `bubble_crop_*` cache files (nothing cleans them up today, though the system
does under storage pressure).
