.class Landroidx/media2/session/MediaSessionStub$11;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionCallbackTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->skipBackward(Landroidx/media2/session/IMediaController;I)V
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


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;)V
    .locals 0

    .line 614
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$11;->this$0:Landroidx/media2/session/MediaSessionStub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;
    .locals 1

    .line 617
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getCallback()Landroidx/media2/session/MediaSession$SessionCallback;

    move-result-object v0

    .line 618
    invoke-interface {p1}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->getInstance()Landroidx/media2/session/MediaSession;

    move-result-object p1

    .line 617
    invoke-virtual {v0, p1, p2}, Landroidx/media2/session/MediaSession$SessionCallback;->onSkipBackward(Landroidx/media2/session/MediaSession;Landroidx/media2/session/MediaSession$ControllerInfo;)I

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

    .line 614
    invoke-virtual {p0, p1, p2}, Landroidx/media2/session/MediaSessionStub$11;->run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
