.class final Lcom/google/android/gms/internal/ads/zzbej;
.super Lcom/google/android/gms/internal/ads/zzbeq;
.source "com.google.android.gms:play-services-ads-lite@@20.5.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbeq<",
        "Lcom/google/android/gms/internal/ads/zzbge;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zza:Landroid/content/Context;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbep;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbep;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbej;->zzb:Lcom/google/android/gms/internal/ads/zzbep;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbeq;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    const-string v1, "mobile_ads_settings"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbep;->zzi(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbif;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbif;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbjl;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbjl;->zzgW:Lcom/google/android/gms/internal/ads/zzbjd;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbet;->zzc()Lcom/google/android/gms/internal/ads/zzbjj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzc(Lcom/google/android/gms/internal/ads/zzbjd;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    .line 4
    invoke-static {v1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    const-string v3, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbei;->zza:Lcom/google/android/gms/internal/ads/zzcgv;

    .line 5
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcgx;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcgv;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzbgf;

    const v3, 0xcbe6bb0

    .line 6
    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzbgf;->zze(Lcom/google/android/gms/dynamic/IObjectWrapper;I)Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v2, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"

    .line 7
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    .line 8
    instance-of v3, v2, Lcom/google/android/gms/internal/ads/zzbge;

    if-eqz v3, :cond_1

    .line 9
    check-cast v2, Lcom/google/android/gms/internal/ads/zzbge;

    :goto_0
    move-object v0, v2

    goto :goto_2

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbgc;

    .line 10
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/zzbgc;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzcgw; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    .line 13
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbej;->zzb:Lcom/google/android/gms/internal/ads/zzbep;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    .line 11
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzcar;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcat;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzbep;->zzg(Lcom/google/android/gms/internal/ads/zzbep;Lcom/google/android/gms/internal/ads/zzcat;)Lcom/google/android/gms/internal/ads/zzcat;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbej;->zzb:Lcom/google/android/gms/internal/ads/zzbep;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbep;->zzh(Lcom/google/android/gms/internal/ads/zzbep;)Lcom/google/android/gms/internal/ads/zzcat;

    move-result-object v2

    const-string v3, "ClientApiBroker.getMobileAdsSettingsManager"

    .line 12
    invoke-interface {v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzcat;->zzd(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbej;->zzb:Lcom/google/android/gms/internal/ads/zzbep;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbep;->zzc(Lcom/google/android/gms/internal/ads/zzbep;)Lcom/google/android/gms/internal/ads/zzbhx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbhx;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbge;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzbfx;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbej;->zza:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    const v1, 0xcbe6bb0

    .line 2
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbfx;->zzh(Lcom/google/android/gms/dynamic/IObjectWrapper;I)Lcom/google/android/gms/internal/ads/zzbge;

    move-result-object p1

    return-object p1
.end method
