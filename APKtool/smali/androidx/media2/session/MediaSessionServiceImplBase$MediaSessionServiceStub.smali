.class final Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;
.super Landroidx/media2/session/IMediaSessionService$Stub;
.source "MediaSessionServiceImplBase.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSessionServiceImplBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "MediaSessionServiceStub"
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private final mMediaSessionManager:Landroidx/media/MediaSessionManager;

.field final mServiceImpl:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/media2/session/MediaSessionServiceImplBase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionServiceImplBase;)V
    .locals 2

    .line 226
    invoke-direct {p0}, Landroidx/media2/session/IMediaSessionService$Stub;-><init>()V

    .line 227
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mServiceImpl:Ljava/lang/ref/WeakReference;

    .line 228
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroidx/media2/session/MediaSessionServiceImplBase;->getInstance()Landroidx/media2/session/MediaSessionService;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mHandler:Landroid/os/Handler;

    .line 229
    invoke-virtual {p1}, Landroidx/media2/session/MediaSessionServiceImplBase;->getInstance()Landroidx/media2/session/MediaSessionService;

    move-result-object p1

    invoke-static {p1}, Landroidx/media/MediaSessionManager;->getSessionManager(Landroid/content/Context;)Landroidx/media/MediaSessionManager;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mMediaSessionManager:Landroidx/media/MediaSessionManager;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 323
    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mServiceImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 324
    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public connect(Landroidx/media2/session/IMediaController;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 13

    .line 234
    iget-object v0, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mServiceImpl:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/session/MediaSessionServiceImplBase;

    if-nez v0, :cond_0

    .line 237
    const-string p1, "MSS2ImplBase"

    const-string p2, "ServiceImpl isn\'t available"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 241
    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    .line 242
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v10

    .line 243
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v11

    .line 244
    invoke-static {p2}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/media2/session/ConnectionRequest;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 245
    :cond_1
    invoke-virtual {v4}, Landroidx/media2/session/ConnectionRequest;->getPid()I

    move-result v0

    :goto_0
    move v9, v0

    const/4 v0, 0x0

    if-nez p2, :cond_2

    move-object v8, v0

    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {v4}, Landroidx/media2/session/ConnectionRequest;->getPackageName()Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    :goto_1
    if-nez p2, :cond_3

    move-object v6, v0

    goto :goto_2

    .line 248
    :cond_3
    invoke-virtual {v4}, Landroidx/media2/session/ConnectionRequest;->getConnectionHints()Landroid/os/Bundle;

    move-result-object p2

    move-object v6, p2

    .line 249
    :goto_2
    new-instance v3, Landroidx/media/MediaSessionManager$RemoteUserInfo;

    invoke-direct {v3, v8, v9, v10}, Landroidx/media/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    .line 250
    iget-object p2, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mMediaSessionManager:Landroidx/media/MediaSessionManager;

    invoke-virtual {p2, v3}, Landroidx/media/MediaSessionManager;->isTrustedForMediaControl(Landroidx/media/MediaSessionManager$RemoteUserInfo;)Z

    move-result v5

    .line 252
    :try_start_0
    iget-object p2, p0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;->mHandler:Landroid/os/Handler;

    new-instance v0, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;

    move-object v1, v0

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub$1;-><init>(Landroidx/media2/session/MediaSessionServiceImplBase$MediaSessionServiceStub;Landroidx/media/MediaSessionManager$RemoteUserInfo;Landroidx/media2/session/ConnectionRequest;ZLandroid/os/Bundle;Landroidx/media2/session/IMediaController;Ljava/lang/String;II)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    invoke-static {v11, v12}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v11, v12}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 318
    throw p1
.end method
