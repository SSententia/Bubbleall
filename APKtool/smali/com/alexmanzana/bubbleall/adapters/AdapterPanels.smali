.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterPanels.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\u0008\u0012\u0004\u0012\u00020\u0007`\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0008\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\u0008\u0012\u0004\u0012\u00020\u0007`\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;",
        "panels",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
        "Lkotlin/collections/ArrayList;",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;Ljava/util/ArrayList;)V",
        "active",
        "",
        "position",
        "",
        "disableAll",
        "getItemCount",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "setImage",
        "icon",
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
.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;

.field private final panels:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$0kFp71kQYCeMbsjRgWeGqmP2i0U(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;ILandroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemPanel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "panels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;ILandroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    :try_start_0
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->isActive()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 37
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;

    invoke-interface {p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;->onClose()V

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->active(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method private final setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 52
    instance-of v0, p2, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 53
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 55
    :cond_0
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 56
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 59
    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final active(I)V
    .locals 4

    .line 65
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->disableAll()V

    .line 66
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;

    .line 67
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getId()Ljava/lang/String;

    move-result-object v2

    .line 69
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceId()I

    move-result v3

    .line 66
    invoke-interface {v1, v2, p1, v3}, Lcom/alexmanzana/bubbleall/listeners/ListenerPanel;->onClick(Ljava/lang/String;II)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->setActive(Z)V

    .line 70
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemChanged(I)V

    return-void
.end method

.method public final disableAll()V
    .locals 4

    .line 74
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    .line 75
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v3, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->setActive(Z)V

    .line 76
    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->notifyItemChanged(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 15
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getSizeBubble(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 30
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_big:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_small:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_medium:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 33
    :goto_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceImage()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResourceBitmap()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->getResource()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 34
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->panels:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemPanel;->isActive()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 44
    iget-object p2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorTabSelected(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_1

    .line 46
    :cond_3
    iget-object p2, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getColorTabNotSelected(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :goto_1
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_panel:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterPanels$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
