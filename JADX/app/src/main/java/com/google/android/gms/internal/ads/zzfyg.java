package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyg extends zzgga<zzfyg, zzfyf> implements zzghj {
    private static final zzfyg zzf;
    private zzfyj zzb;
    private int zze;

    static {
        zzfyg zzfygVar = new zzfyg();
        zzf = zzfygVar;
        zzgga.zzay(zzfyg.class, zzfygVar);
    }

    private zzfyg() {
    }

    public static zzfyg zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyg) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyf zze() {
        return zzf.zzas();
    }

    static /* synthetic */ void zzg(zzfyg zzfygVar, zzfyj zzfyjVar) {
        zzfyjVar.getClass();
        zzfygVar.zzb = zzfyjVar;
    }

    public final zzfyj zza() {
        zzfyj zzfyjVar = this.zzb;
        return zzfyjVar == null ? zzfyj.zzd() : zzfyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzfyg();
        }
        zzfye zzfyeVar = null;
        if (i2 == 4) {
            return new zzfyf(zzfyeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    public final int zzc() {
        return this.zze;
    }
}
