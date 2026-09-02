package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgat extends zzgfw<zzgau, zzgat> implements zzghj {
    private zzgat() {
        super(zzgau.zzg);
    }

    public final zzgat zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgau.zzg((zzgau) this.zza, str);
        return this;
    }

    public final zzgat zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgau) this.zza).zze = zzgexVar;
        return this;
    }

    public final zzgat zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgau) this.zza).zzf = zzgbv.zza(i);
        return this;
    }

    /* synthetic */ zzgat(zzgas zzgasVar) {
        super(zzgau.zzg);
    }
}
