.class public final Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;
.super Ljava/lang/Object;
.source "VideoView.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/VideoView$updaterProgress$1",
        "Ljava/lang/Runnable;",
        "run",
        "",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/VideoView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/VideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 377
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->currentTextVideo:I

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 378
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->progressVideo:I

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/SeekBar;

    .line 379
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    invoke-static {v2}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getVideoPlayer$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/widget/VideoView;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "videoPlayer"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v2

    .line 380
    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 381
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/VideoView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/VideoView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/VideoView;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/VideoView;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "mHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    move-object v0, p0

    check-cast v0, Ljava/lang/Runnable;

    const-wide/16 v1, 0x64

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
