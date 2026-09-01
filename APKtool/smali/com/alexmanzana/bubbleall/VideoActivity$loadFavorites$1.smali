.class public final Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;
.super Ljava/lang/Object;
.source "VideoActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/VideoActivity;->loadFavorites()V
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
        "com/alexmanzana/bubbleall/VideoActivity$loadFavorites$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/VideoActivity;


# direct methods
.method public static synthetic $r8$lambda$U-O36gqQxnMzsW96l9RFsLwufr0(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;->onReceived$lambda$0(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/VideoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;->this$0:Lcom/alexmanzana/bubbleall/VideoActivity;

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onReceived$lambda$0(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V
    .locals 3

    const-string v0, "$list"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 133
    sget p0, Lcom/alexmanzana/bubbleall/R$id;->textListEmpty:I

    invoke-virtual {p1, p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 135
    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/VideoActivity;->access$setFavorite$p(Lcom/alexmanzana/bubbleall/VideoActivity;Z)V

    .line 136
    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    move-object v2, p1

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;

    invoke-direct {v0, p0, v2, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;Z)V

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/VideoActivity;->access$setAdapter$p(Lcom/alexmanzana/bubbleall/VideoActivity;Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;)V

    .line 137
    sget p0, Lcom/alexmanzana/bubbleall/R$id;->videoList:I

    invoke-virtual {p1, p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    if-lez p2, :cond_1

    .line 139
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 141
    :cond_1
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 143
    :goto_0
    invoke-static {p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/VideoActivity;)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    move-result-object p2

    if-nez p2, :cond_2

    const-string p2, "adapter"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_2
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 145
    :goto_1
    sget p0, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p1, p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public onReceived(Ljava/util/ArrayList;I)V
    .locals 3
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

    .line 131
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;->this$0:Lcom/alexmanzana/bubbleall/VideoActivity;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/VideoActivity;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/VideoActivity;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;->this$0:Lcom/alexmanzana/bubbleall/VideoActivity;

    new-instance v2, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, p1, v1, p2}, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
