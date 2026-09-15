# On-device debug session — 2026-09-14

Device: realme RMX3933, Android 14, 720x1600 @320dpi.
Build under test: `bubbleall-patched.apk` (installed 2026-09-09, versionName 12, uid 10361).
Harness: Freebuff with vision over ADB (screencap → pull → embed as base64 HTML → preview →
screenshot). Vision and visual tapping were both verified working before this session.

Method: `screencap`/`pull` + Pillow crops for precise coordinates, `dumpsys window` for
authoritative window geometry, `logcat` + `dumpsys activity services` for framework state.

---

## 1. What was verified as working

| Thing | Evidence |
|---|---|
| Vision through ADB | Blind image test read back exactly; launcher tap chosen from a zoomed crop opened the intended app. |
| Bubble tap opens the manager | Tap at the bubble's visual centre produced a new `type=2038` overlay window that took input focus, and `BubbleService.open$lambda$6` ran. |
| **Restart bubble (our fix)** | Tap on the config UI's restart icon: same pid (16338, no process kill), `lastActivity=-7.8s` on the same `ServiceRecord` (in-place, not a stop/start), old windows removed and new overlay windows added, input focus released cleanly to the launcher. No crash, no log error. **B-1..B-5 hold up on device.** |
| Size preference persists | Tapped "Big" in MainActivity → survived an app restart. |

Correction of an earlier note in this repo: the bubble was *not* clipped. Pixel-level row scan
gave a circle spanning x=0..89 with symmetric rows above/below the equator (90x90 px for
"Small"). It is positioned flush against the left screen edge, which only *looks* cut.
Also: the old "taps on the bubble don't land" observation did not reproduce — it was almost
certainly the ANR-wedged state described below (bug A), not a touch-target problem.

---

## 2. Bug A (critical) — the app ANRs and is demoted because it declares a SHORT_SERVICE foreground service

### Evidence

ANR dialog on screen, read visually: *"BubbleAll tidak meranggapi"* with
*Tutup aplikasi* / *Tunggu*.

```
E/ActivityManager: Short FGS timed out: ServiceRecord{65a28c6 u0 com.alexmanzana.bubbleall/.BubbleService}
E/ActivityManager: Short FGS procstate demoted: ServiceRecord{...}
E/ActivityManager: Short FGS ANR'ed: ServiceRecord{...}
E/ActivityManager: ANR in com.alexmanzana.bubbleall
E/ActivityManager: Reason: A foreground service of FOREGROUND_SERVICE_TYPE_SHORT_SERVICE did not
                   stop within a timeout: ComponentInfo{com.alexmanzana.bubbleall/...BubbleService}
E/ActivityManager: ANR in com.alexmanzana.bubbleall ... 22% / 114% cpu ...
I/DropBoxManagerService: add tag=data_app_anr isTagEnabled=true
```

Framework state confirms it is structural, not a one-off:

```
isForeground=true foregroundId=4 types=00000800 ...
isShortFgs=true startId=1 startForegroundCount=1
startTime=-9m32s557ms timeout=-6m32s557ms demoteTime=-6m27s557ms anrTime=-6m22s557ms
```

`types=00000800` = `FOREGROUND_SERVICE_TYPE_SHORT_SERVICE` (0x800). The bookkeeping is
arithmetic: `timeout = startTime + 180s`, `demoteTime = timeout + 5s`, `anrTime = timeout + 10s`.
The service blew its budget 6.5 minutes before the dump and was still running in the
demoted/ANR state.

### The persistent record — 9 ANRs, 8 distinct ServiceRecords

logcat rotates, but DropBox keeps every ANR, so this is still readable: `dumpsys dropbox --print
data_app_anr` holds **9 BubbleAll ANRs** spanning 09-12..09-14, all nine carrying the identical
`Subject: A foreground service of FOREGROUND_SERVICE_TYPE_SHORT_SERVICE did not stop within a
timeout`. Eight of them captured the framework's staging lines, and all eight are identical:

| implied start (timeout − 180 s) | `Short FGS timed out` | +demote | +ANR'ed | ServiceRecord |
|---|---|---|---|---|
| 09-13 03:48:34 | 03:51:34.344 | +4.99 s | +9.99 s | `fadf74a` |
| 09-13 13:57:34 | 14:00:34.655 | +4.99 s | +10.00 s | `c294a4d` |
| 09-14 06:09:22 | 06:12:22.646 | +5.00 s | +10.01 s | `4753fdc` |
| 09-14 07:44:08 | 07:47:08.691 | +4.99 s | +9.99 s | `f52f52d` |
| 09-14 12:57:22 | 13:00:22.578 | +4.99 s | +9.99 s | `aebf1bc` |
| 09-14 18:21:31 | 18:24:31.099 | +5.00 s | +10.00 s | `65a28c6` |
| 09-14 18:32:04 | 18:35:04.077 | +5.00 s | +10.02 s | `e184792` |
| 09-14 19:46:17 | 19:49:17.172 | +5.00 s | +10.00 s | `4ed4eae` |

