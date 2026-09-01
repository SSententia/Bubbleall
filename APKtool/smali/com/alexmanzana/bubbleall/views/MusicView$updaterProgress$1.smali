.class public final Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;
.super Ljava/lang/Object;
.source "MusicView.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/MusicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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
        "com/alexmanzana/bubbleall/views/MusicView$updaterProgress$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/MusicView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 65
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getPlayerCurrent$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/media/MediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$updaterProgress$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 66
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->currentTextMusic:I

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 67
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->progressMusic:I

    invoke-virtual {v1, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v4, "findViewById(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/SeekBar;

    .line 68
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 70
    sget-object v3, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->convertTime(J)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    invoke-static {v1}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getMHandler$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
