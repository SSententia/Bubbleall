.class Landroidx/media2/session/MediaControllerImplLegacy;
.super Ljava/lang/Object;
.source "MediaControllerImplLegacy.java"

# interfaces
.implements Landroidx/media2/session/MediaController$MediaControllerImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;,
        Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;,
        Landroidx/media2/session/MediaControllerImplLegacy$ConnectionCallback;
    }
.end annotation


# static fields
.field static final DEBUG:Z

.field private static final ITEM_NONE:I = -0x1

.field private static final POSITION_DIFF_TOLERANCE:J = 0x64L

.field static final SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED:Ljava/lang/String; = "android.media.session.command.ON_CAPTIONING_ENALBED_CHANGED"

.field static final SESSION_COMMAND_ON_EXTRAS_CHANGED:Ljava/lang/String; = "android.media.session.command.ON_EXTRAS_CHANGED"

.field private static final TAG:Ljava/lang/String; = "MC2ImplLegacy"


# instance fields
.field mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

.field mBrowserCompat:Landroid/support/v4/media/MediaBrowserCompat;

.field mBufferedPosition:J

.field mBufferingState:I

.field mClosed:Z

.field mConnected:Z

.field final mContext:Landroid/content/Context;

.field mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

.field mControllerCompatCallback:Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;

.field mCurrentMediaItem:Landroidx/media2/common/MediaItem;

.field mCurrentMediaItemIndex:I

.field mCustomLayout:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;"
        }
    .end annotation
.end field

.field final mHandler:Landroid/os/Handler;

.field final mHandlerThread:Landroid/os/HandlerThread;

.field mInstance:Landroidx/media2/session/MediaController;

.field final mLock:Ljava/lang/Object;

.field mMediaMetadataCompat:Landroid/support/v4/media/MediaMetadataCompat;

.field private mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

.field mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

.field mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

.field mPlayerState:I

.field mPlaylist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation
.end field

.field mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

.field mQueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end field

.field mRepeatMode:I

.field mShuffleMode:I

.field mSkipToPlaylistIndex:I

.field final mToken:Landroidx/media2/session/SessionToken;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 86
    const-string v0, "MC2ImplLegacy"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media2/session/MediaControllerImplLegacy;->DEBUG:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionToken;)V
    .locals 2

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 140
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    .line 179
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mContext:Landroid/content/Context;

    .line 180
    iput-object p2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    .line 181
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "MediaController_Thread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandlerThread:Landroid/os/HandlerThread;

    .line 182
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 183
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandler:Landroid/os/Handler;

    .line 184
    iput-object p3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mToken:Landroidx/media2/session/SessionToken;

    .line 186
    invoke-virtual {p3}, Landroidx/media2/session/SessionToken;->getType()I

    move-result p1

    if-nez p1, :cond_0

    .line 187
    monitor-enter v0

    const/4 p1, 0x0

    .line 188
    :try_start_0
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mBrowserCompat:Landroid/support/v4/media/MediaBrowserCompat;

    .line 189
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    invoke-virtual {p3}, Landroidx/media2/session/SessionToken;->getBinder()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->connectToSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 189
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 192
    :cond_0
    invoke-direct {p0}, Landroidx/media2/session/MediaControllerImplLegacy;->connectToService()V

    :goto_0
    return-void
.end method

