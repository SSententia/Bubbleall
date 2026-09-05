.class final Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$4;
.super Ljava/lang/Object;
.source "AddView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;

# instance fields
.field final synthetic $context:Landroid/content/Context;

# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$4;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$4;->$context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.alexmanzana.bubbleall.ACTION_RESTART_BUBBLE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
