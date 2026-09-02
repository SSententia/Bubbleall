package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjp extends zzgga<zzgjp, zzgjo> implements zzghj {
    private static final zzgjp zzh;
    private int zzb;
    private zzgex zze = zzgex.zzb;
    private zzgex zzf = zzgex.zzb;
    private zzgex zzg = zzgex.zzb;

    static {
        zzgjp zzgjpVar = new zzgjp();
        zzh = zzgjpVar;
        zzgga.zzay(zzgjp.class, zzgjpVar);
    }

    private zzgjp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgjp();
        }
        zzgjg zzgjgVar = null;
        if (i2 == 4) {
            return new zzgjo(zzgjgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
