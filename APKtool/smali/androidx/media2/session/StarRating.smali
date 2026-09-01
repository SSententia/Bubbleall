.class public final Landroidx/media2/session/StarRating;
.super Ljava/lang/Object;
.source "StarRating.java"

# interfaces
.implements Landroidx/media2/common/Rating;


# static fields
.field private static final RATING_NOT_RATED:F = -1.0f


# instance fields
.field mMaxStars:I

.field mStarRating:F


# direct methods
.method constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 56
    iput p1, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    const/high16 p1, -0x40800000    # -1.0f

    .line 57
    iput p1, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    return-void

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxStars should be a positive integer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(IF)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_1

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_0

    int-to-float v0, p1

    cmpl-float v0, p2, v0

    if-gtz v0, :cond_0

    .line 76
    iput p1, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    .line 77
    iput p2, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    return-void

    .line 74
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "starRating is out of range [0, maxStars]"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxStars should be a positive integer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 92
    instance-of v0, p1, Landroidx/media2/session/StarRating;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 95
    :cond_0
    check-cast p1, Landroidx/media2/session/StarRating;

    .line 96
    iget v0, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    iget v2, p1, Landroidx/media2/session/StarRating;->mMaxStars:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    iget p1, p1, Landroidx/media2/session/StarRating;->mStarRating:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getMaxStars()I
    .locals 1

    .line 111
    iget v0, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    return v0
.end method

.method public getStarRating()F
    .locals 1

    .line 120
    iget v0, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 87
    iget v0, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Landroidx/core/util/ObjectsCompat;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isRated()Z
    .locals 2

    .line 82
    iget v0, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StarRating: maxStars="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media2/session/StarRating;->mMaxStars:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {p0}, Landroidx/media2/session/StarRating;->isRated()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", starRating="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroidx/media2/session/StarRating;->mStarRating:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ", unrated"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
