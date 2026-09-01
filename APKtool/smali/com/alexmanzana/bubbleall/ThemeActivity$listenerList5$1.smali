.class public final Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;
.super Ljava/lang/Object;
.source "ThemeActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ThemeActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/alexmanzana/bubbleall/ThemeActivity$listenerList5$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;",
        "onClick",
        "",
        "onTheme",
        "theme",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "position",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/ThemeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    .line 396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 2

    .line 403
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/ThemeActivity;->access$getAdapter5$p(Lcom/alexmanzana/bubbleall/ThemeActivity;)Lcom/alexmanzana/bubbleall/adapters/AdapterColors;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "adapter5"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/ThemeActivity;->access$selectColor(Lcom/alexmanzana/bubbleall/ThemeActivity;Lcom/alexmanzana/bubbleall/adapters/AdapterColors;)V

    return-void
.end method

.method public onTheme(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;I)V
    .locals 1

    const-string p2, "theme"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result v0

    invoke-static {p2, v0}, Lcom/alexmanzana/bubbleall/ThemeActivity;->access$text(Lcom/alexmanzana/bubbleall/ThemeActivity;I)V

    .line 399
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$listenerList5$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/ThemeActivity;->access$getThemeCreating$p(Lcom/alexmanzana/bubbleall/ThemeActivity;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p2

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->setColorInternal(I)V

    return-void
.end method
