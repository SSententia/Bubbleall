package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrb implements zzqz {
    private final int zza;
    private final int zzb;
    private final zzamf zzc;

    public zzrb(zzqw zzqwVar, zzafv zzafvVar) {
        zzamf zzamfVar = zzqwVar.zza;
        this.zzc = zzamfVar;
        zzamfVar.zzh(12);
        int iZzB = zzamfVar.zzB();
        if ("audio/raw".equals(zzafvVar.zzl)) {
            int iZzS = zzamq.zzS(zzafvVar.zzA, zzafvVar.zzy);
            if (iZzB == 0 || iZzB % iZzS != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iZzS);
                sb.append(", stsz sample size: ");
                sb.append(iZzB);
                Log.w("AtomParsers", sb.toString());
                iZzB = iZzS;
            }
        }
        this.zza = iZzB == 0 ? -1 : iZzB;
        this.zzb = zzamfVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzB() : i;
    }
}
