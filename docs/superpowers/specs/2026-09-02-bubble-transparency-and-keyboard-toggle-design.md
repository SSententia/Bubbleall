# BubbleAll — Global Transparency & Browser Keyboard Toggle

Date: 2026-09-02

## Goal

Two user-facing features in the BubbleAll bubble overlay, implemented by editing the
decompiled smali tree in `APKtool/` and rebuilding with apktool (JADX output is
reference-only):

1. **Global transparency** — one value that makes every component of the overlay
   (floating bubble, manager window, window background, tabs, and all panels:
   web/music/video/shortcuts) transparent together, editable from the **Bubble
   settings** screen and applied **live** while dragging the slider.
2. **Browser keyboard toggle** — a switch in the same Bubble-settings screen that, when
   ON, stops the soft keyboard from appearing when tapping input fields inside the
   browser panel; pasting still works via long-press context menu.

## Decisions (confirmed with user)

- One global transparency slider for everything (not per-component).
- Toggle ON ⇒ keyboard never appears; paste via long-press context menu.

## Where the settings live

"Bubble settings" = the config screen opened by the gear icon in the "+" panel
(`AddView.listenerConfig$lambda$0` inflating `res/layout/layout_add_window.xml`,
title string `text_bubble_config`). It already contains Show/Hide bubble rows and a
bubble-size selector. The two new rows are added here.

## Data model

Stored in the private prefs file `bubble_data_prefs` (same file as `theme_size`,
`xBubble`, `page_web`, etc.):

- `theme_alpha` — `int` 0..255, default 255 (fully opaque). Written by the SeekBar.
- `key_no_keyboard` — `boolean`, default false. Written by the Switch.

## Implementation

### 1. Resources

- `res/layout/layout_add_window.xml`: append two rows following the existing
  title/description + control pattern:
  - Transparency: `TextView` title + `TextView` desc + `SeekBar` (`@+id/transparencySeek`, max 255).
  - Hide keyboard in browser: `TextView` title + `TextView` desc + `Switch` (`@+id/keyboardSwitch`).
- `res/values/strings.xml`: add `text_transparency`, `text_transparency_d`,
  `text_hide_keyboard`, `text_hide_keyboard_d`.
- `res/values/ids.xml` and `smali/.../R$id.smali`: register `transparencySeek` and
  `keyboardSwitch` explicitly (apktool re-links on build; explicit entries keep the
  smali sget references valid).

### 2. `smali/.../views/AddView.smali` (`listenerConfig$lambda$0`)

After the existing wiring (hide/show bubble, size selector), add:

- Find `transparencySeek`; `setProgress(prefs.getInt("theme_alpha", 255))`;
  attach `OnSeekBarChangeListener` that on change writes the pref and broadcasts
  `com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE`.
- Find `keyboardSwitch`; `setChecked(prefs.getBoolean("key_no_keyboard", false))`;
  attach `OnCheckedChangeListener` that writes the pref (no broadcast needed — Web
  reads the pref lazily on focus).
- Tint the new title/desc TextViews with `BubblePrefs.getInternalColors(context)`.

New listener classes (small, no resource deps beyond R references apktool re-links):
- `AddView$listenerConfig$1$2.smali` — `SeekBar.OnSeekBarChangeListener`.
- `AddView$listenerConfig$1$3.smali` — `CompoundButton.OnCheckedChangeListener`.

### 3. `smali/.../BubbleService.smali`

- New private `applyAlpha()`: read `theme_alpha` (default 255), compute
  `alpha = value / 255.0f`, `mBubble.setAlpha(alpha)`, `mViewManager.setAlpha(alpha)`
  (null-safe like surrounding code).
- Call `applyAlpha()`:
  - at end of `modifyBubble()` (already invoked by the `ACTION_MODIFY_BUBBLE`
    receiver ⇒ live updates while dragging),
  - in `onStartCommand` after the bubble-only view setup,
  - in the non-bubble branch after `declareProperties()`.

### 4. `smali/.../views/Web.smali`

- Add `onCreateInputConnection(EditorInfo) : InputConnection` override: if
  `bubble_data_prefs` has `key_no_keyboard == true` return `null`; otherwise delegate
  to `super`. Returning null prevents the soft keyboard while long-press paste keeps
  working (WebView's context menu does not depend on the InputConnection).

## Behavior

- Defaults leave the app unchanged: alpha 255, toggle off.
- Dragging the slider ⇒ broadcast per change ⇒ `modifyBubble()` re-applies alpha in
  real time (cheap: one `setAlpha` per view).
- Existing panels and any future panel automatically inherit window alpha because
  alpha is applied at the window root.

## Risks / notes

- No Android SDK in this workspace: verification is a successful `apktool b` rebuild
  plus manual smali review against the JADX reference. On-device behavior must be
  checked by installing the rebuilt APK (signature differs from the store build —
  uninstall first).
- No git repo in this workspace, so the spec is not committed.
