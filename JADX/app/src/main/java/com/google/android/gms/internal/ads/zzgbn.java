package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbn extends zzgga<zzgbn, zzgbm> implements zzghj {
    private static final zzgbn zze;
    private String zzb = "";

    static {
        zzgbn zzgbnVar = new zzgbn();
        zze = zzgbnVar;
        zzgga.zzay(zzgbn.class, zzgbnVar);
    }

    private zzgbn() {
    }

    public static zzgbn zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbn) zzgga.zzaI(zze, zzgexVar, zzgfmVar);
    }

    public static zzgbn zzd() {
        return zze;
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
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzgbn();
        }
        zzgbl zzgblVar = null;
        if (i2 == 4) {
            return new zzgbm(zzgblVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
