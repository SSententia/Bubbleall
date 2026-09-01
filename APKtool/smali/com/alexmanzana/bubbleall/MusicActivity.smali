.class public final Lcom/alexmanzana/bubbleall/MusicActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MusicActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\n\u001a\u00020\u000bH\u0002J\u0008\u0010\u000c\u001a\u00020\u000bH\u0002J\u0008\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u000bH\u0014J\u0008\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00080\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/MusicActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerMusic;",
        "()V",
        "mHandler",
        "Landroid/os/Handler;",
        "requestPermission",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "",
        "kotlin.jvm.PlatformType",
        "dialog",
        "",
        "list",
        "loadAd",
        "onClick",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "position",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "",
        "menu",
        "Landroid/view/Menu;",
        "onOptionsItemSelected",
        "Landroid/view/MenuItem;",
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
.field private mHandler:Landroid/os/Handler;

.field private final requestPermission:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$DtWIihOScs-BasDyDr6VpUlWGUE(Lcom/alexmanzana/bubbleall/MusicActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/MusicActivity;->dialog$lambda$0(Lcom/alexmanzana/bubbleall/MusicActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$aafqRduldjbfYygR1la2ZCpEto0(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->requestPermission$lambda$1(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 104
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/alexmanzana/bubbleall/MusicActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/MusicActivity$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/MusicActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/MusicActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/MusicActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public static final synthetic access$getMHandler$p(Lcom/alexmanzana/bubbleall/MusicActivity;)Landroid/os/Handler;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/MusicActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method private final dialog()V
    .locals 3

    .line 65
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 66
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_music:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 67
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_music_dialog:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 68
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_continue:I

    new-instance v2, Lcom/alexmanzana/bubbleall/MusicActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/MusicActivity$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/MusicActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 75
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 76
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->show()Landroidx/appcompat/app/AlertDialog;

    return-void
.end method

.method private static final dialog$lambda$0(Lcom/alexmanzana/bubbleall/MusicActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_0

    .line 70
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/MusicActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    const-string p1, "android.permission.READ_MEDIA_AUDIO"

    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    goto :goto_0

    .line 72
    :cond_0
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/MusicActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final list()V
    .locals 3

    .line 111
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/MusicPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/MusicActivity$list$1;-><init>(Lcom/alexmanzana/bubbleall/MusicActivity;)V

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;

    invoke-virtual {v0, v1, v2}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;->list(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;)V

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 95
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/MusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 96
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 97
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 98
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 100
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private static final requestPermission$lambda$1(Lcom/alexmanzana/bubbleall/MusicActivity;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 106
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->list()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;I)V
    .locals 6

    const-string p2, "item"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    move-object p2, p0

    check-cast p2, Landroid/content/Context;

    invoke-static {p2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 134
    new-instance v1, Lcom/alexmanzana/bubbleall/pojos/ItemData;

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->musicPanel:I

    sget-object v3, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;

    invoke-virtual {v3, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemMusicMetadata$Companion;->parse(Lcom/alexmanzana/bubbleall/pojos/ItemMusic;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "music"

    invoke-direct {v1, v3, v2, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemData;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 135
    sget-object p1, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result p1

    const/4 v2, 0x1

    const-string v3, "com.alexmanzana.bubbleall.EXTRA_ITEM_DATA"

    const-string v4, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    if-nez p1, :cond_0

    .line 136
    new-instance p1, Landroid/content/Intent;

    const-class v5, Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-direct {p1, p2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 137
    invoke-virtual {p1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 139
    const-string p2, "key_only_music"

    invoke-interface {v0, p2, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    const-string v0, "com.alexmanzana.bubbleall.EXTRA_ITEM_ONLY"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 140
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 142
    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 144
    const-string p2, "com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER"

    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 145
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->sendBroadcast(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 39
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_music:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->setContentView(I)V

    .line 41
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 42
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 44
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 46
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/MusicActivity;->mHandler:Landroid/os/Handler;

    .line 48
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_2

    .line 49
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    invoke-static {p1, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    .line 50
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->list()V

    goto :goto_0

    .line 52
    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->dialog()V

    goto :goto_0

    .line 55
    :cond_2
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_3

    .line 56
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->list()V

    goto :goto_0

    .line 58
    :cond_3
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->dialog()V

    :goto_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 80
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$menu;->activity_music:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->configMusic:I

    if-ne v0, v1, :cond_0

    .line 86
    new-instance p1, Landroid/content/Intent;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/alexmanzana/bubbleall/SettingsActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 87
    const-string v0, "position_settings"

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 88
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/MusicActivity;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x1

    return p1

    .line 91
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 0

    .line 150
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 151
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->loadAd()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 128
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/MusicActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method
