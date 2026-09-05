.class public final Lcom/alexmanzana/bubbleall/views/AddView;
.super Lcom/alexmanzana/bubbleall/window/Panel;
.source "AddView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0017H\u0016J\u0008\u0010\u001b\u001a\u00020\u0017H\u0016J\u0008\u0010\u001c\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/views/AddView;",
        "Lcom/alexmanzana/bubbleall/window/Panel;",
        "Landroid/view/View$OnClickListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;",
        "isOpenConfig",
        "",
        "listenerAdd",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;",
        "getListenerAdd",
        "()Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;",
        "setListenerAdd",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V",
        "listenerConfig",
        "Ljava/lang/Runnable;",
        "onClick",
        "",
        "v",
        "Landroid/view/View;",
        "onCreate",
        "pause",
        "start",
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
.field private adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

.field private isOpenConfig:Z

.field private listenerAdd:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

.field private final listenerConfig:Ljava/lang/Runnable;


# direct methods
.method public static synthetic $r8$lambda$qqcYqAe5hhsX6RmI4JKxe5xWyGE(Lcom/alexmanzana/bubbleall/views/AddView;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/views/AddView;->listenerConfig$lambda$0(Lcom/alexmanzana/bubbleall/views/AddView;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/AddView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/alexmanzana/bubbleall/views/AddView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/window/Panel;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    new-instance p2, Lcom/alexmanzana/bubbleall/views/AddView$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0, p1}, Lcom/alexmanzana/bubbleall/views/AddView$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/views/AddView;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/AddView;->listenerConfig:Ljava/lang/Runnable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/views/AddView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final listenerConfig$lambda$0(Lcom/alexmanzana/bubbleall/views/AddView;Landroid/content/Context;)V
    .locals 14

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    # save the Context param: the original code below reuses p1 as scratch after .line 77
    move-object v6, p1

    .line 37
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/AddView;->isOpenConfig:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->removeAllViews()V

    .line 39
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->start()V

    goto/16 :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->finishList()Z

    .line 42
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_settings_24:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->requestIconToolbar(Ljava/lang/Object;)V

    .line 43
    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_bubble_config:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->requestTitle(Ljava/lang/String;)V

    .line 44
    sget v0, Lcom/alexmanzana/bubbleall/R$layout;->layout_add_window:I

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {p1, v0, v2}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 45
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->showBubbleTitle:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->showBubbleDesc:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sizeBubbleTitle:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->sizeBubbleDesc:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 52
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->showBubbleImage:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 53
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->hideBubbleImage:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v2, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 55
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->hideBubble:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 56
    sget v2, Lcom/alexmanzana/bubbleall/R$id;->showBubble:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 57
    sget v3, Lcom/alexmanzana/bubbleall/R$id;->sizeBubble:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 59
    new-instance v4, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;

    new-instance v5, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;

    invoke-direct {v5, p1}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$1;-><init>(Landroid/content/Context;)V

    check-cast v5, Lcom/alexmanzana/bubbleall/listeners/ListenerSize;

    invoke-direct {v4, p1, v5, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterSize;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerSize;Z)V

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 69
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->isVisibleBubble()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 70
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 71
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v2, p1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_0

    .line 73
    :cond_1
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 74
    sget p1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v2, p1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 77
    :goto_0
    move-object p1, p0

    check-cast p1, Landroid/view/View$OnClickListener;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    invoke-virtual {v2, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    # tint new titles/descriptions with theme internal color (v6 = saved Context, never overwritten)
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->transparencyTitle:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->transparencyDesc:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardTitle:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardDesc:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    # transparency SeekBar: init from prefs, save + broadcast on change
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->transparencySeek:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/SeekBar;

    const-string v8, "bubble_data_prefs"

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    const-string v9, "theme_alpha"

    const/16 v10, 0xff

    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/SeekBar;->setProgress(I)V

    new-instance v8, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;

    invoke-direct {v8, v6}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$2;-><init>(Landroid/content/Context;)V

    check-cast v8, Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v7, v8}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    # keyboard mode chips: init from prefs, save + broadcast on click
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode0:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v9

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode1:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v10

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode2:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v11

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->keyboardMode3:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v12

    const-string v7, "bubble_data_prefs"

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "keyboard_mode"

    const/4 v13, 0x0

    invoke-interface {v7, v8, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    sget v8, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    sget v13, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {v9, v8}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v10, v8}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v11, v8}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v12, v8}, Landroid/view/View;->setBackgroundResource(I)V

    if-nez v7, :cond_kb1

    invoke-virtual {v9, v13}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_kb

    :cond_kb1
    const/4 v8, 0x1

    if-ne v7, v8, :cond_kb2

    invoke-virtual {v10, v13}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_kb

    :cond_kb2
    const/4 v8, 0x2

    if-ne v7, v8, :cond_kb3

    invoke-virtual {v11, v13}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_kb

    :cond_kb3
    const/4 v8, 0x3

    if-ne v7, v8, :goto_kb

    invoke-virtual {v12, v13}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_kb
    new-instance v7, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;

    move-object v8, v6

    invoke-direct/range {v7 .. v12}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$3;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    check-cast v7, Landroid/view/View$OnClickListener;

    invoke-virtual {v9, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v10, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v11, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v12, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    # restart row: theme tint + broadcast on click
    sget v7, Lcom/alexmanzana/bubbleall/R$id;->restartTitle:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->restartDesc:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->restartBubbleImage:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    sget-object v8, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    invoke-virtual {v8, v6}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setColorFilter(I)V

    sget v7, Lcom/alexmanzana/bubbleall/R$id;->restartBubble:I

    invoke-virtual {p0, v7}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    new-instance v8, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$4;

    invoke-direct {v8, v6}, Lcom/alexmanzana/bubbleall/views/AddView$listenerConfig$1$4;-><init>(Landroid/content/Context;)V

    check-cast v8, Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80

    :goto_1
    iget-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/AddView;->isOpenConfig:Z

    xor-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/views/AddView;->isOpenConfig:Z

    return-void
.end method


# virtual methods
.method public final getListenerAdd()Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView;->listenerAdd:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->hideBubble:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 99
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->showBubble:I

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/AddView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 100
    sget v2, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 101
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 103
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color_current:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 106
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->hideBubble:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->hideBubble()V

    goto :goto_0

    .line 107
    :cond_0
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->showBubble:I

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->showBubble()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate()V
    .locals 3

    .line 32
    invoke-super {p0}, Lcom/alexmanzana/bubbleall/window/Panel;->onCreate()V

    .line 33
    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/AddView;->listenerAdd:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    invoke-direct {v0, v1, v2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    return-void
.end method

.method public pause()V
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->removeAllViews()V

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/views/AddView;->isOpenConfig:Z

    return-void
.end method

.method public final setListenerAdd(Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AddView;->listenerAdd:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    return-void
.end method

.method public start()V
    .locals 4

    .line 89
    invoke-super {p0}, Lcom/alexmanzana/bubbleall/window/Panel;->start()V

    .line 90
    new-instance v0, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_settings_24:I

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/AddView;->listenerConfig:Ljava/lang/Runnable;

    invoke-direct {v0, v1, v2}, Lcom/alexmanzana/bubbleall/window/ButtonToolbar;-><init>(ILjava/lang/Runnable;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/alexmanzana/bubbleall/window/ButtonToolbar;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-virtual {p0, v1}, Lcom/alexmanzana/bubbleall/views/AddView;->requestButtons([Lcom/alexmanzana/bubbleall/window/ButtonToolbar;)V

    .line 91
    sget v0, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_add_24:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->requestIconToolbar(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_add:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/views/AddView;->requestTitle(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AddView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    const-string v1, "adapter"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->refreshAccess()V

    .line 94
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/views/AddView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/views/AddView;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    if-nez v3, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0, v0, v3, v2}, Lcom/alexmanzana/bubbleall/views/AddView;->requestList(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/alexmanzana/bubbleall/listeners/ListenerSwipe;)V

    return-void
.end method
