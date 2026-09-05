.class final Lcom/alexmanzana/bubbleall/views/WebView$network$1$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Ljava/lang/Runnable;

# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;

# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$network$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$network$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->currentTab()Lcom/alexmanzana/bubbleall/views/Web;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/views/Web;->reload()V

    # one reload per drop; re-registered by the next onError
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->unregisterNetworkPublic()V

    return-void
.end method
