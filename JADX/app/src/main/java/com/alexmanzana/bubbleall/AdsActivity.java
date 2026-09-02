package com.alexmanzana.bubbleall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.alexmanzana.bubbleall.utils.AdBlock;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientKotlinKt;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdsActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m494d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, m495d2 = {"Lcom/alexmanzana/bubbleall/AdsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "()V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "buyRemoveAds", "", "productsList", "Lcom/android/billingclient/api/ProductDetails;", "handlePurchase", "purchase", "Lcom/android/billingclient/api/Purchase;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchases", "", "onQueryPurchasesResponse", "onSupportNavigateUp", "", "queryRemoveAds", "startConnection", "verifyPurchases", "app_release"}, m496k = 1, m497mv = {1, 9, 0}, m499xi = 48)
public final class AdsActivity extends AppCompatActivity implements View.OnClickListener, PurchasesUpdatedListener, PurchasesResponseListener {
    private BillingClient billingClient;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1106R.layout.activity_ads);
        View viewFindViewById = findViewById(C1106R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        setSupportActionBar((MaterialToolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        AdsActivity adsActivity = this;
        ((RelativeLayout) findViewById(C1106R.id.removeAdsView)).setOnClickListener(adsActivity);
        ((RelativeLayout) findViewById(C1106R.id.adView)).setOnClickListener(adsActivity);
        ((RelativeLayout) findViewById(C1106R.id.donateView)).setOnClickListener(adsActivity);
        BillingClient billingClientBuild = BillingClient.newBuilder(this).setListener(this).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        Intrinsics.checkNotNullExpressionValue(billingClientBuild, "build(...)");
        this.billingClient = billingClientBuild;
        startConnection();
    }

    private final void startConnection() {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.startConnection(new BillingClientStateListener() { // from class: com.alexmanzana.bubbleall.AdsActivity.startConnection.1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                AdsActivity.this.verifyPurchases();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyPurchases() {
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.queryPurchasesAsync(builderNewBuilder.build(), this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private final void handlePurchase(Purchase purchase) {
        if (purchase.getPurchaseState() == 1) {
            if (!purchase.isAcknowledged()) {
                new C10991(purchase, this, null);
                return;
            } else {
                AdBlock.INSTANCE.removeAds(this);
                return;
            }
        }
        runOnUiThread(new Runnable() { // from class: com.alexmanzana.bubbleall.AdsActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AdsActivity.handlePurchase$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: com.alexmanzana.bubbleall.AdsActivity$handlePurchase$1 */
    /* JADX INFO: compiled from: AdsActivity.kt */
    @Metadata(m494d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m495d2 = {"<anonymous>", "Lcom/android/billingclient/api/BillingResult;"}, m496k = 3, m497mv = {1, 9, 0}, m499xi = 48)
    @DebugMetadata(m511c = "com.alexmanzana.bubbleall.AdsActivity$handlePurchase$1", m512f = "AdsActivity.kt", m513i = {}, m514l = {78}, m515m = "invokeSuspend", m516n = {}, m517s = {})
    static final class C10991 extends SuspendLambda implements Function1<Continuation<? super BillingResult>, Object> {
        final /* synthetic */ Purchase $purchase;
        int label;
        final /* synthetic */ AdsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10991(Purchase purchase, AdsActivity adsActivity, Continuation<? super C10991> continuation) {
            super(1, continuation);
            this.$purchase = purchase;
            this.this$0 = adsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10991(this.$purchase, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super BillingResult> continuation) {
            return ((C10991) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcknowledgePurchaseParams.Builder purchaseToken = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(this.$purchase.getPurchaseToken());
                Intrinsics.checkNotNullExpressionValue(purchaseToken, "setPurchaseToken(...)");
                BillingClient billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("billingClient");
                    billingClient = null;
                }
                AcknowledgePurchaseParams acknowledgePurchaseParamsBuild = purchaseToken.build();
                Intrinsics.checkNotNullExpressionValue(acknowledgePurchaseParamsBuild, "build(...)");
                this.label = 1;
                obj = BillingClientKotlinKt.acknowledgePurchase(billingClient, acknowledgePurchaseParamsBuild, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePurchase$lambda$0(AdsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((RelativeLayout) this$0.findViewById(C1106R.id.removeAdsView)).setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View v) {
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = C1106R.id.removeAdsView;
        if (numValueOf != null && numValueOf.intValue() == i) {
            queryRemoveAds(v);
            return;
        }
        int i2 = C1106R.id.adView;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            InterstitialAd.load(this, AdBlock.INSTANCE.getInterstitialUuid(), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.alexmanzana.bubbleall.AdsActivity.onClick.1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    final View view = v;
                    ad.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.alexmanzana.bubbleall.AdsActivity$onClick$1$onAdLoaded$1
                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            Snackbar.make(view, C1106R.string.text_thanks, -1).show();
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            Snackbar.make(view, C1106R.string.text_thanks, -1).show();
                        }
                    });
                    ad.show(AdsActivity.this);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    Snackbar.make(v, C1106R.string.text_thanks, -1).show();
                }
            });
            return;
        }
        int i3 = C1106R.id.donateView;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alexmanzana.com/link/paypal")));
        }
    }

    private final void queryRemoveAds(final View v) {
        QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(CollectionsKt.listOf(QueryProductDetailsParams.Product.newBuilder().setProductId("product_remove_ads").setProductType("inapp").build())).build();
        Intrinsics.checkNotNullExpressionValue(queryProductDetailsParamsBuild, "build(...)");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.queryProductDetailsAsync(queryProductDetailsParamsBuild, new ProductDetailsResponseListener() { // from class: com.alexmanzana.bubbleall.AdsActivity$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                AdsActivity.queryRemoveAds$lambda$1(this.f$0, v, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRemoveAds$lambda$1(AdsActivity this$0, View view, BillingResult billingResult, List productsList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productsList, "productsList");
        if (billingResult.getResponseCode() != 4) {
            if (billingResult.getResponseCode() == 0) {
                Object obj = productsList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                this$0.buyRemoveAds((ProductDetails) obj);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(view);
        Snackbar.make(view, C1106R.string.text_already_purchased, -1).show();
    }

    private final void buyRemoveAds(ProductDetails productsList) {
        BillingFlowParams.ProductDetailsParams productDetailsParamsBuild = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productsList).build();
        Intrinsics.checkNotNullExpressionValue(productDetailsParamsBuild, "build(...)");
        BillingFlowParams billingFlowParamsBuild = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt.listOf(productDetailsParamsBuild)).build();
        Intrinsics.checkNotNullExpressionValue(billingFlowParamsBuild, "build(...)");
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClient = null;
        }
        billingClient.launchBillingFlow(this, billingFlowParamsBuild);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() != 0 || purchases == null) {
            return;
        }
        Iterator<Purchase> it = purchases.iterator();
        while (it.hasNext()) {
            handlePurchase(it.next());
        }
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        if (billingResult.getResponseCode() == 0) {
            Iterator<Purchase> it = purchases.iterator();
            while (it.hasNext()) {
                handlePurchase(it.next());
            }
        }
    }
}
