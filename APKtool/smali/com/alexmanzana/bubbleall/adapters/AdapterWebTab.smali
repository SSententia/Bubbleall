.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterWebTab.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\u0008\u0012\u0004\u0012\u00020\u0007`\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0008\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\u0008\u0012\u0004\u0012\u00020\u0007`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemWeb;",
        "Lkotlin/collections/ArrayList;",
        "currentPosition",
        "",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;Ljava/util/ArrayList;I)V",
        "getList",
        "()Ljava/util/ArrayList;",
        "getItemCount",
        "onBindViewHolder",
        "",
        "holder",
        "position",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "remove",
        "item",
        "setImage",
        "view",
        "Landroid/widget/ImageView;",
        "image",
        "",
        "ViewHolder",
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
.field private currentPosition:I

.field private final list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemWeb;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;


# direct methods
.method public static synthetic $r8$lambda$LogxbGrybL0MU3XUeOX7yJqv70o(ILcom/alexmanzana/bubbleall/adapters/AdapterWebTab;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->onBindViewHolder$lambda$0(ILcom/alexmanzana/bubbleall/adapters/AdapterWebTab;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;Ljava/util/ArrayList;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemWeb;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    iput p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(ILcom/alexmanzana/bubbleall/adapters/AdapterWebTab;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget p2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    if-eq p0, p2, :cond_0

    .line 33
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;

    invoke-interface {p1, p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;->onClick(I)V

    :cond_0
    return-void
.end method

.method private final setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 3

    .line 52
    instance-of v0, p2, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 54
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 56
    :cond_0
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 57
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemWeb;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 16
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;I)V
    .locals 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    if-eq v0, p2, :cond_1

    .line 24
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_web:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#89CD6D"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 27
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_check:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    :goto_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemWeb;->getUrl()Ljava/lang/String;

    move-result-object v1

    :goto_1
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$$ExternalSyntheticLambda0;

    invoke-direct {v0, p2, p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$$ExternalSyntheticLambda0;-><init>(ILcom/alexmanzana/bubbleall/adapters/AdapterWebTab;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_webview_tab:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final remove(I)V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 40
    iget v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    if-eqz v1, :cond_0

    if-eq p1, v0, :cond_0

    add-int/lit8 v1, v1, -0x1

    .line 42
    iput v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 46
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->notifyItemRemoved(I)V

    .line 47
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->notifyItemRangeChanged(II)V

    .line 48
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;

    iget v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterWebTab;->currentPosition:I

    invoke-interface {v0, p1, v1}, Lcom/alexmanzana/bubbleall/listeners/ListenerWebTab;->onRemove(II)V

    return-void
.end method
