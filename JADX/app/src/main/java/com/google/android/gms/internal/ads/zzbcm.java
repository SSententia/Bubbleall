package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcm extends zzgga<zzbcm, zzbcl> implements zzghj {
    private static final zzbcm zzh;
    private int zzb;
    private int zze = 1000;
    private zzbcg zzf;
    private zzbbx zzg;

    static {
        zzbcm zzbcmVar = new zzbcm();
        zzh = zzbcmVar;
        zzgga.zzay(zzbcm.class, zzbcmVar);
    }

    private zzbcm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzbam.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbcm();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbcl(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
