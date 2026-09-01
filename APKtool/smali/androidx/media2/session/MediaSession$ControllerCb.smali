.class abstract Landroidx/media2/session/MediaSession$ControllerCb;
.super Ljava/lang/Object;
.source "MediaSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ControllerCb"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract onAllowedCommandsChanged(ILandroidx/media2/session/SessionCommandGroup;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onBufferingStateChanged(ILandroidx/media2/common/MediaItem;IJJJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onChildrenChanged(ILjava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onCurrentMediaItemChanged(ILandroidx/media2/common/MediaItem;III)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onDisconnected(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onLibraryResult(ILandroidx/media2/session/LibraryResult;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlaybackCompleted(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlaybackInfoChanged(ILandroidx/media2/session/MediaController$PlaybackInfo;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlaybackSpeedChanged(IJJF)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlayerChanged(ILandroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlayerResult(ILandroidx/media2/common/SessionPlayer$PlayerResult;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlayerStateChanged(IJJI)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlaylistChanged(ILjava/util/List;Landroidx/media2/common/MediaMetadata;III)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;",
            "Landroidx/media2/common/MediaMetadata;",
            "III)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onPlaylistMetadataChanged(ILandroidx/media2/common/MediaMetadata;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onRepeatModeChanged(IIIII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onSearchResultChanged(ILjava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onSeekCompleted(IJJJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onSessionResult(ILandroidx/media2/session/SessionResult;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onShuffleModeChanged(IIIII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onSubtitleData(ILandroidx/media2/common/MediaItem;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SubtitleData;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onTrackDeselected(ILandroidx/media2/common/SessionPlayer$TrackInfo;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onTrackSelected(ILandroidx/media2/common/SessionPlayer$TrackInfo;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onTracksChanged(ILjava/util/List;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ">;",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            "Landroidx/media2/common/SessionPlayer$TrackInfo;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract onVideoSizeChanged(ILandroidx/media2/common/VideoSize;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract sendCustomCommand(ILandroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method abstract setCustomLayout(ILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaSession$CommandButton;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
