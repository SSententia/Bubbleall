# Pick images from the gallery — implementation record

Status: **implemented, built, dex-checked and reference-checked** (2026-09-17). **Not exercised on a
device** — none was attached for this session (`adb devices` empty, no AVDs). See *Verification*
for what that leaves open and `.smoke/pick/run.sh` for the device-day harness.

## The request

Since 2026-09-14 an upload button in the bubble browser attaches the newest gallery image, and since
2026-09-15 it can be cropped first. Both are one tap, but neither lets the user choose *which*
image. This adds a second toggle — **Pick from gallery** — that opens a picker instead: a grid of
the recent images, tap to select, **several at a time**, each one cropped in turn when cropping is
on, and all of them handed to the page together.

## What was changed

| # | File | Change |
|---|---|---|
| 1 | `tools/java/.../utils/ImagePicker.java` | **New** — the picker overlay: MediaStore query, 3-column grid, tap-to-select, lazy thumbnails, Cancel/Attach |
| 2 | `tools/java/.../views/PickGalleryOption.java` | **New** — config-row binding + the `pick_from_gallery` flag (default **off**) |
| 3 | `tools/java/.../utils/ImageCrop.java` | Result is now a `Sink` instead of a `ValueCallback<Uri[]>` — no WebView dependency, so it can run once per picked image |
| 4 | `tools/java/.../utils/LatestImage.java` | Picker branch; `Batch` drives per-image cropping and the single mass answer |
| 5 | `APKtool/res/drawable/ic_baseline_photo_library_24.xml` | **New** icon for the row |
| 6 | `APKtool/res/values/strings.xml` | `text_pick_gallery`, `text_pick_gallery_d`; `text_crop_attach_d` reworded to "Crop **each** image…" |
| 7 | `APKtool/res/values/ids.xml`, `public.xml`, `smali/.../R$id.smali` | Five ids, `0x7f0902bf`–`0x7f0902c3` |
| 8 | `APKtool/res/layout/layout_add_window.xml` | The new config row (title, description, icon button, On/Off label) |
| 9 | `APKtool/smali/.../views/AddView.smali` | Tints the row from the theme and calls `PickGalleryOption.bind` |
| 10 | `APKtool/smali/.../utils/ImagePicker*.smali`, `ImageCrop*.smali`, `LatestImage*.smali`, `views/PickGalleryOption*.smali` | Generated — edit the Java, then `scripts/gen-helper.sh` |
| 11 | `scripts/gen-helper.sh` | apktool 3.0.3; `-encoding UTF-8`; deletes the classes it owns before writing them |
| 12 | `tools/refcheck.py` + `tools/refcheck_selftest.sh` | **New** build checks: every smali reference resolves, with a self-test that proves the checker fires |
| 13 | `scripts/build-apk.sh` | Runs the reference check (and the self-test) before signing |

With the toggle off, nothing about the previous behaviour changes: newest image, cropped if asked.

## What the user sees

* Grid of the newest 200 images, newest first, three per row, captioned "Newest 200 in the gallery".
* Tap a cell to select: a numbered blue badge shows its position in the batch — which is also the
  crop order. Tapping it again deselects. "Attach (n)" counts the selection; with nothing selected
  it is dimmed and does nothing.
* **Attach** with cropping on runs the crop screen once per image, in tap order. Cancel or BACK on
  any of them drops the whole attach.
* **Attach** with cropping off hands every selected original straight to the page.
* **Cancel** or BACK on the picker attaches nothing.

## Design decisions

**A fourth overlay window, not an activity.** Like the bubble, the manager panel and the crop
screen, the picker is a `TYPE_APPLICATION_OVERLAY` window, so it needs no activity, no
background-activity-start exemption and no `onActivityResult` plumbing from a service context. It
also cannot be dismissed by the page underneath, which matters because the WebView's file chooser
is still pending while it is open.

**The page decides how many files, not us.** `FileChooserParams.getMode()` tells us whether the
input has `multiple` (`MODE_OPEN_MULTIPLE`). With it, the picker is multi-select; without it,
tapping a second image *replaces* the selection. Offering several files to an input that takes one
would be a promise the DOM silently drops — the user would see two attachments in the picker and
one in the chat box.

