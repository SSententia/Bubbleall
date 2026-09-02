package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzb extends zzgga<zzzb, zzza> implements zzghj {
    private static final zzzb zzj;
    private int zzb;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzggf zzh = zzaB();
    private long zzi;

    static {
        zzzb zzzbVar = new zzzb();
        zzj = zzzbVar;
        zzgga.zzay(zzzb.class, zzzbVar);
    }

    private zzzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzzb();
        }
        zzyi zzyiVar = null;
        if (i2 == 4) {
            return new zzza(zzyiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }
}
