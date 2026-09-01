.class Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;
.super Ljava/lang/Object;
.source "MediaSessionServiceImplBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->connect(Landroidx/media2/session/IMediaController;Landroidx/versionedparcelable/ParcelImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;

.field final synthetic val$caller:Landroidx/media2/session/IMediaController;

.field final synthetic val$connectionHints:Landroid/os/Bundle;

.field final synthetic val$isTrusted:Z

.field final synthetic val$packageName:Ljava/lang/String;

.field final synthetic val$pid:I

.field final synthetic val$remoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

.field final synthetic val$request:Landroidx/media2/session/ConnectionRequest;

.field final synthetic val$uid:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;Landroidx/media/MediaSessionManager$RemoteUserInfo;Landroidx/media2/session/ConnectionRequest;ZLandroid/os/Bundle;Landroidx/media2/session/IMediaController;Ljava/lang/String;II)V
    .locals 0

    .line 252
    iput-object p1, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->this$0:Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$remoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$request:Landroidx/media2/session/ConnectionRequest;

    iput-boolean p4, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$isTrusted:Z

    iput-object p5, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$connectionHints:Landroid/os/Bundle;

    iput-object p6, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    iput-object p7, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$packageName:Ljava/lang/String;

    iput p8, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$pid:I

    iput p9, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$uid:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 22

    move-object/from16 v1, p0

    .line 255
    const-string v2, "Notifying the controller of its disconnection"

    const-string v3, "MSS2ImplBase"

    .line 0
    const-string v0, "Rejecting incoming connection request from the controller="

    const-string v4, "Handling incoming connection request from the controller="

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 257
    :try_start_0
    iget-object v7, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->this$0:Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;

    iget-object v7, v7, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mServiceImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v7}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/media2/session/MediaSessionServiceImplBase;

    if-nez v7, :cond_0

    .line 260
    const-string v0, "ServiceImpl isn\'t available"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 304
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :try_start_1
    iget-object v0, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-interface {v0, v5}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    .line 264
    :cond_0
    :try_start_2
    invoke-virtual {v7}, Landroidx/media2/session/MediaSessionServiceImplBase;->getInstance()Landroidx/media2/session/MediaSessionService;

    move-result-object v7

    if-nez v7, :cond_1

    .line 267
    const-string v0, "Service isn\'t available"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 304
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :try_start_3
    iget-object v0, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-interface {v0, v5}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return-void

    .line 272
    :cond_1
    :try_start_4
    new-instance v14, Landroidx/media2/session/MediaSession$ControllerInfo;

    iget-object v9, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$remoteUserInfo:Landroidx/media/MediaSessionManager$RemoteUserInfo;

    iget-object v8, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$request:Landroidx/media2/session/ConnectionRequest;

    .line 273
    invoke-virtual {v8}, Landroidx/media2/session/ConnectionRequest;->getVersion()I

    move-result v10

    iget-boolean v11, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$isTrusted:Z

    iget-object v13, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$connectionHints:Landroid/os/Bundle;

    const/4 v12, 0x0

    move-object v8, v14

    invoke-direct/range {v8 .. v13}, Landroidx/media2/session/MediaSession$ControllerInfo;-><init>(Landroidx/media/MediaSessionManager$RemoteUserInfo;IZLandroidx/media2/session/MediaSession$ControllerCb;Landroid/os/Bundle;)V

    .line 276
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 281
    :try_start_5
    invoke-virtual {v7, v14}, Landroidx/media2/session/MediaSessionService;->onGetSession(Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/MediaSession;

    move-result-object v15

    if-nez v15, :cond_2

    .line 284
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 304
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :try_start_6
    iget-object v0, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-interface {v0, v5}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2

    :catch_2
    return-void

    .line 290
    :cond_2
    :try_start_7
    invoke-virtual {v7, v15}, Landroidx/media2/session/MediaSessionService;->addSession(Landroidx/media2/session/MediaSession;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 293
    :try_start_8
    iget-object v0, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    iget-object v4, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$request:Landroidx/media2/session/ConnectionRequest;

    .line 294
    invoke-virtual {v4}, Landroidx/media2/session/ConnectionRequest;->getVersion()I

    move-result v17

    iget-object v4, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$packageName:Ljava/lang/String;

    iget v6, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$pid:I

    iget v7, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$uid:I

    iget-object v8, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$connectionHints:Landroid/os/Bundle;

    move-object/from16 v16, v0

    move-object/from16 v18, v4

    move/from16 v19, v6

    move/from16 v20, v7

    move-object/from16 v21, v8

    .line 293
    invoke-virtual/range {v15 .. v21}, Landroidx/media2/session/MediaSession;->handleControllerConnectionFromService(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move v6, v5

    goto :goto_2

    :catch_3
    move-exception v0

    move v6, v5

    goto :goto_0

    :catch_4
    move-exception v0

    .line 298
    :goto_0
    :try_start_9
    const-string v4, "Failed to add a session to session service"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v6, :cond_3

    .line 304
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :try_start_a
    iget-object v0, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-interface {v0, v5}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_5

    :catch_5
    :cond_3
    :goto_1
    return-void

    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v6, :cond_4

    .line 304
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :try_start_b
    iget-object v2, v1, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;->val$caller:Landroidx/media2/session/IMediaController;

    invoke-interface {v2, v5}, Landroidx/media2/session/IMediaController;->onDisconnected(I)V
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_6

    .line 313
    :catch_6
    :cond_4
    throw v0
.end method
