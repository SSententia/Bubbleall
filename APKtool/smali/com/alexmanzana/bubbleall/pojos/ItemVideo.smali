.class public final Lcom/alexmanzana/bubbleall/pojos/ItemVideo;
.super Ljava/lang/Object;
.source "ItemVideo.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003JG\u0010\u001b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00082\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
        "Ljava/io/Serializable;",
        "id",
        "",
        "name",
        "duration",
        "",
        "isBucket",
        "",
        "type",
        "",
        "isFavorite",
        "(Ljava/lang/String;Ljava/lang/String;JZIZ)V",
        "getDuration",
        "()J",
        "getId",
        "()Ljava/lang/String;",
        "()Z",
        "getName",
        "getType",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final duration:J

.field private final id:Ljava/lang/String;

.field private final isBucket:Z

.field private final isFavorite:Z

.field private final name:Ljava/lang/String;

.field private final type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JZIZ)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    iput-wide p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    iput-boolean p5, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    iput p6, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    iput-boolean p7, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move v6, p5

    move v7, p6

    .line 5
    invoke-direct/range {v1 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;-><init>(Ljava/lang/String;Ljava/lang/String;JZIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;Ljava/lang/String;Ljava/lang/String;JZIZILjava/lang/Object;)Lcom/alexmanzana/bubbleall/pojos/ItemVideo;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-wide p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    :cond_2
    move-wide v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-boolean p5, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    :cond_3
    move v2, p5

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget p6, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    :cond_4
    move v3, p6

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-boolean p7, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    :cond_5
    move v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-wide p5, v0

    move p7, v2

    move p8, v3

    move p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->copy(Ljava/lang/String;Ljava/lang/String;JZIZ)Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JZIZ)Lcom/alexmanzana/bubbleall/pojos/ItemVideo;
    .locals 9

    const-string v0, "name"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    move-object v1, v0

    move-object v2, p1

    move-wide v4, p3

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;-><init>(Ljava/lang/String;Ljava/lang/String;JZIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    iget-wide v5, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    iget-boolean v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    iget v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    iget-boolean p1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDuration()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    return-wide v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    invoke-static {v1, v2}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic$$ExternalSyntheticBackport0;->m(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isBucket()Z
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    return v0
.end method

.method public final isFavorite()Z
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItemVideo(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isBucket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isBucket:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isFavorite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemVideo;->isFavorite:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
