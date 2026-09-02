.class final Lcom/google/android/gms/internal/ads/zzfsv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzfsy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzfsy<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfsy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzfsy<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsv;->zza:Lcom/google/android/gms/internal/ads/zzfsy;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    const-string v0, "Timed out (timeout delayed by "

    .line 1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfsv;->zza:Lcom/google/android/gms/internal/ads/zzfsy;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfsy;->zza(Lcom/google/android/gms/internal/ads/zzfsy;)Lcom/google/android/gms/internal/ads/zzfsm;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzfsv;->zza:Lcom/google/android/gms/internal/ads/zzfsy;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzfsm;->isDone()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfqw;->zzr(Lcom/google/android/gms/internal/ads/zzfsm;)Z

    return-void

    :cond_2
    const/4 v4, 0x1

    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfsy;->zzb(Lcom/google/android/gms/internal/ads/zzfsy;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v5

    .line 3
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfsy;->zzx(Lcom/google/android/gms/internal/ads/zzfsy;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    const-string v6, "Timed out"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_3

    :try_start_1
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    invoke-interface {v5, v7}, Ljava/util/concurrent/ScheduledFuture;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/16 v9, 0xa

    cmp-long v5, v7, v9

    if-lez v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v9, 0x4b

    .line 5
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms after scheduled time)"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 6
    :cond_3
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v5, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    :try_start_2
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfsx;

    invoke-direct {v5, v0, v3}, Lcom/google/android/gms/internal/ads/zzfsx;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfsw;)V

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzfqw;->zzq(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 9
    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/ads/zzfsm;->cancel(Z)Z

    return-void

    .line 7
    :goto_1
    :try_start_3
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfsx;

    invoke-direct {v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzfsx;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfsw;)V

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzfqw;->zzq(Ljava/lang/Throwable;)Z

    .line 8
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 9
    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/ads/zzfsm;->cancel(Z)Z

    .line 10
    throw v0
.end method
