package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarf {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzarf(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        zzaup.zza(iArr.length == length);
        int length2 = jArr.length;
        zzaup.zza(length2 == length);
        zzaup.zza(iArr2.length == length);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j) {
        for (int iZzh = zzave.zzh(this.zze, j, true, false); iZzh >= 0; iZzh--) {
            if ((this.zzf[iZzh] & 1) != 0) {
                return iZzh;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int iZzi = zzave.zzi(this.zze, j, true, false); iZzi < this.zze.length; iZzi++) {
            if ((this.zzf[iZzi] & 1) != 0) {
                return iZzi;
            }
        }
        return -1;
    }
}
