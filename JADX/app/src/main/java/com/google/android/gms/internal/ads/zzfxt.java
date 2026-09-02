package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxt extends zzgfw<zzfxu, zzfxt> implements zzghj {
    private zzfxt() {
        super(zzfxu.zzg);
    }

    public final zzfxt zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxu) this.zza).zzb = 0;
        return this;
    }

    public final zzfxt zzb(zzfya zzfyaVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfxu.zzj((zzfxu) this.zza, zzfyaVar);
        return this;
    }

    public final zzfxt zzc(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxu) this.zza).zzf = zzgexVar;
        return this;
    }

    /* synthetic */ zzfxt(zzfxs zzfxsVar) {
        super(zzfxu.zzg);
    }
}
