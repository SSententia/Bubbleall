package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbav extends zzgga<zzbav, zzbau> implements zzghj {
    private static final zzbav zzi;
    private int zzb;
    private zzbar zze;
    private zzggj<zzbbv> zzf = zzaE();
    private int zzg;
    private zzbbx zzh;

    static {
        zzbav zzbavVar = new zzbav();
        zzi = zzbavVar;
        zzgga.zzay(zzbav.class, zzbavVar);
    }

    private zzbav() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzbbv.class, "zzg", zzbam.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzbav();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbau(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }
}
