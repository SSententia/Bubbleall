package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyv extends zzgga<zzfyv, zzfyu> implements zzghj {
    private static final zzfyv zzf;
    private int zzb;
    private int zze;

    static {
        zzfyv zzfyvVar = new zzfyv();
        zzf = zzfyvVar;
        zzgga.zzay(zzfyv.class, zzfyvVar);
    }

    private zzfyv() {
    }

    public static zzfyv zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyv) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyu zzd() {
        return zzf.zzas();
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
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzb"});
        }
        if (i2 == 3) {
            return new zzfyv();
        }
        zzfyt zzfytVar = null;
        if (i2 == 4) {
            return new zzfyu(zzfytVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
