.class Landroidx/media2/widget/VideoSurfaceView$1;
.super Ljava/lang/Object;
.source "VideoSurfaceView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media2/widget/VideoSurfaceView;->assignSurfaceToPlayerWrapper(Landroidx/media2/widget/PlayerWrapper;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/widget/VideoSurfaceView;


# direct methods
.method constructor <init>(Landroidx/media2/widget/VideoSurfaceView;)V
    .locals 0

    .line 51
    iput-object p1, p0, Landroidx/media2/widget/VideoSurfaceView$1;->this$0:Landroidx/media2/widget/VideoSurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 54
    iget-object v0, p0, Landroidx/media2/widget/VideoSurfaceView$1;->this$0:Landroidx/media2/widget/VideoSurfaceView;

    iget-object v0, v0, Landroidx/media2/widget/VideoSurfaceView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Landroidx/media2/widget/VideoSurfaceView$1;->this$0:Landroidx/media2/widget/VideoSurfaceView;

    iget-object v0, v0, Landroidx/media2/widget/VideoSurfaceView;->mSurfaceListener:Landroidx/media2/widget/VideoViewInterface$SurfaceListener;

    iget-object v1, p0, Landroidx/media2/widget/VideoSurfaceView$1;->this$0:Landroidx/media2/widget/VideoSurfaceView;

    invoke-interface {v0, v1}, Landroidx/media2/widget/VideoViewInterface$SurfaceListener;->onSurfaceTakeOverDone(Landroidx/media2/widget/VideoViewInterface;)V

    :cond_0
    return-void
.end method
