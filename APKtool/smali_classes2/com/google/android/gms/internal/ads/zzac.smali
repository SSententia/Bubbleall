.class public final Lcom/google/android/gms/internal/ads/zzac;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# instance fields
.field public zza:[B

.field public zzb:[B

.field public zzc:[I

.field public zzd:[I

.field private final zze:Landroid/media/MediaCodec$CryptoInfo;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzab;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 2
    sget v1, Lcom/google/android/gms/internal/ads/zzamq;->zza:I

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzab;

    invoke-direct {v1, v0, v3}, Lcom/google/android/gms/internal/ads/zzab;-><init>(Landroid/media/MediaCodec$CryptoInfo;Lcom/google/android/gms/internal/ads/zzaa;)V

    move-object v3, v1

    :cond_0
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzac;->zzf:Lcom/google/android/gms/internal/ads/zzab;

    return-void
.end method


# virtual methods
.method public final zza(I[I[I[B[BIII)V
    .locals 1

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzac;->zzc:[I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzac;->zzd:[I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzac;->zzb:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzac;->zza:[B

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    iput p1, v0, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 2
    iput-object p2, p1, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 3
    iput-object p3, p1, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 4
    iput-object p4, p1, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 5
    iput-object p5, p1, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    .line 6
    iput p6, p1, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 7
    sget p1, Lcom/google/android/gms/internal/ads/zzamq;->zza:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzac;->zzf:Lcom/google/android/gms/internal/ads/zzab;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-static {p1, p7, p8}, Lcom/google/android/gms/internal/ads/zzab;->zza(Lcom/google/android/gms/internal/ads/zzab;II)V

    :cond_0
    return-void
.end method

.method public final zzb()Landroid/media/MediaCodec$CryptoInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    return-object v0
.end method

.method public final zzc(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zzc:[I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zzc:[I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzac;->zze:Landroid/media/MediaCodec$CryptoInfo;

    iput-object v0, v1, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzac;->zzc:[I

    const/4 v1, 0x0

    .line 2
    aget v2, v0, v1

    add-int/2addr v2, p1

    aput v2, v0, v1

    return-void
.end method
