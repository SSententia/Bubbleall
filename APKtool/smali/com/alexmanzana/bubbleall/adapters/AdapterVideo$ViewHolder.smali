.class public final Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "AdapterVideo.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "itemView",
        "Landroid/view/View;",
        "(Landroid/view/View;)V",
        "duration",
        "Landroid/widget/TextView;",
        "getDuration",
        "()Landroid/widget/TextView;",
        "image",
        "Landroid/widget/ImageView;",
        "getImage",
        "()Landroid/widget/ImageView;",
        "text",
        "getText",
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
.field private final duration:Landroid/widget/TextView;

.field private final image:Landroid/widget/ImageView;

.field private final text:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 128
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->durationText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->duration:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->imageVideo:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->image:Landroid/widget/ImageView;

    .line 130
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->titleVideo:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->text:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final getDuration()Landroid/widget/TextView;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->duration:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getImage()Landroid/widget/ImageView;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->image:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getText()Landroid/widget/TextView;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterVideo$ViewHolder;->text:Landroid/widget/TextView;

    return-object v0
.end method
