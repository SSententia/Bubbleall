.class public final Lcom/alexmanzana/bubbleall/BubbleService;
.super Landroid/app/Service;
.source "BubbleService.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/BubbleService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBubbleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleService.kt\ncom/alexmanzana/bubbleall/BubbleService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,837:1\n1855#2,2:838\n1855#2,2:840\n1864#2,3:842\n*S KotlinDebug\n*F\n+ 1 BubbleService.kt\ncom/alexmanzana/bubbleall/BubbleService\n*L\n148#1:838,2\n366#1:840,2\n639#1:842,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e*\u0004\u0008\u000b\u000e\u001c\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002062\u0006\u0010;\u001a\u000200H\u0016J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000203H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000209H\u0002J\u0012\u0010>\u001a\u0002062\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020CH\u0002J\u0014\u0010D\u001a\u0002062\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010E\u001a\u0002062\u0006\u0010;\u001a\u000200H\u0002J\u0008\u0010F\u001a\u000206H\u0002J\u0014\u0010G\u001a\u0002062\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0008\u0010H\u001a\u000206H\u0002J\u0008\u0010I\u001a\u000206H\u0002J\u0008\u0010J\u001a\u000206H\u0002J\u0010\u0010K\u001a\u00020\u00112\u0006\u00108\u001a\u000203H\u0002J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u000209H\u0002J\u0008\u0010N\u001a\u00020&H\u0002J\u0008\u0010O\u001a\u00020&H\u0002J\u0008\u0010P\u001a\u000203H\u0002J\u0010\u0010Q\u001a\u0002032\u0006\u0010M\u001a\u000209H\u0002J\u0008\u0010R\u001a\u000206H\u0016J\u0008\u0010S\u001a\u000206H\u0016J\u0008\u0010T\u001a\u00020\u0011H\u0016J\u0008\u0010U\u001a\u000206H\u0002J\u0014\u0010V\u001a\u0004\u0018\u00010W2\u0008\u0010X\u001a\u0004\u0018\u00010@H\u0016J \u0010Y\u001a\u00020\u00112\u0006\u0010M\u001a\u0002092\u0006\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u000203H\u0016J\u0008\u0010\\\u001a\u000206H\u0016J\u0010\u0010]\u001a\u0002062\u0006\u0010^\u001a\u00020_H\u0016J\u0008\u0010`\u001a\u000206H\u0016J\u0008\u0010a\u001a\u000206H\u0016J\"\u0010b\u001a\u0002032\u0008\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010c\u001a\u0002032\u0006\u0010d\u001a\u000203H\u0017J\u0008\u0010e\u001a\u000206H\u0002J\u0008\u0010f\u001a\u000206H\u0002J\u0008\u0010g\u001a\u000206H\u0002J\u0012\u0010h\u001a\u0002062\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0012\u0010i\u001a\u0002062\u0008\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0008\u0010j\u001a\u000206H\u0002J\u0008\u0010k\u001a\u000206H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\u0008\u0012\u0004\u0012\u000200`1X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006m"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/BubbleService;",
        "Landroid/app/Service;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;",
        "()V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;",
        "argsBubble",
        "com/alexmanzana/bubbleall/BubbleService$argsBubble$1",
        "Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;",
        "callbackHorizontal",
        "com/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1",
        "Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;",
        "callbackVertical",
        "com/alexmanzana/bubbleall/BubbleService$callbackVertical$1",
        "Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;",
        "isHideBubble",
        "",
        "isInitManger",
        "isOnlyBubble",
        "isOpenManager",
        "mBubble",
        "Landroid/view/View;",
        "mHandler",
        "Landroid/os/Handler;",
        "mInflater",
        "Landroid/view/LayoutInflater;",
        "mListenerMoveBubble",
        "com/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1",
        "Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;",
        "mPanelManager",
        "Lcom/alexmanzana/bubbleall/window/PanelManager;",
        "mPrefs",
        "Landroid/content/SharedPreferences;",
        "mView",
        "Landroid/widget/LinearLayout;",
        "mViewManager",
        "mViewManagerParams",
        "Landroid/view/WindowManager$LayoutParams;",
        "mViewManagerParamsI",
        "mViewParams",
        "mWindowManager",
        "Landroid/view/WindowManager;",
        "optionsHorizontal",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "optionsVertical",
        "panels",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
        "Lkotlin/collections/ArrayList;",
        "xBubble",
        "",
        "yBubble",
        "activeBubble",
        "",
        "activePanel",
        "openItem",
        "",
        "addBubbleInPanels",
        "item",
        "addForPosition",
        "positionMenu",
        "animationStart",
        "intent",
        "Landroid/content/Intent;",
        "animationToEnd",
        "runnable",
        "Ljava/lang/Runnable;",
        "animationToNormal",
        "clearPanels",
        "closeAllViews",
        "closeManager",
        "declareProperties",
        "declareReceiver",
        "declareValues",
        "existsOption",
        "existsPanel",
        "id",
        "getBaseParams",
        "getParamsManager",
        "getPositionActive",
        "getPositionForId",
        "hideBubble",
        "hideNormal",
        "isVisibleBubble",
        "modifyBubble",
        "onBind",
        "Landroid/os/IBinder;",
        "p0",
        "onClick",
        "position",
        "resourceId",
        "onClose",
        "onConfigurationChanged",
        "newConfig",
        "Landroid/content/res/Configuration;",
        "onCreate",
        "onDestroy",
        "onStartCommand",
        "flags",
        "startId",
        "open",
        "openManager",
        "prepareAddView",
        "preparePanel",
        "requestArgsBubble",
        "requestLayoutOrientation",
        "toTop",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

