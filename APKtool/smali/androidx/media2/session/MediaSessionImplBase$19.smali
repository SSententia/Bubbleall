.class Landroidx/media2/session/MediaSessionImplBase$19;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$PlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->setMediaItem(Landroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;
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

.field final synthetic val$item:Landroidx/media2/common/MediaItem;


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;Landroidx/media2/common/MediaItem;)V
    .locals 0

    .line 594
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$19;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    iput-object p2, p0, Landroidx/media2/session/MediaSessionImplBase$19;->val$item:Landroidx/media2/common/MediaItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
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

    .line 598
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase$19;->val$item:Landroidx/media2/common/MediaItem;

    invoke-virtual {p1, v0}, Landroidx/media2/common/SessionPlayer;->setMediaItem(Landroidx/media2/common/MediaItem;)Lcom/google/common/util/concurrent/ListenableFuture;

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

    .line 594
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase$19;->run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
