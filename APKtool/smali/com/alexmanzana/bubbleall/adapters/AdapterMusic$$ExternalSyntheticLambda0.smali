.class public final synthetic Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/widget/ImageView;

.field public final synthetic f$1:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroid/os/Handler;

.field public final synthetic f$4:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$0:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    iput p3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$2:I

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$3:Landroid/os/Handler;

    iput-object p5, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$4:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$0:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$1:Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;

    iget v2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$2:I

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$3:Landroid/os/Handler;

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda0;->f$4:Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->$r8$lambda$0jNFLd_VfQ1SLmli9LrcawV-fsY(Landroid/widget/ImageView;Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;ILandroid/os/Handler;Landroid/content/Context;)V

    return-void
.end method
