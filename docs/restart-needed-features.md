# Features that currently require a bubble restart — handoff for Modification C

**Context.** This project patches `com.alexmanzana.bubbleall` (decompiled smali in
`APKtool/`, rebuilt with apktool into `bubbleall-patched.apk`). The 2026-09-06
modification (plan: `docs/superpowers/plans/2026-09-06-fix-reported-bugs.md`)
fixed 6 reported bugs and made the **Restart button** work reliably: it now
calls `startService(ACTION_RESTART_BUBBLE)`, `onStartCommand` runs an in-place
teardown (`restartBubble()`) and falls through to the normal boot path in the
same service instance. Restart is the *fallback mechanism* this document aims
to retire for the features below.

**How live config is supposed to work.** Config UI (AddView) writes values to
SharedPreferences (`bubble_data_prefs`) and broadcasts
`com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE`. The service receiver
(`BubbleService$argsBubble$1`) invokes `modifyBubble()`, which ends by calling
`applyAlpha()`. Both methods were hardened during the 2026-09-06 session
(null-guards so they survive bubble-only mode). The gaps below are about
*what those methods do not update*, not about them crashing.

**Device tested on:** realme RMX3933, Android 14. Quirks observed by the user
on-device; root causes verified in smali unless marked *hypothesis*.

---

## 1. Transparency (alpha slider)

**Expected:** dragging the slider changes bubble/panel transparency in real time.
**Actual (v-patched):** applies live in bubble-only mode after our
`modifyBubble()` fix, but on this phone a restart is still required in the
general case (e.g. manager window open). User classification: needs restart.

**What the code does today (`applyAlpha()` in `BubbleService.smali`):**
- reads `theme_alpha` (0–255) from `bubble_data_prefs`;
- `setAlpha()` on `mBubble` / `mViewManager` views (null-guarded);
- writes `WindowManager.LayoutParams.alpha` on the bubble and manager windows
  and calls `updateViewLayout()` — but only `if (view.isAttachedToWindow())`.

**Quirks**
- If a window is not yet attached when the slider moves (first seconds after
  boot, or bubble-only start where the manager window does not exist), the
  window-level alpha is silently skipped. View-level alpha is applied, but the
  two compose oddly until restart.
- *Hypothesis (OEM):* on realme/OPPO Android 14, `LayoutParams.alpha` changes
  via `updateViewLayout()` on a system-alert window sometimes don't take
  visually until the window is re-added (`removeView` + `addView`). If the
  slider "does nothing until restart" even with windows attached, this is the
  reason — it cannot be fixed by calling `updateViewLayout` harder.

**Candidate fixes (Modification C)**
1. Track a `pendingAlpha` boolean; when a view finishes attaching
   (`View.OnAttachStateChangeListener` or after `addView` in the boot path),
   re-run `applyAlpha()` so nothing is skipped at attach time.
2. If updateViewLayout proves unreliable on this ROM: on alpha change, do a
   cheap in-place re-add of the affected window (remove + add with same
   params) instead of a full service restart. Reuses the teardown guards
   added in `closeAllViews()`.
3. Fallback: make the config UI show "will apply on restart" state explicitly
   (UX mitigation only).

---

## 2. Keyboard-mode switch: system-keyboard mode → non-system mode

**Expected:** switching `keyboard_mode` (system IME ↔ built-in keyboard bar ↔
paste mode) applies immediately; the system keyboard must disappear when
leaving system-keyboard mode.
**Actual:** needs a restart, *except* our fix already hides the IME when the
switch happens with windows alive — but the reverse direction and fresh-boot
case still misbehave (see quirks). User classification: needs restart.

**What the code does today:**
- `applyAlpha()` toggles `FLAG_ALT_FOCUSABLE_IM` (0x20000) on the **manager
  window only**, then, when `keyboard_mode != 0`, calls `hideSystemIme(0)`
  (clears WebView focus + hides IME via `InputMethodManager`).
- The built-in keyboard bar visibility is driven by the focus poll
  (`WebView$startFieldPoll`, 300 ms) which only runs while mode ∈ {1, 2}.

**Quirks**
- **System keyboard still shows when starting Built-in/Paste directly.** At
  boot, `applyAlpha()` runs *before* the windows/WebView exist, so the flag
  write and IME hide are skipped for that session; the IME pops when the user
  focuses a field. Restart "fixes" it because by then windows exist and the
  flag applies. Fix (independent of restart work): call `hideSystemIme()` and
  re-apply the flag after the WebView panel attaches / first field focus.
- **Flag change may not propagate on an already-attached window** on this OEM
  (same *hypothesis* as transparency): some ROMs ignore `flags` changes via
  `updateViewLayout` and only honor them at `addView` time. If so, switching
  modes live can't work by flag update alone — the window must be re-added.
