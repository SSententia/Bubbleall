.class public final Lcom/alexmanzana/bubbleall/views/Web$2;
.super Landroid/webkit/WebChromeClient;
.source "Web.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/Web;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0008\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/Web$2",
        "Landroid/webkit/WebChromeClient;",
        "onReceivedIcon",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "icon",
        "Landroid/graphics/Bitmap;",
        "onReceivedTitle",
        "title",
        "",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/Web;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/Web;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web$2;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    .line 79
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/Web$2;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-interface {v0, p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;->onIcon(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/Web$2;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1    invoke-interface {v0, p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;->onTitle(Ljava/lang/String;Ljava/lang/String;)V

:cond_2
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1

    # Was never overridden, so <input type=file> requests from sites such as ChatGPT and Google
    # AI Studio were handed to the default no-op and silently dropped. LatestImage answers them
    # with the newest gallery image instead of opening a picker.
    #
    # Keep this a 3-register invoke: smali sizes the outgoing-argument area from the register
    # list, and a 4-register form here produced outs=3, which the runtime verifier rejects with
    # "invalid argument count (4) exceeds outsSize (3)". p1 already is the WebView, so there is
    # no need to load this$0.
    invoke-static {p1, p2, p3}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->handle(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    move-result v0

    return v0
.end method

