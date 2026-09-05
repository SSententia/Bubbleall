# BubbleAll — Keyboard Modes, Bubble Restart & Transparency Fix

## Context
BubbleAll (`com.alexmanzana.bubbleall`, v12) is re-engineered by editing the smali tree in `APKtool/` and rebuilding with apktool (JADX = reference only). The previous change added the transparency slider + a broken "Hide keyboard in browser" switch (`key_no_keyboard` → `Web.onCreateInputConnection` returns null, which makes the WebView IME sticky). Verified rebuild command: `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`.

## Goal 1 — Replace keyboard toggle with 4-mode selector

**New pref:** `keyboard_mode` int 0..3 in `bubble_data_prefs` (default 0). Replaces `key_no_keyboard`.

Modes:
- **0 Keyboard** — default WebView behavior (keyboard shows normally).
- **1 Built-in** — system keyboard suppressed; a custom in-app keyboard bar appears at the bottom of the browser panel. Lives inside the browser panel view (not a separate window) → closes with the browser, inherits window alpha.
- **2 Paste** — keyboard suppressed; a single "Paste" button appears; taps paste clipboard into the focused field.
- **3 Nothing** — keyboard fully suppressed (current behavior, kept).

**Files & changes:**

1. `APKtool/res/values/strings.xml` — replace `text_hide_keyboard`/`text_hide_keyboard_d` with `text_keyboard_mode` ("Keyboard in browser"), `text_keyboard_mode_d`; add `text_restart` ("Restart bubble"), `text_restart_d`, `text_paste`.
2. `APKtool/res/values/arrays.xml` — add `<string-array name="keyboard_mode_options">` (Keyboard / Built-in keyboard / Paste / Nothing).
3. `APKtool/res/layout/layout_add_window.xml` — swap the `Switch` for a `Spinner` (keep id `keyboardSwitch`); add a Restart row (title + desc + `Button` id `restartBubble`).
4. `APKtool/res/layout/layout_kbd.xml` (new) — dark translucent bar (LinearLayout, `android:focusable="false"` on all buttons): 3 letter rows (q–p, a–l, z–m) + bottom row (space, ⌫ tag `back`, ⏎ tag `enter`) inside `kbdRows`; a `Button` `kbdPaste` (GONE by default). Letters as lowercase text + tag, `textAllCaps="false"`.
5. `APKtool/res/values/ids.xml` + `R$id.smali` — add `kbdBar`, `kbdRows`, `kbdPaste`, `restartBubble`.
6. `AddView.smali` (`listenerConfig$lambda$0`) — replace Switch block with Spinner wiring: `ArrayAdapter(context, android.R.layout.simple_spinner_item, R.array.keyboard_mode_options)`, `setDropDownViewResource(...simple_spinner_dropdown_item)`, `setSelection(prefs int)`, `OnItemSelectedListener` saves pref. Wire Restart button → broadcast `com.alexmanzana.bubbleall.ACTION_RESTART_BUBBLE`. Tint new titles with `BubblePrefs.getInternalColors`. **Register discipline (post-mortem rule):** save the Context into a fresh local early; never trust p0/p1 after writes; raise `.locals` as needed.
7. `AddView$listenerConfig$1$3.smali` — repurpose into the Spinner `OnItemSelectedListener` (writes `keyboard_mode`).
8. `AddView$listenerConfig$1$4.smali` (new) — Restart button `OnClickListener` (broadcast).
9. `listeners/ListenerWeb.smali` — add abstract `onKeyboard(ZI)V`; add matching no-op impl in `utils/ListenerWebUtil.smali`.
10. `views/Web.smali` — new field `activeInput:InputConnection` + `getActiveInput()`. Rewrite `onCreateInputConnection`: mode 0 → `super`; mode 3 → `null`; modes 1/2 → capture `super.onCreateInputConnection(...)` into `activeInput`, call `listener.onKeyboard(true, mode)`, return `null`. Add `onFocusChanged` override → on focus loss, `listener.onKeyboard(false, 0)`.
11. `views/WebView.smali` (browser panel) — **safe child-indexing strategy (verified):** every child iteration already guards `instanceof Web`, and `currentWeb` is always `childCount - 1` after appending a Web. So inflate `layout_kbd`, `addView(kbdBar, 0)` **at the very start of `onCreate()`** (index 0, GONE, `RelativeLayout.LayoutParams(-1,-2)` + `ALIGN_PARENT_BOTTOM`) — Web indices stay intact. New `WebView$kbdClick$1` (OnClickListener): current web's `getActiveInput()` → tag `back` = `deleteSurroundingText(1,0)`, `enter` = `commitText("\n",1)`, `space` = `commitText(" ",1)`, else `commitText(tag/text,1)`. Implement `onKeyboard(show, mode)`: show/hide `kbdBar`; mode 2 → paste button only, else rows. Hide bar in `onDestroy()`/`pause()`.

