.class Landroidx/media2/session/MediaSessionStub$13;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->onCustomCommand(Landroidx/media2/session/IMediaController;ILandroidx/versionedparcelable/ParcelImpl;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionStub$SessionCallbackTask<",
        "Landroidx/media2/session/SessionResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$args:Landroid/os/Bundle;

.field final synthetic val$sessionCommand:Landroidx/media2/session/SessionCommand;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)V
    .locals 0

    .line 645
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$13;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$13;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$13;->val$args:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SessionResult;
    .locals 3

    .line 650
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    .line 651
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object p1

    iget-object v1, p0, Landroidx/media2/session/MediaSessionStub$13;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$13;->val$args:Landroid/os/Bundle;

    .line 650
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/media2/session/MediaSession$SessionCallback;->onCustomCommand(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;Landroidx/media2/session/SessionCommand;Landroid/os/Bundle;)Landroidx/media2/session/SessionResult;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 654
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "SessionCallback#onCustomCommand has returned null, command="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$13;->val$sessionCommand:Landroidx/media2/session/SessionCommand;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 645
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionStub$13;->run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Landroidx/media2/session/SessionResult;

    move-result-object p1

    return-object p1
.end method
