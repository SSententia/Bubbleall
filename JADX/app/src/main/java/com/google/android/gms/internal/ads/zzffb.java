package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffb {
    private final HashMap<String, String> zza;
    private final zzffh zzb;

    private zzffb() {
        HashMap<String, String> map = new HashMap<>();
        this.zza = map;
        this.zzb = new zzffh(com.google.android.gms.ads.internal.zzt.zzj());
        map.put("new_csi", "1");
    }

    public static zzffb zza(String str) {
        zzffb zzffbVar = new zzffb();
        zzffbVar.zza.put("action", str);
        return zzffbVar;
    }

    public static zzffb zzb(String str) {
        zzffb zzffbVar = new zzffb();
        zzffbVar.zza.put("request_id", str);
        return zzffbVar;
    }

    public final zzffb zzc(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzffb zzd(String str) {
        this.zzb.zza(str);
        return this;
    }

    public final zzffb zze(String str, String str2) {
        this.zzb.zzb(str, str2);
        return this;
    }

    public final zzffb zzf(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final zzffb zzg(zzfal zzfalVar, zzcgi zzcgiVar) {
        zzfak zzfakVar = zzfalVar.zzb;
        zzh(zzfakVar.zzb);
        if (!zzfakVar.zza.isEmpty()) {
            switch (zzfakVar.zza.get(0).zzb) {
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
                    if (zzcgiVar != null) {
                        this.zza.put("as", true != zzcgiVar.zzj() ? "0" : "1");
                    }
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
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
                if (!TextUtils.isEmpty(strZzc)) {
                    this.zza.put("rtype", strZzc);
                }
            }
        }
        return this;
    }

    public final zzffb zzh(zzfac zzfacVar) {
        if (!TextUtils.isEmpty(zzfacVar.zzb)) {
            this.zza.put("gqi", zzfacVar.zzb);
        }
        return this;
    }

    public final zzffb zzi(zzezz zzezzVar) {
        this.zza.put("aai", zzezzVar.zzw);
        return this;
    }

    public final Map<String, String> zzj() {
        HashMap map = new HashMap(this.zza);
        for (zzffg zzffgVar : this.zzb.zzc()) {
            map.put(zzffgVar.zza, zzffgVar.zzb);
        }
        return map;
    }
}
