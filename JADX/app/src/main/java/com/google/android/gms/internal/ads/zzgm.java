package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgm implements zzhe, zzhd {
    public final zzhe zza;
    long zzb;
    private zzhd zzc;
    private zzgl[] zzd = new zzgl[0];
    private long zze = 0;

    public zzgm(zzhe zzheVar, boolean z, long j, long j2) {
        this.zza = zzheVar;
        this.zzb = j2;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zzc = zzhdVar;
        this.zza.zzb(this, j);
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
        this.zza.zze(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        this.zza.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzg = zzg();
            return jZzg != -9223372036854775807L ? jZzg : j;
        }
        long jZzg2 = this.zza.zzg();
        if (jZzg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzakt.zzd(jZzg2 >= 0);
        long j2 = this.zzb;
        zzakt.zzd(j2 == Long.MIN_VALUE || jZzg2 <= j2);
        return jZzg2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzh < j) {
                return jZzh;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzgl zzglVar : this.zzd) {
            if (zzglVar != null) {
                zzglVar.zza();
            }
        }
        long jZzi = this.zza.zzi(j);
        if (jZzi == j) {
            z = true;
        } else if (jZzi >= 0) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZzi <= j2) {
                z = true;
            }
        }
        zzakt.zzd(z);
        return jZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        if (j == 0) {
            return 0L;
        }
        long jZzy = zzamq.zzy(zzahzVar.zzf, 0L, j);
        long j2 = zzahzVar.zzg;
        long j3 = this.zzb;
        long jZzy2 = zzamq.zzy(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jZzy != zzahzVar.zzf || jZzy2 != zzahzVar.zzg) {
            zzahzVar = new zzahz(jZzy, jZzy2);
        }
        return this.zza.zzj(j, zzahzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long jZzk = this.zza.zzk();
        if (jZzk != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzk < j) {
                return jZzk;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        return this.zza.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zza.zzm();
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zziw zziwVar) {
        zzhd zzhdVar = this.zzc;
        zzhdVar.getClass();
        zzhdVar.zzp(this);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        int length = zziuVarArr.length;
        this.zzd = new zzgl[length];
        zziu[] zziuVarArr2 = new zziu[length];
        int i = 0;
        while (true) {
            zziu zziuVar = null;
            if (i >= zziuVarArr.length) {
                break;
            }
            zzgl[] zzglVarArr = this.zzd;
            zzgl zzglVar = (zzgl) zziuVarArr[i];
            zzglVarArr[i] = zzglVar;
            if (zzglVar != null) {
                zziuVar = zzglVar.zza;
            }
            zziuVarArr2[i] = zziuVar;
            i++;
        }
        long jZzq = this.zza.zzq(zzjgVarArr, zArr, zziuVarArr2, zArr2, j);
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (jZzq != j) {
            if (jZzq >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE && jZzq > j2) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        zzakt.zzd(z);
        for (int i2 = 0; i2 < zziuVarArr.length; i2++) {
            zziu zziuVar2 = zziuVarArr2[i2];
            if (zziuVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzgl[] zzglVarArr2 = this.zzd;
                zzgl zzglVar2 = zzglVarArr2[i2];
                if (zzglVar2 == null || zzglVar2.zza != zziuVar2) {
                    zzglVarArr2[i2] = new zzgl(this, zziuVar2);
                }
            }
            zziuVarArr[i2] = this.zzd[i2];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        zzhdVar.getClass();
        zzhdVar.zzn(this);
    }
}
