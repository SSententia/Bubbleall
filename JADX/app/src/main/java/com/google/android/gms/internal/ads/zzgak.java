package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgak extends zzgfw<zzgal, zzgak> implements zzghj {
    private zzgak() {
        super(zzgal.zzg);
    }

    public final zzgak zza(zzgao zzgaoVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgal.zzh((zzgal) this.zza, zzgaoVar);
        return this;
    }

    public final zzgak zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgal) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzgak(zzgaj zzgajVar) {
        super(zzgal.zzg);
    }
}
