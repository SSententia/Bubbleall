.class public final Lcom/alexmanzana/bubbleall/views/MusicView;
.super Lcom/alexmanzana/bubbleall/window/Panel;
.source "MusicView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMusicView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicView.kt\ncom/alexmanzana/bubbleall/views/MusicView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n177#2,2:576\n177#2,2:578\n177#2,2:580\n177#2,2:582\n1#3:584\n*S KotlinDebug\n*F\n+ 1 MusicView.kt\ncom/alexmanzana/bubbleall/views/MusicView\n*L\n247#1:576,2\n248#1:578,2\n253#1:580,2\n254#1:582,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b3\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001$\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B%\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0008\u0010,\u001a\u00020)H\u0016J\u0008\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017H\u0002J\u0018\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\rH\u0016J\u0008\u0010:\u001a\u00020)H\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u00109\u001a\u00020<H\u0016J\u0018\u0010;\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00172\u0006\u00102\u001a\u00020\rH\u0016J\u0012\u0010=\u001a\u00020)2\u0008\u00109\u001a\u0004\u0018\u00010\"H\u0016J\u0008\u0010>\u001a\u00020)H\u0017J\u0008\u0010?\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020)2\u0006\u00109\u001a\u00020\"H\u0016J\"\u0010A\u001a\u00020)2\u0008\u00109\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0015H\u0016J\u0012\u0010E\u001a\u00020)2\u0008\u00109\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u00109\u001a\u00020BH\u0016J\u0008\u0010G\u001a\u00020)H\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u00100\u001a\u00020\rH\u0002J\u0008\u0010I\u001a\u00020)H\u0016J\u0008\u0010J\u001a\u00020)H\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/views/MusicView;",
        "Lcom/alexmanzana/bubbleall/window/Panel;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;",
        "Landroid/widget/SeekBar$OnSeekBarChangeListener;",
        "Landroid/media/MediaPlayer$OnPreparedListener;",
        "Landroid/media/MediaPlayer$OnCompletionListener;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;",
        "audioManager",
        "Landroid/media/AudioManager;",
        "currentPosition",
        "isAudioFocus",
        "",
        "itemCurrent",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "listenerFocus",
        "Landroid/media/AudioFocusRequest;",
        "mHandler",
        "Landroid/os/Handler;",
        "mManager",
        "Landroid/app/NotificationManager;",
        "mediaSession",
        "Landroid/support/v4/media/session/MediaSessionCompat;",
        "modeRepeat",
        "playerCurrent",
        "Landroid/media/MediaPlayer;",
        "receiver",
        "com/alexmanzana/bubbleall/views/MusicView$receiver$1",
        "Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;",
        "updaterProgress",
        "Ljava/lang/Runnable;",
        "args",
        "",
        "item",
        "",
        "declareStyle",
        "loadDataInSheet",
        "loadImage",
        "loadMusic",
        "id",
        "",
        "position",
        "info",
        "",
        "loadNotification",
        "speed",
        "",
        "onAudioFocusChange",
        "p0",
        "onBackPressed",
        "onClick",
        "Landroid/view/View;",
        "onCompletion",
        "onCreate",
        "onDestroy",
        "onPrepared",
        "onProgressChanged",
        "Landroid/widget/SeekBar;",
        "p1",
        "p2",
        "onStartTrackingTouch",
        "onStopTrackingTouch",
        "pauseMedia",
        "positionMusic",
        "start",
        "updateRepeatCenter",
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
.field private adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

.field private audioManager:Landroid/media/AudioManager;

.field private currentPosition:I

.field private isAudioFocus:Z

.field private itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

.field private listenerFocus:Landroid/media/AudioFocusRequest;

.field private mHandler:Landroid/os/Handler;

.field private mManager:Landroid/app/NotificationManager;

.field private mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;

.field private modeRepeat:I

.field private playerCurrent:Landroid/media/MediaPlayer;

.field private final receiver:Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

.field private final updaterProgress:Ljava/lang/Runnable;


