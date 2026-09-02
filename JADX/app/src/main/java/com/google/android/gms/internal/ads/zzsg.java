package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsg {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzamf zzg = new zzamf(255);

    zzsg() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zznv zznvVar, long j) throws IOException {
        zzakt.zza(zznvVar.zzn() == zznvVar.zzm());
        this.zzg.zza(4);
        while (true) {
            if ((j != -1 && zznvVar.zzn() + 4 >= j) || !zzny.zze(zznvVar, this.zzg.zzi(), 0, 4, true)) {
                break;
            }
            this.zzg.zzh(0);
            if (this.zzg.zzt() == 1332176723) {
                zznvVar.zzl();
                return true;
            }
            ((zznp) zznvVar).zzd(1, false);
        }
        do {
            if (j != -1 && zznvVar.zzn() >= j) {
                break;
            }
        } while (zznvVar.zzc(1) != -1);
        return false;
    }

    public final boolean zzc(zznv zznvVar, boolean z) throws IOException {
        zza();
        this.zzg.zza(27);
        if (zzny.zze(zznvVar, this.zzg.zzi(), 0, 27, z) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzn() != 0) {
                if (z) {
                    return false;
                }
                throw zzaha.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzn();
            this.zzb = this.zzg.zzy();
            this.zzg.zzu();
            this.zzg.zzu();
            this.zzg.zzu();
            int iZzn = this.zzg.zzn();
            this.zzc = iZzn;
            this.zzd = iZzn + 27;
            this.zzg.zza(iZzn);
            if (zzny.zze(zznvVar, this.zzg.zzi(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzn();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }
}
