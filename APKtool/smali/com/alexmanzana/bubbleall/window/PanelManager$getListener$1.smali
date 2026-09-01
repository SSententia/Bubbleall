.class public final Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;
.super Ljava/lang/Object;
.source "PanelManager.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0008\u0010\n\u001a\u00020\u0003H\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u0003H\u0016J\u0008\u0010\u000e\u001a\u00020\u000cH\u0016J!\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0010\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\u0011\"\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J&\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\u0008\u00030\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0008\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0007H\u0016\u00a8\u0006%"
    }
    d2 = {
        "com/alexmanzana/bubbleall/window/PanelManager$getListener$1",
        "Lcom/alexmanzana/bubbleall/window/PanelManager$Listener;",
        "argsOnPanel",
        "",
        "id",
        "",
        "data",
        "",
        "icon",
        "",
        "closeManager",
        "finishList",
        "",
        "hideBubble",
        "isVisibleBubble",
        "requestButtons",
        "buttons",
        "",
        "Lcom/alexmanzana/bubbleall/window/ButtonToolbar;",
        "([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V",
        "requestIconToolbar",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "idPanel",
        "resource",
        "requestList",
        "layoutManager",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
        "adapter",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "callback",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
        "requestTitleToolbar",
        "title",
        "showBubble",
        "toast",
        "text",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/window/PanelManager;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public argsOnPanel(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 9

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 141
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v0, :cond_2

    .line 142
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 143
    invoke-virtual {v0, p1, p2}, Lcom/alexmanzana/bubbleall/window/PanelManager;->setDataExtra(ILjava/lang/Object;)V

    .line 145
    instance-of v1, p3, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 146
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-interface {v0, v8}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->addBubbleInPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V

    goto :goto_0

    .line 148
    :cond_0
    instance-of v1, p3, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 149
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    move-object v5, p3

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    move-object v1, v8

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-interface {v0, v8}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->addBubbleInPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v8, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    move-object v6, p3

    check-cast v6, Landroid/graphics/Bitmap;

    const/4 v7, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v7}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;-><init>(Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Z)V

    invoke-interface {v0, v8}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->addBubbleInPanels(Lcom/alexmanzana/bubbleall/pojos/ItemPanel;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public closeManager()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->hideNormal()V

    :cond_0
    return-void
.end method

.method public finishList()Z
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->endList()Z

    move-result v0

    return v0
.end method

.method public hideBubble()V
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->hideBubble()V

    :cond_0
    return-void
.end method

.method public isVisibleBubble()Z
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->isVisibleBubble()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public varargs requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V
    .locals 2

    const-string v0, "buttons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    invoke-static {v0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$buttons(Lcom/alexmanzana/bubbleall/window/PanelManager;[Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    return-void
.end method

.method public requestIconToolbar(ILjava/lang/String;)V
    .locals 3

    const-string v0, "idPanel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$getCurrentId$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 161
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 162
    instance-of v2, v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v2, :cond_0

    .line 163
    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->getIdPanel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 164
    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->requestIcon(I)V

    :cond_0
    return-void
.end method

.method public requestIconToolbar(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idPanel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$getCurrentId$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 192
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 193
    instance-of v2, v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v2, :cond_0

    .line 194
    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->getIdPanel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 195
    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->requestIcon(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public requestList(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;",
            ")V"
        }
    .end annotation

    const-string v0, "layoutManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {v0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$list(Lcom/alexmanzana/bubbleall/window/PanelManager;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V

    return-void
.end method

.method public requestTitleToolbar(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idPanel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->access$getCurrentId$p(Lcom/alexmanzana/bubbleall/window/PanelManager;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 122
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    .line 123
    instance-of v2, v0, Lcom/alexmanzana/bubbleall/window/Panel;

    if-eqz v2, :cond_0

    .line 124
    check-cast v0, Lcom/alexmanzana/bubbleall/window/Panel;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/Panel;->getIdPanel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 125
    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->requestTitle(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public showBubble()V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/window/PanelManager;->getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/alexmanzana/bubbleall/listeners/ListenerWindow;->activeBubble()V

    :cond_0
    return-void
.end method

.method public toast(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/window/PanelManager$getListener$1;->this$0:Lcom/alexmanzana/bubbleall/window/PanelManager;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/window/PanelManager;->showToast(Ljava/lang/String;)V

    return-void
.end method
