package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbe extends zzgfw<zzgbh, zzgbe> implements zzghj {
    private zzgbe() {
        super(zzgbh.zzf);
    }

    public final zzgbe zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgbh) this.zza).zzb = i;
        return this;
    }

    public final zzgbe zzb(zzgbg zzgbgVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgbh.zze((zzgbh) this.zza, zzgbgVar);
        return this;
    }

    /* synthetic */ zzgbe(zzgbd zzgbdVar) {
        super(zzgbh.zzf);
    }
}
