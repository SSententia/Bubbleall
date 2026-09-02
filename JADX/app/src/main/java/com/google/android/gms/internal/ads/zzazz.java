package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazz extends zzgga<zzazz, zzazy> implements zzghj {
    private static final zzazz zzg;
    private int zzb;
    private int zze;
    private zzbbt zzf;

    static {
        zzazz zzazzVar = new zzazz();
        zzg = zzazzVar;
        zzgga.zzay(zzazz.class, zzazzVar);
    }

    private zzazz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzazx.zzc(), "zzf"});
        }
        if (i2 == 3) {
            return new zzazz();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzazy(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
