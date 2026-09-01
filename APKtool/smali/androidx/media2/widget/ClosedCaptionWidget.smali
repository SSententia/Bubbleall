.class abstract Landroidx/media2/widget/ClosedCaptionWidget;
.super Landroid/view/ViewGroup;
.source "ClosedCaptionWidget.java"

# interfaces
.implements Landroidx/media2/widget/SubtitleTrack$RenderingWidget;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;
    }
.end annotation


# instance fields
.field protected mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

.field private mCaptioningListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

.field protected mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

.field private mHasChangeListener:Z

.field protected mListener:Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;

.field private mManager:Landroid/view/accessibility/CaptioningManager;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, v0}, Landroidx/media2/widget/ClosedCaptionWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, p2, v0}, Landroidx/media2/widget/ClosedCaptionWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 70
    invoke-virtual {p0, p2, p3}, Landroidx/media2/widget/ClosedCaptionWidget;->setLayerType(ILandroid/graphics/Paint;)V

    .line 74
    new-instance p2, Landroidx/media2/widget/ClosedCaptionWidget$1;

    invoke-direct {p2, p0}, Landroidx/media2/widget/ClosedCaptionWidget$1;-><init>(Landroidx/media2/widget/ClosedCaptionWidget;)V

    iput-object p2, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mCaptioningListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    .line 86
    const-string p2, "captioning"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/accessibility/CaptioningManager;

    iput-object p2, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mManager:Landroid/view/accessibility/CaptioningManager;

    .line 87
    new-instance p2, Landroidx/media2/widget/CaptionStyle;

    iget-object p3, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mManager:Landroid/view/accessibility/CaptioningManager;

    .line 88
    invoke-static {p3}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->getUserStyle(Landroid/view/accessibility/CaptioningManager;)Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/media2/widget/CaptionStyle;-><init>(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)V

    iput-object p2, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    .line 89
    iget-object p2, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mManager:Landroid/view/accessibility/CaptioningManager;

    invoke-static {p2}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->getFontScale(Landroid/view/accessibility/CaptioningManager;)F

    move-result p2

    .line 94
    invoke-virtual {p0, p1}, Landroidx/media2/widget/ClosedCaptionWidget;->createCaptionLayout(Landroid/content/Context;)Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    move-result-object p1

    iput-object p1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    .line 95
    iget-object p3, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mCaptionStyle:Landroidx/media2/widget/CaptionStyle;

    invoke-interface {p1, p3}, Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;->setCaptionStyle(Landroidx/media2/widget/CaptionStyle;)V

    .line 96
    iget-object p1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    invoke-interface {p1, p2}, Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;->setFontScale(F)V

    .line 97
    iget-object p1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, -0x1

    invoke-virtual {p0, p1, p2, p2}, Landroidx/media2/widget/ClosedCaptionWidget;->addView(Landroid/view/View;II)V

    .line 100
    invoke-virtual {p0}, Landroidx/media2/widget/ClosedCaptionWidget;->requestLayout()V

    return-void
.end method

.method private manageChangeListener()V
    .locals 2

    .line 163
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->isAttachedToWindow(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/media2/widget/ClosedCaptionWidget;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 164
    :goto_0
    iget-boolean v1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mHasChangeListener:Z

    if-eq v1, v0, :cond_2

    .line 165
    iput-boolean v0, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mHasChangeListener:Z

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mManager:Landroid/view/accessibility/CaptioningManager;

    iget-object v1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mCaptioningListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    invoke-static {v0, v1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->addCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    goto :goto_1

    .line 171
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mManager:Landroid/view/accessibility/CaptioningManager;

    iget-object v1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mCaptioningListener:Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;

    invoke-static {v0, v1}, Landroidx/media2/widget/CaptioningManagerHelper$Api19Impl;->removeCaptioningChangeListener(Landroid/view/accessibility/CaptioningManager;Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public abstract createCaptionLayout(Landroid/content/Context;)Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 132
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 134
    invoke-direct {p0}, Landroidx/media2/widget/ClosedCaptionWidget;->manageChangeListener()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 139
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 141
    invoke-direct {p0}, Landroidx/media2/widget/ClosedCaptionWidget;->manageChangeListener()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 152
    iget-object p1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/ViewGroup;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 146
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 147
    iget-object v0, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mClosedCaptionLayout:Landroidx/media2/widget/ClosedCaptionWidget$ClosedCaptionLayout;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->measure(II)V

    return-void
.end method

.method public setOnChangedListener(Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;)V
    .locals 0

    .line 107
    iput-object p1, p0, Landroidx/media2/widget/ClosedCaptionWidget;->mListener:Landroidx/media2/widget/SubtitleTrack$RenderingWidget$OnChangedListener;

    return-void
.end method

.method public setSize(II)V
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    .line 112
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 113
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 115
    invoke-virtual {p0, v1, v0}, Landroidx/media2/widget/ClosedCaptionWidget;->measure(II)V

    const/4 v0, 0x0

    .line 116
    invoke-virtual {p0, v0, v0, p1, p2}, Landroidx/media2/widget/ClosedCaptionWidget;->layout(IIII)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 122
    invoke-virtual {p0, p1}, Landroidx/media2/widget/ClosedCaptionWidget;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 124
    invoke-virtual {p0, p1}, Landroidx/media2/widget/ClosedCaptionWidget;->setVisibility(I)V

    .line 127
    :goto_0
    invoke-direct {p0}, Landroidx/media2/widget/ClosedCaptionWidget;->manageChangeListener()V

    return-void
.end method
