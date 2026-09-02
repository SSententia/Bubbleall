# Bubble Transparency & Keyboard Toggle — Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use `plan-execution` to implement this plan task-by-task. Choose its same-session subagent mode or sequential mode based on task independence and session boundaries. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add a global transparency slider and a "hide keyboard in browser" switch to the Bubble settings screen of the BubbleAll APK, applied live to the whole overlay.

**Architecture:** Values are stored in the private prefs file `bubble_data_prefs` (`theme_alpha` int 0-255, `key_no_keyboard` bool). The Bubble settings screen (`layout_add_window.xml`, built by `AddView.listenerConfig$lambda$0`) gains a SeekBar + Switch; changes are saved and the existing `ACTION_MODIFY_BUBBLE` broadcast refreshes `BubbleService.modifyBubble()`, which applies `View.setAlpha()` to the bubble and manager window. The browser's custom `Web` view suppresses the soft keyboard by returning `null` from `onCreateInputConnection()` when the flag is set (long-press paste still works).

**Tech Stack:** smali (Dalvik bytecode), Android framework widgets (SeekBar, Switch), apktool 3.0.2 for rebuild. JADX Java output is reference-only.

## Global Constraints

- Edit only under `APKtool/` (the build tree). `JADX/` is read-only reference; never edit it.
- New classes go in `APKtool/smali/com/alexmanzana/bubbleall/` (classes.dex), never `smali_classes2/3`.
- Keep `R$*.smali` files intact except adding new field entries for new resources (apktool re-links IDs on build).
- Rebuild command (verified working): `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`
- No Android SDK / signing tools installed: verification = successful apktool rebuild + smali review.
- No git repo in this workspace: no commits.

---

### Task 1: Resources (layout rows, strings, ids)

**Files:**
- Modify: `APKtool/res/layout/layout_add_window.xml` — append two rows after the size row's closing `</RelativeLayout>` and before the final `</LinearLayout>` of the root ScrollView.
- Modify: `APKtool/res/values/strings.xml`
- Modify: `APKtool/res/values/ids.xml`

**Interfaces:**
- Produces: layout ids `transparencyTitle`, `transparencyDesc`, `transparencySeek`, `keyboardTitle`, `keyboardDesc`, `keyboardSwitch`; string resources `text_transparency`, `text_transparency_d`, `text_hide_keyboard`, `text_hide_keyboard_d`. These names are consumed by Task 2 and Task 3 exactly as written.

- [ ] **Step 1: Append the two new rows to `layout_add_window.xml`**

Insert immediately before the root `</LinearLayout>` (after the existing size row):

```xml
        <View android:background="#cccccc" android:layout_width="wrap_content" android:layout_height="1.0dp" />
        <RelativeLayout android:padding="15.0dp" android:layout_width="match_parent" android:layout_height="wrap_content">
            <LinearLayout android:orientation="vertical" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_centerInParent="true" android:layout_marginStart="5.0dp" android:layout_marginEnd="10.0dp" android:layout_toStartOf="@id/transparencySeek" android:layout_alignParentStart="true">
                <TextView android:textSize="16.0sp" android:textColor="@color/colorPrimaryText" android:ellipsize="end" android:id="@id/transparencyTitle" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@string/text_transparency" android:maxLines="1" android:lines="1" android:minLines="1" />
                <TextView android:textSize="13.0sp" android:textColor="@color/colorSecondText" android:ellipsize="end" android:id="@id/transparencyDesc" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@string/text_transparency_d" android:maxLines="2" android:minLines="1" />
            </LinearLayout>
            <SeekBar android:id="@id/transparencySeek" android:layout_width="120.0dp" android:layout_height="wrap_content" android:max="255" android:layout_centerInParent="true" android:layout_alignParentEnd="true" />
        </RelativeLayout>
        <View android:background="#cccccc" android:layout_width="wrap_content" android:layout_height="1.0dp" />
        <RelativeLayout android:padding="15.0dp" android:layout_width="match_parent" android:layout_height="wrap_content">
            <LinearLayout android:orientation="vertical" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_centerInParent="true" android:layout_marginStart="5.0dp" android:layout_marginEnd="10.0dp" android:layout_toStartOf="@id/keyboardSwitch" android:layout_alignParentStart="true">
                <TextView android:textSize="16.0sp" android:textColor="@color/colorPrimaryText" android:ellipsize="end" android:id="@id/keyboardTitle" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@string/text_hide_keyboard" android:maxLines="1" android:lines="1" android:minLines="1" />
                <TextView android:textSize="13.0sp" android:textColor="@color/colorSecondText" android:ellipsize="end" android:id="@id/keyboardDesc" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@string/text_hide_keyboard_d" android:maxLines="2" android:minLines="1" />
            </LinearLayout>
            <Switch android:id="@id/keyboardSwitch" android:layout_width="wrap_content" android:layout_height="wrap_content" android:layout_centerInParent="true" android:layout_alignParentEnd="true" />
        </RelativeLayout>
```

