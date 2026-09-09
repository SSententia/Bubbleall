# Fixing the 6 reported bugs (v12.1) — implementation plan

Reads as: [severity] bug → root cause in smali → fix. All paths under `APKtool/`.

## Verified root causes

### 1. Restart button dead
`AddView$listenerConfig$1$4.onClick` → `sendBroadcast(ACTION_RESTART_BUBBLE)` →
`argsBubble$1.onReceive` → `restartBubble()` → `stopSelf()` + 500 ms later
`Companion.start()`.
Killer chain:
- `restartBubble()` posts the start runnable **after** `stopSelf()` is enqueued;
  `onDestroy()` runs on the main looper and calls `closeManager()` (async 300 ms
  animation → `closeAllViews()` → `unregisterReceiver`) *after* the 500 ms
  start fires, so the new instance's receiver registration is unregistered by
  the old instance's teardown (`argsBubble` is a per-instance field but the
  unregister happens post-start).
- `onCreate()` sput-bool `isStarting=true` while `Companion.start()` also
  toggles it — a stale flag makes the next `start()` call *stop* the service.
- On API 26+, starting a service that was just stopped from background context
  can hit `IllegalStateException` (not caught → service dead).
Fix: restart in place. New private method `restartInPlace()`:
1. `mHandler.removeCallbacksAndMessages(null)`
2. if manager attached: `mWindowManager.removeView(mViewManager)`; `isInitManger=false`
3. if `mView` attached: `mWindowManager.removeView(mView)`
4. for each `panels` entry: `mPanelManager.destroy(resId,id)`; `mPanelManager.removeView(resId)`
5. `panels.clear()`
6. unregister `argsBubble` in try/catch
7. reset to a clean instance: `isInitManger=false`, `isOpenManager=false`,
   `adapter=null` (via reflection-free `iput-object`), re-call `declareValues()`
   (fresh `mViewParams`, `mViewManagerParams`, `mInflater`, `mHandler`),
   re-register receiver, `sput isStarting=true`
8. re-run the `onStartCommand` body with a null intent — replicated as new
   method `startUp()` invoked from both `onStartCommand` and `restartInPlace()`
   (null action → falls into the manager path, same as normal boot).
Delete: `restartBubble()`, `BubbleService$restartBubble$1`, the
`ACTION_RESTART_BUBBLE` branch in `argsBubble$1`, the filter action in
`declareReceiver`, and the broadcast from `AddView$listenerConfig$1$4`
(replace with a direct `BubbleService` static-handler call).
Keep `setStarting(false)`/`Companion.start()` semantics untouched for normal
start/stop flows.

### 2. Keyboard bar shows on every browser open
`WebView.start()` (and `onLoaded`) unconditionally call `showKeyboardBar()`.
Fix: `showKeyboardBar()` early-returns unless the active `Web` reports an
active editable element. Polling via `evaluateJavascript` on a 300 ms handler
(`mFieldFocused:Z` set from the JS result). JS one-liner:
`!!(document.activeElement&&(document.activeElement.tagName==='INPUT'||document.activeElement.tagName==='TEXTAREA'||document.activeElement.isContentEditable))`
Result parsed via `ValueCallback` lambda (`WebView$$ExternalSyntheticLambda3`,
new) → `access$setFieldFocused`. Only fires `showKeyboardBar()`/`hideKeyboardBar()`
on a state flip. Poll runs only while `keyboard_mode` is 1 or 2 and the
browser is the active panel; cleared in `pause()`/`onDestroy()`.
`Web.insertText/deleteText/enterText` unchanged (they're no-ops when nothing
is focused, so stale clicks are harmless).

### 3. Keyboard layout unconventional
`layout_window.xml` keyboardBar rows → Gboard-style:
- Row1: `123` toggle + `qwertyuiop` + backspace
- Row2: `asdfghjkl` + enter
- Row3: shift + `zxcvbnm` + backspace… (standard Gboard: shift is row3-left,
  backspace row1-right)
- Row4: `?123` + `,` + space(weight 4) + `.` + enter
Chips: `keyboardShift`, `keyboard123` (new ids in `ids.xml` + `public.xml` +
`R$id.smali`).
`WebView$keyListener$1` additions: `#shift` toggles a static `sShiftState`
field and re-labels letter keys (uppercase text); `#123` swaps letter rows
for a digit/symbol row (two prebuilt rows toggled by visibility, or simpler:
tag swap `q→1` etc. — **chose**: two extra rows `keyboardRow7/8` hidden by
default, toggled by `#123`, letters hidden).

