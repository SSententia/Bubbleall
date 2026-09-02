package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgaq extends zzgfw<zzgar, zzgaq> implements zzghj {
    private zzgaq() {
        super(zzgar.zzg);
    }

    public final zzgaq zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgar) this.zza).zzb = str;
        return this;
    }

    public final zzgaq zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgar) this.zza).zze = zzgexVar;
        return this;
    }

    public final zzgaq zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgar) this.zza).zzf = i - 2;
        return this;
    }

    /* synthetic */ zzgaq(zzgap zzgapVar) {
        super(zzgar.zzg);
    }
}
