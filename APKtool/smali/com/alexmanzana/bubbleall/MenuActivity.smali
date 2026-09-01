.class public final Lcom/alexmanzana/bubbleall/MenuActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MenuActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u0018\u001a\u00020\u000fH\u0014J\u0008\u0010\u0019\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00080\u0007j\u0008\u0012\u0004\u0012\u00020\u0008`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/MenuActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;",
        "()V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;",
        "list",
        "Ljava/util/ArrayList;",
        "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
        "Lkotlin/collections/ArrayList;",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "selectMenu",
        "",
        "loadAd",
        "",
        "onClick",
        "option",
        "position",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onLong",
        "onResume",
        "onSupportNavigateUp",
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

.field private final list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
            ">;"
        }
    .end annotation
.end field

.field private prefs:Landroid/content/SharedPreferences;

.field private selectMenu:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 66
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/MenuActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 67
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 68
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 69
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 71
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V
    .locals 2

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->selectMenu:Z

    if-eqz v0, :cond_1

    .line 87
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->prefs:Landroid/content/SharedPreferences;

    if-nez p1, :cond_0

    const-string p1, "prefs"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 88
    const-string v0, "menu_option"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 89
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 90
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MenuActivity;->finish()V

    goto :goto_1

    .line 92
    :cond_1
    new-instance p2, Landroid/content/Intent;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/alexmanzana/bubbleall/SettingsActivity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceId()I

    move-result p1

    const/4 v0, 0x1

    const-string v1, "position_settings"

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 p1, 0x0

    .line 99
    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 94
    :cond_5
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 101
    :goto_0
    invoke-virtual {p0, p2}, Lcom/alexmanzana/bubbleall/MenuActivity;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 12

    .line 29
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 30
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_menu:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MenuActivity;->setContentView(I)V

    .line 31
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MenuActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 32
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MenuActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 34
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MenuActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 35
    :cond_0
    const-string p1, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lcom/alexmanzana/bubbleall/MenuActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v2, "getSharedPreferences(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->prefs:Landroid/content/SharedPreferences;

    .line 37
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    new-instance v9, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v10, "toString(...)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_web:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v11, "getString(...)"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_web_description:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_web:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    new-instance v9, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_video:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_video_description:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_video_24:I

    const/4 v8, 0x2

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    new-instance v9, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_music:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_music_description:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_library_music_24:I

    const/4 v8, 0x3

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MenuActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "select_menu"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->selectMenu:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 43
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 44
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->prefs:Landroid/content/SharedPreferences;

    if-nez p1, :cond_1

    const-string p1, "prefs"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 45
    const-string v2, "menu_option"

    const/4 v3, -0x1

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 46
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 48
    :cond_2
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    new-instance v9, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_shortcuts:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/alexmanzana/bubbleall/R$string;->text_shortcuts_description:I

    invoke-virtual {p0, v2}, Lcom/alexmanzana/bubbleall/MenuActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lcom/alexmanzana/bubbleall/R$drawable;->ic_baseline_launch_24:I

    const/4 v7, 0x0

    const/4 v8, 0x4

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    :goto_0
    new-instance p1, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    move-object v3, p0

    check-cast v3, Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;

    invoke-direct {p1, v2, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;-><init>(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerAdd;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    .line 52
    iget-object v3, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->list:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->replaceList(Ljava/util/ArrayList;)V

    .line 54
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->menuBubble:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MenuActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 56
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/MenuActivity;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    if-nez v0, :cond_3

    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public onLong(Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V
    .locals 0

    const-string p2, "option"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 61
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 62
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MenuActivity;->loadAd()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 76
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MenuActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method
