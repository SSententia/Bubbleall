.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;
.super Ljava/lang/Object;
.source "ImagePicker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Worker"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method private constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    nop

    :goto_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$500(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/lang/Object;

    move-result-object v1

    const-wide/16 v2, 0x96

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    nop

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catch_0
    move-exception v1

    monitor-exit v0

    return-void

    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$700(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Worker;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {v3, v4, v1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;ILandroid/graphics/Bitmap;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
