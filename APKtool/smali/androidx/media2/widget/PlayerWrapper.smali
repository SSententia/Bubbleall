.class Landroidx/media2/widget/PlayerWrapper;
.super Ljava/lang/Object;
.source "PlayerWrapper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/PlayerWrapper$PlayerCallback;,
        Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;,
        Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;
    }
.end annotation


# instance fields
.field private final mAllCommands:Landroidx/media2/session/SessionCommandGroup;

.field mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

.field private mCallbackAttached:Z

.field private final mCallbackExecutor:Ljava/util/concurrent/Executor;

.field final mController:Landroidx/media2/session/MediaController;

.field private final mControllerCallback:Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

.field mMediaMetadata:Landroidx/media2/common/MediaMetadata;

.field final mPlayer:Landroidx/media2/common/SessionPlayer;

.field private final mPlayerCallback:Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

.field mSavedPlayerState:I

.field final mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;


# direct methods
.method constructor <init>(Landroidx/media2/common/SessionPlayer;Ljava/util/concurrent/Executor;Landroidx/media2/widget/PlayerWrapper$PlayerCallback;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 88
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    .line 89
    iput-object p2, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 90
    iput-object p3, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    .line 91
    new-instance p1, Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

    invoke-direct {p1, p0}, Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;-><init>(Landroidx/media2/widget/PlayerWrapper;)V

    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayerCallback:Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    .line 94
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mControllerCallback:Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

    .line 96
    new-instance p1, Landroidx/media2/session/SessionCommandGroup$Builder;

    invoke-direct {p1}, Landroidx/media2/session/SessionCommandGroup$Builder;-><init>()V

    const/4 p2, 0x1

    .line 97
    invoke-virtual {p1, p2}, Landroidx/media2/session/SessionCommandGroup$Builder;->addAllPredefinedCommands(I)Landroidx/media2/session/SessionCommandGroup$Builder;

    move-result-object p1

    .line 98
    invoke-virtual {p1}, Landroidx/media2/session/SessionCommandGroup$Builder;->build()Landroidx/media2/session/SessionCommandGroup;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mAllCommands:Landroidx/media2/session/SessionCommandGroup;

    return-void

    .line 87
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "callback must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "executor must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 85
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "player must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>(Landroidx/media2/session/MediaController;Ljava/util/concurrent/Executor;Landroidx/media2/widget/PlayerWrapper$PlayerCallback;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 72
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    .line 73
    iput-object p2, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 74
    iput-object p3, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    .line 75
    new-instance p1, Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

    invoke-direct {p1, p0}, Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;-><init>(Landroidx/media2/widget/PlayerWrapper;)V

    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mControllerCallback:Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

    const/4 p1, 0x0

    .line 77
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    .line 78
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayerCallback:Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

    .line 80
    iput-object p1, p0, Landroidx/media2/widget/PlayerWrapper;->mAllCommands:Landroidx/media2/session/SessionCommandGroup;

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "callback must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "executor must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "controller must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getAllowedCommands()Landroidx/media2/session/SessionCommandGroup;
    .locals 1

    .line 327
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 328
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getAllowedCommands()Landroidx/media2/session/SessionCommandGroup;

    move-result-object v0

    return-object v0

    .line 329
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 331
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllCommands:Landroidx/media2/session/SessionCommandGroup;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private getPlaybackSpeed()F
    .locals 1

    .line 249
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getPlaybackSpeed()F

    move-result v0

    return v0

    .line 251
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 252
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getPlaybackSpeed()F

    move-result v0

    return v0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method private notifyNonCachedStates()V
    .locals 2

    .line 517
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-direct {p0}, Landroidx/media2/widget/PlayerWrapper;->getPlaybackSpeed()F

    move-result v1

    invoke-virtual {v0, p0, v1}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onPlaybackSpeedChanged(Landroidx/media2/widget/PlayerWrapper;F)V

    .line 519
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getTracks()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 521
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-virtual {v1, p0, v0}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onTracksChanged(Landroidx/media2/widget/PlayerWrapper;Ljava/util/List;)V

    .line 523
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 525
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getVideoSize()Landroidx/media2/common/VideoSize;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onVideoSizeChanged(Landroidx/media2/widget/PlayerWrapper;Landroidx/media2/common/VideoSize;)V

    :cond_1
    return-void
.end method


# virtual methods
.method attachCallback()V
    .locals 3

    .line 106
    iget-boolean v0, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackAttached:Z

    if-eqz v0, :cond_0

    return-void

    .line 107
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_1

    .line 108
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/media2/widget/PlayerWrapper;->mControllerCallback:Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

    invoke-virtual {v0, v1, v2}, Landroidx/media2/session/MediaController;->registerExtraCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_2

    .line 110
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayerCallback:Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/SessionPlayer;->registerPlayerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/common/SessionPlayer$PlayerCallback;)V

    .line 112
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->updateAndNotifyCachedStates()V

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackAttached:Z

    return-void