- [ ] **Step 2: Add the four strings to `APKtool/res/values/strings.xml`**

Insert alphabetically near `text_hide_bottom_view_on_scroll_behavior` / `text_info` (order within the file is not functionally significant):

```xml
    <string name="text_hide_keyboard">Hide keyboard in browser</string>
    <string name="text_hide_keyboard_d">Don\'t open keyboard on fields, paste with long press</string>
    <string name="text_transparency">Transparency</string>
    <string name="text_transparency_d">Adjust transparency of all components</string>
```

- [ ] **Step 3: Register the six new ids in `APKtool/res/values/ids.xml`**

Add six `<id ... />` entries (alphabetical placement: `keyboardDesc`, `keyboardSwitch`, `keyboardTitle` near existing `k*`; `transparencyDesc`, `transparencySeek`, `transparencyTitle` near existing `t*`):

```xml
    <id name="keyboardDesc" />
    <id name="keyboardSwitch" />
    <id name="keyboardTitle" />
    <id name="transparencyDesc" />
    <id name="transparencySeek" />
    <id name="transparencyTitle" />
```

---

### Task 2: R$id fields

**Files:**
- Modify: `APKtool/smali/com/alexmanzana/bubbleall/R$id.smali`

**Interfaces:**
- Consumes: id names from Task 1.
- Produces: `sget`-able fields `Lcom/alexmanzana/bubbleall/R$id;->transparencyTitle:I`, `transparencyDesc`, `transparencySeek`, `keyboardTitle`, `keyboardDesc`, `keyboardSwitch`. Consumed by Task 3.

- [ ] **Step 1: Add six `.field public static final ...:I` entries to R$id.smali**

Find the existing `keyboard`-adjacent fields (`switchView`, `switchWidget`) and `t*`/`t*` region and add (exact field lines; values are re-linked by apktool at build):

```smali
.field public static final keyboardDesc:I
.field public static final keyboardSwitch:I
.field public static final keyboardTitle:I
.field public static final transparencyDesc:I
.field public static final transparencySeek:I
.field public static final transparencyTitle:I
```

Placement inside the file does not matter (fields are referenced by name).

---

### Task 3: Wire the controls in AddView.smali

**Files:**
- Modify: `APKtool/smali/com/alexmanzana/bubbleall/views/AddView.smali` — method `listenerConfig$lambda$0(AddView;Context;)V`

**Interfaces:**
- Consumes: R ids from Task 2; `AddView$listenerConfig$1$2` and `AddView$listenerConfig$1$3` (Task 4); string/pref names are literals.
- Produces: SeekBar progress → `bubble_data_prefs["theme_alpha"]` + broadcast `com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE`; Switch → `bubble_data_prefs["key_no_keyboard"]`.

- [ ] **Step 1: Raise `.locals 6` to `.locals 10`** in `listenerConfig$lambda$0` (method line: `.method private static final listenerConfig$lambda$0(Lcom/alexmanzana/bubbleall/views/AddView;Landroid/content/Context;)V`).

- [ ] **Step 2: Insert the wiring block**

Insert between the `.line 78` `setOnClickListener` on `v2` (hide/show bubble click listeners) and `.line 80` `:goto_1` (the `isOpenConfig` toggle). Exact block:

