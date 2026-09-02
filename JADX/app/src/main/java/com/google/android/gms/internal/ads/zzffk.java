package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffk {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzffk(Context context, zzcgz zzcgzVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcgzVar.zza;
    }

    public final void zza(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzx());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) ? "0" : "1");
        List<String> listZzd = zzbjl.zzd();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzff)).booleanValue()) {
            listZzd.addAll(com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzh());
        }
        map.put("e", TextUtils.join(",", listZzd));
        map.put("sdkVersion", this.zzc);
    }
}
