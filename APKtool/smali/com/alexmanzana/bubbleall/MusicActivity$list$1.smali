.class public final Lcom/alexmanzana/bubbleall/MusicActivity$list$1;
.super Ljava/lang/Object;
.source "MusicActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/MusicActivity;->list()V
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
        "com/alexmanzana/bubbleall/MusicActivity$list$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/MusicActivity;


# direct methods
.method public static synthetic $r8$lambda$GmBdWq7xo0hHTgCwzm1nC136WoA(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;->onReceived$lambda$0(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/util/ArrayList;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/MusicActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;->this$0:Lcom/alexmanzana/bubbleall/MusicActivity;

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final onReceived$lambda$0(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/util/ArrayList;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->musicList:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/MusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 115
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 116
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->textListEmpty:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 118
    :cond_0
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 119
    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    move-object v4, p0

    check-cast v4, Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;-><init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 121
    :goto_0
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->progressList:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public onReceived(Ljava/util/ArrayList;)V
    .locals 3
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

    .line 113
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;->this$0:Lcom/alexmanzana/bubbleall/MusicActivity;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/MusicActivity;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/MusicActivity;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;->this$0:Lcom/alexmanzana/bubbleall/MusicActivity;

    new-instance v2, Lcom/alexmanzana/bubbleall/MusicActivity$list$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1, p1}, Lcom/alexmanzana/bubbleall/MusicActivity$list$1$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
