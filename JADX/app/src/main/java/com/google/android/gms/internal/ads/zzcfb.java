package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcfb {
    static zzcfb zza;

    public static synchronized zzcfb zzd(Context context) {
        zzcfb zzcfbVar = zza;
        if (zzcfbVar != null) {
            return zzcfbVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbjl.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzp = com.google.android.gms.ads.internal.zzt.zzg().zzp();
        zzgVarZzp.zza(applicationContext);
        zzcef zzcefVar = new zzcef(null);
        zzcefVar.zza(applicationContext);
        zzcefVar.zzb(com.google.android.gms.ads.internal.zzt.zzj());
        zzcefVar.zzc(zzgVarZzp);
        zzcefVar.zzd(com.google.android.gms.ads.internal.zzt.zzA());
        zzcfb zzcfbVarZze = zzcefVar.zze();
        zza = zzcfbVarZze;
        zzcfbVarZze.zza().zza();
        zza.zzb().zze();
        final zzcfg zzcfgVarZzc = zza.zzc();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzal)).booleanValue()) {
            final HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) zzbet.zzc().zzc(zzbjl.zzan));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    zzcfgVarZzc.zzc((String) it.next());
                }
                zzcfgVarZzc.zzb(new zzcff(zzcfgVarZzc, map) { // from class: com.google.android.gms.internal.ads.zzcfd
                    private final zzcfg zza;
                    private final Map zzb;

                    {
                        this.zza = zzcfgVarZzc;
                        this.zzb = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcff
                    public final void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        this.zza.zzd(this.zzb, sharedPreferences, str, str2);
                    }
                });
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zze("Failed to parse listening list", e);
            }
        }
        return zza;
    }

    abstract zzcdz zza();

    abstract zzced zzb();

    abstract zzcfg zzc();
}
