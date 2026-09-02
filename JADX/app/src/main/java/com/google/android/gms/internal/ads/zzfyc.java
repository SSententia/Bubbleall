package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyc extends zzgfw<zzfyd, zzfyc> implements zzghj {
    private zzfyc() {
        super(zzfyd.zzg);
    }

    public final zzfyc zza(int i) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfyd) this.zza).zzb = 0;
        return this;
    }

    public final zzfyc zzb(zzfyj zzfyjVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzfyd.zzi((zzfyd) this.zza, zzfyjVar);
        return this;
    }

    public final zzfyc zzc(zzgex zzgexVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        ((zzfyd) this.zza).zzf = zzgexVar;
        return this;
    }

    /* synthetic */ zzfyc(zzfyb zzfybVar) {
        super(zzfyd.zzg);
    }
}