This settles two things the single live dump could not:

- **It is not a 3-minute period.** Eight timeouts, eight *different* `ServiceRecord` hashes — a
  `ServiceRecord` only exists after a `startForeground`. No service instance ever ANR'd twice, so
  this fires **once, ~3 minutes after each start**, and a restart re-arms it. The intervals
  between successive ANRs (10 m 33 s, 1 h 14 m, 5 h 24 m, 16 h 11 m) are simply how often the
  service was started — the two 09-14 evening records are this session's own restarts (implied
  start 18:32:04 matches the restart in §1, and `65a28c6` is the record dumped live above).
- **Nothing crashed.** A crash is an uncaught exception and a dead process; an ANR is a missed
  deadline on a live one. There is no `FATAL EXCEPTION` for this app, and none of the nine
  records contains a kill of its process — the `Killing <pid>` lines sharing those windows belong
  to other apps (Telegram, Firefox, Chrome, `systemui`) dying to memory pressure beside it.

### Root cause

`APKtool/AndroidManifest.xml:44`

```xml
<service android:foregroundServiceType="shortService"
         android:name="com.alexmanzana.bubbleall.BubbleService"/>
```

with `targetSdkVersion: 34` (`APKtool/apktool.yml`). On Android 14 a `shortService` FGS is
capped at ~3 minutes and must stop itself; a long-lived bubble overlay can never satisfy that.
The only `startForeground` call is the 2-arg form
(`BubbleService.smali:4827`), which inherits the manifest type — hence SHORT_SERVICE is what
actually gets started. `Service.onTimeout()` is **not implemented anywhere** in the app, so
nothing handles the timeout either.

Only `android.permission.FOREGROUND_SERVICE` is declared — none of the per-type
`FOREGROUND_SERVICE_*` permissions exist.

Not introduced by our patch: `foregroundServiceType="shortService"` is already present in the
repository's first commit (`init-1`), and `APKtool/AndroidManifest.xml` is unmodified vs HEAD.

### Impact

This is almost certainly the real cause of two previously-documented symptoms:

- **"App vanishing / broken bubble with other apps open"** (`restart-needed-features.md`) was
  attributed to OEM (ColorOS) LMK killing the process. Both halves are true, in this order: the
  *platform's own short-FGS rule* first **demotes** the service (the literal log line is `Short
  FGS procstate demoted`), which strips its foreground protection and leaves it an ordinary
  cached process — and only then is ColorOS's aggressive LMK free to kill it. The app does not
  need to crash to disappear; it needs to be demoted first.
- **`Crash1.txt` / `Crash2.txt`** ANR dumps with no Java stack trace are consistent with this.

It also explains *why restart appears to fix so much*: a restart does not fix the ANR, it only
resets the 180 s budget, so the next one simply lands three minutes after the next start (each
restart creates a fresh `ServiceRecord`, hence a fresh clock — see the table above).

And it explains the wedged state seen mid-session: after the ANR the manager panel froze
mid-animation (two screenshots 2 s apart were not identical, yet the panel never settled across
a full minute of wall clock) with the process pinned at 19–43 % CPU.

### Fix

Replace the type with a long-running one. For a floating-overlay bubble the honest choice is
`specialUse`, which needs its permission and a subtype property:

```xml
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_SPECIAL_USE"/>
<service android:name="com.alexmanzana.bubbleall.BubbleService"
         android:foregroundServiceType="specialUse">
    <property android:name="android.app.PROPERTY_SPECIAL_USE_FGS_SUBTYPE"
              android:value="floating_overlay_bubble"/>
