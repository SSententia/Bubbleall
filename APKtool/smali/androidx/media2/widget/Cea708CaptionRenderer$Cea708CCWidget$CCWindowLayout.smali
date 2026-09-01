.class Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;
.super Landroid/widget/RelativeLayout;
.source "Cea708CaptionRenderer.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CCWindowLayout"
.end annotation


# static fields
.field private static final ANCHOR_HORIZONTAL_16_9_MAX:I = 0xd1

.field private static final ANCHOR_HORIZONTAL_MODE_CENTER:I = 0x1

.field private static final ANCHOR_HORIZONTAL_MODE_LEFT:I = 0x0

.field private static final ANCHOR_HORIZONTAL_MODE_RIGHT:I = 0x2

.field private static final ANCHOR_MODE_DIVIDER:I = 0x3

.field private static final ANCHOR_RELATIVE_POSITIONING_MAX:I = 0x63

.field private static final ANCHOR_VERTICAL_MAX:I = 0x4a

.field private static final ANCHOR_VERTICAL_MODE_BOTTOM:I = 0x2

.field private static final ANCHOR_VERTICAL_MODE_CENTER:I = 0x1

.field private static final ANCHOR_VERTICAL_MODE_TOP:I = 0x0

.field private static final MAX_COLUMN_COUNT_16_9:I = 0x2a

.field private static final PROPORTION_PEN_SIZE_LARGE:F = 1.25f

.field private static final PROPORTION_PEN_SIZE_SMALL:F = 0.75f

.field private static final TAG:Ljava/lang/String; = "CCWindowLayout"


# instance fields
.field private final mBuilder:Landroid/text/SpannableStringBuilder;

.field private mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

.field private mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

.field private mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

.field private mCaptionWindowId:I

.field private final mCharacterStyles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/style/CharacterStyle;",
            ">;"
        }
    .end annotation
.end field

.field private mFontScale:F

.field private mLastCaptionLayoutHeight:I

.field private mLastCaptionLayoutWidth:I

.field private mRow:I

.field private mRowLimit:I

.field private mTextSize:F

.field private mWidestChar:Ljava/lang/String;

.field final synthetic this$1:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;


