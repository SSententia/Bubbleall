package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuh implements zzua {
    final /* synthetic */ zzuj zza;
    private final zzame zzb = new zzame(new byte[4], 4);

    public zzuh(zzuj zzujVar) {
        this.zza = zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzb(zzamf zzamfVar) {
        if (zzamfVar.zzn() == 0 && (zzamfVar.zzn() & 128) != 0) {
            zzamfVar.zzk(6);
            int iZzd = zzamfVar.zzd() / 4;
            for (int i = 0; i < iZzd; i++) {
                zzamfVar.zzl(this.zzb, 4);
                int iZzh = this.zzb.zzh(16);
                this.zzb.zzf(3);
                if (iZzh == 0) {
                    this.zzb.zzf(13);
                } else {
                    int iZzh2 = this.zzb.zzh(13);
                    if (this.zza.zzf.get(iZzh2) == null) {
                        this.zza.zzf.put(iZzh2, new zzub(new zzui(this.zza, iZzh2)));
                        this.zza.zzl++;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }
}
