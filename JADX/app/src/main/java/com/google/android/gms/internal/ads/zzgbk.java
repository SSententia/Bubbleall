package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbk extends zzgga<zzgbk, zzgbj> implements zzghj {
    private static final zzgbk zzf;
    private int zzb;
    private zzgbn zze;

    static {
        zzgbk zzgbkVar = new zzgbk();
        zzf = zzgbkVar;
        zzgga.zzay(zzgbk.class, zzgbkVar);
    }

    private zzgbk() {
    }

    public static zzgbk zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbk) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgbj zze() {
        return zzf.zzas();
    }

    static /* synthetic */ void zzh(zzgbk zzgbkVar, zzgbn zzgbnVar) {
        zzgbnVar.getClass();
        zzgbkVar.zze = zzgbnVar;
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
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzgbk();
        }
        zzgbi zzgbiVar = null;
        if (i2 == 4) {
            return new zzgbj(zzgbiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    public final zzgbn zzc() {
        zzgbn zzgbnVar = this.zze;
        return zzgbnVar == null ? zzgbn.zzd() : zzgbnVar;
    }
}
