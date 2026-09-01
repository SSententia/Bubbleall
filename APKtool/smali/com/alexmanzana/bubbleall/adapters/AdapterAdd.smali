.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AdapterAdd.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0006\u0010\u0016\u001a\u00020\u000fJ\u001e\u0010\u0017\u001a\u00020\u000f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bJ\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;",
        "(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V",
        "items",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
        "Lkotlin/collections/ArrayList;",
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
        "refreshAccess",
        "replaceList",
        "list",
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
.field private final context:Landroid/content/Context;

.field private items:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;


# direct methods
.method public static synthetic $r8$lambda$VOFdGvoxhW9UFT5vv5Da105O984(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->onBindViewHolder$lambda$1(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$n2MKRiS7Bu31Aacnr9tLHDewLok(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    .line 22
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    .line 25
    invoke-static {p1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    .line 26
    const-string v0, "key_shortcut_show_only"

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 27
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_web:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v8, "getString(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_web_description:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lcom/alexmanzana/bubbleall/R$drawable;->ic_web:I

    const/4 v5, 0x0

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->webPanel:I

    const-string v1, "web"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_video:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_video_description:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->videoPanel:I

    const-string v1, "video"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_music:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_music_description:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    sget v6, Lcom/alexmanzana/bubbleall/R$id;->musicPanel:I

    const-string v1, "music"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_0
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-interface {p2, p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;->onClick(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V

    :cond_0
    return-void
.end method

.method private static final onBindViewHolder$lambda$1(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;ILandroid/view/View;)Z
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    iget-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-interface {p2, p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;->onLong(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V
    .locals 1

    .line 54
    instance-of v0, p2, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 55
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p2, 0x0

    .line 56
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 59
    const-string p2, "#1c1c1c"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 20
    check-cast p1, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->getDescription()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getDescription()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceBitmap()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResource()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->setImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 67
    iget-object v0, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    iget-object p1, p1, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance p2, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->adapter_layout_add:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final refreshAccess()V
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 36
    const-string v1, "key_access_show_only"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 41
    :goto_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final replaceList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->items:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->notifyItemRangeChanged(II)V

    return-void
.end method
