.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;
.super Landroid/widget/ScrollView;
.source "ImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "PickerScroll"
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$PickerScroll;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    return-void
.end method
