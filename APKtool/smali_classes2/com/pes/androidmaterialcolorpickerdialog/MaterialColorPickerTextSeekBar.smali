.class Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;
.super Landroidx/appcompat/widget/AppCompatSeekBar;
.source "MaterialColorPickerTextSeekBar.java"


# instance fields
.field private text:Ljava/lang/String;

.field private textColor:I

.field private textPaint:Landroid/graphics/Paint;

.field private textRect:Landroid/graphics/Rect;

.field private textSize:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 37
    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    invoke-direct {p0, p2}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-direct {p0, p2}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 4

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    const/16 v1, 0x41

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    .line 52
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/pes/androidmaterialcolorpickerdialog/R$styleable;->MaterialColorPickerTextSeekBar:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 62
    :try_start_0
    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$styleable;->MaterialColorPickerTextSeekBar_android_textColor:I

    const/high16 v1, -0x1000000

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textColor:I

    .line 67
    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$styleable;->MaterialColorPickerTextSeekBar_android_textSize:I

    .line 70
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x2

    const/high16 v3, 0x41900000    # 18.0f

    .line 69
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    .line 67
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textSize:F

    .line 73
    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$styleable;->MaterialColorPickerTextSeekBar_android_text:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->text:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 80
    throw v0

    .line 84
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 86
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textSize:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 87
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 97
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textRect:Landroid/graphics/Rect;

    const-string v2, "255"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 99
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getPaddingLeft()I

    move-result p1

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textRect:Landroid/graphics/Rect;

    .line 100
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x1

    .line 99
    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 101
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getPaddingBottom()I

    move-result v2

    .line 99
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->setPadding(IIII)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 106
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->onDraw(Landroid/graphics/Canvas;)V

    .line 108
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->text:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 109
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getProgress()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textRect:Landroid/graphics/Rect;

    .line 111
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->getPaddingTop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/MaterialColorPickerTextSeekBar;->textPaint:Landroid/graphics/Paint;

    .line 108
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method
