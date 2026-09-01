.class Landroidx/media2/widget/MediaControlView$27;
.super Ljava/lang/Object;
.source "MediaControlView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/MediaControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media2/widget/MediaControlView;


# direct methods
.method constructor <init>(Landroidx/media2/widget/MediaControlView;)V
    .locals 0

    .line 1304
    iput-object p1, p0, Landroidx/media2/widget/MediaControlView$27;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1307
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$27;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mPlayer:Landroidx/media2/widget/PlayerWrapper;

    if-nez p1, :cond_0

    return-void

    .line 1308
    :cond_0
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$27;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-virtual {p1}, Landroidx/media2/widget/MediaControlView;->resetHideCallbacks()V

    .line 1310
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$27;->this$0:Landroidx/media2/widget/MediaControlView;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/media2/widget/MediaControlView;->mOverflowIsShowing:Z

    .line 1311
    iget-object p1, p0, Landroidx/media2/widget/MediaControlView$27;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object p1, p1, Landroidx/media2/widget/MediaControlView;->mOverflowShowAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
