.class public final Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "MusicView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/MusicView;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/alexmanzana/bubbleall/views/MusicView$onCreate$2",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;",
        "onSlide",
        "",
        "bottomSheet",
        "Landroid/view/View;",
        "slideOffset",
        "",
        "onStateChanged",
        "newState",
        "",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/views/MusicView;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/views/MusicView;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    .line 151
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onSlide(Landroid/view/View;F)V
    .locals 0

    const-string p2, "bottomSheet"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStateChanged(Landroid/view/View;I)V
    .locals 4

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->buttonHideSheet:I

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    .line 154
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->nextButton:I

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/ImageView;

    .line 155
    iget-object v2, p0, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->backButton:I

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/views/MusicView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/ImageView;

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    sget p2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_keyboard_arrow_up_24:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 159
    :cond_1
    sget p2, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_keyboard_arrow_down_24:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    :goto_0
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/MusicView$onCreate$2;->this$0:Lcom/alexmanzana/bubbleall/views/MusicView;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/MusicView;->access$getCurrentPosition$p(Lcom/alexmanzana/bubbleall/views/MusicView;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    const/16 p1, 0x8

    .line 162
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 163
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 165
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method