- **Direction asymmetry:** leaving system-keyboard mode hides the IME (our
  fix), but *entering* system-keyboard mode from Built-in requires the IME to
  be allowed again — the flag clear happens, yet an already-visible built-in
  bar plus focus state can leave the panel in a mixed state until restart.

**Candidate fixes**
1. Re-apply flag + alpha on window attach (fixes the fresh-boot quirk; small
   change, do it first).
2. On mode change with a live manager window: re-add the window with new flags
   instead of `updateViewLayout` (guard with the try/catch pattern from
   `closeAllViews()`).
3. On entering system-keyboard mode: show the built-in bar down, clear poll,
   and explicitly `showSoftInput` on the focused field if one exists.

---

## 3. Bubble size (pre-existing app behavior, not from our patch)

**Expected:** changing the size option resizes the floating bubble live.
**Actual:** needs a restart. User classification: needs restart (pre-existing
bug in the original app).

**What the code does today:**
- `modifyBubble()` only swaps the bubble's **background drawable**
  (`ic_bubble_small` / `_medium` / `_big`) based on `BubblePrefs.getSizeBubble()`.
- The actual **window geometry** (bubble layout params / view size) is computed
  in the boot path (`onStartCommand` → inflate section, around
  `BubbleService.smali:4950-4990`) — it reads `getSizeBubble()` once and sizes
  `mBubble` / `mViewParams` accordingly.

So a size change updates the icon but not the window; only a restart (which
re-runs the boot path) resizes it.

**Candidate fixes**
1. Extract the boot-path "size the bubble" block into a helper
   (`applyBubbleSize()V`) and call it from `modifyBubble()` — the same
   refactor-and-share pattern used for `applyAlpha()`. Then
   `updateViewLayout(mView, mViewParams)` with the new width/height.
2. Keep the null-guards so bubble-only mode stays safe (mirror the
   `modifyBubble()` guard pattern).

---

## 4. Restart itself (the current workaround — working)

Not a quirk to fix; recorded so Modification C doesn't regress it.
- Button → `startService(ACTION_RESTART_BUBBLE)` → `onStartCommand` detects the
  action, runs `restartBubble()` (idempotent teardown: cancel handler
  callbacks, remove attached windows, destroy panels) and falls through to
  normal boot. No `stopSelf`, no delayed runnable, no broadcast.
- The teardown try/catches every `removeView` (fix for crash B-4), so quick
  start/stop and restart-before-attach are safe.
- All downstream consumers of a possibly-null restart intent null-check it
  (verified statically in the 2026-09-06 session).

---

## Cross-cutting lessons for Modification C

1. **Smali does not validate runtime contracts.** The 2026-09-06 session hit
   three classes of build-fine-but-crash-at-runtime bugs:
   - `VerifyError` from registers read before assignment / register type
     merges across branches (`modifyBubble`, `addButton$lambda$8`,
     `toggleShift`);
   - `IllegalAccessError` from an inner class reading a `private` field
     (`fieldPollStop` → made `public`);
   - `AbstractMethodError` from an interface method implemented under the
     wrong name (`onReceiveValue` vs `onReceiveResult`).
   When patching smali: save the receiver into a fresh local when the
   original code reuses a register for another type; make any field an inner
   class touches `public`; and check the exact interface method name in the
   framework before implementing it.
2. **Guard every `removeView`/window op with try/catch + `isAttachedToWindow()`**
   — window state and service state desync easily on fast interactions.
3. **Boot-time settings application is order-dependent.** Anything applied in
   `applyAlpha()`/boot before views attach is silently lost for that session;
   the systematic fix is a re-apply on attach (fix candidate #1 above, shared
   by transparency and keyboard mode).
4. **`?123` key label quirk:** in XML resources, a leading `?` is parsed by
   aapt2 as a theme attribute reference — escape as `\?123`.
5. The user's device is Android 14 (realme). If `updateViewLayout` proves
   unable to change alpha/flags live, prefer remove+add of the window over
   fighting the OEM behavior.

## Suggested order of work for Modification C

1. Re-apply alpha/flag on window attach (kills the fresh-boot IME quirk and
   part of the transparency quirk; smallest change, most impact).
2. Extract `applyBubbleSize()` and call from `modifyBubble()` (size live).
3. Live window re-add for alpha/flag changes if (1) is insufficient on-device.
4. Enter-system-keyboard-mode cleanup (bar down, poll stop, IME allow+show).

## Open items from on-device testing (as of 2026-09-06)

- Refresh button: works.
- Restart button: works (workaround of choice until Modification C).
- Built-in keyboard: taps between keys no longer leak into the WebView
  (post-fix); verify again after next rebuild.
- System keyboard on Built-in/Paste at fresh start: known quirk, documented
  above (#2).
- Network-stability error (rare): untestable locally; revisit only with a
  stack trace.
