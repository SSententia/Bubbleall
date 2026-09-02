package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgce extends zzgga<zzgce, zzgcd> implements zzghj {
    private static final zzgce zze;
    private int zzb;

    static {
        zzgce zzgceVar = new zzgce();
        zze = zzgceVar;
        zzgga.zzay(zzgce.class, zzgceVar);
    }

    private zzgce() {
    }

    public static zzgce zza(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgce) zzgga.zzaI(zze, zzgexVar, zzgfmVar);
    }

    public static zzgce zzc() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzgce();
        }
        zzgcc zzgccVar = null;
        if (i2 == 4) {
            return new zzgcd(zzgccVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
