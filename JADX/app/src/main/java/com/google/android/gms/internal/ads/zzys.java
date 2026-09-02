package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzys extends zzgga<zzys, zzyr> implements zzghj {
    private static final zzys zzg;
    private int zzb;
    private int zze;
    private long zzf = -1;

    static {
        zzys zzysVar = new zzys();
        zzg = zzysVar;
        zzgga.zzay(zzys.class, zzysVar);
    }

    private zzys() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", zzyo.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzys();
        }
        zzyi zzyiVar = null;
        if (i2 == 4) {
            return new zzyr(zzyiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
