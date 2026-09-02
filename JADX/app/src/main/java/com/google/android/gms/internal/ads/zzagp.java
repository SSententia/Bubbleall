package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagp {
    public final zzhe zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzagq zzf;
    public boolean zzg;
    private final zzahw[] zzi;
    private final zzjz zzj;
    private final zzagz zzk;
    private zzagp zzl;
    private zzka zzn;
    private long zzo;
    private zzs zzm = zzs.zza;
    public final zziu[] zzc = new zziu[2];
    private final boolean[] zzh = new boolean[2];

    public zzagp(zzahw[] zzahwVarArr, long j, zzjz zzjzVar, zzko zzkoVar, zzagz zzagzVar, zzagq zzagqVar, zzka zzkaVar, byte[] bArr) {
        this.zzi = zzahwVarArr;
        this.zzo = j;
        this.zzj = zzjzVar;
        this.zzk = zzagzVar;
        this.zzb = zzagqVar.zza.zza;
        this.zzf = zzagqVar;
        this.zzn = zzkaVar;
        zzhf zzhfVar = zzagqVar.zza;
        long j2 = zzagqVar.zzb;
        long j3 = zzagqVar.zzd;
        zzhe zzheVarZzo = zzagzVar.zzo(zzhfVar, zzkoVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzgm(zzheVarZzo, true, 0L, j3) : zzheVarZzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzka zzkaVar = this.zzn;
            if (i >= zzkaVar.zza) {
                return;
            }
            zzkaVar.zza(i);
            zzjg zzjgVar = this.zzn.zzd[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzka zzkaVar = this.zzn;
            if (i >= zzkaVar.zza) {
                return;
            }
            zzkaVar.zza(i);
            zzjg zzjgVar = this.zzn.zzd[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza() {
        return this.zzo;
    }

    public final void zzb(long j) {
        this.zzo = 0L;
    }

    public final long zzc() {
        return this.zzf.zzb + this.zzo;
    }

    public final boolean zzd() {
        if (this.zzd) {
            return !this.zze || this.zza.zzh() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long zze() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzh = this.zze ? this.zza.zzh() : Long.MIN_VALUE;
        return jZzh == Long.MIN_VALUE ? this.zzf.zze : jZzh;
    }

    public final long zzf() {
        if (this.zzd) {
            return this.zza.zzk();
        }
        return 0L;
    }

    public final void zzg(float f, zzaiq zzaiqVar) throws zzaeg {
        this.zzd = true;
        this.zzm = this.zza.zzd();
        zzka zzkaVarZzj = zzj(f, zzaiqVar);
        zzagq zzagqVar = this.zzf;
        long jMax = zzagqVar.zzb;
        long j = zzagqVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZzk = zzk(zzkaVarZzj, jMax, false);
        long j2 = this.zzo;
        zzagq zzagqVar2 = this.zzf;
        this.zzo = j2 + (zzagqVar2.zzb - jZzk);
        this.zzf = zzagqVar2.zza(jZzk);
    }

    public final void zzh(long j) {
        zzakt.zzd(zzu());
        if (this.zzd) {
            this.zza.zzf(j - this.zzo);
        }
    }

    public final void zzi(long j) {
        zzakt.zzd(zzu());
        this.zza.zzl(j - this.zzo);
    }

    public final zzka zzj(float f, zzaiq zzaiqVar) throws zzaeg {
        zzka zzkaVarZzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzaiqVar);
        for (zzjg zzjgVar : zzkaVarZzj.zzd) {
        }
        return zzkaVarZzj;
    }

    public final long zzk(zzka zzkaVar, long j, boolean z) {
        return zzl(zzkaVar, j, false, new boolean[2]);
    }

    public final long zzl(zzka zzkaVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzkaVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzkaVar.zzb(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzahw[] zzahwVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzahwVarArr[i2].zzac();
            i2++;
        }
        zzt();
        this.zzn = zzkaVar;
        zzs();
        long jZzq = this.zza.zzq(zzkaVar.zzd, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzahw[] zzahwVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzahwVarArr2[i3].zzac();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zziu[] zziuVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzq;
            }
            if (zziuVarArr[i4] != null) {
                zzakt.zzd(zzkaVar.zza(i4));
                this.zzi[i4].zzac();
                this.zze = true;
            } else {
                zzakt.zzd(zzkaVar.zzd[i4] == null);
            }
            i4++;
        }
    }

    public final void zzm() {
        zzt();
        zzagz zzagzVar = this.zzk;
        zzhe zzheVar = this.zza;
        try {
            if (zzheVar instanceof zzgm) {
                zzagzVar.zzf(((zzgm) zzheVar).zza);
            } else {
                zzagzVar.zzf(zzheVar);
            }
        } catch (RuntimeException e) {
            zzaln.zzb("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzn(zzagp zzagpVar) {
        if (zzagpVar == this.zzl) {
            return;
        }
        zzt();
        this.zzl = zzagpVar;
        zzs();
    }

    public final zzagp zzo() {
        return this.zzl;
    }

    public final zzs zzp() {
        return this.zzm;
    }

    public final zzka zzq() {
        return this.zzn;
    }

    public final void zzr() {
        zzhe zzheVar = this.zza;
        if (zzheVar instanceof zzgm) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzgm) zzheVar).zza(0L, j);
        }
    }
}
