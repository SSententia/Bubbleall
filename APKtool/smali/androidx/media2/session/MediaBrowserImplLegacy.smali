.class Landroidx/media2/session/MediaBrowserImplLegacy;
.super Landroidx/media2/session/MediaControllerImplLegacy;
.source "MediaBrowserImplLegacy.java"

# interfaces
.implements Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaBrowserImplLegacy$GetChildrenCallback;,
        Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;,
        Landroidx/media2/session/MediaBrowserImplLegacy$GetLibraryRootCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MB2ImplLegacy"


# instance fields
.field final mBrowserCompats:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            "Landroid/support/v4/media/MediaBrowserCompat;",
            ">;"
        }
    .end annotation
.end field

.field private final mSubscribeCallbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/media2/session/MediaBrowser;Landroidx/media2/session/SessionToken;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroidx/media2/session/MediaControllerImplLegacy;-><init>(Landroid/content/Context;Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionToken;)V

    .line 59
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mBrowserCompats:Ljava/util/HashMap;

    .line 62
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mSubscribeCallbacks:Ljava/util/HashMap;

    return-void
.end method

.method private static createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;
    .locals 1

    if-eqz p0, :cond_1

    .line 296
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_1
    return-object v0
.end method

.method private static createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;II)Landroid/os/Bundle;
    .locals 1

    .line 301
    invoke-static {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;

    move-result-object p0

    .line 302
    const-string v0, "android.media.browse.extra.PAGE"

    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 303
    const-string p1, "android.media.browse.extra.PAGE_SIZE"

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method private getBrowserCompat(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/support/v4/media/MediaBrowserCompat;
    .locals 2

    .line 290
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 291
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mBrowserCompats:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 292
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static getExtras(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;
    .locals 0

    if-eqz p0, :cond_0

    .line 308
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$LibraryParams;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 77
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 78
    :try_start_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mBrowserCompats:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat;

    .line 79
    invoke-virtual {v2}, Landroid/support/v4/media/MediaBrowserCompat;->disconnect()V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mBrowserCompats:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 83
    invoke-super {p0}, Landroidx/media2/session/MediaControllerImplLegacy;->close()V

    .line 84
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method createRootMediaItem(Landroid/support/v4/media/MediaBrowserCompat;)Landroidx/media2/common/MediaItem;
    .locals 4

    .line 314
    new-instance v0, Landroidx/media2/common/MediaMetadata$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaMetadata$Builder;-><init>()V

    const-string v1, "android.media.metadata.MEDIA_ID"

    .line 315
    invoke-virtual {p1}, Landroid/support/v4/media/MediaBrowserCompat;->getRoot()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/media2/common/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object v0

    .line 316
    const-string v1, "androidx.media2.metadata.BROWSABLE"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object v0

    const-string v1, "androidx.media2.metadata.PLAYABLE"

    .line 317
    invoke-virtual {v0, v1, v2, v3}, Landroidx/media2/common/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object v0

    .line 318
    invoke-virtual {p1}, Landroid/support/v4/media/MediaBrowserCompat;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/media2/common/MediaMetadata$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/common/MediaMetadata$Builder;

    move-result-object p1

    .line 319
    invoke-virtual {p1}, Landroidx/media2/common/MediaMetadata$Builder;->build()Landroidx/media2/common/MediaMetadata;

    move-result-object p1

    .line 320
    new-instance v0, Landroidx/media2/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media2/common/MediaItem$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/media2/common/MediaItem$Builder;->setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/media2/common/MediaItem$Builder;->build()Landroidx/media2/common/MediaItem;

    move-result-object p1

    return-object p1
.end method

.method public getChildren(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 161
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 163
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 166
    :cond_0
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 167
    invoke-static {p4, p2, p3}, Landroidx/media2/session/MediaBrowserImplLegacy;->createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;II)Landroid/os/Bundle;

    move-result-object p2

    .line 168
    new-instance p3, Landroidx/media2/session/MediaBrowserImplLegacy$GetChildrenCallback;

    invoke-direct {p3, p0, v1, p1}, Landroidx/media2/session/MediaBrowserImplLegacy$GetChildrenCallback;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/media/MediaBrowserCompat;->subscribe(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;)V

    return-object v1
.end method

.method public getItem(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 174
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 176
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 178
    :cond_0
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 179
    new-instance v2, Landroidx/media2/session/MediaBrowserImplLegacy$2;

    invoke-direct {v2, p0, v1}, Landroidx/media2/session/MediaBrowserImplLegacy$2;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;)V

    invoke-virtual {v0, p1, v2}, Landroid/support/v4/media/MediaBrowserCompat;->getItem(Ljava/lang/String;Landroid/support/v4/media/MediaBrowserCompat$ItemCallback;)V

    return-object v1
.end method

.method public getLibraryRoot(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 89
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v0

    .line 90
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 93
    new-instance p1, Landroidx/media2/session/LibraryResult;

    invoke-virtual {p0, v1}, Landroidx/media2/session/MediaBrowserImplLegacy;->createRootMediaItem(Landroid/support/v4/media/MediaBrowserCompat;)Landroidx/media2/common/MediaItem;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v3, v1, v2}, Landroidx/media2/session/LibraryResult;-><init>(ILandroidx/media2/common/MediaItem;Landroidx/media2/session/MediaLibraryService$LibraryParams;)V

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    goto :goto_0

    .line 96
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mHandler:Landroid/os/Handler;

    new-instance v2, Landroidx/media2/session/MediaBrowserImplLegacy$1;

    invoke-direct {v2, p0, p1, v0}, Landroidx/media2/session/MediaBrowserImplLegacy$1;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/media2/session/MediaLibraryService$LibraryParams;Landroidx/concurrent/futures/ResolvableFuture;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-object v0
.end method

.method getMediaBrowser()Landroidx/media2/session/MediaBrowser;
    .locals 1

    .line 72
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mInstance:Landroidx/media2/session/MediaController;

    check-cast v0, Landroidx/media2/session/MediaBrowser;

    return-object v0
.end method

.method public getSearchResult(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 255
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 257
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 260
    :cond_0
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 261
    invoke-static {p4, p2, p3}, Landroidx/media2/session/MediaBrowserImplLegacy;->createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;II)Landroid/os/Bundle;

    move-result-object p2

    .line 262
    new-instance p3, Landroidx/media2/session/MediaBrowserImplLegacy$4;

    invoke-direct {p3, p0, v1}, Landroidx/media2/session/MediaBrowserImplLegacy$4;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;)V

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/media/MediaBrowserCompat;->search(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/MediaBrowserCompat$SearchCallback;)V

    return-object v1
.end method

.method public search(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 211
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 213
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 215
    :cond_0
    invoke-static {p2}, Landroidx/media2/session/MediaBrowserImplLegacy;->getExtras(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;

    move-result-object p2

    new-instance v1, Landroidx/media2/session/MediaBrowserImplLegacy$3;

    invoke-direct {v1, p0}, Landroidx/media2/session/MediaBrowserImplLegacy$3;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;)V

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/media/MediaBrowserCompat;->search(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/MediaBrowserCompat$SearchCallback;)V

    const/4 p1, 0x0

    .line 249
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media2/session/MediaLibraryService$LibraryParams;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 118
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 120
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 122
    :cond_0
    invoke-static {}, Landroidx/concurrent/futures/ResolvableFuture;->create()Landroidx/concurrent/futures/ResolvableFuture;

    move-result-object v1

    .line 123
    new-instance v2, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;

    invoke-direct {v2, p0, v1}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;)V

    .line 124
    iget-object v3, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v3

    .line 125
    :try_start_0
    iget-object v4, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mSubscribeCallbacks:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_1

    .line 127
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 128
    iget-object v5, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mSubscribeCallbacks:Ljava/util/HashMap;

    invoke-virtual {v5, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    :cond_1
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    invoke-static {p2}, Landroidx/media2/session/MediaBrowserImplLegacy;->createOptions(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {v0, p1, p2, v2}, Landroid/support/v4/media/MediaBrowserCompat;->subscribe(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;)V

    return-object v1

    :catchall_0
    move-exception p1

    .line 131
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public unsubscribe(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    .line 138
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 p1, -0x64

    .line 140
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 144
    :cond_0
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 145
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/MediaBrowserImplLegacy;->mSubscribeCallbacks:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    const/4 p1, -0x3

    .line 147
    invoke-static {p1}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    .line 149
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 150
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;

    invoke-virtual {v0, p1, v5}, Landroid/support/v4/media/MediaBrowserCompat;->unsubscribe(Ljava/lang/String;Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 152
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    invoke-static {v3}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 152
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
