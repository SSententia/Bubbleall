.class public final Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;
.super Ljava/lang/Object;
.source "MusicView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/MusicView;->start$action$9(Lcom/alexmanzana/bubbleall/views/MusicView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/MusicView$start$action$1$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;",
        "onReceived",
        "",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "Lkotlin/collections/ArrayList;",
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
.field final synthetic $this_run:Lcom/alexmanzana/bubbleall/views/MusicView;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/MusicView;


# direct methods
.method public static synthetic $r8$lambda$JqB726tRt-aE0ayL-U-WE4yuqCQ(Lcom/alexmanzana/bubbleall/views/MusicView;Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->onReceived$lambda$0(Lcom/alexmanzana/bubbleall/views/MusicView;Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/views/MusicView;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/views/MusicView;Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->$this_run:Lcom/alexmanzana/bubbleall/views/MusicView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onReceived$lambda$0(Lcom/alexmanzana/bubbleall/views/MusicView;Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 2

    const-string v0, "$this_run"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    check-cast p2, Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;Z)V

    invoke-static {p0, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$setAdapter$p(Lcom/alexmanzana/bubbleall/views/MusicView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;)V

    .line 275
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->listMusic:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 276
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 277
    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 278
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public onReceived(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->$this_run:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->$this_run:Lcom/alexmanzana/bubbleall/views/MusicView;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    new-instance v3, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, p1, v2}, Lcom/alexmanzana/bubbleall/views/MusicView$start$action$1$1$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/views/MusicView;Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/views/MusicView;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
