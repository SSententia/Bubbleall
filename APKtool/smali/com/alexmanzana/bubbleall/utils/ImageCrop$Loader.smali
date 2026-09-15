.class final Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;
.super Ljava/lang/Object;
.source "ImageCrop.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImageCrop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Loader"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;


# direct methods
.method private constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Lcom/alexmanzana/bubbleall/utils/ImageCrop$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->access$100(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->access$300(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;

    invoke-direct {v2, p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
