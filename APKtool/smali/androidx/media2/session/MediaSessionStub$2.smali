.class Landroidx/media2/session/MediaSessionStub$2;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->connect(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$caller:Landroidx/media2/session/IMediaController;

.field final synthetic val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

.field final synthetic val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/IMediaController;)V
    .locals 0

    .line 331
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    iput-object p4, p0, Landroidx/media2/session/MediaSessionStub$2;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const-string v0, "Controller "

    .line 335
    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 338
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v1}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v1

    check-cast v1, Landroidx/media2/session/MediaSessionStub$Controller2Cb;

    .line 339
    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionStub$Controller2Cb;->getCallbackBinder()Landroid/os/IBinder;

    move-result-object v1

    .line 340
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v2

    iget-object v3, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 341
    invoke-interface {v3}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object v3

    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 340
    invoke-virtual {v2, v3, v4}, Landroidx/media2/session/MediaSession$SessionCallback;->onConnect(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SessionCommandGroup;

    move-result-object v2

    if-nez v2, :cond_3

    .line 345
    iget-object v3, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v3}, Landroidx/media2/session/MediaSession$ControllerInfo;->isTrusted()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 392
    :cond_1
    sget-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-eqz v0, :cond_2

    .line 393
    const-string v0, "MediaSessionStub"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Rejecting connection, controllerInfo="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 396
    :cond_2
    :try_start_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$2;->val$caller:Landroidx/media2/session/IMediaController;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_1

    .line 347
    :cond_3
    :goto_0
    sget-boolean v3, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    if-eqz v3, :cond_4

    .line 348
    const-string v3, "MediaSessionStub"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Accepting connection, controllerInfo="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " allowedCommands="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    if-nez v2, :cond_5

    .line 354
    new-instance v2, Landroidx/media2/session/SessionCommandGroup;

    invoke-direct {v2}, Landroidx/media2/session/SessionCommandGroup;-><init>()V

    .line 357
    :cond_5
    iget-object v3, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionStub;->mLock:Ljava/lang/Object;

    monitor-enter v3

    .line 358
    :try_start_1
    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v5, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v4, v5}, Landroidx/media2/session/ConnectedControllersManager;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 359
    const-string v4, "MediaSessionStub"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has sent connection request multiple times"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 362
    :cond_6
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v0, v0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    invoke-virtual {v0, v1, v4, v2}, Landroidx/media2/session/ConnectedControllersManager;->addController(Ljava/lang/Object;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V

    .line 364
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v0, v0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 365
    invoke-virtual {v0, v1}, Landroidx/media2/session/ConnectedControllersManager;->getSequencedFutureManager(Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SequencedFutureManager;

    move-result-object v0

    .line 366
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 374
    new-instance v1, Landroidx/media2/session/ConnectionResult;

    iget-object v3, p0, Landroidx/media2/session/MediaSessionStub$2;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v4, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-direct {v1, v3, v4, v2}, Landroidx/media2/session/ConnectionResult;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/SessionCommandGroup;)V

    .line 379
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result v2

    if-eqz v2, :cond_7

    return-void

    .line 383
    :cond_7
    :try_start_2
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-virtual {v0}, Landroidx/media2/session/SequencedFutureManager;->obtainNextSequenceNumber()I

    move-result v0

    .line 384
    invoke-static {v1}, Landroidx/media2/common/MediaParcelUtils;->toParcelable(Landroidx/versionedparcelable/VersionedParcelable;)Landroidx/versionedparcelable/ParcelImpl;

    move-result-object v1

    .line 383
    invoke-interface {v2, v0, v1}, Landroidx/media2/session/IMediaController;->onConnected(ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 389
    :catch_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$2;->val$sessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 390
    invoke-interface {v1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object v1

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$2;->val$controllerInfo:Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 389
    invoke-virtual {v0, v1, v2}, Landroidx/media2/session/MediaSession$SessionCallback;->onPostConnect(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;)V

    :catch_1
    :goto_1
    return-void

    :catchall_0
    move-exception v0

    .line 366
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
