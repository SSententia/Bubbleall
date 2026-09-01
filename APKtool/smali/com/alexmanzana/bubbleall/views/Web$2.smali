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

    :cond_1
    invoke-interface {v0, p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;->onTitle(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
