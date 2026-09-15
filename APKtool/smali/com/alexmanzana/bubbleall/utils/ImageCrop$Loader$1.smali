.class Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;
.super Ljava/lang/Object;
.source "ImageCrop.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;

.field final synthetic val$decoded:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;Landroid/graphics/Bitmap;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;->this$1:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;->val$decoded:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;->this$1:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;

    iget-object v0, v0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader$1;->val$decoded:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->access$200(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Landroid/graphics/Bitmap;)V

    return-void
.end method
