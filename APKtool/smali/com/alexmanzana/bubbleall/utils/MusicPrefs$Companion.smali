.class public final Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;
.super Ljava/lang/Object;
.source "MusicPrefs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/MusicPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;",
        "",
        "()V",
        "get",
        "Lcom/alexmanzana/bubbleall/pojos/ItemMusic;",
        "context",
        "Landroid/content/Context;",
        "id",
        "",
        "list",
        "",
        "listener",
        "Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;",
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


# direct methods
.method public static synthetic $r8$lambda$6DouVsZZ9AuGklKioDw3tn70nr4(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;->list$lambda$2(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$Oh-wOF33vmQSTxBhXIeAsoEk6Bk(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;->list$lambda$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion;-><init>()V

    return-void
.end method

.method private static final list$lambda$2(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final list$lambda$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final get(Landroid/content/Context;J)Lcom/alexmanzana/bubbleall/pojos/ItemMusic;
    .locals 9

    .line 24
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 19
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1, p2, p3}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v5

    const-string v1, "withAppendedId(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0, p1, v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    const/4 p1, 0x7

    .line 21
    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "<unknown>"

    if-nez p1, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p1

    :goto_0
    const/4 p1, 0x2

    .line 22
    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p1

    .line 23
    :goto_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object p1

    if-eqz p1, :cond_2

    .line 25
    new-instance v0, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v8

    move-object v2, v0

    move-wide v3, p2

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;-><init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object v0

    .line 27
    :cond_2
    new-instance p1, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    const/4 v8, 0x0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v2 .. v8}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;-><init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object p1
.end method

.method public final list(Landroid/content/Context;Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "listener"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    sget v3, Lcom/alexmanzana/bubbleall/R$string;->text_recent_key:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget v5, Lcom/alexmanzana/bubbleall/R$string;->text_sort_a_z_key:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    sget v6, Lcom/alexmanzana/bubbleall/R$string;->text_sort_z_a_key:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-static/range {p1 .. p1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 39
    const-string v7, "artist"

    .line 40
    const-string v8, "title"

    const-string v9, "_id"

    filled-new-array {v9, v7, v8}, [Ljava/lang/String;

    move-result-object v12

    .line 42
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v10

    .line 43
    sget-object v11, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 42
    const-string v13, "is_music != 0"

    invoke-virtual/range {v10 .. v15}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 50
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_0
    const/4 v7, 0x0

    .line 52
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    const/4 v7, 0x1

    .line 53
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const/4 v7, 0x0

    :cond_1
    move-object v13, v7

    const/4 v7, 0x2

    .line 54
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 56
    new-instance v7, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;

    .line 57
    sget-object v8, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v8, v9, v10}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v11

    const-string v8, "withAppendedId(...)"

    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v14, 0x0

    move-object v8, v7

    .line 56
    invoke-direct/range {v8 .. v14}, Lcom/alexmanzana/bubbleall/pojos/ItemMusic;-><init>(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 55
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-nez v7, :cond_0

    .line 63
    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 65
    :cond_3
    const-string v0, "key_order_music"

    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v0, v2

    check-cast v0, Ljava/util/List;

    sget-object v3, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$list$2;->INSTANCE:Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$list$2;

    check-cast v3, Lkotlin/jvm/functions/Function2;

    new-instance v4, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 67
    :cond_4
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, v2

    check-cast v0, Ljava/util/List;

    sget-object v3, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$list$3;->INSTANCE:Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$list$3;

    check-cast v3, Lkotlin/jvm/functions/Function2;

    new-instance v4, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v4, v3}, Lcom/alexmanzana/bubbleall/utils/MusicPrefs$Companion$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 69
    :cond_5
    :goto_0
    invoke-interface {v1, v2}, Lcom/alexmanzana/bubbleall/listeners/ListenerListMusic;->onReceived(Ljava/util/ArrayList;)V

    return-void
.end method
