package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeml implements zzerx<Bundle> {
    final zzfar zza;
    private final long zzb;

    public zzeml(zzfar zzfarVar, long j) {
        Preconditions.checkNotNull(zzfarVar, "the targeting must not be null");
        this.zza = zzfarVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzbdg zzbdgVar = this.zza.zzd;
        bundle2.putInt("http_timeout_millis", zzbdgVar.zzw);
        bundle2.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        bundle2.putLong("start_signals_timestamp", this.zzb);
        zzfbd.zzb(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzbdgVar.zzb)), zzbdgVar.zzb != -1);
        zzfbd.zzf(bundle2, "extras", zzbdgVar.zzc);
        zzfbd.zzc(bundle2, "cust_gender", Integer.valueOf(zzbdgVar.zzd), zzbdgVar.zzd != -1);
        zzfbd.zzg(bundle2, "kw", zzbdgVar.zze);
        zzfbd.zzc(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzbdgVar.zzg), zzbdgVar.zzg != -1);
        if (zzbdgVar.zzf) {
            bundle2.putBoolean("test_request", true);
        }
        zzfbd.zzc(bundle2, "d_imp_hdr", 1, zzbdgVar.zza >= 2 && zzbdgVar.zzh);
        String str = zzbdgVar.zzi;
        zzfbd.zzb(bundle2, "ppid", str, zzbdgVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzbdgVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            Float fValueOf = Float.valueOf(accuracy);
            long time = location.getTime() * 1000;
            Long lValueOf = Long.valueOf(time);
            long latitude = (long) (location.getLatitude() * 1.0E7d);
            Long lValueOf2 = Long.valueOf(latitude);
            long longitude = (long) (1.0E7d * location.getLongitude());
            Long lValueOf3 = Long.valueOf(longitude);
            Bundle bundle3 = new Bundle();
            fValueOf.getClass();
            bundle3.putFloat("radius", accuracy);
            lValueOf2.getClass();
            bundle3.putLong("lat", latitude);
            lValueOf3.getClass();
            bundle3.putLong("long", longitude);
            lValueOf.getClass();
            bundle3.putLong("time", time);
            bundle2.putBundle("uule", bundle3);
        }
        zzfbd.zze(bundle2, ImagesContract.URL, zzbdgVar.zzl);
        zzfbd.zzg(bundle2, "neighboring_content_urls", zzbdgVar.zzv);
        zzfbd.zzf(bundle2, "custom_targeting", zzbdgVar.zzn);
        zzfbd.zzg(bundle2, "category_exclusions", zzbdgVar.zzo);
        zzfbd.zze(bundle2, "request_agent", zzbdgVar.zzp);
        zzfbd.zze(bundle2, "request_pkg", zzbdgVar.zzq);
        zzfbd.zzd(bundle2, "is_designed_for_families", Boolean.valueOf(zzbdgVar.zzr), zzbdgVar.zza >= 7);
        if (zzbdgVar.zza >= 8) {
            zzfbd.zzc(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzbdgVar.zzt), zzbdgVar.zzt != -1);
            zzfbd.zze(bundle2, "max_ad_content_rating", zzbdgVar.zzu);
        }
    }
}
