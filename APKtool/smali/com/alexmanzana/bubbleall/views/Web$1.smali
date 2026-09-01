.class public final Lcom/alexmanzana/bubbleall/views/Web$1;
.super Landroid/webkit/WebViewClient;
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
        "\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0008\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016J\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/Web$1",
        "Landroid/webkit/WebViewClient;",
        "onPageFinished",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "url",
        "",
        "onReceivedError",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "error",
        "Landroid/webkit/WebResourceError;",
        "shouldInterceptRequest",
        "Landroid/webkit/WebResourceResponse;",
        "shouldOverrideUrlLoading",
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    .line 53
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 59
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/views/Web;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    move-result-object p1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {p1, p2}, Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;->onLoaded(Ljava/lang/String;)V

    .line 60
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    const-string p2, "javascript:"

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/views/Web;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 76
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/views/Web;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    move-result-object p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-interface {p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;->onError(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/Web;->access$getUsingAd$p(Lcom/alexmanzana/bubbleall/views/Web;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    goto :goto_1

    .line 67
    :cond_0
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->isAd(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    sget-object p1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->createEmpty()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    goto :goto_1

    .line 70
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 3

    .line 55
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web$1;->this$0:Lcom/alexmanzana/bubbleall/views/Web;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/views/Web;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    const-string v1, "https://"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p2, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