.end method

.method canPause()Z
    .locals 2

    .line 168
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSeekBackward()Z
    .locals 2

    .line 173
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const v1, 0x9c41

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSeekForward()Z
    .locals 2

    .line 178
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const v1, 0x9c40

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSeekTo()Z
    .locals 2

    .line 193
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x2713

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSelectDeselectTrack()Z
    .locals 2

    .line 198
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x2af9

    .line 199
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    const/16 v1, 0x2afa

    .line 200
    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSkipToNext()Z
    .locals 2

    .line 183
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x2719

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method canSkipToPrevious()Z
    .locals 2

    .line 188
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    if-eqz v0, :cond_0

    const/16 v1, 0x2718

    invoke-virtual {v0, v1}, Landroidx/media2/session/SessionCommandGroup;->hasCommand(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 1

    .line 277
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 278
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaController;->deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 279
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 280
    invoke-virtual {v0, p1}, Landroidx/media2/common/SessionPlayer;->deselectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method detachCallback()V
    .locals 2

    .line 117
    iget-boolean v0, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackAttached:Z

    if-nez v0, :cond_0

    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_1

    .line 119
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mControllerCallback:Landroidx/media2/widget/PlayerWrapper$MediaControllerCallback;

    invoke-virtual {v0, v1}, Landroidx/media2/session/MediaController;->unregisterExtraCallback(Landroidx/media2/session/MediaController$ControllerCallback;)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_2

    .line 121
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayerCallback:Landroidx/media2/widget/PlayerWrapper$SessionPlayerCallback;

    invoke-virtual {v0, v1}, Landroidx/media2/common/SessionPlayer;->unregisterPlayerCallback(Landroidx/media2/common/SessionPlayer$PlayerCallback;)V

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 123
    iput-boolean v0, p0, Landroidx/media2/widget/PlayerWrapper;->mCallbackAttached:Z

    return-void
.end method

.method getArtistText()Ljava/lang/CharSequence;
    .locals 2

    .line 307
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mMediaMetadata:Landroidx/media2/common/MediaMetadata;

    if-eqz v0, :cond_0

    .line 308
    const-string v1, "android.media.metadata.ARTIST"

    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mMediaMetadata:Landroidx/media2/common/MediaMetadata;

    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method getBufferPercentage()J
    .locals 7

    .line 144
    iget v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 147
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getDurationMs()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_1

    return-wide v1

    .line 150
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_2

    .line 151
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getBufferedPosition()J

    move-result-wide v5

    goto :goto_0

    .line 152
    :cond_2
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_3

    .line 153
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getBufferedPosition()J

    move-result-wide v5

    goto :goto_0

    :cond_3
    move-wide v5, v1

    :goto_0
    cmp-long v0, v5, v1

    if-gez v0, :cond_4

    goto :goto_1

    :cond_4
    const-wide/16 v0, 0x64

    mul-long/2addr v5, v0

    .line 155
    div-long v1, v5, v3

    :goto_1
    return-wide v1
.end method

.method getCurrentMediaItem()Landroidx/media2/common/MediaItem;
    .locals 1

    .line 317
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 318
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v0

    return-object v0

    .line 319
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 320
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method getCurrentMediaItemIndex()I
    .locals 1

    .line 405
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 406
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getCurrentMediaItemIndex()I

    move-result v0

    return v0

    .line 407
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 408
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItemIndex()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method getCurrentPosition()J
    .locals 5

    .line 131
    iget v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 135
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_1

    .line 136
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getCurrentPosition()J

    move-result-wide v3

    goto :goto_0

    .line 137
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getCurrentPosition()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-gez v0, :cond_3

    goto :goto_1

    :cond_3
    move-wide v1, v3

    :goto_1
    return-wide v1
.end method

.method getDurationMs()J
    .locals 5

    .line 285
    iget v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 289
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_1

    .line 290
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getDuration()J

    move-result-wide v3

    goto :goto_0

    .line 291
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_2

    .line 292
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getDuration()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-gez v0, :cond_3

    goto :goto_1

    :cond_3
    move-wide v1, v3

    :goto_1
    return-wide v1
.end method

.method getNextMediaItemIndex()I
    .locals 1

    .line 423
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getNextMediaItemIndex()I

    move-result v0

    return v0

    .line 425
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 426
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getNextMediaItemIndex()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method getPlayerState()I
    .locals 1

    .line 159
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getPlayerState()I

    move-result v0

    return v0

    .line 161
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 162
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method getPreviousMediaItemIndex()I
    .locals 1

    .line 414
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 415
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getPreviousMediaItemIndex()I

    move-result v0

    return v0

    .line 416
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 417
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getPreviousMediaItemIndex()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method getSelectedTrack(I)Landroidx/media2/common/SessionPlayer$TrackInfo;
    .locals 1

    .line 387
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 388
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaController;->getSelectedTrack(I)Landroidx/media2/common/SessionPlayer$TrackInfo;

    move-result-object p1

    return-object p1

    .line 389
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 390
    invoke-virtual {v0, p1}, Landroidx/media2/common/SessionPlayer;->getSelectedTrack(I)Landroidx/media2/common/SessionPlayer$TrackInfo;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method getTitle()Ljava/lang/CharSequence;
    .locals 2

    .line 298
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mMediaMetadata:Landroidx/media2/common/MediaMetadata;

    if-eqz v0, :cond_0

    .line 299
    const-string v1, "android.media.metadata.TITLE"

    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mMediaMetadata:Landroidx/media2/common/MediaMetadata;

    invoke-virtual {v0, v1}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method getTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;"
        }
    .end annotation

    .line 377
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 378
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getTracks()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 379
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 380
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getTracks()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 382
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method getVideoSize()Landroidx/media2/common/VideoSize;
    .locals 2

    .line 367
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 368
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->getVideoSize()Landroidx/media2/common/VideoSize;

    move-result-object v0

    return-object v0

    .line 369
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 370
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->getVideoSize()Landroidx/media2/common/VideoSize;

    move-result-object v0

    return-object v0

    .line 372
    :cond_1
    new-instance v0, Landroidx/media2/common/VideoSize;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroidx/media2/common/VideoSize;-><init>(II)V

    return-object v0
