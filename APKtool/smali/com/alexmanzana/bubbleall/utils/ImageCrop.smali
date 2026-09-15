.class public final Lcom/alexmanzana/bubbleall/utils/ImageCrop;
.super Ljava/lang/Object;
.source "ImageCrop.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;,
        Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;,
        Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;,
        Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;
    }
.end annotation


# static fields
.field private static final ALPHA_DEFAULT:I = 0xff

.field private static final AUTHORITY:Ljava/lang/String; = "com.alexmanzana.bubbleall.fileprovider"

.field private static final COLOR_BAR:I = -0x22efebe8

.field private static final COLOR_BUTTON:I = -0xd4cbc0

.field private static final KEY_ALPHA:Ljava/lang/String; = "theme_alpha"

.field private static final MAX_EDGE:I = 0xc80

.field private static final MIN_CHROME_ALPHA:F = 0.25f

.field private static final PREFS:Ljava/lang/String; = "bubble_data_prefs"

.field private static final PREVIEW_SCALE:F = 1.1f

.field private static final TAG:Ljava/lang/String; = "BubbleUpload"

.field private static final TEXT_ATTACH:Ljava/lang/String; = "Attach"

.field private static final TEXT_CANCEL:Ljava/lang/String; = "Cancel"

.field private static final TEXT_HINT:Ljava/lang/String; = "Drag the frame over the part to attach"

.field private static final TEXT_LOADING:Ljava/lang/String; = "Opening the newest image\u2026"

.field private static current:Lcom/alexmanzana/bubbleall/utils/ImageCrop;


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

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

.field private finished:Z

.field private final hint:Landroid/widget/TextView;

.field private final layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

.field private final main:Landroid/os/Handler;

.field private final orientation:I

.field private final root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

.field private final source:Landroid/net/Uri;

