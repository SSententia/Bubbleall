.class public final Lcom/google/android/gms/internal/ads/zzedq;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfsn;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfsn;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbjl;->zzfZ:Lcom/google/android/gms/internal/ads/zzbjd;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbet;->zzc()Lcom/google/android/gms/internal/ads/zzbjj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzc(Lcom/google/android/gms/internal/ads/zzbjd;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "AdMobOfflineBufferedPings.db"

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedq;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzedq;->zzb:Lcom/google/android/gms/internal/ads/zzfsn;

    return-void
.end method

.method static final synthetic zzg(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcgy;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "event_state"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const-string v1, "offline_buffered_pings"

    const-string v2, "gws_query_id = ?"

    .line 3
    invoke-virtual {p0, v1, v0, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 4
    invoke-static {p0, p2}, Lcom/google/android/gms/internal/ads/zzedq;->zzj(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/gms/internal/ads/zzcgy;)V

    return-void
.end method

.method static final synthetic zzh(Lcom/google/android/gms/internal/ads/zzcgy;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzedq;->zzj(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/gms/internal/ads/zzcgy;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method static final zzi(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    const-string v0, "offline_buffered_pings"

    const-string v1, "gws_query_id = ? AND event_state = ?"

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method private static zzj(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/gms/internal/ads/zzcgy;)V
    .locals 13

    .line 1
    const-string v0, "url"

    .line 0
    const-string v1, "event_state = 1"

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const/4 v2, 0x1

    :try_start_0
    new-array v5, v2, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v0, v5, v12

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x19

    .line 2
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "offline_buffered_pings"

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v10, "timestamp ASC"

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    .line 3
    invoke-virtual/range {v3 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    new-array v4, v3, [Ljava/lang/String;

    move v5, v12

    .line 5
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 6
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_0

    .line 7
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 8
    aput-object v6, v4, v5

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    const-string v0, "event_state = ?"

    new-array v1, v2, [Ljava/lang/String;

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v12

    const-string v2, "offline_buffered_pings"

    .line 11
    invoke-virtual {p0, v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 12
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :goto_1
    if-ge v12, v3, :cond_2

    .line 15
    aget-object p0, v4, v12

    .line 16
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzcgy;->zza(Ljava/lang/String;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 13
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 14
    throw p1
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    const-string v0, "CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    const-string p2, "DROP TABLE IF EXISTS offline_buffered_pings"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    const-string p2, "DROP TABLE IF EXISTS offline_buffered_pings"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method final zza(Lcom/google/android/gms/internal/ads/zzfdw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzfdw<",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedq;->zzb:Lcom/google/android/gms/internal/ads/zzfsn;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzedj;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzedj;-><init>(Lcom/google/android/gms/internal/ads/zzedq;)V

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsn;->zzb(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfsm;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzedp;

    .line 3
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzedp;-><init>(Lcom/google/android/gms/internal/ads/zzedq;Lcom/google/android/gms/internal/ads/zzfdw;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzedq;->zzb:Lcom/google/android/gms/internal/ads/zzfsn;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfsd;->zzp(Lcom/google/android/gms/internal/ads/zzfsm;Lcom/google/android/gms/internal/ads/zzfrz;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method final zzb(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/gms/internal/ads/zzcgy;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedq;->zzb:Lcom/google/android/gms/internal/ads/zzfsn;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzedl;

    invoke-direct {v1, p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzedl;-><init>(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcgy;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsn;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzcgy;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzedm;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzedm;-><init>(Lcom/google/android/gms/internal/ads/zzedq;Lcom/google/android/gms/internal/ads/zzcgy;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzedq;->zza(Lcom/google/android/gms/internal/ads/zzfdw;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzedn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzedn;-><init>(Lcom/google/android/gms/internal/ads/zzedq;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzedq;->zza(Lcom/google/android/gms/internal/ads/zzfdw;)V

    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzeds;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzedo;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzedo;-><init>(Lcom/google/android/gms/internal/ads/zzedq;Lcom/google/android/gms/internal/ads/zzeds;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzedq;->zza(Lcom/google/android/gms/internal/ads/zzfdw;)V

    return-void
.end method

.method final synthetic zzf(Lcom/google/android/gms/internal/ads/zzeds;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/zzeds;->zza:J

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "timestamp"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "gws_query_id"

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzeds;->zzb:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "url"

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzeds;->zzc:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzeds;->zzd:I

    add-int/lit8 p1, p1, -0x1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "event_state"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 6
    const-string p1, "offline_buffered_pings"

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzedq;->zza:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/util/zzbu;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzedq;->zza:Landroid/content/Context;

    .line 8
    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzf(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to schedule offline ping sender."

    .line 9
    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-object v1
.end method
