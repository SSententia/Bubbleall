package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyf extends zzgfw<zzfyg, zzfyf> implements zzghj {
    private zzfyf() {
        super(zzfyg.zzf);
    }

    public final zzfyf zza(zzfyj zzfyjVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfyg.zzg((zzfyg) this.zza, zzfyjVar);
        return this;
    }

    public final zzfyf zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfyg) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzfyf(zzfye zzfyeVar) {
        super(zzfyg.zzf);
    }
}
