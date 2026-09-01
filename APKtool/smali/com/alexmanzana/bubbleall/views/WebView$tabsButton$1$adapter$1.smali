.class public final Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;",
        "onClick",
        "",
        "item",
        "",
        "onRemove",
        "position",
        "newPosition",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(I)V
    .locals 3

    .line 217
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->pause()V

    .line 218
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/views/WebView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 219
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    .line 220
    instance-of v2, v0, Lcom/alexmanzana/bubbleall/views/Web;

    if-eqz v2, :cond_0

    .line 221
    invoke-static {v1, p1}, Lcom/alexmanzana/bubbleall/views/WebView;->access$setCurrentWeb$p(Lcom/alexmanzana/bubbleall/views/WebView;I)V

    .line 222
    move-object p1, v0

    check-cast p1, Lcom/alexmanzana/bubbleall/views/Web;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/alexmanzana/bubbleall/views/Web;->setVisibility(I)V

    .line 223
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/views/Web;->onResume()V

    .line 224
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 227
    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/views/WebView;->finishList()Z

    return-void
.end method

.method public onRemove(II)V
    .locals 2

    .line 231
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/views/WebView;->removeViewAt(I)V

    .line 232
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/views/WebView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 233
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$adapter$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    .line 234
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/views/Web;

    if-eqz v1, :cond_0

    .line 235
    invoke-static {v0, p2}, Lcom/alexmanzana/bubbleall/views/WebView;->access$setCurrentWeb$p(Lcom/alexmanzana/bubbleall/views/WebView;I)V

    .line 236
    move-object p2, p1

    check-cast p2, Lcom/alexmanzana/bubbleall/views/Web;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/alexmanzana/bubbleall/views/Web;->setVisibility(I)V

    .line 237
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/views/Web;->onResume()V

    .line 238
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void
.end method
