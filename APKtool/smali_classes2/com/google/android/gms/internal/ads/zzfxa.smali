.class final Lcom/google/android/gms/internal/ads/zzfxa;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfty;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfud;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzfud<",
            "Lcom/google/android/gms/internal/ads/zzfty;",
            ">;"
        }
    .end annotation
.end field

.field private final zzb:[B


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfud;Lcom/google/android/gms/internal/ads/zzfwz;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzfud<",
            "Lcom/google/android/gms/internal/ads/zzfty;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    new-array p2, p2, [B

    const/4 v0, 0x0

    aput-byte v0, p2, v0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zzb:[B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    return-void
.end method


# virtual methods
.method public final zza([B)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfud;->zza()Lcom/google/android/gms/internal/ads/zzfua;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfua;->zzd()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfud;->zza()Lcom/google/android/gms/internal/ads/zzfua;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfua;->zzb()[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfud;->zza()Lcom/google/android/gms/internal/ads/zzfua;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfua;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfty;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zzb:[B

    new-array v6, v4, [[B

    aput-object p1, v6, v3

    aput-object v5, v6, v2

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgco;->zza([[B)[B

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzfty;->zza([B)[B

    move-result-object p1

    new-array v1, v4, [[B

    aput-object v0, v1, v3

    aput-object p1, v1, v2

    .line 4
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgco;->zza([[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfud;->zza()Lcom/google/android/gms/internal/ads/zzfua;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfua;->zzb()[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfxa;->zza:Lcom/google/android/gms/internal/ads/zzfud;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfud;->zza()Lcom/google/android/gms/internal/ads/zzfua;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfua;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfty;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzfty;->zza([B)[B

    move-result-object p1

    new-array v1, v4, [[B

    aput-object v0, v1, v3

    aput-object p1, v1, v2

    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgco;->zza([[B)[B

    move-result-object p1

    return-object p1
.end method
