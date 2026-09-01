.class public Landroidx/media2/common/MediaItem;
.super Landroidx/versionedparcelable/CustomVersionedParcelable;
.source "MediaItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/common/MediaItem$OnMetadataChangedListener;,
        Landroidx/media2/common/MediaItem$Builder;
    }
.end annotation


# static fields
.field static final LONG_MAX:J = 0x7ffffffffffffffL

.field public static final POSITION_UNKNOWN:J = 0x7ffffffffffffffL

.field private static final TAG:Ljava/lang/String; = "MediaItem"


# instance fields
.field mEndPositionMs:J

.field private final mListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/core/util/Pair<",
            "Landroidx/media2/common/MediaItem$OnMetadataChangedListener;",
            "Ljava/util/concurrent/Executor;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mLock:Ljava/lang/Object;

.field mMetadata:Landroidx/media2/common/MediaMetadata;

.field mStartPositionMs:J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 98
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    .line 78
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 84
    iput-wide v0, p0, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    const-wide v0, 0x7ffffffffffffffL

    .line 86
    iput-wide v0, p0, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Landroidx/media2/common/MediaItem$Builder;)V
    .locals 6

    .line 108
    iget-object v1, p1, Landroidx/media2/common/MediaItem$Builder;->mMetadata:Landroidx/media2/common/MediaMetadata;

    iget-wide v2, p1, Landroidx/media2/common/MediaItem$Builder;->mStartPositionMs:J

    iget-wide v4, p1, Landroidx/media2/common/MediaItem$Builder;->mEndPositionMs:J

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaMetadata;JJ)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/common/MediaItem;)V
    .locals 6

    .line 112
    iget-object v1, p1, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    iget-wide v2, p1, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    iget-wide v4, p1, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaMetadata;JJ)V

    return-void
.end method

.method constructor <init>(Landroidx/media2/common/MediaMetadata;JJ)V
    .locals 6

    .line 116
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    .line 78
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 84
    iput-wide v0, p0, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    const-wide v0, 0x7ffffffffffffffL

    .line 86
    iput-wide v0, p0, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    .line 91
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    cmp-long v2, p2, p4

    if-gtz v2, :cond_2

    if-eqz p1, :cond_1

    .line 121
    const-string v2, "android.media.metadata.DURATION"

    invoke-virtual {p1, v2}, Landroidx/media2/common/MediaMetadata;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 122
    invoke-virtual {p1, v2}, Landroidx/media2/common/MediaMetadata;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    cmp-long v0, p4, v0

    if-eqz v0, :cond_1

    cmp-long v0, p4, v2

    if-gtz v0, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "endPositionMs shouldn\'t be greater than duration in the metdata, endPositionMs="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ", durationMs="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 130
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    .line 131
    iput-wide p2, p0, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    .line 132
    iput-wide p4, p0, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    return-void

    .line 118
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal start/end position: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " : "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addOnMetadataChangedListener(Ljava/util/concurrent/Executor;Landroidx/media2/common/MediaItem$OnMetadataChangedListener;)V
    .locals 3

    .line 232
    iget-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 233
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/util/Pair;

    .line 234
    iget-object v2, v2, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    if-ne v2, p2, :cond_0

    .line 235
    monitor-exit v0

    return-void

    .line 238
    :cond_1
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    new-instance v2, Landroidx/core/util/Pair;

    invoke-direct {v2, p2, p1}, Landroidx/core/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getEndPosition()J
    .locals 2

    .line 207
    iget-wide v0, p0, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    return-wide v0
.end method

.method public getMediaId()Ljava/lang/String;
    .locals 3

    .line 220
    iget-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 221
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    if-eqz v1, :cond_0

    .line 222
    const-string v2, "android.media.metadata.MEDIA_ID"

    invoke-virtual {v1, v2}, Landroidx/media2/common/MediaMetadata;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 223
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getMetadata()Landroidx/media2/common/MediaMetadata;
    .locals 2

    .line 188
    iget-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 189
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 190
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getStartPosition()J
    .locals 2

    .line 198
    iget-wide v0, p0, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    return-wide v0
.end method

.method public onPreParceling(Z)V
    .locals 2

    .line 347
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroidx/media2/common/MediaItem;

    if-ne v0, v1, :cond_0

    .line 350
    invoke-super {p0, p1}, Landroidx/versionedparcelable/CustomVersionedParcelable;->onPreParceling(Z)V

    return-void

    .line 348
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "MediaItem\'s subclasses shouldn\'t be parcelized."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeOnMetadataChangedListener(Landroidx/media2/common/MediaItem$OnMetadataChangedListener;)V
    .locals 3

    .line 247
    iget-object v0, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 248
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 249
    iget-object v2, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/util/Pair;

    iget-object v2, v2, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    if-ne v2, p1, :cond_0

    .line 250
    iget-object p1, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 251
    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 254
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setMetadata(Landroidx/media2/common/MediaMetadata;)V
    .locals 4

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 157
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 158
    :try_start_0
    iget-object v2, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    if-ne v2, p1, :cond_0

    .line 159
    monitor-exit v1

    return-void

    :cond_0
    if-eqz v2, :cond_1

    if-eqz p1, :cond_1

    .line 162
    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroidx/media2/common/MediaMetadata;->getMediaId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 163
    const-string p1, "MediaItem"

    const-string v0, "MediaItem\'s media ID shouldn\'t be changed"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    monitor-exit v1

    return-void

    .line 166
    :cond_1
    iput-object p1, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    .line 167
    iget-object v2, p0, Landroidx/media2/common/MediaItem;->mListeners:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 168
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/util/Pair;

    .line 171
    iget-object v2, v1, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Landroidx/media2/common/MediaItem$OnMetadataChangedListener;

    .line 172
    iget-object v1, v1, Landroidx/core/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/media2/common/MediaItem$1;

    invoke-direct {v3, p0, v2, p1}, Landroidx/media2/common/MediaItem$1;-><init>(Landroidx/media2/common/MediaItem;Landroidx/media2/common/MediaItem$OnMetadataChangedListener;Landroidx/media2/common/MediaMetadata;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 168
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    iget-object v1, p0, Landroidx/media2/common/MediaItem;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 139
    :try_start_0
    const-string v2, "{Media Id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/media2/common/MediaItem;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v2, ", mMetadata="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/media2/common/MediaItem;->mMetadata:Landroidx/media2/common/MediaMetadata;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    const-string v2, ", mStartPositionMs="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/media2/common/MediaItem;->mStartPositionMs:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    const-string v2, ", mEndPositionMs="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/media2/common/MediaItem;->mEndPositionMs:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 144
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
