.class public final Lcom/alexmanzana/bubbleall/VideoActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "VideoActivity.kt"

# interfaces
.implements Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u000fH\u0002J\u0008\u0010\u0013\u001a\u00020\u000fH\u0002J\u0008\u0010\u0014\u001a\u00020\u000fH\u0002J\u0008\u0010\u0015\u001a\u00020\u000fH\u0016J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00072\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\"H\u0016J\u0008\u0010#\u001a\u00020\u000fH\u0014J\u0008\u0010$\u001a\u00020\u0007H\u0016J\u0008\u0010%\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/VideoActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerVideo;",
        "()V",
        "adapter",
        "Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;",
        "isFavorite",
        "",
        "mHandler",
        "Landroid/os/Handler;",
        "requestPermission",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "",
        "kotlin.jvm.PlatformType",
        "action",
        "",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemVideo;",
        "list",
        "loadAd",
        "loadFavorites",
        "onBackPressed",
        "onBucket",
        "position",
        "",
        "name",
        "onClick",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "menu",
        "Landroid/view/Menu;",
        "onOptionsItemSelected",
        "Landroid/view/MenuItem;",
        "onResume",
        "onSupportNavigateUp",
        "permissionDialog",
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
.field private adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

.field private isFavorite:Z

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
.method public static synthetic $r8$lambda$KLpIYTKtksQSjF2Lqudpdw9ENtU(Lcom/alexmanzana/bubbleall/VideoActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/VideoActivity;->permissionDialog$lambda$0(Lcom/alexmanzana/bubbleall/VideoActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$YBYNfP_P6wuPb0iwTLYWhSOxkog(Lcom/alexmanzana/bubbleall/VideoActivity;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->requestPermission$lambda$1(Lcom/alexmanzana/bubbleall/VideoActivity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 156
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v1, Lcom/alexmanzana/bubbleall/VideoActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/VideoActivity$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/VideoActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/alexmanzana/bubbleall/VideoActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lcom/alexmanzana/bubbleall/VideoActivity;)Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/alexmanzana/bubbleall/VideoActivity;)Landroid/os/Handler;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$setAdapter$p(Lcom/alexmanzana/bubbleall/VideoActivity;Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->adapter:Lcom/alexmanzana/bubbleall/adapters/AdapterVideo;

    return-void
.end method

.method public static final synthetic access$setFavorite$p(Lcom/alexmanzana/bubbleall/VideoActivity;Z)V
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->isFavorite:Z

    return-void
.end method

.method private final action(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
    .locals 5

    .line 185
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemData;

    const-string v1, "video"

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->videoPanel:I

    invoke-direct {v0, v1, v2, p1}, Lcom/alexmanzana/bubbleall/pojos/ItemData;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 186
    sget-object p1, Lcom/alexmanzana/bubbleall/BubbleService;->Companion:Lcom/alexmanzana/bubbleall/BubbleService$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/BubbleService$Companion;->isStarting()Z

    move-result p1

    const-string v1, "com.alexmanzana.bubbleall.EXTRA_ITEM_DATA"

    const-string v2, "com.alexmanzana.bubbleall.ACTION_ARGS_BUBBLE"

    if-nez p1, :cond_0

    .line 187
    new-instance p1, Landroid/content/Intent;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    const-class v4, Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-direct {p1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 188
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 189
    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 190
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 192
    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 193
    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 194
    const-string v0, "com.alexmanzana.bubbleall.EXTRA_OPEN_MANAGER"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 195
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->sendBroadcast(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method private final list()V
    .locals 4

    .line 163
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lcom/alexmanzana/bubbleall/VideoActivity$list$1;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/VideoActivity$list$1;-><init>(Lcom/alexmanzana/bubbleall/VideoActivity;)V

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    .line 181
    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_video_picker3_key:I

    invoke-virtual {p0, v3}, Lcom/alexmanzana/bubbleall/VideoActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 163
    invoke-virtual {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->list(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;Ljava/lang/String;)V

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 91
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/VideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 92
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 93
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 94
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 96
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private final loadFavorites()V
    .locals 3

    .line 129
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/VideoActivity$loadFavorites$1;-><init>(Lcom/alexmanzana/bubbleall/VideoActivity;)V

    check-cast v2, Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    invoke-virtual {v0, v1, v2}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->favoriteList(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;)V

    return-void
.end method

.method private final permissionDialog()V
    .locals 3

    .line 67
    new-instance v0, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 68
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_video:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 69
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_video_dialog:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 70
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_continue:I

    new-instance v2, Lcom/alexmanzana/bubbleall/VideoActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/alexmanzana/bubbleall/VideoActivity$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/VideoActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 77
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_cancel:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 78
    invoke-virtual {v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->show()Landroidx/appcompat/app/AlertDialog;

    return-void
.end method

.method private static final permissionDialog$lambda$0(Lcom/alexmanzana/bubbleall/VideoActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_0

    .line 72
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    const-string p1, "android.permission.READ_MEDIA_VIDEO"

    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    goto :goto_0

    .line 74
    :cond_0
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->requestPermission:Landroidx/activity/result/ActivityResultLauncher;

    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final requestPermission$lambda$1(Lcom/alexmanzana/bubbleall/VideoActivity;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 158
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->list()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->isFavorite:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->isFavorite:Z

    .line 84
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->list()V

    goto :goto_0

    .line 86
    :cond_0
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method public onBucket(ILjava/lang/String;Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "item"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onClick(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->action(Lcom/alexmanzana/bubbleall/pojos/ItemVideo;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 41
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_video:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->setContentView(I)V

    .line 43
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 44
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 46
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 48
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/VideoActivity;->mHandler:Landroid/os/Handler;

    .line 50
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_2

    .line 51
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    const-string v0, "android.permission.READ_MEDIA_VIDEO"

    invoke-static {p1, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    .line 52
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->list()V

    goto :goto_0

    .line 54
    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->permissionDialog()V

    goto :goto_0

    .line 57
    :cond_2
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_3

    .line 58
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->list()V

    goto :goto_0

    .line 60
    :cond_3
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->permissionDialog()V

    :goto_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 107
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/alexmanzana/bubbleall/R$menu;->activity_video:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->configVideo:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 113
    new-instance p1, Landroid/content/Intent;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/alexmanzana/bubbleall/SettingsActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 114
    const-string v0, "position_settings"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 115
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/VideoActivity;->startActivity(Landroid/content/Intent;)V

    return v2

    .line 117
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->configFavorite:I

    if-ne v0, v1, :cond_2

    .line 118
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    .line 119
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->loadFavorites()V

    goto :goto_0

    .line 121
    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->permissionDialog()V

    :goto_0
    return v2

    .line 125
    :cond_2
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 0

    .line 101
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 103
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->loadAd()V

    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 152
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/VideoActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method
