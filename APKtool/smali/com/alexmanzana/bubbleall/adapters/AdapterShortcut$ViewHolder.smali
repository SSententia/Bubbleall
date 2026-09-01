.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "AdapterShortcut.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "itemView",
        "Landroid/view/View;",
        "(Landroid/view/View;)V",
        "iconView",
        "Landroid/widget/ImageView;",
        "getIconView",
        "()Landroid/widget/ImageView;",
        "text",
        "Landroid/widget/TextView;",
        "getText",
        "()Landroid/widget/TextView;",
        "theme",
        "Landroid/widget/RelativeLayout;",
        "getTheme",
        "()Landroid/widget/RelativeLayout;",
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
.field private final iconView:Landroid/widget/ImageView;

.field private final text:Landroid/widget/TextView;

.field private final theme:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 68
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->itemTheme:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->theme:Landroid/widget/RelativeLayout;

    .line 69
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->textItem:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->text:Landroid/widget/TextView;

    .line 70
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->colorView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->iconView:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final getIconView()Landroid/widget/ImageView;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->iconView:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getText()Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->text:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTheme()Landroid/widget/RelativeLayout;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterShortcut$ViewHolder;->theme:Landroid/widget/RelativeLayout;

    return-object v0
.end method
