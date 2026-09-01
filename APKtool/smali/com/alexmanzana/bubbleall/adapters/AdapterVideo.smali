.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterVideo.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAdapterVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterVideo.kt\ncom/alexmanzana/bubbleall/adapters/AdapterVideo\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,132:1\n177#2,2:133\n177#2,2:135\n*S KotlinDebug\n*F\n+ 1 AdapterVideo.kt\ncom/alexmanzana/bubbleall/adapters/AdapterVideo\n*L\n105#1:133,2\n112#1:135,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u001c\u0010\u0019\u001a\u00020\u0011*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
        "Lkotlin/collections/ArrayList;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;",
        "isThemed",
        "",
        "(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;Z)V",
        "getItemCount",
        "",
        "getItemViewType",
        "position",
        "loadImage2",
        "",
        "view",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "setDrawableLeft",
        "Landroid/widget/TextView;",
        "resource",
        "color",
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
            "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;


# direct methods
.method public static synthetic $r8$lambda$6wPE3zQSNRgkddXwxyHVQZIWkZY(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;ILcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;ILcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
            ">;",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;",
            "Z)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;

    iput-boolean p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->isThemed:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 24
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;Z)V

    return-void
.end method

.method private final loadImage2(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;I)V
    .locals 11

    .line 68
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    int-to-float v2, v2

    .line 71
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v3, v3

    const/16 v4, 0xa0

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v2, v3

    .line 74
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_2

    .line 75
    new-instance v3, Ljava/io/File;

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, v4

    move-object v3, v1

    goto :goto_0

    .line 80
    :cond_1
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->getMimeType(Landroid/content/Context;Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    .line 81
    sget v6, Lcom/alexmanzana/bubbleall/R$string;->file_provider_authority:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6, v3}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_0

    .line 84
    :cond_2
    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v3, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 85
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->getMimeType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    .line 88
    :goto_0
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v6, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v6}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getDuration()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    const/4 v7, 0x0

    if-lez v6, :cond_8

    .line 89
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    sget-object v8, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    iget-object v9, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v9}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getDuration()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    :goto_1
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v6, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v6}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite()Z

    move-result v6

    const/4 v8, -0x1

    if-eqz v6, :cond_5

    .line 91
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v6, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v6}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result v6

    if-ne v6, v5, :cond_4

    .line 92
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v5

    if-eqz v5, :cond_6

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_folder_outline:I

    invoke-direct {p0, v5, v6, v8}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->setDrawableLeft(Landroid/widget/TextView;II)V

    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v5

    if-eqz v5, :cond_6

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    invoke-direct {p0, v5, v6, v8}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->setDrawableLeft(Landroid/widget/TextView;II)V

    goto :goto_2

    .line 97
    :cond_5
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v5

    if-eqz v5, :cond_6

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_play_circle_outline_24:I

    invoke-direct {p0, v5, v6, v8}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->setDrawableLeft(Landroid/widget/TextView;II)V

    .line 99
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 101
    :cond_8
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getDuration()Landroid/widget/TextView;

    move-result-object v5

    if-nez v5, :cond_9

    goto :goto_3

    :cond_9
    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_3
    if-eqz v1, :cond_b

    .line 105
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 133
    invoke-virtual {v1, v7, v7, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 106
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result p2

    if-nez p2, :cond_a

    .line 107
    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    move-result-object p2

    goto :goto_4

    .line 109
    :cond_a
    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p2

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->placeholder(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/RequestBuilder;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    move-result-object p2

    :goto_4
    move-object v4, p2

    :cond_b
    if-nez v4, :cond_c

    .line 111
    move-object p2, p0

    check-cast p2, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    .line 112
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    float-to-int v0, v2

    .line 135
    invoke-virtual {p2, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 113
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object p1

    sget p2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_folder_outline:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_c
    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;ILcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;Landroid/view/View;)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$holder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p3}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket()Z

    move-result p3

    const-string v0, "get(...)"

    if-eqz p3, :cond_2

    .line 56
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getItemViewType()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_1

    .line 57
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p3}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getId()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p3}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object p3

    :cond_0
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-interface {p2, p1, p3, p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;->onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    goto :goto_0

    .line 59
    :cond_1
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p3}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object p3

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-interface {p2, p1, p3, p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;->onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    goto :goto_0

    .line 62
    :cond_2
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-interface {p2, p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    :goto_0
    return-void
.end method

.method private final setDrawableLeft(Landroid/widget/TextView;II)V
    .locals 1

    .line 118
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_1

    .line 119
    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 120
    :cond_1
    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getType()I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 24
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;I)V
    .locals 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getItemViewType()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getItemViewType()I

    move-result v0

    if-ne v0, v1, :cond_3

    .line 45
    :cond_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->list:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->getName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    :goto_0
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->isThemed:Z

    if-eqz v0, :cond_2

    .line 47
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$color;->colorPrimaryText:I

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 52
    :cond_3
    :goto_1
    invoke-direct {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->loadImage2(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;I)V

    .line 53
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 54
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;ILcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;
    .locals 4

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const-string v0, "inflate(...)"

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_0

    .line 31
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_video_bucket:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 30
    :cond_0
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_video:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_video_explorer:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 28
    :cond_2
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_video_bucket:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method
