package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzd extends zzgfw<zzfze, zzfzd> implements zzghj {
    private zzfzd() {
        super(zzfze.zzf);
    }

    public final zzfzd zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfze) this.zza).zzb = 0;
        return this;
    }

    public final zzfzd zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfze) this.zza).zze = zzgexVar;
        return this;
    }

    /* synthetic */ zzfzd(zzfzc zzfzcVar) {
        super(zzfze.zzf);
    }
}