**All-or-nothing, in one answer.** A WebView file chooser can be answered exactly once, so the
batch collects the cropped results and calls `onReceiveValue(Uri[])` a single time at the end. A
cancelled crop therefore cancels the whole attach: attaching half a selection would be worse than
attaching none, and the alternative (drop just that image) is a decision the user did not make.

**Thumbnails by scroll window, not Glide.** Glide *is* bundled and would do this for a `RecyclerView`,
but using it from a helper class means stubbing its builder chain and hoping the stubs' descriptors
match the bundled version — the failure mode is a `NoSuchMethodError` on a device. Instead the grid
is a `ScrollView` of fixed-size cells and the loader decodes only the visible rows plus one either
side, recycling as they leave. On API 29+ that is `ContentResolver.loadThumbnail`; older releases
downsample the file. A phone with thousands of screenshots costs a screenful of bitmaps.

**`ImageCrop` lost its WebView parameter.** Its answer now goes to a `Sink`, which is what makes
"crop each of these images in turn" expressible at all: the same screen is used N times by a batch
that holds the intermediate results, and once by the newest-image path.

## Verification

Done here, offline:

* `scripts/gen-helper.sh` compiles all helpers (javac → d8 → baksmali) and the 26 smali files are
  copied into the tree; the stale-class cleanup removed the 11 files the previous generation owned.
* `scripts/build-apk.sh` builds, dex-checks and signs: `0 method(s) whose invokes exceed outs` on all
  three dex files — the check that caught the `outs_size` bug in September.
* `tools/refcheck.py` over all 16,609 classes / 98,145 methods / 63,576 fields: **0 unresolvable
  references**, 10 informational misses inside partial framework/AndroidX stubs (pre-existing, in
  bundles this project does not own). This is what proves the hand-written `AddView` block calls
  `PickGalleryOption.bind` with the descriptor that actually exists — the mistake that would
  otherwise surface as `NoSuchMethodError` on the device.
* `tools/refcheck_selftest.sh` injects a wrong method descriptor and a wrong field type and requires
  the checker to report both.
* `aapt2 dump resources` / `dump xmltree` on the built APK: `pickGallery` = `0x7f0902bf`,
  `pickGalleryTitle/Desc/Image/State` = `0x7f0902c0`–`0x7f0902c3`, the row's `layout_toStartOf`
  pointing at `0x7f0902bf`, the icon resolving to `ic_baseline_photo_library_24`, and the state label
  defaulting to `v7_preference_off` (`0x7f110165`). A mismatch between the layout's `@id` and the
  smali's `R$id` constant is the classic "the toggle does nothing" bug and is invisible to a build
  that succeeds.

**Not verified — needs a phone** (`.smoke/pick/run.sh guide` walks through it):

* the picker window appearing, thumbnails decoding, selection badges, scrolling
* media permission state on the device and the grid's contents
* the crop-per-image sequence and the single multi-file answer reaching a real page
* that a single-file input (`mode=0`, e.g. squoosh.app) really does restrict the picker to one
* `Cancel` mid-batch, BACK on the picker, and the toggle's Off state (unchanged behaviour)

## Known limitations

* The grid reaches the newest **200** images; older ones need the system picker.
* Partial photo access is not handled: on Android 14 with "selected photos only",
  `READ_MEDIA_IMAGES` reads as denied and the picker reports an empty gallery (the newest-image path
  has had the same behaviour since 09-14). `READ_MEDIA_VISUAL_USER_SELECTED` would fix it.
* Half-written images (`IS_PENDING`) are skipped by the picker but not by the newest-image path, so a
  screenshot still being written can be attached by the shortcut and not appear in the grid.
* Non-image inputs (PDF, video) are untouched, as before: they still get the default no-op.
* The picker is tap-and-flick only — no pinch zoom, no long-press preview.

## Tooling found broken on the way

* `scripts/gen-helper.sh` still pointed at `apktool_3.0.2.jar`, which no longer exists on this
  machine (3.0.3 is the only one); `scripts/build-apk.sh` had already been bumped.
* It never deleted the smali it owns, so a class that disappears from the Java — a renamed or
  removed inner class — leaves a stale `.smali` behind that still assembles.
* `javac` was invoked without `-encoding UTF-8`, so a non-ASCII string literal (the crop screen's
  ellipsis) is read as Cp1252 and ships mangled.
