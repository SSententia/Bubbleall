package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzv extends zzgga<zzfzv, zzfzu> implements zzghj {
    private static final zzfzv zzg;
    private int zzb;
    private zzfzy zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzfzv zzfzvVar = new zzfzv();
        zzg = zzfzvVar;
        zzgga.zzay(zzfzv.class, zzfzvVar);
    }

    private zzfzv() {
    }

    public static zzfzv zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzv) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfzu zzf() {
        return zzg.zzas();
    }

    static /* synthetic */ void zzi(zzfzv zzfzvVar, zzfzy zzfzyVar) {
        zzfzyVar.getClass();
        zzfzvVar.zze = zzfzyVar;
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
            return new zzfzv();
        }
        zzfzt zzfztVar = null;
        if (i2 == 4) {
            return new zzfzu(zzfztVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final zzfzy zzc() {
        zzfzy zzfzyVar = this.zze;
        return zzfzyVar == null ? zzfzy.zzh() : zzfzyVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
