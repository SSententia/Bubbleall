package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbx extends zzgga<zzbbx, zzbbw> implements zzghj {
    private static final zzbbx zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbbx zzbbxVar = new zzbbx();
        zzg = zzbbxVar;
        zzgga.zzay(zzbbx.class, zzbbxVar);
    }

    private zzbbx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbbx();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbbw(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
