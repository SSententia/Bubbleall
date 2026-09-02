package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgar extends zzgga<zzgar, zzgaq> implements zzghj {
    private static final zzgar zzg;
    private String zzb = "";
    private zzgex zze = zzgex.zzb;
    private int zzf;

    static {
        zzgar zzgarVar = new zzgar();
        zzg = zzgarVar;
        zzgga.zzay(zzgar.class, zzgarVar);
    }

    private zzgar() {
    }

    public static zzgaq zzd() {
        return zzg.zzas();
    }

    public static zzgar zze() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgar();
        }
        zzgap zzgapVar = null;
        if (i2 == 4) {
            return new zzgaq(zzgapVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final zzgex zzc() {
        return this.zze;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
