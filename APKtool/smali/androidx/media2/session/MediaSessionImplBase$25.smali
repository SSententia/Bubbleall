.class Landroidx/media2/session/MediaSessionImplBase$25;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$PlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->removePlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media2/session/MediaSessionImplBase$PlayerTask<",
        "Lcom/google/common/util/concurrent/ListenableFuture<",
        "Landroidx/media2/common/SessionPlayer$PlayerResult;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionImplBase;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;I)V
    .locals 0

    .line 676
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$25;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    iput p2, p0, Landroidx/media2/session/MediaSessionImplBase$25;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media2/common/SessionPlayer;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/media2/common/SessionPlayer$PlayerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 680
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getPlaylist()Ljava/util/List;

    move-result-object v0

    .line 681
    iget v1, p0, Landroidx/media2/session/MediaSessionImplBase$25;->val$index:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    const/4 p1, -0x3

    .line 682
    invoke-static {p1}, Landroidx/media2/common/SessionPlayer$PlayerResult;->createFuture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 684
    :cond_0
    iget v0, p0, Landroidx/media2/session/MediaSessionImplBase$25;->val$index:I

    invoke-virtual {p1, v0}, Landroidx/media2/common/SessionPlayer;->removePlaylistItem(I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic run(Landroidx/media2/common/SessionPlayer;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 676
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase$25;->run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
