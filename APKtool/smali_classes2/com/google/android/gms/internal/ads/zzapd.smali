.class final Lcom/google/android/gms/internal/ads/zzapd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# instance fields
.field private final zza:Landroid/media/MediaCodec$CryptoInfo;

.field private final zzb:Landroid/media/MediaCodec$CryptoInfo$Pattern;


# direct methods
.method synthetic constructor <init>(Landroid/media/MediaCodec$CryptoInfo;Lcom/google/android/gms/internal/ads/zzapc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapd;->zza:Landroid/media/MediaCodec$CryptoInfo;

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m(II)Landroid/media/MediaCodec$CryptoInfo$Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapd;->zzb:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzapd;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapd;->zzb:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/MediaCodec$CryptoInfo$Pattern;II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapd;->zza:Landroid/media/MediaCodec$CryptoInfo;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzapd;->zzb:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 2
    invoke-static {p1, p0}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/MediaCodec$CryptoInfo;Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    return-void
.end method
