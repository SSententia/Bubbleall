.class final Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AdsActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/AdsActivity;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/android/billingclient/api/BillingResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "Lcom/android/billingclient/api/BillingResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.alexmanzana.bubbleall.AdsActivity$handlePurchase$1"
    f = "AdsActivity.kt"
    i = {}
    l = {
        0x4e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $purchase:Lcom/android/billingclient/api/Purchase;

.field label:I

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/AdsActivity;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/Purchase;Lcom/alexmanzana/bubbleall/AdsActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/alexmanzana/bubbleall/AdsActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->this$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->this$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    invoke-direct {v0, v1, v2, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;-><init>(Lcom/android/billingclient/api/Purchase;Lcom/alexmanzana/bubbleall/AdsActivity;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/android/billingclient/api/BillingResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 75
    iget v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Lcom/android/billingclient/api/AcknowledgePurchaseParams;->newBuilder()Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object p1

    .line 77
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object p1

    const-string v1, "setPurchaseToken(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->this$0:Lcom/alexmanzana/bubbleall/AdsActivity;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/AdsActivity;->access$getBillingClient$p(Lcom/alexmanzana/bubbleall/AdsActivity;)Lcom/android/billingclient/api/BillingClient;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, "billingClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    invoke-virtual {p1}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->build()Lcom/android/billingclient/api/AcknowledgePurchaseParams;

    move-result-object p1

    const-string v3, "build(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/alexmanzana/bubbleall/AdsActivity$handlePurchase$1;->label:I

    invoke-static {v1, p1, v3}, Lcom/android/billingclient/api/BillingClientKotlinKt;->acknowledgePurchase(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    return-object p1
.end method
