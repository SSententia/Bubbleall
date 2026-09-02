package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgl implements zziu {
    public final zziu zza;
    final /* synthetic */ zzgm zzb;
    private boolean zzc;

    public zzgl(zzgm zzgmVar, zziu zziuVar) {
        this.zzb = zzgmVar;
        this.zza = zziuVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzd(zzafw zzafwVar, zzaf zzafVar, int i) {
        if (this.zzb.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzafVar.zzf(4);
            return -4;
        }
        int iZzd = this.zza.zzd(zzafwVar, zzafVar, i);
        if (iZzd != -5) {
            zzgm zzgmVar = this.zzb;
            long j = zzgmVar.zzb;
            if (j == Long.MIN_VALUE || ((iZzd != -4 || zzafVar.zzd < j) && !(iZzd == -3 && zzgmVar.zzh() == Long.MIN_VALUE && !zzafVar.zzc))) {
                return iZzd;
            }
            zzafVar.zza();
            zzafVar.zzf(4);
            this.zzc = true;
            return -4;
        }
        zzafv zzafvVar = zzafwVar.zza;
        zzafvVar.getClass();
        int i2 = zzafvVar.zzB;
        if (i2 != 0) {
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzafvVar.zzC : 0;
            zzaft zzaftVarZza = zzafvVar.zza();
            zzaftVarZza.zzad(i2);
            zzaftVarZza.zzae(i3);
            zzafwVar.zza = zzaftVarZza.zzah();
        } else if (zzafvVar.zzC != 0) {
            i2 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            zzaft zzaftVarZza2 = zzafvVar.zza();
            zzaftVarZza2.zzad(i2);
            zzaftVarZza2.zzae(i3);
            zzafwVar.zza = zzaftVarZza2.zzah();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
