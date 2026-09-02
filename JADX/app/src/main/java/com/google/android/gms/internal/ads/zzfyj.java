package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyj extends zzgga<zzfyj, zzfyi> implements zzghj {
    private static final zzfyj zze;
    private int zzb;

    static {
        zzfyj zzfyjVar = new zzfyj();
        zze = zzfyjVar;
        zzgga.zzay(zzfyj.class, zzfyjVar);
    }

    private zzfyj() {
    }

    public static zzfyi zzc() {
        return zze.zzas();
    }

    public static zzfyj zzd() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
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
            return new zzfyj();
        }
        zzfyh zzfyhVar = null;
        if (i2 == 4) {
            return new zzfyi(zzfyhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
