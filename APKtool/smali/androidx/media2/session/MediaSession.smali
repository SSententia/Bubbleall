.class public Landroidx/media2/session/MediaSession;
.super Ljava/lang/Object;
.source "MediaSession.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaSession$BuilderBase;,
        Landroidx/media2/session/MediaSession$MediaSessionImpl;,
        Landroidx/media2/session/MediaSession$ControllerCb;,
        Landroidx/media2/session/MediaSession$CommandButton;,
        Landroidx/media2/session/MediaSession$ControllerInfo;,
        Landroidx/media2/session/MediaSession$Builder;,
        Landroidx/media2/session/MediaSession$SessionCallback;
    }
.end annotation


# static fields
.field private static final SESSION_ID_TO_SESSION_MAP:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/media2/session/MediaSession;",
            ">;"
        }
    .end annotation
.end field

.field private static final STATIC_LOCK:Ljava/lang/Object;

.field static final TAG:Ljava/lang/String; = "MediaSession"


# instance fields
.field private final mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 175
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaSession;->STATIC_LOCK:Ljava/lang/Object;

    .line 179
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaSession;->SESSION_ID_TO_SESSION_MAP:Ljava/util/HashMap;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "Session ID must be unique. ID="

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    sget-object v1, Landroidx/media2/session/MediaSession;->STATIC_LOCK:Ljava/lang/Object;

    monitor-enter v1

    .line 187
    :try_start_0
    sget-object v2, Landroidx/media2/session/MediaSession;->SESSION_ID_TO_SESSION_MAP:Ljava/util/HashMap;

    invoke-virtual {v2, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 190
    invoke-virtual {v2, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    invoke-virtual/range {p0 .. p7}, Landroidx/media2/session/MediaSession;->createImpl(Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$MediaSessionImpl;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    return-void

    .line 188
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 191
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method static getSession(Landroid/net/Uri;)Landroidx/media2/session/MediaSession;
    .locals 4

    .line 211
    sget-object v0, Landroidx/media2/session/MediaSession;->STATIC_LOCK:Ljava/lang/Object;

    monitor-enter v0

    .line 212
    :try_start_0
    sget-object v1, Landroidx/media2/session/MediaSession;->SESSION_ID_TO_SESSION_MAP:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/session/MediaSession;

    .line 213
    invoke-direct {v2}, Landroidx/media2/session/MediaSession;->getUri()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3, p0}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 214
    monitor-exit v0

    return-object v2

    .line 217
    :cond_1
    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private getUri()Landroid/net/Uri;
    .locals 1

    .line 469
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public broadcastCustomCommand(Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 386
    invoke-virtual {p1}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 389
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->broadcastCustomCommand(Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V

    return-void

    .line 387
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "command should be a custom command"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 384
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "command shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 3

    .line 236
    :try_start_0
    sget-object v0, Landroidx/media2/session/MediaSession;->STATIC_LOCK:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    :try_start_1
    sget-object v1, Landroidx/media2/session/MediaSession;->SESSION_ID_TO_SESSION_MAP:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    :try_start_2
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 238
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method createImpl(Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$MediaSessionImpl;
    .locals 10

    .line 199
    new-instance v9, Landroidx/media2/session/MediaSessionImplBase;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Landroidx/media2/session/MediaSessionImplBase;-><init>(Landroidx/media2/session/MediaSession;Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)V

    return-object v9
.end method

.method getCallback()Landroidx/media2/session/MediaSession$SessionCallback;
    .locals 1

    .line 295
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    return-object v0
.end method

.method getCallbackExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 290
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public getConnectedControllers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            ">;"
        }
    .end annotation

    .line 305
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getConnectedControllers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method getContext()Landroid/content/Context;
    .locals 1

    .line 285
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 272
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getImpl()Landroidx/media2/session/MediaSession$MediaSessionImpl;
    .locals 1

    .line 207
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    return-object v0
.end method

.method getLegacyBrowerServiceBinder()Landroid/os/IBinder;
    .locals 1

    .line 464
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getLegacyBrowserServiceBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public getPlayer()Landroidx/media2/common/SessionPlayer;
    .locals 1

    .line 262
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object v0

    return-object v0
.end method

.method public getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 1

    .line 422
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    return-object v0
.end method

.method public getSessionCompatToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .line 433
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method

.method public getToken()Landroidx/media2/session/SessionToken;
    .locals 1

    .line 280
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getToken()Landroidx/media2/session/SessionToken;

    move-result-object v0

    return-object v0
.end method

.method handleControllerConnectionFromService(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
    .locals 7

    .line 459
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->connectFromService(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V

    return-void
.end method

.method public isClosed()Z
    .locals 1

    .line 250
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result v0

    return v0
.end method

.method public sendCustomCommand(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            "Landroidx/media2/session/SessionCommand;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 411
    invoke-virtual {p2}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 414
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1, p2, p3}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->sendCustomCommand(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 412
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "command should be a custom command"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 409
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "command shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 406
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "controller shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAllowedCommands(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 367
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setAllowedCommands(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V

    return-void

    .line 365
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "commands shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 362
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "controller shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCustomLayout(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 345
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setCustomLayout(Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 343
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "layout shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 340
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "controller shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLegacyControllerConnectionTimeoutMs(J)V
    .locals 1

    .line 444
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setLegacyControllerConnectionTimeoutMs(J)V

    return-void
.end method

.method public updatePlayer(Landroidx/media2/common/SessionPlayer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 230
    iget-object v0, p0, Landroidx/media2/session/MediaSession;->mImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0, p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->updatePlayer(Landroidx/media2/common/SessionPlayer;)V

    return-void

    .line 228
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "player shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
