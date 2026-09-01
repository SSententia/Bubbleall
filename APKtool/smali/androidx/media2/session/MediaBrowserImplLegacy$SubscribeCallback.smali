.class Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;
.super Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;
.source "MediaBrowserImplLegacy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaBrowserImplLegacy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SubscribeCallback"
.end annotation


# instance fields
.field final mFuture:Landroidx/concurrent/futures/ResolvableFuture;
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
.method constructor <init>(Landroidx/media2/session/MediaBrowserImplLegacy;Landroidx/concurrent/futures/ResolvableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/ResolvableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;)V"
        }
    .end annotation

    .line 365
    iput-object p1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$SubscriptionCallback;-><init>()V

    .line 366
    iput-object p2, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->mFuture:Landroidx/concurrent/futures/ResolvableFuture;

    return-void
.end method

.method private onChildrenLoadedInternal(Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    .line 400
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 401
    const-string p1, "MB2ImplLegacy"

    const-string p2, "SubscribeCallback.onChildrenLoaded(): Ignoring empty parentId"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 404
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    invoke-virtual {v0}, Landroidx/media2/session/MediaBrowserImplLegacy;->getBrowserCompat()Landroid/support/v4/media/MediaBrowserCompat;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 411
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 417
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    iget-object v1, v1, Landroidx/media2/session/MediaBrowserImplLegacy;->mContext:Landroid/content/Context;

    .line 418
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->getNotifyChildrenChangedOptions()Landroid/os/Bundle;

    move-result-object v0

    .line 417
    invoke-static {v1, v0}, Landroidx/media2/session/MediaUtils;->convertToLibraryParams(Landroid/content/Context;Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$LibraryParams;

    move-result-object v0

    .line 419
    iget-object v1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->this$0:Landroidx/media2/session/MediaBrowserImplLegacy;

    invoke-virtual {v1}, Landroidx/media2/session/MediaBrowserImplLegacy;->getMediaBrowser()Landroidx/media2/session/MediaBrowser;

    move-result-object v1

    new-instance v2, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback$1;

    invoke-direct {v2, p0, p1, p2, v0}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback$1;-><init>(Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;Ljava/lang/String;ILandroidx/media2/session/MediaLibraryService$LibraryParams;)V

    invoke-virtual {v1, v2}, Landroidx/media2/session/MediaBrowser;->notifyBrowserCallback(Landroidx/media2/session/MediaBrowser$BrowserCallbackRunnable;)V

    .line 426
    iget-object p1, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->mFuture:Landroidx/concurrent/futures/ResolvableFuture;

    new-instance p2, Landroidx/media2/session/LibraryResult;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method private onErrorInternal()V
    .locals 3

    .line 395
    iget-object v0, p0, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->mFuture:Landroidx/concurrent/futures/ResolvableFuture;

    new-instance v1, Landroidx/media2/session/LibraryResult;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroidx/media2/session/LibraryResult;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/ResolvableFuture;->set(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public onChildrenLoaded(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    .line 382
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->onChildrenLoadedInternal(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public onChildrenLoaded(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 389
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->onChildrenLoadedInternal(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->onErrorInternal()V

    return-void
.end method

.method public onError(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 376
    invoke-direct {p0}, Landroidx/media2/session/MediaBrowserImplLegacy$SubscribeCallback;->onErrorInternal()V

    return-void
.end method
