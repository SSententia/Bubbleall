.class Landroidx/media2/session/MediaSessionStub$22;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->replacePlaylistItem(Landroidx/media2/session/IMediaController;IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$index:I

.field final synthetic val$mediaId:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Ljava/lang/String;I)V
    .locals 0

    .line 843
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$22;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$22;->val$mediaId:Ljava/lang/String;

    iput p3, p0, Landroidx/media2/session/MediaSessionStub$22;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
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

    .line 847
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$22;->val$mediaId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    .line 848
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "replacePlaylistItem(): Ignoring empty mediaId from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 850
    invoke-static {v1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 852
    :cond_0
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$22;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$22;->val$mediaId:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, v2}, Landroidx/media2/session/MediaSessionStub;->convertMediaItemOnExecutor(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/common/MediaItem;

    move-result-object p2

    if-nez p2, :cond_1

    .line 855
    invoke-static {v1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 857
    :cond_1
    iget v0, p0, Landroidx/media2/session/MediaSessionStub$22;->val$index:I

    invoke-interface {p1, v0, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->replacePlaylistItem(ILandroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
