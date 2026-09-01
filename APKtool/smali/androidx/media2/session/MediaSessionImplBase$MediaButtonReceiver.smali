.class final Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;
.super Landroid/content/BroadcastReceiver;
.source "MediaSessionImplBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSessionImplBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "MediaButtonReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionImplBase;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;)V
    .locals 0

    .line 1673
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1676
    const-string p1, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 1679
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 1680
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    iget-object v0, v0, Landroidx/media2/session/MediaSessionImplBase;->mSessionUri:Landroid/net/Uri;

    invoke-static {p1, v0}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 1683
    :cond_1
    const-string p1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/view/KeyEvent;

    if-nez p1, :cond_2

    return-void

    .line 1687
    :cond_2
    iget-object p2, p0, Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    invoke-virtual {p2}, Landroidx/media2/session/MediaSessionImplBase;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->getController()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method
