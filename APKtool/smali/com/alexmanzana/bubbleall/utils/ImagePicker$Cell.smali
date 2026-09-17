.class final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;
.super Landroid/widget/FrameLayout;
.source "ImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Cell"
.end annotation


# instance fields
.field private final badge:Landroid/widget/TextView;

.field final image:Landroid/widget/ImageView;

.field final index:I

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V
    .locals 6
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1500(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->index:I

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v1

    invoke-virtual {p0, v1, v1, v1, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->setPadding(IIII)V

    new-instance v1, Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1500(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    const v2, -0xdcd5cd

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->image:Landroid/widget/ImageView;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, ""

    const/high16 v3, 0x41300000    # 11.0f

    invoke-static {p1, v1, v3, v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1700(Lcom/alexmanzana/bubbleall/utils/ImagePicker;Ljava/lang/String;FI)Landroid/widget/TextView;

    move-result-object v1

    iput-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    const/16 v3, 0x11

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v3, -0xc27403

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const/16 v1, 0x14

    invoke-static {p1, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v1

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const v5, 0x800035

    invoke-direct {v4, v1, v1, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v1

    iput v1, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v0

    iput v0, v4, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    invoke-virtual {p0, v0, v4}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {p1, v2, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1800(Lcom/alexmanzana/bubbleall/utils/ImagePicker;II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;

    invoke-direct {v0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Click;-><init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method showSelected(I)V
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    const/16 v3, 0x8

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->badge:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v0, -0xdcd5cd

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0, v3}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$1600(Lcom/alexmanzana/bubbleall/utils/ImagePicker;I)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const v1, -0xc27403

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Cell;->invalidate()V

    return-void
.end method
