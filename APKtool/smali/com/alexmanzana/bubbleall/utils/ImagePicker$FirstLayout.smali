.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;
.super Ljava/lang/Object;
.source "ImagePicker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "FirstLayout"
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1200(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$FirstLayout;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1300(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V

    return-void
.end method
