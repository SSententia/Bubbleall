package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzu extends zzgfw<zzfzv, zzfzu> implements zzghj {
    private zzfzu() {
        super(zzfzv.zzg);
    }

    public final zzfzu zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfzv) this.zza).zzb = 0;
        return this;
    }

    public final zzfzu zzb(zzfzy zzfzyVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfzv.zzi((zzfzv) this.zza, zzfzyVar);
        return this;
    }

    public final zzfzu zzc(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfzv) this.zza).zzf = zzgexVar;
        return this;
    }

    /* synthetic */ zzfzu(zzfzt zzfztVar) {
        super(zzfzv.zzg);
    }
}
