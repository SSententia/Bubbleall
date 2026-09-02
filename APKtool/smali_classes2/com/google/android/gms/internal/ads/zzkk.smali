.class final Lcom/google/android/gms/internal/ads/zzkk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"


# direct methods
.method public static zza(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m()Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    const-string v1, "video/hevc"

    .line 2
    invoke-static {v0, v1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/ApplicationMediaCapabilities$Builder;Ljava/lang/String;)Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    const-string v1, "android.media.feature.hdr.dolby_vision"

    .line 3
    invoke-static {v0, v1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/ApplicationMediaCapabilities$Builder;Ljava/lang/String;)Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    const-string v1, "android.media.feature.hdr.hdr10"

    .line 4
    invoke-static {v0, v1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/ApplicationMediaCapabilities$Builder;Ljava/lang/String;)Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    const-string v1, "android.media.feature.hdr.hdr10_plus"

    .line 5
    invoke-static {v0, v1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/ApplicationMediaCapabilities$Builder;Ljava/lang/String;)Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    const-string v1, "android.media.feature.hdr.hlg"

    .line 6
    invoke-static {v0, v1}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m$1(Landroid/media/ApplicationMediaCapabilities$Builder;Ljava/lang/String;)Landroid/media/ApplicationMediaCapabilities$Builder;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/android/billingclient/api/zzn$$ExternalSyntheticApiModelOutline0;->m(Landroid/media/ApplicationMediaCapabilities$Builder;)Landroid/media/ApplicationMediaCapabilities;

    move-result-object v0

    .line 8
    const-string v1, "android.provider.extra.MEDIA_CAPABILITIES"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method
