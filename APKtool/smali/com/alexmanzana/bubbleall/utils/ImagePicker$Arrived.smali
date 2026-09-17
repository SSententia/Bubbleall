.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;
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
    name = "Arrived"
.end annotation


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final index:I

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;ILandroid/graphics/Bitmap;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[I

    move-result-object v1

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    const/4 v3, 0x3

    aput v3, v1, v2

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$900(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[Z

    move-result-object v1

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    aget-boolean v1, v1, v3

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[I

    move-result-object v1

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    aget v1, v1, v3

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    if-eqz v3, :cond_3

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[I

    move-result-object v1

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    const/4 v4, 0x2

    aput v4, v1, v2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1000(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[Landroid/graphics/Bitmap;

    move-result-object v1

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    aput-object v4, v1, v2

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)[I

    move-result-object v1

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    aput v2, v1, v4

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_4

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->index:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;

    iget-object v0, v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Arrived;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_5
    :goto_2
    return-void

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
