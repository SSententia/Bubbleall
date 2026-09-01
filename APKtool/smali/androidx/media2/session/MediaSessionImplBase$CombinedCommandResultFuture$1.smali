.class Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;
.super Ljava/lang/Object;
.source "MediaSessionImplBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;-><init>(Ljava/util/concurrent/Executor;[Lcom/google/common/util/concurrent/ListenableFuture;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

.field final synthetic val$cur:I


# direct methods
.method constructor <init>(Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;I)V
    .locals 0

    .line 1636
    iput-object p1, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iput p2, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->val$cur:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1640
    :try_start_0
    iget-object v2, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v2, v2, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    iget v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->val$cur:I

    aget-object v2, v2, v3

    invoke-interface {v2}, Lcom/google/common/util/concurrent/ListenableFuture;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/BaseResult;

    .line 1641
    invoke-interface {v2}, Landroidx/media2/common/BaseResult;->getResultCode()I

    move-result v3

    if-eqz v3, :cond_2

    if-eq v3, v1, :cond_2

    move v3, v0

    .line 1644
    :goto_0
    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 1645
    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/google/common/util/concurrent/ListenableFuture;->isCancelled()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/google/common/util/concurrent/ListenableFuture;->isDone()Z

    move-result v4

    if-nez v4, :cond_0

    iget v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->val$cur:I

    if-eq v4, v3, :cond_0

    .line 1647
    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v4, v4, v3

    invoke-interface {v4, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->cancel(Z)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1650
    :cond_1
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    invoke-static {v3, v2}, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->access$000(Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;Ljava/lang/Object;)Z

    goto :goto_2

    .line 1652
    :cond_2
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mSuccessCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v3

    .line 1653
    iget-object v4, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v4, v4, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    array-length v4, v4

    if-ne v3, v4, :cond_5

    .line 1654
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    invoke-static {v3, v2}, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->access$100(Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 1658
    :goto_1
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    array-length v3, v3

    if-ge v0, v3, :cond_4

    .line 1659
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/google/common/util/concurrent/ListenableFuture;->isCancelled()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/google/common/util/concurrent/ListenableFuture;->isDone()Z

    move-result v3

    if-nez v3, :cond_3

    iget v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->val$cur:I

    if-eq v3, v0, :cond_3

    .line 1661
    iget-object v3, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    iget-object v3, v3, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->mFutures:[Lcom/google/common/util/concurrent/ListenableFuture;

    aget-object v3, v3, v0

    invoke-interface {v3, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->cancel(Z)Z

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1664
    :cond_4
    iget-object v0, p0, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture$1;->this$0:Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;

    invoke-static {v0, v2}, Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;->access$200(Landroidx/media2/session/MediaSessionImplBase$CombinedCommandResultFuture;Ljava/lang/Throwable;)Z

    :cond_5
    :goto_2
    return-void
.end method
