## Audit result

The commit includes the planned resources, keyboard modes, restart action, receiver-registration fix, alpha updates, JS text-entry methods, and network callback. The APK rebuild reportedly succeeds.

However, several requirements are not fully implemented:

- **Restart is wired but unreliable:** it stops the service and schedules `startService()` from a delayed callback. Android background-service restrictions and overlapping `onDestroy()` animations can prevent the restart or leave stale windows.
- **Built-in keyboard visibility is wrong:** `WebView.start()` shows it whenever the browser panel starts, regardless of whether an HTML field is focused.
- **Keyboard overlays content:** `keyboardBar` is drawn as a sibling over a full-height content layout. No bottom inset, resize, or translation is applied.
- **Keyboard layout is not conventional:** it has separate digit/letter rows and places space, delete, and enter together at the far left.
- **Mode changes are incomplete:** changing `keyboard_mode` updates the window flags, but does not consistently refresh keyboard-bar state, hide an already-visible system IME, or restore the IME when switching back to mode 0.
- **New-tab lifecycle is incomplete:** `addButton` calls `pause()`, which hides the bar, then creates a new `Web` without reapplying keyboard state. This directly explains Built-in/Paste disappearing after opening a tab.
- **Transparency has a remaining crash path:** `ACTION_MODIFY_BUBBLE` calls `modifyBubble()`, which assumes `adapter`, `mBubble`, `mViewManager`, and `mPanelManager` exist. Bubble-only startup can reach this path before all fields are initialized.
- **Network recovery is too broad:** every WebView error can register a callback, including subresource errors; reconnect behavior is not debounced or restricted to main-frame/network-loss errors.
- **Generated build artifacts are committed:** the modified binary files under `APKtool/build/` should be reviewed against repository conventions before the next commit.
- **On-device verification was not possible:** Android-MCP reported `devices: []`; all behavioral conclusions above are static/code-based.

## Prioritized implementation plan

### Phase 1 — Make service restart deterministic

1. Replace the static `isStarting` toggle as the source of truth with an explicit restart state.
2. On restart:
   - cancel pending restart callbacks;
   - close/remove manager and bubble windows synchronously or through a completion callback;
   - unregister receivers and stop foreground state cleanly;
   - start the service using `startForegroundService()` on API 26+ and `startService()` below it;
   - call `startForeground()` immediately in `onStartCommand()`.
3. Make `onDestroy()` idempotent:
   - check whether each window is attached before removing it;
   - avoid starting a normal close animation during service shutdown;
   - unregister the receiver exactly once.
4. Send the restart broadcast explicitly to the app package, or replace the broadcast with a direct service command if feasible.

**Acceptance criteria:** tapping Restart visibly closes and recreates the bubble on Android 14/ColorOS, whether the manager is open, closed, or showing a browser tab.

---

### Phase 2 — Centralize keyboard-mode state

Create one service/WebView path that applies the current mode consistently:

- mode 0: remove `FLAG_ALT_FOCUSABLE_IM`, hide built-in bar, allow system IME;
- mode 1: set the flag, show built-in bar only when a field is focused;
- mode 2: set the flag, show only Paste when a field is focused;
- mode 3: set the flag, hide the bar, suppress the IME.

Call this path after:

- mode-chip selection;
- opening the browser;
- creating a tab;
- switching tabs;
- closing the tab list;
- resuming a browser panel;
- loading a page;
- restoring the manager after pause.

When switching away from mode 0, explicitly hide the current system IME and clear any stale focus. When switching back to mode 0, restore focus to the active WebView without automatically opening the keyboard until an HTML input receives focus.

**Acceptance criteria:** switching between all four modes works without restarting the bubble and does not require visiting Home first.

---

### Phase 3 — Show the built-in keyboard only for focused HTML fields

Use page-level focus notifications rather than `WebView.start()`:

1. Inject a small script after each page load that listens for `focusin` and `focusout`.
2. Notify the native `Web` view through a tightly scoped JavaScript bridge or equivalent page-focus mechanism.
3. Only show Built-in/Paste controls when:
   - the active element is an input, textarea, select-like editable control, or contenteditable element;
   - the active mode requires the custom bar.
