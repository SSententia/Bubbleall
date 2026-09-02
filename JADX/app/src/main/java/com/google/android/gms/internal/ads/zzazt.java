package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazt extends zzgga<zzazt, zzazs> implements zzghj {
    private static final zzazt zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzazt zzaztVar = new zzazt();
        zzh = zzaztVar;
        zzgga.zzay(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    public static zzazs zza() {
        return zzh.zzas();
    }

    static /* synthetic */ void zzd(zzazt zzaztVar, boolean z) {
        zzaztVar.zzb |= 1;
        zzaztVar.zze = z;
    }

    static /* synthetic */ void zze(zzazt zzaztVar, boolean z) {
        zzaztVar.zzb |= 2;
        zzaztVar.zzf = z;
    }

    static /* synthetic */ void zzf(zzazt zzaztVar, int i) {
        zzaztVar.zzb |= 4;
        zzaztVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzazt();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzazs(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
