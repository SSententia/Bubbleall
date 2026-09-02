package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvh {
    final /* synthetic */ zzdvi zza;
    private final Map<String, String> zzb = new ConcurrentHashMap();

    zzdvh(zzdvi zzdviVar) {
        this.zza = zzdviVar;
    }

    static /* synthetic */ zzdvh zza(zzdvh zzdvhVar) {
        zzdvhVar.zzb.putAll(zzdvhVar.zza.zzc);
        return zzdvhVar;
    }

    public final zzdvh zzb(zzfac zzfacVar) {
        this.zzb.put("gqi", zzfacVar.zzb);
        return this;
    }

    public final zzdvh zzc(zzezz zzezzVar) {
        this.zzb.put("aai", zzezzVar.zzw);
        return this;
    }

    public final zzdvh zzd(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final void zze() {
        this.zza.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdvg
            private final zzdvh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    public final String zzf() {
        return this.zza.zza.zzc(this.zzb);
    }

    final /* synthetic */ void zzg() {
        this.zza.zza.zzb(this.zzb);
    }
}
