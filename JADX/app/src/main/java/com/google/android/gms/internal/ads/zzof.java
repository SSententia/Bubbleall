package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzof implements zzot {
    private final zzoh zza;
    private final long zzb;

    public zzof(zzoh zzohVar, long j) {
        this.zza = zzohVar;
        this.zzb = j;
    }

    private final zzou zza(long j, long j2) {
        return new zzou((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        zzakt.zze(this.zza.zzk);
        zzoh zzohVar = this.zza;
        zzog zzogVar = zzohVar.zzk;
        long[] jArr = zzogVar.zza;
        long[] jArr2 = zzogVar.zzb;
        int iZzD = zzamq.zzD(jArr, zzohVar.zzb(j), true, false);
        zzou zzouVarZza = zza(iZzD == -1 ? 0L : jArr[iZzD], iZzD != -1 ? jArr2[iZzD] : 0L);
        if (zzouVarZza.zzb == j || iZzD == jArr.length - 1) {
            return new zzor(zzouVarZza, zzouVarZza);
        }
        int i = iZzD + 1;
        return new zzor(zzouVarZza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zza();
    }
}
