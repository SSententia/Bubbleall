package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzh extends zzgga<zzfzh, zzfzg> implements zzghj {
    private static final zzfzh zzb;

    static {
        zzfzh zzfzhVar = new zzfzh();
        zzb = zzfzhVar;
        zzgga.zzay(zzfzh.class, zzfzhVar);
    }

    private zzfzh() {
    }

    public static zzfzh zza(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzh) zzgga.zzaI(zzb, zzgexVar, zzgfmVar);
    }

    public static zzfzh zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzfzf zzfzfVar = null;
        if (i2 == 2) {
            return zzaz(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzfzh();
        }
        if (i2 == 4) {
            return new zzfzg(zzfzfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
