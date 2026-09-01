.class public final Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;
.super Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;
.source "AdsActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/AdsActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/alexmanzana/bubbleall/AdsActivity$onClick$1",
        "Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;",
        "onAdFailedToLoad",
        "",
        "p0",
        "Lcom/google/android/gms/ads/LoadAdError;",
        "onAdLoaded",
        "ad",
        "Lcom/google/android/gms/ads/interstitial/InterstitialAd;",
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
.field final synthetic $v:Landroid/view/View;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/AdsActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->this$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->$v:Landroid/view/View;

    .line 95
    invoke-direct {p0}, Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->$v:Landroid/view/View;

    sget v0, Lcom/alexmanzana/bubbleall/R$string;->text_thanks:I

    const/4 v1, -0x1

    invoke-static {p1, v0, v1}, Lcom/google/android/material/snackbar/Snackbar;->make(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->show()V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
    .locals 2

    const-string v0, "ad"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1$onAdLoaded$1;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->$v:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1$onAdLoaded$1;-><init>(Landroid/view/View;)V

    check-cast v0, Lcom/google/android/gms/ads/FullScreenContentCallback;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 106
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->this$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->show(Landroid/app/Activity;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 95
    check-cast p1, Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$onClick$1;->onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    return-void
.end method
