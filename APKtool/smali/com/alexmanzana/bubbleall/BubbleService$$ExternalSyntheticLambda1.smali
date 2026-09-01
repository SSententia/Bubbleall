.class public final synthetic Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/BubbleService;

.field public final synthetic f$1:I

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$0:Lcom/alexmanzana/bubbleall/BubbleService;

    iput p2, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$1:I

    iput p3, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$2:I

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$3:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$0:Lcom/alexmanzana/bubbleall/BubbleService;

    iget v1, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$1:I

    iget v2, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$2:I

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/BubbleService$$ExternalSyntheticLambda1;->f$3:Landroid/content/Intent;

    invoke-static {v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/BubbleService;->$r8$lambda$c8LHpTOFN56asHioysDDUxM_6MA(Lcom/alexmanzana/bubbleall/BubbleService;IILandroid/content/Intent;)V

    return-void
.end method
