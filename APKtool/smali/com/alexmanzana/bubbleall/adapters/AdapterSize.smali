.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterSize;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterSize.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterSize;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSize;",
        "isMini",
        "",
        "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;Z)V",
        "currentSize",
        "",
        "listSize",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemSize;",
        "Lkotlin/collections/ArrayList;",
        "disableAll",
        "",
        "getItemCount",
        "onBindViewHolder",
        "holder",
        "position",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "refresh",
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
.field private final context:Landroid/content/Context;

.field private currentSize:I

.field private final isMini:Z

.field private final listSize:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemSize;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSize;


# direct methods
.method public static synthetic $r8$lambda$9k_lNEO8fci4JD3Auv6rFmtoXVI(Lcom/alexmanzana/bubbleall/adapters/AdapterSize;Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterSize;Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;ILandroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;Z)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSize;

    iput-boolean p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->isMini:Z

    .line 21
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    .line 24
    sget-object p3, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p3, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getSizeBubble(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    .line 25
    new-instance p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    sget p3, Lcom/alexmanzana/bubbleall/R$string;->text_size_big:I

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_big:I

    const/4 v1, 0x0

    invoke-direct {p1, p3, v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;-><init>(III)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    sget p3, Lcom/alexmanzana/bubbleall/R$string;->text_size_medium:I

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_medium:I

    const/4 v1, 0x1

    invoke-direct {p1, p3, v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;-><init>(III)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance p1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    sget p3, Lcom/alexmanzana/bubbleall/R$string;->text_size_small:I

    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_bubble_small:I

    const/4 v1, 0x2

    invoke-direct {p1, p3, v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;-><init>(III)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 18
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;Z)V

    return-void
.end method

.method private final disableAll()V
    .locals 2

    .line 71
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    const/4 v1, -0x1

    .line 72
    iput v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    .line 73
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->notifyItemChanged(I)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterSize;Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;ILandroid/view/View;)V
    .locals 0

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->disableAll()V

    .line 64
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getAdapterPosition()I

    move-result p1

    iput p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    .line 65
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->notifyItemChanged(I)V

    .line 66
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSize;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->getSize()I

    move-result p0

    invoke-interface {p1, p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerSize;->onSize(I)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 18
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    if-ne v0, p2, :cond_0

    .line 45
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    sget v2, Lcom/alexmanzana/bubbleall/R$color;->colorPrimary:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getTheme()Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_1

    .line 48
    :cond_0
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->isMini:Z

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    sget v2, Lcom/alexmanzana/bubbleall/R$color;->colorPrimaryText:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    :goto_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getTheme()Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 55
    :goto_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->getName()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 56
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemSize;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemSize;->getResource()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 57
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->isMini:Z

    if-eqz v0, :cond_2

    .line 58
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#4d4d4d"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 62
    :goto_2
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterSize;Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-boolean p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->isMini:Z

    const-string v0, "inflate(...)"

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 37
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_color_text_mini:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 39
    :cond_0
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_color_text:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize$ViewHolder;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public final refresh()V
    .locals 2

    .line 31
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getSizeBubble(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->currentSize:I

    .line 32
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->listSize:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;->notifyItemRangeChanged(II)V

    return-void
.end method
