.class public final Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;
.super Ljava/lang/Object;
.source "ShortcutPrefs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00080\u0011j\u0008\u0012\u0004\u0012\u00020\u0008`\u00122\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;",
        "",
        "()V",
        "add",
        "",
        "context",
        "Landroid/content/Context;",
        "item",
        "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
        "delete",
        "id",
        "",
        "edit",
        "exists",
        "",
        "get",
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

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemAdd;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 81
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 82
    const-string v2, "id"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v2, "name"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v2, "image"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceBitmap()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v2, "url"

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v2, "shortcuts"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 87
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 88
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 89
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 90
    invoke-static {}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m()V

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getName()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    const/4 v1, 0x2

    invoke-static {v0, p2, v1}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 91
    invoke-static {p1, p2}, Lcom/alexmanzana/bubbleall/MainActivity$$ExternalSyntheticApiModelOutline0;->m(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public final delete(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DELETE FROM shortcuts WHERE id=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x27

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public final edit(Landroid/content/Context;Lcom/alexmanzana/bubbleall/pojos/ItemAdd;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UPDATE shortcuts SET name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', image=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getResourceBitmap()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' WHERE id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x27

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public final exists(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SELECT * FROM shortcuts WHERE id=\'"

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

.method public final get(Landroid/content/Context;Ljava/lang/String;)Lcom/alexmanzana/bubbleall/pojos/ItemAdd;
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v0, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SELECT * FROM shortcuts WHERE id=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v2, 0x1

    .line 22
    :try_start_0
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x2

    .line 23
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v2, 0x3

    .line 24
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 25
    new-instance v2, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget v9, Lcom/alexmanzana/bubbleall/R$id;->shortcutPanel:I

    const/4 v7, 0x0

    move-object v3, v2

    move-object v4, p2

    invoke-direct/range {v3 .. v9}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 26
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 27
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v1
.end method

.method public final list(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/alexmanzana/bubbleall/pojos/ItemAdd;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v1, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;

    invoke-direct {v1, p1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/alexmanzana/bubbleall/utils/ShortcutPrefs;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    .line 52
    const-string v1, "SELECT * FROM shortcuts"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 53
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x0

    .line 55
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x1

    .line 56
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x2

    .line 57
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v2, 0x3

    .line 58
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 59
    new-instance v2, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v7, 0x0

    sget v9, Lcom/alexmanzana/bubbleall/R$id;->shortcutPanel:I

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lcom/alexmanzana/bubbleall/pojos/ItemAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 62
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 63
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-object v0
.end method
