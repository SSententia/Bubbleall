.class final Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/String;)V
    .locals 3

    # evaluateJavascript delivers null when the WebView is destroyed mid-callback
    if-eqz p1, :cond_null

    # result is "true"/"false" quoted: "\"1\"" or "\"0\""
    const-string v0, "1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    # hide the bar immediately when focus is gone; do not wait for the next tick
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v1, v0}, Lcom/alexmanzana/bubbleall/views/WebView;->onFieldFocusResult(Z)V

    :cond_null
    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method
