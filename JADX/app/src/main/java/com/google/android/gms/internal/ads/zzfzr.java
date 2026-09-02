package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzr extends zzgfw<zzfzs, zzfzr> implements zzghj {
    private zzfzr() {
        super(zzfzs.zzg);
    }

    public final zzfzr zza(zzgab zzgabVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfzs.zzg((zzfzs) this.zza, zzgabVar);
        return this;
    }

    public final zzfzr zzb(zzfzm zzfzmVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfzs.zzh((zzfzs) this.zza, zzfzmVar);
        return this;
    }

    public final zzfzr zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfzs) this.zza).zzf = zzfzj.zza(i);
        return this;
    }

    /* synthetic */ zzfzr(zzfzq zzfzqVar) {
        super(zzfzs.zzg);
    }
}
