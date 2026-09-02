package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqt implements zzqs {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzqt(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzqt zza(long j, long j2, zzon zzonVar, zzamf zzamfVar) {
        int iZzn;
        zzamfVar.zzk(10);
        int iZzv = zzamfVar.zzv();
        if (iZzv <= 0) {
            return null;
        }
        int i = zzonVar.zzd;
        long jZzH = zzamq.zzH(iZzv, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iZzo = zzamfVar.zzo();
        int iZzo2 = zzamfVar.zzo();
        int iZzo3 = zzamfVar.zzo();
        zzamfVar.zzk(2);
        long j3 = j2 + ((long) zzonVar.zzc);
        long[] jArr = new long[iZzo];
        long[] jArr2 = new long[iZzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzo) {
            int i3 = iZzo2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jZzH) / ((long) iZzo);
            jArr2[i2] = Math.max(j4, j5);
            if (iZzo3 == 1) {
                iZzn = zzamfVar.zzn();
            } else if (iZzo3 == 2) {
                iZzn = zzamfVar.zzo();
            } else if (iZzo3 == 3) {
                iZzn = zzamfVar.zzr();
            } else {
                if (iZzo3 != 4) {
                    return null;
                }
                iZzn = zzamfVar.zzB();
            }
            j4 += (long) (iZzn * i3);
            i2++;
            j3 = j5;
            iZzo2 = i3;
        }
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
            Log.w("VbriSeeker", sb.toString());
        }
        return new zzqt(jArr, jArr2, jZzH, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j) {
        return this.zza[zzamq.zzD(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        int iZzD = zzamq.zzD(this.zza, j, true, true);
        zzou zzouVar = new zzou(this.zza[iZzD], this.zzb[iZzD]);
        if (zzouVar.zzb < j) {
            long[] jArr = this.zza;
            if (iZzD != jArr.length - 1) {
                int i = iZzD + 1;
                return new zzor(zzouVar, new zzou(jArr[i], this.zzb[i]));
            }
        }
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
