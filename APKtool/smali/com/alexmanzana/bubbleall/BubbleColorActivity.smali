.class public final Lcom/alexmanzana/bubbleall/BubbleColorActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "BubbleColorActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0007H\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0007H\u0014J\u0008\u0010\r\u001a\u00020\u0007H\u0014J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/BubbleColorActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;",
        "()V",
        "adapterTheme",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;",
        "loadAd",
        "",
        "onClick",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onResume",
        "onSupportNavigateUp",
        "",
        "onTheme",
        "theme",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "position",
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
.field private adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;


# direct methods
.method public static synthetic $r8$lambda$-CCJ6ZQOJByPYoOKLPqKgnBme68(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;ILandroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->onTheme$lambda$2(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;ILandroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$jouq6VKPHVpew1ZC0dc8umC4AxY(Lcom/alexmanzana/bubbleall/BubbleColorActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->onCreate$lambda$0(Lcom/alexmanzana/bubbleall/BubbleColorActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 46
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 47
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 51
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private static final onCreate$lambda$0(Lcom/alexmanzana/bubbleall/BubbleColorActivity;Landroid/view/View;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance p1, Landroid/content/Intent;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 40
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final onTheme$lambda$2(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;ILandroid/content/DialogInterface;I)V
    .locals 0

    const-string p3, "$theme"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$0"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 77
    sget-object p3, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;

    move-object p4, p1

    check-cast p4, Landroid/content/Context;

    invoke-virtual {p3, p4, p0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->delete(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    iget-object p0, p1, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    if-nez p0, :cond_0

    const-string p0, "adapterTheme"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {p0, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->delete(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 25
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_bubble_color:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->setContentView(I)V

    .line 27
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 28
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 30
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 32
    :cond_0
    new-instance p1, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    move-object v1, p0

    check-cast v1, Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;

    invoke-direct {p1, v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerTheme;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    .line 34
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->themesList:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 36
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    if-nez v0, :cond_1

    const-string v0, "adapterTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 38
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->buttonAddTheme:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/BubbleColorActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 67
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 68
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    if-nez v0, :cond_0

    const-string v0, "adapterTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->clear()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 56
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 57
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->adapterTheme:Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;

    if-nez v0, :cond_0

    const-string v0, "adapterTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/adapters/AdapterTheme;->refresh()V

    .line 58
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->loadAd()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 62
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method

.method public onTheme(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;I)V
    .locals 3

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 73
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_delete_theme:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 74
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_message_delete:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 75
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_accept:I

    new-instance v2, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p1, p0, p2}, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 81
    sget p1, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 82
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->show()Landroidx/appcompat/app/AlertDialog;

    return-void
.end method
