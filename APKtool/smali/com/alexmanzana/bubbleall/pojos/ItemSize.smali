.class public final Lcom/alexmanzana/bubbleall/pojos/ItemSize;
.super Ljava/lang/Object;
.source "ItemSize.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemSize;",
        "",
        "name",
        "",
        "resource",
        "size",
        "(III)V",
        "getName",
        "()I",
        "getResource",
        "getSize",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final name:I

.field private final resource:I

.field private final size:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    iput p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    iput p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/alexmanzana/bubbleall/pojos/ItemSize;IIIILjava/lang/Object;)Lcom/alexmanzana/bubbleall/pojos/ItemSize;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->copy(III)Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    return v0
.end method

.method public final copy(III)Lcom/alexmanzana/bubbleall/pojos/ItemSize;
    .locals 1

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    invoke-direct {v0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;-><init>(III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    iget v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    iget v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    iget p1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getName()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    return v0
.end method

.method public final getResource()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    return v0
.end method

.method public final getSize()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItemSize(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->name:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->resource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
