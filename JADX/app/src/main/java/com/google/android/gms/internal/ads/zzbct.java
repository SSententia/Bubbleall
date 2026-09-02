package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbct extends zzgfw<zzbcu, zzbct> implements zzghj {
    private zzbct() {
        super(zzbcu.zzg);
    }

    public final boolean zza() {
        return ((zzbcu) this.zza).zza();
    }

    public final zzbct zzb(boolean z) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbcu.zze((zzbcu) this.zza, z);
        return this;
    }

    public final zzbct zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbcu.zzf((zzbcu) this.zza, i);
        return this;
    }

    /* synthetic */ zzbct(zzazg zzazgVar) {
        super(zzbcu.zzg);
    }
}
