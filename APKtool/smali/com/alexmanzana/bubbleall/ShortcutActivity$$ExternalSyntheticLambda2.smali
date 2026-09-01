.class public final synthetic Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/alexmanzana/bubbleall/ShortcutActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda2;->f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$$ExternalSyntheticLambda2;->f$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->$r8$lambda$PE0w5bu5fkqYYGFcNmbtqVrsRTQ(Lcom/alexmanzana/bubbleall/ShortcutActivity;Landroid/net/Uri;)V

    return-void
.end method
