.class Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;
.super Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;
.source "MediaBrowserImplLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaBrowserImplLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetLibraryRootCallback"
.end annotation


# instance fields
.field final mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

.field final mResult:Landroidx/concurrent/futures/ResolvableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/media2/session/MediaBrowserImplLegacy;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")V"
        }
    .end annotation

    .line 327
    iput-object p1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    .line 328
    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;-><init>()V

    .line 329
    iput-object p2, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mResult:Landroidx/concurrent/futures/ResolvableFuture;

    .line 330
    iput-object p3, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 5

    .line 336
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    iget-object v0, v0, Landroidx/media2/session/MediaBrowserImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 337
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    iget-object v1, v1, Landroidx/media2/session/MediaBrowserImplLegacy;->mBrowserCompats:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mParams:Landroidx/media2/session/MediaLibraryService$LibraryParams;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat;

    .line 338
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 341
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mResult:Landroidx/concurrent/futures/ResolvableFuture;

    new-instance v1, Landroidx/media2/session/LibraryResult;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    goto :goto_0

    .line 343
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mResult:Landroidx/concurrent/futures/ResolvableFuture;

    new-instance v2, Landroidx/media2/session/LibraryResult;

    iget-object v3, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    .line 344
    invoke-virtual {v3, v1}, Landroidx/media2/session/MediaBrowserImplLegacy;->createRootMediaItem(Landroid/support/v4/media/MediaBrowserCompat;)Landroidx/media2/common/MediaItem;

    move-result-object v3

    iget-object v4, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    iget-object v4, v4, Landroidx/media2/session/MediaBrowserImplLegacy;->mContext:Landroid/content/Context;

    .line 345
    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v4, v1}, Landroidx/media2/session/MediaUtils;->convertToLibraryParams(Landroid/content/Context;Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object v1

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3, v1}, Landroidx/media2/session/LibraryResult;-><init>(ILandroidx/media2/common/MediaItem;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V

    .line 343
    invoke-virtual {v0, v2}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 338
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public onConnectionFailed()V
    .locals 3

    .line 357
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->mResult:Landroidx/concurrent/futures/ResolvableFuture;

    new-instance v1, Landroidx/media2/session/LibraryResult;

    const/4 v2, -0x3

    invoke-direct {v1, v2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    .line 358
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaBrowserImplLegacy;->close()V

    return-void
.end method

.method public onConnectionSuspended()V
    .locals 0

    .line 351
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;->onConnectionFailed()V

    return-void
.end method
