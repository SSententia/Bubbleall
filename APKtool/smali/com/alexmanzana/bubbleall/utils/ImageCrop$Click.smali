.class final Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;
.super Ljava/lang/Object;
.source "ImageCrop.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImageCrop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Click"
.end annotation


# instance fields
.field private final confirm:Z

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;->confirm:Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;->confirm:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->access$400(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->access$500(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Landroid/net/Uri;)V

    :goto_0
    return-void
.end method
