.class abstract Landroidx/media2/widget/SubtitleTrack;
.super Ljava/lang/Object;
.source "SubtitleTrack.java"

# interfaces
.implements Landroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/widget/SubtitleTrack$RenderingWidget;,
        Landroidx/media2/widget/SubtitleTrack$Run;,
        Landroidx/media2/widget/SubtitleTrack$Cue;,
        Landroidx/media2/widget/SubtitleTrack$CueList;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SubtitleTrack"


# instance fields
.field public DEBUG:Z

.field final mActiveCues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media2/widget/SubtitleTrack$Cue;",
            ">;"
        }
    .end annotation
.end field

.field private mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

.field private mFormat:Landroid/media/MediaFormat;

.field protected mHandler:Landroid/os/Handler;

.field private mLastTimeMs:J

.field private mLastUpdateTimeMs:J

.field private mNextScheduledTimeMs:J

.field mRunnable:Ljava/lang/Runnable;

.field private final mRunsByEndTime:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Landroidx/media2/widget/SubtitleTrack$Run;",
            ">;"
        }
    .end annotation
.end field

.field private final mRunsByID:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Landroidx/media2/widget/SubtitleTrack$Run;",
            ">;"
        }
    .end annotation
.end field

.field protected mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

.field protected mVisible:Z


# direct methods
.method constructor <init>(Landroid/media/MediaFormat;)V
    .locals 2

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    .line 51
    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 58
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    .line 60
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mHandler:Landroid/os/Handler;

    const-wide/16 v0, -0x1

    .line 76
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    .line 66
    iput-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mFormat:Landroid/media/MediaFormat;

    .line 67
    new-instance p1, Landroidx/media2/widget/SubtitleTrack$CueList;

    invoke-direct {p1}, Landroidx/media2/widget/SubtitleTrack$CueList;-><init>()V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

    .line 68
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->clearActiveCues()V

    .line 69
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    return-void
.end method

.method private removeRunsByEndTimeIndex(I)V
    .locals 5

    .line 168
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media2/widget/SubtitleTrack$Run;

    :goto_0
    if-eqz v0, :cond_1

    .line 170
    iget-object v1, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mFirstCue:Landroidx/media2/widget/SubtitleTrack$Cue;

    :goto_1
    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 172
    iget-object v3, p0, Landroidx/media2/widget/SubtitleTrack;->mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

    invoke-virtual {v3, v1}, Landroidx/media2/widget/SubtitleTrack$CueList;->remove(Landroidx/media2/widget/SubtitleTrack$Cue;)V

    .line 173
    iget-object v3, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mNextInRun:Landroidx/media2/widget/SubtitleTrack$Cue;

    .line 174
    iput-object v2, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mNextInRun:Landroidx/media2/widget/SubtitleTrack$Cue;

    move-object v1, v3

    goto :goto_1

    .line 177
    :cond_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    iget-wide v3, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mRunID:J

    invoke-virtual {v1, v3, v4}, Landroid/util/LongSparseArray;->remove(J)V

    .line 178
    iget-object v1, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 179
    iput-object v2, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mPrevRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    .line 180
    iput-object v2, v0, Landroidx/media2/widget/SubtitleTrack$Run;->mNextRunAtEndTimeMs:Landroidx/media2/widget/SubtitleTrack$Run;

    move-object v0, v1

    goto :goto_0

    .line 183
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1}, Landroid/util/LongSparseArray;->removeAt(I)V

    return-void
.end method

