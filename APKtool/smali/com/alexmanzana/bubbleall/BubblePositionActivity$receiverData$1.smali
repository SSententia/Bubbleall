.class public final Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;
.super Landroid/content/BroadcastReceiver;
.source "BubblePositionActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/BubblePositionActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/BubblePositionActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/BubblePositionActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;->this$0:Lcom/alexmanzana/bubbleall/BubblePositionActivity;

    .line 44
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 46
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;->this$0:Lcom/alexmanzana/bubbleall/BubblePositionActivity;

    sget v0, Lcom/alexmanzana/bubbleall/R$id;->stateBubble:I

    invoke-virtual {p1, v0}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p2, :cond_0

    .line 47
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "com.alexmanzana.bubbleall.ACTION_START_ONLY_BUBBLE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubblePositionActivity$receiverData$1;->this$0:Lcom/alexmanzana/bubbleall/BubblePositionActivity;

    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/alexmanzana/bubbleall/BubblePositionActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 49
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 50
    const-string v1, "bubble_state"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "up"

    if-nez v1, :cond_1

    move-object v1, v3

    .line 51
    :cond_1
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 52
    sget v1, Lcom/alexmanzana/bubbleall/R$string;->text_move_bubble_2:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    const/16 p1, 0xc8

    .line 53
    const-string v1, "yBubble"

    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 54
    const-string p1, "xBubble"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 55
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    .line 56
    :cond_2
    const-string p2, "down"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 57
    sget p2, Lcom/alexmanzana/bubbleall/R$string;->text_move_bubble_1:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :cond_3
    :goto_1
    return-void
.end method
