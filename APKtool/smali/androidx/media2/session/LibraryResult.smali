.class public Landroidx/media2/session/LibraryResult;
.super Landroidx/versionedparcelable/CustomVersionedParcelable;
.source "LibraryResult.java"

# interfaces
.implements Landroidx/media2/session/RemoteResult;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/LibraryResult$ResultCode;
    }
.end annotation


# instance fields
.field mCompletionTime:J

.field mItem:Landroidx/media2/common/MediaItem;

.field mItemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation
.end field

.field mItemListSlice:Landroidx/media2/common/ParcelImplListSlice;

.field mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

.field mParcelableItem:Landroidx/media2/common/MediaItem;

.field mResultCode:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 104
    invoke-direct {p0, p1, v0, v0, v0}, Landroidx/media2/session/LibraryResult;-><init>(ILandroidx/media2/common/MediaItem;Ljava/util/List;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V

    return-void
.end method

.method public constructor <init>(ILandroidx/media2/common/MediaItem;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 1

    const/4 v0, 0x0

    .line 116
    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/media2/session/LibraryResult;-><init>(ILandroidx/media2/common/MediaItem;Ljava/util/List;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V

    return-void
.end method

.method private constructor <init>(ILandroidx/media2/common/MediaItem;Ljava/util/List;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media2/common/MediaItem;",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")V"
        }
    .end annotation

    .line 132
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    .line 133
    iput p1, p0, Landroidx/media2/session/LibraryResult;->mResultCode:I

    .line 134
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media2/session/LibraryResult;->mCompletionTime:J

    .line 135
    iput-object p2, p0, Landroidx/media2/session/LibraryResult;->mItem:Landroidx/media2/common/MediaItem;

    .line 136
    iput-object p3, p0, Landroidx/media2/session/LibraryResult;->mItemList:Ljava/util/List;

    .line 137
    iput-object p4, p0, Landroidx/media2/session/LibraryResult;->mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 128
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/media2/session/LibraryResult;-><init>(ILandroidx/media2/common/MediaItem;Ljava/util/List;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V

    return-void
.end method

.method static createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 141
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v0

    .line 142
    new-instance v1, Landroidx/media2/session/LibraryResult;

    invoke-direct {v1, p0}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public getCompletionTime()J
    .locals 2

    .line 181
    iget-wide v0, p0, Landroidx/media2/session/LibraryResult;->mCompletionTime:J

    return-wide v0
.end method

.method public getLibraryParams()Landroidx/media2/session/MediaLibraryService$LibraryParams;
    .locals 1

    .line 221
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    return-object v0
.end method

.method public getMediaItem()Landroidx/media2/common/MediaItem;
    .locals 1

    .line 196
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItem:Landroidx/media2/common/MediaItem;

    return-object v0
.end method

.method public getMediaItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media2/common/MediaItem;",
            ">;"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemList:Ljava/util/List;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 170
    iget v0, p0, Landroidx/media2/session/LibraryResult;->mResultCode:I

    return v0
.end method

.method public onPostParceling()V
    .locals 1

    .line 254
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mParcelableItem:Landroidx/media2/common/MediaItem;

    iput-object v0, p0, Landroidx/media2/session/LibraryResult;->mItem:Landroidx/media2/common/MediaItem;

    .line 255
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemListSlice:Landroidx/media2/common/ParcelImplListSlice;

    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->convertParcelImplListSliceToMediaItemList(Landroidx/media2/common/ParcelImplListSlice;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemList:Ljava/util/List;

    return-void
.end method

.method public onPreParceling(Z)V
    .locals 1

    .line 231
    iget-object p1, p0, Landroidx/media2/session/LibraryResult;->mItem:Landroidx/media2/common/MediaItem;

    if-eqz p1, :cond_1

    .line 232
    monitor-enter p1

    .line 233
    :try_start_0
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mParcelableItem:Landroidx/media2/common/MediaItem;

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItem:Landroidx/media2/common/MediaItem;

    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->upcastForPreparceling(Landroidx/media2/common/MediaItem;)Landroidx/media2/common/MediaItem;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/LibraryResult;->mParcelableItem:Landroidx/media2/common/MediaItem;

    .line 236
    :cond_0
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 238
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media2/session/LibraryResult;->mItemList:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 239
    monitor-enter p1

    .line 240
    :try_start_1
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemListSlice:Landroidx/media2/common/ParcelImplListSlice;

    if-nez v0, :cond_2

    .line 241
    iget-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemList:Ljava/util/List;

    invoke-static {v0}, Landroidx/media2/session/MediaUtils;->convertMediaItemListToParcelImplListSlice(Ljava/util/List;)Landroidx/media2/common/ParcelImplListSlice;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/LibraryResult;->mItemListSlice:Landroidx/media2/common/ParcelImplListSlice;

    .line 244
    :cond_2
    monitor-exit p1

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :cond_3
    :goto_1
    return-void
.end method
