.class final Lcom/google/android/gms/internal/ads/zzrb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzqz;


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:Lcom/google/android/gms/internal/ads/zzamf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzqw;Lcom/google/android/gms/internal/ads/zzafv;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqw;->zza:Lcom/google/android/gms/internal/ads/zzamf;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrb;->zzc:Lcom/google/android/gms/internal/ads/zzamf;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzamf;->zzh(I)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzamf;->zzB()I

    move-result v0

    const-string v1, "audio/raw"

    .line 3
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzafv;->zzl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzafv;->zzA:I

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzafv;->zzy:I

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/ads/zzamq;->zzS(II)I

    move-result p2

    if-eqz v0, :cond_0

    .line 5
    rem-int v1, v0, p2

    if-eqz v1, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x58

    .line 6
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "AtomParsers"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, p2

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    :cond_2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrb;->zza:I

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzamf;->zzB()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrb;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrb;->zzb:I

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrb;->zza:I

    return v0
.end method

.method public final zzc()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrb;->zza:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrb;->zzc:Lcom/google/android/gms/internal/ads/zzamf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzamf;->zzB()I

    move-result v0

    :cond_0
    return v0
.end method
