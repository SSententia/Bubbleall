package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnp extends zzfne {
    final /* synthetic */ zzfns zza;
    private final Object zzb;
    private int zzc;

    zzfnp(zzfns zzfnsVar, int i) {
        this.zza = zzfnsVar;
        this.zzb = zzfns.zzs(zzfnsVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzflt.zza(this.zzb, zzfns.zzs(this.zza, this.zzc))) {
            this.zzc = this.zza.zzy(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzg = this.zza.zzg();
        if (mapZzg != null) {
            return mapZzg.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfns.zzt(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzg = this.zza.zzg();
        if (mapZzg != null) {
            return mapZzg.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object objZzt = zzfns.zzt(this.zza, i);
        zzfns.zzu(this.zza, this.zzc, obj);
        return objZzt;
    }
}
