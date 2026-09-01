.class public final Lcom/alexmanzana/bubbleall/views/VideoView;
.super Lcom/alexmanzana/bubbleall/window/Panel;
.source "VideoView.kt"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoView.kt\ncom/alexmanzana/bubbleall/views/VideoView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n177#2,2:404\n1#3:406\n*S KotlinDebug\n*F\n+ 1 VideoView.kt\ncom/alexmanzana/bubbleall/views/VideoView\n*L\n249#1:404,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0008\u0010!\u001a\u00020\u001eH\u0016J\u0008\u0010\"\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002J\u0008\u0010&\u001a\u00020\u001eH\u0016J \u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0010H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0012\u0010.\u001a\u00020\u001e2\u0008\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0008\u00101\u001a\u00020\u001eH\u0016J\u0008\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\"\u00104\u001a\u00020\u001e2\u0008\u0010/\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0010H\u0016J\u0012\u00108\u001a\u00020\u001e2\u0008\u0010/\u001a\u0004\u0018\u000105H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010/\u001a\u000205H\u0016J\u0008\u0010:\u001a\u00020\u001eH\u0016J\u0008\u0010;\u001a\u00020\u001eH\u0016J\u0008\u0010<\u001a\u00020\u001eH\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0015j\u0008\u0012\u0004\u0012\u00020\u0013`\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/views/VideoView;",
        "Lcom/alexmanzana/bubbleall/window/Panel;",
        "Landroid/widget/SeekBar$OnSeekBarChangeListener;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;",
        "Landroid/media/MediaPlayer$OnCompletionListener;",
        "Landroid/media/MediaPlayer$OnPreparedListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;",
        "isOpenBucket",
        "",
        "isRepeat",
        "itemCurrent",
        "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
        "listVideos",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "mHandler",
        "Landroid/os/Handler;",
        "updaterProgress",
        "Ljava/lang/Runnable;",
        "videoPlayer",
        "Landroid/widget/VideoView;",
        "args",
        "",
        "item",
        "",
        "declareStyle",
        "favoriteMode",
        "loadPlayVideo",
        "uri",
        "Landroid/net/Uri;",
        "onBackPressed",
        "onBucket",
        "position",
        "name",
        "",
        "onChangeOrientation",
        "isVertical",
        "onClick",
        "onCompletion",
        "p0",
        "Landroid/media/MediaPlayer;",
        "onCreate",
        "onDestroy",
        "onPrepared",
        "onProgressChanged",
        "Landroid/widget/SeekBar;",
        "progress",
        "p2",
        "onStartTrackingTouch",
        "onStopTrackingTouch",
        "pauseMedia",
        "start",
        "updateFavorite",
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
.field private adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

.field private isOpenBucket:Z

.field private isRepeat:Z

.field private itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

.field private final listVideos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
            ">;"
        }
    .end annotation
.end field

.field private mHandler:Landroid/os/Handler;

.field private final updaterProgress:Ljava/lang/Runnable;

.field private videoPlayer:Landroid/widget/VideoView;


