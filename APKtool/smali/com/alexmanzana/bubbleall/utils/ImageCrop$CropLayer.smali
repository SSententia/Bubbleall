.class final Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;
.super Landroid/view/View;
.source "ImageCrop.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImageCrop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CropLayer"
.end annotation


# static fields
.field private static final CORNER_BL:I = 0x8

.field private static final CORNER_BR:I = 0x9

.field private static final CORNER_TL:I = 0x6

.field private static final CORNER_TR:I = 0x7

.field private static final EDGE_B:I = 0x5

.field private static final EDGE_L:I = 0x2

.field private static final EDGE_R:I = 0x3

.field private static final EDGE_T:I = 0x4

.field private static final FRAME_START:F = 0.72f

.field private static final FRAME_TOP:F = 0.2f

.field private static final MIN_SIZE:F = 0.05f

.field private static final MOVE:I = 0x1

.field private static final NONE:I = 0x0

.field private static final SHADE:F = 0.6f


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private bottom:F

.field private chromeAlpha:F

.field private drag:I

.field private final frame:Landroid/graphics/RectF;

.field private final handle:Landroid/graphics/Paint;

.field private final handleRadius:F

.field private final imageRect:Landroid/graphics/RectF;

.field private lastX:F

.field private lastY:F

.field private left:F

.field private panX:F

.field private panY:F

.field private panning:Z

.field private right:F

.field private final shade:Landroid/graphics/Paint;

.field private final slop:F

.field private final stroke:Landroid/graphics/Paint;

.field private top:F


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->chromeAlpha:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x41b00000    # 22.0f

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr p1, v1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->applyChromeAlpha()V

    return-void
.end method

