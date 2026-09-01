.class public final Lcom/alexmanzana/bubbleall/views/Web;
.super Landroid/webkit/WebView;
.source "Web.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/views/Web;",
        "Landroid/webkit/WebView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "setId",
        "(Ljava/lang/String;)V",
        "value",
        "",
        "isDesktop",
        "()Z",
        "setDesktop",
        "(Z)V",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;",
        "getListener",
        "()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;",
        "setListener",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;)V",
        "usingAd",
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
.field private id:Ljava/lang/String;

.field private isDesktop:Z

.field private listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

.field private final usingAd:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/Web;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/Web;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    const-string p2, ""

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/Web;->id:Ljava/lang/String;

    const/4 p2, 0x1

    .line 44
    invoke-virtual {p0, p2}, Lcom/alexmanzana/bubbleall/views/Web;->setFocusable(Z)V

    .line 45
    invoke-virtual {p0, p2}, Lcom/alexmanzana/bubbleall/views/Web;->setFocusableInTouchMode(Z)V

    .line 46
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 47
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 48
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 49
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 50
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 51
    const-string p3, "bubble_data_prefs"

    invoke-virtual {p1, p3, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 52
    const-string p3, "key_block_ad_main"

    invoke-interface {p1, p3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    xor-int/2addr p1, p2

    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/Web;->usingAd:Z

    .line 53
    new-instance p1, Lcom/alexmanzana/bubbleall/views/Web$1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/views/Web$1;-><init>(Lcom/alexmanzana/bubbleall/views/Web;)V

    check-cast p1, Landroid/webkit/WebViewClient;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/Web;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 79
    new-instance p1, Lcom/alexmanzana/bubbleall/views/Web$2;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/views/Web$2;-><init>(Lcom/alexmanzana/bubbleall/views/Web;)V

    check-cast p1, Landroid/webkit/WebChromeClient;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/views/Web;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/Web;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getUsingAd$p(Lcom/alexmanzana/bubbleall/views/Web;)Z
    .locals 0

    .line 13
    iget-boolean p0, p0, Lcom/alexmanzana/bubbleall/views/Web;->usingAd:Z

    return p0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/Web;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/Web;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    return-object v0
.end method

.method public final isDesktop()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/Web;->isDesktop:Z

    return v0
.end method

.method public final setDesktop(Z)V
    .locals 11

    .line 24
    const-string v0, "getUserAgentString(...)"

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v1

    .line 25
    iget-boolean v2, p0, Lcom/alexmanzana/bubbleall/views/Web;->isDesktop:Z

    if-nez v2, :cond_0

    .line 27
    :try_start_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v2

    .line 28
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    const-string v5, "("

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v4

    move-object v5, v2

    check-cast v5, Ljava/lang/CharSequence;

    const-string v6, ")"

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    invoke-virtual {v3, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "(X11; Linux x86_64)"

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/Web;->isDesktop:Z

    .line 37
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/Web;->isDesktop:Z

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 39
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/Web;->isDesktop:Z

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 40
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/Web;->reload()V

    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web;->id:Ljava/lang/String;

    return-void
.end method

.method public final setListener(Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/Web;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWeb;

    return-void
.end method
