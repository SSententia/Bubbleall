package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbag extends zzgfw<zzbah, zzbag> implements zzghj {
    private zzbag() {
        super(zzbah.zzm);
    }

    public final zzbag zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbah.zzd((zzbah) this.zza, str);
        return this;
    }

    public final zzbag zzb(zzbbz zzbbzVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbah.zze((zzbah) this.zza, zzbbzVar);
        return this;
    }

    /* synthetic */ zzbag(zzazg zzazgVar) {
        super(zzbah.zzm);
    }
}
