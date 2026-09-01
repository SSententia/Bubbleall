.class public final Lcom/alexmanzana/bubbleall/utils/AdBlock;
.super Ljava/lang/Object;
.source "AdBlock.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/utils/AdBlock;",
        "",
        "()V",
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
.field public static final Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

.field private static final hosts:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static isLoaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    .line 15
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->hosts:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getHosts$cp()Ljava/util/HashSet;
    .locals 1

    .line 12
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->hosts:Ljava/util/HashSet;

    return-object v0
.end method

.method public static final synthetic access$isLoaded$cp()Z
    .locals 1

    .line 12
    sget-boolean v0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->isLoaded:Z

    return v0
.end method

.method public static final synthetic access$setLoaded$cp(Z)V
    .locals 0

    .line 12
    sput-boolean p0, Lcom/alexmanzana/bubbleall/utils/AdBlock;->isLoaded:Z

    return-void
.end method
