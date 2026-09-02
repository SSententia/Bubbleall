package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgan extends zzgfw<zzgao, zzgan> implements zzghj {
    private zzgan() {
        super(zzgao.zzf);
    }

    public final zzgan zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgao) this.zza).zze = i;
        return this;
    }

    public final zzgan zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzgao) this.zza).zzb = zzgaf.zza(i);
        return this;
    }

    /* synthetic */ zzgan(zzgam zzgamVar) {
        super(zzgao.zzf);
    }
}
