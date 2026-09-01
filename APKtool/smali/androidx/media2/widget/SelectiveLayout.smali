.class Landroidx/media2/widget/SelectiveLayout;
.super Landroidx/media2/widget/MediaViewGroup;
.source "SelectiveLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/SelectiveLayout$Api23Impl;,
        Landroidx/media2/widget/SelectiveLayout$LayoutParams;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroidx/media2/widget/MediaViewGroup;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Landroidx/media2/widget/MediaViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroidx/media2/widget/MediaViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getPositivePaddingBottom()I
    .locals 2

    .line 169
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getPaddingBottom()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private getPositivePaddingLeft()I
    .locals 2

    .line 157
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private getPositivePaddingRight()I
    .locals 2

    .line 161
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getPaddingRight()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private getPositivePaddingTop()I
    .locals 2

    .line 165
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getPaddingTop()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 48
    instance-of p1, p1, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    return p1
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 53
    new-instance v0, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroidx/media2/widget/SelectiveLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 58
    new-instance v0, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/media2/widget/SelectiveLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 63
    instance-of v0, p1, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    if-eqz v0, :cond_0

    return-object p1

    .line 66
    :cond_0
    new-instance v0, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/media2/widget/SelectiveLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .line 129
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getChildCount()I

    move-result p1

    .line 131
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingLeft()I

    move-result v0

    sub-int/2addr p4, p2

    .line 132
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    .line 134
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingTop()I

    move-result p2

    sub-int/2addr p5, p3

    .line 135
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_1

    .line 138
    invoke-virtual {p0, p3}, Landroidx/media2/widget/SelectiveLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    .line 140
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 141
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sub-int v4, p4, v0

    sub-int/2addr v4, v2

    .line 143
    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v0

    sub-int v5, p5, p2

    sub-int/2addr v5, v3

    .line 144
    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, p2

    add-int/2addr v2, v4

    add-int/2addr v3, v5

    .line 146
    invoke-virtual {v1, v4, v5, v2, v3}, Landroid/view/View;->layout(IIII)V

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    .line 71
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    const/16 v6, 0x8

    if-ge v2, v0, :cond_1

    .line 79
    invoke-virtual {p0, v2}, Landroidx/media2/widget/SelectiveLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 80
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    .line 81
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-eq v9, v6, :cond_0

    iget-boolean v6, v8, Landroidx/media2/widget/SelectiveLayout$LayoutParams;->forceMatchParent:Z

    if-nez v6, :cond_0

    .line 82
    invoke-virtual {p0, v7, p1, p2}, Landroidx/media2/widget/SelectiveLayout;->measureChild(Landroid/view/View;II)V

    .line 83
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 84
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 85
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v6

    or-int/2addr v5, v6

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 90
    :cond_1
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingLeft()I

    move-result v2

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingRight()I

    move-result v7

    add-int/2addr v2, v7

    add-int/2addr v3, v2

    .line 91
    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingTop()I

    move-result v2

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingBottom()I

    move-result v7

    add-int/2addr v2, v7

    add-int/2addr v4, v2

    .line 94
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 95
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getSuggestedMinimumHeight()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 99
    invoke-static {p0}, Landroidx/media2/widget/SelectiveLayout$Api23Impl;->getForeground(Landroid/view/View;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 101
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 102
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 107
    :cond_2
    invoke-static {v2, p1, v5}, Landroidx/media2/widget/SelectiveLayout;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v2, v5, 0x10

    .line 108
    invoke-static {v3, p2, v2}, Landroidx/media2/widget/SelectiveLayout;->resolveSizeAndState(III)I

    move-result p2

    .line 106
    invoke-virtual {p0, p1, p2}, Landroidx/media2/widget/SelectiveLayout;->setMeasuredDimension(II)V

    .line 113
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getMeasuredWidth()I

    move-result p1

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingLeft()I

    move-result p2

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingRight()I

    move-result v2

    add-int/2addr p2, v2

    sub-int/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    .line 112
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 116
    invoke-virtual {p0}, Landroidx/media2/widget/SelectiveLayout;->getMeasuredHeight()I

    move-result v2

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingTop()I

    move-result v3

    invoke-direct {p0}, Landroidx/media2/widget/SelectiveLayout;->getPositivePaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    sub-int/2addr v2, v3

    .line 115
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :goto_1
    if-ge v1, v0, :cond_4

    .line 119
    invoke-virtual {p0, v1}, Landroidx/media2/widget/SelectiveLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 120
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/media2/widget/SelectiveLayout$LayoutParams;

    .line 121
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-eq v4, v6, :cond_3

    iget-boolean v3, v3, Landroidx/media2/widget/SelectiveLayout$LayoutParams;->forceMatchParent:Z

    if-eqz v3, :cond_3

    .line 122
    invoke-virtual {v2, p1, p2}, Landroid/view/View;->measure(II)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
