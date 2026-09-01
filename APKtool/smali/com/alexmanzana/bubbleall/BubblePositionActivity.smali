.class public final Lcom/alexmanzana/bubbleall/BubblePositionActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "BubblePositionActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0008\u0010\u000b\u001a\u00020\u0007H\u0014J\u0008\u0010\u000c\u001a\u00020\u0007H\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/BubblePositionActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "receiverData",
        "com/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1",
        "Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;",
        "loadAd",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onPause",
        "onResume",
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
.field private final receiverData:Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;


# direct methods
.method public static synthetic $r8$lambda$gG6owfqinoe5oeGzeIj45WBRh5Q(Lcom/alexmanzana/bubbleall/BubblePositionActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->onCreate$lambda$0(Lcom/alexmanzana/bubbleall/BubblePositionActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 44
    new-instance v0, Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;-><init>(Lcom/alexmanzana/bubbleall/BubblePositionActivity;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->receiverData:Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;

    return-void
.end method

.method private final loadAd()V
    .locals 3

    .line 26
    sget v0, Lcom/alexmanzana/bubbleall/R$id;->adBanner:I

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    .line 27
    sget-object v1, Lcom/alexmanzana/bubbleall/utils/AdBlock;->Companion:Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/AdBlock$Companion;->removerAd(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 28
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 31
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private static final onCreate$lambda$0(Lcom/alexmanzana/bubbleall/BubblePositionActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->finish()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 18
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    sget p1, Lcom/alexmanzana/bubbleall/R$layout;->activity_bubble_position:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->setContentView(I)V

    .line 21
    sget p1, Lcom/alexmanzana/bubbleall/R$id;->finishActivity:I

    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v0, Lcom/alexmanzana/bubbleall/BubblePositionActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity$$ExternalSyntheticLambda0;-><init>(Lcom/alexmanzana/bubbleall/BubblePositionActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onPause()V
    .locals 3

    .line 64
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onPause()V

    .line 65
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->stopService(Landroid/content/Intent;)Z

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 36
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 37
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->loadAd()V

    .line 38
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/alexmanzana/bubbleall/BubbleService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 39
    const-string v1, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    invoke-virtual {p0, v0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 41
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->receiverData:Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;

    check-cast v0, Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
