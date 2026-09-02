package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgah extends zzgfw<zzgai, zzgah> implements zzghj {
    private zzgah() {
        super(zzgai.zzg);
    }

    public final zzgah zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgai) this.zza).zzb = 0;
        return this;
    }

    public final zzgah zzb(zzgao zzgaoVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgai.zzj((zzgai) this.zza, zzgaoVar);
        return this;
    }

    public final zzgah zzc(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgai) this.zza).zzf = zzgexVar;
        return this;
    }

    /* synthetic */ zzgah(zzgag zzgagVar) {
        super(zzgai.zzg);
    }
}