</service>
```

`mediaPlayback` is a defensible alternative given the app's music/video features, but
`specialUse` is the truthful one.

**Status: FIXED and verified** (build of 2026-09-14 22:53, `dist/bubbleall-patched.apk`, installed
in place). The manifest now declares `specialUse`, `FOREGROUND_SERVICE_SPECIAL_USE` and the
`PROPERTY_SPECIAL_USE_FGS_SUBTYPE` property; nothing else changed.

The 3-arg `startForeground(id, notification, type)` proposed above turned out to be unnecessary
*and* undesirable. The app calls the 2-arg form, which **inherits the manifest type** — that is
exactly where the old `0x800` came from — while the 3-arg overload only exists from API 29 and
`minSdkVersion` is 23. Calling it unguarded would break on older devices for no benefit.

Verified on device: **5 minutes of continuous service** with `types=40000000`,
`isForeground=true`, same pid, same `ServiceRecord`; **zero** `Short FGS` events; no ANR dialog;
and the ANR ledger unchanged at 9 entries. `isShortFgs`, `timeout`, `demoteTime` and `anrTime` are
absent from the service dump entirely — the budget no longer exists. Before the fix the same
window produced timeout at +180 s, demotion at +185 s and an ANR at +190 s.

---

## 3. Bug B (high) — theme lookup throws instead of returning "no theme", ~24 exceptions per UI event

### Evidence

```
W/System.err: android.database.CursorIndexOutOfBoundsException: Index 0 requested, with a size of 0
    at android.database.AbstractCursor.checkPosition(AbstractCursor.java:521)
    at android.database.AbstractWindowedCursor.getString(AbstractWindowedCursor.java:53)
    at com.alexmanzana.bubbleall.utils.BubblePrefs$Companion.get(BubblePrefs.kt:60)
    at com.alexmanzana.bubbleall.utils.BubblePrefs$Companion.getInternalColors(BubblePrefs.kt:118)
    ...
