package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyu extends zzgga<zzyu, zzyt> implements zzghj {
    private static final zzyu zzg;
    private int zzb;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzyu zzyuVar = new zzyu();
        zzg = zzyuVar;
        zzgga.zzay(zzyu.class, zzyuVar);
    }

    private zzyu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf", zzzf.zza});
        }
        if (i2 == 3) {
            return new zzyu();
        }
        zzyi zzyiVar = null;
        if (i2 == 4) {
            return new zzyt(zzyiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
