package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbv extends zzgga<zzbbv, zzbbu> implements zzghj {
    private static final zzbbv zzh;
    private int zzb;
    private String zze = "";
    private int zzf;
    private zzbbx zzg;

    static {
        zzbbv zzbbvVar = new zzbbv();
        zzh = zzbbvVar;
        zzgga.zzay(zzbbv.class, zzbbvVar);
    }

    private zzbbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzbam.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzbbv();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbbu(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
