package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdku implements zzcxj<zzcxn> {
    private final Map<String, zzeec<zzcxn>> zza;
    private final Map<String, zzeec<zzdmh>> zzb;
    private final Map<String, zzegq<zzdmh>> zzc;
    private final zzgln<zzcxj<zzcvh>> zzd;
    private final zzdmx zze;

    zzdku(Map<String, zzeec<zzcxn>> map, Map<String, zzeec<zzdmh>> map2, Map<String, zzegq<zzdmh>> map3, zzgln<zzcxj<zzcvh>> zzglnVar, zzdmx zzdmxVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzglnVar;
        this.zze = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final zzeec<zzcxn> zza(int i, String str) {
        zzeec<zzcvh> zzeecVarZza;
        zzeec<zzcxn> zzeecVar = this.zza.get(str);
        if (zzeecVar != null) {
            return zzeecVar;
        }
        if (i == 1) {
            if (this.zze.zzd() == null || (zzeecVarZza = this.zzd.zzb().zza(i, str)) == null) {
                return null;
            }
            return zzcxn.zzb(zzeecVarZza);
        }
        if (i != 4) {
            return null;
        }
        zzegq<zzdmh> zzegqVar = this.zzc.get(str);
        if (zzegqVar != null) {
            return zzcxn.zza(zzegqVar);
        }
        zzeec<zzdmh> zzeecVar2 = this.zzb.get(str);
        if (zzeecVar2 == null) {
            return null;
        }
        return zzcxn.zzb(zzeecVar2);
    }
}
