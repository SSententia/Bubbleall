package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzol {
    private final zzamf zza = new zzamf(10);

    public final zzaiv zza(zznv zznvVar, zzaju zzajuVar) throws Throwable {
        zzaiv zzaivVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zznp) zznvVar).zzh(this.zza.zzi(), 0, 10, false);
                this.zza.zzh(0);
                if (this.zza.zzr() != 4801587) {
                    break;
                }
                this.zza.zzk(3);
                int iZzA = this.zza.zzA();
                int i2 = iZzA + 10;
                if (zzaivVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzi(), 0, bArr, 0, 10);
                    ((zznp) zznvVar).zzh(bArr, 10, iZzA, false);
                    zzaivVarZza = zzajw.zza(bArr, i2, zzajuVar, new zzaix());
                } else {
                    ((zznp) zznvVar).zzj(iZzA, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zznvVar.zzl();
        ((zznp) zznvVar).zzj(i, false);
        return zzaivVarZza;
    }
}
