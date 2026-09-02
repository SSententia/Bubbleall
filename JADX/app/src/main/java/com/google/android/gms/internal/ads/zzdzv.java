package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzv {
    private final zzcoj zza;
    private final Context zzb;
    private final zzcgz zzc;
    private final zzfar zzd;
    private final Executor zze;
    private final String zzf;
    private final zzddv zzg;
    private final zzddz zzh;

    public zzdzv(zzcoj zzcojVar, Context context, zzcgz zzcgzVar, zzfar zzfarVar, Executor executor, String str, zzddv zzddvVar, zzddz zzddzVar) {
        this.zza = zzcojVar;
        this.zzb = context;
        this.zzc = zzcgzVar;
        this.zzd = zzfarVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzddvVar;
        this.zzh = zzddzVar;
    }

    private final zzfsm<zzfal> zze(final String str, final String str2) {
        final zzbtw zzbtwVarZza = com.google.android.gms.ads.internal.zzt.zzp().zzb(this.zzb, this.zzc).zza("google.afma.response.normalize", zzbud.zza, zzbud.zza);
        zzfsm<zzfal> zzfsmVarZzi = zzfsd.zzi(zzfsd.zzi(zzfsd.zzi(zzfsd.zza(""), new zzfrk(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzdzr
            private final zzdzv zza;
            private final String zzb;
            private final String zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) throws JSONException {
                String str3 = this.zzb;
                String str4 = this.zzc;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfsd.zza(jSONObject);
                } catch (JSONException e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    throw new JSONException(strValueOf.length() != 0 ? "Preloaded loader: ".concat(strValueOf) : new String("Preloaded loader: "));
                }
            }
        }, this.zze), new zzfrk(zzbtwVarZza) { // from class: com.google.android.gms.internal.ads.zzdzs
            private final zzbtw zza;

            {
                this.zza = zzbtwVarZza;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzdzt
            private final zzdzv zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzd((JSONObject) obj);
            }
        }, this.zze);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            zzfsd.zzp(zzfsmVarZzi, new zzdzu(this), zzchg.zzf);
        }
        return zzfsmVarZzi;
    }

    private final String zzf(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzi("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zzg(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final zzfsm<zzfal> zzc() {
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfi)).booleanValue()) {
                String strZzg = zzg(str);
                if (TextUtils.isEmpty(strZzg)) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
                        this.zzh.zzbB(true);
                    }
                    return zzfsd.zzc(new zzehs(15, "Invalid ad string."));
                }
                String strZzc = this.zza.zzw().zzc(strZzg);
                if (!TextUtils.isEmpty(strZzc)) {
                    return zze(str, zzf(strZzc));
                }
            }
        }
        zzbcx zzbcxVar = this.zzd.zzd.zzs;
        if (zzbcxVar != null) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfg)).booleanValue()) {
                String strZzg2 = zzg(zzbcxVar.zza);
                String strZzg3 = zzg(zzbcxVar.zzb);
                if (!TextUtils.isEmpty(strZzg3) && strZzg2.equals(strZzg3)) {
                    this.zza.zzw().zzd(strZzg2);
                }
            }
            return zze(zzbcxVar.zza, zzf(zzbcxVar.zzb));
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            this.zzh.zzbB(true);
        }
        return zzfsd.zzc(new zzehs(14, "Mismatch request IDs."));
    }

    final /* synthetic */ zzfsm zzd(JSONObject jSONObject) throws Exception {
        return zzfsd.zza(new zzfal(new zzfai(this.zzd), zzfak.zza(new StringReader(jSONObject.toString()))));
    }
}
