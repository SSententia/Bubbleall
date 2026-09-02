package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzk extends zzgga<zzzk, zzzj> implements zzghj {
    private static final zzzk zzf;
    private int zzb;
    private String zze = "";

    static {
        zzzk zzzkVar = new zzzk();
        zzf = zzzkVar;
        zzgga.zzay(zzzk.class, zzzkVar);
    }

    private zzzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzzk();
        }
        zzyi zzyiVar = null;
        if (i2 == 4) {
            return new zzzj(zzyiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
