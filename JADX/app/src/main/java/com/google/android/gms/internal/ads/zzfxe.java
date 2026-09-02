package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxe extends zzgfw<zzfxf, zzfxe> implements zzghj {
    private zzfxe() {
        super(zzfxf.zzg);
    }

    public final zzfxe zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxf) this.zza).zzb = 0;
        return this;
    }

    public final zzfxe zzb(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxf) this.zza).zze = zzgexVar;
        return this;
    }

    public final zzfxe zzc(zzfxl zzfxlVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfxf.zzj((zzfxf) this.zza, zzfxlVar);
        return this;
    }

    /* synthetic */ zzfxe(zzfxd zzfxdVar) {
        super(zzfxf.zzg);
    }
}
