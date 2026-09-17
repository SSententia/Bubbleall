.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;
.super Ljava/lang/Object;
.source "ImagePicker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Click"
.end annotation


# instance fields
.field private final confirm:Z

.field private final index:I

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->confirm:Z

    iput p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->index:I

    return-void
.end method

.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Z)V
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->confirm:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->index:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->index:I

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->index:I

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1900(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V

    return-void

    :cond_0
    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->confirm:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$2000(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Ljava/util/List;)V

    :goto_0
    return-void
.end method
