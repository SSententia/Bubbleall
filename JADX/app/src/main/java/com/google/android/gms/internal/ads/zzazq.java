package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazq extends zzgfw<zzazr, zzazq> implements zzghj {
    private zzazq() {
        super(zzazr.zzg);
    }

    public final zzazq zza(boolean z) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzazr.zze((zzazr) this.zza, z);
        return this;
    }

    public final zzazq zzb(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzazr.zzf((zzazr) this.zza, i);
        return this;
    }

    /* synthetic */ zzazq(zzazg zzazgVar) {
        super(zzazr.zzg);
    }
}