### 4. Transparency slider not real-time
`modifyBubble()` throws NPE in bubble-only start (`mViewManager` late-init
accessed unconditionally after the size switch).
Fix: `modifyBubble()` — wrap `adapter.notifyItemRangeChanged` in
`if-eqz adapter` guard; guard `mViewManager`/`mPanelManager` blocks with
null checks. Also `applyAlpha()` is fine — verify it's called on
`ACTION_MODIFY_BUBBLE` even when manager is null (it is; already
null-guarded).

### 5. Mode switch doesn't hide/show system keyboard
`applyAlpha()` sets/clears `FLAG_ALT_FOCUSABLE_IM` but:
- never hides the currently-open IME when switching to 1/2/3
- never clears WebView focus
Fix in the `:cond_2` branch of `applyAlpha()` after the flag write, when
`keyboard_mode != 0` and flag changed: hide IME via
`getSystemService(InputMethodManager).hideSoftInputFromWindow(mViewManager.getWindowToken(), 0)`
+ `mPanelManager.clearFocus()` (guarded).
When switching to 0 and the manager is attached: no action needed (window
becomes IME-target again automatically on next field tap).

### 6. New tab breaks keyboard mode
`WebView.addButton$lambda$8` (new-tab) calls `pause()` which hides the bar
and stops polling, then builds a new `Web` but never restarts polling.
Fix: after `loadUrl(...)` in `addButton$lambda$8`, call
`showKeyboardBar()`-equivalent state reset — the polling loop restarts
automatically since it checks mode 1/2 each tick; root cause is `pause()`
stopped it and the new-tab path never resumed it. Add the poll-restart call.

## Rebuild + verify
- `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o <out>.apk` after
  each phase; check smali register counts in every touched method
  (post-mortem rule: reload p0/p1 into locals before use after writes).
- Commit style: `[STABLE] …` per repo convention.
- On-device test matrix from plan.md Phase 8 (user step).

## Implementation status (2026-09-06) — ALL PHASES DONE, APK BUILT

Deviations from the plan above (all simplifications, same outcome):
- **Restart (bug 1)**: instead of a `startUp()` replication of the 500-line
  boot body, `onStartCommand` itself detects `ACTION_RESTART_BUBBLE` at its
  top, runs an idempotent in-place teardown (the new `restartBubble()`),
  nulls the intent, and **falls through to its normal boot path**. The
  button (`AddView$listenerConfig$1$4`) calls `startService()` with that
  action — allowed, since the service is a foreground service. No
  `stopSelf`, no delayed runnable, no broadcast receiver.
  Deleted: `BubbleService$restartBubble$1.smali`, the restart branch in
  `argsBubble$1`, and the filter action. `restartBubble$1` accessor stays
  (harmless, unreferenced at runtime).
- **Keyboard poll (bug 2/6)**: JS-polling implemented via two new inner
  classes `WebView$focusPoll$1` (200 ms timer posting `focusPoll`) and
  `WebView$focusResult$1` (flips keyboard-bar visibility). Started in
  `start()`, stopped in `pause()`/`onDestroy()`, restarted after new-tab in
  `addButton$lambda$8`. (Note: an earlier draft posted the WebView itself
  as the Runnable — fixed to post the poll runnable.)
- **Mode switch IME hide (bug 5)**: new `hideSystemIme()` helper called
  from `applyAlpha()` when mode ≠ 0.
- **Layout (bug 3)**: full QWERTY rows + `?123` numeric row
  (`keyboardNumRow`, hidden by default; toggled with `keyboardShift` /
  `keyboard123` in `WebView$keyListener$1`). aapt2 escaping notes: `<`
  must be `&lt;`, `"` must be `&quot;`, and a literal `?123` text must be
  written `\?123` (otherwise parsed as a theme-attr reference →
  `resource attr/123 not found`).

Build result: `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o
bubbleall-patched.apk` → **BUILD OK** (smali assembled = register/opcode
validation passed; new symbols `restartInPlace`, `hideSystemIme`,
`focusPoll` confirmed present in built `classes.dex`).

## Post-crash fixes (2026-09-06, Crash-B-1)
First install crashed with `java.lang.VerifyError: ... modifyBubble()
failed to verify: copy-reference v0<-v1 type=Undefined`. Three verifier
bugs found and fixed - the smali assembler does NOT catch these; only the
on-device verifier does:
1. **`modifyBubble()`** (the crash itself): the Phase-2 null-guard removed
   the original `const/4 v1, 0x0` but the three Kotlin-lateinit fallbacks
   (`move-object v0, v1` after `throwUninitializedPropertyAccessException`)
   still read v1 -> undefined register. Fix: re-add `const/4 v1, 0x0` at
   the top of the method.
