.class public final Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;
.super Landroid/support/v4/media/session/MediaSessionCompat$Callback;
.source "ShortcutView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/ShortcutView;->startNotification(Ljava/lang/String;JJLcom/alexmanzana/bubbleall/views/Web;F)V
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
        "com/alexmanzana/bubbleall/views/ShortcutView$startNotification$1",
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
.field final synthetic $web:Lcom/alexmanzana/bubbleall/views/Web;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;


# direct methods
.method public static synthetic $r8$lambda$nGDmukiptt7si-cLdVsLmf-Wv9E(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;->onSeekTo$lambda$0(Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/views/Web;Lcom/alexmanzana/bubbleall/views/ShortcutView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;->$web:Lcom/alexmanzana/bubbleall/views/Web;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    .line 184
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Callback;-><init>()V

    return-void
.end method

.method private static final onSeekTo$lambda$0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public onSeekTo(J)V
    .locals 4

    .line 186
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;->$web:Lcom/alexmanzana/bubbleall/views/Web;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(function(){var videos = document.querySelectorAll(\'video\');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ";videoPlayback.play();}})();"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/alexmanzana/bubbleall/views/Web;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 187
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$startNotification$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->access$startDataNotification(Lcom/alexmanzana/bubbleall/views/ShortcutView;)V

    return-void
.end method
