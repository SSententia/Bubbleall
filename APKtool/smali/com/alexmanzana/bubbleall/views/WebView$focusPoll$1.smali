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
    # the bar must only exist while the browser panel and its WebView are
    # actually visible: hide otherwise (menu, tab strip, Add, Video, Music,
    # Settings panels) without stopping the poll
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_overlaid

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->currentTab()Lcom/alexmanzana/bubbleall/views/Web;

    move-result-object v1

    if-eqz v1, :cond_overlaid

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/views/Web;->getVisibility()I

    move-result v2

    if-nez v2, :cond_overlaid

    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v2

    if-eqz v2, :cond_overlaid

    goto :cond_poll

    :cond_overlaid
    # state 2 = overlay/panel not shown: hide the bar, keep polling.
    # only while the page actually had the bar up does this mean "overlay
    # opened"; when the overlay came first (menu open on entry) the page
    # may still report a focused field, and eating that would make the bar
    # re-show as soon as the browser returns
    iget-boolean v1, v0, Lcom/alexmanzana/bubbleall/views/WebView;->fieldFocused:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_done

    invoke-virtual {v0, v2}, Lcom/alexmanzana/bubbleall/views/WebView;->onFieldFocusResult(I)V

    goto :cond_done

    :cond_poll
    # ask the page whether an editable element is focused; scroll it into view
    # only while the bar is actually shown (fieldFocused == bar visible), so
    # the page is not yanked around while the user reads/scrolls freely
    new-instance v2, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/WebView$focusPoll$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {v2, v3}, Lcom/alexmanzana/bubbleall/views/WebView$focusResult$1;-><init>(Lcom/alexmanzana/bubbleall/views/WebView;)V

    iget-boolean v4, v3, Lcom/alexmanzana/bubbleall/views/WebView;->fieldFocused:Z

    if-eqz v4, :js_plain

    const-string v3, "(function(){var e=document.activeElement;if(!e)return '0';var t=e.tagName;if(t!=='INPUT'&&t!=='TEXTAREA'&&!e.isContentEditable)return '0';var p='';try{var s=document.scrollingElement;if(s)s.style.paddingBottom='280px';var r=e.getBoundingClientRect(),w=window.innerHeight;if(r.top<0||r.bottom>w-240)e.scrollIntoView({block:'center'});p=(e.value!=null?e.value:e.textContent)||'';p=p.replace(/[\\|]/g,'/').replace(/\\s+/g,' ').slice(-120);}catch(x){}return '1|'+p;})();"

    goto :js_eval

    :js_plain
    const-string v3, "(function(){try{var s=document.scrollingElement;if(s)s.style.paddingBottom='';}catch(x){}var e=document.activeElement;if(!e)return '0';var t=e.tagName;if(t!=='INPUT'&&t!=='TEXTAREA'&&!e.isContentEditable)return '0';if(t==='INPUT'){var i=e;if(i.type==='hidden')return '0';if(i.type==='button'||i.type==='submit')return '0';}return '1';})();"

    :js_eval
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
