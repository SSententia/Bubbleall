.class public final Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;
.super Landroid/content/BroadcastReceiver;
.source "MusicView.kt"


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
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/MusicView$receiver$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/MusicView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 218
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 220
    const-string p1, "com.alexmanzana.bubbleall.Music.CLOSE"

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    move-object p2, p1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p1, "com.alexmanzana.bubbleall.Music.PLAY_AND_PAUSE"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 222
    :cond_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->pauseMedia()V

    goto :goto_0

    .line 220
    :sswitch_1
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 221
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getMManager$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/app/NotificationManager;

    move-result-object p1

    if-eqz p1, :cond_7

    const/16 p2, 0xffc

    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_0

    .line 220
    :sswitch_2
    const-string p1, "com.alexmanzana.bubbleall.Music.NEXT"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 228
    :cond_3
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$positionMusic(Lcom/alexmanzana/bubbleall/views/MusicView;I)V

    goto :goto_0

    .line 220
    :sswitch_3
    const-string p1, "com.alexmanzana.bubbleall.Music.BACK"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    .line 227
    :cond_4
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$positionMusic(Lcom/alexmanzana/bubbleall/views/MusicView;I)V

    goto :goto_0

    .line 220
    :sswitch_4
    const-string p1, "com.alexmanzana.bubbleall.Music.REFRESH"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 224
    :cond_5
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getPlayerCurrent$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/media/MediaPlayer;

    move-result-object p1

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 225
    :cond_6
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$loadNotification(Lcom/alexmanzana/bubbleall/views/MusicView;F)V

    :cond_7
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x56524d0c -> :sswitch_4
        -0x3a5a84b2 -> :sswitch_3
        -0x3a54fea6 -> :sswitch_2
        -0x10e2cbaf -> :sswitch_1
        0x50de1faa -> :sswitch_0
    .end sparse-switch
.end method
