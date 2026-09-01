.class Landroidx/media2/widget/MediaControlView$31;
.super Ljava/lang/Object;
.source "MediaControlView.java"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


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

    .line 1386
    iput-object p1, p0, Landroidx/media2/widget/MediaControlView$31;->this$0:Landroidx/media2/widget/MediaControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 4

    .line 1389
    iget-object v0, p0, Landroidx/media2/widget/MediaControlView$31;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-boolean v0, v0, Landroidx/media2/widget/MediaControlView;->mNeedToHideBars:Z

    if-eqz v0, :cond_0

    .line 1390
    iget-object v0, p0, Landroidx/media2/widget/MediaControlView$31;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-object v1, v0, Landroidx/media2/widget/MediaControlView;->mHideMainBars:Ljava/lang/Runnable;

    iget-object v2, p0, Landroidx/media2/widget/MediaControlView$31;->this$0:Landroidx/media2/widget/MediaControlView;

    iget-wide v2, v2, Landroidx/media2/widget/MediaControlView;->mDelayedAnimationIntervalMs:J

    invoke-virtual {v0, v1, v2, v3}, Landroidx/media2/widget/MediaControlView;->postDelayedRunnable(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method
