package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtk {
    private final Map<String, Map<String, JSONObject>> zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdtk(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        Map<String, JSONObject> map;
        this.zzd = true;
        zzcfz zzcfzVarZzn = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn();
        if (zzcfzVarZzn == null) {
            return;
        }
        JSONObject jSONObjectZzg = zzcfzVarZzn.zzg();
        if (jSONObjectZzg == null) {
            return;
        }
        this.zzb = ((Boolean) zzbet.zzc().zzc(zzbjl.zzcv)).booleanValue() ? jSONObjectZzg.optJSONObject("common_settings") : null;
        this.zze = jSONObjectZzg.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectZzg.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.zza.containsKey(strOptString2)) {
                            map = this.zza.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.zza.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzp(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdth
            private final zzdtk zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdti
            private final zzdtk zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcu)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map<String, JSONObject> map = this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdtm.zza(this.zze, str, str2);
        if (strZza == null) {
            return null;
        }
        return map.get(strZza);
    }

    @CheckForNull
    public final JSONObject zzc() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcv)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdtj
            private final zzdtk zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }
}
