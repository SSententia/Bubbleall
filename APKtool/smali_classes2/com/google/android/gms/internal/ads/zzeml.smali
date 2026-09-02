.class public final Lcom/google/android/gms/internal/ads/zzeml;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@20.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzerx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzerx<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzfar;

.field private final zzb:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfar;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "the targeting must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeml;->zza:Lcom/google/android/gms/internal/ads/zzfar;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzeml;->zzb:J

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzf(Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    move-object/from16 v1, p1

    check-cast v1, Landroid/os/Bundle;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeml;->zza:Lcom/google/android/gms/internal/ads/zzfar;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfar;->zzd:Lcom/google/android/gms/internal/ads/zzbdg;

    const-string v3, "http_timeout_millis"

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzw:I

    .line 2
    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzeml;->zza:Lcom/google/android/gms/internal/ads/zzfar;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfar;->zzf:Ljava/lang/String;

    .line 3
    const-string v4, "slotname"

    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzeml;->zza:Lcom/google/android/gms/internal/ads/zzfar;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfar;->zzo:Lcom/google/android/gms/internal/ads/zzfah;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzfah;->zza:I

    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_c

    const/4 v3, 0x2

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    if-eq v4, v3, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    const-string v4, "is_rewarded_interstitial"

    .line 5
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 4
    :cond_1
    const-string v4, "is_new_rewarded"

    .line 6
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 3
    :goto_0
    const-string v4, "start_signals_timestamp"

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzeml;->zzb:J

    .line 7
    invoke-virtual {v1, v4, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v6, "yyyyMMdd"

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 8
    invoke-direct {v4, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v6, Ljava/util/Date;

    iget-wide v7, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzb:J

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 9
    invoke-virtual {v4, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    iget-wide v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzb:J

    const-wide/16 v8, -0x1

    cmp-long v6, v6, v8

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    move v6, v5

    goto :goto_1

    :cond_2
    move v6, v7

    :goto_1
    const-string v8, "cust_age"

    .line 8
    invoke-static {v1, v8, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "extras"

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzc:Landroid/os/Bundle;

    .line 10
    invoke-static {v1, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzf(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzd:I

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzd:I

    const/4 v8, -0x1

    if-eq v6, v8, :cond_3

    move v6, v5

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    const-string v9, "cust_gender"

    .line 12
    invoke-static {v1, v9, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzc(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    const-string v4, "kw"

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zze:Ljava/util/List;

    .line 13
    invoke-static {v1, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzg:I

    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzg:I

    if-eq v6, v8, :cond_4

    move v6, v5

    goto :goto_3

    :cond_4
    move v6, v7

    :goto_3
    const-string v9, "tag_for_child_directed_treatment"

    .line 15
    invoke-static {v1, v9, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzc(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-boolean v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzf:Z

    if-eqz v4, :cond_5

    const-string v4, "test_request"

    .line 16
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zza:I

    if-lt v6, v3, :cond_6

    iget-boolean v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzh:Z

    if-eqz v6, :cond_6

    move v6, v5

    goto :goto_4

    :cond_6
    move v6, v7

    :goto_4
    const-string v9, "d_imp_hdr"

    .line 18
    invoke-static {v1, v9, v4, v6}, Lcom/google/android/gms/internal/ads/zzfbd;->zzc(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzi:Ljava/lang/String;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zza:I

    if-lt v6, v3, :cond_7

    .line 19
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    move v3, v5

    goto :goto_5

    :cond_7
    move v3, v7

    :goto_5
    const-string v6, "ppid"

    .line 20
    invoke-static {v1, v6, v4, v3}, Lcom/google/android/gms/internal/ads/zzfbd;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzk:Landroid/location/Location;

    if-eqz v3, :cond_8

    .line 21
    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    const/high16 v6, 0x447a0000    # 1000.0f

    mul-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 22
    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    mul-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    .line 23
    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    const-wide v14, 0x416312d000000000L    # 1.0E7

    mul-double/2addr v12, v14

    double-to-long v12, v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    .line 24
    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v17

    mul-double v14, v14, v17

    double-to-long v14, v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v5, Landroid/os/Bundle;

    .line 25
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 26
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "radius"

    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 27
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "lat"

    invoke-virtual {v5, v4, v12, v13}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "long"

    invoke-virtual {v5, v3, v14, v15}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 29
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "time"

    invoke-virtual {v5, v3, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "uule"

    .line 30
    invoke-virtual {v1, v3, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    const-string v3, "url"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzl:Ljava/lang/String;

    .line 31
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "neighboring_content_urls"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzv:Ljava/util/List;

    .line 32
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    const-string v3, "custom_targeting"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzn:Landroid/os/Bundle;

    .line 33
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zzf(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v3, "category_exclusions"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzo:Ljava/util/List;

    .line 34
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    const-string v3, "request_agent"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzp:Ljava/lang/String;

    .line 35
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "request_pkg"

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzq:Ljava/lang/String;

    .line 36
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzr:Z

    .line 37
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zza:I

    const/4 v5, 0x7

    if-lt v4, v5, :cond_9

    const/4 v4, 0x1

    goto :goto_6

    :cond_9
    move v4, v7

    :goto_6
    const-string v5, "is_designed_for_families"

    .line 38
    invoke-static {v1, v5, v3, v4}, Lcom/google/android/gms/internal/ads/zzfbd;->zzd(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    iget v3, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zza:I

    const/16 v4, 0x8

    if-lt v3, v4, :cond_b

    iget v3, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzt:I

    .line 39
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzt:I

    if-eq v4, v8, :cond_a

    const/4 v5, 0x1

    goto :goto_7

    :cond_a
    move v5, v7

    :goto_7
    const-string v4, "tag_for_under_age_of_consent"

    .line 40
    invoke-static {v1, v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzfbd;->zzc(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    const-string v3, "max_ad_content_rating"

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzbdg;->zzu:Ljava/lang/String;

    .line 41
    invoke-static {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzfbd;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return-void

    :cond_c
    const/4 v1, 0x0

    .line 4
    throw v1
.end method
