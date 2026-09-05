# BubbleAll — Keyboard Modes, Bubble Restart & Transparency Fix (v2, corrected)

## Status — read this before doing anything else
This supersedes `plan.md`. A verification pass against the actual smali/JADX found
six load-bearing errors in that plan; they're stated twice, unchanged, ~17 minutes
apart, so treat them as stable — but **none of this has been through an actual
rebuild yet**. Believed-correct, not build-verified. Rebuild early and often rather
than implementing all 15 checklist items before the first compile.

**Already done — do not redo:**
- `APKtool/res/values/strings.xml`: `text_hide_keyboard` / `text_hide_keyboard_d`
  removed; `text_keyboard_system`, `text_keyboard_builtin`, `text_keyboard_paste`,
  `text_keyboard_nothing`, `text_keyboard_mode`, `text_keyboard_mode_d` added.
  Confirm current file state before touching it again.

**Still needed in that same file:** `text_restart`, `text_restart_d` (restart
button strings — not yet added).

**Nothing else has been started.** No `.smali` file has been edited. No rebuild
has been attempted.

## Context
BubbleAll (`com.alexmanzana.bubbleall`, v12) is re-engineered by editing the smali
tree in `APKtool/` and rebuilding with apktool (JADX = reference only). The
previous change added the transparency slider + a broken "Hide keyboard in
browser" switch (`key_no_keyboard`). Verified rebuild command:
`java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`.

## Goal 1 — Replace keyboard toggle with a 4-mode selector

**Pref:** `keyboard_mode` int 0..3 in `bubble_data_prefs` (default 0). Replaces
`key_no_keyboard`.

**Modes:** 0 Keyboard (default WebView behavior) · 1 Built-in (custom in-app
keyboard bar, lives in the manager window, closes with the browser, inherits
alpha) · 2 Paste (single "Paste" button, taps clipboard into focused field) ·
3 Nothing (fully suppressed).

**Corrected design (supersedes the original mechanism):**
- **UI is chips, not a Spinner.** A `Spinner`'s dropdown is a sub-window
  (`PopupWindow`); anchoring one inside a `TYPE_APPLICATION_OVERLAY` service
  window throws `BadTokenException`. Use the app's existing idiom instead: a row
  of 4 selectable `TextView` chips styled like the current hide/show-bubble row
  (`background_item_color` / `background_item_color_current`).
- **Suppression is a window flag, not `onCreateInputConnection → null`.** Returning
  null from `onCreateInputConnection` is what caused the *original* sticky-keyboard
  bug — Chromium's explicit `showSoftInput` still opens the IME, and the later
  `hideSoftInputFromWindow` is a no-op. Correct lever: set `FLAG_ALT_FOCUSABLE_IM`
  (0x20000) on the manager window's `LayoutParams` whenever mode != 0, so the
  window is never eligible as an IME target — OS-enforced, no WebView fighting.
- **Bar lives in the manager window, not the browser panel.** `WebView`'s children
  *are* its tabs; `AdapterWebTab`/`finishMenu`-style logic treats child index as
  tab position. A non-`Web` child inserted at index 0 shifts every tab by one, so
  swipe-to-close would remove the wrong view. Put the bar in `layout_window.xml`
  as a sibling instead — same alpha inheritance, zero child-index impact, hidden
  with the panel on `pause()`/`onDestroy()`.
- **Text entry via JS, no captured `InputConnection`.** With the window never an
  IME target, no `InputConnection` is ever created, so the originally-planned
  `ListenerWeb.onKeyboard(ZI)V` callback is unnecessary — drop it. Drive built-in
  keys and paste through `evaluateJavascript(...)` against `document.activeElement`.

**Resource work still needed (`arrays.xml`, `ids.xml`/`R$id`, `layout_add_window.xml`
swap Switch→chip row + Restart row, new `layout_kbd.xml` bar) is unchanged in kind
from the original plan — only the mechanism above changed, not the resource shape.**

## Goal 2 — Random internet loss + restart button

**Root cause (unchanged):** `Web$1.onReceivedError → ListenerWeb.onError(url) →
WebView.onError` is an empty no-op, so nothing ever reloads after a transient
drop (Wi-Fi re-association, data switch, captive portal). Ad-blocking is unrelated.

