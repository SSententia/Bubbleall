.class public final synthetic Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

.field public final synthetic f$3:Landroid/content/Context;

.field public final synthetic f$4:Ljava/lang/String;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$2:Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    iput-object p4, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$4:Ljava/lang/String;

    iput p6, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$5:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$2:Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$3:Landroid/content/Context;

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$4:Ljava/lang/String;

    iget v5, p0, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion$$ExternalSyntheticLambda1;->f$5:I

    invoke-static/range {v0 .. v5}, Lcom/alexmanzana/bubbleall/utils/VideoPrefs$Companion;->$r8$lambda$W8TEXKoh-9pB6N5kvRrJFm2rFlc(Ljava/lang/String;Ljava/lang/String;Lcom/alexmanzana/bubbleall/listeners/ListenerListVideo;Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method