.end method

.method hasDisconnectedController()Z
    .locals 1

    .line 102
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isPlaying()Z
    .locals 2

    .line 127
    iget v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method pause()V
    .locals 1

    .line 205
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 206
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->pause()Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 208
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->pause()Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method play()V
    .locals 1

    .line 214
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->play()Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 216
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 217
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->play()Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method seekTo(J)V
    .locals 1

    .line 223
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaController;->seekTo(J)Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 226
    invoke-virtual {v0, p1, p2}, Landroidx/media2/common/SessionPlayer;->seekTo(J)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 1

    .line 268
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 269
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaController;->selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 270
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 271
    invoke-virtual {v0, p1}, Landroidx/media2/common/SessionPlayer;->selectTrack(Landroidx/media2/common/SessionPlayer$TrackInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method setPlaybackSpeed(F)V
    .locals 1

    .line 259
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaController;->setPlaybackSpeed(F)Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 262
    invoke-virtual {v0, p1}, Landroidx/media2/common/SessionPlayer;->setPlaybackSpeed(F)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+",
            "Landroidx/media2/common/BaseResult;",
            ">;"
        }
    .end annotation

    .line 396
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 397
    invoke-virtual {v0, p1}, Landroidx/media2/session/MediaController;->setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 398
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 399
    invoke-virtual {v0, p1}, Landroidx/media2/common/SessionPlayer;->setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method skipToNextItem()V
    .locals 1

    .line 232
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->skipToNextPlaylistItem()Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 234
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 235
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->skipToNextPlaylistItem()Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method skipToPreviousItem()V
    .locals 1

    .line 241
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mController:Landroidx/media2/session/MediaController;

    if-eqz v0, :cond_0

    .line 242
    invoke-virtual {v0}, Landroidx/media2/session/MediaController;->skipToPreviousPlaylistItem()Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    .line 243
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mPlayer:Landroidx/media2/common/SessionPlayer;

    if-eqz v0, :cond_1

    .line 244
    invoke-virtual {v0}, Landroidx/media2/common/SessionPlayer;->skipToPreviousPlaylistItem()Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method updateAndNotifyCachedStates()V
    .locals 6

    .line 339
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getPlayerState()I

    move-result v0

    .line 340
    iget v1, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v0, :cond_0

    .line 341
    iput v0, p0, Landroidx/media2/widget/PlayerWrapper;->mSavedPlayerState:I

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .line 346
    :goto_0
    invoke-direct {p0}, Landroidx/media2/widget/PlayerWrapper;->getAllowedCommands()Landroidx/media2/session/SessionCommandGroup;

    move-result-object v4

    .line 347
    iget-object v5, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    invoke-static {v5, v4}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 348
    iput-object v4, p0, Landroidx/media2/widget/PlayerWrapper;->mAllowedCommands:Landroidx/media2/session/SessionCommandGroup;

    goto :goto_1

    :cond_1
    move v2, v3

    .line 352
    :goto_1
    invoke-virtual {p0}, Landroidx/media2/widget/PlayerWrapper;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v3

    if-nez v3, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    .line 353
    :cond_2
    invoke-virtual {v3}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v5

    :goto_2
    iput-object v5, p0, Landroidx/media2/widget/PlayerWrapper;->mMediaMetadata:Landroidx/media2/common/MediaMetadata;

    if-eqz v1, :cond_3

    .line 356
    iget-object v1, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-virtual {v1, p0, v0}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onPlayerStateChanged(Landroidx/media2/widget/PlayerWrapper;I)V

    :cond_3
    if-eqz v4, :cond_4

    if-eqz v2, :cond_4

    .line 359
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-virtual {v0, p0, v4}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onAllowedCommandsChanged(Landroidx/media2/widget/PlayerWrapper;Landroidx/media2/session/SessionCommandGroup;)V

    .line 361
    :cond_4
    iget-object v0, p0, Landroidx/media2/widget/PlayerWrapper;->mWrapperCallback:Landroidx/media2/widget/PlayerWrapper$PlayerCallback;

    invoke-virtual {v0, p0, v3}, Landroidx/media2/widget/PlayerWrapper$PlayerCallback;->onCurrentMediaItemChanged(Landroidx/media2/widget/PlayerWrapper;Landroidx/media2/common/MediaItem;)V

    .line 362
    invoke-direct {p0}, Landroidx/media2/widget/PlayerWrapper;->notifyNonCachedStates()V

    return-void
.end method
