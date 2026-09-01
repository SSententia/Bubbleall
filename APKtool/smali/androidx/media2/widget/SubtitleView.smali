.class Landroidx/media2/widget/SubtitleView;
.super Landroid/view/View;
.source "SubtitleView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/SubtitleView$Api28Impl;,
        Landroidx/media2/widget/SubtitleView$Api23Impl;
    }
.end annotation


# static fields
.field private static final INNER_PADDING_RATIO:F = 0.125f


# instance fields
.field private mAlignment:Landroid/text/Layout$Alignment;

.field private mBackgroundColor:I

.field private final mCornerRadius:F

.field private mEdgeColor:I

.field private mEdgeType:I

.field private mForegroundColor:I

.field private mHasMeasurements:Z

.field private mInnerPaddingX:I

.field private mLastMeasuredWidth:I

.field private mLayout:Landroid/text/StaticLayout;

.field private final mLineBounds:Landroid/graphics/RectF;

.field private final mOutlineWidth:F

.field private mPaint:Landroid/graphics/Paint;

.field private final mShadowOffsetX:F

.field private final mShadowOffsetY:F

.field private final mShadowRadius:F

.field private mSpacingAdd:F

.field private mSpacingMult:F

.field private final mText:Landroid/text/SpannableStringBuilder;

