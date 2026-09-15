.class Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;
.super Ljava/lang/Object;
.source "AttachCropOption.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/views/AttachCropOption;->bind(Landroid/content/Context;Landroid/view/View;Landroid/view/View;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$backgroundOff:I

.field final synthetic val$backgroundOn:I

.field final synthetic val$button:Landroid/view/View;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$state:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/View;Landroid/view/View;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$button:Landroid/view/View;

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$state:Landroid/view/View;

    iput p4, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$backgroundOff:I

    iput p5, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$backgroundOn:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$context:Landroid/content/Context;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->enabled(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->access$000(Landroid/content/Context;Z)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$button:Landroid/view/View;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$state:Landroid/view/View;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->enabled(Landroid/content/Context;)Z

    move-result v1

    iget v2, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$backgroundOff:I

    iget v3, p0, Lcom/alexmanzana/bubbleall/views/AttachCropOption$1;->val$backgroundOn:I

    invoke-static {p1, v0, v1, v2, v3}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->access$100(Landroid/view/View;Landroid/view/View;ZII)V

    return-void
.end method
