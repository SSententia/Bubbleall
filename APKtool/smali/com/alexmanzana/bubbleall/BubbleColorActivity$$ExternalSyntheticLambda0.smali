.class public final synthetic Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

.field public final synthetic f$1:Lcom/alexmanzana/bubbleall/BubbleColorActivity;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/BubbleColorActivity;

    iput p3, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$0:Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/BubbleColorActivity;

    iget v2, p0, Lcom/alexmanzana/bubbleall/BubbleColorActivity$$ExternalSyntheticLambda0;->f$2:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/alexmanzana/bubbleall/BubbleColorActivity;->$r8$lambda$-CCJ6ZQOJByPYoOKLPqKgnBme68(Lcom/alexmanzana/bubbleall/pojos/ItemTheme;Lcom/alexmanzana/bubbleall/BubbleColorActivity;ILandroid/content/DialogInterface;I)V

    return-void
.end method
