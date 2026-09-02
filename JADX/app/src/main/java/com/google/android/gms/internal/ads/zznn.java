package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznn implements zzot {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zznn(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        int i = this.zza;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(this.zzc);
        String string3 = Arrays.toString(this.zze);
        String string4 = Arrays.toString(this.zzd);
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        int iZzD = zzamq.zzD(this.zze, j, true, true);
        zzou zzouVar = new zzou(this.zze[iZzD], this.zzc[iZzD]);
        if (zzouVar.zzb >= j || iZzD == this.zza - 1) {
            return new zzor(zzouVar, zzouVar);
        }
        int i = iZzD + 1;
        return new zzor(zzouVar, new zzou(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzf;
    }
}
