.class public Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;
.super Landroid/app/Dialog;
.source "ColorPicker.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private alpha:I

.field private alphaSeekBar:Landroid/widget/SeekBar;

.field private autoclose:Z

.field private blue:I

.field private blueSeekBar:Landroid/widget/SeekBar;

.field private callback:Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

.field private colorView:Landroid/view/View;

.field private green:I

.field private greenSeekBar:Landroid/widget/SeekBar;

.field private hexCode:Landroid/widget/EditText;

.field private red:I

.field private redSeekBar:Landroid/widget/SeekBar;

.field private withAlpha:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 52
    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->activity:Landroid/app/Activity;

    .line 54
    instance-of v0, p1, Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

    if-eqz v0, :cond_0

    .line 55
    check-cast p1, Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->callback:Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

    :cond_0
    const/16 p1, 0xff

    .line 58
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    const/4 p1, 0x0

    .line 59
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 60
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 61
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 63
    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    .line 64
    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->autoclose:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;III)V
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;-><init>(Landroid/app/Activity;)V

    .line 84
    invoke-static {p2}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 85
    invoke-static {p3}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 86
    invoke-static {p4}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;IIII)V
    .locals 0

    .line 107
    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;-><init>(Landroid/app/Activity;)V

    .line 109
    invoke-static {p2}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    .line 110
    invoke-static {p3}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 111
    invoke-static {p4}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 112
    invoke-static {p5}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->assertColorValueInRange(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    const/4 p1, 0x1

    .line 114
    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    return-void
.end method

.method static synthetic access$000(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->updateColorView(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)Landroid/app/Activity;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$200(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)Landroid/widget/EditText;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$300(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->sendColor()V

    return-void
.end method

.method private initUi()V
    .locals 5

    .line 195
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->colorView:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 197
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alphaSeekBar:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 198
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->redSeekBar:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 199
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->greenSeekBar:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 200
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blueSeekBar:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 202
    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alphaSeekBar:Landroid/widget/SeekBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 206
    :cond_0
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v4, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 207
    invoke-static {v1, v2, v3, v4}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->formatColorValues(IIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 208
    invoke-static {v1, v2, v3}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->formatColorValues(III)Ljava/lang/String;

    move-result-object v1

    .line 206
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private sendColor()V
    .locals 2

    .line 213
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->callback:Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

    if-eqz v0, :cond_0

    .line 214
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->getColor()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;->onColorChosen(I)V

    .line 215
    :cond_0
    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->autoclose:Z

    if-eqz v0, :cond_1

    .line 216
    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->dismiss()V

    :cond_1
    return-void
.end method

.method private updateColorView(Ljava/lang/String;)V
    .locals 2

    const-string v0, "#"

    .line 234
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    .line 235
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    .line 236
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 237
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 238
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 240
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->colorView:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->getColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 242
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alphaSeekBar:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 243
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->redSeekBar:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 244
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->greenSeekBar:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 245
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blueSeekBar:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 247
    :catch_0
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/pes/androidmaterialcolorpickerdialog/R$string;->materialcolorpicker__errHex:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public disableAutoClose()V
    .locals 1

    const/4 v0, 0x0

    .line 128
    iput-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->autoclose:Z

    return-void
.end method

.method public enableAutoClose()V
    .locals 1

    const/4 v0, 0x1

    .line 121
    iput-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->autoclose:Z

    return-void
.end method

.method public getAlpha()I
    .locals 1

    .line 304
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    return v0
.end method

.method public getBlue()I
    .locals 1

    .line 332
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return v0
.end method

.method public getColor()I
    .locals 4

    .line 384
    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    :goto_0
    return v0
.end method

.method public getGreen()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    return v0
.end method

.method public getRed()I
    .locals 1

    .line 313
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 142
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 148
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$layout;->materialcolorpicker__layout_color_picker:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->setContentView(I)V

    .line 150
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->colorView:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->colorView:Landroid/view/View;

    .line 152
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->hexCode:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    .line 154
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->alphaSeekBar:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alphaSeekBar:Landroid/widget/SeekBar;

    .line 155
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->redSeekBar:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->redSeekBar:Landroid/widget/SeekBar;

    .line 156
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->greenSeekBar:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->greenSeekBar:Landroid/widget/SeekBar;

    .line 157
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->blueSeekBar:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blueSeekBar:Landroid/widget/SeekBar;

    .line 159
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alphaSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 160
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->redSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 161
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->greenSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 162
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blueSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 164
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    iget-boolean v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x6

    :goto_0
    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 166
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;

    invoke-direct {v0, p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$1;-><init>(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 185
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->okColorButton:I

    invoke-virtual {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 186
    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$2;

    invoke-direct {v0, p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker$2;-><init>(Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .line 261
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->alphaSeekBar:I

    if-ne p3, v0, :cond_0

    .line 263
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    goto :goto_0

    .line 265
    :cond_0
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->redSeekBar:I

    if-ne p3, v0, :cond_1

    .line 267
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    goto :goto_0

    .line 269
    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->greenSeekBar:I

    if-ne p3, v0, :cond_2

    .line 271
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    goto :goto_0

    .line 273
    :cond_2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p1

    sget p3, Lcom/pes/androidmaterialcolorpickerdialog/R$id;->blueSeekBar:I

    if-ne p1, p3, :cond_3

    .line 275
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 279
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->colorView:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->getColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 282
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->hexCode:Landroid/widget/EditText;

    iget-boolean p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->withAlpha:Z

    if-eqz p2, :cond_4

    iget p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    iget p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 283
    invoke-static {p2, p3, v0, v1}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->formatColorValues(IIII)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_4
    iget p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    iget p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    .line 284
    invoke-static {p2, p3, v0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorFormatHelper;->formatColorValues(III)Ljava/lang/String;

    move-result-object p2

    .line 282
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public setAll(IIII)V
    .locals 0

    .line 356
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    .line 357
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 358
    iput p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 359
    iput p4, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return-void
.end method

.method public setAlpha(I)V
    .locals 0

    .line 340
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    return-void
.end method

.method public setBlue(I)V
    .locals 0

    .line 352
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return-void
.end method

.method public setCallback(Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->callback:Lcom/pes/androidmaterialcolorpickerdialog/ColorPickerCallback;

    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 221
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->alpha:I

    .line 222
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 223
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 224
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return-void
.end method

.method public setColors(III)V
    .locals 0

    .line 363
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    .line 364
    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    .line 365
    iput p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->blue:I

    return-void
.end method

.method public setGreen(I)V
    .locals 0

    .line 348
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->green:I

    return-void
.end method

.method public setRed(I)V
    .locals 0

    .line 344
    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->red:I

    return-void
.end method

.method public show()V
    .locals 0

    .line 389
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 390
    invoke-direct {p0}, Lcom/pes/androidmaterialcolorpickerdialog/ColorPicker;->initUi()V

    return-void
.end method