.field private final windowManager:Landroid/view/WindowManager;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/net/Uri;Landroid/webkit/ValueCallback;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->main:Landroid/os/Handler;

    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->callback:Landroid/webkit/ValueCallback;

    iput p4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->orientation:I

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->windowManager:Landroid/view/WindowManager;

    invoke-static {p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->chromeAlpha(Landroid/content/Context;)F

    move-result p2

    new-instance p3, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    invoke-direct {p3, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    invoke-virtual {p3, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->setChromeAlpha(F)V

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->buildHint()Landroid/widget/TextView;

    move-result-object p3

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->hint:Landroid/widget/TextView;

    invoke-direct {p0, p2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->buildBar(F)Landroid/widget/LinearLayout;

    move-result-object p2

    new-instance p3, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    invoke-direct {p3, p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Landroid/content/Context;)V

    iput-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    iget-object p3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    new-instance p4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p4, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p3, p4}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p4, -0x2

    const/16 v1, 0x50

    invoke-direct {p3, v0, p4, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, p2, p3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic access$100(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->decode()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->onDecoded(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic access$300(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->main:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$400(Lcom/alexmanzana/bubbleall/utils/ImageCrop;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->confirm()V

    return-void
.end method

.method static synthetic access$500(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    return-void
.end method

.method private attach()V
    .locals 7

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->overlayType()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x3

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->windowManager:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    invoke-interface {v1, v2, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;->requestFocus()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no WindowManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private buildBar(F)Landroid/widget/LinearLayout;
    .locals 4

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v2, 0xa

    invoke-direct {p0, v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v2

    const/4 v3, 0x4

    invoke-direct {p0, v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v3, v2, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    const v2, -0x22efebe8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setAlpha(F)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->hint:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance p1, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;

    invoke-direct {p1, p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Z)V

    const-string v1, "Cancel"

    invoke-direct {p0, v1, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->makeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance p1, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Click;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Z)V

    const-string v1, "Attach"

    invoke-direct {p0, v1, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->makeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method private buildHint()Landroid/widget/TextView;
    .locals 5

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "Opening the newest image\u2026"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, -0x191510

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v2

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v1, v3, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private static cancelCurrent()V
    .locals 2

    sget-object v0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->current:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method private static chromeAlpha(Landroid/content/Context;)F
    .locals 3

    nop

    const/16 v0, 0xff

    :try_start_0
    const-string v1, "bubble_data_prefs"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v1, "theme_alpha"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_0
    int-to-float p0, v0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    const/high16 v0, 0x3e800000    # 0.25f

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_1

    move p0, v0

    :cond_1
    return p0
.end method

.method private static close(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :cond_0
    :goto_0
    return-void
.end method

.method private confirm()V
    .locals 4

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->bitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->cropPixels()Landroid/graphics/Rect;

    move-result-object v1

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    iget v2, v1, Landroid/graphics/Rect;->left:I

    if-nez v2, :cond_1

    iget v2, v1, Landroid/graphics/Rect;->top:I

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    return-void

    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->save(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    :goto_1
    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    return-void

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    return-void
.end method

.method private decode()Landroid/graphics/Bitmap;
    .locals 6

    nop

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    iget-object v4, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-virtual {v3, v4}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    invoke-static {v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    nop

    nop

    :try_start_2
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    if-lez v1, :cond_0

    div-int v3, v1, v2

    const/16 v4, 0xc80

    if-le v3, v4, :cond_0

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    nop

    :try_start_4
    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->rotate(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-static {v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v3, v0

    :goto_1
    :try_start_5
    const-string v2, "BubbleUpload"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "decode failed: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    nop

    invoke-static {v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    return-object v0

    :catchall_2
    move-exception v0

    invoke-static {v3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    throw v0
.end method

.method private detach()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->windowManager:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->windowManager:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->root:Lcom/alexmanzana/bubbleall/utils/ImageCrop$Root;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    return-void
.end method

.method private dp(I)I
    .locals 1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private finish(Landroid/net/Uri;)V
    .locals 3

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finished:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finished:Z

    sget-object v1, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->current:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    const/4 v2, 0x0

    if-ne v1, p0, :cond_1

    sput-object v2, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->current:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    :cond_1
    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->detach()V

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    iput-object v2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->bitmap:Landroid/graphics/Bitmap;

    :cond_2
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    invoke-virtual {v1, v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->setBitmap(Landroid/graphics/Bitmap;)V

    :try_start_0
    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->callback:Landroid/webkit/ValueCallback;

    if-nez p1, :cond_3

    :goto_0
    goto :goto_1

    :cond_3
    new-array v2, v0, [Landroid/net/Uri;

    const/4 v0, 0x0

    aput-object p1, v2, v0

    goto :goto_0

    :goto_1
    invoke-interface {v1, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file chooser callback refused the result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BubbleUpload"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method private load()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;

    invoke-direct {v2, p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$Loader;-><init>(Lcom/alexmanzana/bubbleall/utils/ImageCrop;Lcom/alexmanzana/bubbleall/utils/ImageCrop$1;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "no loader thread: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BubbleUpload"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->onDecoded(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method

.method private makeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, -0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 p1, 0x41600000    # 14.0f

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/16 p1, 0xe

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result p1

    const/16 v1, 0x9

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v1

    invoke-virtual {v0, p1, v1, p1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v1, -0xd4cbc0

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v1, 0xa

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->dp(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method private mime()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const/4 v0, 0x0

    return-object v0
.end method

.method private onDecoded(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-boolean v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finished:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void

    :cond_1
    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "could not decode "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BubbleUpload"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->source:Landroid/net/Uri;

    invoke-direct {p0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->finish(Landroid/net/Uri;)V

    return-void

    :cond_2
    iput-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->bitmap:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->layer:Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;

    invoke-virtual {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop$CropLayer;->setBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->hint:Landroid/widget/TextView;

    const-string v0, "Drag the frame over the part to attach"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static overlayType()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/16 v0, 0x7f6

    goto :goto_0

    :cond_0
    const/16 v0, 0x7d2

    :goto_0
    return v0
.end method

.method private rotate(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    iget v0, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->orientation:I

    rem-int/lit16 v0, v0, 0x168

    if-eqz p1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    nop

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x1

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    return-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method private save(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/net/Uri;
    .locals 10

    const-string v0, "x"

    const-string v1, "BubbleUpload"

    nop

    const/4 v2, 0x0

    :try_start_0
    iget v3, p2, Landroid/graphics/Rect;->left:I

    iget v4, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-static {p1, v3, v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v4, "image/png"

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->mime()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "bubble_crop_"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    if-eqz v4, :cond_0

    const-string v8, ".png"

    goto :goto_0

    :cond_0
    const-string v8, ".jpg"

    :goto_0
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_1

    :try_start_2
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_1

    :cond_1
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    :goto_1
    const/16 v7, 0x5f

    invoke-virtual {v3, v4, v7, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    nop

    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "crop "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " at "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v6, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ","

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget p2, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v4, " of "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, " -> "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->context:Landroid/content/Context;

    const-string v0, "com.alexmanzana.bubbleall.fileprovider"

    invoke-static {p2, v0, v5}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v2}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    if-eqz v3, :cond_2

    if-eq v3, p1, :cond_2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_2

    :catchall_1
    move-exception p2

    move-object v6, v2

    goto :goto_2

    :catchall_2
    move-exception p2

    move-object v3, v2

    move-object v6, v3

    :goto_2
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "crop could not be saved: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    nop

    invoke-static {v6}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    if-eqz v3, :cond_3

    if-eq v3, p1, :cond_3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    return-object v2

    :catchall_3
    move-exception p2

    invoke-static {v6}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->close(Ljava/io/Closeable;)V

    if-eqz v3, :cond_4

    if-eq v3, p1, :cond_4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    throw p2
.end method

.method public static show(Landroid/content/Context;Landroid/net/Uri;Landroid/webkit/ValueCallback;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->cancelCurrent()V

    new-instance v1, Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;-><init>(Landroid/content/Context;Landroid/net/Uri;Landroid/webkit/ValueCallback;I)V

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->attach()V

    sput-object v1, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->current:Lcom/alexmanzana/bubbleall/utils/ImageCrop;

    invoke-direct {v1}, Lcom/alexmanzana/bubbleall/utils/ImageCrop;->load()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "crop screen could not be opened: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "BubbleUpload"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_1
    :goto_0
    return v0
.end method
