.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;
.super Landroid/widget/FrameLayout;
.source "ImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Root"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Landroid/content/Context;)V
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/high16 p1, -0x34000000    # -3.3554432E7f

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->setBackgroundColor(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->setFocusable(Z)V

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->setFocusableInTouchMode(Z)V

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Root;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1400(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Ljava/util/List;)V

    :cond_0
    return v0

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
