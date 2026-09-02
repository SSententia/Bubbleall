.class final synthetic Lcom/google/android/gms/internal/ads/zzdbm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdgl;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdkm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdkm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdbm;->zza:Lcom/google/android/gms/internal/ads/zzdkm;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdbm;->zza:Lcom/google/android/gms/internal/ads/zzdkm;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdbs;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdkm;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    .line 3
    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfbm;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzbcz;)Lcom/google/android/gms/internal/ads/zzbcz;

    move-result-object v0

    .line 4
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzdbs;->zzn(Lcom/google/android/gms/internal/ads/zzbcz;)V

    return-void
.end method
