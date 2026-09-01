.class Landroidx/media2/session/MediaSessionStub$18;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->setMediaUri(Landroidx/media2/session/IMediaController;ILandroid/net/Uri;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionStub$SessionCallbackTask<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$extras:Landroid/os/Bundle;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0

    .line 765
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$18;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$18;->val$uri:Landroid/net/Uri;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$18;->val$extras:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;
    .locals 3

    .line 768
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$18;->val$uri:Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 769
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "setMediaUri(): Ignoring null uri from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x3

    .line 770
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 772
    :cond_0
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    .line 773
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object p1

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$18;->val$uri:Landroid/net/Uri;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$18;->val$extras:Landroid/os/Bundle;

    .line 772
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/media2/session/MediaSession$SessionCallback;->onSetMediaUri(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroid/net/Uri;Landroid/os/Bundle;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 765
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionStub$18;->run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
