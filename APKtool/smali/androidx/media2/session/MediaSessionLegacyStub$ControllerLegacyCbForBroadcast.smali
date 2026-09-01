.class final Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;
.super Landroidx/media2/session/MediaSession$ControllerCb;
.source "MediaSessionLegacyStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSessionLegacyStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ControllerLegacyCbForBroadcast"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionLegacyStub;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionLegacyStub;)V
    .locals 0

    .line 849
    iput-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    invoke-direct {p0}, Landroidx/media2/session/MediaSession$ControllerCb;-><init>()V

    return-void
.end method


# virtual methods
.method onAllowedCommandsChanged(ILandroidx/media2/session/SessionCommandGroup;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 937
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "This shouldn\'t be called"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method onBufferingStateChanged(ILandroidx/media2/common/MediaItem;IJJJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 966
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 967
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p2

    .line 966
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onChildrenChanged(ILjava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onCurrentMediaItemChanged(ILandroidx/media2/common/MediaItem;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p1, 0x0

    if-nez p2, :cond_0

    move-object p2, p1

    goto :goto_0

    .line 981
    :cond_0
    invoke-virtual {p2}, Landroidx/media2/common/MediaItem;->getMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object p2

    .line 982
    :goto_0
    iget-object p3, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p3, p3, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->convertToMediaMetadataCompat(Landroidx/media2/common/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    if-nez p2, :cond_1

    goto :goto_1

    .line 986
    :cond_1
    const-string p1, "android.media.metadata.USER_RATING"

    invoke-virtual {p2, p1}, Landroidx/media2/common/MediaMetadata;->getRating(Ljava/lang/String;)Landroidx/media2/common/Rating;

    move-result-object p1

    .line 983
    :goto_1
    invoke-static {p1}, Landroidx/media2/session/MediaSessionLegacyStub;->getRatingType(Landroidx/media2/common/Rating;)I

    move-result p1

    .line 987
    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setRatingType(I)V

    .line 988
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 989
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p2

    .line 988
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onDisconnected(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onLibraryResult(ILandroidx/media2/session/LibraryResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onPlaybackCompleted(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1052
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    .line 1053
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1054
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    invoke-direct {v0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;-><init>(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 1055
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPosition()J

    move-result-wide v2

    .line 1056
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackSpeed()F

    move-result p1

    .line 1055
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setState(IJF)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object p1

    .line 1057
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->build()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    .line 1059
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object v0, v0, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onPlaybackInfoChanged(ILandroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 923
    invoke-virtual {p2}, Landroidx/media2/session/MediaController$PlaybackInfo;->getPlaybackType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 924
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 926
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getPlayer()Landroidx/media2/common/SessionPlayer;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/RemoteSessionPlayer;

    .line 925
    invoke-static {p1}, Landroidx/media2/session/MediaSessionLegacyStub;->createVolumeProviderCompat(Landroidx/media2/session/RemoteSessionPlayer;)Landroidx/media/VolumeProviderCompat;

    move-result-object p1

    .line 927
    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackToRemote(Landroidx/media/VolumeProviderCompat;)V

    goto :goto_0

    .line 929
    :cond_0
    invoke-virtual {p2}, Landroidx/media2/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroidx/media/AudioAttributesCompat;

    move-result-object p1

    invoke-static {p1}, Landroidx/media2/session/MediaUtils;->getLegacyStreamType(Landroidx/media/AudioAttributesCompat;)I

    move-result p1

    .line 930
    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackToLocal(I)V

    :goto_0
    return-void
.end method

.method onPlaybackSpeedChanged(IJJF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 958
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 959
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p2

    .line 958
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onPlayerChanged(ILandroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/media2/common/SessionPlayer;Landroidx/media2/session/MediaController$PlaybackInfo;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-eqz p2, :cond_2

    .line 875
    invoke-virtual {p2}, Landroidx/media2/common/SessionPlayer;->getPlaylist()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPlaylist()Ljava/util/List;

    move-result-object v0

    invoke-static {p3, v0}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 882
    invoke-virtual {p2}, Landroidx/media2/common/SessionPlayer;->getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object p3

    .line 883
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v0

    .line 882
    invoke-static {p3, v0}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 884
    :cond_1
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onPlaylistMetadataChanged(ILandroidx/media2/common/MediaMetadata;)V

    goto :goto_1

    .line 877
    :cond_2
    :goto_0
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPlaylist()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPlaylistMetadata()Landroidx/media2/common/MediaMetadata;

    move-result-object v3

    .line 878
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItemIndex()I

    move-result v4

    .line 879
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPreviousMediaItemIndex()I

    move-result v5

    .line 880
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getNextMediaItemIndex()I

    move-result v6

    move-object v0, p0

    move v1, p1

    .line 876
    invoke-virtual/range {v0 .. v6}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onPlaylistChanged(ILjava/util/List;Landroidx/media2/common/MediaMetadata;III)V

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 886
    invoke-virtual {p2}, Landroidx/media2/common/SessionPlayer;->getShuffleMode()I

    move-result p3

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getShuffleMode()I

    move-result v0

    if-eq p3, v0, :cond_5

    .line 887
    :cond_4
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getShuffleMode()I

    move-result v3

    .line 888
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItemIndex()I

    move-result v4

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPreviousMediaItemIndex()I

    move-result v5

    .line 889
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getNextMediaItemIndex()I

    move-result v6

    move-object v1, p0

    move v2, p1

    .line 887
    invoke-virtual/range {v1 .. v6}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onShuffleModeChanged(IIIII)V

    :cond_5
    if-eqz p2, :cond_6

    .line 891
    invoke-virtual {p2}, Landroidx/media2/common/SessionPlayer;->getRepeatMode()I

    move-result p3

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getRepeatMode()I

    move-result v0

    if-eq p3, v0, :cond_7

    .line 892
    :cond_6
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getRepeatMode()I

    move-result v3

    .line 893
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItemIndex()I

    move-result v4

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPreviousMediaItemIndex()I

    move-result v5

    .line 894
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getNextMediaItemIndex()I

    move-result v6

    move-object v1, p0

    move v2, p1

    .line 892
    invoke-virtual/range {v1 .. v6}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onRepeatModeChanged(IIIII)V

    :cond_7
    if-eqz p2, :cond_9

    .line 897
    invoke-virtual {p2}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object p2

    .line 898
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object p3

    .line 897
    invoke-static {p2, p3}, Landroidx/core/util/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_2

    .line 907
    :cond_8
    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p3, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p3, p3, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    invoke-interface {p3}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    goto :goto_3

    .line 900
    :cond_9
    :goto_2
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItem()Landroidx/media2/common/MediaItem;

    move-result-object v2

    .line 901
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getCurrentMediaItemIndex()I

    move-result v3

    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getPreviousMediaItemIndex()I

    move-result v4

    .line 902
    invoke-virtual {p4}, Landroidx/media2/common/SessionPlayer;->getNextMediaItemIndex()I

    move-result v5

    move-object v0, p0

    move v1, p1

    .line 900
    invoke-virtual/range {v0 .. v5}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onCurrentMediaItemChanged(ILandroidx/media2/common/MediaItem;III)V

    .line 912
    :goto_3
    invoke-virtual {p0, p1, p5}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onPlaybackInfoChanged(ILandroidx/media2/session/MediaController$PlaybackInfo;)V

    return-void
.end method

.method onPlayerResult(ILandroidx/media2/common/SessionPlayer$PlayerResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onPlayerStateChanged(IJJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 950
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 951
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p2

    .line 950
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onPlaylistChanged(ILjava/util/List;Landroidx/media2/common/MediaMetadata;III)V
    .locals 0
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

    .line 1014
    iget-object p4, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p4, p4, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 1015
    invoke-static {p2}, Landroidx/media2/session/MediaUtils;->convertToQueueItemList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 1014
    invoke-virtual {p4, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setQueue(Ljava/util/List;)V

    .line 1017
    invoke-virtual {p0, p1, p3}, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->onPlaylistMetadataChanged(ILandroidx/media2/common/MediaMetadata;)V

    return-void
.end method

.method onPlaylistMetadataChanged(ILandroidx/media2/common/MediaMetadata;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1023
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat;->getController()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getQueueTitle()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 1027
    const-string v0, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {p2, v0}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1029
    const-string v0, "android.media.metadata.TITLE"

    invoke-virtual {p2, v0}, Landroidx/media2/common/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1033
    :cond_1
    :goto_0
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 1034
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->setQueueTitle(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method onRepeatModeChanged(IIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1047
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setRepeatMode(I)V

    return-void
.end method

.method onSearchResultChanged(ILjava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onSeekCompleted(IJJJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 974
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p2, p2, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    .line 975
    invoke-interface {p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->createPlaybackStateCompat()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p2

    .line 974
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method

.method onSessionResult(ILandroidx/media2/session/SessionResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onShuffleModeChanged(IIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1041
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$ControllerLegacyCbForBroadcast;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->setShuffleMode(I)V

    return-void
.end method

.method onSubtitleData(ILandroidx/media2/common/MediaItem;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SubtitleData;)V
    .locals 0

    return-void
.end method

.method onTrackDeselected(ILandroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onTrackSelected(ILandroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method onTracksChanged(ILjava/util/List;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;Landroidx/media2/common/SessionPlayer$TrackInfo;)V
    .locals 0
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

    return-void
.end method

.method onVideoSizeChanged(ILandroidx/media2/common/VideoSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method sendCustomCommand(ILandroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method setCustomLayout(ILjava/util/List;)V
    .locals 0
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

    .line 917
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "This shouldn\'t be called"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
