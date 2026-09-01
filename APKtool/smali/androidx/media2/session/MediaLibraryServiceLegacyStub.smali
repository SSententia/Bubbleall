.class Landroidx/media2/session/MediaLibraryServiceLegacyStub;
.super Landroidx/media2/session/MediaSessionServiceLegacyStub;
.source "MediaLibraryServiceLegacyStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCbForBroadcast;,
        Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCb;,
        Landroidx/media2/session/MediaLibraryServiceLegacyStub$BaseBrowserLegacyCb;,
        Landroidx/media2/session/MediaLibraryServiceLegacyStub$SearchRequest;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "MLS2LegacyStub"


# instance fields
.field private final mBrowserLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

.field final mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroidx/media2/session/MediaSessionServiceLegacyStub;-><init>(Landroid/content/Context;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 75
    iput-object p2, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    .line 76
    new-instance p1, Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCbForBroadcast;

    invoke-direct {p1, p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCbForBroadcast;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    iput-object p1, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mBrowserLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

    return-void
.end method

.method private getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;
    .locals 2

    .line 365
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentBrowserInfo()Landroidx/media/MediaSessionManager$RemoteUserInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/media2/session/ConnectedControllersManager;->getController(Ljava/lang/Object;)Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method createControllerInfo(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Landroidx/media2/session/MediaSession$ControllerInfo;
    .locals 7

    .line 355
    new-instance v6, Landroidx/media2/session/MediaSession$ControllerInfo;

    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mManager:Landroidx/media/MediaSessionManager;

    .line 356
    invoke-virtual {v0, p1}, Landroidx/media/MediaSessionManager;->isTrustedForMediaControl(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Z

    move-result v3

    new-instance v4, Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCb;

    invoke-direct {v4, p0, p1}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCb;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media/MediaSessionManager$RemoteUserInfo;)V

    const/4 v5, 0x0

    const/4 v2, -0x1

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSession$ControllerInfo;-><init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V

    return-object v6
.end method

.method getBrowserLegacyCbForBroadcast()Landroidx/media2/session/MediaSession$ControllerCb;
    .locals 1

    .line 361
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mBrowserLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

    return-object v0
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$Result;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/MediaBrowserServiceCompat$Result<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 326
    invoke-virtual {p3}, Landroidx/media/MediaBrowserServiceCompat$Result;->detach()V

    .line 328
    :cond_0
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v3

    .line 329
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Landroidx/media2/session/MediaLibraryServiceLegacyStub$6;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$6;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Ljava/lang/String;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media/MediaBrowserServiceCompat$Result;Landroid/os/Bundle;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;
    .locals 1

    .line 81
    invoke-super {p0, p1, p2, p3}, Landroidx/media2/session/MediaSessionServiceLegacyStub;->onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 85
    :cond_0
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p2

    .line 89
    :cond_1
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object p2

    const v0, 0xc350

    invoke-virtual {p2, p1, v0}, Landroidx/media2/session/ConnectedControllersManager;->isAllowedCommand(Landroidx/media2/session/MediaSession$ControllerInfo;I)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 101
    iget-object p2, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    .line 102
    invoke-interface {p2}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getContext()Landroid/content/Context;

    move-result-object p2

    .line 101
    invoke-static {p2, p3}, Landroidx/media2/session/MediaUtils;->convertToLibraryParams(Landroid/content/Context;Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object p2

    .line 103
    iget-object p3, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {p3}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallback()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;

    move-result-object p3

    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    .line 104
    invoke-interface {v0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getInstance()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;

    move-result-object v0

    .line 103
    invoke-virtual {p3, v0, p1, p2}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;->onGetLibraryRoot(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroidx/media2/session/LibraryResult;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 105
    invoke-virtual {p1}, Landroidx/media2/session/LibraryResult;->getResultCode()I

    move-result p2

    if-nez p2, :cond_3

    .line 106
    invoke-virtual {p1}, Landroidx/media2/session/LibraryResult;->getMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 107
    invoke-virtual {p1}, Landroidx/media2/session/LibraryResult;->getMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 109
    const-string p3, "android.media.metadata.MEDIA_ID"

    invoke-virtual {p2, p3}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    const-string p2, ""

    .line 110
    :goto_0
    new-instance p3, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    .line 111
    invoke-virtual {p1}, Landroidx/media2/session/LibraryResult;->getLibraryParams()Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object p1

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->convertToRootHints(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p3

    .line 121
    :cond_3
    sget-object p1, Landroidx/media2/session/MediaUtils;->sDefaultBrowserRoot:Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;

    return-object p1
.end method

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;)V
    .locals 1
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

    const/4 v0, 0x0

    .line 179
    invoke-virtual {p0, p1, p2, v0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->onLoadChildren(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;Landroid/os/Bundle;)V

    return-void
.end method

.method public onLoadChildren(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;Landroid/os/Bundle;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$Result<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 185
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v2

    .line 186
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "onLoadChildren(): Ignoring empty parentId from "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "MLS2LegacyStub"

    invoke-static {p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 188
    invoke-virtual {p2, p1}, Landroidx/media/MediaBrowserServiceCompat$Result;->sendError(Landroid/os/Bundle;)V

    return-void

    .line 191
    :cond_0
    invoke-virtual {p2}, Landroidx/media/MediaBrowserServiceCompat$Result;->detach()V

    .line 192
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Landroidx/media2/session/MediaLibraryServiceLegacyStub$3;

    move-object v0, v7

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$3;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media/MediaBrowserServiceCompat$Result;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLoadItem(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$Result<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    .line 253
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v0

    .line 254
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 255
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring empty itemId from "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MLS2LegacyStub"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 256
    invoke-virtual {p2, p1}, Landroidx/media/MediaBrowserServiceCompat$Result;->sendError(Landroid/os/Bundle;)V

    return-void

    .line 259
    :cond_0
    invoke-virtual {p2}, Landroidx/media/MediaBrowserServiceCompat$Result;->detach()V

    .line 260
    iget-object v1, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Landroidx/media2/session/MediaLibraryServiceLegacyStub$4;

    invoke-direct {v2, p0, v0, p2, p1}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$4;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media/MediaBrowserServiceCompat$Result;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onSearch(Ljava/lang/String;Landroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$Result;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/MediaBrowserServiceCompat$Result<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    .line 286
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v2

    .line 287
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Ignoring empty query from "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MLS2LegacyStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 289
    invoke-virtual {p3, p1}, Landroidx/media/MediaBrowserServiceCompat$Result;->sendError(Landroid/os/Bundle;)V

    return-void

    .line 292
    :cond_0
    invoke-virtual {v2}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v0

    instance-of v0, v0, Landroidx/media2/session/MediaLibraryServiceLegacyStub$BrowserLegacyCb;

    if-nez v0, :cond_1

    return-void

    .line 298
    :cond_1
    invoke-virtual {p3}, Landroidx/media/MediaBrowserServiceCompat$Result;->detach()V

    .line 299
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Landroidx/media2/session/MediaLibraryServiceLegacyStub$5;

    move-object v0, v7

    move-object v1, p0

    move-object v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$5;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media/MediaBrowserServiceCompat$Result;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onSubscribe(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 126
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v0

    .line 127
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "onSubscribe(): Ignoring empty id from "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MLS2LegacyStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 131
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Landroidx/media2/session/MediaLibraryServiceLegacyStub$1;

    invoke-direct {v2, p0, v0, p2, p1}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$1;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onUnsubscribe(Ljava/lang/String;)V
    .locals 3

    .line 155
    invoke-direct {p0}, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->getCurrentController()Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v0

    .line 156
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "onUnsubscribe(): Ignoring empty id from "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MLS2LegacyStub"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 160
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaLibraryServiceLegacyStub;->mLibrarySessionImpl:Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;

    invoke-interface {v1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Landroidx/media2/session/MediaLibraryServiceLegacyStub$2;

    invoke-direct {v2, p0, v0, p1}, Landroidx/media2/session/MediaLibraryServiceLegacyStub$2;-><init>(Landroidx/media2/session/MediaLibraryServiceLegacyStub;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
