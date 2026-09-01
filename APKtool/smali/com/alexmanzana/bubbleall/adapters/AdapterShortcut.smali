.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterShortcut.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "grid",
        "",
        "(Landroid/content/Context;Z)V",
        "listAccess",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;",
        "Lkotlin/collections/ArrayList;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;",
        "getListener",
        "()Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;",
        "setListener",
        "(Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V",
        "getItemCount",
        "",
        "onBindViewHolder",
        "",
        "holder",
        "position",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "replaceList",
        "list",
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

.field private final grid:Z

.field private listAccess:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;


# direct methods
.method public static synthetic $r8$lambda$iYgVKb3ii-bsc7SSyIc_Y8j_2hg(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;ILandroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->context:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->grid:Z

    .line 22
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_shortcut:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/alexmanzana/bubbleall/MenuActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_menu:I

    invoke-direct {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;-><init>(ILandroid/content/Intent;I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/alexmanzana/bubbleall/MusicActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_music:I

    invoke-direct {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;-><init>(ILandroid/content/Intent;I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/alexmanzana/bubbleall/VideoActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_video:I

    invoke-direct {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;-><init>(ILandroid/content/Intent;I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_settings_24:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/alexmanzana/bubbleall/SettingsActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_settings:I

    invoke-direct {v0, v1, v2, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;-><init>(ILandroid/content/Intent;I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 19
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;-><init>(Landroid/content/Context;Z)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;ILandroid/view/View;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    if-eqz p0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;->onReceived(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getListener()Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 19
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->getText()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 45
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->grid:Z

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->getInternalColors(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getText()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->context:Landroid/content/Context;

    sget v2, Lcom/alexmanzana/bubbleall/R$color;->colorPrimaryText:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 50
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#4d4d4d"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 52
    :goto_0
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getTheme()Landroid/widget/RelativeLayout;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$drawable;->background_item_color:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 53
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->getIconView()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;->getIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-boolean p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->grid:Z

    const-string v0, "inflate(...)"

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 38
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_color_text_grid:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 40
    :cond_0
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_color_text:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final replaceList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemShortcut;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listAccess:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public final setListener(Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    return-void
.end method
