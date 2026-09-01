.class public final Landroidx/media2/session/MediaBrowser$Builder;
.super Landroidx/media2/session/MediaController$BuilderBase;
.source "MediaBrowser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaBrowser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media2/session/MediaController$BuilderBase<",
        "Landroidx/media2/session/MediaBrowser;",
        "Landroidx/media2/session/MediaBrowser$Builder;",
        "Landroidx/media2/session/MediaBrowser$BrowserCallback;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 309
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/session/MediaBrowser;
    .locals 13

    .line 348
    iget-object v0, p0, Landroidx/media2/session/MediaBrowser$Builder;->mToken:Landroidx/media2/session/SessionToken;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCompatToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 349
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "token and compat token shouldn\'t be both null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 351
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media2/session/MediaBrowser$Builder;->mToken:Landroidx/media2/session/SessionToken;

    if-eqz v0, :cond_2

    .line 352
    new-instance v0, Landroidx/media2/session/MediaBrowser;

    iget-object v2, p0, Landroidx/media2/session/MediaBrowser$Builder;->mContext:Landroid/content/Context;

    iget-object v3, p0, Landroidx/media2/session/MediaBrowser$Builder;->mToken:Landroidx/media2/session/SessionToken;

    iget-object v4, p0, Landroidx/media2/session/MediaBrowser$Builder;->mConnectionHints:Landroid/os/Bundle;

    iget-object v5, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCallback:Landroidx/media2/session/MediaController$ControllerCallback;

    move-object v6, v1

    check-cast v6, Landroidx/media2/session/MediaBrowser$BrowserCallback;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroidx/media2/session/MediaBrowser;-><init>(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)V

    return-object v0

    .line 355
    :cond_2
    new-instance v0, Landroidx/media2/session/MediaBrowser;

    iget-object v8, p0, Landroidx/media2/session/MediaBrowser$Builder;->mContext:Landroid/content/Context;

    iget-object v9, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCompatToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v10, p0, Landroidx/media2/session/MediaBrowser$Builder;->mConnectionHints:Landroid/os/Bundle;

    iget-object v11, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/media2/session/MediaBrowser$Builder;->mCallback:Landroidx/media2/session/MediaController$ControllerCallback;

    move-object v12, v1

    check-cast v12, Landroidx/media2/session/MediaBrowser$BrowserCallback;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Landroidx/media2/session/MediaBrowser;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)V

    return-object v0
.end method

.method public bridge synthetic build()Landroidx/media2/session/MediaController;
    .locals 1

    .line 306
    invoke-virtual {p0}, Landroidx/media2/session/MediaBrowser$Builder;->build()Landroidx/media2/session/MediaBrowser;

    move-result-object v0

    return-object v0
.end method

.method public setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaBrowser$Builder;
    .locals 0

    .line 334
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaBrowser$Builder;

    return-object p1
.end method

.method public bridge synthetic setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 306
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaBrowser$Builder;->setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaBrowser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)Landroidx/media2/session/MediaBrowser$Builder;
    .locals 0

    .line 328
    invoke-super {p0, p1, p2}, Landroidx/media2/session/MediaController$BuilderBase;->setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaBrowser$Builder;

    return-object p1
.end method

.method public bridge synthetic setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 306
    check-cast p2, Landroidx/media2/session/MediaBrowser$BrowserCallback;

    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaBrowser$Builder;->setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaBrowser$BrowserCallback;)Landroidx/media2/session/MediaBrowser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaBrowser$Builder;
    .locals 0

    .line 321
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaBrowser$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 306
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaBrowser$Builder;->setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaBrowser$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaBrowser$Builder;
    .locals 0

    .line 315
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaBrowser$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 306
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaBrowser$Builder;->setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaBrowser$Builder;

    move-result-object p1

    return-object p1
.end method
