package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagv implements zzhp, zzfb {
    final /* synthetic */ zzagz zza;
    private final zzagx zzb;
    private zzho zzc;
    private zzfa zzd;

    public zzagv(zzagz zzagzVar, zzagx zzagxVar) {
        this.zza = zzagzVar;
        this.zzc = zzagzVar.zze;
        this.zzd = zzagzVar.zzf;
        this.zzb = zzagxVar;
    }

    private final boolean zza(int i, zzhf zzhfVar) {
        zzhf zzhfVarZzc = null;
        if (zzhfVar != null) {
            zzagx zzagxVar = this.zzb;
            for (int i2 = 0; i2 < zzagxVar.zzc.size(); i2++) {
                if (zzagxVar.zzc.get(i2).zzd == zzhfVar.zzd) {
                    zzhfVarZzc = zzhfVar.zzc(Pair.create(zzagxVar.zzb, zzhfVar.zza));
                    break;
                }
            }
            if (zzhfVarZzc == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzho zzhoVar = this.zzc;
        if (zzhoVar.zza != i3 || !zzamq.zzc(zzhoVar.zzb, zzhfVarZzc)) {
            this.zzc = this.zza.zze.zza(i3, zzhfVarZzc, 0L);
        }
        zzfa zzfaVar = this.zzd;
        if (zzfaVar.zza == i3 && zzamq.zzc(zzfaVar.zzb, zzhfVarZzc)) {
            return true;
        }
        this.zzd = this.zza.zzf.zza(i3, zzhfVarZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzC(int i, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i, zzhfVar)) {
            this.zzc.zze(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD(int i, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i, zzhfVar)) {
            this.zzc.zzg(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE(int i, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar) {
        if (zza(i, zzhfVar)) {
            this.zzc.zzi(zzgxVar, zzhcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzF(int i, zzhf zzhfVar, zzgx zzgxVar, zzhc zzhcVar, IOException iOException, boolean z) {
        if (zza(i, zzhfVar)) {
            this.zzc.zzk(zzgxVar, zzhcVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzG(int i, zzhf zzhfVar, zzhc zzhcVar) {
        if (zza(i, zzhfVar)) {
            this.zzc.zzm(zzhcVar);
        }
    }
}