.method private connectToService()V
    .locals 2

    .line 975
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandler:Landroid/os/Handler;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$5;

    invoke-direct {v1, p0}, Landroidx/media2/session/MediaControllerImplLegacy$5;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 243
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v0

    .line 244
    invoke-direct {p0, v0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->setFutureResult(Landroidx/concurrent/futures/ResolvableFuture;I)V

    return-object v0
.end method

.method private setFutureResult(Landroidx/concurrent/futures/ResolvableFuture;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;I)V"
        }
    .end annotation

    .line 250
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 251
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 252
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    new-instance v0, Landroidx/media2/session/SessionResult;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2, v1}, Landroidx/media2/session/SessionResult;-><init>(ILandroid/os/Bundle;Landroidx/media2/common/MediaItem;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 252
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public addPlaylistItem(ILjava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 664
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 665
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 666
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 667
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 669
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 670
    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->createMediaDescriptionCompat(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p2

    .line 669
    invoke-virtual {v1, p2, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->addQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 671
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 672
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 671
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public adjustVolume(II)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 420
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 421
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 422
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 423
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 425
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat;->adjustVolume(II)V

    .line 426
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 427
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 426
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public close()V
    .locals 4

    .line 198
    sget-boolean v0, Landroidx/media2/session/MediaControllerImplLegacy;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 199
    const-string v0, "MC2ImplLegacy"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "close from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mToken:Landroidx/media2/session/SessionToken;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 202
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-eqz v1, :cond_1

    .line 204
    monitor-exit v0

    return-void

    .line 206
    :cond_1
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 209
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-static {v1}, Landroidx/media2/common/ClassVerificationHelper$HandlerThread$Api18;->quitSafely(Landroid/os/HandlerThread;)Z

    const/4 v1, 0x1

    .line 214
    iput-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    .line 216
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mBrowserCompat:Landroid/support/v4/media/MediaBrowserCompat;

    if-eqz v1, :cond_2

    .line 217
    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat;->disconnect()V

    .line 218
    iput-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mBrowserCompat:Landroid/support/v4/media/MediaBrowserCompat;

    .line 220
    :cond_2
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v1, :cond_3

    .line 221
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompatCallback:Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;

    invoke-virtual {v1, v3}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 222
    iput-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_3
    const/4 v1, 0x0

    .line 224
    iput-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    .line 225
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$1;

    invoke-direct {v1, p0}, Landroidx/media2/session/MediaControllerImplLegacy$1;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 225
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method connectToSession(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 4

    .line 957
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 959
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter p1

    .line 960
    :try_start_0
    iput-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 961
    new-instance v0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;)V

    iput-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompatCallback:Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;

    .line 962
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->isSessionReady()Z

    move-result v0

    .line 963
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompatCallback:Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;

    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V

    .line 964
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 970
    invoke-virtual {p0}, Landroidx/media2/session/MediaControllerImplLegacy;->onConnectedNotLocked()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 964
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 858
    const-string p1, "MC2ImplLegacy"

    const-string v0, "Session doesn\'t support deselecting track"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x6

    .line 859
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public fastForward()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 359
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 360
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 361
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 362
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 364
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->fastForward()V

    .line 365
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 366
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 365
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getAllowedCommands()Landroidx/media2/session/SessionCommandGroup;
    .locals 4

    .line 871
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 872
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 873
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 874
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 876
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 877
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;
    .locals 2

    .line 889
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 890
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mBrowserCompat:Landroid/support/v4/media/MediaBrowserCompat;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 891
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getBufferedPosition()J
    .locals 6

    .line 508
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 509
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const-wide/high16 v2, -0x8000000000000000L

    if-nez v1, :cond_0

    .line 510
    const-string v1, "MC2ImplLegacy"

    const-string v4, "Session isn\'t active"

    new-instance v5, Ljava/lang/IllegalStateException;

    invoke-direct {v5}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 511
    monitor-exit v0

    return-wide v2

    .line 513
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-nez v1, :cond_1

    goto :goto_0

    .line 514
    :cond_1
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getBufferedPosition()J

    move-result-wide v2

    :goto_0
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    .line 515
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getBufferingState()I
    .locals 5

    .line 496
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 497
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 498
    const-string v1, "MC2ImplLegacy"

    const-string v3, "Session isn\'t active"

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 499
    monitor-exit v0

    return v2

    .line 501
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-nez v1, :cond_1

    goto :goto_0

    .line 502
    :cond_1
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v1

    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->toBufferingState(I)I

    move-result v2

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 503
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getConnectedToken()Landroidx/media2/session/SessionToken;
    .locals 2

    .line 237
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 238
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mToken:Landroidx/media2/session/SessionToken;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 239
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 883
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getCurrentMediaItem()Landroidx/media2/common/MediaItem;
    .locals 4

    .line 713
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 714
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 715
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 716
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 718
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 719
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getCurrentMediaItemIndex()I
    .locals 1

    .line 724
    iget v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    return v0
.end method

.method public getCurrentPosition()J
    .locals 6

    .line 470
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 471
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const-wide/high16 v2, -0x8000000000000000L

    if-nez v1, :cond_0

    .line 472
    const-string v1, "MC2ImplLegacy"

    const-string v4, "Session isn\'t active"

    new-instance v5, Ljava/lang/IllegalStateException;

    invoke-direct {v5}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 473
    monitor-exit v0

    return-wide v2

    .line 475
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-eqz v1, :cond_1

    .line 476
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    iget-object v2, v2, Landroidx/media2/session/MediaController;->mTimeDiff:Ljava/lang/Long;

    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCurrentPosition(Ljava/lang/Long;)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    .line 478
    :cond_1
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    .line 479
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getDuration()J
    .locals 6

    .line 455
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 456
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const-wide/high16 v2, -0x8000000000000000L

    if-nez v1, :cond_0

    .line 457
    const-string v1, "MC2ImplLegacy"

    const-string v4, "Session isn\'t active"

    new-instance v5, Ljava/lang/IllegalStateException;

    invoke-direct {v5}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 458
    monitor-exit v0

    return-wide v2

    .line 460
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mMediaMetadataCompat:Landroid/support/v4/media/MediaMetadataCompat;

    if-eqz v1, :cond_1

    const-string v4, "android.media.metadata.DURATION"

    .line 461
    invoke-virtual {v1, v4}, Landroid/support/v4/media/MediaMetadataCompat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 462
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mMediaMetadataCompat:Landroid/support/v4/media/MediaMetadataCompat;

    const-string v2, "android.media.metadata.DURATION"

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    .line 464
    :cond_1
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getNextMediaItemIndex()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getPlaybackInfo()Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 4

    .line 521
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 522
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 523
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 524
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 526
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 527
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlaybackSpeed()F
    .locals 5

    .line 484
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 485
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 486
    const-string v1, "MC2ImplLegacy"

    const-string v3, "Session isn\'t active"

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 487
    monitor-exit v0

    return v2

    .line 489
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackSpeed()F

    move-result v2

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 490
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlayerState()I
    .locals 4

    .line 444
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 445
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 446
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 447
    monitor-exit v0

    const/4 v0, 0x3

    return v0

    .line 449
    :cond_0
    iget v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlayerState:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 450
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlaylist()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    .line 586
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 587
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 588
    const-string v1, "MC2ImplLegacy"

    const-string v3, "Session isn\'t active"

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 589
    monitor-exit v0

    return-object v2

    .line 591
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_2
    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 592
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;
    .locals 4

    .line 653
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 654
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 655
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 656
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 658
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 659
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPreviousMediaItemIndex()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getRepeatMode()I
    .locals 4

    .line 778
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 779
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 780
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 781
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    .line 783
    :cond_0
    iget v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mRepeatMode:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 784
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getSelectedTrack(I)Landroidx/media2/common/SessionPlayer$TrackInfo;
    .locals 1

    .line 865
    const-string p1, "MC2ImplLegacy"

    const-string v0, "Session doesn\'t support getting selected track"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public getSessionActivity()Landroid/app/PendingIntent;
    .locals 4

    .line 433
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 434
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 435
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 436
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 438
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getSessionActivity()Landroid/app/PendingIntent;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 439
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getShuffleMode()I
    .locals 4

    .line 804
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 805
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 806
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 807
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    .line 809
    :cond_0
    iget v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mShuffleMode:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 810
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
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

    .line 843
    const-string v0, "MC2ImplLegacy"

    const-string v1, "Session doesn\'t support getting TrackInfo"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 844
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVideoSize()Landroidx/media2/common/VideoSize;
    .locals 2

    .line 830
    const-string v0, "MC2ImplLegacy"

    const-string v1, "Session doesn\'t support getting VideoSize"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 831
    new-instance v0, Landroidx/media2/common/VideoSize;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroidx/media2/common/VideoSize;-><init>(II)V

    return-object v0
.end method

.method public isConnected()Z
    .locals 2

    .line 258
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 259
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 260
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public movePlaylistItem(II)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 p1, -0x6

    .line 708
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method onConnectedNotLocked()V
    .locals 4

    .line 896
    sget-boolean v0, Landroidx/media2/session/MediaControllerImplLegacy;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 897
    const-string v0, "MC2ImplLegacy"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onConnectedNotLocked token="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mToken:Landroidx/media2/session/SessionToken;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 902
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 903
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_6

    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-eqz v1, :cond_1

    goto/16 :goto_3

    .line 906
    :cond_1
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    iput-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 907
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 908
    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getFlags()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 907
    invoke-static {v1, v2, v3}, Landroidx/media2/session/MediaUtils;->convertToSessionCommandGroup(JLandroid/support/v4/media/session/PlaybackStateCompat;)Landroidx/media2/session/SessionCommandGroup;

    move-result-object v1

    iput-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    .line 909
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->convertToPlayerState(Landroid/support/v4/media/session/PlaybackStateCompat;)I

    move-result v1

    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlayerState:I

    .line 910
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-nez v1, :cond_2

    const-wide/high16 v1, -0x8000000000000000L

    goto :goto_0

    .line 911
    :cond_2
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getBufferedPosition()J

    move-result-wide v1

    :goto_0
    iput-wide v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mBufferedPosition:J

    .line 912
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->convertToCustomLayout(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCustomLayout:Ljava/util/List;

    .line 914
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    .line 917
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackInfo()Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;

    move-result-object v3

    invoke-static {v3}, Landroidx/media2/session/MediaUtils;->toPlaybackInfo2(Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object v3

    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 919
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getRepeatMode()I

    move-result v3

    iput v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mRepeatMode:I

    .line 920
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getShuffleMode()I

    move-result v3

    iput v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mShuffleMode:I

    .line 922
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getQueue()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Landroidx/media2/session/MediaUtils;->removeNullElements(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    if-eqz v3, :cond_4

    .line 923
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 929
    :cond_3
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-static {v3}, Landroidx/media2/session/MediaUtils;->convertQueueItemListToMediaItemList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v3, 0x0

    .line 926
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    .line 927
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    .line 931
    :goto_2
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 932
    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getQueueTitle()Ljava/lang/CharSequence;

    move-result-object v3

    .line 931
    invoke-static {v3}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadata(Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata;

    move-result-object v3

    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

    .line 935
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/media2/session/MediaControllerImplLegacy;->setCurrentMediaItemLocked(Landroid/support/v4/media/MediaMetadataCompat;)V

    const/4 v3, 0x1

    .line 936
    iput-boolean v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    .line 937
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 938
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v3, Landroidx/media2/session/MediaControllerImplLegacy$3;

    invoke-direct {v3, p0, v2}, Landroidx/media2/session/MediaControllerImplLegacy$3;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;Landroidx/media2/session/SessionCommandGroup;)V

    invoke-virtual {v0, v3}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    .line 944
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 945
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v2, Landroidx/media2/session/MediaControllerImplLegacy$4;

    invoke-direct {v2, p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy$4;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Landroidx/media2/session/MediaController;->notifyPrimaryControllerCallback(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_5
    return-void

    .line 904
    :cond_6
    :goto_3
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 937
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public pause()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 306
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 307
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 308
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 309
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 311
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->pause()V

    .line 312
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 313
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 312
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public play()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 265
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 266
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 267
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 268
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 270
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 271
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->play()V

    goto/16 :goto_3

    .line 273
    :cond_1
    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0xd1b

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    const v4, 0x1c56c

    if-eq v3, v4, :cond_3

    const v4, 0x66f18c8

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "query"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v6

    goto :goto_1

    :cond_3
    const-string v3, "uri"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v5

    goto :goto_1

    :cond_4
    const-string v3, "id"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v1, -0x1

    :goto_1
    const/4 v3, 0x0

    if-eqz v1, :cond_8

    if-eq v1, v6, :cond_7

    if-eq v1, v5, :cond_6

    .line 294
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const/4 v1, -0x2

    .line 295
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 287
    :cond_6
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    .line 289
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 288
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->playFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    goto :goto_2

    .line 281
    :cond_7
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 282
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->playFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    .line 275
    :cond_8
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 276
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->playFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 297
    :goto_2
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->result:Landroidx/concurrent/futures/ResolvableFuture;

    invoke-direct {p0, v1, v2}, Landroidx/media2/session/MediaControllerImplLegacy;->setFutureResult(Landroidx/concurrent/futures/ResolvableFuture;I)V

    .line 298
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 300
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    invoke-direct {p0, v2}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 300
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public prepare()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 318
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 319
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 320
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 321
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 323
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 324
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->prepare()V

    goto/16 :goto_3

    .line 326
    :cond_1
    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0xd1b

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    const v4, 0x1c56c

    if-eq v3, v4, :cond_3

    const v4, 0x66f18c8

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "query"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v6

    goto :goto_1

    :cond_3
    const-string v3, "uri"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v5

    goto :goto_1

    :cond_4
    const-string v3, "id"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v1, -0x1

    :goto_1
    const/4 v3, 0x0

    if-eqz v1, :cond_8

    if-eq v1, v6, :cond_7

    if-eq v1, v5, :cond_6

    .line 347
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const/4 v1, -0x2

    .line 348
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 340
    :cond_6
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    .line 342
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 341
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->prepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V

    goto :goto_2

    .line 334
    :cond_7
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 335
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->prepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    .line 328
    :cond_8
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->value:Ljava/lang/String;

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->extras:Landroid/os/Bundle;

    .line 329
    invoke-virtual {v1, v4, v5}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->prepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 350
    :goto_2
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->result:Landroidx/concurrent/futures/ResolvableFuture;

    invoke-direct {p0, v1, v2}, Landroidx/media2/session/MediaControllerImplLegacy;->setFutureResult(Landroidx/concurrent/futures/ResolvableFuture;I)V

    .line 351
    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 353
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    invoke-direct {p0, v2}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 353
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public removePlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 677
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 678
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 679
    const-string p1, "MC2ImplLegacy"

    const-string v1, "Session isn\'t active"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 680
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 682
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    if-eqz v1, :cond_2

    if-ltz p1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_1

    goto :goto_0

    .line 685
    :cond_1
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->removeQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 686
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 687
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, -0x3

    .line 683
    :try_start_1
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 686
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public replacePlaylistItem(ILjava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 692
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 693
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 694
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 695
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 697
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    if-eqz v1, :cond_2

    if-ltz p1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_1

    goto :goto_0

    .line 700
    :cond_1
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->removeQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 701
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->createMediaDescriptionCompat(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p2

    invoke-virtual {v1, p2, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->addQueueItem(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    .line 702
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 703
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, -0x3

    .line 698
    :try_start_1
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 702
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public rewind()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 371
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 372
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 373
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 374
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 376
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->rewind()V

    .line 377
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 378
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 377
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public seekTo(J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 395
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 396
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 397
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 398
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 400
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->seekTo(J)V

    .line 401
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 402
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 401
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 850
    const-string p1, "MC2ImplLegacy"

    const-string v0, "Session doesn\'t support selecting track"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x6

    .line 851
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public sendCustomCommand(Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/SessionCommand;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 561
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 562
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 563
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 564
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 566
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    invoke-virtual {v1, p1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(Landroidx/media2/session/SessionCommand;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 567
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    .line 568
    invoke-virtual {p1}, Landroidx/media2/session/SessionCommand;->getCustomAction()Ljava/lang/String;

    move-result-object p1

    .line 567
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 569
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 571
    :cond_1
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 572
    new-instance v2, Landroidx/media2/session/MediaControllerImplLegacy$2;

    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mHandler:Landroid/os/Handler;

    invoke-direct {v2, p0, v3, v1}, Landroidx/media2/session/MediaControllerImplLegacy$2;-><init>(Landroidx/media2/session/MediaControllerImplLegacy;Landroid/os/Handler;Landroidx/concurrent/futures/ResolvableFuture;)V

    .line 578
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroidx/media2/session/SessionCommand;->getCustomAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, p2, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 579
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 580
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method setCurrentMediaItemLocked(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 8

    .line 989
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mMediaMetadataCompat:Landroid/support/v4/media/MediaMetadataCompat;

    .line 990
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->getRatingType()I

    move-result v0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    .line 992
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    const/4 p1, 0x0

    .line 993
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    return-void

    .line 997
    :cond_0
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    if-nez v2, :cond_1

    .line 998
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 999
    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    return-void

    .line 1003
    :cond_1
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 1005
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getActiveQueueItemId()J

    move-result-wide v4

    move v2, v3

    .line 1006
    :goto_0
    iget-object v6, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_3

    .line 1007
    iget-object v6, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 1008
    invoke-virtual {v6}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getQueueId()J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-nez v6, :cond_2

    .line 1009
    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1010
    iput v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1016
    :cond_3
    const-string v2, "android.media.metadata.MEDIA_ID"

    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    .line 1018
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 1019
    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    return-void

    .line 1025
    :cond_4
    iget v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    if-ltz v4, :cond_5

    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_5

    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    iget v5, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    .line 1027
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaId()Ljava/lang/String;

    move-result-object v4

    .line 1026
    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1029
    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1030
    iget p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    iput p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 1031
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    return-void

    .line 1036
    :cond_5
    :goto_1
    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 1037
    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 1038
    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 1039
    iput v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 1040
    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    return-void

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1046
    :cond_7
    iput v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 1047
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mMediaMetadataCompat:Landroid/support/v4/media/MediaMetadataCompat;

    invoke-static {p1, v0}, Landroidx/media2/session/MediaUtils;->convertToMediaItem(Landroid/support/v4/media/MediaMetadataCompat;I)Landroidx/media2/common/MediaItem;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    return-void
.end method

.method public setMediaItem(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 p1, -0x6

    .line 603
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setMediaUri(Landroid/net/Uri;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 609
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 610
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 611
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 612
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 615
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 616
    const-string v1, "MC2ImplLegacy"

    const-string v3, "SetMediaUri() is called multiple times without prepare() nor play(). Previous call will be skipped."

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;->result:Landroidx/concurrent/futures/ResolvableFuture;

    invoke-direct {p0, v1, v2}, Landroidx/media2/session/MediaControllerImplLegacy;->setFutureResult(Landroidx/concurrent/futures/ResolvableFuture;I)V

    const/4 v1, 0x0

    .line 619
    iput-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 621
    :cond_1
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 622
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroidx/media2/session/MediaConstants;->MEDIA_URI_SET_MEDIA_URI_PREFIX:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 623
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v3, v2, :cond_3

    .line 624
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 625
    const-string v3, "id"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "query"

    .line 626
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "uri"

    .line 627
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 628
    :cond_2
    new-instance v3, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 631
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4, p2, v1}, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroidx/concurrent/futures/ResolvableFuture;)V

    iput-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 636
    :cond_3
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    if-nez v2, :cond_4

    .line 637
    new-instance v2, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    const-string v3, "uri"

    .line 638
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1, p2, v1}, Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroidx/concurrent/futures/ResolvableFuture;)V

    iput-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mPendingSetMediaUriRequest:Landroidx/media2/session/MediaControllerImplLegacy$SetMediaUriRequest;

    .line 640
    :cond_4
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 641
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setPlaybackSpeed(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 548
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 549
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 550
    const-string p1, "MC2ImplLegacy"

    const-string v1, "Session isn\'t active"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 551
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 553
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->setPlaybackSpeed(F)V

    .line 554
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 555
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 554
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setPlaylist(Ljava/util/List;Landroidx/media2/common/MediaMetadata;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/media2/common/MediaMetadata;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 p1, -0x6

    .line 598
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setRating(Ljava/lang/String;Landroidx/media2/common/Rating;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media2/common/Rating;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 533
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 534
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 535
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 536
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 538
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 539
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    .line 540
    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->convertToRatingCompat(Landroidx/media2/common/Rating;)Landroid/support/v4/media/RatingCompat;

    move-result-object p2

    .line 539
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->setRating(Landroid/support/v4/media/RatingCompat;)V

    .line 542
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 543
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 542
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setRepeatMode(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 789
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 790
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 791
    const-string p1, "MC2ImplLegacy"

    const-string v1, "Session isn\'t active"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 792
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 796
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->setRepeatMode(I)V

    .line 797
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 798
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 797
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setShuffleMode(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 815
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 816
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 817
    const-string p1, "MC2ImplLegacy"

    const-string v1, "Session isn\'t active"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 818
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 822
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->setShuffleMode(I)V

    .line 823
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 824
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 823
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 836
    const-string p1, "MC2ImplLegacy"

    const-string v0, "Session doesn\'t support setting Surface"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x6

    .line 837
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public setVolumeTo(II)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 407
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 408
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 409
    const-string p1, "MC2ImplLegacy"

    const-string p2, "Session isn\'t active"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 410
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 412
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat;->setVolumeTo(II)V

    .line 413
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 414
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 413
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public skipBackward()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x6

    .line 390
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public skipForward()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x6

    .line 384
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public skipToNextItem()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 751
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 752
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 753
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 754
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 756
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->skipToNext()V

    .line 757
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 758
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 757
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public skipToPlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 763
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 764
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 765
    const-string p1, "MC2ImplLegacy"

    const-string v1, "Session isn\'t active"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 p1, -0x64

    .line 766
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 768
    :cond_0
    iput p1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mSkipToPlaylistIndex:I

    .line 769
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    .line 770
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getQueueId()J

    move-result-wide v2

    .line 769
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->skipToQueueItem(J)V

    .line 771
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 772
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 771
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public skipToPreviousItem()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    .line 739
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 740
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    .line 741
    const-string v1, "MC2ImplLegacy"

    const-string v2, "Session isn\'t active"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/16 v1, -0x64

    .line 742
    invoke-direct {p0, v1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 744
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->skipToPrevious()V

    .line 745
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 746
    invoke-direct {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 745
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public updatePlaylistMetadata(Landroidx/media2/common/MediaMetadata;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/MediaMetadata;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/SessionResult;",
            ">;"
        }
    .end annotation

    const/4 p1, -0x6

    .line 647
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
