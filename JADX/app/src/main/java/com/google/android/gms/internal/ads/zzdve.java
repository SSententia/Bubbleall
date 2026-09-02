package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdve {
    private final ConcurrentHashMap<String, String> zza;
    private final zzcgi zzb;

    public zzdve(zzdvn zzdvnVar, zzcgi zzcgiVar) {
        this.zza = new ConcurrentHashMap<>(zzdvnVar.zzb);
        this.zzb = zzcgiVar;
    }

    public final void zza(zzfal zzfalVar) {
        if (zzfalVar.zzb.zza.size() > 0) {
            switch (zzfalVar.zzb.zza.get(0).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzj() ? "0" : "1");
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        if (!TextUtils.isEmpty(zzfalVar.zzb.zzb.zzb)) {
            this.zza.put("gqi", zzfalVar.zzb.zzb.zzb);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zze.zza(zzfalVar);
            this.zza.put("scar", String.valueOf(zZza));
            if (zZza) {
                String strZzb = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzb(zzfalVar);
                if (!TextUtils.isEmpty(strZzb)) {
                    this.zza.put("ragent", strZzb);
                }
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzc(zzfalVar);
                if (TextUtils.isEmpty(strZzc)) {
                    return;
                }
                this.zza.put("rtype", strZzc);
            }
        }
    }

    public final void zzb(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzc() {
        return this.zza;
    }
}
