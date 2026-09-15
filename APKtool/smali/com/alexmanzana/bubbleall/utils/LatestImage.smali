.class public final Lcom/alexmanzana/bubbleall/utils/LatestImage;
.super Ljava/lang/Object;
.source "LatestImage.java"


# static fields
.field private static final IMAGE_EXTENSIONS:[Ljava/lang/String;

.field private static final MODE_SAVE:I = 0x3

.field private static final PERMISSION_GRANTED:I = 0x0

.field private static final PERM_IMAGES:Ljava/lang/String; = "android.permission.READ_MEDIA_IMAGES"

.field private static final PERM_STORAGE:Ljava/lang/String; = "android.permission.READ_EXTERNAL_STORAGE"

.field private static final REQUEST_CODE:I = 0x226b

.field private static final TAG:Ljava/lang/String; = "BubbleUpload"

.field private static final TEXT_NEED_PERMISSION:Ljava/lang/String; = "Allow photo access to BubbleAll to attach images"


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v7, ".heif"

    const-string v8, ".avif"

    const-string v0, ".png"

    const-string v1, ".jpg"

    const-string v2, ".jpeg"

    const-string v3, ".webp"

    const-string v4, ".gif"

    const-string v5, ".bmp"

    const-string v6, ".heic"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/alexmanzana/bubbleall/utils/LatestImage;->IMAGE_EXTENSIONS:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static deliver(Landroid/webkit/ValueCallback;Landroid/net/Uri;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :try_start_0
    invoke-interface {p0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/net/Uri;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-interface {p0, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    nop

    :goto_1
    return-void
.end method

.method public static handle(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_4

    :cond_0
    nop

    nop

    nop

    nop

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-static {p2}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->wantsImage(Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_2

    return v0

    :cond_2
    nop

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->hasImagePermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->newestImage(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object p0

    move-object v1, p0

    goto :goto_0

    :cond_3
    const-string v0, "Allow photo access to BubbleAll to attach images"

    invoke-static {p0, v0}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->toast(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    goto :goto_3

    :catchall_0
    move-exception p0

    move v0, p2

    goto :goto_2

    :cond_4
    :goto_1
    return v0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catchall_2
    move-exception p0

    const/4 v2, -0x1

    :goto_2
    move p2, v0

    :goto_3
    const/4 p0, 0x1

    invoke-static {v2, p2, p0, v1}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->log(IZZLandroid/net/Uri;)V

    nop

    invoke-static {p1, v1}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->deliver(Landroid/webkit/ValueCallback;Landroid/net/Uri;)V

    return p0

    :cond_5
    :goto_4
    return v0
.end method

.method private static hasImagePermission(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->imagePermission()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catchall_0
    move-exception p0

    return v0
.end method

.method private static imagePermission()Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.READ_MEDIA_IMAGES"

    goto :goto_0

    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    :goto_0
    return-object v0
.end method

.method private static log(IZZLandroid/net/Uri;)V
    .locals 3

    :try_start_0
    const-string v0, "BubbleUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file chooser: mode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, " image="

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " handled="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " uri="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_0
    return-void
.end method

.method private static newestImage(Landroid/content/Context;)Landroid/net/Uri;
    .locals 8

    sget-object v6, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    nop

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p0, "_id"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v2

    const-string v5, "_id DESC"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    invoke-static {v6, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p0, :cond_0

    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :cond_0
    :goto_0
    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_1
    if-eqz p0, :cond_2

    :try_start_3
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_2
    move-exception p0

    move-object p0, v7

    :goto_1
    if-eqz p0, :cond_2

    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_2
    goto :goto_3

    :catchall_3
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_3
    return-object v7
.end method

.method public static requestImagePermissionIfNeeded(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/alexmanzana/bubbleall/utils/LatestImage;->imagePermission()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x226b

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_0
    return-void
.end method

.method private static toast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_0
    return-void
.end method

.method private static wantsImage(Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 6

    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p0, :cond_7

    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_5

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_1
    array-length v3, p0

    if-ge v2, v3, :cond_6

    aget-object v3, p0, v2

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "*/*"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "image/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_4

    :cond_2
    move v4, v1

    :goto_2
    sget-object v5, Lcom/alexmanzana/bubbleall/utils/LatestImage;->IMAGE_EXTENSIONS:[Ljava/lang/String;

    array-length v5, v5

    if-ge v4, v5, :cond_4

    sget-object v5, Lcom/alexmanzana/bubbleall/utils/LatestImage;->IMAGE_EXTENSIONS:[Ljava/lang/String;

    aget-object v5, v5, v4

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    return v0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    :goto_4
    return v0

    :cond_6
    return v1

    :cond_7
    :goto_5
    return v0
.end method