# direct methods
.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 773
    invoke-direct {p0, p1, p2, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 777
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 780
    iput-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->this$1:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;

    .line 781
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 761
    iput p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRowLimit:I

    .line 762
    new-instance p3, Landroid/text/SpannableStringBuilder;

    invoke-direct {p3}, Landroid/text/SpannableStringBuilder;-><init>()V

    iput-object p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    .line 763
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    const/4 p3, -0x1

    .line 765
    iput p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRow:I

    .line 784
    new-instance p3, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    invoke-direct {p3, p1, p2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget;Landroid/content/Context;)V

    iput-object p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    .line 785
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 p3, -0x2

    invoke-direct {p1, p3, p3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 787
    iget-object p3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    invoke-virtual {p0, p3, p1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 791
    const-string p1, "captioning"

    .line 792
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    .line 794
    invoke-static {p1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->getFontScale(Landroid/view/accessibility/CaptioningManager;)F

    move-result p2

    iput p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mFontScale:F

    .line 795
    new-instance p2, Landroidx/media2/widget/CaptionStyle;

    .line 796
    invoke-static {p1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->getUserStyle(Landroid/view/accessibility/CaptioningManager;)Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object p1

    invoke-direct {p2, p1}, Landroidx/media2/widget/CaptionStyle;-><init>(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)V

    .line 795
    invoke-virtual {p0, p2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setCaptionStyle(Landroidx/media2/widget/CaptionStyle;)V

    .line 801
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setText(Ljava/lang/CharSequence;)V

    .line 802
    invoke-direct {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateWidestChar()V

    return-void
.end method

.method private getScreenColumnCount()I
    .locals 1

    const/16 v0, 0x2a

    return v0
.end method

.method private updateText(Ljava/lang/String;Z)V
    .locals 5

    if-nez p2, :cond_0

    .line 1158
    iget-object p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->clear()V

    :cond_0
    if-eqz p1, :cond_1

    .line 1160
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_1

    .line 1161
    iget-object p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p2

    .line 1162
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1163
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/style/CharacterStyle;

    .line 1164
    iget-object v1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/16 v3, 0x21

    invoke-virtual {v1, v0, p2, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 1168
    :cond_1
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\n"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 1172
    array-length v0, p1

    iget v1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRowLimit:I

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    .line 1173
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    array-length v2, p1

    .line 1172
    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1174
    iget-object p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p2, v1, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 1177
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    add-int/lit8 p2, p1, -0x1

    move v0, v1

    :goto_1
    const/16 v2, 0x20

    if-gt v0, p2, :cond_2

    .line 1179
    iget-object v3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v3

    if-gt v3, v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_2
    if-lt v3, v0, :cond_3

    .line 1182
    iget-object v4, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v4

    if-gt v4, v2, :cond_3

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_3
    if-nez v0, :cond_4

    if-ne v3, p2, :cond_4

    .line 1186
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    iget-object p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1188
    :cond_4
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 1189
    iget-object v4, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    if-ge v3, p2, :cond_5

    add-int/lit8 v3, v3, 0x1

    .line 1191
    invoke-virtual {v2, v3, p1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    :cond_5
    if-lez v0, :cond_6

    .line 1194
    invoke-virtual {v2, v1, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 1196
    :cond_6
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    invoke-virtual {p1, v2}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method

.method private updateTextSize()V
    .locals 8

    .line 1103
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    if-nez v0, :cond_0

    return-void

    .line 1106
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1107
    invoke-direct {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->getScreenColumnCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 1109
    iget-object v3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mWidestChar:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1111
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1112
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 1113
    iget-object v2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    invoke-virtual {v2}, Landroidx/media2/widget/CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/4 v2, 0x0

    const/high16 v3, 0x437f0000    # 255.0f

    :goto_1
    cmpg-float v4, v2, v3

    if-gez v4, :cond_3

    add-float v4, v2, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    .line 1118
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1119
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    .line 1120
    iget-object v6, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-virtual {v6}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const v7, 0x3f4ccccd    # 0.8f

    mul-float/2addr v6, v7

    cmpl-float v5, v6, v5

    const v6, 0x3c23d70a    # 0.01f

    if-lez v5, :cond_2

    add-float/2addr v4, v6

    move v2, v4

    goto :goto_1

    :cond_2
    sub-float/2addr v4, v6

    move v3, v4

    goto :goto_1

    .line 1126
    :cond_3
    iget v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mFontScale:F

    mul-float/2addr v3, v0

    iput v3, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mTextSize:F

    .line 1127
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    invoke-virtual {v0, v3}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setTextSize(F)V

    return-void
.end method

.method private updateWidestChar()V
    .locals 8

    .line 1087
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 1088
    iget-object v1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    invoke-virtual {v1}, Landroidx/media2/widget/CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 1089
    const-string v1, "ISO-8859-1"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x100

    if-ge v4, v5, :cond_1

    .line 1092
    new-instance v5, Ljava/lang/String;

    int-to-byte v6, v4

    const/4 v7, 0x1

    new-array v7, v7, [B

    aput-byte v6, v7, v3

    invoke-direct {v5, v7, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1093
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    cmpg-float v7, v2, v6

    if-gez v7, :cond_0

    .line 1096
    iput-object v5, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mWidestChar:Ljava/lang/String;

    move v2, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1099
    :cond_1
    invoke-direct {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateTextSize()V

    return-void
.end method


# virtual methods
.method public appendText(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1148
    invoke-direct {p0, p1, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateText(Ljava/lang/String;Z)V

    return-void
.end method

.method public clear()V
    .locals 0

    .line 824
    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->clearText()V

    .line 825
    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->hide()V

    return-void
.end method

.method public clearText()V
    .locals 2

    .line 1152
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 1153
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getCaptionWindowId()I
    .locals 1

    .line 816
    iget v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionWindowId:I

    return v0
.end method

.method public hide()V
    .locals 1

    const/4 v0, 0x4

    .line 834
    invoke-virtual {p0, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setVisibility(I)V

    .line 835
    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->requestLayout()V

    return-void
.end method

.method public initWindow(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;Landroidx/media2/widget/Cea708CCParser$CaptionWindow;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 948
    iget-object v3, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    if-eq v3, v1, :cond_1

    if-eqz v3, :cond_0

    .line 950
    invoke-virtual {v3, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 952
    :cond_0
    iput-object v1, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    .line 953
    invoke-virtual {v1, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 954
    invoke-direct/range {p0 .. p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateWidestChar()V

    .line 959
    :cond_1
    iget v1, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorVertical:I

    int-to-float v1, v1

    .line 960
    iget-boolean v3, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->relativePositioning:Z

    const/16 v4, 0x63

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    const/16 v3, 0x4a

    :goto_0
    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 964
    iget v3, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorHorizontal:I

    int-to-float v3, v3

    .line 965
    iget-boolean v5, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->relativePositioning:Z

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    const/16 v4, 0xd1

    :goto_1
    int-to-float v4, v4

    div-float/2addr v3, v4

    const/4 v4, 0x0

    cmpg-float v5, v1, v4

    .line 970
    const-string v6, "CCWindowLayout"

    const/high16 v7, 0x3f800000    # 1.0f

    if-ltz v5, :cond_4

    cmpl-float v5, v1, v7

    if-lez v5, :cond_5

    .line 971
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "The vertical position of the anchor point should be at the range of 0 and 1 but "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 973
    invoke-static {v1, v7}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    :cond_5
    cmpg-float v5, v3, v4

    if-ltz v5, :cond_6

    cmpl-float v5, v3, v7

    if-lez v5, :cond_7

    .line 976
    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "The horizontal position of the anchor point should be at the range of 0 and 1 but "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 978
    invoke-static {v3, v7}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 981
    :cond_7
    iget v5, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorId:I

    const/4 v6, 0x3

    rem-int/2addr v5, v6

    .line 982
    iget v8, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->anchorId:I

    div-int/2addr v8, v6

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_d

    if-eq v5, v10, :cond_9

    if-eq v5, v9, :cond_8

    const/16 v6, 0x11

    move/from16 v16, v4

    :goto_2
    move/from16 v17, v7

    goto/16 :goto_6

    :cond_8
    const/4 v6, 0x5

    move/from16 v17, v3

    move/from16 v16, v4

    goto/16 :goto_6

    :cond_9
    sub-float v5, v7, v3

    .line 994
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 998
    iget v11, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->columnCount:I

    add-int/2addr v11, v10

    .line 999
    invoke-direct/range {p0 .. p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->getScreenColumnCount()I

    move-result v12

    invoke-static {v12, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 1000
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v11, :cond_a

    .line 1002
    iget-object v14, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mWidestChar:Ljava/lang/String;

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 1004
    :cond_a
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    .line 1005
    iget-object v13, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    invoke-virtual {v13}, Landroidx/media2/widget/CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v11, v13}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 1006
    iget v13, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mTextSize:F

    invoke-virtual {v11, v13}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1007
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    .line 1008
    iget-object v12, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-virtual {v12}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->getWidth()I

    move-result v12

    if-lez v12, :cond_b

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    .line 1009
    iget-object v12, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-virtual {v12}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->getWidth()I

    move-result v12

    int-to-float v12, v12

    const v13, 0x3f4ccccd    # 0.8f

    mul-float/2addr v12, v13

    div-float/2addr v11, v12

    goto :goto_4

    :cond_b
    move v11, v4

    :goto_4
    cmpl-float v12, v11, v4

    if-lez v12, :cond_c

    cmpg-float v12, v11, v3

    if-gez v12, :cond_c

    .line 1016
    iget-object v5, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    sget-object v12, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {v5, v12}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setAlignment(Landroid/text/Layout$Alignment;)V

    sub-float/2addr v3, v11

    goto :goto_5

    .line 1029
    :cond_c
    iget-object v6, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    sget-object v11, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v6, v11}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setAlignment(Landroid/text/Layout$Alignment;)V

    sub-float v6, v3, v5

    add-float/2addr v3, v5

    move/from16 v17, v3

    move/from16 v16, v6

    move v6, v10

    goto :goto_6

    .line 990
    :cond_d
    iget-object v5, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    sget-object v11, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {v5, v11}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setAlignment(Landroid/text/Layout$Alignment;)V

    :goto_5
    move/from16 v16, v3

    goto/16 :goto_2

    :goto_6
    if-eqz v8, :cond_10

    if-eq v8, v10, :cond_f

    if-eq v8, v9, :cond_e

    :goto_7
    move v14, v4

    :goto_8
    move v15, v7

    goto :goto_9

    :cond_e
    or-int/lit8 v6, v6, 0x50

    move v15, v1

    move v14, v4

    goto :goto_9

    :cond_f
    or-int/lit8 v6, v6, 0x10

    sub-float/2addr v7, v1

    .line 1051
    invoke-static {v7, v1}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float v4, v1, v3

    add-float v7, v1, v3

    goto :goto_7

    :cond_10
    or-int/lit8 v6, v6, 0x30

    move v14, v1

    goto :goto_8

    .line 1060
    :goto_9
    iget-object v1, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    new-instance v3, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$ScaledLayout$ScaledLayoutParams;

    iget-object v13, v0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    .line 1061
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v12, v3

    invoke-direct/range {v12 .. v17}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$ScaledLayout$ScaledLayoutParams;-><init>(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$ScaledLayout;FFFF)V

    .line 1060
    invoke-virtual {v1, v0, v3}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->addOrUpdateViewToSafeTitleArea(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$ScaledLayout$ScaledLayoutParams;)V

    .line 1063
    iget v1, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->id:I

    invoke-virtual {v0, v1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setCaptionWindowId(I)V

    .line 1064
    iget v1, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->rowCount:I

    invoke-virtual {v0, v1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setRowLimit(I)V

    .line 1065
    invoke-virtual {v0, v6}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setGravity(I)V

    .line 1066
    iget-boolean v1, v2, Landroidx/media2/widget/Cea708CCParser$CaptionWindow;->visible:Z

    if-eqz v1, :cond_11

    .line 1067
    invoke-virtual/range {p0 .. p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->show()V

    goto :goto_a

    .line 1069
    :cond_11
    invoke-virtual/range {p0 .. p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->hide()V

    :goto_a
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 1079
    iget p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mLastCaptionLayoutWidth:I

    if-ne p4, p1, :cond_0

    iget p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mLastCaptionLayoutHeight:I

    if-eq p5, p1, :cond_1

    .line 1080
    :cond_0
    iput p4, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mLastCaptionLayoutWidth:I

    .line 1081
    iput p5, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mLastCaptionLayoutHeight:I

    .line 1082
    invoke-direct {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateTextSize()V

    :cond_1
    return-void
.end method

.method public removeFromCaptionView()V
    .locals 1

    .line 1136
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    if-eqz v0, :cond_0

    .line 1137
    invoke-virtual {v0, p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->removeViewFromSafeTitleArea(Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;)V

    .line 1138
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    invoke-virtual {v0, p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v0, 0x0

    .line 1139
    iput-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCLayout:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCLayout;

    :cond_0
    return-void
.end method

.method public sendBuffer(Ljava/lang/String;)V
    .locals 0

    .line 885
    invoke-virtual {p0, p1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->appendText(Ljava/lang/String;)V

    return-void
.end method

.method public sendControl(C)V
    .locals 0

    return-void
.end method

.method public setCaptionStyle(Landroidx/media2/widget/CaptionStyle;)V
    .locals 1

    .line 806
    iput-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    .line 807
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCCView:Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;

    invoke-virtual {v0, p1}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCView;->setCaptionStyle(Landroidx/media2/widget/CaptionStyle;)V

    return-void
.end method

.method public setCaptionWindowId(I)V
    .locals 0

    .line 820
    iput p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCaptionWindowId:I

    return-void
.end method

.method public setFontScale(F)V
    .locals 0

    .line 811
    iput p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mFontScale:F

    .line 812
    invoke-direct {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateTextSize()V

    return-void
.end method

.method public setPenAttr(Landroidx/media2/widget/Cea708CCParser$CaptionPenAttr;)V
    .locals 4

    .line 839
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 840
    iget-boolean v0, p1, Landroidx/media2/widget/Cea708CCParser$CaptionPenAttr;->italic:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 841
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v2, Landroid/text/style/StyleSpan;

    invoke-direct {v2, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 843
    :cond_0
    iget-boolean v0, p1, Landroidx/media2/widget/Cea708CCParser$CaptionPenAttr;->underline:Z

    if-eqz v0, :cond_1

    .line 844
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 846
    :cond_1
    iget v0, p1, Landroidx/media2/widget/Cea708CCParser$CaptionPenAttr;->penSize:I

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 851
    :cond_2
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    const/high16 v3, 0x3fa00000    # 1.25f

    invoke-direct {v2, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 848
    :cond_3
    iget-object v0, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {v2, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 854
    :goto_0
    iget p1, p1, Landroidx/media2/widget/Cea708CCParser$CaptionPenAttr;->penOffset:I

    if-eqz p1, :cond_5

    if-eq p1, v1, :cond_4

    goto :goto_1

    .line 859
    :cond_4
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v0, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v0}, Landroid/text/style/SuperscriptSpan;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 856
    :cond_5
    iget-object p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mCharacterStyles:Ljava/util/List;

    new-instance v0, Landroid/text/style/SubscriptSpan;

    invoke-direct {v0}, Landroid/text/style/SubscriptSpan;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public setPenColor(Landroidx/media2/widget/Cea708CCParser$CaptionPenColor;)V
    .locals 0

    return-void
.end method

.method public setPenLocation(II)V
    .locals 1

    .line 871
    iget p2, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRow:I

    if-ltz p2, :cond_0

    :goto_0
    if-ge p2, p1, :cond_0

    .line 873
    const-string v0, "\n"

    invoke-virtual {p0, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->appendText(Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 876
    :cond_0
    iput p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRow:I

    return-void
.end method

.method public setRowLimit(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 1204
    iput p1, p0, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->mRowLimit:I

    return-void

    .line 1202
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A rowLimit should have a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1144
    invoke-direct {p0, p1, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->updateText(Ljava/lang/String;Z)V

    return-void
.end method

.method public setWindowAttr(Landroidx/media2/widget/Cea708CCParser$CaptionWindowAttr;)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 1

    const/4 v0, 0x0

    .line 829
    invoke-virtual {p0, v0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->setVisibility(I)V

    .line 830
    invoke-virtual {p0}, Landroidx/media2/widget/Cea708CaptionRenderer$Cea708CCWidget$CCWindowLayout;->requestLayout()V

    return-void
.end method