```

**24 occurrences inside 72 ms** (18:33:53.271 → .343), on the main thread, from two hot paths:

1. Panel open:
   `BubbleService$animationToEnd$3.onAnimationEnd` → `BubbleService.open$lambda$6` →
   `PanelManager.playBackground` → `AddView.start` → `Panel.requestButtons` →
   `PanelManager.buttons` → `getInternalColors`.
2. RecyclerView bind:
   `RecyclerView.onMeasure → dispatchLayoutStep2 → LinearLayoutManager.fill →
   AdapterSize.onBindViewHolder(AdapterSize.kt:58)` → `getInternalColors`.

A third path appeared on app resume: `MainActivity.onResume(MainActivity.kt:133)` → `get`.

### Root cause

`BubblePrefs$Companion.get(Context, String)` (`BubblePrefs$Companion.smali`, the
`get(Landroid/content/Context;Ljava/lang/String;)` overload):

```
.line 58   invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z   # result discarded
.line 60   invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)  # reads index 1 anyway
```

`moveToFirst()`'s boolean is thrown away and the cursor is read unconditionally. When no
`themes` row matches `theme_selected` — a normal state on first run, or after a theme is
deleted — the read throws. The method catches `Exception`, prints a stack trace, and returns
null; both callers then substitute `ItemTheme.default()`. So the failure is silent, but the
user's selected theme is never loaded.

Two aggravating factors:

- `getInternalColors(Context)` **opens a fresh `SQLiteOpenHelper` + `getReadableDatabase()` +
  `rawQuery` on every call** (`BubblePrefs.kt:116-118`). There are **42 call sites across 12
  classes**, including 5 RecyclerView `onBindViewHolder`s (`AdapterSize`, `AdapterMusic`,
  `AdapterShortcut`, `AdapterVideo`, `AdapterWebTab`) and `PanelManager`, `AddView` (8 sites),
  `MusicView` (7), `VideoView`, `WebView`, `SwitchView`. That is one DB open + query + close
  per list item bind, per scroll frame.
- Each failure prints a full stack trace to logcat, which is a synchronized, expensive sink.
  At the observed rate that is hundreds of stack-trace writes per second during layout.

The uuid is also concatenated into the SQL string
(`"SELECT * FROM themes WHERE uuid='" + uuid + "'"`) rather than bound as a parameter.

### Fix

1. **Honour `moveToFirst()`** — return null (or the default) when it is false. Callers already
   handle null; this alone stops the storm and makes theme lookups behave.
2. Bind the uuid as a query parameter.
3. Hoist `getInternalColors` out of `onBindViewHolder` — read it once per adapter refresh and
   pass it into the bind, or cache it in the companion keyed by a settings-changed version.
   Without this the non-throwing path still does a DB open per item.

This is a strong candidate for the unexplained jank and for "my settings/theme don't apply"
reports, independent of bug A.

**Status: item 1 DONE** (same build as bug A); items 2 and 3 still open. `get(Context, String)` in
`BubblePrefs$Companion.smali` now takes the result of `moveToFirst()` and, when the cursor is
empty, closes the cursor and the database and returns null — the same outcome the `catch` block
produced, minus the exception, minus the stack-trace write, and minus a leaked cursor +
`SQLiteOpenHelper` per miss. The other two `moveToFirst()` sites in that file (Kotlin source lines
38 and 86) already honoured the result, which is why the discard was unique to this one method.

Verified on device: resuming `MainActivity` (RecyclerView `AdapterSize` binds) and opening the
manager panel (`Panel.requestButtons`) now yield **0** `CursorIndexOutOfBoundsException` and **0**
`W/System.err` lines, against 24-in-72 ms on those same two paths before. The panel still renders
correctly with the default theme. The cost is not gone, though: 42 `getInternalColors` call sites
still open a database per call, so item 3 is the part that would actually remove the jank.

---

## 4. Bug C (low) — null icon path → BitmapFactory NPE, default icons shown

```
E/BitmapFactory: Unable to decode stream: java.lang.NullPointerException   (x3 on every panel open)
```

`AdapterAdd.bind` (`AdapterAdd.smali:462`) calls
`BitmapFactory.decodeFile(item.getResourceBitmap())`; the default Add entries (Web / Video /
Music) have a null icon path. `decodeFile(null)` NPEs internally, and the adapter then falls
back to a default resource — cosmetic, but it is three exceptions per panel open.

`AdapterPanels.bind` (`AdapterPanels.smali:200`) has the same call on a `String` branch but is
preceded by `Intrinsics.checkNotNull(p2, "null cannot be cast to non-null type kotlin.String")`,
so a null path there would throw **out of `onBindViewHolder`** rather than fall back. Worth a
guard in both.

---

## 5. Modified-feature status on device

| Feature | Status | Evidence |
|---|---|---|
| Restart bubble | **Works** | In-place teardown + rebuild, same pid, no crash (§1). |
| Size (Big/Medium/Small) | **Applies at start only, not live** | With "Small" selected the bubble measured 90x90 px; tapped "Big" → bubble still 90 px (before/after screenshots pixel-identical in that region), while the "Big" card became selected; after restarting the service the same preference produced a ~120 px bubble. Matches the documented cause (`modifyBubble` swaps the drawable; only the boot path sizes the window). |
| Transparency slider | **Inconclusive — needs a retest** | Dragging from the handle and tapping the track both produced no visible change and the handle never moved (before/after pixel diff empty apart from the status bar). This may be my synthetic gesture missing a custom-view touch pattern rather than a code fault; retest with a human drag, or read `Layer ... alpha:` from logcat after a slider move (the layer dump does expose it, e.g. `alpha:0.725586`). |
| Keyboard in browser (Keyboard/Built-in/Paste/Nothing) | **Not tested** | Config UI reached; the mode-switch + IME behaviour needs the browser panel open with a focused field. |
| System keyboard hidden on mode switch | **Not tested** | Same as above. |
| Bubble appearance over other apps | **Now testable — bug A fixed** | The ANR/demotion used to dominate every long-running test; with `specialUse` there is no 3-minute horizon. Still to be exercised over heavy apps. |

---

## 6. Prioritized plan

**P0 — fix bug A. DONE** (build of 2026-09-14 22:53). It gated everything else: any observation
made more than 3 minutes after a bubble start was contaminated by ANR/demotion. The matrix below
can now be re-run honestly.

**P1 — fix bug B. PARTIAL.** The `moveToFirst()` guard shipped with P0 and the exception storm is
gone. Still open: bind the uuid as a query parameter, and — the real jank fix — hoist
`getInternalColors` out of its 42 call sites, five of which are RecyclerView binds that open a
database per item.

**P2 — live application of size/alpha/flags** (the `Modification C` items in
`restart-needed-features.md`). Re-apply alpha/flags on window attach, extract
`applyBubbleSize()` and call it from `modifyBubble()`, then consider remove+add of the window
if this ROM ignores `updateViewLayout` flag/alpha changes. Re-test after P0 — some of the
"needs restart" behaviour may simply have been the app being ANR'd.

**P3 — bug C guards**, and the general polish items: the app leaves an off-screen parked
overlay window at `mAttrs=(720,0)` while a second overlay sits at `(0,200)` (looks like the
by-design hidden-manager position, but worth confirming it is not a leak after restart), and
the bubble sits flush at x=0 with no minimum margin.

**P4 — test-matrix debt.** The keyboard-mode switch and transparency slider remain unverified
on-device and are exactly what the last two patch rounds touched.

### Rebuild/reinstall reminders

- Rebuild + install in one step: `bash scripts/build-apk.sh --install` (apktool → dex checks →
  zipalign → apksigner with the debug keystore → in-place update → launch smoke check). Signing on
  this PC means `install -r` keeps app settings; only the very first install needed an uninstall.
- The install is **not debuggable**, so `run-as` cannot read its prefs/DB. To inspect
  `bubble_data_prefs` and `db_themes` directly, either ship a `debuggable` build or add
  temporary logging around the prefs reads.
- Battery was at 12–13 % throughout this session; keep the phone on a charger for the next run.
