.class final synthetic Lcom/google/android/gms/internal/ads/zzcto;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcml;

.field private final zzb:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcml;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcto;->zza:Lcom/google/android/gms/internal/ads/zzcml;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcto;->zzb:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcto;->zza:Lcom/google/android/gms/internal/ads/zzcml;

    const-string v1, "AFMA_updateActiveView"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcto;->zzb:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcml;->zzr(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
