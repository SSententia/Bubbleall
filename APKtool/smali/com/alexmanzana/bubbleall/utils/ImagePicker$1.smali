.class Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;
.super Ljava/lang/Object;
.source "ImagePicker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/utils/ImagePicker;->attach()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$1;->this$0:Lcom/alexmanzana/bubbleall/utils/ImagePicker;

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImagePicker;->access$100(Lcom/alexmanzana/bubbleall/utils/ImagePicker;)Z

    return-void
.end method