```smali
    # tint new titles/descriptions with theme internal color
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->transparencyTitle:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    sget-object v7, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v7, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->transparencyDesc:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    sget-object v7, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v7, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->keyboardTitle:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    sget-object v7, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v7, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->keyboardDesc:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    sget-object v7, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v7, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    # transparency SeekBar: init from prefs, save + broadcast on change
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->transparencySeek:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/SeekBar;

    const-string v7, "bubble_data_prefs"

    const/4 v8, 0x0

    invoke-virtual {p1, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "theme_alpha"

    const/16 v9, 0xff

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setProgress(I)V

    new-instance v7, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;

    invoke-direct {v7, p1}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;-><init>(Landroid/content/Context;)V

    check-cast v7, Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    # keyboard Switch: init from prefs, save on toggle
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->keyboardSwitch:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Switch;

    const-string v7, "bubble_data_prefs"

    const/4 v8, 0x0

    invoke-virtual {p1, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "key_no_keyboard"

    invoke-interface {v7, v8, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/Switch;->setChecked(Z)V

    new-instance v7, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;

    invoke-direct {v7, p1}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;-><init>(Landroid/content/Context;)V

    check-cast v7, Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v6, v7}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
```

Note: `p0` is the `AddView` (`this$0`), `p1` is the `Context` param of the static lambda — do not re-declare either; use only `v6`–`v9`.

---

### Task 4: New listener classes

**Files:**
- Create: `APKtool/smali/com/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2.smali`
- Create: `APKtool/smali/com/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3.smali`

**Interfaces:**
- Produces: `Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;` with ctor `(Landroid/content/Context;)V` implementing `Landroid/widget/SeekBar$OnSeekBarChangeListener;`; `Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;` with ctor `(Landroid/content/Context;)V` implementing `Landroid/widget/CompoundButton$OnCheckedChangeListener;`. Consumed by Task 3.

- [ ] **Step 1: Create `AddView$listenerConfig$1$2.smali`**

```smali
.class final Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;
.super Ljava/lang/Object;
.source "AddView.kt"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;

# instance fields
.field final synthetic $context:Landroid/content/Context;

# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;->$context:Landroid/content/Context;

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "theme_alpha"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;->$context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
```

- [ ] **Step 2: Create `AddView$listenerConfig$1$3.smali`**

```smali
.class final Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;
.super Ljava/lang/Object;
.source "AddView.kt"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;

# instance fields
.field final synthetic $context:Landroid/content/Context;

# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$context:Landroid/content/Context;

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_no_keyboard"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
```

---

### Task 5: Apply alpha in BubbleService.smali

**Files:**
- Modify: `APKtool/smali/com/alexmanzana/bubbleall/BubbleService.smali`
  - New method `applyAlpha()V` (place after `modifyBubble()V`, which ends ~line 3160).
  - Call at end of `modifyBubble()V` (before its `return-void`, ~line 3158).
  - Call in `onStartCommand` bubble-only branch (after the `updateViewLayout` at ~line 4890, before the non-bubble branch).
  - Call in `onStartCommand` non-bubble branch (after `declareProperties()` at ~line 4964, before `requestLayoutOrientation()` at ~line 4966).

**Interfaces:**
- Consumes: prefs key `theme_alpha` (written by Task 3).
- Produces: `private final applyAlpha()V` applying `View.setAlpha()` to `mBubble` and `mViewManager`; invoked on startup and on every `ACTION_MODIFY_BUBBLE`.

- [ ] **Step 1: Add the `applyAlpha` method**

```smali
.method private final applyAlpha()V
    .locals 4

    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "theme_alpha"

    const/16 v2, 0xff

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x437f0000

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v1, :cond_0

    const-string v1, "mBubble"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v1, :cond_1

    const-string v1, "mViewManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
```

(`0x437f0000` is the IEEE-754 float 255.0.)

- [ ] **Step 2: Call `applyAlpha()` at the end of `modifyBubble()`**

Immediately before its `return-void` (after the `refreshStyle()` invoke):

```smali
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V
```

