package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhb extends zzgq<Void> {
    private final zzhh zza;
    private final boolean zzb;
    private final zzaip zzc;
    private final zzain zzd;
    private zzgz zze;
    private zzgy zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzhb(zzhh zzhhVar, boolean z) {
        boolean z2;
        this.zza = zzhhVar;
        if (z) {
            zzhhVar.zzt();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzaip();
        this.zzd = new zzain();
        zzhhVar.zzs();
        this.zze = zzgz.zzl(zzhhVar.zzz());
    }

    private final Object zzD(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzgz.zzb)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzE(long j) {
        zzgy zzgyVar = this.zzf;
        int iZzi = this.zze.zzi(zzgyVar.zza.zza);
        if (iZzi == -1) {
            return;
        }
        zzgz zzgzVar = this.zze;
        zzain zzainVar = this.zzd;
        zzgzVar.zzh(iZzi, zzainVar, false);
        long j2 = zzainVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzgyVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzA(zzhe zzheVar) {
        ((zzgy) zzheVar).zzu();
        if (zzheVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final zzgy zzC(zzhf zzhfVar, zzko zzkoVar, long j) {
        zzgy zzgyVar = new zzgy(zzhfVar, zzkoVar, j, null);
        zzgyVar.zzs(this.zza);
        if (this.zzh) {
            zzgyVar.zzt(zzhfVar.zzc(zzD(zzhfVar.zza)));
        } else {
            this.zzf = zzgyVar;
            if (!this.zzg) {
                this.zzg = true;
                zzw(null, this.zza);
            }
        }
        return zzgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zza(zzay zzayVar) {
        super.zza(zzayVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzw(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzhh
    public final void zzu() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    @Override // com.google.android.gms.internal.ads.zzgq
    protected final /* bridge */ /* synthetic */ void zzv(Void r12, zzhh zzhhVar, zzaiq zzaiqVar) {
        long j;
        zzhf zzhfVarZzc = null;
        if (this.zzh) {
            this.zze = this.zze.zzn(zzaiqVar);
            zzgy zzgyVar = this.zzf;
            if (zzgyVar != null) {
                zzE(zzgyVar.zzr());
            }
        } else if (zzaiqVar.zzt()) {
            this.zze = this.zzi ? this.zze.zzn(zzaiqVar) : zzgz.zzm(zzaiqVar, zzaip.zza, zzgz.zzb);
        } else {
            zzaiqVar.zzf(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzgy zzgyVar2 = this.zzf;
            if (zzgyVar2 != null) {
                long jZza = zzgyVar2.zza();
                this.zze.zzy(this.zzf.zza.zza, this.zzd);
                this.zze.zzf(0, this.zzc, 0L);
                if (jZza != 0) {
                    j = jZza;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair<Object, Long> pairZzv = zzaiqVar.zzv(this.zzc, this.zzd, 0, j);
            Object obj2 = pairZzv.first;
            long jLongValue = ((Long) pairZzv.second).longValue();
            this.zze = this.zzi ? this.zze.zzn(zzaiqVar) : zzgz.zzm(zzaiqVar, obj, obj2);
            zzgy zzgyVar3 = this.zzf;
            if (zzgyVar3 != null) {
                zzE(jLongValue);
                zzhf zzhfVar = zzgyVar3.zza;
                zzhfVarZzc = zzhfVar.zzc(zzD(zzhfVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzhfVarZzc != null) {
            zzgy zzgyVar4 = this.zzf;
            zzgyVar4.getClass();
            zzgyVar4.zzt(zzhfVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    protected final /* bridge */ /* synthetic */ zzhf zzx(Void r2, zzhf zzhfVar) {
        Object obj = zzhfVar.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zzgz.zzb;
        }
        return zzhfVar.zzc(obj);
    }

    public final zzaiq zzy() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzagk zzz() {
        return this.zza.zzz();
    }
}
