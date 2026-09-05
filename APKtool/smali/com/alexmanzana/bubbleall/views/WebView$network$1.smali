.class final Lcom/alexmanzana/bubbleall/views/WebView$network$1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "WebView.kt"

# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;

# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$network$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    # callback runs on a binder thread; WebView work must hop to the main looper
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$network$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/alexmanzana/bubbleall/views/WebView$network$1$1;

    invoke-direct {v2, v0}, Lcom/alexmanzana/bubbleall/views/WebView$network$1$1;-><init>(Lcom/alexmanzana/bubbleall/views/WebView;)V

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
