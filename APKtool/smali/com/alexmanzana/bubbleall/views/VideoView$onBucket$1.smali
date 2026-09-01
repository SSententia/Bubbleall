.class public final Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;
.super Ljava/lang/Object;
.source "VideoView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/VideoView;->onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/VideoView$onBucket$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;",
        "onReceived",
        "",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
        "Lkotlin/collections/ArrayList;",
        "grid",
        "",
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
.field final synthetic $listVideosR:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/VideoView;


# direct methods
.method public static synthetic $r8$lambda$9mhnHfDD9QDpLMlVyyDpIoLYuoY(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->onReceived$lambda$2$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$B6PAITZV1e4_SQzv8SdtGNby5sM(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->onReceived$lambda$2(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$tAlF21edgUNGPU5u9kMYOTa6vOk(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->onReceived$lambda$2$lambda$1(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/views/VideoView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->$listVideosR:Landroidx/recyclerview/widget/RecyclerView;

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onReceived$lambda$2(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getListVideos$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-lez p2, :cond_0

    .line 324
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 326
    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 328
    :goto_0
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getListVideos$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->notifyItemRangeChanged(II)V

    :cond_1
    const/4 p1, 0x1

    .line 329
    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$setOpenBucket$p(Lcom/alexmanzana/bubbleall/views/VideoView;Z)V

    .line 330
    sget p3, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, p3}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 331
    new-instance p3, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_arrow_back_24:I

    new-instance v1, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    invoke-direct {p3, v0, v1}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    .line 333
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_star_outline_24:I

    .line 331
    new-instance v2, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda2;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    .line 333
    invoke-direct {v0, v1, v2}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    aput-object p3, v1, p2

    aput-object v0, v1, p1

    .line 331
    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    return-void
.end method

.method private static final onReceived$lambda$2$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->onBackPressed()V

    return-void
.end method

.method private static final onReceived$lambda$2$lambda$1(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$favoriteMode(Lcom/alexmanzana/bubbleall/views/VideoView;)V

    return-void
.end method


# virtual methods
.method public onReceived(Ljava/util/ArrayList;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1;->$listVideosR:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, p1, p2, v2}, Lcom/alexmanzana/bubbleall/views/VideoView$onBucket$1$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
