.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "AdapterAdd.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0008\"\u0004\u0008\u0013\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "itemView",
        "Landroid/view/View;",
        "(Landroid/view/View;)V",
        "description",
        "Landroid/widget/TextView;",
        "getDescription",
        "()Landroid/widget/TextView;",
        "setDescription",
        "(Landroid/widget/TextView;)V",
        "icon",
        "Landroid/widget/ImageView;",
        "getIcon",
        "()Landroid/widget/ImageView;",
        "setIcon",
        "(Landroid/widget/ImageView;)V",
        "title",
        "getTitle",
        "setTitle",
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
.field private description:Landroid/widget/TextView;

.field private icon:Landroid/widget/ImageView;

.field private title:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 81
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->titleItem:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->title:Landroid/widget/TextView;

    .line 82
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->descriptionItem:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->description:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->imageIcon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->icon:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final getDescription()Landroid/widget/TextView;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->description:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getIcon()Landroid/widget/ImageView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->icon:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getTitle()Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->title:Landroid/widget/TextView;

    return-object v0
.end method

.method public final setDescription(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->description:Landroid/widget/TextView;

    return-void
.end method

.method public final setIcon(Landroid/widget/ImageView;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->icon:Landroid/widget/ImageView;

    return-void
.end method

.method public final setTitle(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd$ViewHolder;->title:Landroid/widget/TextView;

    return-void
.end method
