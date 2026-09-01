.class public final Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;


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
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/WebView$tabsButton$1$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
        "isSwipe",
        "",
        "position",
        "",
        "onSwipe",
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
.field final synthetic $adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$1;->$adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSwipe(I)Z
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->access$getCurrentWeb$p(Lcom/alexmanzana/bubbleall/views/WebView;)I

    move-result v0

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onSwipe(I)V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$tabsButton$1$1;->$adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->remove(I)V

    return-void
.end method
