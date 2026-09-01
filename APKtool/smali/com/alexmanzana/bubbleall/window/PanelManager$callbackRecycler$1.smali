.class public final Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;
.super Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;
.source "PanelManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/window/PanelManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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
        "com/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/window/PanelManager;)V
    .locals 1

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    const/4 p1, 0x0

    const/16 v0, 0xc

    .line 225
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

    .line 238
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$getCallback$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;->isSwipe(I)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 239
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;->getSwipeDirs(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

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
    .locals 0

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$callbackRecycler$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$getCallback$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;->onSwipe(I)V

    :cond_0
    return-void
.end method
