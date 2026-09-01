.class public final Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;
.super Lcom/alexmanzana/bubbleall/utils/AnimationUtils;
.source "BubbleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubbleService;->animationToNormal(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$animationToNormal$3",
        "Lcom/alexmanzana/bubbleall/utils/AnimationUtils;",
        "onAnimationEnd",
        "",
        "p0",
        "Landroid/animation/Animator;",
        "onAnimationStart",
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
.field final synthetic $runnable:Ljava/lang/Runnable;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->$runnable:Ljava/lang/Runnable;

    .line 780
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/AnimationUtils;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 782
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$isHideBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z

    move-result p1

    const/4 v0, 0x0

    const-string v1, "mBubble"

    if-eqz p1, :cond_1

    .line 783
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 785
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 787
    :goto_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->$runnable:Ljava/lang/Runnable;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 791
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationToNormal$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "mBubble"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
