.class public final Lcom/alexmanzana/bubbleall/window/PanelManager;
.super Landroid/widget/RelativeLayout;
.source "PanelManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n*\u0001\u000c\u0018\u00002\u00020\u0001:\u0001TB%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J!\u0010.\u001a\u00020(2\u0012\u0010.\u001a\n\u0012\u0006\u0008\u0001\u0012\u0002000/\"\u000200H\u0002\u00a2\u0006\u0002\u00101J\u000e\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204J\u0018\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00072\u0008\u00107\u001a\u0004\u0018\u00010+J\u0012\u00108\u001a\u0002042\u0008\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0006\u0010;\u001a\u000204J\u0008\u0010\u0017\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020(J&\u0010\u000f\u001a\u00020(2\u0006\u0010>\u001a\u00020?2\n\u0010@\u001a\u0006\u0012\u0002\u0008\u00030A2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010B\u001a\u00020(J\u0008\u0010C\u001a\u00020(H\u0002J\u0006\u0010D\u001a\u00020(J\u0008\u0010E\u001a\u00020(H\u0002J\u0006\u0010F\u001a\u00020(J\u0006\u0010G\u001a\u00020(J\u000e\u0010H\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020KJ\u000e\u0010I\u001a\u00020(2\u0006\u0010L\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020+J\u0016\u0010O\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-J\u0016\u0010P\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+J\u000e\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020+J\u0008\u0010S\u001a\u00020(H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006U"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/window/PanelManager;",
        "Landroid/widget/RelativeLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "callback",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
        "callbackRecycler",
        "com/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1",
        "Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;",
        "currentId",
        "list",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getList",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "setList",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;",
        "getListener",
        "()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;",
        "setListener",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;)V",
        "toast",
        "Landroid/widget/TextView;",
        "getToast",
        "()Landroid/widget/TextView;",
        "setToast",
        "(Landroid/widget/TextView;)V",
        "toolbar",
        "Landroid/view/View;",
        "getToolbar",
        "()Landroid/view/View;",
        "setToolbar",
        "(Landroid/view/View;)V",
        "args",
        "",
        "id",
        "id_",
        "",
        "f",
        "",
        "buttons",
        "",
        "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;",
        "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V",
        "changeOrientation",
        "isVertical",
        "",
        "destroy",
        "panelId",
        "_id",
        "dispatchKeyEvent",
        "event",
        "Landroid/view/KeyEvent;",
        "endList",
        "Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;",
        "init",
        "layoutManager",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
        "adapter",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "onBackground",
        "pause",
        "pauseMedia",
        "play",
        "playBackground",
        "refreshStyle",
        "removeView",
        "requestIcon",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "resource",
        "requestTitle",
        "name",
        "setDataExtra",
        "setPanelId",
        "showToast",
        "text",
        "verifyVisibility",
        "Listener",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private callback:Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;

.field private final callbackRecycler:Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;

.field private currentId:I

.field private list:Landroidx/recyclerview/widget/RecyclerView;

.field private listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

.field private toast:Landroid/widget/TextView;

.field private toolbar:Landroid/view/View;


