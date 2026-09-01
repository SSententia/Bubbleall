.class public final Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;
.super Ljava/lang/Object;
.source "ItemTheme.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;",
        "",
        "()V",
        "blank",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "default",
        "text",
        "",
        "forVal",
        "color",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final blank()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 9

    .line 27
    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    const/16 v6, -0x7b

    const/4 v7, 0x0

    const-string v1, ""

    const/16 v2, -0x7b

    const/16 v3, -0x7b

    const/16 v4, -0x7b

    const/16 v5, -0x7b

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;-><init>(Ljava/lang/String;IIIIILjava/lang/String;)V

    return-object v8
.end method

.method public final default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 1

    .line 37
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default(Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object v0

    return-object v0
.end method

.method public final default(Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 9

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    .line 42
    const-string v1, "#3F51B5"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 43
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 44
    const-string v1, "#FFFFFF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 45
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 46
    const-string v1, "#1c1c1c"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    .line 41
    invoke-direct/range {v1 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;-><init>(Ljava/lang/String;IIIIILjava/lang/String;)V

    return-object v0
.end method

.method public final forVal(I)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 9

    .line 17
    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    const-string v1, ""

    const/4 v7, 0x0

    move-object v0, v8

    move v2, p1

    move v3, p1

    move v4, p1

    move v5, p1

    move v6, p1

    invoke-direct/range {v0 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;-><init>(Ljava/lang/String;IIIIILjava/lang/String;)V

    return-object v8
.end method
