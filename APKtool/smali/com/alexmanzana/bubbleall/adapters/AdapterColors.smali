.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterColors;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterColors.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u001f\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00140\u0019\"\u00020\u0014\u00a2\u0006\u0002\u0010\u001aJ\u0008\u0010\u001b\u001a\u00020\u0017H\u0002J\u0008\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0016J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\u0008\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterColors;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "resource",
        "",
        "listenerColor",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;",
        "modePreview",
        "isListingThemes",
        "",
        "(Landroid/content/Context;ILcom/alexmanzana/bubbleall/listeners/ListenerTheme;IZ)V",
        "colorCurrent",
        "getColorCurrent",
        "()I",
        "setColorCurrent",
        "(I)V",
        "listColors",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "Lkotlin/collections/ArrayList;",
        "addColor",
        "",
        "themes",
        "",
        "([Lcom/alexmanzana/bubbleall/pojos/ItemTheme;)V",
        "disableAll",
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
.field private colorCurrent:I

.field private final listColors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
            ">;"
        }
    .end annotation
.end field

.field private final listenerColor:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

.field private final modePreview:I

.field private final resource:I


# direct methods
.method public static synthetic $r8$lambda$VXo5E8I907t0EpGqrqVKV_b4oz4(Lcom/alexmanzana/bubbleall/adapters/AdapterColors;ILcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterColors;ILcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/alexmanzana/bubbleall/listeners/ListenerTheme;IZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listenerColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->resource:I

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listenerColor:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    iput p4, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->modePreview:I

    .line 19
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    const/4 p3, 0x1

    .line 20
    iput p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    .line 23
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 24
    sget-object p4, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p4}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->blank()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    sget-object p4, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p4}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p5, :cond_0

    .line 27
    sget-object p4, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p4, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p4

    check-cast p4, Ljava/util/Collection;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 28
    sget-object p2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getPosition(Landroid/content/Context;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    add-int/lit8 p3, p1, 0x2

    .line 26
    :cond_0
    iput p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    return-void
.end method

.method private final disableAll()V
    .locals 2

    .line 99
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    const/4 v1, -0x1

    .line 100
    iput v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    .line 101
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->notifyItemChanged(I)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterColors;ILcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;Landroid/view/View;)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$holder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {p3}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result p3

    const/16 v0, -0x7b

    if-eq p3, v0, :cond_0

    .line 88
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->disableAll()V

    .line 89
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getAdapterPosition()I

    move-result p2

    iput p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    .line 90
    iget-object p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listenerColor:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "get(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-interface {p3, p2, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;->onTheme(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;I)V

    .line 91
    iget p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->notifyItemChanged(I)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listenerColor:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    invoke-interface {p0}, Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;->onClick()V

    :goto_0
    return-void
.end method


# virtual methods
.method public final varargs addColor([Lcom/alexmanzana/bubbleall/pojos/ItemTheme;)V
    .locals 2

    const-string v0, "themes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 41
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 42
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    .line 43
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->notifyItemRangeChanged(II)V

    .line 44
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listenerColor:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    iget v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    iget v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    invoke-interface {p1, v0, v1}, Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;->onTheme(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;I)V

    return-void
.end method

.method public final getColorCurrent()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    return v0
.end method

.method public getItemCount()I
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;I)V
    .locals 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v0

    const/16 v1, -0x7b

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eq v0, v1, :cond_6

    .line 53
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getColorView()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 54
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 55
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    if-ne v0, p2, :cond_0

    .line 56
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->itemView:Landroid/view/View;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 60
    :goto_0
    iget v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->modePreview:I

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    .line 77
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto/16 :goto_1

    .line 74
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto/16 :goto_1

    .line 71
    :cond_2
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorWindow()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto/16 :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorTab()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorCurrentTab()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_1

    .line 62
    :cond_5
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_1

    .line 81
    :cond_6
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getColorView()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 82
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getTheme()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 83
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getColorView()Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#4d4d4d"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 84
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->getColorView()Landroid/widget/ImageView;

    move-result-object v0

    iget v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->resource:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 86
    :goto_1
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterColors;ILcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_color:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final refresh(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 110
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->blank()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 113
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v1, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 114
    sget-object p2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {p2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getPosition(Landroid/content/Context;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_0
    move p1, v0

    .line 115
    :goto_0
    iput p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    .line 121
    :cond_1
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->listColors:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public final setColorCurrent(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterColors;->colorCurrent:I

    return-void
.end method
