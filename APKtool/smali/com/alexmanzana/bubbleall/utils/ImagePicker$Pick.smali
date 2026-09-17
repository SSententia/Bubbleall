.class public final Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;
.super Ljava/lang/Object;
.source "ImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Pick"
.end annotation


# instance fields
.field public final orientation:I

.field public final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;->uri:Landroid/net/Uri;

    iput p2, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;->orientation:I

    return-void
.end method
