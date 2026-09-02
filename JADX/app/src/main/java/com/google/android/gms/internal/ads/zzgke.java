package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgke extends zzgfw<zzgkf, zzgke> implements zzghj {
    private zzgke() {
        super(zzgkf.zzh);
    }

    public final zzgke zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkf.zzd((zzgkf) this.zza, str);
        return this;
    }

    public final zzgke zzb(long j) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkf.zze((zzgkf) this.zza, j);
        return this;
    }

    public final zzgke zzc(boolean z) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkf.zzf((zzgkf) this.zza, z);
        return this;
    }

    /* synthetic */ zzgke(zzgjg zzgjgVar) {
        super(zzgkf.zzh);
    }
}
