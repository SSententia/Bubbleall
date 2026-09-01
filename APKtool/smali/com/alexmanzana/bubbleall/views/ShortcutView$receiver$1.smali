.class public final Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;
.super Landroid/content/BroadcastReceiver;
.source "ShortcutView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/ShortcutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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
        "com/alexmanzana/bubbleall/views/ShortcutView$receiver$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;


# direct methods
.method public static synthetic $r8$lambda$UPztj7P0ehKUv2WkR0Z2af9q9S4(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->onReceive$lambda$3$lambda$0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$iwgjP_SmC4GBR-4iJrpugM4AiuM(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->onReceive$lambda$3$lambda$1(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$izlFhundTwoGx01E_gpv3pwvsRw(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->onReceive$lambda$3$lambda$2(Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/views/ShortcutView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    .line 96
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static final onReceive$lambda$3$lambda$0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private static final onReceive$lambda$3$lambda$1(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private static final onReceive$lambda$3$lambda$2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 98
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->access$getCurrentPosition$p(Lcom/alexmanzana/bubbleall/views/ShortcutView;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 99
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    .line 100
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/views/Web;

    if-eqz v1, :cond_9

    .line 101
    const-string v1, "com.alexmanzana.bubbleall.Shortcut.CLOSE"

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    move-object v2, v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "com.alexmanzana.bubbleall.Shortcut.REFRESH"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 104
    :cond_2
    check-cast p1, Lcom/alexmanzana/bubbleall/views/Web;

    new-instance v2, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda0;-><init>()V

    const-string v3, "(function(){var videos = document.querySelectorAll(\'video\');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = 0;}})();"

    invoke-virtual {p1, v3, v2}, Lcom/alexmanzana/bubbleall/views/Web;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 101
    :sswitch_1
    const-string v3, "com.alexmanzana.bubbleall.Shortcut.FORWARD_10"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 105
    :cond_3
    check-cast p1, Lcom/alexmanzana/bubbleall/views/Web;

    new-instance v2, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda1;-><init>()V

    const-string v3, "(function(){var videos = document.querySelectorAll(\'video\');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = videoPlayback.currentTime + 10;}})();"

    invoke-virtual {p1, v3, v2}, Lcom/alexmanzana/bubbleall/views/Web;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 101
    :sswitch_2
    const-string v3, "com.alexmanzana.bubbleall.Shortcut.REPLAY_10"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    .line 106
    :cond_4
    check-cast p1, Lcom/alexmanzana/bubbleall/views/Web;

    new-instance v2, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda2;

    invoke-direct {v2}, Lcom/alexmanzana/bubbleall/views/ShortcutView$receiver$1$$ExternalSyntheticLambda2;-><init>()V

    const-string v3, "(function(){var videos = document.querySelectorAll(\'video\');var videoPlayback = null;if(videos.length>0){videoPlayback = videos[0];}for(var i= 0;i<videos.length;i++){if(videos[i].src.startsWith(\"blob\")){videoPlayback = videos[i];break;}else{if(videos[i].duration>videoPlayback.duration){videoPlayback = videos[i];}}}if(videoPlayback!=null && !videoPlayback.paused){videoPlayback.currentTime = videoPlayback.currentTime - 10;}})();"

    invoke-virtual {p1, v3, v2}, Lcom/alexmanzana/bubbleall/views/Web;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 101
    :sswitch_3
    const-string p1, "com.alexmanzana.bubbleall.Shortcut.PLAY_AND_PAUSE"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 103
    :cond_5
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->pauseMedia()V

    goto :goto_0

    .line 101
    :sswitch_4
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    .line 102
    :cond_6
    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->access$getMManager$p(Lcom/alexmanzana/bubbleall/views/ShortcutView;)Landroid/app/NotificationManager;

    move-result-object p1

    if-eqz p1, :cond_7

    const/16 v2, 0x4e

    invoke-virtual {p1, v2}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_7
    :goto_0
    if-eqz p2, :cond_8

    .line 108
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_8
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 109
    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->access$startDataNotification(Lcom/alexmanzana/bubbleall/views/ShortcutView;)V

    :cond_9
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7cd34892 -> :sswitch_4
        0x1ee3cd2d -> :sswitch_3
        0x27c7680d -> :sswitch_2
        0x3d994a23 -> :sswitch_1
        0x77e8e2d1 -> :sswitch_0
    .end sparse-switch
.end method
