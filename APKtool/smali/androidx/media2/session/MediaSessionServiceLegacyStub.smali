.class Landroidx/media2/session/MediaSessionServiceLegacyStub;
.super Landroidx/media/MediaBrowserServiceCompat;
.source "MediaSessionServiceLegacyStub.java"


# instance fields
.field private final mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media2/session/ConnectedControllersManager<",
            "Landroidx/media/MediaSessionManager$RemoteUserInfo;",
            ">;"
        }
    .end annotation
.end field

.field final mManager:Landroidx/media/MediaSessionManager;

.field private final mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Landroidx/media/MediaBrowserServiceCompat;-><init>()V

    .line 44
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->attachToBaseContext(Landroid/content/Context;)V

    .line 45
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->onCreate()V

    .line 46
    invoke-virtual {p0, p3}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->setSessionToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 47
    invoke-static {p1}, Landroidx/media/MediaSessionManager;->getSessionManager(Landroid/content/Context;)Landroidx/media/MediaSessionManager;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mManager:Landroidx/media/MediaSessionManager;

    .line 48
    iput-object p2, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 49
    new-instance p1, Landroidx/media2/session/ConnectedControllersManager;

    invoke-direct {p1, p2}, Landroidx/media2/session/ConnectedControllersManager;-><init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;)V

    iput-object p1, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    return-void
.end method


# virtual methods
.method createControllerInfo(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Landroidx/media2/session/MediaSession$ControllerInfo;
    .locals 7

    .line 82
    new-instance v6, Landroidx/media2/session/MediaSession$ControllerInfo;

    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mManager:Landroidx/media/MediaSessionManager;

    .line 83
    invoke-virtual {v0, p1}, Landroidx/media/MediaSessionManager;->isTrustedForMediaControl(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, -0x1

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSession$ControllerInfo;-><init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V

    return-object v6
.end method

.method getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/media2/session/ConnectedControllersManager<",
            "Landroidx/media/MediaSessionManager$RemoteUserInfo;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    return-object v0
.end method

.method public onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;
    .locals 1

    .line 54
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->getCurrentBrowserInfo()Landroidx/media/MediaSessionManager$RemoteUserInfo;

    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->createControllerInfo(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object p2

    .line 66
    iget-object p3, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {p3}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object p3

    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 67
    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object v0

    .line 66
    invoke-virtual {p3, v0, p2}, Landroidx/media2/session/MediaSession$SessionCallback;->onConnect(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SessionCommandGroup;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 71
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/media2/session/ConnectedControllersManager;->addController(Ljava/lang/Object;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V

    .line 73
    sget-object p1, Landroidx/media2/session/MediaUtils;->sDefaultBrowserRoot:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    return-object p1
.end method

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$Result<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    const/4 p1, 0x0

    .line 78
    invoke-virtual {p2, p1}, Landroidx/media/MediaBrowserServiceCompat$Result;->sendResult(Ljava/lang/Object;)V

    return-void
.end method
