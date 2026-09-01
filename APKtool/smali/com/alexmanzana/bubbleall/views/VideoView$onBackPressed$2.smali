.class public final Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;
.super Ljava/lang/Object;
.source "VideoView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/VideoView;->onBackPressed()V
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
        "com/alexmanzana/bubbleall/views/VideoView$onBackPressed$2",
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
.method public static synthetic $r8$lambda$McFqK61X1QBr1H1NTl-NBifTR0M(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->onReceived$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/views/VideoView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->$listVideosR:Landroidx/recyclerview/widget/RecyclerView;

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onReceived$lambda$0(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getListVideos$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-lez p2, :cond_0

    .line 298
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 300
    :cond_0
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 302
    :goto_0
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getListVideos$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;->notifyItemRangeChanged(II)V

    .line 303
    :cond_1
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

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

    .line 295
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2;->$listVideosR:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, p1, p2, v2}, Lcom/alexmanzana/bubbleall/views/VideoView$onBackPressed$2$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/views/VideoView;Ljava/util/ArrayList;ILandroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
