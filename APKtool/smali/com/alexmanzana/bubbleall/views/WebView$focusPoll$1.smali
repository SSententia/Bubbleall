.class final Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Ljava/lang/Runnable;

# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    # a stop request landed while this post was pending: bail out
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    iget-boolean v1, v0, Lcom/alexmanzana/bubbleall/views/WebView;->fieldPollStop:Z

    if-eqz v1, :cond_run

    return-void

    :cond_run
    # ask the page whether an editable element is focused
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->currentTab()Lcom/alexmanzana/bubbleall/views/Web;

    move-result-object v1

    if-eqz v1, :cond_done

    new-instance v2, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {v2, v3}, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;-><init>(Lcom/alexmanzana/bubbleall/views/WebView;)V

    const-string v3, "(function(){var e=document.activeElement;if(!e)return '0';var t=e.tagName;if(t==='INPUT'||t==='TEXTAREA')return '1';if(e.isContentEditable)return '1';return '0';})();"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2}, Lcom/alexmanzana/bubbleall/views/Web;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_done
    # requeue every 300 ms on the shared handler unless stopped
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    iget-boolean v1, v0, Lcom/alexmanzana/bubbleall/views/WebView;->fieldPollStop:Z

    if-eqz v1, :cond_requeue

    return-void

    :cond_requeue
    iget-object v1, v0, Lcom/alexmanzana/bubbleall/views/WebView;->fieldPollHandler:Landroid/os/Handler;

    if-eqz v1, :cond_nohandler

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    iget-object v2, v2, Lcom/alexmanzana/bubbleall/views/WebView;->fieldPoll:Ljava/lang/Runnable;

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_nohandler
    return-void
.end method
