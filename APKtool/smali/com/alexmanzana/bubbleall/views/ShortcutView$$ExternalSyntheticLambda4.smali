.class public final synthetic Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic f$0:Landroid/view/View;

.field public final synthetic f$1:Lcom/alexmanzana/bubbleall/views/ShortcutView;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/alexmanzana/bubbleall/views/ShortcutView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda4;->f$0:Landroid/view/View;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda4;->f$1:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda4;->f$0:Landroid/view/View;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda4;->f$1:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->$r8$lambda$FHSQuvNPBj_f3YIN7Kv9jHF7VOk(Landroid/view/View;Lcom/alexmanzana/bubbleall/views/ShortcutView;Ljava/lang/String;)V

    return-void
.end method
