.class public final Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;
.super Ljava/lang/Object;
.source "ItemMusicMetadata.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;",
        "",
        "()V",
        "parse",
        "",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
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

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;)Ljava/lang/String;
    .locals 5

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getId()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;->getAuthor()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, v2, v3, v4, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
