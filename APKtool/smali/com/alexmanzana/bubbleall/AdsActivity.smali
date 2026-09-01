.class public final Lcom/alexmanzana/bubbleall/AdsActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "AdsActivity.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;
.implements Lcom/android/billingclient/api/PurchasesResponseListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0019H\u0016J\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\t2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0008\u0010\u001e\u001a\u00020\tH\u0002J\u0008\u0010\u001f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/AdsActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "Lcom/android/billingclient/api/PurchasesResponseListener;",
        "()V",
        "billingClient",
        "Lcom/android/billingclient/api/BillingClient;",
        "buyRemoveAds",
        "",
        "productsList",
        "Lcom/android/billingclient/api/ProductDetails;",
        "handlePurchase",
        "purchase",
        "Lcom/android/billingclient/api/Purchase;",
        "onClick",
        "v",
        "Landroid/view/View;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onPurchasesUpdated",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "purchases",
        "",
        "onQueryPurchasesResponse",
        "onSupportNavigateUp",
        "",
        "queryRemoveAds",
        "startConnection",
        "verifyPurchases",
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
.field private billingClient:Lcom/android/billingclient/api/BillingClient;


# direct methods
.method public static synthetic $r8$lambda$5QbV3AKeHiQ0GW5Kqr2BC4gT3Tg(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/AdsActivity;->queryRemoveAds$lambda$1(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic $r8$lambda$nb8cn2jmokqVyW_bU-9Fl3JWJh8(Lcom/alexmanzana/bubbleall/AdsActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/AdsActivity;->handlePurchase$lambda$0(Lcom/alexmanzana/bubbleall/AdsActivity;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getBillingClient$p(Lcom/alexmanzana/bubbleall/AdsActivity;)Lcom/android/billingclient/api/BillingClient;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    return-object p0
.end method

.method public static final synthetic access$verifyPurchases(Lcom/alexmanzana/bubbleall/AdsActivity;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/AdsActivity;->verifyPurchases()V

    return-void
.end method

.method private final buyRemoveAds(Lcom/android/billingclient/api/ProductDetails;)V
    .locals 2

    .line 138
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->setProductDetails(Lcom/android/billingclient/api/ProductDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v1

    .line 140
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setProductDetailsParamsList(Ljava/util/List;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    const-string v0, "billingClient"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;

    return-void
.end method

.method private final handlePurchase(Lcom/android/billingclient/api/Purchase;)V
    .locals 2

    .line 73
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 74
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->isAcknowledged()Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    new-instance v0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;-><init>(Lcom/android/billingclient/api/Purchase;Lcom/alexmanzana/bubbleall/AdsActivity;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_0

    .line 81
    :cond_0
    sget-object p1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removeAds(Landroid/content/Context;)V

    goto :goto_0

    .line 84
    :cond_1
    new-instance p1, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda1;-><init>(Lcom/alexmanzana/bubbleall/AdsActivity;)V

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private static final handlePurchase$lambda$0(Lcom/alexmanzana/bubbleall/AdsActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->removeAdsView:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/AdsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method private final queryRemoveAds(Landroid/view/View;)V
    .locals 3

    .line 119
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object v0

    .line 121
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;->newBuilder()Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v1

    .line 122
    const-string v2, "product_remove_ads"

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->setProductId(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v1

    .line 123
    const-string v2, "inapp"

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;

    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product$Builder;->build()Lcom/android/billingclient/api/QueryProductDetailsParams$Product;

    move-result-object v1

    .line 120
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->setProductList(Ljava/util/List;)Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/QueryProductDetailsParams;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v1, :cond_0

    const-string v1, "billingClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    new-instance v2, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;)V

    invoke-virtual {v1, v0, v2}, Lcom/android/billingclient/api/BillingClient;->queryProductDetailsAsync(Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/android/billingclient/api/ProductDetailsResponseListener;)V

    return-void
.end method

.method private static final queryRemoveAds$lambda$1(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productsList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 128
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 129
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/android/billingclient/api/ProductDetails;

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->buyRemoveAds(Lcom/android/billingclient/api/ProductDetails;)V

    goto :goto_0

    .line 132
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget p0, Lcom/alexmanzana/bubbleall/R$string;->text_already_purchased:I

    const/4 p2, -0x1

    invoke-static {p1, p0, p2}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/Snackbar;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final startConnection()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    const-string v0, "billingClient"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/alexmanzana/bubbleall/AdsActivity$startConnection$1;

    invoke-direct {v1, p0}, Lcom/alexmanzana/bubbleall/AdsActivity$startConnection$1;-><init>(Lcom/alexmanzana/bubbleall/AdsActivity;)V

    check-cast v1, Lcom/android/billingclient/api/BillingClientStateListener;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient;->startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V

    return-void
.end method

.method private final verifyPurchases()V
    .locals 3

    .line 62
    invoke-static {}, Lcom/android/billingclient/api/QueryPurchasesParams;->newBuilder()Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    move-result-object v0

    const-string v1, "newBuilder(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    const-string v1, "inapp"

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    .line 64
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v1, :cond_0

    const-string v1, "billingClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->build()Lcom/android/billingclient/api/QueryPurchasesParams;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/android/billingclient/api/PurchasesResponseListener;

    invoke-virtual {v1, v0, v2}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Lcom/android/billingclient/api/QueryPurchasesParams;Lcom/android/billingclient/api/PurchasesResponseListener;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 92
    :goto_0
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->removeAdsView:I

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->queryRemoveAds(Landroid/view/View;)V

    goto :goto_3

    .line 93
    :cond_2
    :goto_1
    sget v1, Lcom/alexmanzana/bubbleall/R$id;->adView:I

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_4

    .line 94
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    .line 95
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    sget-object v2, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    invoke-virtual {v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->getInterstitialUuid()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;

    invoke-direct {v3, p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;-><init>(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;)V

    check-cast v3, Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;

    invoke-static {v1, v2, v0, v3}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V

    goto :goto_3

    .line 114
    :cond_4
    :goto_2
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->donateView:I

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_6

    new-instance p1, Landroid/content/Intent;

    const-string v0, "https://alexmanzana.com/link/paypal"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->startActivity(Landroid/content/Intent;)V

    :cond_6
    :goto_3
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 26
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_ads:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->setContentView(I)V

    .line 28
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->toolbar:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 29
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 31
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/AdsActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 33
    :cond_0
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->removeAdsView:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    move-object v0, p0

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->adView:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->donateView:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    move-object p1, p0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    .line 38
    move-object v0, p0

    check-cast v0, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    .line 40
    invoke-static {}, Lcom/android/billingclient/api/PendingPurchasesParams;->newBuilder()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->enableOneTimeProducts()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->build()Lcom/android/billingclient/api/PendingPurchasesParams;

    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingClient$Builder;->enablePendingPurchases(Lcom/android/billingclient/api/PendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/AdsActivity;->billingClient:Lcom/android/billingclient/api/BillingClient;

    .line 45
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/AdsActivity;->startConnection()V

    return-void
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 147
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 148
    invoke-direct {p0, p2}, Lcom/alexmanzana/bubbleall/AdsActivity;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchases"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    if-nez p1, :cond_0

    .line 155
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 156
    invoke-direct {p0, p2}, Lcom/alexmanzana/bubbleall/AdsActivity;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 68
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/AdsActivity;->finish()V

    const/4 v0, 0x1

    return v0
.end method
