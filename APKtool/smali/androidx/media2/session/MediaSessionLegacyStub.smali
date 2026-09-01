.class Landroidx/media2/session/MediaSessionLegacyStub;
.super Landroid/support/v4/media/session/MediaSessionCompat$Callback;
.source "MediaSessionLegacyStub.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaSessionLegacyStub$ConnectionTimeoutHandler;,
        Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;,
        Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCb;,
        Landroidx/media2/session/MediaSessionLegacyStub$SessionTask;
    }
.end annotation


# static fields
.field static final DEBUG:Z

.field private static final DEFAULT_CONNECTION_TIMEOUT_MS:I = 0x493e0

.field private static final DEFAULT_MEDIA_SESSION_TAG_DELIM:Ljava/lang/String; = "."

.field private static final DEFAULT_MEDIA_SESSION_TAG_PREFIX:Ljava/lang/String; = "androidx.media2.session.id"

.field private static final TAG:Ljava/lang/String; = "MediaSessionLegacyStub"

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
            "Landroidx/media/MediaSessionManager$RemoteUserInfo;",
            ">;"
        }
    .end annotation
.end field

.field final mConnectionTimeoutHandler:Landroidx/media2/session/MediaSessionLegacyStub$ConnectionTimeoutHandler;

.field volatile mConnectionTimeoutMs:J

.field final mContext:Landroid/content/Context;

.field final mControllerLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

.field private final mHandler:Landroid/os/Handler;

.field final mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

.field final mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

