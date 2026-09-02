package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzty {
    private final zztb zza;
    private final zzamn zzb;
    private final zzame zzc = new zzame(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzty(zztb zztbVar, zzamn zzamnVar) {
        this.zza = zztbVar;
        this.zzb = zzamnVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzamf zzamfVar) throws zzaha {
        long jZze;
        zzamfVar.zzm(this.zzc.zza, 0, 3);
        this.zzc.zzd(0);
        this.zzc.zzf(8);
        this.zzd = this.zzc.zzg();
        this.zze = this.zzc.zzg();
        this.zzc.zzf(6);
        zzamfVar.zzm(this.zzc.zza, 0, this.zzc.zzh(8));
        this.zzc.zzd(0);
        if (this.zzd) {
            this.zzc.zzf(4);
            int iZzh = this.zzc.zzh(3);
            this.zzc.zzf(1);
            int iZzh2 = this.zzc.zzh(15);
            this.zzc.zzf(1);
            long jZzh = (((long) iZzh) << 30) | ((long) (iZzh2 << 15)) | ((long) this.zzc.zzh(15));
            this.zzc.zzf(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzf(4);
                int iZzh3 = this.zzc.zzh(3);
                this.zzc.zzf(1);
                int iZzh4 = this.zzc.zzh(15);
                this.zzc.zzf(1);
                int iZzh5 = this.zzc.zzh(15);
                this.zzc.zzf(1);
                this.zzb.zze(((long) (iZzh4 << 15)) | (((long) iZzh3) << 30) | ((long) iZzh5));
                this.zzf = true;
            }
            jZze = this.zzb.zze(jZzh);
        } else {
            jZze = 0;
        }
        this.zza.zzc(jZze, 4);
        this.zza.zzd(zzamfVar);
        this.zza.zze();
    }
}
