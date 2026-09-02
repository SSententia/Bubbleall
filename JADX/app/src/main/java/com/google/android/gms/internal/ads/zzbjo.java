package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjo {
    private final String zza = zzbkt.zzb.zze();
    private final Map<String, String> zzb;
    private final Context zzc;
    private final String zzd;

    public zzbjo(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzx());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        Future<zzcbo> futureZzb = com.google.android.gms.ads.internal.zzt.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(futureZzb.get().zzk));
            linkedHashMap.put("network_fine", Integer.toString(futureZzb.get().zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map<String, String> zzd() {
        return this.zzb;
    }
}