.field final mSessionManager:Landroidx/media/MediaSessionManager;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 77
    const-string v0, "MediaSessionLegacyStub"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media2/session/MediaSessionLegacyStub;->DEBUG:Z

    .line 83
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaSessionLegacyStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

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
    sget-object v2, Landroidx/media2/session/MediaSessionLegacyStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method constructor <init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Handler;)V
    .locals 7

    .line 112
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Callback;-><init>()V

    .line 113
    iput-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 114
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mContext:Landroid/content/Context;

    .line 115
    invoke-static {v1}, Landroidx/media/MediaSessionManager;->getSessionManager(Landroid/content/Context;)Landroidx/media/MediaSessionManager;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionManager:Landroidx/media/MediaSessionManager;

    .line 116
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mControllerLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

    .line 117
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$ConnectionTimeoutHandler;

    invoke-virtual {p4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Landroidx/media2/session/MediaSessionLegacyStub$ConnectionTimeoutHandler;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectionTimeoutHandler:Landroidx/media2/session/MediaSessionLegacyStub$ConnectionTimeoutHandler;

    .line 118
    new-instance v0, Landroidx/media2/session/ConnectedControllersManager;

    invoke-direct {v0, p1}, Landroidx/media2/session/ConnectedControllersManager;-><init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    const-wide/32 v2, 0x493e0

    .line 119
    iput-wide v2, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectionTimeoutMs:J

    .line 120
    iput-object p4, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mHandler:Landroid/os/Handler;

    .line 122
    const-string p4, "androidx.media2.session.id"

    .line 123
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getId()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p4, v0}, [Ljava/lang/String;

    move-result-object p4

    .line 122
    const-string v0, "."

    invoke-static {v0, p4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 124
    new-instance p4, Landroid/support/v4/media/session/MediaSessionCompat;

    .line 127
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getToken()Landroidx/media2/session/SessionToken;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media2/session/SessionToken;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 128
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getToken()Landroidx/media2/session/SessionToken;

    move-result-object v6

    move-object v0, p4

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;Landroidx/versionedparcelable/VersionedParcelable;)V

    iput-object p4, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 129
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getSessionActivity()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setSessionActivity(Landroid/app/PendingIntent;)V

    const/4 p1, 0x4

    .line 130
    invoke-virtual {p4, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setFlags(I)V

    return-void
.end method

.method static createVolumeProviderCompat(Landroidx/media2/session/RemoteSessionPlayer;)Landroidx/media/VolumeProviderCompat;
    .locals 4

    .line 630
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$22;

    invoke-virtual {p0}, Landroidx/media2/session/RemoteSessionPlayer;->getVolumeControlType()I

    move-result v1

    invoke-virtual {p0}, Landroidx/media2/session/RemoteSessionPlayer;->getMaxVolume()I

    move-result v2

    .line 631
    invoke-virtual {p0}, Landroidx/media2/session/RemoteSessionPlayer;->getVolume()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p0}, Landroidx/media2/session/MediaSessionLegacyStub$22;-><init>(IIILandroidx/media2/session/RemoteSessionPlayer;)V

    return-object v0
.end method

.method private dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V
    .locals 1

    const/4 v0, 0x0

    .line 524
    invoke-direct {p0, v0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTaskInternal(Landroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method private dispatchSessionTask(Landroidx/media2/session/SessionCommand;Landroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V
    .locals 1

    const/4 v0, 0x0

    .line 529
    invoke-direct {p0, p1, v0, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTaskInternal(Landroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method private dispatchSessionTaskInternal(Landroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V
    .locals 8

    .line 535
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 538
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 539
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->getCurrentControllerInfo()Landroidx/media/MediaSessionManager$RemoteUserInfo;

    move-result-object v3

    if-nez v3, :cond_1

    .line 541
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "RemoteUserInfo is null, ignoring command="

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", commandCode="

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionLegacyStub"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 545
    :cond_1
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v7, Landroidx/media2/session/MediaSessionLegacyStub$21;

    move-object v1, v7

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Landroidx/media2/session/MediaSessionLegacyStub$21;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroidx/media/MediaSessionManager$RemoteUserInfo;Landroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static getRatingType(Landroidx/media2/common/Rating;)I
    .locals 2

    .line 648
    instance-of v0, p0, Landroidx/media2/session/HeartRating;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 650
    :cond_0
    instance-of v0, p0, Landroidx/media2/session/ThumbRating;

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    .line 652
    :cond_1
    instance-of v0, p0, Landroidx/media2/session/StarRating;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 653
    check-cast p0, Landroidx/media2/session/StarRating;

    invoke-virtual {p0}, Landroidx/media2/session/StarRating;->getMaxStars()I

    move-result p0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    return v1

    :cond_2
    return v0

    .line 663
    :cond_3
    instance-of p0, p0, Landroidx/media2/session/PercentageRating;

    if-eqz p0, :cond_4

    const/4 p0, 0x6

    return p0

    :cond_4
    return v1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 146
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->release()V

    return-void
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

    .line 519
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    return-object v0
.end method

.method getControllerLegacyCbForBroadcast()Landroidx/media2/session/MediaSession$ControllerCb;
    .locals 1

    .line 515
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mControllerLegacyCbForBroadcast:Landroidx/media2/session/MediaSession$ControllerCb;

    return-object v0
.end method

.method public getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 1

    .line 150
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    return-object v0
.end method

.method handleTaskOnExecutor(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 589
    iget-object p3, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    invoke-virtual {p3, p1, p2}, Landroidx/media2/session/ConnectedControllersManager;->isAllowedCommand(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;)Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 592
    :cond_0
    sget-object p3, Landroidx/media2/session/MediaSessionLegacyStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroidx/media2/session/SessionCommand;->getCommandCode()I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/session/SessionCommand;

    goto :goto_0

    .line 594
    :cond_1
    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectedControllersManager:Landroidx/media2/session/ConnectedControllersManager;

    invoke-virtual {p2, p1, p3}, Landroidx/media2/session/ConnectedControllersManager;->isAllowedCommand(Landroidx/media2/session/MediaSession$ControllerInfo;I)Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    .line 597
    :cond_2
    sget-object p2, Landroidx/media2/session/MediaSessionLegacyStub;->sCommandsForOnCommandRequest:Landroid/util/SparseArray;

    invoke-virtual {p2, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media2/session/SessionCommand;

    .line 599
    :goto_0
    const-string p3, "MediaSessionLegacyStub"

    if-eqz p2, :cond_4

    .line 600
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    iget-object v1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 601
    invoke-interface {v1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object v1

    .line 600
    invoke-virtual {v0, v1, p1, p2}, Landroidx/media2/session/MediaSession$SessionCallback;->onCommandRequest(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 604
    sget-boolean p4, Landroidx/media2/session/MediaSessionLegacyStub;->DEBUG:Z

    if-eqz p4, :cond_3

    .line 605
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Command ("

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ") from "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was rejected by "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void

    .line 612
    :cond_4
    :try_start_0
    invoke-interface {p4, p1}, Landroidx/media2/session/MediaSessionLegacyStub$SessionTask;->run(Landroidx/media2/session/MediaSession$ControllerInfo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    .line 619
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Exception in "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    const v0, 0x7fffffff

    .line 446
    invoke-virtual {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    return-void
.end method

.method public onAddQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 454
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$18;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub$18;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/support/v4/media/MediaDescriptionCompat;I)V

    const/16 p1, 0x271d

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 158
    :cond_0
    new-instance v0, Landroidx/media2/session/SessionCommand;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/media2/session/SessionCommand;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 159
    new-instance p1, Landroidx/media2/session/MediaSessionLegacyStub$1;

    invoke-direct {p1, p0, v0, p2, p3}, Landroidx/media2/session/MediaSessionLegacyStub$1;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    invoke-direct {p0, v0, p1}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(Landroidx/media2/session/SessionCommand;Landroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onFastForward()V
    .locals 2

    .line 363
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$13;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$13;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const v1, 0x9c40

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 267
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$6;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$6;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2711

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onPlay()V
    .locals 2

    .line 220
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$4;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$4;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2710

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 231
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "androidx"

    .line 232
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "media2-session"

    .line 233
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "playFromMediaId"

    .line 234
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "id"

    .line 235
    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 236
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 237
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 242
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "androidx"

    .line 243
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "media2-session"

    .line 244
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "playFromSearch"

    .line 245
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "query"

    .line 246
    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 247
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 248
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 253
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$5;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub$5;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/net/Uri;Landroid/os/Bundle;)V

    const p1, 0x9c4b

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onPrepare()V
    .locals 2

    .line 173
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$2;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$2;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2712

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 184
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "androidx"

    .line 185
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "media2-session"

    .line 186
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "prepareFromMediaId"

    .line 187
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "id"

    .line 188
    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 189
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 190
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 195
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "androidx"

    .line 196
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "media2-session"

    .line 197
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "prepareFromSearch"

    .line 198
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "query"

    .line 199
    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 200
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 201
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 206
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$3;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub$3;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/net/Uri;Landroid/os/Bundle;)V

    const p1, 0x9c4b

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onRemoveQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 476
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$19;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$19;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/support/v4/media/MediaDescriptionCompat;)V

    const/16 p1, 0x271e

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onRemoveQueueItemAt(I)V
    .locals 1

    .line 500
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$20;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$20;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;I)V

    const/16 p1, 0x271e

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onRewind()V
    .locals 2

    .line 375
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$14;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$14;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const v1, 0x9c41

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSeekTo(J)V
    .locals 1

    .line 299
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$8;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub$8;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;J)V

    const/16 p1, 0x2713

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSetCaptioningEnabled(Z)V
    .locals 0

    return-void
.end method

.method public onSetPlaybackSpeed(F)V
    .locals 1

    .line 334
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$11;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$11;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;F)V

    const/16 p1, 0x2714

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;)V
    .locals 1

    const/4 v0, 0x0

    .line 386
    invoke-virtual {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    return-void
.end method

.method public onSetRating(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 395
    :cond_0
    new-instance p2, Landroidx/media2/session/MediaSessionLegacyStub$15;

    invoke-direct {p2, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$15;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;Landroid/support/v4/media/RatingCompat;)V

    const p1, 0x9c4a

    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSetRepeatMode(I)V
    .locals 1

    .line 422
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$16;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$16;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;I)V

    const/16 p1, 0x271b

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSetShuffleMode(I)V
    .locals 1

    .line 434
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$17;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionLegacyStub$17;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;I)V

    const/16 p1, 0x271a

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSkipToNext()V
    .locals 2

    .line 310
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$9;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$9;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2719

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSkipToPrevious()V
    .locals 2

    .line 322
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$10;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$10;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2718

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onSkipToQueueItem(J)V
    .locals 1

    .line 345
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$12;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub$12;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;J)V

    const/16 p1, 0x2717

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 281
    new-instance v0, Landroidx/media2/session/MediaSessionLegacyStub$7;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionLegacyStub$7;-><init>(Landroidx/media2/session/MediaSessionLegacyStub;)V

    const/16 v1, 0x2711

    invoke-direct {p0, v1, v0}, Landroidx/media2/session/MediaSessionLegacyStub;->dispatchSessionTask(ILandroidx/media2/session/MediaSessionLegacyStub$SessionTask;)V

    return-void
.end method

.method public setLegacyControllerDisconnectTimeoutMs(J)V
    .locals 0

    .line 624
    iput-wide p1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mConnectionTimeoutMs:J

    return-void
.end method

.method public start()V
    .locals 2

    .line 140
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V

    .line 141
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setActive(Z)V

    return-void
.end method
