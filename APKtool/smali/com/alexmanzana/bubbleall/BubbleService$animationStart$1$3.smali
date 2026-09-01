.class public final Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;
.super Lcom/alexmanzana/bubbleall/utils/AnimationUtils;
.source "BubbleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubbleService;->animationStart(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$animationStart$1$3",
        "Lcom/alexmanzana/bubbleall/utils/AnimationUtils;",
        "onAnimationEnd",
        "",
        "p0",
        "Landroid/animation/Animator;",
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
.field final synthetic $intent:Landroid/content/Intent;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method public static synthetic $r8$lambda$oB1APGqS5efUTrNR3LmqIZ6spSQ(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->onAnimationEnd$lambda$1(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->$intent:Landroid/content/Intent;

    .line 681
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/AnimationUtils;-><init>()V

    return-void
.end method

.method private static final onAnimationEnd$lambda$1(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 685
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    const-string v0, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 686
    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$openManager(Lcom/alexmanzana/bubbleall/BubbleService;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/os/Handler;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "mHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->$intent:Landroid/content/Intent;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    new-instance v2, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService$animationStart$1$3$$ExternalSyntheticLambda0;-><init>(Landroid/content/Intent;Lcom/alexmanzana/bubbleall/BubbleService;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
