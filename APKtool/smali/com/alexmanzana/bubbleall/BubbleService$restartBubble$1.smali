.class final Lcom/alexmanzana/bubbleall/BubbleService$restartBubble$1;
.super Ljava/lang/Object;
.source "BubbleService.kt"

# interfaces
.implements Ljava/lang/Runnable;

# instance fields
.field final synthetic $context:Landroid/content/Context;

# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$restartBubble$1;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public run()V
    .locals 2

    # the old service instance is gone by now; Companion.start() toggles isStarting itself
    sget-object v0, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$restartBubble$1;->$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->start(Landroid/content/Context;)V

    return-void
.end method
