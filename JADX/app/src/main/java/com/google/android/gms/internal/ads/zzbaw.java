package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbaw extends zzgfw<zzbbd, zzbaw> implements zzghj {
    private zzbaw() {
        super(zzbbd.zzg);
    }

    public final zzbaw zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbbd.zzi((zzbbd) this.zza, i);
        return this;
    }

    public final zzbaw zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzbbd.zzj((zzbbd) this.zza, i);
        return this;
    }

    /* synthetic */ zzbaw(zzazg zzazgVar) {
        super(zzbbd.zzg);
    }
}
