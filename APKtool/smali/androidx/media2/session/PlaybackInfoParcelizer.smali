.class public final Landroidx/media2/session/PlaybackInfoParcelizer;
.super Ljava/lang/Object;
.source "PlaybackInfoParcelizer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Landroidx/versionedparcelable/VersionedParcel;)Landroidx/media2/session/MediaController$PlaybackInfo;
    .locals 3

    .line 14
    new-instance v0, Landroidx/media2/session/MediaController$PlaybackInfo;

    invoke-direct {v0}, Landroidx/media2/session/MediaController$PlaybackInfo;-><init>()V

    .line 15
    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mPlaybackType:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mPlaybackType:I

    .line 16
    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mControlType:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mControlType:I

    .line 17
    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mMaxVolume:I

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mMaxVolume:I

    .line 18
    iget v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mCurrentVolume:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mCurrentVolume:I

    .line 19
    iget-object v1, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mAudioAttrsCompat:Landroidx/media/AudioAttributesCompat;

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readVersionedParcelable(Landroidx/versionedparcelable/VersionedParcelable;I)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p0

    check-cast p0, Landroidx/media/AudioAttributesCompat;

    iput-object p0, v0, Landroidx/media2/session/MediaController$PlaybackInfo;->mAudioAttrsCompat:Landroidx/media/AudioAttributesCompat;

    return-object v0
.end method

.method public static write(Landroidx/media2/session/MediaController$PlaybackInfo;Landroidx/versionedparcelable/VersionedParcel;)V
    .locals 2

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->setSerializationFlags(ZZ)V

    .line 26
    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->mPlaybackType:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 27
    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->mControlType:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 28
    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->mMaxVolume:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 29
    iget v0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->mCurrentVolume:I

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 30
    iget-object p0, p0, Landroidx/media2/session/MediaController$PlaybackInfo;->mAudioAttrsCompat:Landroidx/media/AudioAttributesCompat;

    const/4 v0, 0x5

    invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->writeVersionedParcelable(Landroidx/versionedparcelable/VersionedParcelable;I)V

    return-void
.end method
