package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhr implements zzhe, zzhd {
    private final zzhe zza;
    private final long zzb;
    private zzhd zzc;

    public zzhr(zzhe zzheVar, long j) {
        this.zza = zzheVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zzc = zzhdVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j, boolean z) {
        this.zza.zze(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        this.zza.zzf(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        long jZzg = this.zza.zzg();
        if (jZzg == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        return this.zza.zzi(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        return this.zza.zzj(j - this.zzb, zzahzVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long jZzk = this.zza.zzk();
        if (jZzk == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzk + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        return this.zza.zzl(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zziw zziwVar) {
        zzhd zzhdVar = this.zzc;
        zzhdVar.getClass();
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        zziu[] zziuVarArr2 = new zziu[zziuVarArr.length];
        int i = 0;
        while (true) {
            zziu zziuVarZza = null;
            if (i >= zziuVarArr.length) {
                break;
            }
            zzhs zzhsVar = (zzhs) zziuVarArr[i];
            if (zzhsVar != null) {
                zziuVarZza = zzhsVar.zza();
            }
            zziuVarArr2[i] = zziuVarZza;
            i++;
        }
        long jZzq = this.zza.zzq(zzjgVarArr, zArr, zziuVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zziuVarArr.length; i2++) {
            zziu zziuVar = zziuVarArr2[i2];
            if (zziuVar == null) {
                zziuVarArr[i2] = null;
            } else {
                zziu zziuVar2 = zziuVarArr[i2];
                if (zziuVar2 == null || ((zzhs) zziuVar2).zza() != zziuVar) {
                    zziuVarArr[i2] = new zzhs(zziuVar, this.zzb);
                }
            }
        }
        return jZzq + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        zzhdVar.getClass();
        zzhdVar.zzn(this);
    }
}
