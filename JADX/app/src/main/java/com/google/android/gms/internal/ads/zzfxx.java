package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxx extends zzgga<zzfxx, zzfxw> implements zzghj {
    private static final zzfxx zzf;
    private zzfya zzb;
    private int zze;

    static {
        zzfxx zzfxxVar = new zzfxx();
        zzf = zzfxxVar;
        zzgga.zzay(zzfxx.class, zzfxxVar);
    }

    private zzfxx() {
    }

    public static zzfxx zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxx) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfxw zze() {
        return zzf.zzas();
    }

    public static zzfxx zzf() {
        return zzf;
    }

    static /* synthetic */ void zzh(zzfxx zzfxxVar, zzfya zzfyaVar) {
        zzfyaVar.getClass();
        zzfxxVar.zzb = zzfyaVar;
    }

    public final zzfya zza() {
        zzfya zzfyaVar = this.zzb;
        return zzfyaVar == null ? zzfya.zzd() : zzfyaVar;
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
            return new zzfxx();
        }
        zzfxv zzfxvVar = null;
        if (i2 == 4) {
            return new zzfxw(zzfxvVar);
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
