.class public final Lcom/google/android/gms/internal/ads/zzact;
.super Lcom/google/android/gms/internal/ads/zzacz;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# instance fields
.field private final zzi:Lcom/google/android/gms/internal/ads/zzaby;

.field private zzj:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzabr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzyj;IILcom/google/android/gms/internal/ads/zzaby;)V
    .locals 7

    .line 1
    const-string v3, "Yw5N4XiXXiTiwJwrJ8hW/AfPIwRQ2KMfiYKb9xu8vYQ="

    const/16 v6, 0x35

    const-string v2, "BF4UgSmqTS0MLe4qitQi/hj1jIQ+0vLIJEn32u0TtZn0VL9j15ZHt04Do4ADy833"

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzacz;-><init>(Lcom/google/android/gms/internal/ads/zzabr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzyj;II)V

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzact;->zzi:Lcom/google/android/gms/internal/ads/zzaby;

    if-eqz p7, :cond_0

    .line 2
    invoke-virtual {p7}, Lcom/google/android/gms/internal/ads/zzaby;->zzc()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzact;->zzj:J

    :cond_0
    return-void
.end method


# virtual methods
.method protected final zza()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzact;->zzi:Lcom/google/android/gms/internal/ads/zzaby;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzact;->zze:Lcom/google/android/gms/internal/ads/zzyj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzact;->zzf:Ljava/lang/reflect/Method;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzact;->zzj:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzyj;->zzH(J)Lcom/google/android/gms/internal/ads/zzyj;

    :cond_0
    return-void
.end method