2. **`WebView$keyListener$1.toggleShift()`** (would have VerifyError'd on
   first shift tap): `const/4 v0, 0x1` clobbered v0 (the keyboard-bar
   ViewGroup still live in the outer loop). Fix: `.locals 7->8`, length
   compare now uses v7.
3. **`WebView$focusPoll$1.run()`** (runtime leak, not a verifier bug):
   requeued itself on a *new* Handler each tick, so `stopFieldPoll()`'s
   `removeCallbacks` on a different Handler never cancelled it -> poll ran
   forever after the panel closed. Fix: new `fieldPollHandler` (shared,
   created in WebView `<init>`) + `fieldPollStop` flag checked at the top
   of `run()` and before requeueing; `startFieldPoll()` resets the flag
   and cancels pending posts.
Also hardened `WebView$focusResult$1.onReceiveResult` against a null
result (WebView destroyed mid-callback -> NPE).

Signing still required before install (apksigner/zipalign not installed).
Use the debug keystore at `C:\Users\Pankaekz\.android\debug.keystore`
(`android`/`android`); signature differs from the Play version, so
uninstall the old app first.

## Post-crash fix 2 (2026-09-06, Crash-B-2)
`VerifyError: WebView.addButton$lambda$8 failed to verify: 'this' argument
'java.lang.String' not instance of 'WebView'` when starting the bubble.
Cause: the Phase-6 poll-restart call at the tail of `addButton$lambda$8`
used `p0` as receiver, but `p0` is reassigned to the page-URL String
(`move-result-object p0` after `getString("page_web")`) and both branches
merge at `:goto_1` -> verifier sees a String receiver.
Fix: `.locals 7->8`; WebView saved to v7 at method entry; the
`startFieldPoll()` tail call now uses v7.
Verified after the fix (static audit): all downstream consumers of the
nulled restart intent in `onStartCommand` (`animationStart$lambda$14`,
`animationStart$1$3.onAnimationEnd$lambda$1`, `requestArgsBubble`,
`preparePanel`) null-check the intent before use, so the restart path is
safe at runtime.

### Crash B-3 (IllegalAccessError opening the browser panel)
`WebView.fieldPollStop`/`fieldPollHandler` were declared `private` but read
directly by inner class `focusPoll$1`. Smali assembly does not enforce Java
access rules, but ART does at runtime -> `IllegalAccessError` the first time
the poll runnable ticked (browser panel open).
Fix: both fields changed to `public`. (`fieldPoll` was already public;
`currentTab()`/`onFieldFocusResult()` are public methods, no other access
paths cross the class boundary.)

### Crash B-4 (IllegalArgumentException on quick start/stop, and the 3 legacy
minor crashes Crash1/Crash2-style 'View not attached to window manager')
`closeAllViews()` calls `removeView()` unconditionally; when the service is
stopped before the windows were ever attached (start bubble then stop
immediately), WindowManagerGlobal throws
`IllegalArgumentException: View not attached to window manager` inside
`onDestroy`, killing the process.
Fix: all three removal points in `closeAllViews()` (main view, per-panel
destroy/removeView, manager view) wrapped in try/catch Exception - teardown
is now best-effort. This also hardens the in-place restart path, which runs
the same teardown.
Note: Crash1.txt/Crash2.txt are ANR/CPU-pressure dumps from the OLD install
(UID 10341) with no Java stack trace - not addressable via smali; B-4's fix
removes the attach-order class of crash that likely contributed.

### Crash B-5 (AbstractMethodError when the browser page finishes loading)
`WebView$focusResult$1` implements `android.webkit.ValueCallback` but both of
its methods were misnamed `onReceiveResult` (the Kotlin/`ResultReceiver` name)
instead of `onReceiveValue` - so the interface's abstract method was never
implemented. Chromium invokes the callback via the interface method when
`evaluateJavascript` delivers its result -> `AbstractMethodError`.
Timing explained the confusion: on a fresh browser the page must finish
loading first (white screen, then crash); on an already-loaded tab the result
delivers immediately.
Fix: renamed both methods to `onReceiveValue`. Confirmed no other references
to the old name exist in the app's smali.

