package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbka {
    private final List<zzbjx> zza = new LinkedList();
    private final Map<String, String> zzb;
    private final Object zzc;

    public zzbka(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjx zzf() {
        return new zzbjx(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime(), null, null);
    }

    public final void zza(zzbka zzbkaVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjx zzbjxVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbjx(j, strArr[i], zzbjxVar));
            }
        }
        return true;
    }

    public final zzbjz zzc() {
        zzbjz zzbjzVar;
        boolean zBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            for (zzbjx zzbjxVar : this.zza) {
                long jZza = zzbjxVar.zza();
                String strZzb = zzbjxVar.zzb();
                zzbjx zzbjxVarZzc = zzbjxVar.zzc();
                if (zzbjxVarZzc != null && jZza > 0) {
                    long jZza2 = jZza - zzbjxVarZzc.zza();
                    sb.append(strZzb);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbjxVarZzc.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbjxVarZzc.zza()));
                            sb2.append('+');
                            sb2.append(strZzb);
                        } else {
                            map.put(Long.valueOf(zzbjxVarZzc.zza()), new StringBuilder(strZzb));
                        }
                    }
                }
            }
            this.zza.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbjzVar = new zzbjz(sb.toString(), string);
        }
        return zzbjzVar;
    }

    public final void zzd(String str, String str2) {
        zzbjq zzbjqVarZze;
        if (TextUtils.isEmpty(str2) || (zzbjqVarZze = com.google.android.gms.ads.internal.zzt.zzg().zze()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbjw zzbjwVarZzd = zzbjqVarZze.zzd(str);
            Map<String, String> map = this.zzb;
            map.put(str, zzbjwVarZzd.zza(map.get(str), str2));
        }
    }

    public final Map<String, String> zze() {
        Map<String, String> map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzg().zze();
            map = this.zzb;
        }
        return map;
    }
}
