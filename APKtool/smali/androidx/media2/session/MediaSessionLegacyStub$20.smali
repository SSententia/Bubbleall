.class Landroidx/media2/session/MediaSessionLegacyStub$20;
.super Ljava/lang/Object;
.source "MediaSessionLegacyStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionLegacyStub$SessionTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionLegacyStub;->onRemoveQueueItemAt(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionLegacyStub;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionLegacyStub;I)V
    .locals 0

    .line 501
    iput-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$20;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iput p2, p0, Landroidx/media2/session/MediaSessionLegacyStub$20;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$ControllerInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 505
    iget p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$20;->val$index:I

    if-gez p1, :cond_0

    .line 506
    const-string p1, "MediaSessionLegacyStub"

    const-string v0, "onRemoveQueueItem(): index shouldn\'t be negative"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 509
    :cond_0
    iget-object p1, p0, Landroidx/media2/session/MediaSessionLegacyStub$20;->this$0:Landroidx/media2/session/MediaSessionLegacyStub;

    iget-object p1, p1, Landroidx/media2/session/MediaSessionLegacyStub;->mSessionImpl:Landroidx/media2/session/MediaSession$MediaSessionImpl;

    iget v0, p0, Landroidx/media2/session/MediaSessionLegacyStub$20;->val$index:I

    invoke-interface {p1, v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->removePlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method
