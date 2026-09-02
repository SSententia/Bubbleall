package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzags {
    private final zzain zza = new zzain();
    private final zzaip zzb = new zzaip();
    private final zzcy zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzagp zzh;
    private zzagp zzi;
    private zzagp zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzags(zzcy zzcyVar, Handler handler) {
        this.zzc = zzcyVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzaiq zzaiqVar, zzhf zzhfVar, boolean z) {
        int iZzi = zzaiqVar.zzi(zzhfVar.zza);
        return !zzaiqVar.zzf(zzaiqVar.zzh(iZzi, this.zza, false).zzc, this.zzb, 0L).zzh && zzaiqVar.zzu(iZzi, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzB(zzaiq zzaiqVar, Object obj, int i) {
        zzaiqVar.zzy(obj, this.zza);
        this.zza.zzb(i);
        this.zza.zzk(i);
        return 0L;
    }

    private static final boolean zzC(zzhf zzhfVar) {
        return !zzhfVar.zzb() && zzhfVar.zze == -1;
    }

    private final void zzs() {
        final zzfog zzfogVarZzu = zzfoj.zzu();
        for (zzagp zzagpVarZzo = this.zzh; zzagpVarZzo != null; zzagpVarZzo = zzagpVarZzo.zzo()) {
            zzfogVarZzu.zze(zzagpVarZzo.zzf.zza);
        }
        zzagp zzagpVar = this.zzi;
        final zzhf zzhfVar = zzagpVar == null ? null : zzagpVar.zzf.zza;
        this.zzd.post(new Runnable(this, zzfogVarZzu, zzhfVar) { // from class: com.google.android.gms.internal.ads.zzagr
            private final zzags zza;
            private final zzfog zzb;
            private final zzhf zzc;

            {
                this.zza = this;
                this.zzb = zzfogVarZzu;
                this.zzc = zzhfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(this.zzb, this.zzc);
            }
        });
    }

    private static zzhf zzt(zzaiq zzaiqVar, Object obj, long j, long j2, zzain zzainVar) {
        zzaiqVar.zzy(obj, zzainVar);
        int iZze = zzainVar.zze(j);
        return iZze == -1 ? new zzhf(obj, j2, zzainVar.zzf(j)) : new zzhf(obj, iZze, zzainVar.zzc(iZze), j2);
    }

    private final boolean zzu(zzaiq zzaiqVar) {
        zzagp zzagpVarZzo = this.zzh;
        if (zzagpVarZzo == null) {
            return true;
        }
        int iZzi = zzaiqVar.zzi(zzagpVarZzo.zzb);
        while (true) {
            iZzi = zzaiqVar.zzu(iZzi, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzagpVarZzo.zzo() != null && !zzagpVarZzo.zzf.zzg) {
                zzagpVarZzo = zzagpVarZzo.zzo();
            }
            zzagp zzagpVarZzo2 = zzagpVarZzo.zzo();
            if (iZzi == -1 || zzagpVarZzo2 == null || zzaiqVar.zzi(zzagpVarZzo2.zzb) != iZzi) {
                break;
            }
            zzagpVarZzo = zzagpVarZzo2;
        }
        boolean zZzl = zzl(zzagpVarZzo);
        zzagpVarZzo.zzf = zzo(zzaiqVar, zzagpVarZzo.zzf);
        return !zZzl;
    }

    private final zzagq zzv(zzaiq zzaiqVar, zzagp zzagpVar, long j) {
        long j2;
        zzagq zzagqVar = zzagpVar.zzf;
        long jZza = (zzagpVar.zza() + zzagqVar.zze) - j;
        if (zzagqVar.zzg) {
            long j3 = 0;
            int iZzu = zzaiqVar.zzu(zzaiqVar.zzi(zzagqVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzu == -1) {
                return null;
            }
            int i = zzaiqVar.zzh(iZzu, this.zza, true).zzc;
            Object obj = this.zza.zzb;
            long j4 = zzagqVar.zza.zzd;
            if (zzaiqVar.zzf(i, this.zzb, 0L).zzn == iZzu) {
                Pair<Object, Long> pairZzw = zzaiqVar.zzw(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, jZza));
                if (pairZzw == null) {
                    return null;
                }
                obj = pairZzw.first;
                long jLongValue = ((Long) pairZzw.second).longValue();
                zzagp zzagpVarZzo = zzagpVar.zzo();
                if (zzagpVarZzo == null || !zzagpVarZzo.zzb.equals(obj)) {
                    j4 = this.zze;
                    this.zze = 1 + j4;
                } else {
                    j4 = zzagpVarZzo.zzf.zza.zzd;
                }
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return zzw(zzaiqVar, zzt(zzaiqVar, obj, j2, j4, this.zza), j3, j2);
        }
        zzhf zzhfVar = zzagqVar.zza;
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        if (!zzhfVar.zzb()) {
            int iZzc = this.zza.zzc(zzhfVar.zze);
            if (iZzc != this.zza.zzg(zzhfVar.zze)) {
                return zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zze, iZzc, zzagqVar.zze, zzhfVar.zzd);
            }
            zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zze);
            return zzy(zzaiqVar, zzhfVar.zza, 0L, zzagqVar.zze, zzhfVar.zzd);
        }
        int i2 = zzhfVar.zzb;
        if (this.zza.zzg(i2) == -1) {
            return null;
        }
        int iZzd = this.zza.zzd(i2, zzhfVar.zzc);
        if (iZzd < 0) {
            return zzx(zzaiqVar, zzhfVar.zza, i2, iZzd, zzagqVar.zzc, zzhfVar.zzd);
        }
        long jLongValue2 = zzagqVar.zzc;
        if (jLongValue2 == -9223372036854775807L) {
            zzaip zzaipVar = this.zzb;
            zzain zzainVar = this.zza;
            Pair<Object, Long> pairZzw2 = zzaiqVar.zzw(zzaipVar, zzainVar, zzainVar.zzc, -9223372036854775807L, Math.max(0L, jZza));
            if (pairZzw2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairZzw2.second).longValue();
        }
        zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zzb);
        return zzy(zzaiqVar, zzhfVar.zza, Math.max(0L, jLongValue2), zzagqVar.zzc, zzhfVar.zzd);
    }

    private final zzagq zzw(zzaiq zzaiqVar, zzhf zzhfVar, long j, long j2) {
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        return zzhfVar.zzb() ? zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zzb, zzhfVar.zzc, j, zzhfVar.zzd) : zzy(zzaiqVar, zzhfVar.zza, j2, j, zzhfVar.zzd);
    }

    private final zzagq zzx(zzaiq zzaiqVar, Object obj, int i, int i2, long j, long j2) {
        zzhf zzhfVar = new zzhf(obj, i, i2, j2);
        long jZzh = zzaiqVar.zzy(zzhfVar.zza, this.zza).zzh(zzhfVar.zzb, zzhfVar.zzc);
        if (i2 == this.zza.zzc(i)) {
            this.zza.zzi();
        }
        this.zza.zzj(zzhfVar.zzb);
        return new zzagq(zzhfVar, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final zzagq zzy(zzaiq zzaiqVar, Object obj, long j, long j2, long j3) {
        long j4;
        long jMax = j;
        zzaiqVar.zzy(obj, this.zza);
        int iZzf = this.zza.zzf(jMax);
        zzhf zzhfVar = new zzhf(obj, j3, iZzf);
        boolean zZzC = zzC(zzhfVar);
        boolean zZzz = zzz(zzaiqVar, zzhfVar);
        boolean zZzA = zzA(zzaiqVar, zzhfVar, zZzC);
        if (iZzf != -1) {
            this.zza.zzj(iZzf);
        }
        if (iZzf != -1) {
            this.zza.zzb(iZzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = j4 != -9223372036854775807L ? j4 : this.zza.zzd;
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, (-1) + j5);
        }
        return new zzagq(zzhfVar, jMax, j2, j4, j5, false, zZzC, zZzz, zZzA);
    }

    private final boolean zzz(zzaiq zzaiqVar, zzhf zzhfVar) {
        if (zzC(zzhfVar)) {
            return zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzaiqVar.zzi(zzhfVar.zza);
        }
        return false;
    }

    public final boolean zza(zzaiq zzaiqVar, int i) {
        this.zzf = i;
        return zzu(zzaiqVar);
    }

    public final boolean zzb(zzaiq zzaiqVar, boolean z) {
        this.zzg = z;
        return zzu(zzaiqVar);
    }

    public final boolean zzc(zzhe zzheVar) {
        zzagp zzagpVar = this.zzj;
        return zzagpVar != null && zzagpVar.zza == zzheVar;
    }

    public final void zzd(long j) {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            zzagpVar.zzh(j);
        }
    }

    public final boolean zze() {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar == null) {
            return true;
        }
        if (zzagpVar.zzf.zzi || !zzagpVar.zzd() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final zzagq zzf(long j, zzahd zzahdVar) {
        zzagp zzagpVar = this.zzj;
        return zzagpVar == null ? zzw(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzs) : zzv(zzahdVar.zza, zzagpVar, j);
    }

    public final zzagp zzg() {
        return this.zzj;
    }

    public final zzagp zzh() {
        return this.zzh;
    }

    public final zzagp zzi() {
        return this.zzi;
    }

    public final zzagp zzj() {
        zzagp zzagpVar = this.zzi;
        boolean z = false;
        if (zzagpVar != null && zzagpVar.zzo() != null) {
            z = true;
        }
        zzakt.zzd(z);
        this.zzi = this.zzi.zzo();
        zzs();
        return this.zzi;
    }

    public final zzagp zzk() {
        zzagp zzagpVar = this.zzh;
        if (zzagpVar == null) {
            return null;
        }
        if (zzagpVar == this.zzi) {
            this.zzi = zzagpVar.zzo();
        }
        this.zzh.zzm();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzagp zzagpVar2 = this.zzh;
            this.zzl = zzagpVar2.zzb;
            this.zzm = zzagpVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzo();
        zzs();
        return this.zzh;
    }

    public final boolean zzl(zzagp zzagpVar) {
        boolean z = false;
        zzakt.zzd(zzagpVar != null);
        if (zzagpVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzagpVar;
        while (zzagpVar.zzo() != null) {
            zzagpVar = zzagpVar.zzo();
            if (zzagpVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzagpVar.zzm();
            this.zzk--;
        }
        this.zzj.zzn(null);
        zzs();
        return z;
    }

    public final void zzm() {
        if (this.zzk == 0) {
            return;
        }
        zzagp zzagpVarZzo = this.zzh;
        zzakt.zze(zzagpVarZzo);
        this.zzl = zzagpVarZzo.zzb;
        this.zzm = zzagpVarZzo.zzf.zza.zzd;
        while (zzagpVarZzo != null) {
            zzagpVarZzo.zzm();
            zzagpVarZzo = zzagpVarZzo.zzo();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzs();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    public final boolean zzn(zzaiq zzaiqVar, long j, long j2) {
        zzagq zzagqVarZzo;
        boolean z;
        zzagp zzagpVar = null;
        for (zzagp zzagpVarZzo = this.zzh; zzagpVarZzo != null; zzagpVarZzo = zzagpVarZzo.zzo()) {
            zzagq zzagqVar = zzagpVarZzo.zzf;
            if (zzagpVar == null) {
                zzagqVarZzo = zzo(zzaiqVar, zzagqVar);
            } else {
                zzagq zzagqVarZzv = zzv(zzaiqVar, zzagpVar, j);
                if (zzagqVarZzv == null) {
                    return !zzl(zzagpVar);
                }
                if (zzagqVar.zzb != zzagqVarZzv.zzb || !zzagqVar.zza.equals(zzagqVarZzv.zza)) {
                    return !zzl(zzagpVar);
                }
                zzagqVarZzo = zzagqVarZzv;
            }
            zzagpVarZzo.zzf = zzagqVarZzo.zzb(zzagqVar.zzc);
            long j3 = zzagqVar.zze;
            long j4 = zzagqVarZzo.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzagpVarZzo.zzr();
                long j5 = zzagqVarZzo.zze;
                long jZza = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzagpVarZzo.zza();
                if (zzagpVarZzo == this.zzi) {
                    boolean z2 = zzagpVarZzo.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= jZza) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return (zzl(zzagpVarZzo) || z) ? false : true;
            }
            zzagpVar = zzagpVarZzo;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    public final zzagq zzo(zzaiq zzaiqVar, zzagq zzagqVar) {
        long j;
        long jZzh;
        long j2;
        int i;
        int i2;
        zzhf zzhfVar = zzagqVar.zza;
        boolean zZzC = zzC(zzhfVar);
        boolean zZzz = zzz(zzaiqVar, zzhfVar);
        boolean zZzA = zzA(zzaiqVar, zzhfVar, zZzC);
        zzaiqVar.zzy(zzagqVar.zza.zza, this.zza);
        if (zzhfVar.zzb() || (i2 = zzhfVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzb(i2);
            j = 0;
        }
        if (!zzhfVar.zzb()) {
            if (j != -9223372036854775807L) {
                j2 = j;
            } else {
                jZzh = this.zza.zzd;
            }
            if (zzhfVar.zzb()) {
                this.zza.zzj(zzhfVar.zzb);
            } else {
                i = zzhfVar.zze;
                if (i != -1) {
                    this.zza.zzj(i);
                }
            }
            return new zzagq(zzhfVar, zzagqVar.zzb, zzagqVar.zzc, j, j2, false, zZzC, zZzz, zZzA);
        }
        jZzh = this.zza.zzh(zzhfVar.zzb, zzhfVar.zzc);
        j2 = jZzh;
        if (zzhfVar.zzb()) {
            this.zza.zzj(zzhfVar.zzb);
        } else {
            i = zzhfVar.zze;
            if (i != -1) {
                this.zza.zzj(i);
            }
        }
        return new zzagq(zzhfVar, zzagqVar.zzb, zzagqVar.zzc, j, j2, false, zZzC, zZzz, zZzA);
    }

    public final zzhf zzp(zzaiq zzaiqVar, Object obj, long j) {
        long j2;
        int iZzi;
        int i = zzaiqVar.zzy(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZzi = zzaiqVar.zzi(obj2)) == -1 || zzaiqVar.zzh(iZzi, this.zza, false).zzc != i) {
            for (zzagp zzagpVarZzo = this.zzh; zzagpVarZzo != null; zzagpVarZzo = zzagpVarZzo.zzo()) {
                if (zzagpVarZzo.zzb.equals(obj)) {
                    j2 = zzagpVarZzo.zzf.zza.zzd;
                }
            }
            for (zzagp zzagpVarZzo2 = this.zzh; zzagpVarZzo2 != null; zzagpVarZzo2 = zzagpVarZzo2.zzo()) {
                int iZzi2 = zzaiqVar.zzi(zzagpVarZzo2.zzb);
                if (iZzi2 != -1 && zzaiqVar.zzh(iZzi2, this.zza, false).zzc == i) {
                    j2 = zzagpVarZzo2.zzf.zza.zzd;
                }
            }
            j2 = this.zze;
            this.zze = 1 + j2;
            if (this.zzh == null) {
                this.zzl = obj;
                this.zzm = j2;
            }
        } else {
            j2 = this.zzm;
        }
        return zzt(zzaiqVar, obj, j, j2, this.zza);
    }

    final /* synthetic */ void zzq(zzfog zzfogVar, zzhf zzhfVar) {
        this.zzc.zze(zzfogVar.zzf(), zzhfVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final zzagp zzr(zzahw[] zzahwVarArr, zzjz zzjzVar, zzko zzkoVar, zzagz zzagzVar, zzagq zzagqVar, zzka zzkaVar) {
        long jZza;
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            jZza = (zzagpVar.zza() + this.zzj.zzf.zze) - zzagqVar.zzb;
        } else if (zzagqVar.zza.zzb()) {
            long j = zzagqVar.zzc;
            if (j != -9223372036854775807L) {
                jZza = j;
            } else {
                jZza = 0;
            }
        } else {
            jZza = 0;
        }
        zzagp zzagpVar2 = new zzagp(zzahwVarArr, jZza, zzjzVar, zzkoVar, zzagzVar, zzagqVar, zzkaVar, null);
        zzagp zzagpVar3 = this.zzj;
        if (zzagpVar3 != null) {
            zzagpVar3.zzn(zzagpVar2);
        } else {
            this.zzh = zzagpVar2;
            this.zzi = zzagpVar2;
        }
        this.zzl = null;
        this.zzj = zzagpVar2;
        this.zzk++;
        zzs();
        return zzagpVar2;
    }
}
