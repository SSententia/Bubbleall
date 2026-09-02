package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbp extends zzgfw<zzgbq, zzgbp> implements zzghj {
    private zzgbp() {
        super(zzgbq.zzf);
    }

    public final zzgbp zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgbq) this.zza).zzb = 0;
        return this;
    }

    public final zzgbp zzb(zzgbt zzgbtVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgbq.zzh((zzgbq) this.zza, zzgbtVar);
        return this;
    }

    /* synthetic */ zzgbp(zzgbo zzgboVar) {
        super(zzgbq.zzf);
    }
}