- **Fix A (restart-bubble button) now depends on the Goal 3 fix below** — see
  that section; the same broadcast-registration bug would make this button dead
  on arrival on the affected device if fixed in isolation.
- **Fix B (auto-reload on reconnect) is unaffected — implement as originally
  planned:** `WebView$network$1 extends ConnectivityManager.NetworkCallback`,
  registered in `onCreate` (`registerDefaultNetworkCallback` API 24+, fallback for
  23), unregistered in `onDestroy`; `onAvailable` → post to main handler → reload
  current Web.

## Goal 3 — Transparency real-time compatibility

**Corrected root cause:** likely *not* OEM alpha compositing.
`BubbleService.declareReceiver()` uses the old 2-arg `registerReceiver`, which
throws for non-system broadcasts on Android 14 (targetSdk 34) and is silently
swallowed by an existing try/catch. On the user's Realme/ColorOS device (per the
crash logs), this means the broadcast never arrives at all — which is exactly
"only applies after a restart," and it's why Goal 2's new restart-bubble
broadcast would also silently fail on that same device.

**Primary fix (do this first, it's the real root cause):** switch
`BubbleService.declareReceiver()` to the SDK-33+-gated 4-arg `registerReceiver`
overload already used by `MusicView`/`ShortcutView` elsewhere in the codebase.

**Secondary fix (keep from the original plan, cheap insurance):** also set
alpha at the window-manager level (`mViewParams.alpha = a;
mWindowManager.updateViewLayout(mView, mViewParams)`, same for the manager
window), guarded with `isAttachedToWindow()` + try/catch, alongside the existing
`setAlpha()` calls.

**Bonus:** this redesign also fixes a pre-existing crash where `applyAlpha()` is
called from the `ACTION_START_ONLY_BUBBLE` branch before `mViewManager` is
initialized — window-level alpha removes the dependency on that field.

## Goal 4 — "App not responding" warning (insight + optional fix)

**Unchanged.** Both crash logs are *"A foreground service of
FOREGROUND_SERVICE_TYPE_SHORT_SERVICE did not stop within a timeout"* — Android
14 enforces ~3 min for `shortService`; `BubbleService` calls `startForeground`
without ever stopping it. Main thread is idle in both dumps — not a real ANR.

**Optional 2-line fix:** manifest → `foregroundServiceType="specialUse"` +
`<property android:name="android.app.PROPERTY_SPECIAL_USE_FGS_SUBTYPE"
android:value="floating_bubble_overlay"/>`. Insight-only unless you want it done.

## Implementation checklist

- [x] Resources: Strings
- [x] Resources: ids, public.xml, R$id fields
- [x] Resources: Config layout — mode chips + restart row
- [x] Resources: Manager layout — built-in keyboard bar
- [x] Config wiring: AddView chip + restart wiring
- [x] Config wiring: Mode chip listener class
- [x] Config wiring: Restart listener class
- [x] Service: Fix receiver registration for API 34
- [x] Service: Window-level alpha + IME flag
- [x] Service: Restart bubble action
- [x] Browser: Web JS insert/delete/enter methods
- [x] Browser: WebView keyboard bar lifecycle
- [x] Browser: Keyboard click listener class
- [x] Verification: Verify JS payloads in real browser *(headless Chromium: insert incl. quoting/unicode, mid-caret delete, contenteditable, form submit, no-focus no-throw)*
- [x] Verification: Rebuild APK *(signing is the user's step — no signing tools here)*
- [x] Verification: Dex spot-check new methods

## Verification & commit

1. Rebuild: `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`
   (assembler + aapt2 catch smali/XML typos) — do this after each phase, not just
   at the end.
2. Re-read each modified method vs JADX reference; check register usage
   (post-mortem rule: save Context into a fresh local early, never trust p0/p1
   after writes, raise `.locals` as needed).
3. `git commit` (repo style, e.g. `[STABLE] Keyboard modes + bubble restart +
   window-level alpha + receiver fix`), and add a spec/plan doc under
   `docs/superpowers/` per repo convention.
4. On-device verification is the user's step (rebuild is unsigned; uninstall
   first) — flag anything that specifically needs a device test.

## Out of scope / notes
- No signing tools in this workspace — the agent rebuilds, the user signs/installs.
