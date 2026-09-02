package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyp extends zzgga<zzfyp, zzfyo> implements zzghj {
    private static final zzfyp zzf;
    private int zzb;
    private int zze;

    static {
        zzfyp zzfypVar = new zzfyp();
        zzf = zzfypVar;
        zzgga.zzay(zzfyp.class, zzfypVar);
    }

    private zzfyp() {
    }

    public static zzfyp zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyp) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyo zzd() {
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
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzfyp();
        }
        zzfyn zzfynVar = null;
        if (i2 == 4) {
            return new zzfyo(zzfynVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
