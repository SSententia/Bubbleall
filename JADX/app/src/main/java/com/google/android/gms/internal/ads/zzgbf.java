package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbf extends zzgfw<zzgbg, zzgbf> implements zzghj {
    private zzgbf() {
        super(zzgbg.zzh);
    }

    public final zzgbf zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgbg.zzd((zzgbg) this.zza, str);
        return this;
    }

    public final zzgbf zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgbg) this.zza).zzf = i;
        return this;
    }

    public final zzgbf zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgbg.zzf((zzgbg) this.zza, i);
        return this;
    }

    public final zzgbf zzd(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgbg) this.zza).zzg = zzgbv.zza(i);
        return this;
    }

    /* synthetic */ zzgbf(zzgbd zzgbdVar) {
        super(zzgbg.zzh);
    }
}
