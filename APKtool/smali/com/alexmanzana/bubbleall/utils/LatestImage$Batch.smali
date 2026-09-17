.class final Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;
.super Ljava/lang/Object;
.source "LatestImage.java"

# interfaces
.implements Lcom/alexmanzana/bubbleall/utils/ImageCrop$Sink;
.implements Lcom/alexmanzana/bubbleall/utils/ImagePicker$Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/LatestImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Batch"
.end annotation


# instance fields
.field private final callback:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final crop:Z

.field private index:I

.field private picks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;",
            ">;"
        }
    .end annotation
.end field

.field private results:[Landroid/net/Uri;

.field private settled:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/webkit/ValueCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->callback:Landroid/webkit/ValueCallback;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/views/AttachCropOption;->enabled(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->crop:Z

    return-void
.end method

.method private advance()V
    .locals 4

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settled:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :goto_0
    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->picks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->picks:Ljava/util/List;

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->crop:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->context:Landroid/content/Context;

    iget-object v2, v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;->uri:Landroid/net/Uri;

    iget v3, v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;->orientation:I

    invoke-static {v1, v2, p0, v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->show(Landroid/content/Context;Landroid/net/Uri;Lcom/alexmanzana/bubbleall/utils/ImageCrop$Sink;I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->results:[Landroid/net/Uri;

    iget v2, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    iget-object v0, v0, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;->uri:Landroid/net/Uri;

    aput-object v0, v1, v2

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->results:[Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settle([Landroid/net/Uri;)V

    return-void
.end method

.method private settle([Landroid/net/Uri;)V
    .locals 3

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settled:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settled:Z

    nop

    if-eqz p1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget-object v2, p1, v1

    if-eqz v2, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v2, p1

    if-eq v1, v2, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Landroid/net/Uri;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/net/Uri;

    :cond_4
    :goto_1
    if-nez p1, :cond_5

    const-string v0, "file chooser: answered with no file"

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file chooser: answered with "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " image(s)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->crop:Z

    if-eqz v1, :cond_6

    const-string v1, ", cropped"

    goto :goto_2

    :cond_6
    const-string v1, ", as picked"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    const-string v1, "BubbleUpload"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->callback:Landroid/webkit/ValueCallback;

    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the file chooser callback refused the images: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    return-void
.end method

.method private start(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->picks:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Landroid/net/Uri;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->results:[Landroid/net/Uri;

    const/4 p1, 0x0

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->advance()V

    return-void
.end method


# virtual methods
.method attachNewest(Landroid/net/Uri;I)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settle([Landroid/net/Uri;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;

    invoke-direct {v1, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;-><init>(Landroid/net/Uri;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->start(Ljava/util/List;)V

    return-void
.end method

.method deferred()Z
    .locals 1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settled:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onPicked(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alexmanzana/bubbleall/utils/ImagePicker$Pick;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->start(Ljava/util/List;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settle([Landroid/net/Uri;)V

    return-void
.end method

.method public onResult(Landroid/net/Uri;)V
    .locals 2

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settled:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "BubbleUpload"

    const-string v0, "crop cancelled: the whole attach is dropped"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->settle([Landroid/net/Uri;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->results:[Landroid/net/Uri;

    iget v1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    aput-object p1, v0, v1

    iget p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->index:I

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/LatestImage$Batch;->advance()V

    return-void
.end method
