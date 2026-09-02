package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbj extends zzgfw<zzgbk, zzgbj> implements zzghj {
    private zzgbj() {
        super(zzgbk.zzf);
    }

    public final zzgbj zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgbk) this.zza).zzb = 0;
        return this;
    }

    public final zzgbj zzb(zzgbn zzgbnVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgbk.zzh((zzgbk) this.zza, zzgbnVar);
        return this;
    }

    /* synthetic */ zzgbj(zzgbi zzgbiVar) {
        super(zzgbk.zzf);
    }
}
