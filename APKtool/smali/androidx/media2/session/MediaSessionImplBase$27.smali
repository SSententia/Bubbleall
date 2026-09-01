.class Landroidx/media2/session/MediaSessionImplBase$27;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$PlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->movePlaylistItem(II)Lcom/google/common/util/concurrent/ListenableFuture;
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

.field final synthetic val$fromIndex:I

.field final synthetic val$toIndex:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;II)V
    .locals 0

    .line 713
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$27;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    iput p2, p0, Landroidx/media2/session/MediaSessionImplBase$27;->val$fromIndex:I

    iput p3, p0, Landroidx/media2/session/MediaSessionImplBase$27;->val$toIndex:I

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

    .line 717
    iget v0, p0, Landroidx/media2/session/MediaSessionImplBase$27;->val$fromIndex:I

    iget v1, p0, Landroidx/media2/session/MediaSessionImplBase$27;->val$toIndex:I

    invoke-virtual {p1, v0, v1}, Landroidx/media2/common/SessionPlayer;->movePlaylistItem(II)Lcom/google/common/util/concurrent/ListenableFuture;

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

    .line 713
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase$27;->run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
