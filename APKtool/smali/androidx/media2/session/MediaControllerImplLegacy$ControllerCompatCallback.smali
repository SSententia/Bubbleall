.class final Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;
.super Landroid/support/v4/media/session/MediaControllerCompat$Callback;
.source "MediaControllerImplLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaControllerImplLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ControllerCompatCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaControllerImplLegacy;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaControllerImplLegacy;)V
    .locals 0

    .line 1076
    iput-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioInfoChanged(Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;)V
    .locals 2

    .line 1355
    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->toPlaybackInfo2(Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;)Landroidx/media2/session/MediaController$PlaybackInfo;

    move-result-object p1

    .line 1356
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1357
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1360
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput-object p1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackInfo:Landroidx/media2/session/MediaController$PlaybackInfo;

    .line 1361
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1362
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$14;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$14;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/session/MediaController$PlaybackInfo;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1358
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1361
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onCaptioningEnabledChanged(Z)V
    .locals 2

    .line 1372
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1373
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1376
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1377
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$15;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$15;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Z)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyPrimaryControllerCallback(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1374
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1376
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onExtrasChanged(Landroid/os/Bundle;)V
    .locals 2

    .line 1339
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1340
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1343
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1344
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$13;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$13;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyPrimaryControllerCallback(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1341
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1343
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 3

    .line 1272
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1273
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1276
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1277
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v2, p1}, Landroidx/media2/session/MediaControllerImplLegacy;->setCurrentMediaItemLocked(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 1278
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1279
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, p1, :cond_1

    .line 1281
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$10;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$10;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/common/MediaItem;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_1
    return-void

    .line 1274
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1279
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 13

    .line 1137
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1138
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_13

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 1141
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1142
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v2, v2, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 1143
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput-object p1, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 1144
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->convertToPlayerState(Landroid/support/v4/media/session/PlaybackStateCompat;)I

    move-result v4

    iput v4, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mPlayerState:I

    .line 1145
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    if-nez p1, :cond_1

    const-wide/high16 v4, -0x8000000000000000L

    goto :goto_0

    .line 1146
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getBufferedPosition()J

    move-result-wide v4

    :goto_0
    iput-wide v4, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mBufferedPosition:J

    .line 1148
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v3, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    if-eqz p1, :cond_3

    move v3, v4

    .line 1149
    :goto_1
    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    .line 1150
    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-virtual {v5}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->getQueueId()J

    move-result-wide v5

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getActiveQueueItemId()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-nez v5, :cond_2

    .line 1151
    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput v3, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItemIndex:I

    .line 1152
    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v6, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/media2/common/MediaItem;

    iput-object v6, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1156
    :cond_3
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v3, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mCurrentMediaItem:Landroidx/media2/common/MediaItem;

    .line 1158
    iget-object v5, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v5, v5, Landroidx/media2/session/MediaControllerImplLegacy;->mCustomLayout:Ljava/util/List;

    .line 1159
    iget-object v6, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->convertToCustomLayout(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/util/List;

    move-result-object v7

    iput-object v7, v6, Landroidx/media2/session/MediaControllerImplLegacy;->mCustomLayout:Ljava/util/List;

    .line 1160
    iget-object v6, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v6, v6, Landroidx/media2/session/MediaControllerImplLegacy;->mCustomLayout:Ljava/util/List;

    .line 1162
    iget-object v7, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v7, v7, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    .line 1163
    iget-object v8, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v9, v8, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 1164
    invoke-virtual {v9}, Landroid/support/v4/media/session/MediaControllerCompat;->getFlags()J

    move-result-wide v9

    iget-object v11, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v11, v11, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaybackStateCompat:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 1163
    invoke-static {v9, v10, v11}, Landroidx/media2/session/MediaUtils;->convertToSessionCommandGroup(JLandroid/support/v4/media/session/PlaybackStateCompat;)Landroidx/media2/session/SessionCommandGroup;

    move-result-object v9

    iput-object v9, v8, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    .line 1165
    iget-object v8, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v8, v8, Landroidx/media2/session/MediaControllerImplLegacy;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    .line 1166
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, v3, :cond_4

    .line 1169
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$2;

    invoke-direct {v1, p0, v3}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$2;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/common/MediaItem;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_4
    if-nez p1, :cond_6

    if-eqz v2, :cond_5

    .line 1179
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$3;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$3;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;)V

    invoke-virtual {p1, v0}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_5
    return-void

    :cond_6
    if-eqz v2, :cond_7

    .line 1188
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v1

    if-eq v0, v1, :cond_8

    .line 1189
    :cond_7
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$4;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$4;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroid/support/v4/media/session/PlaybackStateCompat;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_8
    if-eqz v2, :cond_9

    .line 1197
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackSpeed()F

    move-result v0

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackSpeed()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_a

    .line 1198
    :cond_9
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$5;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$5;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroid/support/v4/media/session/PlaybackStateCompat;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_a
    if-eqz v2, :cond_b

    .line 1207
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    iget-object v0, v0, Landroidx/media2/session/MediaController;->mTimeDiff:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCurrentPosition(Ljava/lang/Long;)J

    move-result-wide v0

    .line 1208
    iget-object v9, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v9, v9, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    iget-object v9, v9, Landroidx/media2/session/MediaController;->mTimeDiff:Ljava/lang/Long;

    .line 1209
    invoke-virtual {v2, v9}, Landroid/support/v4/media/session/PlaybackStateCompat;->getCurrentPosition(Ljava/lang/Long;)J

    move-result-wide v9

    sub-long v9, v0, v9

    .line 1208
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    const-wide/16 v11, 0x64

    cmp-long v9, v9, v11

    if-lez v9, :cond_b

    .line 1211
    iget-object v9, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v9, v9, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v10, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$6;

    invoke-direct {v10, p0, v0, v1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$6;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;J)V

    invoke-virtual {v9, v10}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    .line 1220
    :cond_b
    invoke-virtual {v7, v8}, Landroidx/media2/session/SessionCommandGroup;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1221
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$7;

    invoke-direct {v1, p0, v8}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$7;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/session/SessionCommandGroup;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    .line 1229
    :cond_c
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_e

    move v0, v4

    .line 1231
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_f

    .line 1232
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media2/session/MediaSession$CommandButton;

    invoke-virtual {v1}, Landroidx/media2/session/MediaSession$CommandButton;->getCommand()Landroidx/media2/session/SessionCommand;

    move-result-object v1

    .line 1233
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/media2/session/MediaSession$CommandButton;

    invoke-virtual {v7}, Landroidx/media2/session/MediaSession$CommandButton;->getCommand()Landroidx/media2/session/SessionCommand;

    move-result-object v7

    .line 1232
    invoke-static {v1, v7}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_3

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1242
    :cond_e
    :goto_3
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$8;

    invoke-direct {v1, p0, v6}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$8;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyPrimaryControllerCallback(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_f
    if-nez v3, :cond_10

    return-void

    .line 1254
    :cond_10
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p1

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->toBufferingState(I)I

    move-result p1

    if-nez v2, :cond_11

    goto :goto_4

    .line 1257
    :cond_11
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->toBufferingState(I)I

    move-result v4

    :goto_4
    if-eq p1, v4, :cond_12

    .line 1259
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$9;

    invoke-direct {v1, p0, v3, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$9;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/common/MediaItem;I)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    :cond_12
    return-void

    .line 1139
    :cond_13
    :goto_5
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1166
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onQueueChanged(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .line 1294
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1295
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_2

    .line 1298
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->removeNullElements(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    .line 1299
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 1306
    :cond_1
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    invoke-static {v1}, Landroidx/media2/session/MediaUtils;->convertQueueItemListToMediaItemList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    goto :goto_1

    .line 1303
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    const/4 v1, 0x0

    iput-object v1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mQueue:Ljava/util/List;

    .line 1304
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput-object v1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    .line 1308
    :goto_1
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylist:Ljava/util/List;

    .line 1309
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

    .line 1310
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1311
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v2, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$11;

    invoke-direct {v2, p0, p1, v1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$11;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Ljava/util/List;Landroidx/media2/common/MediaMetadata;)V

    invoke-virtual {v0, v2}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1296
    :cond_3
    :goto_2
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1310
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onQueueTitleChanged(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1322
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1323
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1326
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadata(Ljava/lang/CharSequence;)Landroidx/media2/common/MediaMetadata;

    move-result-object p1

    iput-object p1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

    .line 1327
    iget-object p1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object p1, p1, Landroidx/media2/session/MediaControllerImplLegacy;->mPlaylistMetadata:Landroidx/media2/common/MediaMetadata;

    .line 1328
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1329
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$12;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$12;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Landroidx/media2/common/MediaMetadata;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1324
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1328
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onRepeatModeChanged(I)V
    .locals 2

    .line 1390
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1391
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1394
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput p1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mRepeatMode:I

    .line 1395
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1396
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$16;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$16;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;I)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1392
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1395
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onSessionDestroyed()V
    .locals 1

    .line 1109
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaControllerImplLegacy;->close()V

    return-void
.end method

.method public onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1114
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1115
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1118
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1119
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$1;

    invoke-direct {v1, p0, p1, p2}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$1;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyPrimaryControllerCallback(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1116
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1118
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onSessionReady()V
    .locals 5

    .line 1082
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1083
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    .line 1084
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    .line 1086
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaControllerImplLegacy;->onConnectedNotLocked()V

    goto :goto_0

    .line 1094
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v1, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 1095
    :try_start_1
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v0

    .line 1096
    iget-object v2, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v2, v2, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat;->getShuffleMode()I

    move-result v2

    .line 1097
    iget-object v3, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v3, v3, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaControllerCompat;->getRepeatMode()I

    move-result v3

    .line 1098
    iget-object v4, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v4, v4, Landroidx/media2/session/MediaControllerImplLegacy;->mControllerCompat:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaControllerCompat;->isCaptioningEnabled()Z

    move-result v4

    .line 1099
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1100
    invoke-virtual {p0, v0}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 1101
    invoke-virtual {p0, v2}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->onShuffleModeChanged(I)V

    .line 1102
    invoke-virtual {p0, v3}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->onRepeatModeChanged(I)V

    .line 1103
    invoke-virtual {p0, v4}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->onCaptioningEnabledChanged(Z)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    .line 1099
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 1084
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public onShuffleModeChanged(I)V
    .locals 2

    .line 1406
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1407
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mClosed:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-boolean v1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mConnected:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 1410
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iput p1, v1, Landroidx/media2/session/MediaControllerImplLegacy;->mShuffleMode:I

    .line 1411
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1412
    iget-object v0, p0, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;->this$0:Landroidx/media2/session/MediaControllerImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaControllerImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    new-instance v1, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$17;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback$17;-><init>(Landroidx/media2/session/MediaControllerImplLegacy$ControllerCompatCallback;I)V

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->notifyAllControllerCallbacks(Landroidx/media2/session/MediaController$ControllerCallbackRunnable;)V

    return-void

    .line 1408
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1411
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
