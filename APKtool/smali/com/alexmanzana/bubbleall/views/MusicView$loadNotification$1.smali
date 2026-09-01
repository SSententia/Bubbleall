.class public final Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;
.super Landroid/support/v4/media/session/MediaSessionCompat$Callback;
.source "MusicView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/MusicView;->loadNotification(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/MusicView$loadNotification$1",
        "Landroid/support/v4/media/session/MediaSessionCompat$Callback;",
        "onSeekTo",
        "",
        "pos",
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 372
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onSeekTo(J)V
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getPlayerCurrent$p(Lcom/alexmanzana/bubbleall/views/MusicView;)Landroid/media/MediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 375
    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$loadNotification$1;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$loadNotification(Lcom/alexmanzana/bubbleall/views/MusicView;F)V

    return-void
.end method
