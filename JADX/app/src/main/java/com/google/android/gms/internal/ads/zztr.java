package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztr implements zzua {
    private zzafv zza;
    private zzamn zzb;
    private zzox zzc;

    public zztr(String str) {
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN(str);
        this.zza = zzaftVar.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
        this.zzb = zzamnVar;
        zzunVar.zza();
        zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 5);
        this.zzc = zzoxVarZzB;
        zzoxVarZzB.zzs(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void zzb(zzamf zzamfVar) {
        zzakt.zze(this.zzb);
        int i = zzamq.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzafv zzafvVar = this.zza;
        if (jZzc != zzafvVar.zzp) {
            zzaft zzaftVarZza = zzafvVar.zza();
            zzaftVarZza.zzR(jZzc);
            zzafv zzafvVarZzah = zzaftVarZza.zzah();
            this.zza = zzafvVarZzah;
            this.zzc.zzs(zzafvVarZzah);
        }
        int iZzd = zzamfVar.zzd();
        zzov.zzb(this.zzc, zzamfVar, iZzd);
        this.zzc.zzv(jZzb, 1, iZzd, 0, null);
    }
}
