package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxn extends zzgfw<zzfxo, zzfxn> implements zzghj {
    private zzfxn() {
        super(zzfxo.zzg);
    }

    public final zzfxn zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxo) this.zza).zzb = i;
        return this;
    }

    public final zzfxn zzb(zzfxu zzfxuVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfxo.zzi((zzfxo) this.zza, zzfxuVar);
        return this;
    }

    public final zzfxn zzc(zzgai zzgaiVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfxo.zzj((zzfxo) this.zza, zzgaiVar);
        return this;
    }

    /* synthetic */ zzfxn(zzfxm zzfxmVar) {
        super(zzfxo.zzg);
    }
}