### Taps between keyboard keys reach the WebView (user report, post-B-5)
The keyboard bar is a FrameLayout child stacked over the browser panel; keys
are TextViews separated by 2dp margins. Taps landing in gaps/margins were
dispatched down through the bar into the WebView, clicking page content and
stealing field focus. Fix: `android:clickable="true"` on the keyboardBar
container and all 7 row containers (rows 1-6 + keyboardNumRow) so they
consume touches instead of passing them through. Key TextViews keep their
own listener; other bar interactions unchanged.
NOTE: first attempt placed the attribute OUTSIDE the tags (stray text; aapt2
ignored it silently and built anyway) - corrected placement verified
(`<LinearLayout android:clickable="true" ...>` inside the tag, 8 containers).

## Round: keyboard UX improvements (post-stabilization)

- **?123 toggle now fully works**: the number row AND the previously orphaned symbol row both toggle (the symbol row was in the layout but never wired into `toggleSymbols`).
- **Symbol row enriched**: added `. , ? ! ' # % * + =` alongside the original `- / : ; ( ) & @ "` (some of these were untypeable before).
- **Keyboard-dismiss key**: new `⌄` key on the bottom row (tag `#hide`) calls `dismissKeyboardBar()` — blurs the page so the poll keeps the bar hidden until the next focus.
- **Bottom-of-page fields**: the focus poll now scroll-into-views a focused field when it sits within 240 px of the viewport bottom, so the bar no longer covers it.
- **Menu/tab-strip overlap**: the poll JS now returns a tri-state (0 field / 1 no field / 2 overlay-open); `onFieldFocusResult(I)` became a small state machine so the bar hides while the browser menu or tab strip is open and returns automatically on close. The poll is no longer stopped in `pause()` (that was also why a fresh tab could lose the bar until re-focus).
- **Tab-strip reselect**: reselecting a tab after closing one (swipe path, `onRemove`) now restarts the focus poll.
- Tab persistence across restarts: no code change — the app already has it under Settings → Browser → "Open pages" (default off); user will enable it.

## Round: user retest follow-ups (2026-09-08)

- **?123 reverts after ~300 ms**: the poll's state machine called `showKeyboardBar()` every tick, and that method forced row visibility on each call, wiping the toggle. Fix: `onFieldFocusResult(I)` now only calls `showKeyboardBar()` on the *transition* into the focused state (`fieldFocused` doubles as "bar visible"), and `showKeyboardBar()` early-returns while the bar is already visible. `pollState` keeps the raw last poll result.
- **`#hide` key pasted "#hide"**: its dispatch block was dead code — the `#123` branch jumped straight to `:cond_3`, so the `#hide` tag fell through to `insertText()`. Fix: `#123` now jumps to `:cond_2h` when it doesn't match.
- **Symbols row cramped / missing math keys**: split into two rows — `keyboardRow5` (16 punct keys, fixed the `(`→`)` tag typo) and new `keyboardRow7` (id `0x7f0902b8`, added to ids.xml/public.xml/R$id) with `! # % * + = √ × ÷ < >`. Both rows are type-2 (toggled by ?123) in `showKeyboardBar()` and both flip in `toggleSymbols()`.
- **Bottom-anchored field unreachable**: instead of only scrollIntoView, the visible-bar JS now adds `document.scrollingElement.style.paddingBottom='280px'` (mimics the system IME resizing the viewport); the bar-hidden JS and `stopFieldPoll()` clear it. scrollIntoView only runs while the bar is actually shown.
- **Bar persists over menu/tab strip/Add/Settings**: the poll now checks `WebView.getVisibility()`, `currentTab()` visibility and `isShown()`; when the browser panel isn't shown it feeds state 2 (hide bar, keep polling) — covers every panel and overlay without new plumbing.
- **Bubble vs opened-bubble opacity difference (root cause found)**: `applyAlpha()` ran at boot, before `mViewManagerParams` existed, so the manager window never received the user's window alpha; the closed bubble did. Fix: `open$lambda$6` calls `applyAlpha()` right after the manager window is attached.
- **App vanishing / broken bubble with other apps open**: this is the OS killing the backgrounded service process (bubble-only apps are prime targets; no crash log because it's an LMK kill, not a Java crash). `onStartCommand` returns `START_STICKY`-equivalent and the service calls `startForeground()`, but OEM (ColorOS) aggressive killing can still end it. Advise the user to enable "Lock" / "Allow auto-start" / battery-optimization exemption for BubbleAll in system settings — not fixable purely in smali.

Build: OK (fixed a duplicated-label assembly error in focusPoll$1 left by a partial edit). New symbols verified in built dex + resources.
