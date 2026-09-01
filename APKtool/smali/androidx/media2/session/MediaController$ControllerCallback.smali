.class public abstract Landroidx/media2/session/MediaController$ControllerCallback;
.super Ljava/lang/Object;
.source "MediaController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ControllerCallback"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1833
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAllowedCommandsChanged(Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionCommandGroup;)V
    .locals 0

    return-void
.end method

.method public onBufferingStateChanged(Landroidx/media2/session/MediaController;Landroidx/media2/common/MediaItem;I)V
    .locals 0

    return-void
.end method

.method public onConnected(Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionCommandGroup;)V
    .locals 0

    return-void
.end method

.method public onCurrentMediaItemChanged(Landroidx/media2/session/MediaController;Landroidx/media2/common/MediaItem;)V
    .locals 0

    return-void
.end method

.method public onCustomCommand(Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)Landroidx/media2/session/SessionResult;
    .locals 0

    .line 1921
    new-instance p1, Landroidx/media2/session/SessionResult;

    const/4 p2, -0x6

    invoke-direct {p1, p2}, Landroidx/media2/session/SessionResult;-><init>(I)V

    return-object p1
.end method

.method public onDisconnected(Landroidx/media2/session/MediaController;)V
    .locals 0

    return-void
.end method

.method public onPlaybackCompleted(Landroidx/media2/session/MediaController;)V
    .locals 0

    return-void
.end method

.method public onPlaybackInfoChanged(Landroidx/media2/session/MediaController;Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 0

    return-void
.end method

.method public onPlaybackSpeedChanged(Landroidx/media2/session/MediaController;F)V
    .locals 0

    return-void
.end method

.method public onPlayerStateChanged(Landroidx/media2/session/MediaController;I)V
    .locals 0

    return-void
.end method

.method public onPlaylistChanged(Landroidx/media2/session/MediaController;Ljava/util/List;Landroidx/media2/common/MediaMetadata;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaController;",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;",
            "Landroidx/media2/common/MediaMetadata;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onPlaylistMetadataChanged(Landroidx/media2/session/MediaController;Landroidx/media2/common/MediaMetadata;)V
    .locals 0

    return-void
.end method

.method public onRepeatModeChanged(Landroidx/media2/session/MediaController;I)V
    .locals 0

    return-void
.end method

.method public onSeekCompleted(Landroidx/media2/session/MediaController;J)V
    .locals 0

    return-void
.end method

.method public onSetCustomLayout(Landroidx/media2/session/MediaController;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaController;",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;)I"
        }
    .end annotation

    const/4 p1, -0x6

    return p1
.end method

.method public onShuffleModeChanged(Landroidx/media2/session/MediaController;I)V
    .locals 0

    return-void
.end method

.method public onSubtitleData(Landroidx/media2/session/MediaController;Landroidx/media2/common/MediaItem;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SubtitleData;)V
    .locals 0

    return-void
.end method

.method public onTrackDeselected(Landroidx/media2/session/MediaController;Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 0

    return-void
.end method

.method public onTrackSelected(Landroidx/media2/session/MediaController;Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 0

    return-void
.end method

.method public onTracksChanged(Landroidx/media2/session/MediaController;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaController;",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onVideoSizeChanged(Landroidx/media2/session/MediaController;Landroidx/media2/common/MediaItem;Landroidx/media2/common/VideoSize;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onVideoSizeChanged(Landroidx/media2/session/MediaController;Landroidx/media2/common/VideoSize;)V
    .locals 0

    return-void
.end method
