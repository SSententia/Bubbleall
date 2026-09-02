.class final Lcom/google/android/gms/internal/ads/zzcio;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Z

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcip;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcip;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcio;->zzb:Lcom/google/android/gms/internal/ads/zzcip;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcio;->zza:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcio;->zzb:Lcom/google/android/gms/internal/ads/zzcip;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcio;->zza:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "isVisible"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "windowVisibilityChanged"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzcip;->zzF(Lcom/google/android/gms/internal/ads/zzcip;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
