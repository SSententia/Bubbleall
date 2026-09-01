.class public final Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;
.super Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;
.source "BubbleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubbleService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0008\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$callbackVertical$1",
        "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;",
        "getSwipeDirs",
        "",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "viewHolder",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "onMove",
        "",
        "target",
        "onSwiped",
        "",
        "direction",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 1

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    const/4 p1, 0x0

    const/4 v0, 0x3

    .line 475
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;-><init>(II)V

    return-void
.end method


# virtual methods
.method public getSwipeDirs(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I
    .locals 2

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 481
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 482
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;->getSwipeDirs(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public onMove(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewHolder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onSwiped(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 5

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 486
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p1

    .line 487
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x2

    .line 488
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 489
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMPanelManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/window/PanelManager;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "mPanelManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v3}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v3

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v4}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v4}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/alexmanzana/bubbleall/window/PanelManager;->destroy(ILjava/lang/String;)V

    .line 490
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "get(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 491
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->isActive()Z

    move-result v1

    const-string v3, "adapter"

    if-eqz v1, :cond_4

    if-ne p1, p2, :cond_2

    .line 493
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    :cond_1
    invoke-virtual {p2, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V

    goto :goto_0

    .line 495
    :cond_2
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object p2

    if-nez p2, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    :cond_3
    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p2, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V

    .line 498
    :cond_4
    :goto_0
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 499
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object p2

    if-nez p2, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    :cond_5
    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemRemoved(I)V

    .line 500
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object p2

    if-nez p2, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v2, p2

    :goto_1
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$callbackVertical$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {v2, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemRangeChanged(II)V

    return-void
.end method