.method private applyChromeAlpha()V
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->chromeAlpha:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->chromeAlpha:F

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    const/high16 v1, 0x43190000    # 153.0f

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->chromeAlpha:F

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method private applyDrag(FF)V
    .locals 5

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const v3, 0x3d4ccccd    # 0.05f

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    add-float/2addr v0, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr p1, v3

    invoke-static {v0, p1, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p2, v3

    invoke-static {p1, p2, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    goto/16 :goto_0

    :pswitch_1
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr v0, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    sub-float/2addr p1, v3

    invoke-static {v0, v2, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p2, v3

    invoke-static {p1, p2, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    goto/16 :goto_0

    :pswitch_2
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    add-float/2addr v0, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr p1, v3

    invoke-static {v0, p1, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    sub-float/2addr p2, v3

    invoke-static {p1, v2, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    goto/16 :goto_0

    :pswitch_3
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr v0, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    sub-float/2addr p1, v3

    invoke-static {v0, v2, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    sub-float/2addr p2, v3

    invoke-static {p1, v2, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    goto :goto_0

    :pswitch_4
    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p2, v3

    invoke-static {p1, p2, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    goto :goto_0

    :pswitch_5
    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p1, p2

    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    sub-float/2addr p2, v3

    invoke-static {p1, v2, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    goto :goto_0

    :pswitch_6
    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    add-float/2addr p2, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr p1, v3

    invoke-static {p2, p1, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    goto :goto_0

    :pswitch_7
    iget p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr p2, p1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    sub-float/2addr p1, v3

    invoke-static {p2, v2, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    goto :goto_0

    :pswitch_8
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    sub-float/2addr v0, v3

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr v4, p1

    sub-float p1, v1, v0

    invoke-static {v4, v2, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p1, p2

    sub-float/2addr v1, v3

    invoke-static {p1, v2, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    add-float/2addr p1, v0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    add-float/2addr p1, v3

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    nop

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static clamp(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    move p0, p2

    :cond_1
    return p0
.end method

.method private static clampFloat(FFF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    return p1

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    move p0, p2

    :cond_1
    return p0
.end method

.method private static clampPan(FFF)F
    .locals 1

    cmpg-float v0, p2, p1

    if-gtz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sub-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p2, p1

    neg-float p1, p2

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampFloat(FFF)F

    move-result p0

    return p0
.end method

.method private handleAt(FF)I
    .locals 9

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    cmpg-float v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gtz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    sub-float v3, p1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    sub-float v4, p2, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_2

    move v4, v1

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    sub-float v5, p2, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    iget v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    cmpg-float v5, v5, v6

    if-gtz v5, :cond_3

    move v5, v1

    goto :goto_3

    :cond_3
    move v5, v2

    :goto_3
    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->left:F

    iget v7, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    sub-float/2addr v6, v7

    cmpl-float v6, p1, v6

    if-ltz v6, :cond_4

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->right:F

    iget v7, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    add-float/2addr v6, v7

    cmpg-float v6, p1, v6

    if-gtz v6, :cond_4

    move v6, v1

    goto :goto_4

    :cond_4
    move v6, v2

    :goto_4
    iget-object v7, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->top:F

    iget v8, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    sub-float/2addr v7, v8

    cmpl-float v7, p2, v7

    if-ltz v7, :cond_5

    iget-object v7, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    iget v8, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->slop:F

    add-float/2addr v7, v8

    cmpg-float v7, p2, v7

    if-gtz v7, :cond_5

    goto :goto_5

    :cond_5
    move v1, v2

    :goto_5
    if-eqz v0, :cond_6

    if-eqz v4, :cond_6

    const/4 p1, 0x6

    return p1

    :cond_6
    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    const/4 p1, 0x7

    return p1

    :cond_7
    if-eqz v0, :cond_8

    if-eqz v5, :cond_8

    const/16 p1, 0x8

    return p1

    :cond_8
    if-eqz v3, :cond_9

    if-eqz v5, :cond_9

    const/16 p1, 0x9

    return p1

    :cond_9
    if-eqz v0, :cond_a

    if-eqz v1, :cond_a

    const/4 p1, 0x2

    return p1

    :cond_a
    if-eqz v3, :cond_b

    if-eqz v1, :cond_b

    const/4 p1, 0x3

    return p1

    :cond_b
    if-eqz v4, :cond_c

    if-eqz v6, :cond_c

    const/4 p1, 0x4

    return p1

    :cond_c
    if-eqz v5, :cond_d

    if-eqz v6, :cond_d

    const/4 p1, 0x5

    return p1

    :cond_d
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    return p1
.end method

.method private layoutImage(II)V
    .locals 4

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    if-lez p1, :cond_1

    if-gtz p2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float v1, p1, v1

    int-to-float p2, p2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v2, p2, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    const v3, 0x3f8ccccd    # 1.1f

    mul-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v1

    mul-float/2addr v0, v3

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    invoke-static {v1, p1, v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampPan(FFF)F

    move-result v1

    iput v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    invoke-static {v1, p2, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clampPan(FFF)F

    move-result v1

    iput v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    sub-float/2addr p1, v2

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    add-float/2addr p1, v3

    sub-float/2addr p2, v0

    div-float/2addr p2, v1

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    add-float/2addr p2, v1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    add-float/2addr v2, p1

    add-float/2addr v0, p2

    invoke-virtual {v1, p1, p2, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    return-void
.end method

.method private static startFrame(Landroid/graphics/Bitmap;)[F
    .locals 5

    const/4 v0, 0x4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3f3851ec    # 0.72f

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v1, v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v1, p0

    const/high16 p0, 0x3f800000    # 1.0f

    sub-float v3, p0, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr p0, v1

    const/4 v4, 0x0

    invoke-static {v4, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    const v4, 0x3e4ccccd    # 0.2f

    invoke-static {v4, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    add-float/2addr v2, v3

    add-float/2addr v1, p0

    new-array v0, v0, [F

    const/4 v4, 0x0

    aput v3, v0, v4

    const/4 v3, 0x1

    aput p0, v0, v3

    const/4 p0, 0x2

    aput v2, v0, p0

    const/4 p0, 0x3

    aput v1, v0, p0

    return-object v0

    :cond_1
    :goto_0
    new-array p0, v0, [F

    fill-array-data p0, :array_0

    return-object p0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private updateFrame()V
    .locals 7

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method


# virtual methods
.method cropPixels()Landroid/graphics/Rect;
    .locals 7

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    return-object v0

    :cond_0
    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clamp(III)I

    move-result v1

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-static {v2, v4, v5}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clamp(III)I

    move-result v2

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    sub-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-static {v4, v3, v5}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clamp(III)I

    move-result v4

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    iget v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    sub-float/2addr v5, v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-static {v5, v3, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->clamp(III)I

    move-result v0

    new-instance v3, Landroid/graphics/Rect;

    add-int/2addr v4, v1

    add-int/2addr v0, v2

    invoke-direct {v3, v1, v2, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v3
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getHeight()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->layoutImage(II)V

    :cond_1
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->updateFrame()V

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getWidth()I

    move-result v0

    int-to-float v4, v0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v5, v0, Landroid/graphics/RectF;->top:F

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getHeight()I

    move-result v0

    int-to-float v5, v0

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v4, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getWidth()I

    move-result v0

    int-to-float v4, v0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->shade:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->stroke:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v5, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->frame:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleRadius:F

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handle:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-direct {p0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->layoutImage(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    return v1

    :pswitch_0
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panning:Z

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastX:F

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastY:F

    sub-float/2addr v1, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastY:F

    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panning:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    add-float/2addr p1, v0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    add-float/2addr p1, v1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->getHeight()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->layoutImage(II)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr v0, p1

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->imageRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr v1, p1

    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->applyDrag(FF)V

    :goto_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->invalidate()V

    return v2

    :pswitch_1
    iput v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    iput-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panning:Z

    return v2

    :pswitch_2
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->updateFrame()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->handleAt(FF)I

    move-result v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->drag:I

    if-nez v0, :cond_3

    move v1, v2

    :cond_3
    iput-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panning:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->lastY:F

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method setBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->startFrame(Landroid/graphics/Bitmap;)[F

    move-result-object p1

    const/4 v0, 0x0

    aget v0, p1, v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->left:F

    const/4 v0, 0x1

    aget v0, p1, v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->top:F

    const/4 v0, 0x2

    aget v0, p1, v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->right:F

    const/4 v0, 0x3

    aget p1, p1, v0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->bottom:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panX:F

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->panY:F

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->requestLayout()V

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->invalidate()V

    return-void
.end method

.method setChromeAlpha(F)V
    .locals 0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->chromeAlpha:F

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->applyChromeAlpha()V

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->invalidate()V

    return-void
.end method
