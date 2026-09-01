.class public final synthetic Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ljava/util/ArrayList;

.field public final synthetic f$1:Lcom/alexmanzana/bubbleall/VideoActivity;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/VideoActivity;

    iput p3, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/VideoActivity;

    iget v2, p0, Lcom/alexmanzana/bubbleall/VideoActivity$list$1$$ExternalSyntheticLambda0;->f$2:I

    invoke-static {v0, v1, v2}, Lcom/alexmanzana/bubbleall/VideoActivity$list$1;->$r8$lambda$BeJPDlBEikoJqR88Rw-8A3nMGcw(Ljava/util/ArrayList;Lcom/alexmanzana/bubbleall/VideoActivity;I)V

    return-void
.end method
