package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyc implements zzdyk, zzdxn {
    private final zzdyj zza;
    private final zzdyl zzb;
    private final zzdxo zzc;
    private final zzdxx zzd;
    private final zzdxm zze;
    private final String zzf;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private String zzh = "{}";
    private String zzi = "";
    private long zzj = Long.MAX_VALUE;
    private zzdxy zzk = zzdxy.NONE;
    private zzdyb zzo = zzdyb.UNKNOWN;
    private final Map<String, List<zzdxq>> zzg = new HashMap();

    zzdyc(zzdyj zzdyjVar, zzdyl zzdylVar, zzdxo zzdxoVar, Context context, zzcgz zzcgzVar, zzdxx zzdxxVar) {
        this.zza = zzdyjVar;
        this.zzb = zzdylVar;
        this.zzc = zzdxoVar;
        this.zze = new zzdxm(context);
        this.zzf = zzcgzVar.zza;
        this.zzd = zzdxxVar;
        com.google.android.gms.ads.internal.zzt.zzm().zza(this);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    private final synchronized void zzo(boolean z, boolean z2) {
        if (this.zzl == z) {
            return;
        }
        this.zzl = z;
        if (z) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzm().zzk()) {
                zzs();
            } else if (!zzn()) {
                zzt();
            }
        } else if (!zzn()) {
            zzt();
        }
        if (z2) {
            zzu();
        }
    }

    private final synchronized void zzp(zzdxy zzdxyVar, boolean z) {
        if (this.zzk == zzdxyVar) {
            return;
        }
        if (zzn()) {
            zzt();
        }
        this.zzk = zzdxyVar;
        if (zzn()) {
            zzs();
        }
        if (z) {
            zzu();
        }
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<zzdxq>> entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdxq zzdxqVar : entry.getValue()) {
                if (zzdxqVar.zzc()) {
                    jSONArray.put(zzdxqVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzn = true;
        this.zzd.zza();
        this.zza.zzg(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        zzv(com.google.android.gms.ads.internal.zzt.zzg().zzp().zzG());
    }

    private final synchronized void zzs() {
        zzdxy zzdxyVar = zzdxy.NONE;
        int iOrdinal = this.zzk.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzt() {
        zzdxy zzdxyVar = zzdxy.NONE;
        int iOrdinal = this.zzk.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzu() {
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzH(zzh());
    }

    private final synchronized void zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzo(jSONObject.optBoolean("isTestMode", false), false);
            zzp(zzdxy.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzh = jSONObject.optString("networkExtras", "{}");
            this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final void zza() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzg().zzp().zzI()) {
                zzr();
                return;
            }
            String strZzG = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzG();
            if (TextUtils.isEmpty(strZzG)) {
                return;
            }
            try {
                if (new JSONObject(strZzG).optBoolean("isTestMode", false)) {
                    zzr();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzb(boolean z) {
        if (this.zzn) {
            if (z) {
                if (!this.zzl) {
                    zzs();
                    return;
                }
            }
        } else if (z) {
            zzr();
            if (!this.zzl) {
                zzs();
                return;
            }
        }
        if (zzn()) {
            return;
        }
        zzt();
    }

    public final void zzc(boolean z) {
        if (!this.zzn && z) {
            zzr();
        }
        zzo(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzl;
    }

    public final void zze(zzdxy zzdxyVar) {
        zzp(zzdxyVar, true);
    }

    public final zzdxy zzf() {
        return this.zzk;
    }

    public final synchronized String zzg() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzn()) {
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
                this.zzj = Long.MAX_VALUE;
                return "";
            }
            if (this.zzh.equals("{}")) {
                return "";
            }
            return this.zzh;
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzl);
            jSONObject.put("gesture", this.zzk);
            if (this.zzj > com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzh);
                jSONObject.put("networkExtrasExpirationSecs", this.zzj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j) {
        this.zzh = str;
        this.zzj = j;
        zzu();
    }

    public final synchronized void zzj(String str, zzdxq zzdxqVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzn()) {
            if (this.zzm >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgr)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzg.containsKey(str)) {
                this.zzg.put(str, new ArrayList());
            }
            this.zzm++;
            this.zzg.get(str).add(zzdxqVar);
        }
    }

    public final synchronized void zzk(zzbgq zzbgqVar, zzdyb zzdybVar) {
        if (!zzn()) {
            try {
                zzbgqVar.zze(zzfbm.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
            this.zzo = zzdybVar;
            this.zza.zzh(zzbgqVar, new zzbps(this));
            return;
        } else {
            try {
                zzbgqVar.zze(zzfbm.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzl(String str) {
        this.zzi = str;
    }

    public final synchronized JSONObject zzm() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zzb());
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String strZzd = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                jSONObject.put("cld", new JSONObject(strZzd));
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgF)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String strValueOf = String.valueOf(this.zzi);
                com.google.android.gms.ads.internal.util.zze.zzd(strValueOf.length() != 0 ? "Policy violation data: ".concat(strValueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized boolean zzn() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
            return this.zzl || com.google.android.gms.ads.internal.zzt.zzm().zzk();
        }
        return this.zzl;
    }
}
