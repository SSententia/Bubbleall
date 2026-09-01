.class Landroidx/media2/session/MediaSessionStub;
.super Landroidx/media2/session/IMediaSession$Stub;
.source "MediaSessionStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaSessionStub$Controller2Cb;,
        Landroidx/media2/session/MediaSessionStub$LibrarySessionCallbackTask;,
        Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;,
        Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;,
        Landroidx/media2/session/MediaSessionStub$SessionTask;
    }
.end annotation


# static fields
.field static final DEBUG:Z

.field private static final RETHROW_EXCEPTION:Z = true

.field private static final TAG:Ljava/lang/String; = "MediaSessionStub"

.field static final sCommandsForOnCommandRequest:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/media2/session/SessionCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media2/session/ConnectedControllersManager<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field final mLock:Ljava/lang/Object;

.field final mSessionImpl:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/media2/session/MediaSession$MediaSessionImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final mSessionManager:Landroidx/media/MediaSessionManager;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 82
    const-string v0, "MediaSessionStub"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media2/session/MediaSessionStub;->DEBUG:Z

    .line 83
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaSessionStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    .line 87
    new-instance v0, Landroidx/media2/session/SessionCommandGroup$Builder;

    invoke-direct {v0}, Landroidx/media2/session/SessionCommandGroup$Builder;-><init>()V

    const/4 v1, 0x2

    .line 88
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllPlayerCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    move-result-object v0

    .line 89
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllVolumeCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroidx/media2/session/SessionCommandGroup$Builder;->build()Landroidx/media2/session/SessionCommandGroup;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroidx/media2/session/SessionCommandGroup;->getCommands()Ljava/util/Set;

    move-result-object v0

    .line 92
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media2/session/SessionCommand;

    .line 93
    sget-object v2, Landroidx/media2/session/MediaSessionStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method constructor <init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Landroidx/media2/session/IMediaSession$Stub;-><init>()V

    .line 100
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionStub;->mLock:Ljava/lang/Object;

    .line 106
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionStub;->mSessionImpl:Ljava/lang/ref/WeakReference;

    .line 107
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/media/MediaSessionManager;->getSessionManager(Landroid/content/Context;)Landroidx/media/MediaSessionManager;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/MediaSessionStub;->mSessionManager:Landroidx/media/MediaSessionManager;

    .line 108
    new-instance v0, Landroidx/media2/session/ConnectedControllersManager;

    invoke-direct {v0, p1}, Landroidx/media2/session/ConnectedControllersManager;-><init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    return-void
.end method

