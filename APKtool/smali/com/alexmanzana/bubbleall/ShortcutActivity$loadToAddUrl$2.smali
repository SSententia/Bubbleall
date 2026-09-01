.class public final Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;
.super Landroid/webkit/WebChromeClient;
.source "ShortcutActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alexmanzana/bubbleall/ShortcutActivity;->loadToAddUrl(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2",
        "Landroid/webkit/WebChromeClient;",
        "onReceivedIcon",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "icon",
        "Landroid/graphics/Bitmap;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $s:Ljava/lang/String;

.field final synthetic this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;


# direct methods
.method constructor <init>(Lcom/alexmanzana/bubbleall/ShortcutActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->$s:Ljava/lang/String;

    .line 189
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V
    .locals 11

    .line 191
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget v1, Lcom/alexmanzana/bubbleall/R$id;->textListEmpty:I

    invoke-virtual {v0, v1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->menuAccess:I

    invoke-virtual {v0, v2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget v3, Lcom/alexmanzana/bubbleall/R$id;->contentActivity:I

    invoke-virtual {v0, v3}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    sget v2, Lcom/alexmanzana/bubbleall/R$id;->progressAccess:I

    invoke-virtual {v0, v2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 195
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".png"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 196
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v2, Ljava/io/OutputStream;

    const/16 v3, 0x64

    invoke-virtual {p2, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 198
    :cond_0
    new-instance p2, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->$s:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-string v1, ""

    :cond_2
    move-object v6, v1

    iget-object v7, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->$s:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v4, p2

    invoke-direct/range {v4 .. v10}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 199
    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->Companion:Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;->add(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemAdd;)V

    .line 200
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->access$getList$p(Lcom/alexmanzana/bubbleall/ShortcutActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    iget-object p1, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->access$getAdapter$p(Lcom/alexmanzana/bubbleall/ShortcutActivity;)Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/ShortcutActivity$loadToAddUrl$2;->this$0:Lcom/alexmanzana/bubbleall/ShortcutActivity;

    invoke-static {p2}, Lcom/alexmanzana/bubbleall/ShortcutActivity;->access$getList$p(Lcom/alexmanzana/bubbleall/ShortcutActivity;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lcom/alexmanzana/bubbleall/adapters/AdapterAdd;->notifyItemInserted(I)V

    :cond_5
    return-void
.end method