.field private mTextPaint:Landroid/text/TextPaint;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, p1, v0}, Landroidx/media2/widget/SubtitleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, v0}, Landroidx/media2/widget/SubtitleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 84
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mLineBounds:Landroid/graphics/RectF;

    .line 56
    new-instance p1, Landroid/text/SpannableStringBuilder;

    invoke-direct {p1}, Landroid/text/SpannableStringBuilder;-><init>()V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mText:Landroid/text/SpannableStringBuilder;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 71
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mSpacingMult:F

    const/4 p1, 0x0

    .line 72
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mSpacingAdd:F

    const/4 p1, 0x0

    .line 73
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mInnerPaddingX:I

    .line 88
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 89
    sget p2, Landroidx/media2/widget/R$dimen;->media2_widget_subtitle_corner_radius:I

    .line 90
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Landroidx/media2/widget/SubtitleView;->mCornerRadius:F

    .line 91
    sget p2, Landroidx/media2/widget/R$dimen;->media2_widget_subtitle_outline_width:I

    .line 92
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Landroidx/media2/widget/SubtitleView;->mOutlineWidth:F

    .line 93
    sget p2, Landroidx/media2/widget/R$dimen;->media2_widget_subtitle_shadow_radius:I

    .line 94
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Landroidx/media2/widget/SubtitleView;->mShadowRadius:F

    .line 95
    sget p2, Landroidx/media2/widget/R$dimen;->media2_widget_subtitle_shadow_offset:I

    .line 96
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mShadowOffsetX:F

    .line 97
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mShadowOffsetY:F

    .line 99
    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    const/4 p2, 0x1

    .line 100
    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 101
    iget-object p1, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setSubpixelText(Z)V

    .line 103
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mPaint:Landroid/graphics/Paint;

    .line 104
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method private computeMeasurements(I)Z
    .locals 5

    .line 212
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/media2/widget/SubtitleView;->mLastMeasuredWidth:I

    if-ne p1, v0, :cond_0

    return v1

    .line 217
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingRight()I

    move-result v2

    add-int/2addr v0, v2

    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mInnerPaddingX:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    if-gtz p1, :cond_1

    return v0

    .line 226
    :cond_1
    iput-boolean v1, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    .line 227
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mLastMeasuredWidth:I

    .line 229
    iget-object v2, p0, Landroidx/media2/widget/SubtitleView;->mText:Landroid/text/SpannableStringBuilder;

    .line 230
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    iget-object v4, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    .line 229
    invoke-static {v2, v0, v3, v4, p1}, Landroidx/media2/widget/SubtitleView$Api23Impl;->obtainStaticLayoutBuilder(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 231
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mAlignment:Landroid/text/Layout$Alignment;

    invoke-static {p1, v0}, Landroidx/media2/widget/SubtitleView$Api23Impl;->setAlignment(Landroid/text/StaticLayout$Builder;Landroid/text/Layout$Alignment;)V

    .line 232
    iget v0, p0, Landroidx/media2/widget/SubtitleView;->mSpacingAdd:F

    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mSpacingMult:F

    invoke-static {p1, v0, v2}, Landroidx/media2/widget/SubtitleView$Api23Impl;->setLineSpacing(Landroid/text/StaticLayout$Builder;FF)V

    .line 233
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_2

    .line 234
    invoke-static {p1, v1}, Landroidx/media2/widget/SubtitleView$Api28Impl;->setUseLineSpacingFromFallbacks(Landroid/text/StaticLayout$Builder;Z)V

    .line 236
    :cond_2
    invoke-static {p1}, Landroidx/media2/widget/SubtitleView$Api23Impl;->build(Landroid/text/StaticLayout$Builder;)Landroid/text/StaticLayout;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mLayout:Landroid/text/StaticLayout;

    return v1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 246
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mLayout:Landroid/text/StaticLayout;

    if-nez v0, :cond_0

    return-void

    .line 251
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 252
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mInnerPaddingX:I

    .line 253
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v2

    int-to-float v3, v3

    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 255
    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v3

    .line 256
    iget-object v4, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    .line 257
    iget-object v5, p0, Landroidx/media2/widget/SubtitleView;->mPaint:Landroid/graphics/Paint;

    .line 258
    iget-object v6, p0, Landroidx/media2/widget/SubtitleView;->mLineBounds:Landroid/graphics/RectF;

    .line 260
    iget v7, p0, Landroidx/media2/widget/SubtitleView;->mBackgroundColor:I

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    const/4 v8, 0x0

    if-lez v7, :cond_1

    .line 261
    iget v7, p0, Landroidx/media2/widget/SubtitleView;->mCornerRadius:F

    .line 262
    invoke-virtual {v0, v8}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v9

    int-to-float v9, v9

    .line 264
    iget v10, p0, Landroidx/media2/widget/SubtitleView;->mBackgroundColor:I

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 265
    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move v10, v8

    :goto_0
    if-ge v10, v3, :cond_1

    .line 268
    invoke-virtual {v0, v10}, Landroid/text/StaticLayout;->getLineLeft(I)F

    move-result v11

    int-to-float v12, v2

    sub-float/2addr v11, v12

    iput v11, v6, Landroid/graphics/RectF;->left:F

    .line 269
    invoke-virtual {v0, v10}, Landroid/text/StaticLayout;->getLineRight(I)F

    move-result v11

    add-float/2addr v11, v12

    iput v11, v6, Landroid/graphics/RectF;->right:F

    .line 270
    iput v9, v6, Landroid/graphics/RectF;->top:F

    .line 271
    invoke-virtual {v0, v10}, Landroid/text/StaticLayout;->getLineBottom(I)I

    move-result v9

    int-to-float v9, v9

    iput v9, v6, Landroid/graphics/RectF;->bottom:F

    .line 272
    iget v9, v6, Landroid/graphics/RectF;->bottom:F

    .line 274
    invoke-virtual {p1, v6, v7, v7, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 278
    :cond_1
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mEdgeType:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 280
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 281
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mOutlineWidth:F

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 282
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mEdgeColor:I

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 283
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 285
    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    goto :goto_3

    :cond_2
    const/4 v5, 0x2

    if-ne v2, v5, :cond_3

    .line 288
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mShadowRadius:F

    iget v3, p0, Landroidx/media2/widget/SubtitleView;->mShadowOffsetX:F

    iget v5, p0, Landroidx/media2/widget/SubtitleView;->mShadowOffsetY:F

    iget v6, p0, Landroidx/media2/widget/SubtitleView;->mEdgeColor:I

    invoke-virtual {v4, v2, v3, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    goto :goto_3

    :cond_3
    const/4 v5, 0x3

    if-eq v2, v5, :cond_4

    const/4 v6, 0x4

    if-ne v2, v6, :cond_8

    :cond_4
    if-ne v2, v5, :cond_5

    goto :goto_1

    :cond_5
    move v3, v8

    :goto_1
    const/4 v2, -0x1

    if-eqz v3, :cond_6

    move v5, v2

    goto :goto_2

    .line 292
    :cond_6
    iget v5, p0, Landroidx/media2/widget/SubtitleView;->mEdgeColor:I

    :goto_2
    if-eqz v3, :cond_7

    .line 293
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mEdgeColor:I

    .line 294
    :cond_7
    iget v3, p0, Landroidx/media2/widget/SubtitleView;->mShadowRadius:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    .line 296
    iget v6, p0, Landroidx/media2/widget/SubtitleView;->mForegroundColor:I

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 297
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 298
    iget v6, p0, Landroidx/media2/widget/SubtitleView;->mShadowRadius:F

    neg-float v7, v3

    invoke-virtual {v4, v6, v7, v7, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 300
    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 302
    iget v5, p0, Landroidx/media2/widget/SubtitleView;->mShadowRadius:F

    invoke-virtual {v4, v5, v3, v3, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 305
    :cond_8
    :goto_3
    iget v2, p0, Landroidx/media2/widget/SubtitleView;->mForegroundColor:I

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 306
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 308
    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x0

    .line 310
    invoke-virtual {v4, v0, v0, v0, v8}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 311
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    sub-int/2addr p4, p2

    .line 207
    invoke-direct {p0, p4}, Landroidx/media2/widget/SubtitleView;->computeMeasurements(I)Z

    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 188
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 190
    invoke-direct {p0, p1}, Landroidx/media2/widget/SubtitleView;->computeMeasurements(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 191
    iget-object p1, p0, Landroidx/media2/widget/SubtitleView;->mLayout:Landroid/text/StaticLayout;

    .line 194
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingLeft()I

    move-result p2

    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingRight()I

    move-result v0

    add-int/2addr p2, v0

    iget v0, p0, Landroidx/media2/widget/SubtitleView;->mInnerPaddingX:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    .line 195
    invoke-virtual {p1}, Landroid/text/StaticLayout;->getWidth()I

    move-result v0

    add-int/2addr v0, p2

    .line 196
    invoke-virtual {p1}, Landroid/text/StaticLayout;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingTop()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getPaddingBottom()I

    move-result p2

    add-int/2addr p1, p2

    .line 197
    invoke-virtual {p0, v0, p1}, Landroidx/media2/widget/SubtitleView;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_0
    const/high16 p1, 0x1000000

    .line 199
    invoke-virtual {p0, p1, p1}, Landroidx/media2/widget/SubtitleView;->setMeasuredDimension(II)V

    :goto_0
    return-void
.end method

.method public setAlignment(Landroid/text/Layout$Alignment;)V
    .locals 1

    .line 176
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mAlignment:Landroid/text/Layout$Alignment;

    if-eq v0, p1, :cond_0

    .line 177
    iput-object p1, p0, Landroidx/media2/widget/SubtitleView;->mAlignment:Landroid/text/Layout$Alignment;

    const/4 p1, 0x0

    .line 179
    iput-boolean p1, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    .line 181
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->requestLayout()V

    .line 182
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    :cond_0
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 130
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mBackgroundColor:I

    .line 132
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    return-void
.end method

.method public setEdgeColor(I)V
    .locals 0

    .line 142
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mEdgeColor:I

    .line 144
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    return-void
.end method

.method public setEdgeType(I)V
    .locals 0

    .line 136
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mEdgeType:I

    .line 138
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    return-void
.end method

.method public setForegroundColor(I)V
    .locals 0

    .line 123
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mForegroundColor:I

    .line 125
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    return-void
.end method

.method public setText(I)V
    .locals 1

    .line 108
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Landroidx/media2/widget/SubtitleView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 113
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mText:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 114
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mText:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/4 p1, 0x0

    .line 116
    iput-boolean p1, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    .line 118
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->requestLayout()V

    .line 119
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    return-void
.end method

.method public setTextSize(F)V
    .locals 1

    .line 153
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F

    move-result v0

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    const/high16 v0, 0x3e000000    # 0.125f

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 155
    iput p1, p0, Landroidx/media2/widget/SubtitleView;->mInnerPaddingX:I

    const/4 p1, 0x0

    .line 157
    iput-boolean p1, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    .line 159
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->requestLayout()V

    .line 160
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 165
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Landroidx/media2/widget/SubtitleView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/4 p1, 0x0

    .line 168
    iput-boolean p1, p0, Landroidx/media2/widget/SubtitleView;->mHasMeasurements:Z

    .line 170
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->requestLayout()V

    .line 171
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleView;->invalidate()V

    :cond_0
    return-void
.end method
