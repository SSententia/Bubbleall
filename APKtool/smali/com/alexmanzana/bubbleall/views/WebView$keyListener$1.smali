.class final Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;
.super Ljava/lang/Object;
.source "WebView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;

# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/WebView;

# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    # the current Web tab, or nothing to type into
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/WebView$keyListener$1;->this$0:Lcom/alexmanzana/bubbleall/views/WebView;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/WebView;->currentTab()Lcom/alexmanzana/bubbleall/views/Web;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_1

    return-void

    :cond_1
    check-cast v1, Ljava/lang/String;

    const-string v2, "#del"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->deleteText()V

    return-void

    :cond_2
    const-string v2, "#cr"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/Web;->enterText()V

    return-void

    :cond_3
    const-string v2, "#sp"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v1, " "

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v2, "#paste"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    # paste: first clip item as text, if any
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/content/ClipboardManager;

    if-nez v2, :cond_5

    return-void

    :cond_5
    check-cast v1, Landroid/content/ClipboardManager;

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    if-lez v2, :cond_6

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    :cond_6
    return-void

    :cond_7
    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/Web;->insertText(Ljava/lang/String;)V

    return-void
.end method
