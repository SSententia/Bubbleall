package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgo implements zzhp, zzfb {
    final /* synthetic */ zzgq zza;
    private final Object zzb;
    private zzho zzc;
    private zzfa zzd;

    public zzgo(zzgq zzgqVar, Object obj) {
        this.zza = zzgqVar;
        this.zzc = zzgqVar.zzf(null);
        this.zzd = zzgqVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zza(int i, zzhf zzhfVar) {
        zzhf zzhfVarZzx;
        if (zzhfVar != null) {
            zzhfVarZzx = this.zza.zzx(this.zzb, zzhfVar);
            if (zzhfVarZzx == null) {
                return false;
            }
        } else {
            zzhfVarZzx = null;
        }
        zzho zzhoVar = this.zzc;
        if (zzhoVar.zza != i || !zzamq.zzc(zzhoVar.zzb, zzhfVarZzx)) {
            this.zzc = this.zza.zzg(i, zzhfVarZzx, 0L);
        }
        zzfa zzfaVar = this.zzd;
        if (zzfaVar.zza == i && zzamq.zzc(zzfaVar.zzb, zzhfVarZzx)) {
            return true;
        }
        this.zzd = this.zza.zzi(i, zzhfVarZzx);
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
