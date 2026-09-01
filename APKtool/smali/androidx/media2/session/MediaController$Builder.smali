.class public final Landroidx/media2/session/MediaController$Builder;
.super Landroidx/media2/session/MediaController$BuilderBase;
.source "MediaController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/session/MediaController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media2/session/MediaController$BuilderBase<",
        "Landroidx/media2/session/MediaController;",
        "Landroidx/media2/session/MediaController$Builder;",
        "Landroidx/media2/session/MediaController$ControllerCallback;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1617
    invoke-direct {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/session/MediaController;
    .locals 13

    .line 1655
    iget-object v0, p0, Landroidx/media2/session/MediaController$Builder;->mToken:Landroidx/media2/session/SessionToken;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/media2/session/MediaController$Builder;->mCompatToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1656
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "token and compat token shouldn\'t be both null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1658
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media2/session/MediaController$Builder;->mToken:Landroidx/media2/session/SessionToken;

    if-eqz v0, :cond_2

    .line 1659
    new-instance v0, Landroidx/media2/session/MediaController;

    iget-object v2, p0, Landroidx/media2/session/MediaController$Builder;->mContext:Landroid/content/Context;

    iget-object v3, p0, Landroidx/media2/session/MediaController$Builder;->mToken:Landroidx/media2/session/SessionToken;

    iget-object v4, p0, Landroidx/media2/session/MediaController$Builder;->mConnectionHints:Landroid/os/Bundle;

    iget-object v5, p0, Landroidx/media2/session/MediaController$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v6, p0, Landroidx/media2/session/MediaController$Builder;->mCallback:Landroidx/media2/session/MediaController$ControllerCallback;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroidx/media2/session/MediaController;-><init>(Landroid/content/Context;Landroidx/media2/session/SessionToken;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)V

    return-object v0

    .line 1662
    :cond_2
    new-instance v0, Landroidx/media2/session/MediaController;

    iget-object v8, p0, Landroidx/media2/session/MediaController$Builder;->mContext:Landroid/content/Context;

    iget-object v9, p0, Landroidx/media2/session/MediaController$Builder;->mCompatToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v10, p0, Landroidx/media2/session/MediaController$Builder;->mConnectionHints:Landroid/os/Bundle;

    iget-object v11, p0, Landroidx/media2/session/MediaController$Builder;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v12, p0, Landroidx/media2/session/MediaController$Builder;->mCallback:Landroidx/media2/session/MediaController$ControllerCallback;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Landroidx/media2/session/MediaController;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)V

    return-object v0
.end method

.method public setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$Builder;
    .locals 0

    .line 1635
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaController$Builder;

    return-object p1
.end method

.method public bridge synthetic setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 1614
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaController$Builder;->setConnectionHints(Landroid/os/Bundle;)Landroidx/media2/session/MediaController$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$Builder;
    .locals 0

    .line 1642
    invoke-super {p0, p1, p2}, Landroidx/media2/session/MediaController$BuilderBase;->setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaController$Builder;

    return-object p1
.end method

.method public bridge synthetic setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 1614
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaController$Builder;->setControllerCallback(Ljava/util/concurrent/Executor;Landroidx/media2/session/MediaController$ControllerCallback;)Landroidx/media2/session/MediaController$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$Builder;
    .locals 0

    .line 1629
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaController$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 1614
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaController$Builder;->setSessionCompatToken(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Landroidx/media2/session/MediaController$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$Builder;
    .locals 0

    .line 1623
    invoke-super {p0, p1}, Landroidx/media2/session/MediaController$BuilderBase;->setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$BuilderBase;

    move-result-object p1

    check-cast p1, Landroidx/media2/session/MediaController$Builder;

    return-object p1
.end method

.method public bridge synthetic setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$BuilderBase;
    .locals 0

    .line 1614
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaController$Builder;->setSessionToken(Landroidx/media2/session/SessionToken;)Landroidx/media2/session/MediaController$Builder;

    move-result-object p1

    return-object p1
.end method
