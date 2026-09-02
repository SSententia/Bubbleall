package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeke {
    private final Map<String, zzekg> zza = new HashMap();
    private final Map<String, zzeki> zzb = new HashMap();
    private final Map<String, Map<String, List<zzekg>>> zzc = new HashMap();
    private final Executor zzd;
    private JSONObject zze;

    public zzeke(Executor executor) {
        this.zzd = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        this.zzb.clear();
        this.zza.clear();
        zzi();
        zzh();
    }

    private final synchronized void zzh() {
        if (!zzblc.zze.zze().booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbh)).booleanValue()) {
                JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzg();
                if (jSONObjectZzg == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleZzl = zzl(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzeki(strOptString, zOptBoolean2, zOptBoolean, bundleZzl));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzi() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzg();
        if (jSONObjectZzg != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectZzg.optJSONArray("ad_unit_id_settings");
                this.zze = jSONObjectZzg.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                        String strOptString = jSONObject.optString("ad_unit_id", "");
                        String strOptString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                arrayList.addAll(zzj(jSONArrayOptJSONArray.getJSONObject(i2), strOptString2));
                            }
                        }
                        zzk(strOptString2, strOptString, arrayList);
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized List<zzekg> zzj(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle bundleZzl = zzl(jSONObject.optJSONObject("data"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList2.add(strOptString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            zzd(str2);
            if (this.zza.get(str2) != null) {
                arrayList.add(new zzekg(str2, str, bundleZzl));
            }
        }
        return arrayList;
    }

    private final synchronized void zzk(String str, String str2, List<zzekg> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, List<zzekg>> map = this.zzc.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        this.zzc.put(str, map);
        List<zzekg> arrayList = map.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.addAll(list);
        map.put(str2, arrayList);
    }

    private static final Bundle zzl(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzp(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekb
            private final zzeke zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekc
            private final zzeke zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    public final synchronized Map<String, zzeki> zzb() {
        return zzfon.zzb(this.zzb);
    }

    public final synchronized Map<String, List<Bundle>> zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, List<zzekg>> map = this.zzc.get(str);
            if (map == null) {
                return zzfon.zza();
            }
            List<zzekg> list = map.get(str2);
            if (list == null) {
                list = map.get(zzdtm.zza(this.zze, str2, str));
            }
            if (list == null) {
                return zzfon.zza();
            }
            HashMap map2 = new HashMap();
            for (zzekg zzekgVar : list) {
                String str3 = zzekgVar.zza;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(zzekgVar.zzc);
            }
            return zzfon.zzb(map2);
        }
        return zzfon.zza();
    }

    public final synchronized void zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.zza.containsKey(str)) {
            return;
        }
        this.zza.put(str, new zzekg(str, "", new Bundle()));
    }

    final /* synthetic */ void zze() {
        this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekd
            private final zzeke zza;

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
