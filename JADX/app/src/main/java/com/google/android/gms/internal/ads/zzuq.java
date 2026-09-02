package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuq {
    private final List<zzafv> zza;
    private final zzox[] zzb;

    public zzuq(List<zzafv> list) {
        this.zza = list;
        this.zzb = new zzox[list.size()];
    }

    public final void zza(zznx zznxVar, zzun zzunVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzunVar.zza();
            zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 3);
            zzafv zzafvVar = this.zza.get(i);
            String str = zzafvVar.zzl;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String strValueOf = String.valueOf(str);
            zzakt.zzb(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzD(zzunVar.zzc());
            zzaftVar.zzN(str);
            zzaftVar.zzH(zzafvVar.zzd);
            zzaftVar.zzG(zzafvVar.zzc);
            zzaftVar.zzaf(zzafvVar.zzD);
            zzaftVar.zzP(zzafvVar.zzn);
            zzoxVarZzB.zzs(zzaftVar.zzah());
            this.zzb[i] = zzoxVarZzB;
        }
    }

    public final void zzb(long j, zzamf zzamfVar) {
        if (zzamfVar.zzd() < 9) {
            return;
        }
        int iZzv = zzamfVar.zzv();
        int iZzv2 = zzamfVar.zzv();
        int iZzn = zzamfVar.zzn();
        if (iZzv == 434 && iZzv2 == 1195456820 && iZzn == 3) {
            zznm.zzb(j, zzamfVar, this.zzb);
        }
    }
}
