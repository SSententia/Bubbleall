package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxu extends zzgga<zzfxu, zzfxt> implements zzghj {
    private static final zzfxu zzg;
    private int zzb;
    private zzfya zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzfxu zzfxuVar = new zzfxu();
        zzg = zzfxuVar;
        zzgga.zzay(zzfxu.class, zzfxuVar);
    }

    private zzfxu() {
    }

    public static zzfxu zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxu) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfxt zzf() {
        return zzg.zzas();
    }

    public static zzfxu zzg() {
        return zzg;
    }

    static /* synthetic */ void zzj(zzfxu zzfxuVar, zzfya zzfyaVar) {
        zzfyaVar.getClass();
        zzfxuVar.zze = zzfyaVar;
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
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzfxu();
        }
        zzfxs zzfxsVar = null;
        if (i2 == 4) {
            return new zzfxt(zzfxsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final zzfya zzc() {
        zzfya zzfyaVar = this.zze;
        return zzfyaVar == null ? zzfya.zzd() : zzfyaVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
