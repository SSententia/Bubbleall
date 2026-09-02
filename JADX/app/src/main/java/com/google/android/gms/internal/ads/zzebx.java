package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebx implements zzfdw<zzebw, zzebs> {
    private final String zza;

    public zzebx(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final /* bridge */ /* synthetic */ zzebs zza(zzebw zzebwVar) throws Exception {
        zzebw zzebwVar2 = zzebwVar;
        int iOptInt = zzebwVar2.zza.optInt("http_timeout_millis", 60000);
        zzcbm zzcbmVar = zzebwVar2.zzb;
        if (zzcbmVar.zza() != -2) {
            if (zzcbmVar.zza() != 1) {
                throw new zzdym(1);
            }
            if (zzcbmVar.zzb() != null) {
                com.google.android.gms.ads.internal.util.zze.zzf(TextUtils.join(", ", zzcbmVar.zzb()));
            }
            throw new zzdym(2, "Error building request URL.");
        }
        HashMap map = new HashMap();
        if (zzebwVar2.zzb.zzg() && !TextUtils.isEmpty(this.zza)) {
            map.put("Cookie", this.zza);
        }
        String strZzd = "";
        if (zzebwVar2.zzb.zzf()) {
            JSONObject jSONObjectOptJSONObject = zzebwVar2.zza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (zzebwVar2.zzb != null && !TextUtils.isEmpty(zzebwVar2.zzb.zzd())) {
            strZzd = zzebwVar2.zzb.zzd();
        }
        return new zzebs(zzebwVar2.zzb.zze(), iOptInt, map, strZzd);
    }
}
