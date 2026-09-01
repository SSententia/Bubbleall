.class public interface abstract Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;
.super Ljava/lang/Object;
.source "PanelManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/window/PanelManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0001H&J\u0008\u0010\t\u001a\u00020\u0003H&J\u0008\u0010\n\u001a\u00020\u000bH&J\u0008\u0010\u000c\u001a\u00020\u0003H&J\u0008\u0010\r\u001a\u00020\u000bH&J!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H&\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007H&J&\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\u0008\u00030\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0008\u0010!\u001a\u00020\u0003H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0007H&\u00a8\u0006$"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;",
        "",
        "argsOnPanel",
        "",
        "id",
        "",
        "data",
        "",
        "icon",
        "closeManager",
        "finishList",
        "",
        "hideBubble",
        "isVisibleBubble",
        "requestButtons",
        "buttons",
        "",
        "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;",
        "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V",
        "requestIconToolbar",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "idPanel",
        "resource",
        "requestList",
        "layoutManager",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
        "adapter",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "callback",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
        "requestTitleToolbar",
        "title",
        "showBubble",
        "toast",
        "text",
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


# virtual methods
.method public abstract argsOnPanel(ILjava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract closeManager()V
.end method

.method public abstract finishList()Z
.end method

.method public abstract hideBubble()V
.end method

.method public abstract isVisibleBubble()Z
.end method

.method public varargs abstract requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V
.end method

.method public abstract requestIconToolbar(ILjava/lang/String;)V
.end method

.method public abstract requestIconToolbar(Landroid/graphics/Bitmap;Ljava/lang/String;)V
.end method

.method public abstract requestList(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
            ")V"
        }
    .end annotation
.end method

.method public abstract requestTitleToolbar(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract showBubble()V
.end method

.method public abstract toast(Ljava/lang/String;)V
.end method
