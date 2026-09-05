# Keyboard modes, bubble restart, window-level alpha, receiver fix

Implementation record for `bubbleall-plan-corrected.md`. All edits are in the
apktool tree (`APKtool/`); rebuild with
`java -jar C:/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`.

## Keyboard modes (pref `keyboard_mode`, int 0..3, `bubble_data_prefs`)

- 0 Keyboard — default WebView behavior, no bar.
- 1 Built-in — in-app key bar (digits, qwerty, space/del/enter, paste).
- 2 Paste — only the paste row.
- 3 Nothing — no bar, IME suppressed.

Replaces the removed boolean `key_no_keyboard`.

**UI:** four `TextView` chips in `layout_add_window.xml`
(`keyboardMode0..3`), selected chip drawn with `background_item_color_current`
like the existing hide/show-bubble row. No `Spinner` — its dropdown is a
`PopupWindow` and would throw `BadTokenException` inside a
`TYPE_APPLICATION_OVERLAY` window.

**Suppression:** `BubbleService.applyAlpha()` sets/clears
`FLAG_ALT_FOCUSABLE_IM` (0x20000) on `mViewManagerParams` whenever
`keyboard_mode != 0` and pushes it through `updateViewLayout`. The window is
then never an IME target, so no `InputConnection` is created and Chromium's
`showSoftInput` cannot open the keyboard. `Web.onCreateInputConnection` was
deleted — returning null from it was the cause of the original sticky-keyboard
bug.

**Bar placement:** `keyboardBar` is a sibling inside the `FrameLayout` of
`layout_window.xml`, not a child of `WebView`. `WebView`'s children *are* its
tabs (`currentWeb` is a child index), so a non-`Web` child would shift every
tab and break swipe-to-close. As a sibling it still inherits the manager
window's alpha.

**Text entry:** `Web.insertText(String)`, `Web.deleteText()`,
`Web.enterText()` drive `document.activeElement` via
`evaluateJavascript`. `insertText` quotes its argument with
`JSONObject.quote`. Handles `<input>`/`<textarea>` (value + selection) and
`contentEditable` (`execCommand`), dispatches `input` so JS-driven pages see
the change, and no-ops when nothing is focused. `enterText` dispatches
Enter keydown/keyup, then `form.requestSubmit()` (fallback `submit()`), else
blurs.

Keys carry their payload in `android:tag`: literal characters, or `#sp`,
`#del`, `#cr`, `#paste`. `WebView$keyListener$1` reads the tag and calls the
matching `Web` method; `#paste` coerces the first primary-clip item to text.

## Bubble restart

Config row `restartBubble` broadcasts
`com.alexmanzana.bubbleall.ACTION_RESTART_BUBBLE`. `BubbleService$argsBubble$1`
routes it to `BubbleService.restartBubble()`, which posts a 500 ms delayed
`Companion.start(applicationContext)` on the main looper, forces
`isStarting = false` so `start()` takes the start branch, then `stopSelf()`.

## Receiver registration (root cause of "alpha only applies after restart")

`declareReceiver()` used the 2-arg `registerReceiver`, which throws on
targetSdk 34 for non-system broadcasts and was swallowed by the existing
try/catch — so `ACTION_MODIFY_BUBBLE` never arrived. Now gated on
`SDK_INT >= 33` with the 4-arg overload and `RECEIVER_NOT_EXPORTED` (0x4),
2-arg below that.

## Window-level alpha

`applyAlpha()` sets `WindowManager.LayoutParams.alpha` on both the bubble and
manager windows (guarded by `isAttachedToWindow()` and try/catch) in addition
to `View.setAlpha`. Field null-checks replaced the Kotlin
`throwUninitializedPropertyAccessException` guards, which also removes the
pre-existing crash when `ACTION_START_ONLY_BUBBLE` called `applyAlpha()`
before `mViewManager` existed.

## Auto-reload after network loss

`WebView.onError` (previously an empty no-op) registers
`WebView$network$1 extends ConnectivityManager.NetworkCallback`
(`registerDefaultNetworkCallback` on API 24+, capability-based
`registerNetworkCallback` on 23). `onAvailable` posts to the main looper,
reloads the current `Web`, and unregisters — one reload per drop.
`onDestroy` unregisters too.

## Verification

- Rebuild passes (apktool 3.0.2, aapt2 + smali assembler).
- Dex spot-check: `insertText`, `deleteText`, `enterText`, `currentTab`,
  `unregisterNetworkPublic`, `keyboard_mode`, `ACTION_RESTART_BUBBLE` all
  present in `classes.dex`.
- JS payloads executed in headless Chromium: multi-call insert, quoting and
  non-ASCII (`" ' \ ö`), mid-caret delete, selection delete,
  `contentEditable` insert/delete, `input` event count, form submit via
  `requestSubmit`, Enter keydown in `contentEditable`, and no-throw with
  nothing focused.

## Needs on-device testing

`rebuilt.apk` is unsigned — sign and uninstall the old build first.

- Transparency slider applies immediately, without restarting the bubble
  (this is the receiver fix; the Realme/ColorOS device was the failing case).
- Each of the four keyboard modes: system IME appears only in mode 0; bar
  layout in modes 1 and 2; nothing in mode 3.
- Typing into a real page's search field via the built-in bar, including
  Enter submitting.
- Paste into a focused field.
- Restart button closes and reopens the bubble.
- Auto-reload: kill Wi-Fi mid-load, restore it, page should reload itself.
- Bar hides when the browser panel is closed and does not disturb tab
  swipe-to-close.

## Not done

Goal 4 (`foregroundServiceType="specialUse"` manifest change for the
"did not stop within a timeout" warning) was insight-only in the plan and was
left untouched.
