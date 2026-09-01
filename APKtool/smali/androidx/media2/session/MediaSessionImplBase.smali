.class Landroidx/media2/session/MediaSessionImplBase;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSession$MediaSessionImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;,
        Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;,
        Landroidx/media2/session/MediaSessionImplBase$PlaylistItemListener;,
        Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;,
        Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;,
        Landroidx/media2/session/MediaSessionImplBase$PlayerTask;
    }
.end annotation


# static fields
.field static final DEBUG:Z

.field private static final RESULT_WHEN_CLOSED:Landroidx/media2/session/SessionResult;

.field private static final STATIC_LOCK:Ljava/lang/Object;

.field static final TAG:Ljava/lang/String; = "MSImplBase"

.field private static sComponentNamesInitialized:Z = false

.field private static sServiceComponentName:Landroid/content/ComponentName;


# instance fields
.field private final mAudioManager:Landroid/media/AudioManager;

.field private final mBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private mBrowserServiceLegacyStub:Landroidx/media/MediaBrowserServiceCompat;

.field final mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

.field final mCallbackExecutor:Ljava/util/concurrent/Executor;

.field private mClosed:Z

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mHandlerThread:Landroid/os/HandlerThread;

.field private final mInstance:Landroidx/media2/session/MediaSession;

.field final mLock:Ljava/lang/Object;

.field private final mMediaButtonIntent:Landroid/app/PendingIntent;

.field mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

.field mPlayer:Landroidx/media2/common/SessionPlayer;

.field private final mPlayerCallback:Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

.field private final mSessionActivity:Landroid/app/PendingIntent;

.field private final mSessionId:Ljava/lang/String;

.field private final mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

.field private final mSessionStub:Landroidx/media2/session/MediaSessionStub;

.field private final mSessionToken:Landroidx/media2/session/SessionToken;

.field final mSessionUri:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/media2/session/MediaSessionImplBase;->STATIC_LOCK:Ljava/lang/Object;

    .line 101
    const-string v0, "MSImplBase"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media2/session/MediaSessionImplBase;->DEBUG:Z

    .line 103
    new-instance v0, Landroidx/media2/session/SessionResult;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/media2/session/SessionResult;-><init>(I)V

    sput-object v0, Landroidx/media2/session/MediaSessionImplBase;->RESULT_WHEN_CLOSED:Landroidx/media2/session/SessionResult;

    return-void
.end method

