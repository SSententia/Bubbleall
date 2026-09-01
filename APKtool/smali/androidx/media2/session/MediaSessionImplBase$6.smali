.class Landroidx/media2/session/MediaSessionImplBase$6;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Landroidx/media2/session/MediaSessionImplBase$PlayerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase;->play()Lcom/google/common/util/concurrent/ListenableFuture;
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


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase;)V
    .locals 0

    .line 427
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$6;->this$0:Landroidx/media2/session/MediaSessionImplBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
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

    .line 431
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->getPlayerState()I

    move-result v0

    if-eqz v0, :cond_0

    .line 432
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->play()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 434
    :cond_0
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->prepare()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    .line 435
    invoke-virtual {p1}, Landroidx/media2/common/SessionPlayer;->play()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 440
    :cond_1
    sget-object v1, Landroidx/media2/session/MediaUtils;->DIRECT_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v1, v2}, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->create(Ljava/util/concurrent/Executor;[Lcom/google/common/util/concurrent/ListenableFuture;)Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic run(Landroidx/media2/common/SessionPlayer;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 427
    invoke-virtual {p0, p1}, Landroidx/media2/session/MediaSessionImplBase$6;->run(Landroidx/media2/common/SessionPlayer;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
