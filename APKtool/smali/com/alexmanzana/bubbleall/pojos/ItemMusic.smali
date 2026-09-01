.class public final Lcom/alexmanzana/bubbleall/pojos/ItemMusic;
.super Ljava/lang/Object;
.source "ItemMusic.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J?\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\r\u00a8\u0006#"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "",
        "id",
        "",
        "data",
        "Landroid/net/Uri;",
        "title",
        "",
        "author",
        "image",
        "Landroid/graphics/Bitmap;",
        "(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V",
        "getAuthor",
        "()Ljava/lang/String;",
        "getData",
        "()Landroid/net/Uri;",
        "getId",
        "()J",
        "getImage",
        "()Landroid/graphics/Bitmap;",
        "setImage",
        "(Landroid/graphics/Bitmap;)V",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final author:Ljava/lang/String;

.field private final data:Landroid/net/Uri;

.field private final id:J

.field private image:Landroid/graphics/Bitmap;

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    iput-object p6, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    return-void
.end method

.method public static synthetic copy$default(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    :cond_4
    move-object v6, p6

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->copy(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    return-wide v0
.end method

.method public final component2()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final copy(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;
    .locals 8

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    move-object v1, v0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;-><init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    iget-wide v3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    iget-wide v5, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getData()Landroid/net/Uri;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 6
    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    return-wide v0
.end method

.method public final getImage()Landroid/graphics/Bitmap;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic$$ExternalSyntheticBackport0;->m(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setImage(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItemMusic(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->data:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->author:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->image:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
