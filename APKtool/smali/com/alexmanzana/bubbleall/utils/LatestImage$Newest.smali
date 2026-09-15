.class final Lcom/alexmanzana/bubbleall/utils/LatestImage$Newest;
.super Ljava/lang/Object;
.source "LatestImage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/LatestImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Newest"
.end annotation


# instance fields
.field final orientation:I

.field final uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Landroid/net/Uri;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Newest;->uri:Landroid/net/Uri;

    iput p2, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Newest;->orientation:I

    return-void
.end method
