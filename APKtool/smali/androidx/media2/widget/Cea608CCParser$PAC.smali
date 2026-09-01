.class Landroidx/media2/widget/Cea608CCParser$PAC;
.super Landroidx/media2/widget/Cea608CCParser$StyleCode;
.source "Cea608CCParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media2/widget/Cea608CCParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PAC"
.end annotation


# instance fields
.field final mCol:I

.field final mRow:I


# direct methods
.method constructor <init>(IIII)V
    .locals 0

    .line 381
    invoke-direct {p0, p3, p4}, Landroidx/media2/widget/Cea608CCParser$StyleCode;-><init>(II)V

    .line 382
    iput p1, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mRow:I

    .line 383
    iput p2, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mCol:I

    return-void
.end method

.method static fromBytes(BB)Landroidx/media2/widget/Cea608CCParser$PAC;
    .locals 4

    const/16 v0, 0x8

    .line 357
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/4 v1, 0x7

    and-int/2addr p0, v1

    .line 358
    aget p0, v0, p0

    and-int/lit8 v0, p1, 0x20

    shr-int/lit8 v0, v0, 0x5

    add-int/2addr p0, v0

    and-int/lit8 v0, p1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v3, p1, 0x10

    if-eqz v3, :cond_1

    shr-int/lit8 p1, p1, 0x1

    and-int/2addr p1, v1

    .line 366
    new-instance v1, Landroidx/media2/widget/Cea608CCParser$PAC;

    mul-int/lit8 p1, p1, 0x4

    invoke-direct {v1, p0, p1, v0, v2}, Landroidx/media2/widget/Cea608CCParser$PAC;-><init>(IIII)V

    return-object v1

    :cond_1
    shr-int/lit8 p1, p1, 0x1

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_2

    or-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v2, p1

    .line 376
    :goto_1
    new-instance p1, Landroidx/media2/widget/Cea608CCParser$PAC;

    const/4 v1, -0x1

    invoke-direct {p1, p0, v1, v0, v2}, Landroidx/media2/widget/Cea608CCParser$PAC;-><init>(IIII)V

    return-object p1

    nop

    :array_0
    .array-data 4
        0xb
        0x1
        0x3
        0xc
        0xe
        0x5
        0x7
        0x9
    .end array-data
.end method


# virtual methods
.method getCol()I
    .locals 1

    .line 395
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mCol:I

    return v0
.end method

.method getRow()I
    .locals 1

    .line 391
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mRow:I

    return v0
.end method

.method isIndentPAC()Z
    .locals 1

    .line 387
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mCol:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 400
    iget v0, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mRow:I

    .line 401
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Landroidx/media2/widget/Cea608CCParser$PAC;->mCol:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-super {p0}, Landroidx/media2/widget/Cea608CCParser$StyleCode;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    .line 400
    const-string v0, "{%d, %d}, %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
