.class public final Lcom/google/android/gms/internal/ads/zzaho;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# static fields
.field public static final zzj:Lcom/google/android/gms/internal/ads/zzadw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzadw<",
            "Lcom/google/android/gms/internal/ads/zzaho;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Ljava/lang/Object;

.field public final zzb:I

.field public final zzc:Lcom/google/android/gms/internal/ads/zzagk;

.field public final zzd:Ljava/lang/Object;

.field public final zze:I

.field public final zzf:J

.field public final zzg:J

.field public final zzh:I

.field public final zzi:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzahn;->zza:Lcom/google/android/gms/internal/ads/zzadw;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:Lcom/google/android/gms/internal/ads/zzadw;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzagk;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzc:Lcom/google/android/gms/internal/ads/zzagk;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Ljava/lang/Object;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzaho;->zze:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:J

    iput p10, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    iput p11, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzaho;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzb:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zze:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zze:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzf:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzg:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzi:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zza:Ljava/lang/Object;

    .line 2
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzflt;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Ljava/lang/Object;

    .line 3
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzflt;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzc:Lcom/google/android/gms/internal/ads/zzagk;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzaho;->zzc:Lcom/google/android/gms/internal/ads/zzagk;

    .line 4
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/zzflt;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzc:Lcom/google/android/gms/internal/ads/zzagk;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Ljava/lang/Object;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaho;->zze:I

    .line 2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:I

    .line 3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:J

    .line 4
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:J

    .line 5
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget v8, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    .line 6
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v9, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:I

    .line 7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v10, 0xa

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v1, v10, v0

    const/4 v0, 0x2

    aput-object v2, v10, v0

    const/4 v0, 0x3

    aput-object v3, v10, v0

    const/4 v0, 0x4

    aput-object v4, v10, v0

    const/4 v0, 0x5

    aput-object v5, v10, v0

    const/4 v0, 0x6

    aput-object v6, v10, v0

    const/4 v0, 0x7

    aput-object v7, v10, v0

    const/16 v0, 0x8

    aput-object v8, v10, v0

    const/16 v0, 0x9

    aput-object v9, v10, v0

    .line 8
    invoke-static {v10}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