.field private static isStarting:Z


# instance fields
.field private adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

.field private final argsBubble:Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;

.field private final callbackHorizontal:Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;

.field private final callbackVertical:Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;

.field private isHideBubble:Z

.field private isInitManger:Z

.field private isOnlyBubble:Z

.field private isOpenManager:Z

.field private mBubble:Landroid/view/View;

.field private mHandler:Landroid/os/Handler;

.field private mInflater:Landroid/view/LayoutInflater;

.field private final mListenerMoveBubble:Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;

.field private mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

.field private mPrefs:Landroid/content/SharedPreferences;

.field private mView:Landroid/widget/LinearLayout;

.field private mViewManager:Landroid/view/View;

.field private mViewManagerParams:Landroid/view/WindowManager$LayoutParams;

.field private mViewManagerParamsI:Landroid/view/WindowManager$LayoutParams;

.field private mViewParams:Landroid/view/WindowManager$LayoutParams;

.field private mWindowManager:Landroid/view/WindowManager;

.field private optionsHorizontal:Landroidx/recyclerview/widget/RecyclerView;

.field private optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

.field private final panels:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
            ">;"
        }
    .end annotation
.end field

.field private xBubble:I

.field private yBubble:I


# direct methods
.method public static synthetic $r8$lambda$648h6DGimfIr_8AiRvJx-Hm_dj0(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToEnd$lambda$8(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic $r8$lambda$6_WGSC8jlYTPuTmCEF8cgxivTtE(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToNormal$lambda$15(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic $r8$lambda$9OItJk48JxsvOkwe_QT_3BIJCBY(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationStart$lambda$12$lambda$11(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic $r8$lambda$EMvsjTSEWfHCeqOxnGbNLmdCgZc(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToEnd$lambda$7(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic $r8$lambda$KIwexPKKDrL_rxo90HYs9D7OnbQ(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationStart$lambda$12$lambda$10(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic $r8$lambda$MxrQZuT-MoQn6nKNoll5zV_nwFU(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationStart$lambda$14(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Yceyr2-FMqOokYxDEN_Cf1ZbeQI(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->onDestroy$lambda$1(Lcom/alexmanzana/bubbleall/BubbleService;)V

    return-void
.end method

.method public static synthetic $r8$lambda$c8LHpTOFN56asHioysDDUxM_6MA(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/BubbleService;->animationStart$lambda$12(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$mW6f3XNBG9BQoOlbKnV-MYvvfQg(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->open$lambda$6(Lcom/alexmanzana/bubbleall/BubbleService;)V

    return-void
.end method

.method public static synthetic $r8$lambda$oIwjl2tsktFWQe-kSBxgdsKQzRE(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToNormal$lambda$16(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    .line 103
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->argsBubble:Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;

    .line 446
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->callbackHorizontal:Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;

    .line 475
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->callbackVertical:Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;

    .line 524
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mListenerMoveBubble:Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;

    return-void
.end method

.method public static final synthetic access$existsPanel(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/String;)Z
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->existsPanel(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    return-object p0
.end method

.method public static final synthetic access$getMBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/View;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/os/Handler;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getMPanelManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/window/PanelManager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    return-object p0
.end method

.method public static final synthetic access$getMView$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/widget/LinearLayout;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static final synthetic access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    return-object p0
.end method

.method public static final synthetic access$getMWindowManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    return-object p0
.end method

.method public static final synthetic access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getPositionForId(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/String;)I
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->getPositionForId(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$isHideBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isHideBubble:Z

    return p0
.end method

.method public static final synthetic access$isOnlyBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOnlyBubble:Z

    return p0
.end method

.method public static final synthetic access$isOpenManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    return p0
.end method

.method public static final synthetic access$isStarting$cp()Z
    .locals 1

    .line 39
    sget-boolean v0, Lcom/alexmanzana/bubbleall/BubbleService;->isStarting:Z

    return v0
.end method

.method public static final synthetic access$modifyBubble(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->modifyBubble()V

    return-void
.end method

.method public static final synthetic access$openManager(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->openManager()V

    return-void
.end method

.method public static final synthetic access$restartBubble(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->restartBubble()V

    return-void
.end method

.method public static final synthetic access$requestArgsBubble(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/content/Intent;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->requestArgsBubble(Landroid/content/Intent;)V

    return-void
.end method

.method public static final synthetic access$setStarting$cp(Z)V
    .locals 0

    .line 39
    sput-boolean p0, Lcom/alexmanzana/bubbleall/BubbleService;->isStarting:Z

    return-void
.end method

.method private final activePanel(Ljava/lang/String;)Z
    .locals 3

    .line 366
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 840
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 367
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 368
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->isActive()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final addForPosition(I)V
    .locals 9

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 751
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    add-int/lit8 p1, p1, -0x3

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    .line 752
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v2

    sget v4, Lcom/alexmanzana/bubbleall/R$id;->shortcutPanel:I

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceBitmap()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 749
    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->musicPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "music"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 748
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->videoPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "video"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 747
    :cond_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_web:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->webPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "web"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private final addForPosition(Ljava/lang/String;)V
    .locals 8

    .line 737
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x1cb54

    if-eq v0, v1, :cond_4

    const v1, 0x636ee25

    if-eq v0, v1, :cond_2

    const v1, 0x6b0147b

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "video"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 739
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->videoPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "video"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 737
    :cond_2
    const-string v0, "music"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 740
    :cond_3
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->musicPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "music"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 737
    :cond_4
    const-string v0, "web"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 738
    :cond_5
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_web:I

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->webPanel:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v1, "web"

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez p1, :cond_6

    const-string p1, "adapter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_6
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V

    return-void
.end method

.method private final animationStart(Landroid/content/Intent;)V
    .locals 7

    .line 657
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 658
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    const-string v2, "mPrefs"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    const-string v4, "yBubble"

    const/16 v5, 0xc8

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 659
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v3

    :cond_1
    const-string v2, "xBubble"

    const/4 v5, 0x0

    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 660
    const-string v4, "key_go_position"

    const/4 v5, 0x1

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const-wide/16 v4, 0x1f4

    if-eqz v0, :cond_2

    .line 661
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;

    invoke-direct {v3, p0, v1, v2, p1}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 695
    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v6, "mViewParams"

    if-nez v0, :cond_3

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 696
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 697
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez v0, :cond_5

    const-string v0, "mWindowManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v1, :cond_6

    const-string v1, "mView"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_6
    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v2, :cond_7

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_7
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 698
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_8

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    move-object v3, v0

    :goto_0
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda2;-><init>(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    return-void
.end method

.method private static final animationStart$lambda$12(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 662
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_0

    const-string v0, "mViewParams"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->yBubble:I

    .line 663
    filled-new-array {v0, p1}, [I

    move-result-object p1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 664
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda8;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda8;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v0, 0xc8

    .line 672
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 673
    iget v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->xBubble:I

    filled-new-array {v2, p2}, [I

    move-result-object p2

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p2

    .line 674
    new-instance v2, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda9;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda9;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 678
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 679
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x2

    .line 680
    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 681
    new-instance p1, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;

    invoke-direct {p1, p0, p3}, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/content/Intent;)V

    check-cast p1, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 692
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method private static final animationStart$lambda$12$lambda$10(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 666
    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    :try_start_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 667
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 669
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private static final animationStart$lambda$12$lambda$11(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 675
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 676
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private static final animationStart$lambda$14(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 700
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    const-string v0, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 701
    invoke-direct {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->openManager()V

    :cond_0
    return-void
.end method

.method private final animationToEnd(Ljava/lang/Runnable;)V
    .locals 6

    .line 601
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    const-string v2, "mViewParams"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->xBubble:I

    .line 602
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->yBubble:I

    const/4 v1, 0x0

    .line 603
    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 604
    new-instance v2, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda4;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda4;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0x96

    .line 608
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 609
    iget v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->xBubble:I

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    filled-new-array {v4, v5}, [I

    move-result-object v4

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v4

    .line 610
    new-instance v5, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda5;

    invoke-direct {v5, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda5;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 614
    invoke-virtual {v4, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 615
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v3, 0x2

    .line 616
    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v4, v3, v1

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 617
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$animationToEnd$3;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/BubbleService$animationToEnd$3;-><init>(Ljava/lang/Runnable;)V

    check-cast v0, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 625
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method private static final animationToEnd$lambda$7(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 605
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 606
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private static final animationToEnd$lambda$8(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 612
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final animationToNormal(Ljava/lang/Runnable;)V
    .locals 5

    .line 765
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    const-string v2, "mViewParams"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 766
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 767
    iget v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->yBubble:I

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 768
    new-instance v2, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda6;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda6;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0xe6

    .line 772
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 773
    iget v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->xBubble:I

    filled-new-array {v0, v4}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 774
    new-instance v4, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda7;

    invoke-direct {v4, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda7;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 778
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 779
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 780
    new-instance v3, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;

    invoke-direct {v3, p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;)V

    check-cast v3, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 p1, 0x2

    .line 794
    new-array p1, p1, [Landroid/animation/Animator;

    const/4 v3, 0x0

    aput-object v0, p1, v3

    const/4 v0, 0x1

    aput-object v1, p1, v0

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 795
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method static synthetic animationToNormal$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 764
    :cond_0
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToNormal(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final animationToNormal$lambda$15(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 769
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 770
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private static final animationToNormal$lambda$16(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAnimator1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 775
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v1, "mViewParams"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 776
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez p1, :cond_1

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "mView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez p0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final clearPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V
    .locals 6

    .line 375
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    const/4 v1, 0x0

    const-string v2, "mPanelManager"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_4

    .line 376
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_1
    invoke-virtual {v4, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 378
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v5

    if-eq v4, v5, :cond_3

    .line 379
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    invoke-virtual {v4, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->removeViewAt(I)V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 383
    :cond_4
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v1, v0

    :goto_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v0

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setPanelId(ILjava/lang/String;)V

    return-void
.end method

.method private final closeAllViews()V
    .locals 8

    .line 146
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    const-string v1, "mWindowManager"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v3, :cond_1

    const-string v3, "mView"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    check-cast v3, Landroid/view/View;

    # the view may have been created but never attached (quick start/stop) - ignore
    :try_start_rv1
    invoke-interface {v0, v3}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_rv1
    .catch Ljava/lang/Exception; {:try_start_rv1 .. :try_end_rv1} :catch_rv1

    goto :goto_rv1

    :catch_rv1
    move-exception v0

    :goto_rv1

    .line 147
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOnlyBubble:Z

    if-nez v0, :cond_7

    .line 148
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 838
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 149
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    const-string v5, "mPanelManager"

    if-nez v4, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v6

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v7

    # panel windows may not be attached either - best-effort teardown
    :try_start_rv2
    invoke-virtual {v4, v6, v7}, Lcom/alexmanzana/bubbleall/window/PanelManager;->destroy(ILjava/lang/String;)V

    .line 150
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v4, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_3
    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->removeView(I)V
    :try_end_rv2
    .catch Ljava/lang/Exception; {:try_start_rv2 .. :try_end_rv2} :catch_rv2

    goto :goto_0

    :catch_rv2
    move-exception v3

    goto :goto_0

    .line 152
    :cond_4
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v1, :cond_6

    const-string v1, "mViewManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v2, v1

    :goto_1
    # manager window may never have been attached - ignore
    :try_start_rv3
    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_rv3
    .catch Ljava/lang/Exception; {:try_start_rv3 .. :try_end_rv3} :catch_rv3

    goto :goto_rv3

    :catch_rv3
    move-exception v0

    :goto_rv3
    :cond_7
    const/4 v0, 0x0

    .line 154
    sput-boolean v0, Lcom/alexmanzana/bubbleall/BubbleService;->isStarting:Z

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->argsBubble:Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;

    check-cast v0, Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method private final closeManager(Ljava/lang/Runnable;)V
    .locals 4

    const/4 v0, 0x0

    .line 758
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    .line 759
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "mWindowManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v2, :cond_1

    const-string v2, "mViewManager"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParamsI:Landroid/view/WindowManager$LayoutParams;

    if-nez v3, :cond_2

    const-string v3, "mViewManagerParamsI"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v1

    :cond_2
    check-cast v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v2, v3}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 760
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToNormal(Ljava/lang/Runnable;)V

    .line 761
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez p1, :cond_3

    const-string p1, "mPanelManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, p1

    :goto_0
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->onBackground()V

    return-void
.end method

.method static synthetic closeManager$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 757
    :cond_0
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final declareProperties()V
    .locals 6

    .line 648
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    const-string v1, "mViewManager"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->optionsManager:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "findViewById(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

    .line 649
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->optionsManagerHorizontal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsHorizontal:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    .line 650
    const-string v0, "optionsHorizontal"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 651
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_3

    const-string v0, "optionsVertical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, v3, v5, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 652
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    const-string v1, "mBubble"

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mListenerMoveBubble:Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;

    check-cast v4, Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 653
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v2, v0

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v1, v3}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorBubble(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method private final declareReceiver()V
    .locals 4

    .line 93
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 94
    const-string v1, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 95
    const-string v1, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 96
    const-string v1, "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 97
    const-string v1, "com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    # restart is delivered via startService(), not a broadcast

    .line 99
    :try_start_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->argsBubble:Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;

    check-cast v1, Landroid/content/BroadcastReceiver;

    # API 33+ requires an explicit export flag for app broadcasts
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_legacy

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v0, v2}, Lcom/alexmanzana/bubbleall/BubbleService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_0

    :cond_legacy
    invoke-virtual {p0, v1, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private final declareValues()V
    .locals 14

    .line 172
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    .line 173
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 174
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v6, 0x8

    const/4 v7, -0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x7f6

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    goto :goto_0

    .line 180
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v12, 0x8

    const/4 v13, -0x2

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x7d2

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 173
    :goto_0
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParamsI:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    .line 186
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 187
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParamsI:Landroid/view/WindowManager$LayoutParams;

    const/4 v2, 0x0

    const-string v3, "mViewManagerParamsI"

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 188
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParamsI:Landroid/view/WindowManager$LayoutParams;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    const/16 v0, 0x50

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 189
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getBaseParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    .line 190
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getParamsManager()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParams:Landroid/view/WindowManager$LayoutParams;

    .line 191
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v2, "from(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mInflater:Landroid/view/LayoutInflater;

    .line 192
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mHandler:Landroid/os/Handler;

    .line 193
    const-string v0, "bubble_data_prefs"

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "getSharedPreferences(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    return-void
.end method

.method private final existsOption(I)Z
    .locals 7

    .line 352
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    const/4 v1, 0x0

    const-string v2, "mPanelManager"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildCount()I

    move-result v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_3

    .line 353
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v5, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_1
    invoke-virtual {v5, v4}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 355
    instance-of v6, v5, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v6, :cond_2

    .line 356
    check-cast v5, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v5}, Lcom/alexmanzana/bubbleall/window/Panel;->getId()I

    move-result v5

    if-ne v5, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method private final existsPanel(Ljava/lang/String;)Z
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 439
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final getBaseParams()Landroid/view/WindowManager$LayoutParams;
    .locals 14

    .line 225
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 226
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v6, 0x8

    const/4 v7, -0x3

    const/4 v3, -0x2

    const/4 v4, -0x2

    const/16 v5, 0x7f6

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    goto :goto_0

    .line 234
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v12, 0x8

    const/4 v13, -0x3

    const/4 v9, -0x2

    const/4 v10, -0x2

    const/16 v11, 0x7d2

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    :goto_0
    const v1, 0x800033

    .line 242
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 v1, 0x0

    .line 243
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 244
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    return-object v0
.end method

.method private final getParamsManager()Landroid/view/WindowManager$LayoutParams;
    .locals 14

    .line 197
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 198
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/high16 v6, 0x40000

    const/4 v7, -0x2

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/16 v5, 0x7f6

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    goto :goto_0

    .line 206
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/high16 v12, 0x2000000

    const/4 v13, -0x2

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/16 v11, 0x7d2

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    :goto_0
    const/4 v1, 0x0

    .line 214
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 215
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    const/16 v1, 0x30

    .line 216
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    return-object v0
.end method

.method private final getPositionActive()I
    .locals 4

    .line 639
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 843
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 640
    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->isActive()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    move v1, v3

    goto :goto_0

    .line 644
    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method private final getPositionForId(Ljava/lang/String;)I
    .locals 3

    .line 429
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 430
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 434
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private final modifyBubble()V
    .locals 5

    # null for the lateinit-fallback move-object v0, v1 paths below
    const/4 v1, 0x0

    .line 114
    # adapter does not exist in bubble-only mode; skip the recycler refresh
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-eqz v0, :cond_skip_adapter

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemRangeChanged(II)V

    :cond_skip_adapter
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getSizeBubble(Landroid/content/Context;)I

    move-result v0

    const/4 v3, 0x1

    const-string v4, "mBubble"

    if-eq v0, v3, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    .line 123
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_big:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 120
    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_small:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 117
    :cond_4
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_medium:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 126
    :goto_0
    # manager window may not exist in bubble-only mode
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-eqz v0, :cond_skip_manager

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->contentLayout:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v3, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v3, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorManager(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_skip_manager
    .line 127
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_7

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v3, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v3, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorBubble(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 128
    # PanelManager may not exist in bubble-only mode
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-eqz v0, :cond_skip_pm

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->refreshStyle()V

    :cond_skip_pm
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V

    return-void
.end method

.method private final applyAlpha()V
    .locals 8

    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "theme_alpha"

    const/16 v2, 0xff

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    int-to-float v1, v1

    const v2, 0x437f0000

    div-float/2addr v1, v2

    const-string v2, "keyboard_mode"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    # view-level alpha; fields may still be null when only the bubble is started
    :try_start_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-eqz v3, :cond_5

    # window-level alpha for the bubble window
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->isAttachedToWindow()Z

    move-result v6

    if-eqz v6, :cond_2

    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->alpha:F

    invoke-interface {v3, v4, v5}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    # window-level alpha + IME suppression flag for the manager window
    :cond_2
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParams:Landroid/view/WindowManager$LayoutParams;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_5

    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->alpha:F

    iget v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    const v7, 0x20000

    if-eqz v2, :cond_3

    or-int/2addr v6, v7

    goto :goto_0

    :cond_3
    not-int v7, v7

    and-int/2addr v6, v7

    :goto_0
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3, v4, v5}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    # switching to a suppressed mode (1/2/3): an already-open system IME
    # stays up until dismissed, so hide it and drop the WebView focus
    if-eqz v2, :cond_5

    const/4 v6, 0x0

    invoke-direct {p0, v6}, Lcom/alexmanzana/bubbleall/BubbleService;->hideSystemIme(I)V

    :cond_5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private final hideSystemIme(I)V
    .locals 4

    # close the system keyboard over the browser panel (modes 1/2/3)
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "mViewManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0, p1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    :cond_3
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->clearFocus()V

    :cond_4
    return-void
.end method

.method private final restartBubble()V
    .locals 5

    # in-place teardown: onStartCommand() detects ACTION_RESTART_BUBBLE,
    # calls this, then falls through to the normal boot path in the SAME
    # service instance - no stopSelf, no delayed start, no broadcast
    const/4 v0, 0x0

    # cancel every pending handler callback (animations, delayed jumps)
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mHandler:Landroid/os/Handler;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    # manager window: remove if attached; the boot path re-adds it
    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_2

    :try_start_0
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-eqz v2, :cond_1

    invoke-interface {v2, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    :cond_1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :cond_2

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    # browser panels: destroy every tab and clear the panel list
    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    :try_start_1
    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v4

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->destroy(ILjava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/alexmanzana/bubbleall/window/PanelManager;->removeView(I)V

    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    # reset flags so the boot path rebuilds from scratch
    :cond_5
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isInitManger:Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/alexmanzana/bubbleall/BubbleService;->isStarting:Z

    return-void
.end method

.method private static final onDestroy$lambda$1(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->closeAllViews()V

    return-void
.end method

.method private final open()V
    .locals 3

    const/4 v0, 0x1

    .line 585
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    .line 586
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "mViewManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 587
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_1

    const-string v0, "mBubble"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 588
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda3;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->animationToEnd(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final open$lambda$6(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isInitManger:Z

    const-string v1, "mViewManagerParams"

    const-string v2, "mViewManager"

    const-string v3, "mWindowManager"

    const/4 v4, 0x0

    if-nez v0, :cond_3

    .line 590
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_0
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v5, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v4

    :cond_1
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v6, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v4

    :cond_2
    check-cast v6, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v5, v6}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x1

    .line 591
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isInitManger:Z

    .line 593
    :cond_3
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v0, :cond_4

    const-string v0, "mBubble"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_4
    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 594
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v3, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_6
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManagerParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v2, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_7
    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v3, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 595
    # the manager window was just attached; applyAlpha() ran earlier at boot,
    # when mViewManagerParams did not exist yet - so the opened manager (and
    # everything in it) rendered at full opacity while the bubble kept the
    # user's transparency. Re-apply now that the window exists.
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->toTop()V

    .line 596
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez p0, :cond_8

    const-string p0, "mPanelManager"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    move-object v4, p0

    :goto_0
    invoke-virtual {v4}, Lcom/alexmanzana/bubbleall/window/PanelManager;->playBackground()V

    return-void
.end method

.method private final openManager()V
    .locals 2

    .line 577
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 578
    invoke-static {p0, v1, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V

    goto :goto_0

    .line 580
    :cond_0
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->open()V

    :goto_0
    return-void
.end method

.method private final prepareAddView()V
    .locals 2

    .line 388
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_0

    const-string v0, "mViewManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->addView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/views/AddView;

    if-nez v0, :cond_1

    goto :goto_0

    .line 389
    :cond_1
    new-instance v1, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    check-cast v1, Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/AddView;->setListenerAdd(Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V

    :goto_0
    return-void
.end method

.method private final preparePanel(Landroid/content/Intent;)V
    .locals 8

    .line 709
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    const-string v1, "mViewManager"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->contentLayout:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v3, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorManager(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 710
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->containerPanel:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "findViewById(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/window/PanelManager;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 711
    const-string v3, "mPanelManager"

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v5, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    :cond_3
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->toolbarManager:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setToolbar(Landroid/view/View;)V

    .line 712
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v5, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    :cond_5
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->recyclerOptions:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v5}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setList(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 713
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v5, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    :cond_7
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->toastView:I

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setToast(Landroid/widget/TextView;)V

    .line 714
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_8
    move-object v1, p0

    check-cast v1, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setListener(Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;)V

    .line 715
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_9
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->init()V

    .line 717
    invoke-static {v4}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 718
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    if-nez v1, :cond_a

    const-string v1, "mPrefs"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_a
    const-string v4, "menu_option"

    const/4 v5, -0x1

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 719
    const-string v4, "get(...)"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz p1, :cond_b

    const-string v7, "com.alexmanzana.bubbleall.EXTRA_ITEM_ONLY"

    invoke-virtual {p1, v7, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    if-ne v7, v6, :cond_b

    .line 720
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 721
    const-string v0, "com.alexmanzana.bubbleall.EXTRA_ITEM_DATA"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.alexmanzana.bubbleall.pojos.ItemData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemData;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->addForPosition(Ljava/lang/String;)V

    .line 722
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->clearPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V

    goto :goto_0

    .line 724
    :cond_b
    const-string v7, "key_main_only_menu"

    invoke-interface {v0, v7, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 725
    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->addForPosition(I)V

    .line 726
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->clearPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V

    goto :goto_0

    .line 728
    :cond_c
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_d
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->addView:I

    const-string v4, "add"

    invoke-virtual {v0, v1, v4}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setPanelId(ILjava/lang/String;)V

    .line 732
    :goto_0
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->requestArgsBubble(Landroid/content/Intent;)V

    .line 733
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez p1, :cond_e

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_e
    move-object v2, p1

    :goto_1
    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->refreshStyle()V

    return-void
.end method

.method private final requestArgsBubble(Landroid/content/Intent;)V
    .locals 4

    if-eqz p1, :cond_4

    .line 330
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 331
    const-string v0, "com.alexmanzana.bubbleall.EXTRA_ITEM_DATA"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.alexmanzana.bubbleall.pojos.ItemData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemData;

    .line 332
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getResource()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->existsOption(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 333
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->existsPanel(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 334
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->activePanel(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 335
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez v1, :cond_0

    const-string v1, "adapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/alexmanzana/bubbleall/BubbleService;->getPositionForId(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V

    .line 337
    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->toTop()V

    goto :goto_0

    .line 339
    :cond_2
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->addForPosition(Ljava/lang/String;)V

    .line 340
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->toTop()V

    .line 342
    :goto_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v1, :cond_3

    const-string v1, "mPanelManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getResource()I

    move-result v1

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemData;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setDataExtra(ILjava/lang/Object;)V

    .line 343
    const-string v0, "com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 344
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->openManager()V

    :cond_4
    return-void
.end method

.method private final requestLayoutOrientation()V
    .locals 10

    .line 508
    new-instance v0, Landroidx/recyclerview/widget/ItemTouchHelper;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->callbackVertical:Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;

    check-cast v1, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "optionsVertical"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 509
    new-instance v0, Landroidx/recyclerview/widget/ItemTouchHelper;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->callbackHorizontal:Lcom/alexmanzana/bubbleall/BubbleService$callbackHorizontal$1;

    check-cast v1, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsHorizontal:Landroidx/recyclerview/widget/RecyclerView;

    const-string v4, "optionsHorizontal"

    if-nez v1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ItemTouchHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 510
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const-string v1, "adapter"

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-string v8, "mViewManager"

    if-ne v0, v7, :cond_7

    .line 511
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_2
    sget v9, Lcom/alexmanzana/bubbleall/R$id;->optionsManager:I

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 512
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_3

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    sget v8, Lcom/alexmanzana/bubbleall/R$id;->optionsManagerHorizontal:I

    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 513
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez v2, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_5
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 514
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsHorizontal:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_6
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_0

    .line 516
    :cond_7
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_8
    sget v9, Lcom/alexmanzana/bubbleall/R$id;->optionsManager:I

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 517
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    if-nez v0, :cond_9

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_9
    sget v5, Lcom/alexmanzana/bubbleall/R$id;->optionsManagerHorizontal:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsVertical:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_a
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 519
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->optionsHorizontal:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_b

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_b
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez v2, :cond_c

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_c
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 521
    :goto_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez v0, :cond_d

    const-string v0, "mPanelManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_d
    move-object v3, v0

    :goto_1
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v7, :cond_e

    move v6, v7

    :cond_e
    invoke-virtual {v3, v6}, Lcom/alexmanzana/bubbleall/window/PanelManager;->changeOrientation(Z)V

    return-void
.end method

.method private final toTop()V
    .locals 4

    .line 629
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->getPositionActive()I

    move-result v0

    .line 630
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 631
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "add"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 632
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 633
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 634
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez v1, :cond_0

    const-string v1, "adapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1, v0, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemMoved(II)V

    :cond_1
    return-void
.end method


# virtual methods
.method public activeBubble()V
    .locals 1

    const/4 v0, 0x0

    .line 816
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isHideBubble:Z

    return-void
.end method

.method public addBubbleInPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 820
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    const/4 v1, 0x0

    const-string v2, "adapter"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->disableAll()V

    .line 821
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 822
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-virtual {v1, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemInserted(I)V

    return-void
.end method

.method public hideBubble()V
    .locals 1

    const/4 v0, 0x1

    .line 808
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isHideBubble:Z

    return-void
.end method

.method public hideNormal()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 812
    invoke-static {p0, v0, v1, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V

    return-void
.end method

.method public isVisibleBubble()Z
    .locals 1

    .line 221
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isHideBubble:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onClick(Ljava/lang/String;II)Z
    .locals 0

    const-string p2, "id"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 826
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService;->mPanelManager:Lcom/alexmanzana/bubbleall/window/PanelManager;

    if-nez p2, :cond_0

    const-string p2, "mPanelManager"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p2, p3, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setPanelId(ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onClose()V
    .locals 0

    .line 831
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->hideNormal()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 800
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->requestLayoutOrientation()V

    return-void
.end method

.method public onCreate()V
    .locals 6

    .line 73
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const/4 v0, 0x1

    .line 74
    sput-boolean v0, Lcom/alexmanzana/bubbleall/BubbleService;->isStarting:Z

    .line 75
    new-instance v1, Landroid/content/Intent;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    const-class v3, Lcom/alexmanzana/bubbleall/DynamicActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    const-string v3, "com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    new-instance v3, Landroidx/core/app/NotificationCompat$Builder;

    const-string v4, "channel_service"

    invoke-direct {v3, v2, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    sget v4, Lcom/alexmanzana/bubbleall/R$drawable;->ic_service_small:I

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v4, 0x0

    const/high16 v5, 0x4000000

    .line 79
    invoke-static {v2, v4, v1, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 80
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorBubble(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 81
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_description_service:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 82
    invoke-virtual {v3, v0}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 84
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 85
    invoke-virtual {v3, v0}, Landroidx/core/app/NotificationCompat$Builder;->setColorized(Z)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    const/4 v0, 0x4

    .line 87
    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->startForeground(ILandroid/app/Notification;)V

    .line 88
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->declareValues()V

    .line 89
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->declareReceiver()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 161
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/BubbleService;->isOpenManager:Z

    if-eqz v0, :cond_0

    .line 162
    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/BubbleService;)V

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService;->closeAllViews()V

    .line 168
    :goto_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 16

    move-object/from16 v0, p0

    # restart request: tear everything down in place, then fall through to
    # the normal boot path below with a null intent (manager-first startup)
    if-eqz p1, :cond_restart_done

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.alexmanzana.bubbleall.ACTION_RESTART_BUBBLE"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_restart_done

    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->restartBubble()V

    # null the intent so the boot path below takes the manager-first branch
    const/4 v1, 0x0

    move-object/from16 p1, v1

    :cond_restart_done
    new-instance v1, Landroid/widget/LinearLayout;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    const/4 v3, 0x1

    .line 252
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 253
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    const-string v4, "mView"

    const/4 v5, 0x0

    if-nez v1, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_0
    const/16 v6, 0x31

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 256
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mInflater:Landroid/view/LayoutInflater;

    const-string v6, "mInflater"

    if-nez v1, :cond_1

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_1
    sget v7, Lcom/alexmanzana/bubbleall/R$layout;->layout_bubble:I

    iget-object v8, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v8, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v5

    :cond_2
    check-cast v8, Landroid/view/ViewGroup;

    const/4 v9, 0x0

    invoke-virtual {v1, v7, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const-string v7, "inflate(...)"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    .line 259
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getSizeBubble(Landroid/content/Context;)I

    move-result v1

    const/4 v8, 0x2

    const-string v10, "mBubble"

    if-eq v1, v3, :cond_6

    if-eq v1, v8, :cond_4

    .line 267
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v1, :cond_3

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_3
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_big:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 264
    :cond_4
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v1, :cond_5

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_5
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_small:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 261
    :cond_6
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v1, :cond_7

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_7
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_medium:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 272
    :goto_0
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v1, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    .line 273
    :cond_8
    iget-object v3, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v3, :cond_9

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v5

    .line 274
    :cond_9
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v11, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    check-cast v11, Landroid/view/ViewGroup$LayoutParams;

    .line 272
    invoke-virtual {v1, v3, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p1, :cond_a

    .line 280
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_a
    move-object v1, v5

    :goto_1
    const-string v3, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->isOnlyBubble:Z

    .line 282
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    const-string v11, "mWindowManager"

    if-nez v1, :cond_b

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_b
    iget-object v12, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v12, :cond_c

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v12, v5

    :cond_c
    check-cast v12, Landroid/view/View;

    iget-object v13, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    const-string v14, "mViewParams"

    if-nez v13, :cond_d

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v13, v5

    :cond_d
    check-cast v13, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v1, v12, v13}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p1, :cond_e

    .line 284
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_e
    move-object v1, v5

    :goto_2
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 285
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    const-string v12, "mPrefs"

    if-nez v1, :cond_f

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_f
    const-string v13, "xBubble"

    invoke-interface {v1, v13, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 286
    iget-object v13, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mPrefs:Landroid/content/SharedPreferences;

    if-nez v13, :cond_10

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v13, v5

    :cond_10
    const-string v12, "yBubble"

    const/16 v15, 0xc8

    invoke-interface {v13, v12, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v12

    .line 287
    iget-object v13, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v13, :cond_11

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v13, v5

    :cond_11
    iget-object v15, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mListenerMoveBubble:Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;

    check-cast v15, Landroid/view/View$OnTouchListener;

    invoke-virtual {v13, v15}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 288
    iget-object v13, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mBubble:Landroid/view/View;

    if-nez v13, :cond_12

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v13, v5

    :cond_12
    invoke-virtual {v13}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v10

    sget-object v13, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v13, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorBubble(Landroid/content/Context;)I

    move-result v13

    invoke-virtual {v10, v13}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 289
    iget-object v10, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v10, :cond_13

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v10, v5

    :cond_13
    iput v1, v10, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 290
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v1, :cond_14

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_14
    iput v12, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 291
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mWindowManager:Landroid/view/WindowManager;

    if-nez v1, :cond_15

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_15
    iget-object v10, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mView:Landroid/widget/LinearLayout;

    if-nez v10, :cond_16

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v10, v5

    :cond_16
    check-cast v10, Landroid/view/View;

    iget-object v4, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewParams:Landroid/view/WindowManager$LayoutParams;

    if-nez v4, :cond_17

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v5

    :cond_17
    check-cast v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v1, v10, v4}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V

    :cond_18
    if-eqz p1, :cond_19

    .line 294
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_19
    move-object v1, v5

    :goto_3
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 296
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mInflater:Landroid/view/LayoutInflater;

    if-nez v1, :cond_1a

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_1a
    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->layout_window:I

    invoke-virtual {v1, v3, v5, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->mViewManager:Landroid/view/View;

    .line 299
    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 301
    const-string v2, "key_main_only_menu"

    invoke-interface {v1, v2, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1b

    .line 302
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    .line 303
    new-instance v2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 305
    sget v11, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_add_24:I

    .line 306
    sget v12, Lcom/alexmanzana/bubbleall/R$id;->addView:I

    const/4 v14, 0x0

    const/4 v15, 0x1

    .line 303
    const-string v10, "add"

    const/4 v13, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    .line 302
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    :cond_1b
    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-object v2, v0

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;

    iget-object v3, v0, Lcom/alexmanzana/bubbleall/BubbleService;->panels:Ljava/util/ArrayList;

    invoke-direct {v1, v2, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;-><init>(Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;Ljava/util/ArrayList;)V

    iput-object v1, v0, Lcom/alexmanzana/bubbleall/BubbleService;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    .line 314
    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->prepareAddView()V

    .line 319
    invoke-direct/range {p0 .. p1}, Lcom/alexmanzana/bubbleall/BubbleService;->preparePanel(Landroid/content/Intent;)V

    .line 320
    invoke-direct/range {p0 .. p1}, Lcom/alexmanzana/bubbleall/BubbleService;->animationStart(Landroid/content/Intent;)V

    .line 321
    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->declareProperties()V

    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->applyAlpha()V

    .line 322
    invoke-direct/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/BubbleService;->requestLayoutOrientation()V

    :cond_1c
    return v8
.end method
