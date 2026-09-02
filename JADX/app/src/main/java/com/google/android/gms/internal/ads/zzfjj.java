package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjj extends zzgga<zzfjj, zzfjh> implements zzghj {
    private static final zzfjj zzi;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfjf zzh;

    static {
        zzfjj zzfjjVar = new zzfjj();
        zzi = zzfjjVar;
        zzgga.zzay(zzfjj.class, zzfjjVar);
    }

    private zzfjj() {
    }

    public static zzfjh zza() {
        return zzi.zzas();
    }

    static /* synthetic */ void zzd(zzfjj zzfjjVar, String str) {
        str.getClass();
        zzfjjVar.zzb |= 2;
        zzfjjVar.zzf = str;
    }

    static /* synthetic */ void zze(zzfjj zzfjjVar, zzfjf zzfjfVar) {
        zzfjfVar.getClass();
        zzfjjVar.zzh = zzfjfVar;
        zzfjjVar.zzb |= 8;
    }

    static /* synthetic */ void zzf(zzfjj zzfjjVar, int i) {
        zzfjjVar.zze = 1;
        zzfjjVar.zzb = 1 | zzfjjVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", zzfji.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfjj();
        }
        zzfjg zzfjgVar = null;
        if (i2 == 4) {
            return new zzfjh(zzfjgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }
}
