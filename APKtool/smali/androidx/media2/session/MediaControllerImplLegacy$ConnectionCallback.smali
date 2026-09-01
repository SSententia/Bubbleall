.class Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;
.super Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;
.source "MediaControllerImplLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaControllerImplLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConnectionCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaControllerImplLegacy;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaControllerImplLegacy;)V
    .locals 0

    .line 1051
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 3

    .line 1056
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaControllerImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1058
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->connectToSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    goto :goto_0

    .line 1059
    :cond_0
    sget-boolean v0, Landroidx/media2/session/MediaControllerImplLegacy;->DEBUG:Z

    if-eqz v0, :cond_1

    .line 1060
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v1, "MC2ImplLegacy"

    const-string v2, "Controller is closed prematually"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public onConnectionFailed()V
    .locals 1

    .line 1071
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaControllerImplLegacy;->close()V

    return-void
.end method

.method public onConnectionSuspended()V
    .locals 1

    .line 1066
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaControllerImplLegacy;->close()V

    return-void
.end method