4. Hide the bar on focus loss, tab changes, browser-panel pause, menu opening, and page destruction.
5. Preserve the active element/caret while tapping custom keyboard controls.

**Acceptance criteria:** opening a page does not show the bar; tapping a text field does; tapping ordinary page content hides it.

---

### Phase 4 — Reserve content space when the bar is visible

Keep the bar outside `WebView` to preserve tab indexing, but reserve its measured height:

1. Add a manager-level method that updates the content container’s bottom margin/inset from the keyboard bar height.
2. Apply the inset only while the bar is visible.
3. Clear the inset when the bar is hidden.
4. Set the manager window’s soft-input behavior appropriately for mode 0, likely `ADJUST_RESIZE` or equivalent compatible overlay behavior.
5. Ensure scrolling and focused fields remain visible above the custom bar.

**Acceptance criteria:** the focused field is not covered by the bar, and the browser moves or resizes similarly to the system keyboard behavior.

---

### Phase 5 — Replace the keyboard layout

Use a conventional compact layout:

- number/symbol row;
- `qwertyuiop`;
- `asdfghjkl`;
- Shift + `zxcvbnm` + Backspace;
- punctuation + a wide centered Space key + Enter;
- Paste as a separate action or toolbar key in Paste/Built-in modes.

Add support for:

- Shift/caps state;
- backspace;
- enter;
- space;
- paste;
- optional symbol/number switching.

Retain the existing JS insertion approach, but route all keys through one key model so layout and behavior cannot diverge.

**Acceptance criteria:** the keyboard visually resembles a standard mobile keyboard, with Space centered and common controls in expected positions.

---

### Phase 6 — Fix transparency safely

1. Keep the API 33+ `registerReceiver(..., RECEIVER_NOT_EXPORTED)` fix.
2. Make `modifyBubble()` null-safe and independent of manager initialization.
3. Apply alpha directly to:
   - the bubble view/window if attached;
   - the manager view/window if attached;
   - the keyboard bar through its parent/window inheritance.
4. Avoid calling `adapter.notifyItemRangeChanged()` when the adapter is not initialized.
5. Clamp the preference value to `0..255`.
6. Apply alpha once immediately after each window is attached, not only after a later broadcast.

**Acceptance criteria:** dragging the transparency slider changes the visible bubble and manager immediately, including bubble-only mode, with no restart.

---

### Phase 7 — Harden network recovery

1. Restrict recovery registration to main-frame load errors.
2. Confirm actual loss of validated connectivity before registering.
3. Debounce repeated errors and reconnect callbacks.
4. Reload only the affected/current tab once connectivity is validated.
5. Cancel callbacks and pending reloads on tab destruction and service shutdown.
6. Avoid reloading merely because a subresource or favicon failed.

**Acceptance criteria:** Wi-Fi loss followed by reconnection reloads the affected page once without duplicate reloads or unnecessary page refreshes.

---

### Phase 8 — Rebuild and verify

After each phase:

1. Rebuild with apktool.
2. Check smali register counts and branch labels.
3. Inspect the resulting dex for the new methods/actions.
4. Verify no unintended generated artifacts are included.
5. On a device, test this matrix:

| Area | Cases |
|---|---|
| Restart | manager open, manager closed, browser active, bubble-only |
| Keyboard | all four modes, mode switching without restart |
| Focus | page load, field focus, field blur, tab switch |
| Layout | long page, lower-page input, scrolling above bar |
| Input | letters, numbers, space, delete, enter, paste, caret in middle |
| Tabs | new tab, switch tab, close tab, return Home/browser |
| Alpha | low/high values, slider drag, manager and bubble |
| Network | offline load, Wi-Fi drop, reconnect, repeated errors |
| Stability | rotation, repeated open/close, service stop/start |

The next coding milestone should be **Phase 1 plus Phase 2**, because restart and mode lifecycle are foundational; the keyboard focus/layout work should follow once those state transitions are reliable.