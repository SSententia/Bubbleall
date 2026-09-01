.class public final synthetic Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;->f$1:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic$$ExternalSyntheticLambda3;->f$1:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/alexmanzana/bubbleall/adapters/AdapterMusic;->$r8$lambda$zOj780K4MaeZH0W1qOqbNP7cLNg(Landroid/content/Context;Landroid/widget/ImageView;)V

    return-void
.end method
