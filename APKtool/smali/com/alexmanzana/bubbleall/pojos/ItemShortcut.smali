.class public final Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;
.super Ljava/lang/Object;
.source "ItemShortcut.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;",
        "",
        "icon",
        "",
        "intent",
        "Landroid/content/Intent;",
        "text",
        "(ILandroid/content/Intent;I)V",
        "getIcon",
        "()I",
        "getIntent",
        "()Landroid/content/Intent;",
        "getText",
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
.field private final icon:I

.field private final intent:Landroid/content/Intent;

.field private final text:I


# direct methods
.method public constructor <init>(ILandroid/content/Intent;I)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    iput p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;ILandroid/content/Intent;IILjava/lang/Object;)Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->copy(ILandroid/content/Intent;I)Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    return v0
.end method

.method public final component2()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    return v0
.end method

.method public final copy(ILandroid/content/Intent;I)Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;
    .locals 1

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    invoke-direct {v0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;-><init>(ILandroid/content/Intent;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    iget v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    iget-object v3, p1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    iget p1, p1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIcon()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    return v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public final getText()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItemShortcut(icon="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->icon:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", intent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->intent:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->text:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