**Known risk:** returning null from `onCreateInputConnection` is the standard way to suppress WebView's IME, but the *previous* bug shows WebView can fight back. Fallback if sticky-IME recurs on device: return a no-op `BaseInputConnection(this,false)` instead of null. Verification on device is the user's step (no SDK here).

## Goal 2 — Random internet loss + restart button

**Root cause (investigated):** No connectivity handling exists anywhere. `Web$1.onReceivedError` → `ListenerWeb.onError(url)` → `WebView.onError` is an **empty no-op**, so when a transient network drop (Wi-Fi re-association, data switch, captive-portal validation) makes the WebView show its stock error page, nothing ever reloads when connectivity returns. Ad-blocking (`AdBlock.isAd` in `shouldInterceptRequest`) only filters ad hosts — not the cause.

**Fix A (guaranteed — also covers Goal 3's "restart needed" case):** Restart-bubble button:
- `BubbleService.smali`: add `ACTION_RESTART_BUBBLE` to `declareReceiver()` filter; `argsBubble$1.onReceive` → new `access$restartBubble`. New private `restartBubble()`: `mHandler.post { closeAllViews(); declareReceiver(); startService(Intent(this, BubbleService).setAction(ACTION_START_ONLY_BUBBLE)) }`. (`closeAllViews()` already removes both windows, destroys panels, resets `isStarting`; it also unregisters the receiver, and `declareReceiver()` is only called from `onCreate`, so re-register explicitly.)

**Fix B (recommended bonus — the cure, not just the workaround):** auto-reload when the network comes back. New small class `WebView$network$1 extends ConnectivityManager.NetworkCallback`, registered in `WebView.onCreate` (`registerDefaultNetworkCallback` on API 24+, `registerNetworkCallback(new NetworkRequest.Builder().build())` fallback for 23), unregistered in `onDestroy`; `onAvailable` → post to main handler → reload current Web (guarded `instanceof`). Can be dropped without affecting anything else.

## Goal 3 — Transparency real-time compatibility

**Root cause (hypothesis, supported by crash-logs showing realme/ColorOS):** `applyAlpha()` uses `View.setAlpha` on the overlay window roots. Some OEMs don't composite view-level alpha on `TYPE_APPLICATION_OVERLAY` root views (no layer promotion), so the value only "sticks" after a full window rebuild.

**Fix:** extend `applyAlpha()` to also set window-level alpha, composited by SurfaceFlinger → works on every device:
- `mViewParams.alpha = a; mWindowManager.updateViewLayout(mView, mViewParams)`
- `mViewManagerParams.alpha = a; mWindowManager.updateViewLayout(mViewManager, mViewManagerParams)`
- Keep the existing `setAlpha` calls; guard `updateViewLayout` with `isAttachedToWindow()` + try/catch. Call sites (broadcast from slider, `onStartCommand` branches) unchanged. Built-in keyboard inherits this automatically (it lives in the manager window).

## Goal 4 — "App not responding" warning (insight + optional fix)

**Insight:** Crash1.txt/Crash2.txt are both *"A foreground service of FOREGROUND_SERVICE_TYPE_SHORT_SERVICE did not stop within a timeout"* — Android 14 enforces ~3 min for `shortService`; the manifest declares `foregroundServiceType="shortService"` and `BubbleService` calls `startForeground` (line 4543) without ever stopping. The main thread is idle in both dumps (`epoll_pwait`) → **not a real ANR**; it's the short-service deadline, which is why "dismiss" makes it go away and the app keeps working.

**Optional 2-line fix (recommended, reversible):** manifest → `foregroundServiceType="specialUse"` + `<property android:name="android.app.PROPERTY_SPECIAL_USE_FGS_SUBTYPE" android:value="floating_bubble_overlay"/>` (no timeout; bit ignored on API < 34). Include unless you prefer to leave it.

## Verification & commit
1. Rebuild: `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk` (assembler + aapt2 catch every smali/XML typo).
2. Re-read each modified method vs JADX reference; check register usage per the post-mortem rule.
3. `git commit` (repo style, e.g. `[STABLE] Keyboard modes + bubble restart + window-level alpha`), and add a spec/plan doc under `docs/superpowers/` per repo convention.
4. On-device verification is yours (rebuild is unsigned / signature differs — uninstall first); I'll flag anything that needs a device test.

## Out of scope / notes
- No signing tools in this workspace (knowledge.md) — I rebuild; you sign/install.