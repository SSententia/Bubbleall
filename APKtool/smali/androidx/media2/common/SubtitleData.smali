.class public final Landroidx/media2/common/SubtitleData;
.super Ljava/lang/Object;
.source "SubtitleData.java"

# interfaces
.implements Landroidx/versionedparcelable/VersionedParcelable;


# static fields
.field private static final TAG:Ljava/lang/String; = "SubtitleData"


# instance fields
.field mData:[B

.field mDurationUs:J

.field mStartTimeUs:J


# direct methods
.method constructor <init>()V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JJ[B)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-wide p1, p0, Landroidx/media2/common/SubtitleData;->mStartTimeUs:J

    .line 90
    iput-wide p3, p0, Landroidx/media2/common/SubtitleData;->mDurationUs:J

    .line 91
    iput-object p5, p0, Landroidx/media2/common/SubtitleData;->mData:[B

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 127
    :cond_1
    check-cast p1, Landroidx/media2/common/SubtitleData;

    .line 128
    iget-wide v2, p0, Landroidx/media2/common/SubtitleData;->mStartTimeUs:J

    iget-wide v4, p1, Landroidx/media2/common/SubtitleData;->mStartTimeUs:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Landroidx/media2/common/SubtitleData;->mDurationUs:J

    iget-wide v4, p1, Landroidx/media2/common/SubtitleData;->mDurationUs:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/media2/common/SubtitleData;->mData:[B

    iget-object p1, p1, Landroidx/media2/common/SubtitleData;->mData:[B

    .line 130
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public getData()[B
    .locals 1

    .line 120
    iget-object v0, p0, Landroidx/media2/common/SubtitleData;->mData:[B

    return-object v0
.end method

.method public getDurationUs()J
    .locals 2

    .line 107
    iget-wide v0, p0, Landroidx/media2/common/SubtitleData;->mDurationUs:J

    return-wide v0
.end method

.method public getStartTimeUs()J
    .locals 2

    .line 99
    iget-wide v0, p0, Landroidx/media2/common/SubtitleData;->mStartTimeUs:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    .line 135
    iget-wide v0, p0, Landroidx/media2/common/SubtitleData;->mStartTimeUs:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Landroidx/media2/common/SubtitleData;->mDurationUs:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Landroidx/media2/common/SubtitleData;->mData:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Landroidx/core/util/ObjectsCompat;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
