.class Landroidx/media2/session/IMediaSession$Stub$Proxy;
.super Ljava/lang/Object;
.source "IMediaSession.java"

# interfaces
.implements Landroidx/media2/session/IMediaSession;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/IMediaSession$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Proxy"
.end annotation


# static fields
.field public static sDefaultImpl:Landroidx/media2/session/IMediaSession;


# instance fields
.field private mRemote:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 760
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 761
    iput-object p1, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public addPlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1163
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1165
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1166
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1167
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1168
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1169
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1170
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x19

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1171
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1172
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->addPlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1177
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1178
    throw p1
.end method

.method public adjustVolume(Landroidx/media2/session/IMediaController;III)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 833
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 835
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 836
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 837
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 838
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 839
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 840
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x4

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 841
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 842
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->adjustVolume(Landroidx/media2/session/IMediaController;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 847
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 848
    throw p1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 765
    iget-object v0, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public connect(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 773
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 775
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 776
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 777
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p3, :cond_1

    .line 779
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 780
    invoke-virtual {p3, v0, v2}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 783
    :cond_1
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 785
    :goto_1
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    invoke-interface {v2, v3, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 786
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 787
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->connect(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 792
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 793
    throw p1
.end method

.method public deselectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1374
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1376
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1377
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1378
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1380
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1381
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1384
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1386
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x2b

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1387
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1388
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->deselectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1393
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1394
    throw p1
.end method

.method public fastForward(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 903
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 905
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 906
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 907
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 908
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x8

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 909
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 910
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->fastForward(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 915
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 916
    throw p1
.end method

.method public getChildren(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1468
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1470
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1471
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1472
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1473
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1474
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 1475
    invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p6, :cond_1

    .line 1477
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1478
    invoke-virtual {p6, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1481
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1483
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x24

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1484
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1485
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v2

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-interface/range {v2 .. v8}, Landroidx/media2/session/IMediaSession;->getChildren(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1490
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1491
    throw p1
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 769
    const-string v0, "androidx.media2.session.IMediaSession"

    return-object v0
.end method

.method public getItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1450
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1452
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1453
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1454
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1455
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1456
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x23

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1457
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1458
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->getItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1463
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1464
    throw p1
.end method

.method public getLibraryRoot(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1426
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1428
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1429
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1430
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1432
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1433
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1436
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1438
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x22

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1439
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1440
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->getLibraryRoot(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1445
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1446
    throw p1
.end method

.method public getSearchResult(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1520
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1522
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1523
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1524
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1525
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1526
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 1527
    invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p6, :cond_1

    .line 1529
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1530
    invoke-virtual {p6, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1533
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1535
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x26

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1536
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1537
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v2

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-interface/range {v2 .. v8}, Landroidx/media2/session/IMediaSession;->getSearchResult(Landroidx/media2/session/IMediaController;ILjava/lang/String;IILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1542
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1543
    throw p1
.end method

.method public movePlaylistItem(Landroidx/media2/session/IMediaController;III)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1219
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1221
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1222
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1223
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1224
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1225
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 1226
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x2c

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1227
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1228
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->movePlaylistItem(Landroidx/media2/session/IMediaController;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1233
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1234
    throw p1
.end method

.method public onControllerResult(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1398
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1400
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1401
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1402
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1404
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1405
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1408
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1410
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x21

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1411
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1412
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->onControllerResult(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1417
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1418
    throw p1
.end method

.method public onCustomCommand(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 989
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 991
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 992
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 993
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 995
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 996
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 999
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    if-eqz p4, :cond_2

    .line 1002
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1003
    invoke-virtual {p4, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2

    .line 1006
    :cond_2
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1008
    :goto_2
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0xd

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1009
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1010
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->onCustomCommand(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1015
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1016
    throw p1
.end method

.method public pause(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 869
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 871
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 872
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 873
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 874
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x6

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 875
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 876
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->pause(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 881
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 882
    throw p1
.end method

.method public play(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 852
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 854
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 855
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 856
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 857
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x5

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 858
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 859
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->play(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 864
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 865
    throw p1
.end method

.method public prepare(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 886
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 888
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 889
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 890
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 891
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x7

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 892
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 893
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->prepare(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 898
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 899
    throw p1
.end method

.method public release(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 797
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 799
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 800
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 801
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 802
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 803
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 804
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->release(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 809
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 810
    throw p1
.end method

.method public removePlaylistItem(Landroidx/media2/session/IMediaController;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1184
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1185
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1186
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1187
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1188
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1a

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1189
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1190
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->removePlaylistItem(Landroidx/media2/session/IMediaController;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1195
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1196
    throw p1
.end method

.method public replacePlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1200
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1202
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1203
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1204
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1205
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1206
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1207
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1b

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1208
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1209
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->replacePlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1214
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1215
    throw p1
.end method

.method public rewind(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 920
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 922
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 923
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 924
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 925
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x9

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 926
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 927
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->rewind(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 932
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 933
    throw p1
.end method

.method public search(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1495
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1497
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1498
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1499
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1500
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_1

    .line 1502
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1503
    invoke-virtual {p4, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1506
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1508
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x25

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1509
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1510
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->search(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1515
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1516
    throw p1
.end method

.method public seekTo(Landroidx/media2/session/IMediaController;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 971
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 973
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 974
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 975
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 976
    invoke-virtual {v0, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 977
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xc

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 978
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 979
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->seekTo(Landroidx/media2/session/IMediaController;IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 984
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 985
    throw p1
.end method

.method public selectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1350
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1352
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1353
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1354
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1356
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1357
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1360
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1362
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x2a

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1363
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1364
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->selectTrack(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1369
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1370
    throw p1
.end method

.method public setMediaItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1090
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1092
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1093
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1094
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1095
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1096
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x17

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1097
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1098
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->setMediaItem(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1103
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1104
    throw p1
.end method

.method public setMediaUri(Landroidx/media2/session/IMediaController;ILandroid/net/Uri;Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1108
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1110
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1111
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1112
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1114
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1115
    invoke-virtual {p3, v0, v3}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1118
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    if-eqz p4, :cond_2

    .line 1121
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1122
    invoke-virtual {p4, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2

    .line 1125
    :cond_2
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1127
    :goto_2
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x2d

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1128
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1129
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->setMediaUri(Landroidx/media2/session/IMediaController;ILandroid/net/Uri;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1134
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1135
    throw p1
.end method

.method public setPlaybackSpeed(Landroidx/media2/session/IMediaController;IF)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1047
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1049
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1050
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1051
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1052
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeFloat(F)V

    .line 1053
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x15

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1054
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1055
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->setPlaybackSpeed(Landroidx/media2/session/IMediaController;IF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1060
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1061
    throw p1
.end method

.method public setPlaylist(Landroidx/media2/session/IMediaController;ILjava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/IMediaController;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1065
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1067
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1068
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1069
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1070
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_1

    .line 1072
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1073
    invoke-virtual {p4, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1076
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1078
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x16

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1079
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1080
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->setPlaylist(Landroidx/media2/session/IMediaController;ILjava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1085
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1086
    throw p1
.end method

.method public setRating(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1022
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1024
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1025
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1026
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1027
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_1

    .line 1029
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1030
    invoke-virtual {p4, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1033
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1035
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x14

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1036
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1037
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->setRating(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1042
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1043
    throw p1
.end method

.method public setRepeatMode(Landroidx/media2/session/IMediaController;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1290
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1292
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1293
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1294
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1295
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1296
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1f

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1297
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1298
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->setRepeatMode(Landroidx/media2/session/IMediaController;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1303
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1304
    throw p1
.end method

.method public setShuffleMode(Landroidx/media2/session/IMediaController;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1308
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1310
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1311
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1312
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1313
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1314
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x20

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1315
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1316
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->setShuffleMode(Landroidx/media2/session/IMediaController;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1321
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1322
    throw p1
.end method

.method public setSurface(Landroidx/media2/session/IMediaController;ILandroid/view/Surface;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1326
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1328
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1329
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1330
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1332
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1333
    invoke-virtual {p3, v0, v3}, Landroid/view/Surface;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1336
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1338
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x29

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1339
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1340
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->setSurface(Landroidx/media2/session/IMediaController;ILandroid/view/Surface;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1345
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1346
    throw p1
.end method

.method public setVolumeTo(Landroidx/media2/session/IMediaController;III)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 814
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 816
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 817
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 818
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 819
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 820
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 821
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 822
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 823
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->setVolumeTo(Landroidx/media2/session/IMediaController;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 828
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 829
    throw p1
.end method

.method public skipBackward(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 954
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 956
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 957
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 958
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 959
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xb

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 960
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 961
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->skipBackward(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 966
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 967
    throw p1
.end method

.method public skipForward(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 937
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 939
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 940
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 941
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 942
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xa

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 943
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 944
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->skipForward(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 949
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 950
    throw p1
.end method

.method public skipToNextItem(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1273
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1275
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1276
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1277
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1278
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1e

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1279
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1280
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->skipToNextItem(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1285
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1286
    throw p1
.end method

.method public skipToPlaylistItem(Landroidx/media2/session/IMediaController;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1238
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1240
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1241
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1242
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1243
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1244
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1c

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1245
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1246
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->skipToPlaylistItem(Landroidx/media2/session/IMediaController;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1251
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1252
    throw p1
.end method

.method public skipToPreviousItem(Landroidx/media2/session/IMediaController;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1256
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1258
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1259
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1260
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1261
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x1d

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1262
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1263
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroidx/media2/session/IMediaSession;->skipToPreviousItem(Landroidx/media2/session/IMediaController;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1268
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1269
    throw p1
.end method

.method public subscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1547
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1549
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1550
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1551
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1552
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_1

    .line 1554
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1555
    invoke-virtual {p4, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1558
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1560
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x27

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1561
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1562
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Landroidx/media2/session/IMediaSession;->subscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;Landroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1567
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1568
    throw p1
.end method

.method public unsubscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1572
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1574
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1575
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1576
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1577
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1578
    iget-object v2, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x28

    const/4 v4, 0x1

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1579
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1580
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->unsubscribe(Landroidx/media2/session/IMediaController;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1585
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1586
    throw p1
.end method

.method public updatePlaylistMetadata(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1139
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 1141
    :try_start_0
    const-string v1, "androidx.media2.session.IMediaSession"

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1142
    invoke-interface {p1}, Landroidx/media2/session/IMediaController;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 1143
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    .line 1145
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1146
    invoke-virtual {p3, v0, v3}, Landroidx/versionedparcelable/ParcelImpl;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 1149
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 1151
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/IMediaSession$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x18

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1152
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1153
    invoke-static {}, Landroidx/media2/session/IMediaSession$Stub;->getDefaultImpl()Landroidx/media2/session/IMediaSession;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Landroidx/media2/session/IMediaSession;->updatePlaylistMetadata(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1158
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 1159
    throw p1
.end method
