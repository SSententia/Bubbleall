.class public final Lcom/google/android/gms/internal/ads/zzbqt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@20.5.0"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

.field private zzc:Lcom/google/android/gms/internal/ads/zzbqp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Android version must be Lollipop or higher"

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzb:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbjl;->zza(Landroid/content/Context;)V

    return-void
.end method

.method public static final zzc(Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbjl;->zzgJ:Lcom/google/android/gms/internal/ads/zzbjd;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbet;->zzc()Lcom/google/android/gms/internal/ads/zzbjj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzc(Lcom/google/android/gms/internal/ads/zzbjd;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbjl;->zzgL:Lcom/google/android/gms/internal/ads/zzbjd;

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbet;->zzc()Lcom/google/android/gms/internal/ads/zzbjj;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbjj;->zzc(Lcom/google/android/gms/internal/ads/zzbjd;)Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le v0, v2, :cond_1

    const-string p0, "H5 GMSG exceeds max length"

    .line 6
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcgt;->zzd(Ljava/lang/String;)V

    return v1

    .line 7
    :cond_1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    const-string v0, "gmsg"

    .line 8
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "mobileads.google.com"

    .line 9
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "/h5ads"

    .line 10
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private final zzd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzc:Lcom/google/android/gms/internal/ads/zzbqp;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzber;->zzb()Lcom/google/android/gms/internal/ads/zzbep;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zza:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvd;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbvd;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzb:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    .line 2
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbep;->zzs(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbvg;Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)Lcom/google/android/gms/internal/ads/zzbqp;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzc:Lcom/google/android/gms/internal/ads/zzbqp;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbqt;->zzc(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbqt;->zzd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzc:Lcom/google/android/gms/internal/ads/zzbqp;

    if-eqz v0, :cond_1

    .line 3
    :try_start_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbqp;->zze(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    .line 4
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcgt;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final zzb()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbjl;->zzgJ:Lcom/google/android/gms/internal/ads/zzbjd;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbet;->zzc()Lcom/google/android/gms/internal/ads/zzbjj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzc(Lcom/google/android/gms/internal/ads/zzbjd;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbqt;->zzd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbqt;->zzc:Lcom/google/android/gms/internal/ads/zzbqp;

    if-eqz v0, :cond_1

    .line 4
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbqp;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    .line 5
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcgt;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
