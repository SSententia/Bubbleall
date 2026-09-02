package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgr implements zziw {
    protected final zziw[] zza;

    public zzgr(zziw[] zziwVarArr) {
        this.zza = zziwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        for (zziw zziwVar : this.zza) {
            zziwVar.zzf(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long jMin = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long jZzh = zziwVar.zzh();
            if (jZzh != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzh);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long jMin = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long jZzk = zziwVar.zzk();
            if (jZzk != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzk);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        boolean zZzl;
        boolean z = false;
        do {
            long jZzk = zzk();
            if (jZzk == Long.MIN_VALUE) {
                break;
            }
            zZzl = false;
            for (zziw zziwVar : this.zza) {
                long jZzk2 = zziwVar.zzk();
                boolean z2 = jZzk2 != Long.MIN_VALUE && jZzk2 <= j;
                if (jZzk2 == jZzk || z2) {
                    zZzl |= zziwVar.zzl(j);
                }
            }
            z |= zZzl;
        } while (zZzl);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        for (zziw zziwVar : this.zza) {
            if (zziwVar.zzm()) {
                return true;
            }
        }
        return false;
    }
}
