.class public final Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;
.super Ljava/lang/Object;
.source "ItemPanel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/pojos/ItemPanel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;",
        "",
        "()V",
        "create",
        "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;)Lcom/alexmanzana/bubbleall/pojos/ItemPanel;
    .locals 8

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    .line 9
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResource()I

    move-result v3

    .line 11
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceId()I

    move-result v4

    .line 12
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceBitmap()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, v0

    .line 8
    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    return-object v0
.end method
