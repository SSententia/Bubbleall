.class public final Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;
.super Landroidx/media2/session/MediaSession$BuilderBase;
.source "MediaLibraryService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media2/session/MediaSession$BuilderBase<",
        "Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;",
        "Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;",
        "Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private mThrowsWhenInvalidReturn:Z


# direct methods
.method public constructor <init>(Landroidx/media2/session/MediaLibraryService;Landroidx/media2/common/SessionPlayer;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$MediaLibrarySessionCallback;)V
    .locals 0

    .line 313
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaSession$BuilderBase;-><init>(Landroid/content/Context;Landroidx/media2/common/SessionPlayer;)V

    const/4 p1, 0x1

    .line 303
    iput-boolean p1, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mThrowsWhenInvalidReturn:Z

    .line 314
    invoke-virtual {p0, p3, p4}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->setSessionCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;)Landroidx/media2/session/MediaSession$BuilderBase;

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;
    .locals 10

    .line 351
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    .line 352
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 354
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    if-nez v0, :cond_1

    .line 355
    new-instance v0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder$1;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder$1;-><init>(Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;)V

    iput-object v0, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    .line 357
    :cond_1
    new-instance v0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;

    iget-object v2, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mContext:Landroid/content/Context;

    iget-object v3, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mId:Ljava/lang/String;

    iget-object v4, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mPlayer:Landroidx/media2/common/SessionPlayer;

    iget-object v5, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mSessionActivity:Landroid/app/PendingIntent;

    iget-object v6, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    iget-object v8, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mExtras:Landroid/os/Bundle;

    iget-boolean v9, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mThrowsWhenInvalidReturn:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;Z)V

    return-object v0
.end method

.method public bridge synthetic build()Landroidx/media2/session/MediaSession;
    .locals 1

    .line 301
    invoke-virtual {p0}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->build()Landroidx/media2/session/MediaLibraryService$MediaLibrarySession;

    move-result-object v0

    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;
    .locals 0

    .line 332
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    return-object p1
.end method

.method public bridge synthetic setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 301
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setId(Ljava/lang/String;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;
    .locals 0

    .line 326
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    return-object p1
.end method

.method public bridge synthetic setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 301
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->setId(Ljava/lang/String;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;
    .locals 0

    .line 320
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 301
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setThrowsWhenInvalidReturn(Z)Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;
    .locals 0

    .line 344
    iput-boolean p1, p0, Landroidx/media2/session/MediaLibraryService$MediaLibrarySession$Builder;->mThrowsWhenInvalidReturn:Z

    return-object p0
.end method
