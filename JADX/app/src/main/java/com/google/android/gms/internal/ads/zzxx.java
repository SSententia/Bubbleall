package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxx extends zzgga<zzxx, zzxw> implements zzghj {
    private static final zzxx zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        zzxx zzxxVar = new zzxx();
        zzg = zzxxVar;
        zzgga.zzay(zzxx.class, zzxxVar);
    }

    private zzxx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzxx();
        }
        zzxu zzxuVar = null;
        if (i2 == 4) {
            return new zzxw(zzxuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
