.class public Landroidx/media2/session/MediaBrowser;
.super Landroidx/media2/session/MediaController;
.source "MediaBrowser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;,
        Landroidx/media2/session/MediaBrowser$Builder;,
        Landroidx/media2/session/MediaBrowser$BrowserCallbackRunnable;,
        Landroidx/media2/session/MediaBrowser$BrowserCallback;
    }
.end annotation


# static fields
.field static final DEBUG:Z

.field static final TAG:Ljava/lang/String; = "MediaBrowser"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    const-string v0, "MediaBrowser"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media2/session/MediaBrowser;->DEBUG:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)V
    .locals 0

    .line 94
    invoke-direct/range {p0 .. p5}, Landroidx/media2/session/MediaController;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)V
    .locals 0

    .line 88
    invoke-direct/range {p0 .. p5}, Landroidx/media2/session/MediaController;-><init>(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)V

    return-void
.end method

.method private static createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/session/LibraryResult;",
            ">;"
        }
    .end annotation

    const/16 v0, -0x64

    .line 362
    invoke-static {v0}, Landroidx/media2/session/LibraryResult;->createFutureWithResult(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method createImpl(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;)Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;
    .locals 1

    .line 100
    invoke-virtual {p2}, Landroidx/media2/session/SessionToken;->isLegacySession()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    new-instance p3, Landroidx/media2/session/MediaBrowserImplLegacy;

    invoke-direct {p3, p1, p0, p2}, Landroidx/media2/session/MediaBrowserImplLegacy;-><init>(Landroid/content/Context;Landroidx/media2/session/MediaBrowser;Landroidx/media2/session/SessionToken;)V

    return-object p3

    .line 103
    :cond_0
    new-instance v0, Landroidx/media2/session/MediaBrowserImplBase;

    invoke-direct {v0, p1, p0, p2, p3}, Landroidx/media2/session/MediaBrowserImplBase;-><init>(Landroid/content/Context;Landroidx/media2/session/MediaController;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;)V

    return-object v0
.end method

.method bridge synthetic createImpl(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;)Landroidx/media2/session/MediaController$MediaControllerImpl;
    .locals 0

    .line 37
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media2/session/MediaBrowser;->createImpl(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;)Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object p1

    return-object p1
.end method

.method public getChildren(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 187
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-ltz p2, :cond_2

    const/4 v0, 0x1

    if-lt p3, v0, :cond_1

    .line 196
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->getChildren(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 199
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 194
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "pageSize shouldn\'t be less than 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 191
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "page shouldn\'t be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 188
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "parentId shouldn\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;
    .locals 1

    .line 109
    invoke-super {p0}, Landroidx/media2/session/MediaController;->getImpl()Landroidx/media2/session/MediaController$MediaControllerImpl;

    move-result-object v0

    check-cast v0, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    return-object v0
.end method

.method bridge synthetic getImpl()Landroidx/media2/session/MediaController$MediaControllerImpl;
    .locals 1

    .line 37
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    return-object v0
.end method

.method public getItem(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 213
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 216
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->getItem(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 219
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 214
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mediaId shouldn\'t be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLibraryRoot(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 123
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->getLibraryRoot(Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 126
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public getSearchResult(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 265
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-ltz p2, :cond_2

    const/4 v0, 0x1

    if-lt p3, v0, :cond_1

    .line 274
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->getSearchResult(Ljava/lang/String;IILandroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 277
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 272
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "pageSize shouldn\'t be less than 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 269
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "page shouldn\'t be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 266
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "query shouldn\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method notifyBrowserCallback(Landroidx/media2/session/MediaBrowser$BrowserCallbackRunnable;)V
    .locals 2

    .line 281
    iget-object v0, p0, Landroidx/media2/session/MediaBrowser;->mPrimaryCallback:Landroidx/media2/session/MediaController$ControllerCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media2/session/MediaBrowser;->mPrimaryCallbackExecutor:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Landroidx/media2/session/MediaBrowser;->mPrimaryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/media2/session/MediaBrowser$1;

    invoke-direct {v1, p0, p1}, Landroidx/media2/session/MediaBrowser$1;-><init>(Landroidx/media2/session/MediaBrowser;Landroidx/media2/session/MediaBrowser$BrowserCallbackRunnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public search(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 239
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 242
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->search(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 245
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 240
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "query shouldn\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public subscribe(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 142
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->subscribe(Ljava/lang/String;Landroidx/media2/session/MediaLibraryService$LibraryParams;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 148
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 143
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "parentId shouldn\'t be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public unsubscribe(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 162
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser;->getImpl()Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/media2/session/MediaBrowser$MediaBrowserImpl;->unsubscribe(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 168
    :cond_0
    invoke-static {}, Landroidx/media2/session/MediaBrowser;->createDisconnectedFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 163
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "parentId shouldn\'t be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
