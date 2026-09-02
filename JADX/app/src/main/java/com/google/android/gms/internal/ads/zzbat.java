package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbat extends zzgga<zzbat, zzbas> implements zzghj {
    private static final zzbat zzg;
    private int zzb;
    private int zze;
    private zzggf zzf = zzaB();

    static {
        zzbat zzbatVar = new zzbat();
        zzg = zzbatVar;
        zzgga.zzay(zzbat.class, zzbatVar);
    }

    private zzbat() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzb", "zze", zzbam.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzbat();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbas(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
