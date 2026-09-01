.class public final Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;
.super Ljava/lang/Object;
.source "EnterTextDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;",
        "",
        "title",
        "",
        "hint",
        "text",
        "",
        "capText",
        "",
        "isNumber",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;",
        "(IILjava/lang/String;ZZLcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V",
        "show",
        "",
        "context",
        "Landroid/content/Context;",
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
.field private final capText:Z

.field private final hint:I

.field private final isNumber:Z

.field private final listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

.field private final text:Ljava/lang/String;

.field private final title:I


# direct methods
.method public static synthetic $r8$lambda$yIJ8hELD_FwBvSsJQoHVHf2TieY(Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;Landroid/widget/EditText;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->show$lambda$0(Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;Landroid/widget/EditText;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ZZLcom/alexmanzana/bubbleall/listeners/ListenerSuccess;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->title:I

    iput p2, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->hint:I

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->text:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->capText:Z

    iput-boolean p5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->isNumber:Z

    iput-object p6, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    return-void
.end method

.method private static final show$lambda$0(Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;Landroid/widget/EditText;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$editView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->listener:Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/alexmanzana/bubbleall/listeners/ListenerSuccess;->onReceived(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final show(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    invoke-direct {v0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 20
    sget v1, Lcom/alexmanzana/bubbleall/R$layout;->layout_dialog_title:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 21
    sget v4, Lcom/alexmanzana/bubbleall/R$layout;->layout_dialog_edit:I

    invoke-virtual {p1, v4, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 23
    sget v4, Lcom/alexmanzana/bubbleall/R$id;->layoutEdit:I

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "findViewById(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/EditText;

    .line 24
    sget v6, Lcom/alexmanzana/bubbleall/R$id;->titleLayout:I

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/widget/TextView;

    .line 26
    iget v5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->title:I

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(I)V

    .line 27
    iget v5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->hint:I

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setHint(I)V

    .line 28
    iget-object v5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->text:Ljava/lang/String;

    if-nez v5, :cond_0

    const-string v5, ""

    :cond_0
    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-boolean v5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->isNumber:Z

    if-eqz v5, :cond_1

    const/4 v5, 0x2

    .line 31
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_0

    .line 33
    :cond_1
    iget-boolean v5, p0, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;->capText:Z

    if-eqz v5, :cond_2

    const/16 v5, 0x4001

    .line 34
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_0

    :cond_2
    const/4 v5, 0x1

    .line 36
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setInputType(I)V

    .line 40
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setCustomTitle(Landroid/view/View;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 41
    invoke-virtual {v0, p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setView(Landroid/view/View;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 42
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    invoke-virtual {v0, p1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 43
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_accept:I

    new-instance v1, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, v4}, Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/dialogs/EnterTextDialog;Landroid/widget/EditText;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 45
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog;->show()V

    const/4 v0, -0x2

    .line 48
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setAllCaps(Z)V

    const/4 v0, -0x1

    .line 49
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setAllCaps(Z)V

    return-void
.end method
