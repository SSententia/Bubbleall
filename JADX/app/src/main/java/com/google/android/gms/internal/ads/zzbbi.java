package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbi extends zzgga<zzbbi, zzbbh> implements zzghj {
    private static final zzggg<Integer, zzazx> zzj = new zzbbg();
    private static final zzbbi zzr;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzggf zzi = zzaB();
    private zzbbd zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        zzbbi zzbbiVar = new zzbbi();
        zzr = zzbbiVar;
        zzgga.zzay(zzbbi.class, zzbbiVar);
    }

    private zzbbi() {
    }

    static /* synthetic */ void zzA(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzn = i - 1;
        zzbbiVar.zzb |= 128;
    }

    static /* synthetic */ void zzB(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzp = i - 1;
        zzbbiVar.zzb |= 512;
    }

    public static zzbbi zzi(byte[] bArr) throws zzggm {
        return (zzbbi) zzgga.zzaJ(zzr, bArr);
    }

    public static zzbbh zzj() {
        return zzr.zzas();
    }

    static /* synthetic */ void zzl(zzbbi zzbbiVar, long j) {
        zzbbiVar.zzb |= 1;
        zzbbiVar.zze = j;
    }

    static /* synthetic */ void zzm(zzbbi zzbbiVar, long j) {
        zzbbiVar.zzb |= 4;
        zzbbiVar.zzg = j;
    }

    static /* synthetic */ void zzn(zzbbi zzbbiVar, long j) {
        zzbbiVar.zzb |= 8;
        zzbbiVar.zzh = j;
    }

    static /* synthetic */ void zzo(zzbbi zzbbiVar, Iterable iterable) {
        zzggf zzggfVar = zzbbiVar.zzi;
        if (!zzggfVar.zza()) {
            zzbbiVar.zzi = zzgga.zzaC(zzggfVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbbiVar.zzi.zzh(((zzazx) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbbi zzbbiVar, zzbbd zzbbdVar) {
        zzbbdVar.getClass();
        zzbbiVar.zzk = zzbbdVar;
        zzbbiVar.zzb |= 16;
    }

    static /* synthetic */ void zzq(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzb |= 256;
        zzbbiVar.zzo = i;
    }

    static /* synthetic */ void zzr(zzbbi zzbbiVar, zzbbm zzbbmVar) {
        zzbbiVar.zzq = zzbbmVar.zza();
        zzbbiVar.zzb |= 1024;
    }

    static /* synthetic */ void zzx(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzf = i - 1;
        zzbbiVar.zzb |= 2;
    }

    static /* synthetic */ void zzy(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzl = i - 1;
        zzbbiVar.zzb |= 32;
    }

    static /* synthetic */ void zzz(zzbbi zzbbiVar, int i) {
        zzbbiVar.zzm = i - 1;
        zzbbiVar.zzb |= 64;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgge zzggeVarZzc = zzazx.zzc();
            zzgge zzggeVarZzc2 = zzbbm.zzc();
            zzgge zzggeVar = zzbam.zza;
            return zzaz(zzr, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzb", "zze", "zzf", zzggeVar, "zzg", "zzh", "zzi", zzggeVarZzc, "zzk", "zzl", zzggeVar, "zzm", zzggeVar, "zzn", zzggeVar, "zzo", "zzp", zzggeVar, "zzq", zzggeVarZzc2});
        }
        if (i2 == 3) {
            return new zzbbi();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbbh(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzr;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final List<zzazx> zze() {
        return new zzggh(this.zzi, zzj);
    }

    public final zzbbd zzf() {
        zzbbd zzbbdVar = this.zzk;
        return zzbbdVar == null ? zzbbd.zze() : zzbbdVar;
    }

    public final int zzg() {
        return this.zzo;
    }

    public final zzbbm zzh() {
        zzbbm zzbbmVarZzb = zzbbm.zzb(this.zzq);
        return zzbbmVarZzb == null ? zzbbm.UNSPECIFIED : zzbbmVarZzb;
    }

    public final int zzs() {
        int iZza = zzban.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzt() {
        int iZza = zzban.zza(this.zzl);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzu() {
        int iZza = zzban.zza(this.zzm);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzv() {
        int iZza = zzban.zza(this.zzn);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzw() {
        int iZza = zzban.zza(this.zzp);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
