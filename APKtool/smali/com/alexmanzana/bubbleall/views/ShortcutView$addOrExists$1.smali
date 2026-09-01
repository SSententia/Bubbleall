.class public final Lcom/alexmanzana/bubbleall/views/ShortcutView$addOrExists$1;
.super Lcom/alexmanzana/bubbleall/utils/ListenerWebUtil;
.source "ShortcutView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/ShortcutView;->addOrExists(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/ShortcutView$addOrExists$1",
        "Lcom/alexmanzana/bubbleall/utils/ListenerWebUtil;",
        "onLoaded",
        "",
        "url",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/ShortcutView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$addOrExists$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    .line 331
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ListenerWebUtil;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoaded(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$addOrExists$1;->this$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->access$getMManager$p(Lcom/alexmanzana/bubbleall/views/ShortcutView;)Landroid/app/NotificationManager;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v0, 0x4e

    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method