# direct methods
.method public static synthetic $r8$lambda$4T5Pe5Fxsoe2F7b1Sumxj8JqJuY(Lcom/alexmanzana/bubbleall/window/PanelManager;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->showToast$lambda$5(Lcom/alexmanzana/bubbleall/window/PanelManager;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$SNxoxhyHXtSHdseACKUwrPUnRGQ([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->buttons$lambda$1([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$cMZ9iEVgZK6ewWTAtmrryPClb_w(Lcom/alexmanzana/bubbleall/window/PanelManager;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->showToast$lambda$6(Lcom/alexmanzana/bubbleall/window/PanelManager;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/window/PanelManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/window/PanelManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 225
    new-instance p1, Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;-><init>(Lcom/alexmanzana/bubbleall/window/PanelManager;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->callbackRecycler:Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/PanelManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final varargs synthetic access$buttons(Lcom/alexmanzana/bubbleall/window/PanelManager;[Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->buttons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    return-void
.end method

.method public static final synthetic access$getCallback$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->callback:Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;

    return-object p0
.end method

.method public static final synthetic access$getCurrentId$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)I
    .locals 0

    .line 21
    iget p0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    return p0
.end method

.method public static final synthetic access$list(Lcom/alexmanzana/bubbleall/window/PanelManager;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->list(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V

    return-void
.end method

.method private final varargs buttons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V
    .locals 8

    .line 208
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    if-eqz v0, :cond_0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->buttonsToolbar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 210
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    .line 211
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 213
    :cond_1
    array-length v1, p1

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_2

    .line 214
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/ImageView;

    .line 215
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 216
    sget-object v5, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 217
    aget-object v5, p1, v3

    invoke-virtual {v5}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;->getResource()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 218
    new-instance v5, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda2;

    invoke-direct {v5, p1, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda2;-><init>([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;I)V

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method private static final buttons$lambda$1([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;ILandroid/view/View;)V
    .locals 0

    const-string p2, "$buttons"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    aget-object p0, p0, p1

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;->getListener()Ljava/lang/Runnable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private final getListener()Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;
    .locals 1

    .line 119
    new-instance v0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;-><init>(Lcom/alexmanzana/bubbleall/window/PanelManager;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;

    return-object v0
.end method

.method private final list(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
            ")V"
        }
    .end annotation

    .line 250
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->init()V

    .line 251
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->pause()V

    const/16 v0, 0x8

    .line 252
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setVisibility(I)V

    .line 253
    iput-object p3, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->callback:Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;

    .line 254
    new-instance p3, Landroidx/recyclerview/widget/ItemTouchHelper;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->callbackRecycler:Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;

    check-cast v0, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 255
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 256
    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 257
    :goto_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private final pause()V
    .locals 2

    .line 84
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_1

    .line 85
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 86
    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final play()V
    .locals 2

    .line 91
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_1

    .line 92
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 93
    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static final showToast$lambda$5(Lcom/alexmanzana/bubbleall/window/PanelManager;Ljava/lang/String;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 346
    :goto_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    const-string v0, "getContext(...)"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/TextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 347
    :cond_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorManager(Landroid/content/Context;)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    return-void
.end method

.method private static final showToast$lambda$6(Lcom/alexmanzana/bubbleall/window/PanelManager;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private final verifyVisibility()V
    .locals 6

    .line 330
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    .line 331
    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 332
    instance-of v4, v3, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v4, :cond_1

    .line 333
    check-cast v3, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v4

    iget v5, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-ne v4, v5, :cond_0

    .line 334
    invoke-virtual {v3, v1}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    goto :goto_1

    :cond_0
    const/16 v4, 0x8

    .line 336
    invoke-virtual {v3, v4}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final args(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "id_"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "f"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz p1, :cond_0

    .line 304
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setIdPanel(Ljava/lang/String;)V

    .line 305
    invoke-virtual {p1, p3}, Lcom/alexmanzana/bubbleall/window/Panel;->args(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final changeOrientation(Z)V
    .locals 2

    .line 359
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->isCreated()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/window/Panel;->onChangeOrientation(Z)V

    :cond_0
    return-void
.end method

.method public final destroy(ILjava/lang/String;)V
    .locals 5

    .line 60
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    .line 61
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->getIdPanel()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 63
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v2

    :goto_1
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const/16 v3, 0x8

    .line 64
    invoke-virtual {p1, v3}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    :cond_5
    :goto_2
    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    if-nez p2, :cond_7

    move-object p2, v1

    .line 66
    :cond_7
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setIdPanel(Ljava/lang/String;)V

    :goto_3
    if-eqz v0, :cond_8

    .line 67
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :cond_8
    move-object p2, v2

    :goto_4
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_9
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    if-eqz p1, :cond_a

    .line 68
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->pause()V

    :cond_a
    if-eqz p1, :cond_b

    .line 70
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->onDestroy()V

    :cond_b
    if-nez p1, :cond_c

    goto :goto_5

    :cond_c
    const/4 p2, 0x0

    .line 71
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setCreated(Z)V

    :goto_5
    if-nez p1, :cond_d

    goto :goto_6

    :cond_d
    const/4 p2, 0x1

    .line 72
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setDestroy(Z)V

    :goto_6
    if-nez p1, :cond_e

    goto :goto_7

    .line 73
    :cond_e
    invoke-virtual {p1, v1}, Lcom/alexmanzana/bubbleall/window/Panel;->setIdPanel(Ljava/lang/String;)V

    :goto_7
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 273
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 274
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_0

    .line 275
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/window/Panel;

    .line 276
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    .line 280
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final endList()Z
    .locals 3

    .line 284
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 285
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setVisibility(I)V

    .line 286
    :goto_0
    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setVisibility(I)V

    .line 287
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->play()V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final getList()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    return-object v0
.end method

.method public final getToast()Landroid/widget/TextView;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getToolbar()Landroid/view/View;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    return-object v0
.end method

.method public final init()V
    .locals 5

    .line 107
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 108
    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 109
    instance-of v3, v2, Lcom/alexmanzana/bubbleall/window/Panel;

    const/16 v4, 0x8

    if-eqz v3, :cond_0

    .line 110
    check-cast v2, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/window/Panel;->setListener(Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;)V

    .line 111
    invoke-virtual {v2, v4}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    goto :goto_1

    .line 113
    :cond_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onBackground()V
    .locals 2

    .line 98
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->onBackground()Z

    move-result v1

    if-nez v1, :cond_0

    .line 101
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->pause()V

    :cond_0
    return-void
.end method

.method public final pauseMedia()V
    .locals 1

    .line 35
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->pauseMedia()V

    :cond_0
    return-void
.end method

.method public final playBackground()V
    .locals 1

    .line 77
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->start()V

    :cond_0
    return-void
.end method

.method public final refreshStyle()V
    .locals 4

    .line 42
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 43
    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 44
    instance-of v3, v2, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v3, :cond_0

    .line 45
    check-cast v2, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/window/Panel;->isCreated()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 46
    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/window/Panel;->declareStyle()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final removeView(I)V
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz p1, :cond_0

    .line 55
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final requestIcon(I)V
    .locals 3

    .line 261
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    if-eqz v0, :cond_0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->iconOption:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 262
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    if-eqz v0, :cond_2

    .line 263
    sget-object p1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_2
    return-void
.end method

.method public final requestIcon(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    if-eqz v0, :cond_0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->iconOption:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 268
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_1
    if-eqz v0, :cond_2

    .line 269
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_2
    return-void
.end method

.method public final requestTitle(Ljava/lang/String;)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    if-eqz v0, :cond_0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->titleOption:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 354
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    if-nez v0, :cond_2

    goto :goto_1

    .line 355
    :cond_2
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public final setDataExtra(ILjava/lang/Object;)V
    .locals 2

    const-string v0, "f"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 296
    const-string v1, ""

    invoke-virtual {p0, p1, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setPanelId(ILjava/lang/String;)V

    .line 297
    invoke-virtual {v0, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->args(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setList(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->list:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public final setListener(Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    return-void
.end method

.method public final setPanelId(ILjava/lang/String;)V
    .locals 1

    const-string v0, "id_"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->endList()Z

    .line 311
    iget v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_0

    .line 312
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->pause()V

    .line 313
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz p1, :cond_2

    .line 315
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->currentId:I

    .line 316
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setIdPanel(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 317
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setVisibility(I)V

    .line 318
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->isCreated()Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->onCreate()V

    .line 320
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->declareStyle()V

    const/4 v0, 0x1

    .line 321
    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/window/Panel;->setCreated(Z)V

    .line 322
    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/window/Panel;->setDestroy(Z)V

    .line 324
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/window/Panel;->start()V

    .line 326
    :cond_2
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->verifyVisibility()V

    return-void
.end method

.method public final setToast(Landroid/widget/TextView;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    return-void
.end method

.method public final setToolbar(Landroid/view/View;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toolbar:Landroid/view/View;

    return-void
.end method

.method public final showToast(Ljava/lang/String;)V
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    new-instance v0, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/window/PanelManager;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->post(Ljava/lang/Runnable;)Z

    .line 349
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager;->toast:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/window/PanelManager$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/window/PanelManager;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
