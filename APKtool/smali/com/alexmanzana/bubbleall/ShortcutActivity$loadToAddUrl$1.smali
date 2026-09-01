.class public final Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1;
.super Landroid/webkit/WebViewClient;
.source "ShortcutActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ShortcutActivity;->loadToAddUrl(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1",
        "Landroid/webkit/WebViewClient;",
        "onReceivedError",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "error",
        "Landroid/webkit/WebResourceError;",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/ShortcutActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    .line 182
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 184
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->contentActivity:I

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 185
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->progressAccess:I

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 186
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->contentActivity:I

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    sget p2, Lcom/alexmanzana/bubbleall/R$string;->text_error_load_shortcut:I

    const/4 p3, -0x1

    invoke-static {p1, p2, p3}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->show()V

    return-void
.end method