# direct methods
.method public static synthetic $r8$lambda$WwfpFi2AHfOmyzF8wIXtBAqX5zs(Lcom/alexmanzana/bubbleall/views/MusicView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->onCreate$lambda$4$lambda$2(Lcom/alexmanzana/bubbleall/views/MusicView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$g8z9fUOeRACmAI7aLLJEFZXF7ss(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->onCreate$lambda$4$lambda$3(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/MusicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/MusicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/Panel;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 54
    iput p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    .line 63
    new-instance p1, Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    check-cast p1, Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    .line 218
    new-instance p1, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->receiver:Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

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

    .line 44
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/MusicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    return-object p0
.end method

.method public static final synthetic access$getCurrentPosition$p(Lcom/alexmanzana/bubbleall/views/MusicView;)I
    .locals 0

    .line 44
    iget p0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    return p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/os/Handler;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getMManager$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/app/NotificationManager;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mManager:Landroid/app/NotificationManager;

    return-object p0
.end method

.method public static final synthetic access$getPlayerCurrent$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/media/MediaPlayer;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method public static final synthetic access$loadNotification(Lcom/alexmanzana/bubbleall/views/MusicView;F)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    return-void
.end method

.method public static final synthetic access$positionMusic(Lcom/alexmanzana/bubbleall/views/MusicView;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->positionMusic(I)V

    return-void
.end method

.method public static final synthetic access$setAdapter$p(Lcom/alexmanzana/bubbleall/views/MusicView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    return-void
.end method

.method private final loadDataInSheet()V
    .locals 10

    .line 234
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v0, :cond_2

    .line 235
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->sheetMusic:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 236
    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v2

    const-string v3, "from(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 237
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const/4 v1, 0x3

    .line 238
    invoke-virtual {v2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 239
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->listMusic:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    const/16 v2, 0x3c

    int-to-float v2, v2

    .line 240
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v4, v4

    const/16 v5, 0xa0

    int-to-float v5, v5

    div-float/2addr v4, v5

    mul-float/2addr v2, v4

    float-to-int v2, v2

    .line 239
    invoke-virtual {v1, v3, v3, v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setPadding(IIII)V

    .line 241
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->imageMusicPreview:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/ImageView;

    .line 242
    sget v4, Lcom/alexmanzana/bubbleall/R$id;->imageMusic:I

    invoke-virtual {p0, v4}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/ImageView;

    .line 243
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->titleMusicPreview:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/widget/TextView;

    .line 244
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->authorMusicPreview:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    const/4 v2, 0x1

    .line 245
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 246
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getImage()Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    .line 247
    move-object v9, v1

    check-cast v9, Landroid/view/View;

    .line 576
    invoke-virtual {v9, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 248
    move-object v9, v4

    check-cast v9, Landroid/view/View;

    .line 578
    invoke-virtual {v9, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 249
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 250
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 251
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 246
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    if-nez v8, :cond_1

    .line 252
    move-object v2, p0

    check-cast v2, Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 253
    move-object v2, v1

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x7

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v8, v8

    div-float/2addr v8, v5

    mul-float/2addr v3, v8

    float-to-int v3, v3

    .line 580
    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 254
    move-object v2, v4

    check-cast v2, Landroid/view/View;

    const/16 v3, 0x64

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v8, v8

    div-float/2addr v8, v5

    mul-float/2addr v3, v8

    float-to-int v3, v3

    .line 582
    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 255
    const-string v2, "#cccccc"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 256
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_music_note_24:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 257
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_music_note_24:I

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 259
    :cond_1
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getTitle()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getAuthor()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method private final loadImage(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;)V
    .locals 3

    .line 435
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 436
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 437
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 438
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->setImage(Landroid/graphics/Bitmap;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final loadMusic(JI)V
    .locals 4

    .line 296
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 298
    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_2
    const/4 v0, 0x0

    .line 299
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    .line 300
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 301
    const-string v2, "key_music_focus"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 302
    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->isAudioFocus:Z

    if-nez v1, :cond_9

    .line 303
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_7

    .line 304
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->listenerFocus:Landroid/media/AudioFocusRequest;

    if-eqz v1, :cond_9

    .line 305
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v2, :cond_3

    invoke-static {v2, v1}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 306
    :cond_3
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v2, :cond_4

    invoke-static {v2, v1}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_4
    if-nez v0, :cond_5

    goto :goto_0

    .line 307
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_6

    .line 308
    iput-boolean v3, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->isAudioFocus:Z

    goto :goto_1

    :cond_6
    :goto_0
    return-void

    .line 314
    :cond_7
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_8

    move-object v1, p0

    check-cast v1, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 315
    :cond_8
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_9

    move-object v1, p0

    check-cast v1, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 319
    :cond_9
    :goto_1
    sget-object v0, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "withAppendedId(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    iput p3, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    .line 321
    new-instance p2, Landroid/media/MediaPlayer;

    invoke-direct {p2}, Landroid/media/MediaPlayer;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    .line 322
    move-object p3, p0

    check-cast p3, Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {p2, p3}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 323
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p2, :cond_a

    move-object p3, p0

    check-cast p3, Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {p2, p3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 324
    :cond_a
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p2, :cond_b

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 325
    :cond_b
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    .line 326
    :cond_c
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 327
    :cond_d
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadDataInSheet()V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 328
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    return-void
.end method

.method private final loadMusic(Ljava/lang/String;)V
    .locals 10

    .line 420
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    .line 421
    sget-object v0, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->getId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v6

    const-string v0, "withAppendedId(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->getId()J

    move-result-wide v4

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->getAuthor()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;-><init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 423
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    .line 424
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadImage(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;)V

    .line 425
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getId()J

    move-result-wide v0

    const/4 p1, -0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadMusic(JI)V

    return-void
.end method

.method private final loadNotification(F)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p1

    .line 352
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 353
    const-string v3, "key_music_notification"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 357
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    const-string v5, "com.alexmanzana.bubbleall.Music.BACK"

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    const/high16 v6, 0x4000000

    invoke-static {v2, v5, v3, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 358
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v3

    new-instance v7, Landroid/content/Intent;

    const-string v8, "com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v5, v7, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 359
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v7

    new-instance v8, Landroid/content/Intent;

    const-string v9, "com.alexmanzana.bubbleall.Music.REFRESH"

    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v5, v8, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    .line 360
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v8

    new-instance v9, Landroid/content/Intent;

    const-string v10, "com.alexmanzana.bubbleall.Music.NEXT"

    invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v8, v5, v9, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    .line 361
    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v9

    new-instance v10, Landroid/content/Intent;

    const-string v11, "com.alexmanzana.bubbleall.Music.CLOSE"

    invoke-direct {v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v9, v5, v10, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 364
    :try_start_0
    iget-object v9, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, ""

    if-eqz v9, :cond_4

    .line 365
    :try_start_1
    new-instance v12, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v12}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    .line 366
    const-string v13, "android.media.metadata.TITLE"

    iget-object v14, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v14, :cond_0

    invoke-virtual {v14}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getTitle()Ljava/lang/String;

    move-result-object v14

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v12, v13, v14}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v12

    .line 367
    const-string v13, "android.media.metadata.AUTHOR"

    iget-object v14, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v14, :cond_1

    invoke-virtual {v14}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getAuthor()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_2

    :cond_1
    move-object v14, v10

    :cond_2
    invoke-virtual {v12, v13, v14}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v12

    .line 368
    const-string v13, "android.media.metadata.DURATION"

    iget-object v14, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v14, :cond_3

    invoke-virtual {v14}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v14

    goto :goto_1

    :cond_3
    move v14, v5

    :goto_1
    int-to-long v14, v14

    invoke-virtual {v12, v13, v14, v15}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putLong(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v12

    .line 369
    invoke-virtual {v12}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v12

    .line 364
    invoke-virtual {v9, v12}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 372
    :cond_4
    iget-object v9, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;

    if-eqz v9, :cond_5

    new-instance v12, Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;

    invoke-direct {v12, v1}, Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    check-cast v12, Landroid/support/v4/media/session/MediaSessionCompat$Callback;

    invoke-virtual {v9, v12}, Landroid/support/v4/media/session/MediaSessionCompat;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;)V

    :cond_5
    const/4 v9, 0x0

    cmpg-float v9, v0, v9

    if-nez v9, :cond_6

    .line 381
    sget v9, Lcom/alexmanzana/bubbleall/R$drawable;->ic_play:I

    const/4 v14, 0x2

    goto :goto_2

    .line 384
    :cond_6
    sget v9, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    const/4 v14, 0x3

    .line 387
    :goto_2
    iget-object v15, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;

    if-eqz v15, :cond_8

    .line 388
    new-instance v5, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    invoke-direct {v5}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;-><init>()V

    .line 389
    iget-object v11, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v11

    goto :goto_3

    :cond_7
    const/4 v11, 0x0

    :goto_3
    int-to-long v12, v11

    invoke-virtual {v5, v14, v12, v13, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setState(IJF)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v0

    const-wide/16 v11, 0x100

    .line 390
    invoke-virtual {v0, v11, v12}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setActions(J)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v0

    .line 391
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->build()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    .line 387
    invoke-virtual {v15, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 395
    :cond_8
    iget-object v0, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getImage()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v5, 0x64

    invoke-static {v5, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v5, "createBitmap(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    :cond_a
    new-instance v5, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual/range {p0 .. p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v11

    const-string v12, "music_channel"

    invoke-direct {v5, v11, v12}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 398
    sget v11, Lcom/alexmanzana/bubbleall/R$drawable;->ic_service_small:I

    invoke-virtual {v5, v11}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    .line 399
    iget-object v11, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getTitle()Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_b
    const/4 v11, 0x0

    :goto_4
    check-cast v11, Ljava/lang/CharSequence;

    invoke-virtual {v5, v11}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    .line 400
    iget-object v11, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz v11, :cond_d

    invoke-virtual {v11}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getAuthor()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_c

    goto :goto_5

    :cond_c
    move-object v10, v11

    :cond_d
    :goto_5
    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v5, v10}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    .line 401
    invoke-virtual {v5, v0}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 402
    sget v5, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_refresh_24:I

    const-string v10, "Refresh"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5, v10, v7}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 403
    sget v5, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_skip_previous_24:I

    const-string v7, "Back"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5, v7, v2}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 404
    const-string v2, "Play/Pause"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v9, v2, v3}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 405
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_skip_next_24:I

    const-string v3, "Next"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2, v3, v8}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 406
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_close:I

    const-string v3, "Close"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2, v3, v6}, Landroidx/core/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 408
    new-instance v2, Landroidx/media/app/NotificationCompat$MediaStyle;

    invoke-direct {v2}, Landroidx/media/app/NotificationCompat$MediaStyle;-><init>()V

    const/4 v3, 0x2

    const/4 v5, 0x3

    filled-new-array {v4, v3, v5}, [I

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/media/app/NotificationCompat$MediaStyle;->setShowActionsInCompactView([I)Landroidx/media/app/NotificationCompat$MediaStyle;

    move-result-object v2

    .line 409
    iget-object v3, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v11

    goto :goto_6

    :cond_e
    const/4 v11, 0x0

    :goto_6
    invoke-virtual {v2, v11}, Landroidx/media/app/NotificationCompat$MediaStyle;->setMediaSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media/app/NotificationCompat$MediaStyle;

    move-result-object v2

    check-cast v2, Landroidx/core/app/NotificationCompat$Style;

    .line 407
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    .line 410
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v2, "build(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    iget-object v2, v1, Lcom/alexmanzana/bubbleall/views/MusicView;->mManager:Landroid/app/NotificationManager;

    if-eqz v2, :cond_f

    const/16 v3, 0xffc

    invoke-virtual {v2, v3, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    .line 414
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_f
    :goto_7
    return-void
.end method

.method private static final onCreate$action(Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 3

    const/16 v0, 0x8

    .line 181
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->setVisibility(I)V

    .line 182
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/alexmanzana/bubbleall/MusicActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->startActivity(Landroid/content/Intent;)V

    .line 183
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->closeManager()V

    return-void
.end method

.method private static final onCreate$lambda$4$lambda$2(Lcom/alexmanzana/bubbleall/views/MusicView;Landroid/view/View;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iget p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 138
    iput p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 140
    iput p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    .line 142
    :goto_0
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->updateRepeatCenter()V

    return-void
.end method

.method private static final onCreate$lambda$4$lambda$3(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 2

    const-string p1, "$this_apply"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    const/4 v0, 0x4

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    .line 146
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    if-ne p1, v0, :cond_1

    .line 148
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final positionMusic(I)V
    .locals 4

    .line 529
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    if-eqz v0, :cond_1

    .line 530
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->getItemCount()I

    move-result v1

    .line 531
    iget v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 532
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    if-ne p1, v2, :cond_0

    .line 533
    iget p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    add-int/lit8 v1, v1, -0x1

    if-ge p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 535
    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->get(I)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V

    goto :goto_0

    .line 537
    :cond_0
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    if-ne p1, v1, :cond_1

    .line 538
    iget p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    if-lez p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    .line 540
    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->get(I)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static final start$action$9(Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 3

    const/4 v0, 0x0

    .line 269
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    if-nez v0, :cond_0

    .line 271
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/MusicPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;

    invoke-direct {v2, p0, p0}, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;Lcom/alexmanzana/bubbleall/views/MusicView;)V

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;

    invoke-virtual {v0, v1, v2}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;->list(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;)V

    .line 270
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    return-void
.end method

.method private final updateRepeatCenter()V
    .locals 5

    .line 199
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->repeatLayout:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 200
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->imageRepeat:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/ImageView;

    .line 201
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->textRepeat:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/TextView;

    .line 203
    iget v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    if-eqz v1, :cond_1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    if-ne v1, v4, :cond_2

    .line 207
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_repeat:I

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 208
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_repeat_24:I

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 204
    :cond_1
    :goto_0
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_repeat_one:I

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 205
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_repeat_one_24:I

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 211
    :cond_2
    :goto_1
    iget v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    if-eqz v1, :cond_3

    .line 212
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_2

    .line 214
    :cond_3
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :goto_2
    return-void
.end method


# virtual methods
.method public args(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadMusic(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public declareStyle()V
    .locals 11

    .line 332
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->currentTextMusic:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 333
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->durationTextMusic:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 334
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->sheetMusic:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 335
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->buttonHideSheet:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v4, "findViewById(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/ImageView;

    .line 336
    sget v5, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    invoke-virtual {p0, v5}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/widget/ImageView;

    .line 337
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/widget/ImageView;

    .line 338
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->titleMusicPreview:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    .line 339
    sget v8, Lcom/alexmanzana/bubbleall/R$id;->authorMusicPreview:I

    invoke-virtual {p0, v8}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/widget/TextView;

    .line 340
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->declareStyle()V

    .line 341
    :cond_0
    sget-object v4, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v9

    const-string v10, "getContext(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 343
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 344
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 345
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorManager(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 346
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 347
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 348
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method

.method public onAudioFocusChange(I)V
    .locals 5

    .line 556
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 557
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v2, -0x2

    .line 558
    const-string v3, "key_music_notification"

    const/4 v4, 0x1

    if-eq p1, v2, :cond_3

    const/4 v2, -0x1

    if-eq p1, v2, :cond_3

    if-eq p1, v4, :cond_0

    goto :goto_0

    .line 566
    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 567
    :cond_1
    iput-boolean v4, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->isAudioFocus:Z

    if-eqz v0, :cond_2

    .line 568
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 569
    :cond_2
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    const/high16 p1, 0x3f800000    # 1.0f

    .line 570
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    goto :goto_0

    .line 559
    :cond_3
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->pause()V

    :cond_4
    const/4 p1, 0x0

    .line 560
    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->isAudioFocus:Z

    if-eqz v0, :cond_5

    .line 561
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_arrow_24:I

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 562
    :cond_5
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    .line 563
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    :cond_6
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 498
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetMusic:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 500
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 551
    :cond_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->pauseMedia()V

    goto :goto_1

    .line 549
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->positionMusic(I)V

    :goto_1
    return-void
.end method

.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    .line 467
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadImage(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;)V

    .line 468
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadMusic(JI)V

    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 505
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 506
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 507
    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_arrow_24:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 508
    const-string v0, "key_music_notification"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 509
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    .line 511
    :cond_0
    iget v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->modeRepeat:I

    if-nez v0, :cond_2

    .line 512
    const-string v0, "key_music_focus"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 513
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_1

    .line 514
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->listenerFocus:Landroid/media/AudioFocusRequest;

    if-eqz p1, :cond_4

    .line 515
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_4

    invoke-static {v0, p1}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    goto :goto_0

    .line 518
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz p1, :cond_4

    move-object v0, p0

    check-cast v0, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    goto :goto_0

    :cond_2
    if-ne v0, v1, :cond_3

    .line 522
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    if-eqz p1, :cond_4

    iget v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->currentPosition:I

    invoke-virtual {p0, p1, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x2

    if-ne v0, p1, :cond_4

    .line 524
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->positionMusic(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onCreate()V
    .locals 8

    .line 110
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->layout_music_window:I

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 111
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    .line 112
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    .line 113
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mManager:Landroid/app/NotificationManager;

    .line 114
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Music"

    invoke-direct {v0, v1, v2}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mediaSession:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    .line 116
    invoke-static {v0}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(I)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    .line 117
    move-object v2, p0

    check-cast v2, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-static {v1, v2}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 118
    new-instance v2, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 119
    invoke-virtual {v2, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v2, 0x2

    .line 120
    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    .line 118
    invoke-static {v1, v0}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 122
    invoke-static {v1}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->listenerFocus:Landroid/media/AudioFocusRequest;

    .line 124
    :cond_0
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sheetMusic:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 125
    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    .line 126
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->repeatCenter:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout;

    .line 127
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->buttonHideSheet:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/ImageView;

    .line 128
    sget v4, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v4}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/ImageView;

    .line 129
    sget v5, Lcom/alexmanzana/bubbleall/R$id;->progressMusic:I

    invoke-virtual {p0, v5}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/widget/SeekBar;

    .line 130
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    invoke-virtual {p0, v6}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/widget/ImageView;

    .line 131
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/ImageView;

    .line 132
    move-object v2, p0

    check-cast v2, Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    move-object v6, p0

    check-cast v6, Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v5, v6}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 135
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    new-instance v2, Lcom/alexmanzana/bubbleall/views/MusicView$$ExternalSyntheticLambda7;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/MusicView$$ExternalSyntheticLambda7;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    new-instance v1, Lcom/alexmanzana/bubbleall/views/MusicView$$ExternalSyntheticLambda8;

    invoke-direct {v1, v0}, Lcom/alexmanzana/bubbleall/views/MusicView$$ExternalSyntheticLambda8;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    new-instance v1, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 174
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 175
    const-string v1, "com.alexmanzana.bubbleall.Music.CLOSE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 176
    const-string v1, "com.alexmanzana.bubbleall.Music.REFRESH"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 177
    const-string v1, "com.alexmanzana.bubbleall.Music.BACK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 178
    const-string v1, "com.alexmanzana.bubbleall.Music.NEXT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 179
    const-string v1, "com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 185
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_1

    .line 186
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->receiver:Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

    check-cast v2, Landroid/content/BroadcastReceiver;

    const/4 v3, 0x4

    invoke-static {v1, v2, v0, v3}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 187
    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 188
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->onCreate$action(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    goto :goto_0

    .line 191
    :cond_1
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->receiver:Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

    check-cast v2, Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 192
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 193
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->onCreate$action(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 443
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 444
    const-string v1, "key_music_focus"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 446
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->listenerFocus:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_1

    .line 447
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v1, :cond_1

    invoke-static {v1, v0}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    goto :goto_0

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 453
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mManager:Landroid/app/NotificationManager;

    if-eqz v0, :cond_2

    const/16 v1, 0xffc

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 454
    :cond_2
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->receiver:Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;

    check-cast v1, Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 455
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 456
    :cond_3
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 457
    :cond_4
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_5
    const/4 v0, 0x0

    .line 458
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    .line 459
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    .line 460
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->itemCurrent:Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    .line 461
    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    .line 462
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->removeAllViews()V

    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 4

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->durationTextMusic:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 488
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->progressMusic:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/SeekBar;

    .line 489
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/ImageView;

    .line 490
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 491
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setMax(I)V

    const/4 v2, 0x0

    .line 492
    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 493
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 494
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 476
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 482
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->updaterProgress:Ljava/lang/Runnable;

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 483
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    return-void
.end method

.method public pauseMedia()V
    .locals 8

    .line 77
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 78
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->pauseButton:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/ImageView;

    .line 79
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->playerCurrent:Landroid/media/MediaPlayer;

    if-eqz v2, :cond_6

    .line 80
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v3

    const-string v4, "key_music_notification"

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 81
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    .line 84
    :cond_0
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->pause()V

    .line 85
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_arrow_24:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 87
    :cond_1
    const-string v3, "key_music_focus"

    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 88
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1a

    if-lt v3, v6, :cond_4

    .line 89
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->listenerFocus:Landroid/media/AudioFocusRequest;

    if-eqz v3, :cond_5

    .line 90
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v6, :cond_2

    invoke-static {v6, v3}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_5

    :goto_1
    return-void

    .line 96
    :cond_4
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/MusicView;->audioManager:Landroid/media/AudioManager;

    if-eqz v3, :cond_5

    move-object v6, p0

    check-cast v6, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v7, 0x3

    invoke-virtual {v3, v6, v7, v5}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 99
    :cond_5
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V

    .line 100
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_pause:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 101
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    .line 102
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V

    :cond_6
    :goto_2
    return-void
.end method

.method public start()V
    .locals 2

    .line 265
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_music:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->requestTitle(Ljava/lang/String;)V

    .line 266
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->requestIconToolbar(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 267
    new-array v0, v0, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    .line 284
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 285
    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->start$action$9(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    goto :goto_0

    .line 289
    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->start$action$9(Lcom/alexmanzana/bubbleall/views/MusicView;)V

    :cond_1
    :goto_0
    return-void
.end method
