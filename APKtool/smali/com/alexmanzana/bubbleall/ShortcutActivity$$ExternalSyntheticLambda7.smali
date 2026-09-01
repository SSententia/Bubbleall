.class public final synthetic Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

.field public final synthetic f$1:Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/ShortcutActivity;Lcom/alexmanzana/bubbleall/pojos/ItemAdd;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$1:Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    iput p3, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$2:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$1:Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    iget v2, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda7;->f$2:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->$r8$lambda$hmRA16Y8n33tU-fGvFfIoMNXvsg(Lcom/alexmanzana/bubbleall/ShortcutActivity;Lcom/alexmanzana/bubbleall/pojos/ItemAdd;ILandroid/content/DialogInterface;I)V

    return-void
.end method