.method constructor <init>(Landroidx/media2/session/MediaSession;Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)V
    .locals 7

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    .line 144
    iput-object p2, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    .line 145
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mInstance:Landroidx/media2/session/MediaSession;

    .line 146
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "MediaSession_Thread"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mHandlerThread:Landroid/os/HandlerThread;

    .line 147
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 148
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mHandler:Landroid/os/Handler;

    .line 150
    new-instance v5, Landroidx/media2/session/MediaSessionStub;

    invoke-direct {v5, p0}, Landroidx/media2/session/MediaSessionStub;-><init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;)V

    iput-object v5, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    .line 151
    iput-object p5, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionActivity:Landroid/app/PendingIntent;

    .line 153
    iput-object p7, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    .line 154
    iput-object p6, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 155
    const-string p1, "audio"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mAudioManager:Landroid/media/AudioManager;

    .line 157
    new-instance p1, Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

    invoke-direct {p1, p0}, Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayerCallback:Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

    .line 159
    iput-object p3, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionId:Ljava/lang/String;

    .line 169
    new-instance p1, Landroid/net/Uri$Builder;

    invoke-direct {p1}, Landroid/net/Uri$Builder;-><init>()V

    const-class p5, Landroidx/media2/session/MediaSessionImplBase;

    invoke-virtual {p5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 170
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionUri:Landroid/net/Uri;

    .line 171
    new-instance p3, Landroidx/media2/session/SessionToken;

    new-instance p5, Landroidx/media2/session/SessionTokenImplBase;

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    const/4 v3, 0x0

    .line 172
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    move-object v1, p5

    move-object v6, p8

    invoke-direct/range {v1 .. v6}, Landroidx/media2/session/SessionTokenImplBase;-><init>(IILjava/lang/String;Landroidx/media2/session/IMediaSession;Landroid/os/Bundle;)V

    invoke-direct {p3, p5}, Landroidx/media2/session/SessionToken;-><init>(Landroidx/media2/session/SessionToken$SessionTokenImpl;)V

    iput-object p3, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionToken:Landroidx/media2/session/SessionToken;

    .line 175
    sget-object p3, Landroidx/media2/session/MediaSessionImplBase;->STATIC_LOCK:Ljava/lang/Object;

    monitor-enter p3

    .line 176
    :try_start_0
    sget-boolean p5, Landroidx/media2/session/MediaSessionImplBase;->sComponentNamesInitialized:Z

    if-nez p5, :cond_1

    .line 177
    const-string p5, "androidx.media2.session.MediaLibraryService"

    invoke-direct {p0, p5}, Landroidx/media2/session/MediaSessionImplBase;->getServiceComponentByAction(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p5

    sput-object p5, Landroidx/media2/session/MediaSessionImplBase;->sServiceComponentName:Landroid/content/ComponentName;

    if-nez p5, :cond_0

    .line 180
    const-string p5, "androidx.media2.session.MediaSessionService"

    invoke-direct {p0, p5}, Landroidx/media2/session/MediaSessionImplBase;->getServiceComponentByAction(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p5

    sput-object p5, Landroidx/media2/session/MediaSessionImplBase;->sServiceComponentName:Landroid/content/ComponentName;

    :cond_0
    const/4 p5, 0x1

    .line 183
    sput-boolean p5, Landroidx/media2/session/MediaSessionImplBase;->sComponentNamesInitialized:Z

    .line 185
    :cond_1
    sget-object p5, Landroidx/media2/session/MediaSessionImplBase;->sServiceComponentName:Landroid/content/ComponentName;

    .line 186
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p6, 0x1f

    const/4 p7, 0x0

    if-lt p3, p6, :cond_2

    const/high16 p3, 0x2000000

    goto :goto_0

    :cond_2
    move p3, p7

    :goto_0
    if-nez p5, :cond_3

    .line 191
    new-instance p5, Landroid/content/Intent;

    const-string p6, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p5, p6, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 192
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 193
    invoke-static {p2, p7, p5, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p3

    iput-object p3, p0, Landroidx/media2/session/MediaSessionImplBase;->mMediaButtonIntent:Landroid/app/PendingIntent;

    .line 198
    new-instance p5, Landroid/content/ComponentName;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-direct {p5, p2, p3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 203
    new-instance p3, Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;

    invoke-direct {p3, p0}, Landroidx/media2/session/MediaSessionImplBase$MediaButtonReceiver;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    iput-object p3, p0, Landroidx/media2/session/MediaSessionImplBase;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 204
    new-instance p6, Landroid/content/IntentFilter;

    const-string p7, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p6, p7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 205
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p6, p1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 206
    invoke-virtual {p2, p3, p6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_2

    .line 209
    :cond_3
    new-instance p6, Landroid/content/Intent;

    const-string p8, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p6, p8, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 210
    invoke-virtual {p6, p5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 211
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p8, 0x1a

    if-lt p1, p8, :cond_4

    .line 213
    invoke-static {p2, p7, p6, p3}, Landroidx/media2/common/ClassVerificationHelper$PendingIntent$Api26;->getForegroundService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mMediaButtonIntent:Landroid/app/PendingIntent;

    goto :goto_1

    .line 216
    :cond_4
    invoke-static {p2, p7, p6, p3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mMediaButtonIntent:Landroid/app/PendingIntent;

    :goto_1
    const/4 p1, 0x0

    .line 219
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 222
    :goto_2
    new-instance p1, Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionImplBase;->mMediaButtonIntent:Landroid/app/PendingIntent;

    invoke-direct {p1, p0, p5, p2, v0}, Landroidx/media2/session/MediaSessionLegacyStub;-><init>(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Handler;)V

    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    .line 225
    invoke-virtual {p0, p4}, Landroidx/media2/session/MediaSessionImplBase;->updatePlayer(Landroidx/media2/common/SessionPlayer;)V

    .line 229
    invoke-virtual {p1}, Landroidx/media2/session/MediaSessionLegacyStub;->start()V

    return-void

    :catchall_0
    move-exception p1

    .line 186
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSessionImplBase$PlayerTask<",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;>;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 1013
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v0

    .line 1014
    new-instance v1, Landroidx/media2/common/SessionPlayer$PlayerResult;

    const/4 v2, -0x2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroidx/media2/common/SessionPlayer$PlayerResult;-><init>(ILandroidx/media2/common/MediaItem;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    .line 1015
    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/common/util/concurrent/ListenableFuture;

    return-object p1
.end method

.method private dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/media2/session/MediaSessionImplBase$PlayerTask<",
            "TT;>;TT;)TT;"
        }
    .end annotation

    .line 1020
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1021
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayer:Landroidx/media2/common/SessionPlayer;

    .line 1022
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1024
    :try_start_1
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1025
    invoke-interface {p1, v1}, Landroidx/media2/session/MediaSessionImplBase$PlayerTask;->run(Landroidx/media2/common/SessionPlayer;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    .line 1029
    :cond_0
    sget-boolean p1, Landroidx/media2/session/MediaSessionImplBase;->DEBUG:Z

    if-eqz p1, :cond_1

    .line 1030
    const-string p1, "MSImplBase"

    const-string v0, "API calls after the close()"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    return-object p2

    :catchall_0
    move-exception p1

    .line 1022
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private dispatchRemoteControllerTask(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            "Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/16 v0, -0x64

    .line 1112
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    .line 1113
    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v1

    .line 1114
    invoke-virtual {v1, p1}, Landroidx/media2/session/ConnectedControllersManager;->getSequencedFutureManager(Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SequencedFutureManager;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1116
    sget-object v2, Landroidx/media2/session/MediaSessionImplBase;->RESULT_WHEN_CLOSED:Landroidx/media2/session/SessionResult;

    invoke-virtual {v1, v2}, Landroidx/media2/session/SequencedFutureManager;->createSequencedFuture(Ljava/lang/Object;)Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    move-result-object v1

    .line 1117
    move-object v2, v1

    check-cast v2, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;

    invoke-virtual {v1}, Landroidx/media2/session/SequencedFutureManager$SequencedFuture;->getSequenceNumber()I

    move-result v2

    goto :goto_0

    .line 1119
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1120
    invoke-static {v0}, Landroidx/media2/session/SessionResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v2, 0x0

    .line 1125
    invoke-static {v2}, Landroidx/media2/session/SessionResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    .line 1127
    :goto_0
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v3

    invoke-interface {p2, v3, v2}, Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;->run(Landroidx/media2/session/MediaSession$ControllerCb;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p2

    .line 1138
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MSImplBase"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, -0x1

    .line 1140
    invoke-static {p1}, Landroidx/media2/session/SessionResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p2

    .line 1130
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase;->onDeadObjectException(Landroidx/media2/session/MediaSession$ControllerInfo;Landroid/os/DeadObjectException;)V

    .line 1131
    invoke-static {v0}, Landroidx/media2/session/SessionResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private getServiceComponentByAction(Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 2

    .line 1157
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1158
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1159
    iget-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x0

    .line 1160
    invoke-virtual {v0, v1, p1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1161
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1164
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 1165
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private notifyPlayerUpdatedNotLocked(Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 7

    .line 1042
    new-instance v6, Landroidx/media2/session/MediaSessionImplBase$43;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroidx/media2/session/MediaSessionImplBase$43;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V

    invoke-virtual {p0, v6}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    return-void
.end method

.method private onDeadObjectException(Landroidx/media2/session/MediaSession$ControllerInfo;Landroid/os/DeadObjectException;)V
    .locals 2

    .line 1147
    sget-boolean v0, Landroidx/media2/session/MediaSessionImplBase;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 1148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is gone"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MSImplBase"

    invoke-static {v1, v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1152
    :cond_0
    iget-object p2, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    invoke-virtual {p2}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/media2/session/ConnectedControllersManager;->removeController(Landroidx/media2/session/MediaSession$ControllerInfo;)V

    return-void
.end method


# virtual methods
.method public addPlaylistItem(ILandroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media2/common/MediaItem;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    .line 662
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$24;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$24;-><init>(Landroidx/media2/session/MediaSessionImplBase;ILandroidx/media2/common/MediaItem;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 660
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "item shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 657
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "index shouldn\'t be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public broadcastCustomCommand(Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V
    .locals 1

    .line 404
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$4;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$4;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    return-void
.end method

.method public close()V
    .locals 4

    const-string v0, "Closing session, id="

    .line 291
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 292
    :try_start_0
    iget-boolean v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mClosed:Z

    if-eqz v2, :cond_0

    .line 293
    monitor-exit v1

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 295
    iput-boolean v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mClosed:Z

    .line 296
    sget-boolean v2, Landroidx/media2/session/MediaSessionImplBase;->DEBUG:Z

    if-eqz v2, :cond_1

    .line 297
    const-string v2, "MSImplBase"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", token="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getToken()Landroidx/media2/session/SessionToken;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 297
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    :cond_1
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayer:Landroidx/media2/common/SessionPlayer;

    .line 302
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayerCallback:Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

    invoke-virtual {v0, v1}, Landroidx/media2/common/SessionPlayer;->unregisterPlayerCallback(Landroidx/media2/common/SessionPlayer$PlayerCallback;)V

    .line 304
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mMediaButtonIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0}, Landroid/app/PendingIntent;->cancel()V

    .line 305
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionLegacyStub;->close()V

    .line 306
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 307
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 309
    :cond_2
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mInstance:Landroidx/media2/session/MediaSession;

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaSession$SessionCallback;->onSessionClosed(Landroidx/media2/session/MediaSession;)V

    .line 310
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$1;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$1;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    .line 316
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 319
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-static {v0}, Landroidx/media2/common/ClassVerificationHelper$HandlerThread$Api18;->quitSafely(Landroid/os/HandlerThread;)Z

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    .line 302
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public connectFromService(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V
    .locals 7

    .line 975
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Landroidx/media2/session/MediaSessionStub;->connect(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroid/os/Bundle;)V

    return-void
.end method

.method createLegacyBrowserServiceLocked(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media/MediaBrowserServiceCompat;
    .locals 0

    .line 969
    new-instance p2, Landroidx/media2/session/MediaSessionServiceLegacyStub;

    invoke-direct {p2, p1, p0, p3}, Landroidx/media2/session/MediaSessionServiceLegacyStub;-><init>(Landroid/content/Context;Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-object p2
.end method

.method createPlaybackInfo(Landroidx/media2/common/SessionPlayer;Landroidx/media/AudioAttributesCompat;)Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 3

    if-eqz p2, :cond_0

    goto :goto_0

    .line 262
    :cond_0
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getAudioAttributes()Landroidx/media/AudioAttributesCompat;

    move-result-object p2

    .line 264
    :goto_0
    instance-of v0, p1, Landroidx/media2/session/RemoteSessionPlayer;

    const/4 v1, 0x2

    if-nez v0, :cond_2

    .line 265
    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->getLegacyStreamType(Landroidx/media/AudioAttributesCompat;)I

    move-result p1

    .line 267
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mAudioManager:Landroid/media/AudioManager;

    .line 268
    invoke-static {v0}, Landroidx/media2/common/ClassVerificationHelper$AudioManager$Api21;->isVolumeFixed(Landroid/media/AudioManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 271
    :cond_1
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mAudioManager:Landroid/media/AudioManager;

    .line 275
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mAudioManager:Landroid/media/AudioManager;

    .line 276
    invoke-virtual {v2, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p1

    const/4 v2, 0x1

    .line 271
    invoke-static {v2, p2, v1, v0, p1}, Landroidx/media2/session/MediaController$PlaybackInfo;->createPlaybackInfo(ILandroidx/media/AudioAttributesCompat;III)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object p1

    return-object p1

    .line 278
    :cond_2
    check-cast p1, Landroidx/media2/session/RemoteSessionPlayer;

    .line 282
    invoke-virtual {p1}, Landroidx/media2/session/RemoteSessionPlayer;->getVolumeControlType()I

    move-result v0

    .line 283
    invoke-virtual {p1}, Landroidx/media2/session/RemoteSessionPlayer;->getMaxVolume()I

    move-result v2

    .line 284
    invoke-virtual {p1}, Landroidx/media2/session/RemoteSessionPlayer;->getVolume()I

    move-result p1

    .line 279
    invoke-static {v1, p2, v0, v2, p1}, Landroidx/media2/session/MediaController$PlaybackInfo;->createPlaybackInfo(ILandroidx/media/AudioAttributesCompat;III)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object p1

    return-object p1
.end method

.method public createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;
    .locals 9

    .line 926
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getPlayerState()I

    move-result v0

    .line 927
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getBufferingState()I

    move-result v1

    .line 926
    invoke-static {v0, v1}, Landroidx/media2/session/MediaUtils;->convertToPlaybackStateCompatState(II)I

    move-result v3

    .line 945
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getCurrentMediaItemIndex()I

    move-result v0

    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->convertToQueueItemId(I)J

    move-result-wide v0

    .line 946
    new-instance v2, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    invoke-direct {v2}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;-><init>()V

    .line 947
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getCurrentPosition()J

    move-result-wide v4

    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getPlaybackSpeed()F

    move-result v6

    .line 948
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 947
    invoke-virtual/range {v2 .. v8}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setState(IJFJ)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v2

    const-wide/32 v3, 0x37ffff

    .line 949
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setActions(J)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v2

    .line 950
    invoke-virtual {v2, v0, v1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setActiveQueueItemId(J)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v0

    .line 951
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->getBufferedPosition()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setBufferedPosition(J)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v0

    .line 952
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->build()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    return-object v0
.end method

.method public deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 863
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$41;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$41;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/SessionPlayer$TrackInfo;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V
    .locals 3

    .line 1078
    const-string v0, "MSImplBase"

    .line 0
    const-string v1, "Skipping dispatching task to disconnected controller, controller="

    .line 1078
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    .line 1079
    invoke-virtual {v2}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v2

    .line 1080
    invoke-virtual {v2, p1}, Landroidx/media2/session/ConnectedControllersManager;->getSequencedFutureManager(Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SequencedFutureManager;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1082
    invoke-virtual {v2}, Landroidx/media2/session/SequencedFutureManager;->obtainNextSequenceNumber()I

    move-result v1

    goto :goto_0

    .line 1084
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1085
    sget-boolean p2, Landroidx/media2/session/MediaSessionImplBase;->DEBUG:Z

    if-eqz p2, :cond_1

    .line 1086
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void

    :cond_2
    const/4 v1, 0x0

    .line 1094
    :goto_0
    invoke-virtual {p1}, Landroidx/media2/session/MediaSession$ControllerInfo;->getControllerCb()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v2

    invoke-interface {p2, v2, v1}, Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;->run(Landroidx/media2/session/MediaSession$ControllerCb;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    .line 1103
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/media2/session/MediaSession$ControllerInfo;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_1
    move-exception p2

    .line 1096
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase;->onDeadObjectException(Landroidx/media2/session/MediaSession$ControllerInfo;Landroid/os/DeadObjectException;)V

    :goto_1
    return-void
.end method

.method dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V
    .locals 4

    .line 1061
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    .line 1062
    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media2/session/ConnectedControllersManager;->getConnectedControllers()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    .line 1063
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 1064
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/media2/session/MediaSession$ControllerInfo;

    .line 1065
    invoke-virtual {p0, v3, p1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1068
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionLegacyStub;->getControllerLegacyCbForBroadcast()Landroidx/media2/session/MediaSession$ControllerCb;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;->run(Landroidx/media2/session/MediaSession$ControllerCb;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1070
    const-string v0, "MSImplBase"

    const-string v1, "Exception in using media1 API"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public getBufferedPosition()J
    .locals 3

    .line 518
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$13;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$13;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const-wide/high16 v1, -0x8000000000000000L

    .line 526
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 518
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getBufferingState()I
    .locals 2

    .line 532
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$14;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$14;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    .line 537
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 532
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCallback()Landroidx/media2/session/MediaSession$SessionCallback;
    .locals 1

    .line 903
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    return-object v0
.end method

.method public getCallbackExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 898
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public getConnectedControllers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            ">;"
        }
    .end annotation

    .line 355
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 356
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v1

    .line 357
    invoke-virtual {v1}, Landroidx/media2/session/ConnectedControllersManager;->getConnectedControllers()Ljava/util/List;

    move-result-object v1

    .line 356
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 358
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionLegacyStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v1

    .line 359
    invoke-virtual {v1}, Landroidx/media2/session/ConnectedControllersManager;->getConnectedControllers()Ljava/util/List;

    move-result-object v1

    .line 358
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 893
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getCurrentMediaItem()Landroidx/media2/common/MediaItem;
    .locals 2

    .line 724
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$28;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$28;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/common/MediaItem;

    return-object v0
.end method

.method public getCurrentMediaItemIndex()I
    .locals 2

    .line 734
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$29;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$29;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, -0x1

    .line 739
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 734
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCurrentPosition()J
    .locals 3

    .line 492
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$11;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$11;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const-wide/high16 v1, -0x8000000000000000L

    .line 500
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 492
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDuration()J
    .locals 3

    .line 505
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$12;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$12;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const-wide/high16 v1, -0x8000000000000000L

    .line 513
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 505
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getInstance()Landroidx/media2/session/MediaSession;
    .locals 1

    .line 888
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mInstance:Landroidx/media2/session/MediaSession;

    return-object v0
.end method

.method getLegacyBrowserService()Landroidx/media/MediaBrowserServiceCompat;
    .locals 2

    .line 999
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1000
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mBrowserServiceLegacyStub:Landroidx/media/MediaBrowserServiceCompat;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 1001
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getLegacyBrowserServiceBinder()Landroid/os/IBinder;
    .locals 4

    .line 987
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 988
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mBrowserServiceLegacyStub:Landroidx/media/MediaBrowserServiceCompat;

    if-nez v1, :cond_0

    .line 989
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionToken:Landroidx/media2/session/SessionToken;

    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    .line 990
    invoke-virtual {v3}, Landroidx/media2/session/MediaSessionLegacyStub;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v3

    .line 989
    invoke-virtual {p0, v1, v2, v3}, Landroidx/media2/session/MediaSessionImplBase;->createLegacyBrowserServiceLocked(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media/MediaBrowserServiceCompat;

    move-result-object v1

    iput-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mBrowserServiceLegacyStub:Landroidx/media/MediaBrowserServiceCompat;

    .line 992
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mBrowserServiceLegacyStub:Landroidx/media/MediaBrowserServiceCompat;

    .line 993
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 994
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.media.browse.MediaBrowserService"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 995
    invoke-virtual {v1, v0}, Landroidx/media/MediaBrowserServiceCompat;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 993
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getNextMediaItemIndex()I
    .locals 2

    .line 754
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$31;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$31;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, -0x1

    .line 759
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 754
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPlaybackInfo()Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 2

    .line 957
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 958
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 959
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlaybackSpeed()F
    .locals 2

    .line 542
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$15;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$15;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 550
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 542
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getPlayer()Landroidx/media2/common/SessionPlayer;
    .locals 2

    .line 329
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 330
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayer:Landroidx/media2/common/SessionPlayer;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 331
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlayerState()I
    .locals 2

    .line 482
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$10;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$10;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x3

    .line 487
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 482
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPlaylist()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    .line 566
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$17;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$17;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;
    .locals 2

    .line 645
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$23;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$23;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/common/MediaMetadata;

    return-object v0
.end method

.method public getPreviousMediaItemIndex()I
    .locals 2

    .line 744
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$30;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$30;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, -0x1

    .line 749
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 744
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRepeatMode()I
    .locals 2

    .line 777
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$33;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$33;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    .line 782
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 777
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSelectedTrack(I)Landroidx/media2/common/SessionPlayer$TrackInfo;
    .locals 1

    .line 874
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$42;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$42;-><init>(Landroidx/media2/session/MediaSessionImplBase;I)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media2/common/SessionPlayer$TrackInfo;

    return-object p1
.end method

.method public getSessionActivity()Landroid/app/PendingIntent;
    .locals 1

    .line 964
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionActivity:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 1

    .line 909
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionLegacyStub;->getSessionCompat()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    return-object v0
.end method

.method public getShuffleMode()I
    .locals 2

    .line 800
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$35;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$35;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    .line 805
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 800
    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getToken()Landroidx/media2/session/SessionToken;
    .locals 1

    .line 349
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionToken:Landroidx/media2/session/SessionToken;

    return-object v0
.end method

.method public getTracks()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;"
        }
    .end annotation

    .line 842
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$39;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$39;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    .line 343
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getVideoSize()Landroidx/media2/common/VideoSize;
    .locals 3

    .line 822
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$37;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$37;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    new-instance v1, Landroidx/media2/common/VideoSize;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Landroidx/media2/common/VideoSize;-><init>(II)V

    invoke-direct {p0, v0, v1}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/common/VideoSize;

    return-object v0
.end method

.method public isClosed()Z
    .locals 2

    .line 919
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 920
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mClosed:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 921
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 368
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/media2/session/ConnectedControllersManager;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    .line 369
    invoke-virtual {v1}, Landroidx/media2/session/MediaSessionLegacyStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/media2/session/ConnectedControllersManager;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method isInPlaybackState(Landroidx/media2/common/SessionPlayer;)Z
    .locals 1

    .line 1006
    invoke-virtual {p0}, Landroidx/media2/session/MediaSessionImplBase;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1007
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1008
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public movePlaylistItem(II)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 713
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$27;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$27;-><init>(Landroidx/media2/session/MediaSessionImplBase;II)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 711
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "indices shouldn\'t be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method notifyPlaybackInfoChangedNotLocked(Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 1

    .line 1052
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$44;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$44;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/session/MediaController$PlaybackInfo;)V

    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    return-void
.end method

.method public pause()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 448
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$7;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$7;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public play()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 427
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$6;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$6;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public prepare()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 459
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$8;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$8;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public removePlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 676
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$25;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$25;-><init>(Landroidx/media2/session/MediaSessionImplBase;I)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 674
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index shouldn\'t be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public replacePlaylistItem(ILandroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media2/common/MediaItem;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    .line 698
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$26;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$26;-><init>(Landroidx/media2/session/MediaSessionImplBase;ILandroidx/media2/common/MediaItem;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 696
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "item shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 693
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "index shouldn\'t be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public seekTo(J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 470
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$9;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$9;-><init>(Landroidx/media2/session/MediaSessionImplBase;J)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 852
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$40;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$40;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/SessionPlayer$TrackInfo;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
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

    .line 416
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$5;

    invoke-direct {v0, p0, p2, p3}, Landroidx/media2/session/MediaSessionImplBase$5;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTask(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setAllowedCommands(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V
    .locals 1

    .line 386
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/media2/session/ConnectedControllersManager;->isConnected(Landroidx/media2/session/MediaSession$ControllerInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionStub:Landroidx/media2/session/MediaSessionStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v0

    .line 388
    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/ConnectedControllersManager;->updateAllowedCommands(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V

    .line 389
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$3;

    invoke-direct {v0, p0, p2}, Landroidx/media2/session/MediaSessionImplBase$3;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/session/SessionCommandGroup;)V

    invoke-virtual {p0, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTaskWithoutReturn(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)V

    goto :goto_0

    .line 396
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v0}, Landroidx/media2/session/MediaSessionLegacyStub;->getConnectedControllersManager()Landroidx/media2/session/ConnectedControllersManager;

    move-result-object v0

    .line 397
    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/ConnectedControllersManager;->updateAllowedCommands(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommandGroup;)V

    :goto_0
    return-void
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

    .line 375
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$2;

    invoke-direct {v0, p0, p2}, Landroidx/media2/session/MediaSessionImplBase$2;-><init>(Landroidx/media2/session/MediaSessionImplBase;Ljava/util/List;)V

    invoke-direct {p0, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchRemoteControllerTask(Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/MediaSessionImplBase$RemoteControllerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setLegacyControllerConnectionTimeoutMs(J)V
    .locals 1

    .line 914
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mSessionLegacyStub:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaSessionLegacyStub;->setLegacyControllerDisconnectTimeoutMs(J)V

    return-void
.end method

.method public setMediaItem(Landroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/MediaItem;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 594
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$19;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$19;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/MediaItem;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 592
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "item shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPlaybackSpeed(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 555
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$16;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$16;-><init>(Landroidx/media2/session/MediaSessionImplBase;F)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setPlaylist(Ljava/util/List;Landroidx/media2/common/MediaMetadata;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;",
            "Landroidx/media2/common/MediaMetadata;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 580
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$18;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media2/session/MediaSessionImplBase$18;-><init>(Landroidx/media2/session/MediaSessionImplBase;Ljava/util/List;Landroidx/media2/common/MediaMetadata;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 578
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "list shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRepeatMode(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 788
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$34;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$34;-><init>(Landroidx/media2/session/MediaSessionImplBase;I)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setShuffleMode(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 811
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$36;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$36;-><init>(Landroidx/media2/session/MediaSessionImplBase;I)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 832
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$38;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$38;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroid/view/Surface;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public skipToNextItem()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 634
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$22;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$22;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public skipToPlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 608
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$20;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$20;-><init>(Landroidx/media2/session/MediaSessionImplBase;I)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 606
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index shouldn\'t be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public skipToPreviousItem()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 623
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$21;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSessionImplBase$21;-><init>(Landroidx/media2/session/MediaSessionImplBase;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public updatePlayer(Landroidx/media2/common/SessionPlayer;)V
    .locals 5

    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->createPlaybackInfo(Landroidx/media2/common/SessionPlayer;Landroidx/media/AudioAttributesCompat;)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object v0

    .line 240
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 241
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-ne v2, p1, :cond_0

    .line 242
    monitor-exit v1

    return-void

    .line 245
    :cond_0
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayer:Landroidx/media2/common/SessionPlayer;

    .line 246
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 247
    iput-object v0, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 248
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 251
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayerCallback:Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

    invoke-virtual {v2, v1}, Landroidx/media2/common/SessionPlayer;->unregisterPlayerCallback(Landroidx/media2/common/SessionPlayer$PlayerCallback;)V

    .line 253
    :cond_1
    iget-object v1, p0, Landroidx/media2/session/MediaSessionImplBase;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase;->mPlayerCallback:Landroidx/media2/session/MediaSessionImplBase$SessionPlayerCallback;

    invoke-virtual {p1, v1, v4}, Landroidx/media2/common/SessionPlayer;->registerPlayerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/common/SessionPlayer$PlayerCallback;)V

    .line 255
    invoke-direct {p0, v2, v3, p1, v0}, Landroidx/media2/session/MediaSessionImplBase;->notifyPlayerUpdatedNotLocked(Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V

    return-void

    :catchall_0
    move-exception p1

    .line 248
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public updatePlaylistMetadata(Landroidx/media2/common/MediaMetadata;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/MediaMetadata;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 765
    new-instance v0, Landroidx/media2/session/MediaSessionImplBase$32;

    invoke-direct {v0, p0, p1}, Landroidx/media2/session/MediaSessionImplBase$32;-><init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/MediaMetadata;)V

    invoke-direct {p0, v0}, Landroidx/media2/session/MediaSessionImplBase;->dispatchPlayerTask(Landroidx/media2/session/MediaSessionImplBase$PlayerTask;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
