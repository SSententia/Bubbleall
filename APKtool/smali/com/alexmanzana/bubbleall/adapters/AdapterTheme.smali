.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterTheme.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0008\u0010\u0011\u001a\u00020\u0010H\u0002J\u0008\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "listenerClick",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;",
        "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;)V",
        "themes",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "Lkotlin/collections/ArrayList;",
        "clear",
        "",
        "delete",
        "position",
        "",
        "dp1",
        "getItemCount",
        "onBindViewHolder",
        "holder",
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

.field private final listenerClick:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

.field private final themes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$AX4ZtKSG0P38QcZWkX-3J5hG-OM(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->onBindViewHolder$lambda$1(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$TdTbtUqQfOpPu1hEpOg4qGd0GG8(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->onBindViewHolder$lambda$1$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listenerClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->listenerClick:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    .line 25
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    .line 28
    sget-object v0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_default:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default(Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private final dp1()I
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    const/16 v1, 0xa0

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private static final onBindViewHolder$lambda$1(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/View;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 62
    const-string v1, "theme_selected"

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    .line 63
    :goto_0
    new-instance v0, Landroidx/appcompat/widget/PopupMenu;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Landroidx/appcompat/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 64
    sget p2, Lcom/alexmanzana/bubbleall/R$menu;->menu_themes_options:I

    invoke-virtual {v0, p2}, Landroidx/appcompat/widget/PopupMenu;->inflate(I)V

    if-nez p1, :cond_1

    .line 66
    invoke-virtual {v0}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object p2

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->deleteTheme:I

    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 67
    invoke-virtual {v0}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object p2

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->editTheme:I

    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    goto :goto_1

    .line 69
    :cond_1
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 70
    invoke-virtual {v0}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object p2

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->deleteTheme:I

    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 73
    :cond_2
    :goto_1
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;I)V

    invoke-virtual {v0, p2}, Landroidx/appcompat/widget/PopupMenu;->setOnMenuItemClickListener(Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 84
    invoke-virtual {v0}, Landroidx/appcompat/widget/PopupMenu;->show()V

    return-void
.end method

.method private static final onBindViewHolder$lambda$1$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;ILandroid/view/MenuItem;)Z
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->deleteTheme:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 75
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->listenerClick:Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-interface {p2, p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;->onTheme(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;I)V

    goto :goto_1

    .line 76
    :cond_0
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->editTheme:I

    if-eq v0, v1, :cond_1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->duplicateTheme:I

    if-ne v0, v1, :cond_3

    .line 77
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    const-class v3, Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object p1

    const-string v1, "uuid"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    sget p2, Lcom/alexmanzana/bubbleall/R$id;->duplicateTheme:I

    if-ne p1, p2, :cond_2

    move p1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    const-string p2, "duplicate"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 80
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_3
    :goto_1
    return v2
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 44
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public final delete(I)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 38
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->notifyItemRemoved(I)V

    .line 39
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;I)V
    .locals 4

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;->getIcon()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 55
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->windowBubble:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/graphics/drawable/GradientDrawable;

    .line 56
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->dp1()I

    move-result v2

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v3}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 57
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorWindow()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 58
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->colorBubble:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 60
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;->getButton()Landroid/widget/ImageView;

    move-result-object p1

    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;I)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_theme:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final refresh()V
    .locals 4

    .line 93
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_default:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default(Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 96
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->themes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->notifyItemRangeChanged(II)V

    return-void
.end method
