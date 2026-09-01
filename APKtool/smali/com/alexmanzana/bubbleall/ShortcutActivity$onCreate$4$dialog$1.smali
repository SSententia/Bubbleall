.class public final Lcom/alexmanzana/bubbleall/ShortcutActivity$onCreate$4$dialog$1;
.super Ljava/lang/Object;
.source "ShortcutActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ShortcutActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/alexmanzana/bubbleall/ShortcutActivity$onCreate$4$dialog$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;",
        "onReceived",
        "",
        "item",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/ShortcutActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$onCreate$4$dialog$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceived(Ljava/lang/Object;)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 100
    const-string v2, "http"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$onCreate$4$dialog$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-static {v0, p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->access$loadToAddUrl(Lcom/alexmanzana/bubbleall/ShortcutActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$onCreate$4$dialog$1;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->access$loadToAddUrl(Lcom/alexmanzana/bubbleall/ShortcutActivity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
