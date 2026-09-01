.class public final Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;
.super Lcom/google/android/gms/ads/FullScreenContentCallback;
.source "ThemeActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1;->onAdLoaded(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1",
        "Lcom/google/android/gms/ads/FullScreenContentCallback;",
        "onAdFailedToShowFullScreenContent",
        "",
        "p0",
        "Lcom/google/android/gms/ads/AdError;",
        "onAdShowedFullScreenContent",
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

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    .line 435
    invoke-direct {p0}, Lcom/google/android/gms/ads/FullScreenContentCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 437
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/ThemeActivity;->finish()V

    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ThemeActivity$loadInterstitial$1$onAdLoaded$1;->this$0:Lcom/alexmanzana/bubbleall/ThemeActivity;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/ThemeActivity;->finish()V

    return-void
.end method
