.class public final Lcom/alexmanzana/bubbleall/SettingsActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SettingsActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0014J\u0008\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/SettingsActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "loadAd",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onResume",
        "onSupportNavigateUp",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 37
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 38
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 39
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 40
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 42
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 13
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 14
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_settings:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/SettingsActivity;->setContentView(I)V

    .line 15
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 16
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/SettingsActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 18
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "position_settings"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    .line 26
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->contentSettings:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Main;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/Settings$Main;-><init>()V

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->contentSettings:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/Settings$Shortcuts;-><init>()V

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->contentSettings:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Music;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/Settings$Music;-><init>()V

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 22
    :cond_3
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->contentSettings:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Video;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/Settings$Video;-><init>()V

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 21
    :cond_4
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->contentSettings:I

    new-instance v1, Lcom/alexmanzana/bubbleall/Settings$Web;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/Settings$Web;-><init>()V

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 32
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 33
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->loadAd()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/SettingsActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method
