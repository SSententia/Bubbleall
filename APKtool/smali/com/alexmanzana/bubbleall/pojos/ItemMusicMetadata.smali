.class public final Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;
.super Ljava/lang/Object;
.source "ItemMusicMetadata.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;",
        "",
        "id",
        "",
        "title",
        "",
        "author",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "getAuthor",
        "()Ljava/lang/String;",
        "getId",
        "()J",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;


# instance fields
.field private final author:Ljava/lang/String;

.field private final id:J

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "author"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->copy(JLjava/lang/String;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;
    .locals 1

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "author"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    iget-wide v3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    iget-wide v5, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    iget-object p1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 5
    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic$$ExternalSyntheticBackport0;->m(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItemMusicMetadata(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->author:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
