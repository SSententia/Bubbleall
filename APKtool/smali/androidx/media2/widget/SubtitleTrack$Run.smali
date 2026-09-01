.class Landroidx/media2/widget/SubtitleTrack$Run;
.super Ljava/lang/Object;
.source "SubtitleTrack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/SubtitleTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Run"
.end annotation


# instance fields
.field public mEndTimeMs:J

.field public mFirstCue:Landroidx/media2/widget/SubtitleTrack$Cue;

.field public mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

.field public mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

.field public mRunID:J

.field private mStoredEndTimeMs:J


# direct methods
.method constructor <init>()V
    .locals 4

    .line 617
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 613
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    const-wide/16 v2, 0x0

    .line 614
    iput-wide v2, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mRunID:J

    .line 615
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mStoredEndTimeMs:J

    return-void
.end method


# virtual methods
.method public removeAtEndTimeMs()V
    .locals 3

    .line 647
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 650
    iget-object v2, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    iput-object v2, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 651
    iput-object v1, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 653
    :cond_0
    iget-object v2, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    if-eqz v2, :cond_1

    .line 654
    iput-object v0, v2, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 655
    iput-object v1, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    :cond_1
    return-void
.end method

.method public storeByEndTimeMs(Landroid/util/LongSparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/LongSparseArray<",
            "Landroidx/media2/widget/SubtitleTrack$Run;",
            ">;)V"
        }
    .end annotation

    .line 622
    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mStoredEndTimeMs:J

    invoke-virtual {p1, v0, v1}, Landroid/util/LongSparseArray;->indexOfKey(J)I

    move-result v0

    if-ltz v0, :cond_2

    .line 624
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    if-nez v1, :cond_1

    .line 625
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    if-nez v1, :cond_0

    .line 626
    invoke-virtual {p1, v0}, Landroid/util/LongSparseArray;->removeAt(I)V

    goto :goto_0

    .line 628
    :cond_0
    invoke-virtual {p1, v0, v1}, Landroid/util/LongSparseArray;->setValueAt(ILjava/lang/Object;)V

    .line 631
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack$Run;->removeAtEndTimeMs()V

    .line 635
    :cond_2
    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_4

    const/4 v2, 0x0

    .line 636
    iput-object v2, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 637
    invoke-virtual {p1, v0, v1}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/widget/SubtitleTrack$Run;

    iput-object v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    if-eqz v0, :cond_3

    .line 639
    iput-object p0, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 641
    :cond_3
    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    invoke-virtual {p1, v0, v1, p0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 642
    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack$Run;->mStoredEndTimeMs:J

    :cond_4
    return-void
.end method
