.class Landroidx/media2/session/MediaSessionStub$16;
.super Ljava/lang/Object;
.source "MediaSessionStub.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionStub$SessionPlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionStub;->setPlaylist(Landroidx/media2/session/IMediaController;ILjava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionStub;

.field final synthetic val$metadata:Landroidx/versionedparcelable/ParcelImpl;

.field final synthetic val$playlist:Ljava/util/List;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionStub;Ljava/util/List;Landroidx/versionedparcelable/ParcelImpl;)V
    .locals 0

    .line 712
    iput-object p1, p0, Landroidx/media2/session/MediaSessionStub$16;->this$0:Landroidx/media2/session/MediaSessionStub;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionStub$16;->val$playlist:Ljava/util/List;

    iput-object p3, p0, Landroidx/media2/session/MediaSessionStub$16;->val$metadata:Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
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

    .line 716
    iget-object v0, p0, Landroidx/media2/session/MediaSessionStub$16;->val$playlist:Ljava/util/List;

    if-nez v0, :cond_0

    .line 717
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "setPlaylist(): Ignoring null playlist from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MediaSessionStub"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x3

    .line 718
    invoke-static {p1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 720
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 721
    :goto_0
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$16;->val$playlist:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 722
    iget-object v2, p0, Landroidx/media2/session/MediaSessionStub$16;->this$0:Landroidx/media2/session/MediaSessionStub;

    iget-object v3, p0, Landroidx/media2/session/MediaSessionStub$16;->val$playlist:Ljava/util/List;

    .line 723
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 722
    invoke-virtual {v2, p1, p2, v3}, Landroidx/media2/session/MediaSessionStub;->convertMediaItemOnExecutor(Landroidx/media2/session/MediaSession$MediaSessionImpl;Landroidx/media2/session/MediaSession$ControllerInfo;Ljava/lang/String;)Landroidx/media2/common/MediaItem;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 725
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 728
    :cond_2
    iget-object p2, p0, Landroidx/media2/session/MediaSessionStub$16;->val$metadata:Landroidx/versionedparcelable/ParcelImpl;

    .line 729
    invoke-static {p2}, Landroidx/media2/common/MediaParcelUtils;->fromParcelable(Landroidx/versionedparcelable/ParcelImpl;)Landroidx/versionedparcelable/VersionedParcelable;

    move-result-object p2

    check-cast p2, Landroidx/media2/common/MediaMetadata;

    .line 728
    invoke-interface {p1, v0, p2}, Landroidx/media2/session/MediaSession$MediaSessionImpl;->setPlaylist(Ljava/util/List;Landroidx/media2/common/MediaMetadata;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
