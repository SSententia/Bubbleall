package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzno implements zzot {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzno(long j, long j2, int i, int i2, boolean z) {
        long jZzb;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            jZzb = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            jZzb = zzb(j, j2, i);
        }
        this.zzf = jZzb;
    }

    private static long zzb(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public final long zza(long j) {
        return zzb(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzou zzouVar = new zzou(0L, this.zzb);
            return new zzor(zzouVar, zzouVar);
        }
        int i = this.zze;
        long j3 = this.zzc;
        long jMin = (((((long) i) * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j3);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZza = zza(jMax);
        zzou zzouVar2 = new zzou(jZza, jMax);
        if (this.zzd != -1 && jZza < j) {
            long j4 = jMax + ((long) this.zzc);
            if (j4 < this.zza) {
                return new zzor(zzouVar2, new zzou(zza(j4), j4));
            }
        }
        return new zzor(zzouVar2, zzouVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzf;
    }
}
