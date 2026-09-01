.class Landroidx/media2/session/MediaSessionStub$24;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->skipToPlaylistItem(Landroidx/media2/session/IMediaController;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;I)V
    .locals 0

    .line 884
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$24;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput p2, p0, Landroidx/media2/session/MediaSessionStub$24;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/session/MediaSession$MediaSessionImpl;",
            "Landroidx/media2/session/MediaSession$ControllerInfo;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .line 888
    iget v0, p0, Landroidx/media2/session/MediaSessionStub$24;->val$index:I

    if-gez v0, :cond_0

    .line 889
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "skipToPlaylistItem(): Ignoring negative index from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x3

    .line 891
    invoke-static {p1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 893
    :cond_0
    invoke-interface {p1, v0}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->skipToPlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
