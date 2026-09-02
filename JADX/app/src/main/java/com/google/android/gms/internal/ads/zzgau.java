package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgau extends zzgga<zzgau, zzgat> implements zzghj {
    private static final zzgau zzg;
    private String zzb = "";
    private zzgex zze = zzgex.zzb;
    private int zzf;

    static {
        zzgau zzgauVar = new zzgau();
        zzg = zzgauVar;
        zzgga.zzay(zzgau.class, zzgauVar);
    }

    private zzgau() {
    }

    public static zzgat zzd() {
        return zzg.zzas();
    }

    public static zzgau zze() {
        return zzg;
    }

    static /* synthetic */ void zzg(zzgau zzgauVar, String str) {
        str.getClass();
        zzgauVar.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgau();
        }
        zzgas zzgasVar = null;
        if (i2 == 4) {
            return new zzgat(zzgasVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final zzgex zzc() {
        return this.zze;
    }

    public final int zzi() {
        int iZzb = zzgbv.zzb(this.zzf);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
