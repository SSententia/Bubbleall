.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterMusic.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAdapterMusic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterMusic.kt\ncom/alexmanzana/bubbleall/adapters/AdapterMusic\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,93:1\n177#2,2:94\n177#2,2:96\n177#2,2:98\n*S KotlinDebug\n*F\n+ 1 AdapterMusic.kt\ncom/alexmanzana/bubbleall/adapters/AdapterMusic\n*L\n58#1:94,2\n70#1:96,2\n76#1:98,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "Lkotlin/collections/ArrayList;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;",
        "isThemed",
        "",
        "(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;Z)V",
        "declareStyle",
        "",
        "get",
        "id",
        "",
        "getItemCount",
        "loadImage",
        "view",
        "Landroid/widget/ImageView;",
        "position",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "ViewHolder",
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
.field private final isThemed:Z

.field private final list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;


# direct methods
.method public static synthetic $r8$lambda$0jNFLd_VfQ1SLmli9LrcawV-fsY(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->loadImage$lambda$9$lambda$8(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic $r8$lambda$S0jrogWwWJHPI0fABBInVyxMDKE(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->onBindViewHolder$lambda$2(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$rs1APKadgPBZu-vTn84iJJgjMo4(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->loadImage$lambda$9$lambda$8$lambda$5$lambda$4(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$zOj780K4MaeZH0W1qOqbNP7cLNg(Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->loadImage$lambda$9$lambda$8$lambda$7$lambda$6(Landroid/content/Context;Landroid/widget/ImageView;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
            ">;",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;",
            "Z)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;

    iput-boolean p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->isThemed:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;Z)V

    return-void
.end method

.method private final loadImage(Landroid/widget/ImageView;I)V
    .locals 8

    .line 55
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 56
    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getImage()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    move-object p2, p1

    check-cast p2, Landroid/view/View;

    const/4 v1, 0x0

    .line 94
    invoke-virtual {p2, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 59
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 60
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    .line 61
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    new-instance v7, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p0

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;-><init>(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :goto_0
    return-void
.end method

.method private static final loadImage$lambda$9$lambda$8(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V
    .locals 4

    const-string v0, "$view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_run"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$mHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 63
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 64
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    new-instance p4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x2

    .line 67
    iput v1, p4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 68
    iget-object v1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p4

    invoke-virtual {v1, p4}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->setImage(Landroid/graphics/Bitmap;)V

    .line 69
    new-instance p4, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda2;

    invoke-direct {p4, p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda2;-><init>(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;I)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 74
    :cond_0
    new-instance p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;

    invoke-direct {p1, p4, p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;-><init>(Landroid/content/Context;Landroid/widget/ImageView;)V

    invoke-virtual {p3, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private static final loadImage$lambda$9$lambda$8$lambda$5$lambda$4(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;I)V
    .locals 2

    const-string v0, "$view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_run"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    .line 96
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 71
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getImage()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final loadImage$lambda$9$lambda$8$lambda$7$lambda$6(Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 2

    const-string v0, "$view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    int-to-float v0, v0

    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p0, p0

    const/16 v1, 0xa0

    int-to-float v1, v1

    div-float/2addr p0, v1

    mul-float/2addr v0, p0

    .line 76
    move-object p0, p1

    check-cast p0, Landroid/view/View;

    float-to-int v0, v0

    .line 98
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 77
    sget p0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_music_note_24:I

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$2(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-interface {p2, p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final declareStyle()V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public final get(I)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 21
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;I)V
    .locals 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getTitleMusic()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getTitle()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getImageMusic()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 38
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->isThemed:Z

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getTitleMusic()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 40
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getAuthorMusic()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getImageMusic()Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->loadImage(Landroid/widget/ImageView;I)V

    .line 43
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getAuthor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getAuthorMusic()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getAuthorMusic()Landroid/widget/TextView;

    move-result-object v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 46
    move-object v0, p0

    check-cast v0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    .line 47
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->getAuthorMusic()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 49
    :cond_2
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_music:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
