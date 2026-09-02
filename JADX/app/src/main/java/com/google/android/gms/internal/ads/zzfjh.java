package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjh extends zzgfw<zzfjj, zzfjh> implements zzghj {
    private zzfjh() {
        super(zzfjj.zzi);
    }

    public final zzfjh zza(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfjj.zzd((zzfjj) this.zza, str);
        return this;
    }

    public final zzfjh zzb(zzfje zzfjeVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfjj.zze((zzfjj) this.zza, zzfjeVar.zzah());
        return this;
    }

    public final zzfjh zzc(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfjj.zzf((zzfjj) this.zza, 2);
        return this;
    }

    /* synthetic */ zzfjh(zzfjg zzfjgVar) {
        super(zzfjj.zzi);
    }
}
