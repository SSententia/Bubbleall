.class abstract Landroidx/media2/widget/MediaViewGroup;
.super Landroid/view/ViewGroup;
.source "MediaViewGroup.java"


# instance fields
.field private mAggregatedIsVisible:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    return-void
.end method


# virtual methods
.method isAggregatedVisible()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    return v0
.end method

.method public onVisibilityAggregated(Z)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onVisibilityAggregated(Z)V

    .line 75
    invoke-virtual {p0, p1}, Landroidx/media2/widget/MediaViewGroup;->onVisibilityAggregatedCompat(Z)V

    return-void
.end method

.method onVisibilityAggregatedCompat(Z)V
    .locals 0

    .line 80
    iput-boolean p1, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 48
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-ge p1, p2, :cond_0

    .line 51
    invoke-virtual {p0}, Landroidx/media2/widget/MediaViewGroup;->getWindowVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 52
    invoke-virtual {p0}, Landroidx/media2/widget/MediaViewGroup;->isShown()Z

    move-result p1

    .line 53
    iget-boolean p2, p0, Landroidx/media2/widget/MediaViewGroup;->mAggregatedIsVisible:Z

    if-eq p2, p1, :cond_0

    .line 54
    invoke-virtual {p0, p1}, Landroidx/media2/widget/MediaViewGroup;->onVisibilityAggregatedCompat(Z)V

    :cond_0
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 2

    .line 62
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    .line 65
    invoke-virtual {p0}, Landroidx/media2/widget/MediaViewGroup;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 66
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media2/widget/MediaViewGroup;->onVisibilityAggregatedCompat(Z)V

    :cond_1
    return-void
.end method
