.class public final synthetic Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

.field public final synthetic f$1:Landroid/view/View;

.field public final synthetic f$2:D


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/views/ShortcutView;Landroid/view/View;D)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$1:Landroid/view/View;

    iput-wide p3, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$2:D

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$0:Lcom/alexmanzana/bubbleall/views/ShortcutView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$1:Landroid/view/View;

    iget-wide v2, p0, Lcom/alexmanzana/bubbleall/views/ShortcutView$$ExternalSyntheticLambda6;->f$2:D

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/alexmanzana/bubbleall/views/ShortcutView;->$r8$lambda$aIL-cGMLOyzkH3vs0Q_dGC0pFmY(Lcom/alexmanzana/bubbleall/views/ShortcutView;Landroid/view/View;DLjava/lang/String;)V

    return-void
.end method
