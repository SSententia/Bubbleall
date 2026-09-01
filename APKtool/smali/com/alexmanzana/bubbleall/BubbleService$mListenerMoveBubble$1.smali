.class public final Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;
.super Ljava/lang/Object;
.source "BubbleService.kt"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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
        "\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1",
        "Landroid/view/View$OnTouchListener;",
        "MAX_CLICK_DURATION",
        "",
        "initialTouchX",
        "",
        "initialTouchY",
        "initialX",
        "initialY",
        "startClickTime",
        "",
        "onTouch",
        "",
        "view",
        "Landroid/view/View;",
        "event",
        "Landroid/view/MotionEvent;",
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
.field private final MAX_CLICK_DURATION:I

.field private initialTouchX:F

.field private initialTouchY:F

.field private initialX:I

.field private initialY:I

.field private startClickTime:J

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    .line 524
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xc8

    .line 529
    iput p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->MAX_CLICK_DURATION:I

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 535
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const-string v1, "bubble_state"

    const/4 v2, 0x1

    const-string v3, "mViewParams"

    const/4 v4, 0x0

    if-eqz v0, :cond_c

    if-eq v0, v2, :cond_7

    const/4 p1, 0x2

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 563
    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$isOpenManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 564
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_1
    iget v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialX:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    iget v5, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialTouchX:F

    sub-float/2addr v1, v5

    float-to-int v1, v1

    add-int/2addr v0, v1

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 565
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_2
    iget v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialY:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iget v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialTouchY:F

    sub-float/2addr p2, v1

    float-to-int p2, p2

    add-int/2addr v0, p2

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 566
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMWindowManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, "mWindowManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_3
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMView$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/widget/LinearLayout;

    move-result-object p2

    if-nez p2, :cond_4

    const-string p2, "mView"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v4

    :cond_4
    check-cast p2, Landroid/view/View;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v4, v0

    :goto_0
    check-cast v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, p2, v4}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return v2

    :cond_6
    return v1

    .line 549
    :cond_7
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$isOnlyBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 550
    const-string p2, "up"

    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 551
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v4

    :cond_8
    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    const-string v0, "xBubble"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 552
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    move-object v4, p2

    :goto_1
    iget p2, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    const-string v0, "yBubble"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 553
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_2

    .line 555
    :cond_a
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->startClickTime:J

    sub-long/2addr p1, v0

    .line 556
    iget v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->MAX_CLICK_DURATION:I

    int-to-long v0, v0

    cmp-long p1, p1, v0

    if-gez p1, :cond_b

    .line 557
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$openManager(Lcom/alexmanzana/bubbleall/BubbleService;)V

    :cond_b
    :goto_2
    return v2

    .line 537
    :cond_c
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->startClickTime:J

    .line 538
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_d
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialX:I

    .line 539
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMViewParams$p(Lcom/alexmanzana/bubbleall/BubbleService;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_e

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    move-object v4, v0

    :goto_3
    iget v0, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialY:I

    .line 540
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialTouchX:F

    .line 541
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iput p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->initialTouchY:F

    .line 542
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$isOnlyBubble$p(Lcom/alexmanzana/bubbleall/BubbleService;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 543
    const-string p2, "down"

    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 544
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$mListenerMoveBubble$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->sendBroadcast(Landroid/content/Intent;)V

    :cond_f
    return v2
.end method
