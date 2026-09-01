.class public final Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;
.super Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;
.source "ThemeActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ThemeActivity;->loadInterstitial()V
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
        "com/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/ThemeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    .line 433
    invoke-direct {p0}, Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/ThemeActivity;->finish()V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
    .locals 2

    const-string v0, "ad"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    new-instance v0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;-><init>(Lcom/alexmanzana/bubbleall/ThemeActivity;)V

    check-cast v0, Lcom/google/android/gms/ads/FullScreenContentCallback;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 444
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->show(Landroid/app/Activity;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 433
    check-cast p1, Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V

    return-void
.end method
