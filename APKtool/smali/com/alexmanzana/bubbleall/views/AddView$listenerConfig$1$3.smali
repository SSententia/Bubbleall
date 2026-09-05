.class final Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;
.super Ljava/lang/Object;
.source "AddView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;

# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $chip0:Landroid/view/View;

.field final synthetic $chip1:Landroid/view/View;

.field final synthetic $chip2:Landroid/view/View;

.field final synthetic $chip3:Landroid/view/View;

# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip0:Landroid/view/View;

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip1:Landroid/view/View;

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip2:Landroid/view/View;

    iput-object p5, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip3:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x0

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode1:I

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode2:I

    if-ne v0, v2, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode3:I

    if-ne v0, v2, :goto_0

    const/4 v1, 0x3

    :goto_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$context:Landroid/content/Context;

    const-string v2, "bubble_data_prefs"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "keyboard_mode"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip0:Landroid/view/View;

    if-nez v1, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    move v4, v0

    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip1:Landroid/view/View;

    const/4 v5, 0x1

    if-ne v1, v5, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip2:Landroid/view/View;

    const/4 v5, 0x2

    if-ne v1, v5, :cond_4

    move v4, v2

    goto :goto_3

    :cond_4
    move v4, v0

    :goto_3
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$chip3:Landroid/view/View;

    const/4 v5, 0x3

    if-ne v1, v5, :cond_5

    move v4, v2

    goto :goto_4

    :cond_5
    move v4, v0

    :goto_4
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;->$context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