- [ ] **Step 3: Call `applyAlpha()` in `onStartCommand` bubble-only branch**

After the `windowManager2.updateViewLayout(...)` call that ends the `ACTION_START_ONLY_BUBBLE` block (the block that reads `xBubble`/`yBubble` from prefs):

```smali
    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V
```

- [ ] **Step 4: Call `applyAlpha()` in `onStartCommand` non-bubble branch**

Between the `declareProperties()` invoke and the `requestLayoutOrientation()` invoke:

```smali
    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V
```

---

### Task 6: Suppress keyboard in Web.smali

**Files:**
- Modify: `APKtool/smali/com/alexmanzana/bubbleall/views/Web.smali` — add override in the `# virtual methods` section.

**Interfaces:**
- Consumes: prefs key `key_no_keyboard` (written by Task 3).
- Produces: `onCreateInputConnection(EditorInfo)InputConnection` that returns `null` when the flag is set, else delegates to `super`.

- [ ] **Step 1: Add the method**

```smali
.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "key_no_keyboard"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lcom/alexmanzana/bubbleall/views/Web;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    return-object v0
.end method
```

---

### Task 7: Rebuild and verify

**Files:** none (verification only).

- [ ] **Step 1: Rebuild the APK**

Run: `java -jar /c/Windows/apktool_3.0.2.jar b APKtool -o rebuilt.apk`

Expected: `BUILD SUCCESSFUL` (exit 0). The smali assembler and aapt2 both run here — any typo in the new smali or resource XML fails this build.

- [ ] **Step 2: Review the diff**

Re-read each modified smali method against the JADX reference to confirm: broadcast action string matches `com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE`; prefs file `bubble_data_prefs`; default alpha 255; `mViewManager`/`mBubble` null-guards; new classes' constructor names match `AddView.smali` invocations.

## Self-Review

- **Spec coverage:** transparency slider (Tasks 1-3, 5), live update via broadcast (Task 3 Step 2 + Task 5 Step 2), keyboard toggle (Tasks 1-3, 6), defaults preserve existing behavior (defaults 255/false), resources + R$id (Tasks 1-2), rebuild verification (Task 7). All spec sections covered.
- **Placeholder scan:** no TBD/TODO; every step has concrete smali/XML.
- **Type consistency:** listener ctor names match between Task 3 (`AddView$listenerConfig$1$2` / `$1$3`) and Task 4; pref keys `theme_alpha` / `key_no_keyboard` identical across Tasks 3, 5, 6; id names identical across Tasks 1, 2, 3.

## Post-mortem fix (2026-09-02) — VerifyError in `listenerConfig$lambda$0`

The first on-device build crashed at startup with `java.lang.VerifyError` in `AddView.listenerConfig$lambda$0`: register v11 had type `View$OnClickListener` but the code expected `Context` (offset 0x101). Two bugs, both fixed in this file:

1. **p1 is clobbered by the original code.** The Kotlin-compiled body reuses the `$context` parameter (`p1`) as scratch: at `.line 77` it does `move-object p1, p0; check-cast p1, OnClickListener` for `setOnClickListener`. The Task 3 block reads `p1` as a Context *after* that point (with `.locals 10`, `p1` = register v11 — exactly the register in the error). The plan's advice "use only v6–v9, don't re-declare p0/p1" was wrong: the original code had already re-declared (overwritten) p1.
   **Fix:** `.locals 10` → `.locals 12`; save the param once right after the Intrinsics checks (`move-object v6, p1`) and pin `v6` as the Context for the whole block (never written again); renumber block scratch to v7–v10.
2. **`getBoolean` default arg bug.** The Switch block called `invoke-interface {v7, v8, v8}, getBoolean(...)` — passing the key *string* in the boolean-default slot (`{v8, v8}`). Now `const/4 v10, 0x0` + `invoke-interface {v8, v9, v10}`.

**Rule for future smali edits:** before relying on a parameter register holding its original value, `grep` the method for writes to `p0`/`p1` (Kotlin-compiled code frequently reuses them as scratch after their last logical use). If so, copy the value into a fresh local *before* the clobber point, as done here.
