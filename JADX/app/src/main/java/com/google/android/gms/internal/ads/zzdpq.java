package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpq {
    private final Executor zza;
    private final zzdpl zzb;

    public zzdpq(Executor executor, zzdpl zzdplVar) {
        this.zza = executor;
        this.zzb = zzdplVar;
    }

    public final zzfsm<List<zzdpp>> zza(JSONObject jSONObject, String str) {
        zzfsm zzfsmVarZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzfsd.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                zzfsmVarZza = zzfsd.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    zzfsmVarZza = zzfsd.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    zzfsmVarZza = "string".equals(strOptString2) ? zzfsd.zza(new zzdpp(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzfsd.zzj(this.zzb.zza(jSONObjectOptJSONObject, "image_value"), new zzfln(strOptString) { // from class: com.google.android.gms.internal.ads.zzdpo
                        private final String zza;

                        {
                            this.zza = strOptString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzfln
                        public final Object apply(Object obj) {
                            return new zzdpp(this.zza, (zzblr) obj);
                        }
                    }, this.zza) : zzfsd.zza(null);
                }
            }
            arrayList.add(zzfsmVarZza);
        }
        return zzfsd.zzj(zzfsd.zzk(arrayList), zzdpn.zza, this.zza);
    }
}
