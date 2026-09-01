.class public final synthetic Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/ProductDetailsResponseListener;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/AdsActivity;

.field public final synthetic f$1:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;->f$1:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onProductDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$$ExternalSyntheticLambda0;->f$1:Landroid/view/View;

    invoke-static {v0, v1, p1, p2}, Lcom/alexmanzana/bubbleall/AdsActivity;->$r8$lambda$5QbV3AKeHiQ0GW5Kqr2BC4gT3Tg(Lcom/alexmanzana/bubbleall/AdsActivity;Landroid/view/View;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
