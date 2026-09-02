package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyr extends zzgfw<zzfys, zzfyr> implements zzghj {
    private zzfyr() {
        super(zzfys.zzf);
    }

    public final zzfyr zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfys) this.zza).zzb = 0;
        return this;
    }

    public final zzfyr zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfys) this.zza).zze = zzgexVar;
        return this;
    }

    /* synthetic */ zzfyr(zzfyq zzfyqVar) {
        super(zzfys.zzf);
    }
}
