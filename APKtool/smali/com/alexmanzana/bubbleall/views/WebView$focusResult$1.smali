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
    .locals 5

    # evaluateJavascript delivers null when the WebView is destroyed mid-callback
    if-eqz p1, :cond_null

    # result is a quoted "state" or "state|preview": "0" none / "1" field
    # focused (optionally carrying the field text) / "2" overlay open
    const-string v0, "\""

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    # split the optional preview payload off: everything after the first '|'
    const/16 v2, 0x7c

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    if-ltz v2, :no_preview

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    move-object v0, v4

    :no_preview
    :try_start_parse
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :try_end_parse
    .catch Ljava/lang/NumberFormatException; {:try_start_parse .. :try_end_parse} :catch_parse

    goto :got_state

    :catch_parse
    const/4 v1, 0x1

    :got_state
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/WebView;->onFieldFocusResult(I)V

    # mirror the field text into the preview line above the bar
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0, v3}, Lcom/alexmanzana/bubbleall/views/WebView;->updateKeyboardPreview(Ljava/lang/String;)V

    :cond_null
    return-void
.end method
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method
