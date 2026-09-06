.class public final Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;
.super Landroid/content/BroadcastReceiver;
.source "BubbleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubbleService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$argsBubble$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "p0",
        "Landroid/content/Context;",
        "p1",
        "Landroid/content/Intent;",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    .line 103
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 105
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    # restart is delivered via startService(), not a broadcast anymore
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x56ffec3d

    if-eq v0, v1, :cond_4

    const p2, 0xf732fa3    # 1.19899995E-29f

    if-eq v0, p2, :cond_2

    const p2, 0x235ebc06

    if-eq v0, p2, :cond_1

    goto :goto_1

    :cond_1
    const-string p2, "com.alexmanzana.bubbleall.ACTION_MODIFY_BUBBLE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 106
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$modifyBubble(Lcom/alexmanzana/bubbleall/BubbleService;)V

    goto :goto_1

    .line 105
    :cond_2
    const-string p2, "com.alexmanzana.bubbleall.ACTION_OPEN_MANAGER"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 108
    :cond_3
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$openManager(Lcom/alexmanzana/bubbleall/BubbleService;)V

    goto :goto_1

    .line 105
    :cond_4
    const-string v0, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    .line 107
    :cond_5
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$argsBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$requestArgsBubble(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/content/Intent;)V

    :cond_6
    :goto_1
    return-void
.end method
