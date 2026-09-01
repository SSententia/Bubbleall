.class Landroidx/media2/widget/VideoTextureView;
.super Landroid/view/TextureView;
.source "VideoTextureView.java"

# interfaces
.implements Landroidx/media2/widget/VideoViewInterface;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field private mPlayer:Landroidx/media2/widget/PlayerWrapper;

.field private mSurface:Landroid/view/Surface;

.field mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-virtual {p0, p0}, Landroidx/media2/widget/VideoTextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method


# virtual methods
.method public assignSurfaceToPlayerWrapper(Landroidx/media2/widget/PlayerWrapper;)Z
    .locals 2

    .line 46
    iput-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    if-eqz p1, :cond_1

    .line 47
    invoke-virtual {p0}, Landroidx/media2/widget/VideoTextureView;->hasAvailableSurface()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/VideoTextureView;->mSurface:Landroid/view/Surface;

    invoke-virtual {p1, v0}, Landroidx/media2/widget/PlayerWrapper;->setSurface(Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, Landroidx/media2/widget/VideoTextureView$1;

    invoke-direct {v0, p0}, Landroidx/media2/widget/VideoTextureView$1;-><init>(Landroidx/media2/widget/VideoTextureView;)V

    .line 59
    invoke-virtual {p0}, Landroidx/media2/widget/VideoTextureView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 51
    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getViewType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hasAvailableSurface()Z
    .locals 1

    .line 76
    iget-object v0, p0, Landroidx/media2/widget/VideoTextureView;->mSurface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 115
    iget-object v0, p0, Landroidx/media2/widget/VideoTextureView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/media2/widget/PlayerWrapper;->getVideoSize()Landroidx/media2/common/VideoSize;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media2/common/VideoSize;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 116
    :goto_0
    iget-object v2, p0, Landroidx/media2/widget/VideoTextureView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/media2/widget/PlayerWrapper;->getVideoSize()Landroidx/media2/common/VideoSize;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media2/common/VideoSize;->getHeight()I

    move-result v1

    :cond_1
    if-eqz v0, :cond_c

    if-nez v1, :cond_2

    goto/16 :goto_3

    .line 128
    :cond_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 129
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 130
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 131
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v2, v4, :cond_4

    if-ne v3, v4, :cond_4

    mul-int v2, v0, p2

    mul-int v3, p1, v1

    if-ge v2, v3, :cond_3

    .line 140
    div-int p1, v2, v1

    goto :goto_2

    :cond_3
    if-le v2, v3, :cond_b

    .line 142
    div-int p2, v3, v0

    goto :goto_2

    :cond_4
    const/high16 v5, 0x1000000

    const/high16 v6, -0x80000000

    if-ne v2, v4, :cond_6

    mul-int/2addr v1, p1

    .line 147
    div-int/2addr v1, v0

    if-ne v3, v6, :cond_5

    if-le v1, p2, :cond_5

    or-int/2addr p2, v5

    goto :goto_2

    :cond_5
    move p2, v1

    goto :goto_2

    :cond_6
    if-ne v3, v4, :cond_8

    mul-int/2addr v0, p2

    .line 155
    div-int/2addr v0, v1

    if-ne v2, v6, :cond_7

    if-le v0, p1, :cond_7

    or-int/2addr p1, v5

    goto :goto_2

    :cond_7
    move p1, v0

    goto :goto_2

    :cond_8
    if-ne v3, v6, :cond_9

    if-le v1, p2, :cond_9

    mul-int v3, p2, v0

    .line 167
    div-int/2addr v3, v1

    goto :goto_1

    :cond_9
    move v3, v0

    move p2, v1

    :goto_1
    if-ne v2, v6, :cond_a

    if-le v3, p1, :cond_a

    mul-int/2addr v1, p1

    .line 172
    div-int p2, v1, v0

    goto :goto_2

    :cond_a
    move p1, v3

    .line 176
    :cond_b
    :goto_2
    invoke-virtual {p0, p1, p2}, Landroidx/media2/widget/VideoTextureView;->setMeasuredDimension(II)V

    return-void

    .line 122
    :cond_c
    :goto_3
    invoke-static {v0, p1}, Landroidx/media2/widget/VideoTextureView;->getDefaultSize(II)I

    move-result p1

    .line 123
    invoke-static {v1, p2}, Landroidx/media2/widget/VideoTextureView;->getDefaultSize(II)I

    move-result p2

    .line 124
    invoke-virtual {p0, p1, p2}, Landroidx/media2/widget/VideoTextureView;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .line 85
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Landroidx/media2/widget/VideoTextureView;->mSurface:Landroid/view/Surface;

    .line 86
    iget-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    if-eqz p1, :cond_0

    .line 87
    invoke-interface {p1, p0, p2, p3}, Landroidx/media2/widget/VideoViewInterface$SurfaceListener;->onSurfaceCreated(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    .line 106
    iget-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    if-eqz p1, :cond_0

    .line 107
    invoke-interface {p1, p0}, Landroidx/media2/widget/VideoViewInterface$SurfaceListener;->onSurfaceDestroyed(Landroid/view/View;)V

    :cond_0
    const/4 p1, 0x0

    .line 109
    iput-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mSurface:Landroid/view/Surface;

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 93
    iget-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    if-eqz p1, :cond_0

    .line 94
    invoke-interface {p1, p0, p2, p3}, Landroidx/media2/widget/VideoViewInterface$SurfaceListener;->onSurfaceChanged(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public setSurfaceListener(Landroidx/media2/widget/VideoViewInterface$SurfaceListener;)V
    .locals 0

    .line 66
    iput-object p1, p0, Landroidx/media2/widget/VideoTextureView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    return-void
.end method
