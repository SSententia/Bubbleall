package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasd implements zzatd {
    private final zzatd[] zza;

    public zzasd(zzatd[] zzatdVarArr) {
        this.zza = zzatdVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        long jMin = Long.MAX_VALUE;
        for (zzatd zzatdVar : this.zza) {
            long jZza = zzatdVar.zza();
            if (jZza != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZza);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j) {
        boolean zZzb;
        boolean z = false;
        do {
            long jZza = zza();
            if (jZza == Long.MIN_VALUE) {
                break;
            }
            zZzb = false;
            for (zzatd zzatdVar : this.zza) {
                if (zzatdVar.zza() == jZza) {
                    zZzb |= zzatdVar.zzb(j);
                }
            }
            z |= zZzb;
        } while (zZzb);
        return z;
    }
}
