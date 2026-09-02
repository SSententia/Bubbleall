package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzud implements zznk {
    private final zzamn zza;
    private final zzamf zzb = new zzamf();
    private final int zzc;

    public zzud(int i, zzamn zzamnVar, int i2) {
        this.zzc = i;
        this.zza = zzamnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final zznj zza(zznv zznvVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long j2;
        long jZzn = zznvVar.zzn();
        int iMin = (int) Math.min(112800L, zznvVar.zzo() - jZzn);
        this.zzb.zza(iMin);
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, iMin, false);
        zzamf zzamfVar = this.zzb;
        int iZze = zzamfVar.zze();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzamfVar.zzd() >= 188 && (iZza2 = (iZza = zzup.zza(zzamfVar.zzi(), zzamfVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzup.zzb(zzamfVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    if (j5 == -9223372036854775807L) {
                        return zznj.zzd(jZze, jZzn);
                    }
                    j2 = jZzn + j4;
                } else if (100000 + jZze > j) {
                    j2 = jZzn + ((long) iZza);
                } else {
                    j4 = iZza;
                    j5 = jZze;
                }
                return zznj.zzf(j2);
            }
            zzamfVar.zzh(iZza2);
            j3 = iZza2;
        }
        return j5 != -9223372036854775807L ? zznj.zze(j5, jZzn + j3) : zznj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzb() {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
    }
}
