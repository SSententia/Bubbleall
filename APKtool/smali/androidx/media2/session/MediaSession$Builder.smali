.class public final Landroidx/media2/session/MediaSession$Builder;
.super Landroidx/media2/session/MediaSession$BuilderBase;
.source "MediaSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media2/session/MediaSession$BuilderBase<",
        "Landroidx/media2/session/MediaSession;",
        "Landroidx/media2/session/MediaSession$Builder;",
        "Landroidx/media2/session/MediaSession$SessionCallback;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/media2/common/SessionPlayer;)V
    .locals 0

    .line 821
    invoke-direct {p0, p1, p2}, Landroidx/media2/session/MediaSession$BuilderBase;-><init>(Landroid/content/Context;Landroidx/media2/common/SessionPlayer;)V

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/session/MediaSession;
    .locals 9

    .line 852
    iget-object v0, p0, Landroidx/media2/session/MediaSession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    .line 853
    iget-object v0, p0, Landroidx/media2/session/MediaSession$Builder;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Landroidx/media2/session/MediaSession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 855
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    if-nez v0, :cond_1

    .line 856
    new-instance v0, Landroidx/media2/session/MediaSession$Builder$1;

    invoke-direct {v0, p0}, Landroidx/media2/session/MediaSession$Builder$1;-><init>(Landroidx/media2/session/MediaSession$Builder;)V

    iput-object v0, p0, Landroidx/media2/session/MediaSession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    .line 858
    :cond_1
    new-instance v0, Landroidx/media2/session/MediaSession;

    iget-object v2, p0, Landroidx/media2/session/MediaSession$Builder;->mContext:Landroid/content/Context;

    iget-object v3, p0, Landroidx/media2/session/MediaSession$Builder;->mId:Ljava/lang/String;

    iget-object v4, p0, Landroidx/media2/session/MediaSession$Builder;->mPlayer:Landroidx/media2/common/SessionPlayer;

    iget-object v5, p0, Landroidx/media2/session/MediaSession$Builder;->mSessionActivity:Landroid/app/PendingIntent;

    iget-object v6, p0, Landroidx/media2/session/MediaSession$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/media2/session/MediaSession$Builder;->mCallback:Landroidx/media2/session/MediaSession$SessionCallback;

    iget-object v8, p0, Landroidx/media2/session/MediaSession$Builder;->mExtras:Landroid/os/Bundle;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroidx/media2/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/media2/common/SessionPlayer;Landroid/app/PendingIntent;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$Builder;
    .locals 0

    .line 846
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaSession$Builder;

    return-object p1
.end method

.method public bridge synthetic setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 819
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSession$Builder;->setExtras(Landroid/os/Bundle;)Landroidx/media2/session/MediaSession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$Builder;
    .locals 0

    .line 833
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaSession$Builder;

    return-object p1
.end method

.method public bridge synthetic setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 819
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSession$Builder;->setId(Ljava/lang/String;)Landroidx/media2/session/MediaSession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$Builder;
    .locals 0

    .line 827
    invoke-super {p0, p1}, Landroidx/media2/session/MediaSession$BuilderBase;->setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaSession$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 819
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSession$Builder;->setSessionActivity(Landroid/app/PendingIntent;)Landroidx/media2/session/MediaSession$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;)Landroidx/media2/session/MediaSession$Builder;
    .locals 0

    .line 840
    invoke-super {p0, p1, p2}, Landroidx/media2/session/MediaSession$BuilderBase;->setSessionCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;)Landroidx/media2/session/MediaSession$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaSession$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;)Landroidx/media2/session/MediaSession$BuilderBase;
    .locals 0

    .line 819
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSession$Builder;->setSessionCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaSession$SessionCallback;)Landroidx/media2/session/MediaSession$Builder;

    move-result-object p1

    return-object p1
.end method
