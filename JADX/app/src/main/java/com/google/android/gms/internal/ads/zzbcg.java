package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcg extends zzgga<zzbcg, zzbce> implements zzghj {
    private static final zzbcg zzf;
    private int zzb;
    private int zze;

    static {
        zzbcg zzbcgVar = new zzbcg();
        zzf = zzbcgVar;
        zzgga.zzay(zzbcg.class, zzbcgVar);
    }

    private zzbcg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zze", zzbcf.zza});
        }
        if (i2 == 3) {
            return new zzbcg();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbce(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
