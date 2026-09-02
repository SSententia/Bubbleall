package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpg implements zznk {
    private final zzoh zza;
    private final int zzb;
    private final zzob zzc = new zzob();

    /* synthetic */ zzpg(zzoh zzohVar, int i, zzph zzphVar) {
        this.zza = zzohVar;
        this.zzb = i;
    }

    private final long zzc(zznv zznvVar) throws IOException {
        while (zznvVar.zzm() < zznvVar.zzo() - 6) {
            zzoh zzohVar = this.zza;
            int i = this.zzb;
            zzob zzobVar = this.zzc;
            long jZzm = zznvVar.zzm();
            byte[] bArr = new byte[2];
            zznp zznpVar = (zznp) zznvVar;
            zznpVar.zzh(bArr, 0, 2, false);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
                zznvVar.zzl();
                zznpVar.zzj((int) (jZzm - zznvVar.zzn()), false);
            } else {
                zzamf zzamfVar = new zzamf(16);
                System.arraycopy(bArr, 0, zzamfVar.zzi(), 0, 2);
                zzamfVar.zzf(zzny.zzb(zznvVar, zzamfVar.zzi(), 2, 14));
                zznvVar.zzl();
                zznpVar.zzj((int) (jZzm - zznvVar.zzn()), false);
                if (zzoc.zza(zzamfVar, zzohVar, i, zzobVar)) {
                    break;
                }
            }
            zznpVar.zzj(1, false);
        }
        if (zznvVar.zzm() < zznvVar.zzo() - 6) {
            return this.zzc.zza;
        }
        ((zznp) zznvVar).zzj((int) (zznvVar.zzo() - zznvVar.zzm()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final zznj zza(zznv zznvVar, long j) throws IOException {
        long jZzn = zznvVar.zzn();
        long jZzc = zzc(zznvVar);
        long jZzm = zznvVar.zzm();
        ((zznp) zznvVar).zzj(Math.max(6, this.zza.zzc), false);
        long jZzc2 = zzc(zznvVar);
        long jZzm2 = zznvVar.zzm();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zznj.zze(jZzc2, jZzm2) : zznj.zzd(jZzc, jZzn);
        }
        return zznj.zzf(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzb() {
    }
}
