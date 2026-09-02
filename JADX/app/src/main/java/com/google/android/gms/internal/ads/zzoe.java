package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoe {
    public static zzog zzb(zzamf zzamfVar) {
        zzamfVar.zzk(1);
        int iZzr = zzamfVar.zzr();
        long jZzg = ((long) zzamfVar.zzg()) + ((long) iZzr);
        int i = iZzr / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzx = zzamfVar.zzx();
            if (jZzx == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzx;
            jArrCopyOf2[i2] = zzamfVar.zzx();
            zzamfVar.zzk(2);
        }
        zzamfVar.zzk((int) (jZzg - ((long) zzamfVar.zzg())));
        return new zzog(jArrCopyOf, jArrCopyOf2);
    }

    public static zzaiv zza(zznv zznvVar, boolean z) throws Throwable {
        zzaiv zzaivVarZza = new zzol().zza(zznvVar, z ? null : zzajw.zza);
        if (zzaivVarZza == null || zzaivVarZza.zza() == 0) {
            return null;
        }
        return zzaivVarZza;
    }
}
