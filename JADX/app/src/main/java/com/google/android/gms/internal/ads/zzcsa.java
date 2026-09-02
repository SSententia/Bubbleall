package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsa {
    private final Map<String, zzcsd> zza;
    private final Map<String, zzcsc> zzb;

    zzcsa(Map<String, zzcsd> map, Map<String, zzcsc> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfal zzfalVar) throws Exception {
        for (zzfaj zzfajVar : zzfalVar.zzb.zzc) {
            if (this.zza.containsKey(zzfajVar.zza)) {
                this.zza.get(zzfajVar.zza).zza(zzfajVar.zzb);
            } else if (this.zzb.containsKey(zzfajVar.zza)) {
                zzcsc zzcscVar = this.zzb.get(zzfajVar.zza);
                JSONObject jSONObject = zzfajVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzcscVar.zza(map);
            }
        }
    }
}