.method private declared-synchronized takeTime(J)V
    .locals 0

    monitor-enter p0

    .line 198
    :try_start_0
    iput-wide p1, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method protected declared-synchronized addCue(Landroidx/media2/widget/SubtitleTrack$Cue;)Z
    .locals 11

    const-string v0, "mVisible="

    monitor-enter p0

    .line 292
    :try_start_0
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack;->mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

    invoke-virtual {v1, p1}, Landroidx/media2/widget/SubtitleTrack$CueList;->add(Landroidx/media2/widget/SubtitleTrack$Cue;)V

    .line 294
    iget-wide v1, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mRunID:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    .line 295
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    iget-wide v5, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mRunID:J

    invoke-virtual {v1, v5, v6}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media2/widget/SubtitleTrack$Run;

    if-nez v1, :cond_0

    .line 297
    new-instance v1, Landroidx/media2/widget/SubtitleTrack$Run;

    invoke-direct {v1}, Landroidx/media2/widget/SubtitleTrack$Run;-><init>()V

    .line 298
    iget-object v2, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    iget-wide v5, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mRunID:J

    invoke-virtual {v2, v5, v6, v1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 299
    iget-wide v5, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    iput-wide v5, v1, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    goto :goto_0

    .line 300
    :cond_0
    iget-wide v5, v1, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    iget-wide v7, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    cmp-long v2, v5, v7

    if-gez v2, :cond_1

    .line 301
    iget-wide v5, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    iput-wide v5, v1, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    .line 305
    :cond_1
    :goto_0
    iget-object v2, v1, Landroidx/media2/widget/SubtitleTrack$Run;->mFirstCue:Landroidx/media2/widget/SubtitleTrack$Cue;

    iput-object v2, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mNextInRun:Landroidx/media2/widget/SubtitleTrack$Cue;

    .line 306
    iput-object p1, v1, Landroidx/media2/widget/SubtitleTrack$Run;->mFirstCue:Landroidx/media2/widget/SubtitleTrack$Cue;

    .line 311
    :cond_2
    iget-object v1, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    .line 313
    :try_start_1
    invoke-interface {v1, v5, v2}, Landroidx/media2/widget/MediaTimeProvider;->getCurrentTimeUs(ZZ)J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :cond_3
    const-wide/16 v6, -0x1

    .line 320
    :goto_1
    :try_start_2
    iget-boolean v1, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v1, :cond_4

    .line 321
    const-string v1, "SubtitleTrack"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mStartTimeMs:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " <= "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " >= "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    :cond_4
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    if-eqz v0, :cond_8

    iget-wide v0, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mStartTimeMs:J

    cmp-long v0, v0, v6

    if-gtz v0, :cond_8

    iget-wide v0, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    iget-wide v8, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    cmp-long v0, v0, v8

    if-ltz v0, :cond_8

    .line 329
    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunnable:Ljava/lang/Runnable;

    if-eqz p1, :cond_5

    .line 330
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 334
    :cond_5
    new-instance p1, Landroidx/media2/widget/SubtitleTrack$1;

    invoke-direct {p1, p0, p0, v6, v7}, Landroidx/media2/widget/SubtitleTrack$1;-><init>(Landroidx/media2/widget/SubtitleTrack;Landroidx/media2/widget/SubtitleTrack;J)V

    iput-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunnable:Ljava/lang/Runnable;

    .line 348
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mHandler:Landroid/os/Handler;

    const-wide/16 v3, 0xa

    invoke-virtual {v0, p1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 349
    iget-boolean p1, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz p1, :cond_7

    const-string p1, "SubtitleTrack"

    const-string v0, "scheduling update"

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 351
    :cond_6
    iget-boolean p1, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz p1, :cond_7

    const-string p1, "SubtitleTrack"

    const-string v0, "failed to schedule subtitle view update"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 353
    :cond_7
    :goto_2
    monitor-exit p0

    return v2

    .line 356
    :cond_8
    :try_start_3
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    if-eqz v0, :cond_a

    iget-wide v0, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    iget-wide v6, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    cmp-long v0, v0, v6

    if-ltz v0, :cond_a

    iget-wide v0, p1, Landroidx/media2/widget/SubtitleTrack$Cue;->mStartTimeMs:J

    iget-wide v6, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    cmp-long p1, v0, v6

    if-ltz p1, :cond_9

    cmp-long p1, v6, v3

    if-gez p1, :cond_a

    .line 358
    :cond_9
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->scheduleTimedEvents()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 361
    :cond_a
    monitor-exit p0

    return v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected declared-synchronized clearActiveCues()V
    .locals 3

    const-string v0, "Clearing "

    monitor-enter p0

    .line 202
    :try_start_0
    iget-boolean v1, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v1, :cond_0

    const-string v1, "SubtitleTrack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " active cues"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v0, -0x1

    .line 204
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mLastUpdateTimeMs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 189
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 191
    invoke-direct {p0, v0}, Landroidx/media2/widget/SubtitleTrack;->removeRunsByEndTimeIndex(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 194
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method protected finishedRun(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    .line 583
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media2/widget/SubtitleTrack$Run;

    if-eqz p1, :cond_0

    .line 585
    iget-object p2, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/SubtitleTrack$Run;->storeByEndTimeMs(Landroid/util/LongSparseArray;)V

    :cond_0
    return-void
.end method

.method public final getFormat()Landroid/media/MediaFormat;
    .locals 1

    .line 73
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mFormat:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public abstract getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;
.end method

.method public getTrackType()I
    .locals 1

    .line 603
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    return v0
.end method

.method public hide()V
    .locals 2

    .line 277
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    if-nez v0, :cond_0

    return-void

    .line 281
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    if-eqz v0, :cond_1

    .line 282
    invoke-interface {v0, p0}, Landroidx/media2/widget/MediaTimeProvider;->cancelNotifications(Landroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V

    .line 284
    :cond_1
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 286
    invoke-interface {v0, v1}, Landroidx/media2/widget/SubtitleTrack$RenderingWidget;->setVisible(Z)V

    .line 288
    :cond_2
    iput-boolean v1, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    return-void
.end method

.method public onData(Landroidx/media2/common/SubtitleData;)V
    .locals 6

    .line 82
    invoke-virtual {p1}, Landroidx/media2/common/SubtitleData;->getStartTimeUs()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 83
    invoke-virtual {p1}, Landroidx/media2/common/SubtitleData;->getData()[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3, v0, v1}, Landroidx/media2/widget/SubtitleTrack;->onData([BZJ)V

    .line 86
    invoke-virtual {p1}, Landroidx/media2/common/SubtitleData;->getStartTimeUs()J

    move-result-wide v2

    invoke-virtual {p1}, Landroidx/media2/common/SubtitleData;->getDurationUs()J

    move-result-wide v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 84
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/media2/widget/SubtitleTrack;->setRunDiscardTimeMs(JJ)V

    return-void
.end method

.method protected abstract onData([BZJ)V
.end method

.method public onSeek(J)V
    .locals 3

    .line 231
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_0

    const-string v0, "SubtitleTrack"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onSeek "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    :cond_0
    monitor-enter p0

    const-wide/16 v0, 0x3e8

    .line 233
    :try_start_0
    div-long/2addr p1, v0

    const/4 v0, 0x1

    .line 234
    invoke-virtual {p0, v0, p1, p2}, Landroidx/media2/widget/SubtitleTrack;->updateActiveCues(ZJ)V

    .line 235
    invoke-direct {p0, p1, p2}, Landroidx/media2/widget/SubtitleTrack;->takeTime(J)V

    .line 236
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Landroidx/media2/widget/SubtitleTrack;->updateView(Ljava/util/ArrayList;)V

    .line 238
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->scheduleTimedEvents()V

    return-void

    :catchall_0
    move-exception p1

    .line 236
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onStop()V
    .locals 3

    .line 243
    monitor-enter p0

    .line 244
    :try_start_0
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_0

    const-string v0, "SubtitleTrack"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->clearActiveCues()V

    const-wide/16 v0, -0x1

    .line 246
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    .line 247
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    iget-object v2, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Landroidx/media2/widget/SubtitleTrack;->updateView(Ljava/util/ArrayList;)V

    .line 249
    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    .line 250
    iget-object v2, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    invoke-interface {v2, v0, v1, p0}, Landroidx/media2/widget/MediaTimeProvider;->notifyAt(JLandroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V

    return-void

    :catchall_0
    move-exception v0

    .line 247
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onTimedEvent(J)V
    .locals 3

    .line 219
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_0

    const-string v0, "SubtitleTrack"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onTimedEvent "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    :cond_0
    monitor-enter p0

    const-wide/16 v0, 0x3e8

    .line 221
    :try_start_0
    div-long/2addr p1, v0

    const/4 v0, 0x0

    .line 222
    invoke-virtual {p0, v0, p1, p2}, Landroidx/media2/widget/SubtitleTrack;->updateActiveCues(ZJ)V

    .line 223
    invoke-direct {p0, p1, p2}, Landroidx/media2/widget/SubtitleTrack;->takeTime(J)V

    .line 224
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Landroidx/media2/widget/SubtitleTrack;->updateView(Ljava/util/ArrayList;)V

    .line 226
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->scheduleTimedEvents()V

    return-void

    :catchall_0
    move-exception p1

    .line 224
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected scheduleTimedEvents()V
    .locals 5

    .line 209
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    if-eqz v0, :cond_2

    .line 210
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

    iget-wide v1, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    invoke-virtual {v0, v1, v2}, Landroidx/media2/widget/SubtitleTrack$CueList;->nextTimeAfter(J)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    .line 211
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sched @"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " after "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media2/widget/SubtitleTrack;->mLastTimeMs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SubtitleTrack"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    :cond_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    iget-wide v1, p0, Landroidx/media2/widget/SubtitleTrack;->mNextScheduledTimeMs:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    goto :goto_0

    :cond_1
    const-wide/16 v1, -0x1

    :goto_0
    invoke-interface {v0, v1, v2, p0}, Landroidx/media2/widget/MediaTimeProvider;->notifyAt(JLandroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V

    :cond_2
    return-void
.end method

.method public setRunDiscardTimeMs(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    .line 593
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByID:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media2/widget/SubtitleTrack$Run;

    if-eqz p1, :cond_0

    .line 595
    iput-wide p3, p1, Landroidx/media2/widget/SubtitleTrack$Run;->mEndTimeMs:J

    .line 596
    iget-object p2, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {p1, p2}, Landroidx/media2/widget/SubtitleTrack$Run;->storeByEndTimeMs(Landroid/util/LongSparseArray;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized setTimeProvider(Landroidx/media2/widget/MediaTimeProvider;)V
    .locals 1

    monitor-enter p0

    .line 368
    :try_start_0
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p1, :cond_0

    .line 369
    monitor-exit p0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 372
    :try_start_1
    invoke-interface {v0, p0}, Landroidx/media2/widget/MediaTimeProvider;->cancelNotifications(Landroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V

    .line 374
    :cond_1
    iput-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    if-eqz p1, :cond_2

    .line 376
    invoke-interface {p1, p0}, Landroidx/media2/widget/MediaTimeProvider;->scheduleUpdate(Landroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 378
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public show()V
    .locals 2

    .line 259
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 263
    iput-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->mVisible:Z

    .line 264
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->getRenderingWidget()Landroidx/media2/widget/SubtitleTrack$RenderingWidget;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 266
    invoke-interface {v1, v0}, Landroidx/media2/widget/SubtitleTrack$RenderingWidget;->setVisible(Z)V

    .line 268
    :cond_1
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mTimeProvider:Landroidx/media2/widget/MediaTimeProvider;

    if-eqz v0, :cond_2

    .line 269
    invoke-interface {v0, p0}, Landroidx/media2/widget/MediaTimeProvider;->scheduleUpdate(Landroidx/media2/widget/MediaTimeProvider$OnMediaTimeListener;)V

    :cond_2
    return-void
.end method

.method protected declared-synchronized updateActiveCues(ZJ)V
    .locals 6

    monitor-enter p0

    if-nez p1, :cond_0

    .line 130
    :try_start_0
    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mLastUpdateTimeMs:J

    cmp-long p1, v0, p2

    if-lez p1, :cond_1

    .line 131
    :cond_0
    invoke-virtual {p0}, Landroidx/media2/widget/SubtitleTrack;->clearActiveCues()V

    .line 134
    :cond_1
    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mCues:Landroidx/media2/widget/SubtitleTrack$CueList;

    iget-wide v0, p0, Landroidx/media2/widget/SubtitleTrack;->mLastUpdateTimeMs:J

    .line 135
    invoke-virtual {p1, v0, v1, p2, p3}, Landroidx/media2/widget/SubtitleTrack$CueList;->entriesBetween(JJ)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 137
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Landroidx/media2/widget/SubtitleTrack$Cue;

    .line 139
    iget-wide v2, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mEndTimeMs:J

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    .line 141
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_3

    const-string v0, "SubtitleTrack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Removing "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    :cond_3
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 143
    iget-wide v0, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mRunID:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 144
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 146
    :cond_4
    iget-wide v2, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mStartTimeMs:J

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_7

    .line 149
    iget-boolean v0, p0, Landroidx/media2/widget/SubtitleTrack;->DEBUG:Z

    if-eqz v0, :cond_5

    const-string v0, "SubtitleTrack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    :cond_5
    iget-object v0, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mInnerTimesMs:[J

    if-eqz v0, :cond_6

    .line 151
    invoke-virtual {v1, p2, p3}, Landroidx/media2/widget/SubtitleTrack$Cue;->onTime(J)V

    .line 153
    :cond_6
    iget-object v0, p0, Landroidx/media2/widget/SubtitleTrack;->mActiveCues:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 154
    :cond_7
    iget-object v0, v1, Landroidx/media2/widget/SubtitleTrack$Cue;->mInnerTimesMs:[J

    if-eqz v0, :cond_2

    .line 156
    invoke-virtual {v1, p2, p3}, Landroidx/media2/widget/SubtitleTrack$Cue;->onTime(J)V

    goto/16 :goto_0

    .line 161
    :cond_8
    :goto_1
    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Landroid/util/LongSparseArray;->size()I

    move-result p1

    if-lez p1, :cond_9

    iget-object p1, p0, Landroidx/media2/widget/SubtitleTrack;->mRunsByEndTime:Landroid/util/LongSparseArray;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v1

    cmp-long p1, v1, p2

    if-gtz p1, :cond_9

    .line 162
    invoke-direct {p0, v0}, Landroidx/media2/widget/SubtitleTrack;->removeRunsByEndTimeIndex(I)V

    goto :goto_1

    .line 164
    :cond_9
    iput-wide p2, p0, Landroidx/media2/widget/SubtitleTrack;->mLastUpdateTimeMs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public abstract updateView(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media2/widget/SubtitleTrack$Cue;",
            ">;)V"
        }
    .end annotation
.end method
