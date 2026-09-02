package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcs extends zzgga<zzbcs, zzbcr> implements zzghj {
    private static final zzbcs zzg;
    private int zzb;
    private int zze = 1000;
    private zzbcg zzf;

    static {
        zzbcs zzbcsVar = new zzbcs();
        zzg = zzbcsVar;
        zzgga.zzay(zzbcs.class, zzbcsVar);
    }

    private zzbcs() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzbam.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzbcs();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbcr(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
