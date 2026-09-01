.class Landroidx/media2/widget/VideoView$3;
.super Ljava/lang/Object;
.source "VideoView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/widget/VideoView;->resetPlayerSurfaceWithNullAsync()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/widget/VideoView;

.field final synthetic val$future:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method constructor <init>(Landroidx/media2/widget/VideoView;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 668
    iput-object p1, p0, Landroidx/media2/widget/VideoView$3;->this$0:Landroidx/media2/widget/VideoView;

    iput-object p2, p0, Landroidx/media2/widget/VideoView$3;->val$future:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 672
    const-string v0, "VideoView"

    .line 0
    const-string v1, "calling setSurface(null) was not successful. ResultCode: "

    .line 672
    :try_start_0
    iget-object v2, p0, Landroidx/media2/widget/VideoView$3;->val$future:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v2}, Lcom/google/common/util/concurrent/ListenableFuture;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media2/common/BaseResult;

    invoke-interface {v2}, Landroidx/media2/common/BaseResult;->getResultCode()I

    move-result v2

    if-eqz v2, :cond_0

    .line 674
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 678
    :goto_0
    const-string v2, "calling setSurface(null) was not successful."

    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_1
    return-void
.end method
