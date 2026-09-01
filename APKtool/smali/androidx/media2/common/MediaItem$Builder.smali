.class public Landroidx/media2/common/MediaItem$Builder;
.super Ljava/lang/Object;
.source "MediaItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/common/MediaItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field mEndPositionMs:J

.field mMetadata:Landroidx/media2/common/MediaMetadata;

.field mStartPositionMs:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 263
    iput-wide v0, p0, Landroidx/media2/common/MediaItem$Builder;->mStartPositionMs:J

    const-wide v0, 0x7ffffffffffffffL

    .line 265
    iput-wide v0, p0, Landroidx/media2/common/MediaItem$Builder;->mEndPositionMs:J

    return-void
.end method


# virtual methods
.method public build()Landroidx/media2/common/MediaItem;
    .locals 1

    .line 325
    new-instance v0, Landroidx/media2/common/MediaItem;

    invoke-direct {v0, p0}, Landroidx/media2/common/MediaItem;-><init>(Landroidx/media2/common/MediaItem$Builder;)V

    return-object v0
.end method

.method public setEndPosition(J)Landroidx/media2/common/MediaItem$Builder;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const-wide p1, 0x7ffffffffffffffL

    .line 314
    :cond_0
    iput-wide p1, p0, Landroidx/media2/common/MediaItem$Builder;->mEndPositionMs:J

    return-object p0
.end method

.method public setMetadata(Landroidx/media2/common/MediaMetadata;)Landroidx/media2/common/MediaItem$Builder;
    .locals 0

    .line 282
    iput-object p1, p0, Landroidx/media2/common/MediaItem$Builder;->mMetadata:Landroidx/media2/common/MediaMetadata;

    return-object p0
.end method

.method public setStartPosition(J)Landroidx/media2/common/MediaItem$Builder;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide p1, v0

    .line 298
    :cond_0
    iput-wide p1, p0, Landroidx/media2/common/MediaItem$Builder;->mStartPositionMs:J

    return-object p0
.end method
