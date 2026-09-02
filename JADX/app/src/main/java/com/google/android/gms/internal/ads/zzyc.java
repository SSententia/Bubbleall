package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyc extends zzgga<zzyc, zzyb> implements zzghj {
    private static final zzyc zzg;
    private int zzb;
    private zzye zze;
    private zzyh zzf;

    static {
        zzyc zzycVar = new zzyc();
        zzg = zzycVar;
        zzgga.zzay(zzyc.class, zzycVar);
    }

    private zzyc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzyc();
        }
        zzya zzyaVar = null;
        if (i2 == 4) {
            return new zzyb(zzyaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
