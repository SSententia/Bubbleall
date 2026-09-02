package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbq extends zzgga<zzgbq, zzgbp> implements zzghj {
    private static final zzgbq zzf;
    private int zzb;
    private zzgbt zze;

    static {
        zzgbq zzgbqVar = new zzgbq();
        zzf = zzgbqVar;
        zzgga.zzay(zzgbq.class, zzgbqVar);
    }

    private zzgbq() {
    }

    public static zzgbq zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbq) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgbp zze() {
        return zzf.zzas();
    }

    static /* synthetic */ void zzh(zzgbq zzgbqVar, zzgbt zzgbtVar) {
        zzgbtVar.getClass();
        zzgbqVar.zze = zzgbtVar;
    }

    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzgbq();
        }
        zzgbo zzgboVar = null;
        if (i2 == 4) {
            return new zzgbp(zzgboVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    public final zzgbt zzc() {
        zzgbt zzgbtVar = this.zze;
        return zzgbtVar == null ? zzgbt.zzf() : zzgbtVar;
    }
}
