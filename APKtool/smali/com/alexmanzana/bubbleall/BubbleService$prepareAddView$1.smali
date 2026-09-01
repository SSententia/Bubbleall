.class public final Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;
.super Ljava/lang/Object;
.source "BubbleService.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubbleService;->prepareAddView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubbleService$prepareAddView$1",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;",
        "onClick",
        "",
        "option",
        "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
        "position",
        "",
        "onLong",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubbleService;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V
    .locals 4

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$existsPanel(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "adapter"

    if-eqz v0, :cond_1

    .line 392
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPositionForId(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V

    goto :goto_2

    .line 394
    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->disableAll()V

    .line 395
    sget-object v0, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel$Companion;->create(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;)Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    move-result-object p1

    .line 396
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getPanels$p(Lcom/alexmanzana/bubbleall/BubbleService;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    invoke-virtual {v1, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemInserted(I)V

    .line 398
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->onClick(Ljava/lang/String;II)Z

    :goto_2
    return-void
.end method

.method public onLong(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V
    .locals 4

    const-string p2, "option"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/alexmanzana/bubbleall/BubbleService;->access$existsPanel(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 404
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceId()I

    move-result p2

    .line 405
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->shortcutPanel:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_2

    .line 406
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMPanelManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/window/PanelManager;

    move-result-object p2

    const-string v0, "mPanelManager"

    if-nez p2, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v1

    :cond_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceId()I

    move-result v2

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v3, ""

    invoke-virtual {p2, v2, p1, v3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->args(ILjava/lang/String;Ljava/lang/Object;)V

    .line 407
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/BubbleService;->access$getMPanelManager$p(Lcom/alexmanzana/bubbleall/BubbleService;)Lcom/alexmanzana/bubbleall/window/PanelManager;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    sget p2, Lcom/alexmanzana/bubbleall/R$string;->text_shortcut_clean:I

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/BubbleService;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 409
    :cond_2
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->videoPanel:I

    const/4 v0, 0x1

    const/high16 v2, 0x10000000

    if-ne p2, p1, :cond_3

    .line 410
    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    check-cast p2, Landroid/content/Context;

    const-class v3, Lcom/alexmanzana/bubbleall/VideoActivity;

    invoke-direct {p1, p2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 411
    invoke-virtual {p1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 412
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->startActivity(Landroid/content/Intent;)V

    .line 413
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1, v1, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V

    goto :goto_1

    .line 415
    :cond_3
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->musicPanel:I

    if-ne p2, p1, :cond_4

    .line 416
    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    check-cast p2, Landroid/content/Context;

    const-class v3, Lcom/alexmanzana/bubbleall/MusicActivity;

    invoke-direct {p1, p2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 417
    invoke-virtual {p1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 418
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/BubbleService;->startActivity(Landroid/content/Intent;)V

    .line 419
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$prepareAddView$1;->this$0:Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-static {p1, v1, v0, v1}, Lcom/alexmanzana/bubbleall/BubbleService;->closeManager$default(Lcom/alexmanzana/bubbleall/BubbleService;Ljava/lang/Runnable;ILjava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method