# direct methods
.method public static synthetic $r8$lambda$2ZYuBjrKhS90lf1vhfJFsGBmXrE(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->start$lambda$2(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$36jPmp0qWKb1jIlxIHawLt_V8Tw(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onCreate$lambda$9$lambda$7(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$4ZqqA_sKCg8PIUYcc9mL68fKemA(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->favoriteMode$lambda$12(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$HPBDHPrxEEF0UkfvxmSfPvhJVfw(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->start$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$SR6G5leD6AxnSOn8vG8irgdY5Z8(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onCreate$lambda$4(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$UvkoJHRPk7ioL1sYwCh4z_tAVjI(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onCreate$lambda$9$lambda$8(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$lH5z4S3W4V-dUGafxy781qx-q3s(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->onBackPressed$lambda$11(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$m-_XPvsr8ncEIP2Nyubk2DhV1D4(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->start$lambda$1(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$s3wMF0xqqv6iR2GcKIoRYEHH0gk(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onCreate$lambda$9$lambda$5(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/Panel;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    .line 375
    new-instance p1, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    check-cast p1, Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

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

    .line 38
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$favoriteMode(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->favoriteMode()V

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    return-object p0
.end method

.method public static final synthetic access$getListVideos$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Ljava/util/ArrayList;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/os/Handler;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getVideoPlayer$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/widget/VideoView;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    return-object p0
.end method

.method public static final synthetic access$setAdapter$p(Lcom/alexmanzana/bubbleall/views/VideoView;Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    return-void
.end method

.method public static final synthetic access$setOpenBucket$p(Lcom/alexmanzana/bubbleall/views/VideoView;Z)V
    .locals 0

    .line 38
    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isOpenBucket:Z

    return-void
.end method

.method private final favoriteMode()V
    .locals 4

    .line 342
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 343
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 344
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_arrow_back_24:I

    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda3;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-direct {v0, v1, v2}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    .line 345
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->listVideos:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 346
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 347
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    if-eqz v1, :cond_0

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->notifyItemRangeChanged(II)V

    .line 348
    :cond_0
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 349
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/alexmanzana/bubbleall/views/VideoView$favoriteMode$2;

    invoke-direct {v3, p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView$favoriteMode$2;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Landroidx/recyclerview/widget/RecyclerView;)V

    check-cast v3, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    invoke-virtual {v1, v2, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->favoriteList(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;)V

    return-void
.end method

.method private static final favoriteMode$lambda$12(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->onBackPressed()V

    return-void
.end method

.method private final loadPlayVideo(Landroid/net/Uri;)V
    .locals 4

    .line 276
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    const/4 v1, 0x0

    const-string v2, "videoPlayer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 277
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    move-object v3, p0

    check-cast v3, Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v0, v3}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 278
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    move-object v3, p0

    check-cast v3, Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v3}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 279
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v0, p1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 280
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, p1

    :goto_0
    invoke-virtual {v1}, Landroid/widget/VideoView;->start()V

    return-void
.end method

.method private static final onBackPressed$lambda$11(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->favoriteMode()V

    return-void
.end method

.method private static final onCreate$lambda$4(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->pauseMedia()V

    return-void
.end method

.method private static final onCreate$lambda$9$lambda$5(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isRepeat:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isRepeat:Z

    if-eqz v0, :cond_0

    .line 147
    sget p0, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 149
    :cond_0
    sget p0, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method

.method private static final onCreate$lambda$9$lambda$7(Lcom/alexmanzana/bubbleall/views/VideoView;Landroid/view/View;)V
    .locals 5

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    if-eqz p1, :cond_3

    .line 154
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_0

    move-object v3, v4

    :cond_0
    invoke-virtual {v0, v1, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, p1

    :goto_0
    invoke-virtual {v0, v1, v4}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->deleteFavorite(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 157
    :cond_2
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->addFavorite(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    .line 159
    :goto_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->updateFavorite()V

    :cond_3
    return-void
.end method

.method private static final onCreate$lambda$9$lambda$8(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 2

    const-string p1, "$this_apply"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    const/4 v0, 0x4

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    .line 164
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    if-ne p1, v0, :cond_1

    .line 166
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static final start$action(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 7

    .line 86
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->updateFavorite()V

    const/4 v0, 0x0

    .line 87
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->setVisibility(I)V

    .line 88
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    if-nez v0, :cond_0

    .line 89
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "getContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/alexmanzana/bubbleall/views/VideoView$start$action$1$1;

    invoke-direct {v0, p0, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$start$action$1$1;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Lcom/alexmanzana/bubbleall/views/VideoView;)V

    move-object v3, v0

    check-cast v3, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->list$default(Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;Ljava/lang/String;ILjava/lang/Object;)V

    .line 88
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    return-void
.end method

.method private static final start$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->onBackPressed()V

    return-void
.end method

.method private static final start$lambda$1(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->favoriteMode()V

    return-void
.end method

.method private static final start$lambda$2(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->favoriteMode()V

    return-void
.end method

.method private final updateFavorite()V
    .locals 5

    .line 119
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->favoriteCenter:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 120
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->favoriteImage:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 121
    sget-object v2, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    const-string v4, ""

    :cond_1
    invoke-virtual {v2, v3, v4}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 122
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 123
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_24:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 124
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/alexmanzana/bubbleall/R$color;->colorPrimary:I

    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 126
    :cond_2
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 127
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_outline_24:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    const-string v0, "#4d4d4d"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public args(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    .line 368
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    goto :goto_0

    .line 371
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    :goto_0
    return-void
.end method

.method public declareStyle()V
    .locals 8

    .line 199
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->currentTextVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 200
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->durationTextVideo:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 201
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->sheetVideo:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 202
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->titlePreview:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 203
    sget v4, Lcom/alexmanzana/bubbleall/R$id;->buttonHideSheet:I

    invoke-virtual {p0, v4}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 204
    sget-object v5, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 205
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorManager(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 206
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 208
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method

.method public onBackPressed()V
    .locals 9

    .line 284
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    .line 286
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_outline_24:I

    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda8;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda8;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-direct {v0, v1, v2}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    .line 287
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isOpenBucket:Z

    if-eqz v0, :cond_1

    .line 288
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->listVideos:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 289
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x3

    invoke-direct {v1, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 290
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 291
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    if-eqz v1, :cond_0

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->notifyItemRangeChanged(II)V

    .line 292
    :cond_0
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 293
    sget-object v3, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v1, "getContext(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;

    invoke-direct {v1, p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Landroidx/recyclerview/widget/RecyclerView;)V

    move-object v5, v1

    check-cast v5, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->list$default(Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;Ljava/lang/String;ILjava/lang/Object;)V

    .line 308
    :cond_1
    iput-boolean v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isOpenBucket:Z

    goto :goto_0

    .line 310
    :cond_2
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :goto_0
    return-void
.end method

.method public onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
    .locals 2

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "item"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->listVideos:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 316
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 317
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p3, v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->notifyItemRangeChanged(II)V

    .line 318
    :cond_0
    sget p3, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, p3}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ProgressBar;

    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 319
    sget-object p3, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;

    invoke-direct {v1, p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Landroidx/recyclerview/widget/RecyclerView;)V

    check-cast v1, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    invoke-virtual {p3, v0, p2, v1}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->listFiles(Landroid/content/Context;Ljava/lang/String;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;)V

    return-void
.end method

.method public onChangeOrientation(Z)V
    .locals 4

    .line 64
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->listVideos:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, p1}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->grid(Landroid/content/Context;Z)I

    move-result p1

    if-eqz p1, :cond_0

    .line 67
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :goto_0
    return-void
.end method

.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
    .locals 10

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    :try_start_0
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    .line 239
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    .line 240
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 241
    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    .line 242
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->imageVideoPreview:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 243
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->titlePreview:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 244
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, ""

    const/4 v6, 0x1

    if-eq v4, v6, :cond_0

    .line 245
    :try_start_1
    sget-object v4, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    goto :goto_0

    .line 247
    :cond_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v7

    sget v8, Lcom/alexmanzana/bubbleall/R$string;->file_provider_authority:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/io/File;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    move-object v9, v5

    :cond_1
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v7, v8}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 249
    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v7, v2

    check-cast v7, Landroid/view/View;

    .line 404
    invoke-virtual {v7, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 250
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 251
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 252
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result v2

    if-eq v2, v6, :cond_2

    .line 253
    sget-object p1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "getContext(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v2, v4}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->getName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 255
    :cond_2
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_4

    .line 256
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, p1

    :goto_1
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 258
    :cond_4
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    :goto_2
    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isRepeat:Z

    if-nez p1, :cond_5

    const/4 p1, 0x3

    .line 262
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 264
    :cond_5
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->listVideos:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x3c

    int-to-float v0, v0

    .line 265
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v2, v2

    const/16 v3, 0xa0

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 264
    invoke-virtual {p1, v1, v1, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setPadding(IIII)V

    .line 266
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v4}, Lcom/alexmanzana/bubbleall/views/VideoView;->loadPlayVideo(Landroid/net/Uri;)V

    .line 267
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->updateFavorite()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 270
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 387
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    .line 388
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_arrow_24:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 389
    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isRepeat:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 6

    .line 133
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->layout_video_window:I

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 134
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->videoView:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/VideoView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    .line 135
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    .line 136
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda4;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda4;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 138
    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    .line 139
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->progressVideo:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/SeekBar;

    .line 140
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->buttonHideSheet:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 141
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->favoriteCenter:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 142
    sget v4, Lcom/alexmanzana/bubbleall/R$id;->repeatCenter:I

    invoke-virtual {p0, v4}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 143
    move-object v5, p0

    check-cast v5, Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v2, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 144
    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda5;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda5;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-virtual {v4, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda6;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda6;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda7;

    invoke-direct {v2, v0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda7;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    new-instance v1, Lcom/alexmanzana/bubbleall/views/VideoView$onCreate$3;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$onCreate$3;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 183
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/16 v2, 0x8

    if-lt v0, v1, :cond_0

    .line 184
    const-string v0, "android.permission.READ_MEDIA_VIDEO"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 185
    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->setVisibility(I)V

    .line 186
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/alexmanzana/bubbleall/VideoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->startActivity(Landroid/content/Intent;)V

    .line 187
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->closeManager()V

    goto :goto_0

    .line 190
    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->setVisibility(I)V

    .line 192
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/alexmanzana/bubbleall/VideoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->startActivity(Landroid/content/Intent;)V

    .line 193
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->closeManager()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 212
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->listVideos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 213
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    .line 214
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    if-nez v1, :cond_0

    const-string v1, "mHandler"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_0
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 215
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v1, :cond_1

    const-string v1, "videoPlayer"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 216
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->removeAllViews()V

    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 4

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->durationTextVideo:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 394
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/ImageView;

    .line 395
    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 396
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->progressVideo:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/SeekBar;

    .line 397
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setMax(I)V

    const/4 v2, 0x0

    .line 398
    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 399
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    if-nez p1, :cond_0

    const-string p1, "mHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .line 220
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->videoSeekText:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 221
    sget-object p3, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    int-to-long v0, p2

    invoke-virtual {p3, v0, v1}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 225
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->layoutSeekVideo:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 226
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    if-nez p1, :cond_0

    const-string p1, "mHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    const-string v1, "mHandler"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 231
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v0, :cond_1

    const-string v0, "videoPlayer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 232
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->mHandler:Landroid/os/Handler;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p1

    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->updaterProgress:Ljava/lang/Runnable;

    const-wide/16 v0, 0x64

    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 233
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->layoutSeekVideo:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public pauseMedia()V
    .locals 4

    .line 53
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 54
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    const/4 v2, 0x0

    const-string v3, "videoPlayer"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 55
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v2}, Landroid/widget/VideoView;->pause()V

    .line 56
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_arrow_24:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 58
    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->videoPlayer:Landroid/widget/VideoView;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    invoke-virtual {v2}, Landroid/widget/VideoView;->start()V

    .line 59
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_2
    return-void
.end method

.method public start()V
    .locals 6

    .line 74
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_video:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestTitle(Ljava/lang/String;)V

    .line 75
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestIconToolbar(Ljava/lang/Object;)V

    .line 76
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView;->isOpenBucket:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 77
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_arrow_back_24:I

    new-instance v4, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-direct {v0, v3, v4}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    .line 79
    new-instance v3, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v4, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_outline_24:I

    .line 77
    new-instance v5, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda1;

    invoke-direct {v5, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    .line 79
    invoke-direct {v3, v4, v5}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    const/4 v4, 0x2

    new-array v4, v4, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    aput-object v0, v4, v1

    aput-object v3, v4, v2

    .line 77
    invoke-virtual {p0, v4}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    goto :goto_0

    .line 83
    :cond_0
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v3, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_outline_24:I

    new-instance v4, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda2;

    invoke-direct {v4, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$$ExternalSyntheticLambda2;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-direct {v0, v3, v4}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    new-array v2, v2, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    aput-object v0, v2, v1

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    .line 107
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    .line 108
    const-string v0, "android.permission.READ_MEDIA_VIDEO"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 109
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->start$action(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    goto :goto_1

    .line 112
    :cond_1
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->start$action(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    :cond_2
    :goto_1
    return-void
.end method
