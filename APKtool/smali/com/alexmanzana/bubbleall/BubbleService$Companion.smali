.class public final Lcom/alexmanzana/bubbleall/BubbleService$Companion;
.super Ljava/lang/Object;
.source "BubbleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/BubbleService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0003\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/BubbleService$Companion;",
        "",
        "()V",
        "isStarting",
        "",
        "()Z",
        "setStarting",
        "(Z)V",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
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

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final isStarting()Z
    .locals 1

    .line 132
    invoke-static {}, Lcom/alexmanzana/bubbleall/BubbleService;->access$isStarting$cp()Z

    move-result v0

    return v0
.end method

.method public final setStarting(Z)V
    .locals 0

    .line 132
    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$setStarting$cp(Z)V

    return-void
.end method

.method public final start(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 136
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result v1

    if-nez v1, :cond_0

    .line 137
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 139
    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 141
    :goto_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->setStarting(Z)V

    return-void
.end method