.method private dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p3

    move-object v5, p4

    .line 160
    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTaskInternal(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method private dispatchSessionTask(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;Landroidx/media2/session/MediaSessionStub$SessionTask;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 166
    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTaskInternal(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method private dispatchSessionTaskInternal(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionStub$SessionTask;)V
    .locals 13

    move-object v9, p0

    .line 173
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v10

    .line 175
    :try_start_0
    iget-object v0, v9, Landroidx/media2/session/MediaSessionStub;->mSessionImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroidx/media2/session/MediaSession$MediaSessionImpl;

    if-eqz v7, :cond_2

    .line 176
    invoke-interface {v7}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 179
    :cond_0
    iget-object v0, v9, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    .line 180
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Landroidx/media2/session/ConnectedControllersManager;->getController(Ljava/lang/Object;)Landroidx/media2/session/MediaSession$ControllerInfo;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    .line 315
    invoke-static {v10, v11}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    .line 184
    :cond_1
    :try_start_1
    invoke-interface {v7}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v12, Landroidx/media2/session/MediaSessionStub$1;

    move-object v1, v12

    move-object v2, p0

    move-object/from16 v4, p3

    move v5, p2

    move/from16 v6, p4

    move-object/from16 v8, p5

    invoke-direct/range {v1 .. v8}, Landroidx/media2/session/MediaSessionStub$1;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;IILandroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSessionStub$SessionTask;)V

    invoke-interface {v0, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 315
    invoke-static {v10, v11}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :cond_2
    :goto_0
    invoke-static {v10, v11}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v10, v11}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 316
    throw v0
.end method

.method static sendLibraryResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V
    .locals 1

    .line 144
    new-instance v0, Landroidx/media2/session/LibraryResult;

    invoke-direct {v0, p2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-static {p0, p1, v0}, Landroidx/media2/session/MediaSessionStub;->sendLibraryResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/LibraryResult;)V

    return-void
.end method

.method static sendLibraryResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/LibraryResult;)V
    .locals 1

    .line 151
    :try_start_0
    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaSession$ControllerCb;->onLibraryResult(ILandroidx/media2/session/LibraryResult;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 153
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Exception in "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method static sendPlayerResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/common/SessionPlayer$PlayerResult;)V
    .locals 1

    .line 135
    :try_start_0
    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaSession$ControllerCb;->onPlayerResult(ILandroidx/media2/common/SessionPlayer$PlayerResult;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 137
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Exception in "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method static sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;II)V
    .locals 1

    .line 118
    new-instance v0, Landroidx/media2/session/SessionResult;

    invoke-direct {v0, p2}, Landroidx/media2/session/SessionResult;-><init>(I)V

    invoke-static {p0, p1, v0}, Landroidx/media2/session/MediaSessionStub;->sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/SessionResult;)V

    return-void
.end method

.method static sendSessionResult(Landroidx/media2/session/MediaSession$ControllerInfo;ILandroidx/media2/session/SessionResult;)V
    .locals 1

    .line 125
    :try_start_0
    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaSession$ControllerCb;->onSessionResult(ILandroidx/media2/session/SessionResult;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 127
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Exception in "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public addPlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 801
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$20;

    invoke-direct {v0, p0, p4, p3}, Landroidx/media2/session/MediaSessionStub$20;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;I)V

    const/16 p3, 0x271d

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public adjustVolume(Landroidx/media2/session/IMediaController;III)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 507
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$4;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$4;-><init>(Landroidx/media2/session/MediaSessionStub;II)V

    const/16 p3, 0x7531

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public connect(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-eqz p1, :cond_2

    if-nez p3, :cond_0

    goto :goto_1

    .line 436
    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v5

    .line 437
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result p2

    .line 438
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v7

    .line 439
    invoke-static {p3}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p3

    check-cast p3, Landroidx/media2/session/ConnectionRequest;

    if-eqz p2, :cond_1

    goto :goto_0

    .line 442
    :cond_1
    invoke-virtual {p3}, Landroidx/media2/session/ConnectionRequest;->getPid()I

    move-result p2

    :goto_0
    move v4, p2

    .line 444
    :try_start_0
    invoke-virtual {p3}, Landroidx/media2/session/ConnectionRequest;->getVersion()I

    move-result v2

    invoke-virtual {p3}, Landroidx/media2/session/ConnectionRequest;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 445
    invoke-virtual {p3}, Landroidx/media2/session/ConnectionRequest;->getConnectionHints()Landroid/os/Bundle;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    .line 444
    invoke-virtual/range {v0 .. v6}, Landroidx/media2/session/MediaSessionStub;->connect(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    invoke-static {v7, v8}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v7, v8}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 448
    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method connect(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
    .locals 6

    .line 322
    new-instance v1, Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-direct {v1, p3, p4, p5}, Landroidx/media/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    .line 324
    new-instance p3, Landroidx/media2/session/MediaSession$ControllerInfo;

    iget-object p4, p0, Landroidx/media2/session/MediaSessionStub;->mSessionManager:Landroidx/media/MediaSessionManager;

    .line 325
    invoke-virtual {p4, v1}, Landroidx/media/MediaSessionManager;->isTrustedForMediaControl(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Z

    move-result v3

    new-instance v4, Landroidx/media2/session/MediaSessionStub$Controller2Cb;

    invoke-direct {v4, p0, p1}, Landroidx/media2/session/MediaSessionStub$Controller2Cb;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/IMediaController;)V

    move-object v0, p3

    move v2, p2

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSession$ControllerInfo;-><init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V

    .line 327
    iget-object p2, p0, Landroidx/media2/session/MediaSessionStub;->mSessionImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/session/MediaSession$MediaSessionImpl;

    if-eqz p2, :cond_1

    .line 328
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    .line 331
    :cond_0
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object p4

    new-instance p5, Landroidx/media2/session/MediaSessionStub$2;

    invoke-direct {p5, p0, p2, p3, p1}, Landroidx/media2/session/MediaSessionStub$2;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/IMediaController;)V

    invoke-interface {p4, p5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method convertMediaItemOnExecutor(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/common/MediaItem;
    .locals 2

    .line 410
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 413
    :cond_0
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    .line 414
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object p1

    .line 413
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media2/session/MediaSession$SessionCallback;->onCreateMediaItem(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/common/MediaItem;

    move-result-object p1

    .line 415
    const-string p2, "onCreateMediaItem(mediaId="

    if-nez p1, :cond_1

    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ") returned null. Ignoring"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "MediaSessionStub"

    invoke-static {p3, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 417
    :cond_1
    invoke-virtual {p1}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 419
    invoke-virtual {p1}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v0

    const-string v1, "android.media.metadata.MEDIA_ID"

    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 418
    invoke-static {p3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-object p1

    .line 420
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "): media ID in the returned media item should match"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public deselectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 999
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$31;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$31;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V

    const/16 p3, 0x2afa

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public fastForward(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 568
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$8;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$8;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const v1, 0x9c40

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public getChildren(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p6, :cond_0

    goto :goto_0

    .line 1059
    :cond_0
    new-instance v6, Landroidx/media2/session/MediaSessionStub$34;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSessionStub$34;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V

    const p3, 0xc353

    invoke-direct {p0, p1, p2, p3, v6}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/media2/session/ConnectedControllersManager<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    return-object v0
.end method

.method public getItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1038
    new-instance v0, Landroidx/media2/session/MediaSessionStub$33;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$33;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;)V

    const p3, 0xc354

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public getLibraryRoot(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 1023
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$32;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$32;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V

    const p3, 0xc350

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getSearchResult(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 7

    if-eqz p1, :cond_1

    if-nez p6, :cond_0

    goto :goto_0

    .line 1111
    :cond_0
    new-instance v6, Landroidx/media2/session/MediaSessionStub$36;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSessionStub$36;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V

    const p3, 0xc356

    invoke-direct {p0, p1, p2, p3, v6}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public movePlaylistItem(Landroidx/media2/session/IMediaController;III)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 868
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$23;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$23;-><init>(Landroidx/media2/session/MediaSessionStub;II)V

    const/16 p3, 0x2723

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public onControllerResult(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 3

    if-eqz p1, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    .line 470
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    .line 472
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    .line 473
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 472
    invoke-virtual {v2, p1}, Landroidx/media2/session/ConnectedControllersManager;->getSequencedFutureManager(Ljava/lang/Object;)Landroidx/media2/session/SequencedFutureManager;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    .line 480
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    .line 477
    :cond_1
    :try_start_1
    invoke-static {p3}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p3

    check-cast p3, Landroidx/media2/session/SessionResult;

    .line 478
    invoke-virtual {p1, p2, p3}, Landroidx/media2/session/SequencedFutureManager;->setFutureResult(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 480
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 481
    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public onCustomCommand(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 644
    :cond_0
    invoke-static {p3}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p3

    check-cast p3, Landroidx/media2/session/SessionCommand;

    .line 645
    new-instance v0, Landroidx/media2/session/MediaSessionStub$13;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$13;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;ILandroidx/media2/session/SessionCommand;Landroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public pause(Landroidx/media2/session/IMediaController;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 538
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$6;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$6;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const/16 v1, 0x2711

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public play(Landroidx/media2/session/IMediaController;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 523
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$5;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$5;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const/16 v1, 0x2710

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public prepare(Landroidx/media2/session/IMediaController;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 553
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$7;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$7;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const/16 v1, 0x2712

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public release(Landroidx/media2/session/IMediaController;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 456
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    .line 458
    :try_start_0
    iget-object p2, p0, Landroidx/media2/session/MediaSessionStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/media2/session/ConnectedControllersManager;->removeController(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 461
    throw p1
.end method

.method public removePlaylistItem(Landroidx/media2/session/IMediaController;II)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 826
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$21;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$21;-><init>(Landroidx/media2/session/MediaSessionStub;I)V

    const/16 p3, 0x271e

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public replacePlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 842
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$22;

    invoke-direct {v0, p0, p4, p3}, Landroidx/media2/session/MediaSessionStub$22;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;I)V

    const/16 p3, 0x271f

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public rewind(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 583
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$9;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$9;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const v1, 0x9c41

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public search(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 1090
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$35;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$35;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V

    const p3, 0xc355

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public seekTo(Landroidx/media2/session/IMediaController;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 628
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$12;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$12;-><init>(Landroidx/media2/session/MediaSessionStub;J)V

    const/16 p3, 0x2713

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public selectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 980
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$30;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$30;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V

    const/16 p3, 0x2af9

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setMediaItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 739
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$17;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$17;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;)V

    const/16 p3, 0x2722

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setMediaUri(Landroidx/media2/session/IMediaController;ILandroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 764
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$18;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$18;-><init>(Landroidx/media2/session/MediaSessionStub;Landroid/net/Uri;Landroid/os/Bundle;)V

    const p3, 0x9c4b

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setPlaybackSpeed(Landroidx/media2/session/IMediaController;IF)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 695
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$15;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$15;-><init>(Landroidx/media2/session/MediaSessionStub;F)V

    const/16 p3, 0x2714

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setPlaylist(Landroidx/media2/session/IMediaController;ILjava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/IMediaController;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 711
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$16;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$16;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V

    const/16 p3, 0x2716

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setRating(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 671
    :cond_0
    invoke-static {p4}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p4

    check-cast p4, Landroidx/media2/common/Rating;

    .line 672
    new-instance v0, Landroidx/media2/session/MediaSessionStub$14;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$14;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;Landroidx/media2/common/Rating;)V

    const p3, 0x9c4a

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setRepeatMode(Landroidx/media2/session/IMediaController;II)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 935
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$27;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$27;-><init>(Landroidx/media2/session/MediaSessionStub;I)V

    const/16 p3, 0x271b

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setShuffleMode(Landroidx/media2/session/IMediaController;II)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 950
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$28;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$28;-><init>(Landroidx/media2/session/MediaSessionStub;I)V

    const/16 p3, 0x271a

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setSurface(Landroidx/media2/session/IMediaController;ILandroid/view/Surface;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 965
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$29;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$29;-><init>(Landroidx/media2/session/MediaSessionStub;Landroid/view/Surface;)V

    const/16 p3, 0x2af8

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public setVolumeTo(Landroidx/media2/session/IMediaController;III)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 490
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$3;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$3;-><init>(Landroidx/media2/session/MediaSessionStub;II)V

    const/16 p3, 0x7530

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public skipBackward(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 613
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$11;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$11;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const v1, 0x9c43

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public skipForward(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 598
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$10;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$10;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const v1, 0x9c42

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public skipToNextItem(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 919
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$26;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$26;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const/16 v1, 0x2719

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public skipToPlaylistItem(Landroidx/media2/session/IMediaController;II)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 883
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$24;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$24;-><init>(Landroidx/media2/session/MediaSessionStub;I)V

    const/16 p3, 0x2717

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public skipToPreviousItem(Landroidx/media2/session/IMediaController;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 903
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$25;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionStub$25;-><init>(Landroidx/media2/session/MediaSessionStub;)V

    const/16 v1, 0x2718

    invoke-direct {p0, p1, p2, v1, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public subscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    .line 1145
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$37;

    invoke-direct {v0, p0, p3, p4}, Landroidx/media2/session/MediaSessionStub$37;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V

    const p3, 0xc351

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public unsubscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1166
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$38;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$38;-><init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;)V

    const p3, 0xc352

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method

.method public updatePlaylistMetadata(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 784
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionStub$19;

    invoke-direct {v0, p0, p3}, Landroidx/media2/session/MediaSessionStub$19;-><init>(Landroidx/media2/session/MediaSessionStub;Landroidx/versionedparcelable/ParcelImpl;)V

    const/16 p3, 0x2721

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/session/MediaSessionStub;->dispatchSessionTask(Landroidx/media2/session/IMediaController;IILandroidx/media2/session/MediaSessionStub$SessionTask;)V

    return-void
.end method
