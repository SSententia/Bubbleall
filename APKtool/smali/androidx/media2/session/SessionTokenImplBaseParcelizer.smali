.class public final Landroidx/media2/session/SessionTokenImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SessionTokenImplBaseParcelizer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Landroidx/versionedparcelable/VersionedParcel;)Landroidx/media2/session/SessionTokenImplBase;
    .locals 3

    .line 14
    new-instance v0, Landroidx/media2/session/SessionTokenImplBase;

    invoke-direct {v0}, Landroidx/media2/session/SessionTokenImplBase;-><init>()V

    .line 15
    iget v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    .line 16
    iget v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readInt(II)I

    move-result v1

    iput v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    .line 17
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    .line 18
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    .line 19
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readStrongBinder(Landroid/os/IBinder;I)Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    .line 20
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    const/4 v2, 0x6

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readParcelable(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/ComponentName;

    iput-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    .line 21
    iget-object v1, v0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    const/4 v2, 0x7

    invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->readBundle(Landroid/os/Bundle;I)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, v0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public static write(Landroidx/media2/session/SessionTokenImplBase;Landroidx/versionedparcelable/VersionedParcel;)V
    .locals 2

    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->setSerializationFlags(ZZ)V

    .line 28
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mUid:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 29
    iget v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mType:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeInt(II)V

    .line 30
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mPackageName:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeString(Ljava/lang/String;I)V

    .line 31
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mServiceName:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeString(Ljava/lang/String;I)V

    .line 32
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mISession:Landroid/os/IBinder;

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeStrongBinder(Landroid/os/IBinder;I)V

    .line 33
    iget-object v0, p0, Landroidx/media2/session/SessionTokenImplBase;->mComponentName:Landroid/content/ComponentName;

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 34
    iget-object p0, p0, Landroidx/media2/session/SessionTokenImplBase;->mExtras:Landroid/os/Bundle;

    const/4 v0, 0x7

    invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->writeBundle(Landroid/os/Bundle;I)V

    return-void
.end method
