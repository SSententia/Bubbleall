.class public final Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;
.super Ljava/lang/Object;
.source "BubblePrefs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/BubblePrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBubblePrefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubblePrefs.kt\ncom/alexmanzana/bubbleall/utils/BubblePrefs$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1864#2,3:165\n*S KotlinDebug\n*F\n+ 1 BubblePrefs.kt\ncom/alexmanzana/bubbleall/utils/BubblePrefs$Companion\n*L\n107#1:165,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00080\u0019j\u0008\u0012\u0004\u0012\u00020\u0008`\u001a2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;",
        "",
        "()V",
        "addTheme",
        "",
        "context",
        "Landroid/content/Context;",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
        "delete",
        "uuid",
        "",
        "edit",
        "exists",
        "",
        "get",
        "getColorBubble",
        "",
        "getColorManager",
        "getColorTabNotSelected",
        "getColorTabSelected",
        "getInternalColors",
        "getPosition",
        "getSizeBubble",
        "list",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
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
.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addTheme(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemTheme;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 17
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 18
    const-string v1, "uuid"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string v1, "name"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "colorBubble"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 21
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorCurrentTab()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "colorCurrentTab"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 22
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorTab()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "colorTab"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 23
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorWindow()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "colorWindow"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 24
    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, "colorInternal"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 25
    const-string p2, "themes"

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 26
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public final delete(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DELETE FROM themes WHERE uuid=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x27

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public final edit(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemTheme;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UPDATE themes SET name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', colorBubble=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\', colorCurrentTab=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorCurrentTab()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\', colorTab=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorTab()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\', colorWindow=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorWindow()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\', colorInternal=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\' WHERE uuid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x27

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public final exists(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SELECT * FROM themes WHERE uuid=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x27

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    .line 38
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    .line 40
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    const/4 p1, 0x1

    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    .line 44
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final get(Landroid/content/Context;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 51
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 52
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SELECT * FROM themes WHERE uuid=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 58
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v2, 0x1

    .line 60
    :try_start_0
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x2

    .line 61
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const/4 v2, 0x3

    .line 62
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    const/4 v2, 0x4

    .line 63
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    const/4 v2, 0x5

    .line 64
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    const/4 v2, 0x6

    .line 65
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    .line 66
    new-instance v2, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v2

    move-object v10, p2

    invoke-direct/range {v3 .. v10}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;-><init>(Ljava/lang/String;IIIIILjava/lang/String;)V

    .line 67
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 68
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-exception p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v1
.end method

.method public final getColorBubble(Landroid/content/Context;)I
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 150
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 151
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    .line 152
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorBubble()I

    move-result p1

    return p1
.end method

.method public final getColorManager(Landroid/content/Context;)I
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 124
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 125
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    .line 126
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorWindow()I

    move-result p1

    return p1
.end method

.method public final getColorTabNotSelected(Landroid/content/Context;)I
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 138
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 139
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    .line 140
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorTab()I

    move-result p1

    return p1
.end method

.method public final getColorTabSelected(Landroid/content/Context;)I
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 131
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 132
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    .line 133
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorCurrentTab()I

    move-result p1

    return p1
.end method

.method public final getInternalColors(Landroid/content/Context;)I
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 117
    const-string v1, "theme_selected"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 118
    :goto_0
    invoke-virtual {p0, p1, v2}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->Companion:Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;

    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme$Companion;->default()Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    move-result-object p1

    .line 119
    :cond_1
    invoke-virtual {p1}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getColorInternal()I

    move-result p1

    return p1
.end method

.method public final getPosition(Landroid/content/Context;)I
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 105
    invoke-virtual {p0, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs$Companion;->list(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p1

    .line 106
    const-string v2, "theme_selected"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    .line 107
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 166
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v2, v1, 0x1

    if-gez v1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v0, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    .line 108
    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public final getSizeBubble(Landroid/content/Context;)I
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    const-string v0, "bubble_data_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 145
    const-string v0, "theme_size"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final list(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemTheme;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    new-instance v1, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;

    invoke-direct {v1, p1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/utils/BubblePrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 85
    const-string v1, "SELECT * FROM themes"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 86
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x0

    .line 88
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v2, 0x1

    .line 89
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x2

    .line 90
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const/4 v2, 0x3

    .line 91
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    const/4 v2, 0x4

    .line 92
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    const/4 v2, 0x5

    .line 93
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    const/4 v2, 0x6

    .line 94
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    .line 95
    new-instance v2, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v2

    invoke-direct/range {v3 .. v10}, Lcom/alexmanzana/bubbleall/pojos/ItemTheme;-><init>(Ljava/lang/String;IIIIILjava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 98
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 99
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-object v0
.end method
