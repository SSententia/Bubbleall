package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxw extends zzgfw<zzfxx, zzfxw> implements zzghj {
    private zzfxw() {
        super(zzfxx.zzf);
    }

    public final zzfxw zza(zzfya zzfyaVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfxx.zzh((zzfxx) this.zza, zzfyaVar);
        return this;
    }

    public final zzfxw zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfxx) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzfxw(zzfxv zzfxvVar) {
        super(zzfxx.zzf);
    }
}
