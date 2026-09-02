package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgca extends zzgfw<zzgcb, zzgca> implements zzghj {
    private zzgca() {
        super(zzgcb.zzf);
    }

    public final zzgca zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgcb) this.zza).zzb = 0;
        return this;
    }

    public final zzgca zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgcb) this.zza).zze = zzgexVar;
        return this;
    }

    /* synthetic */ zzgca(zzgbz zzgbzVar) {
        super(zzgcb.zzf);
    }
}
