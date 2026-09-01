.class public Landroidx/media2/common/FileMediaItem;
.super Landroidx/media2/common/MediaItem;
.source "FileMediaItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/common/FileMediaItem$Builder;
    }
.end annotation


# static fields
.field public static final FD_LENGTH_UNKNOWN:J = 0x7ffffffffffffffL

.field private static final TAG:Ljava/lang/String; = "FileMediaItem"


# instance fields
.field private mClosed:Z

.field private final mFDLength:J

.field private final mFDOffset:J

.field private final mLock:Ljava/lang/Object;

.field private final mPFD:Landroid/os/ParcelFileDescriptor;

.field private mRefCount:I


# direct methods
.method constructor <init>(Landroidx/media2/common/FileMediaItem$Builder;)V
    .locals 2

    .line 65
    invoke-direct {p0, p1}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaItem$Builder;)V

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/common/FileMediaItem;->mLock:Ljava/lang/Object;

    .line 66
    iget-object v0, p1, Landroidx/media2/common/FileMediaItem$Builder;->mPFD:Landroid/os/ParcelFileDescriptor;

    iput-object v0, p0, Landroidx/media2/common/FileMediaItem;->mPFD:Landroid/os/ParcelFileDescriptor;

    .line 67
    iget-wide v0, p1, Landroidx/media2/common/FileMediaItem$Builder;->mFDOffset:J

    iput-wide v0, p0, Landroidx/media2/common/FileMediaItem;->mFDOffset:J

    .line 68
    iget-wide v0, p1, Landroidx/media2/common/FileMediaItem$Builder;->mFDLength:J

    iput-wide v0, p0, Landroidx/media2/common/FileMediaItem;->mFDLength:J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 156
    iget-object v0, p0, Landroidx/media2/common/FileMediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 157
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/FileMediaItem;->mPFD:Landroid/os/ParcelFileDescriptor;

    if-eqz v1, :cond_0

    .line 158
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V

    :cond_0
    const/4 v1, 0x1

    .line 160
    iput-boolean v1, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z

    .line 161
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public decreaseRefCount()V
    .locals 6

    const-string v0, "Failed to close the ParcelFileDescriptor "

    .line 120
    iget-object v1, p0, Landroidx/media2/common/FileMediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 121
    :try_start_0
    iget-boolean v2, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z

    if-eqz v2, :cond_0

    .line 122
    const-string v0, "FileMediaItem"

    const-string v2, "ParcelFileDescriptorClient is already closed."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    monitor-exit v1

    return-void

    .line 125
    :cond_0
    iget v2, p0, Landroidx/media2/common/FileMediaItem;->mRefCount:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iput v2, p0, Landroidx/media2/common/FileMediaItem;->mRefCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-gtz v2, :cond_2

    .line 127
    :try_start_1
    iget-object v2, p0, Landroidx/media2/common/FileMediaItem;->mPFD:Landroid/os/ParcelFileDescriptor;

    if-eqz v2, :cond_1

    .line 128
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    :cond_1
    :goto_0
    :try_start_2
    iput-boolean v3, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 131
    :try_start_3
    const-string v4, "FileMediaItem"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/media2/common/FileMediaItem;->mPFD:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 133
    :goto_1
    :try_start_4
    iput-boolean v3, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z

    .line 134
    throw v0

    .line 136
    :cond_2
    :goto_2
    monitor-exit v1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public getFileDescriptorLength()J
    .locals 2

    .line 95
    iget-wide v0, p0, Landroidx/media2/common/FileMediaItem;->mFDLength:J

    return-wide v0
.end method

.method public getFileDescriptorOffset()J
    .locals 2

    .line 86
    iget-wide v0, p0, Landroidx/media2/common/FileMediaItem;->mFDOffset:J

    return-wide v0
.end method

.method public getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 77
    iget-object v0, p0, Landroidx/media2/common/FileMediaItem;->mPFD:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public increaseRefCount()V
    .locals 3

    .line 104
    iget-object v0, p0, Landroidx/media2/common/FileMediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 105
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z

    if-eqz v1, :cond_0

    .line 106
    const-string v1, "FileMediaItem"

    const-string v2, "ParcelFileDescriptorClient is already closed."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    monitor-exit v0

    return-void

    .line 109
    :cond_0
    iget v1, p0, Landroidx/media2/common/FileMediaItem;->mRefCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/media2/common/FileMediaItem;->mRefCount:I

    .line 110
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isClosed()Z
    .locals 2

    .line 145
    iget-object v0, p0, Landroidx/media2/common/FileMediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 146
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/common/FileMediaItem;->mClosed:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 147
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
