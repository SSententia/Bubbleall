package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazr extends zzgga<zzazr, zzazq> implements zzghj {
    private static final zzazr zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzazr zzazrVar = new zzazr();
        zzg = zzazrVar;
        zzgga.zzay(zzazr.class, zzazrVar);
    }

    private zzazr() {
    }

    public static zzazq zza() {
        return zzg.zzas();
    }

    public static zzazr zzc() {
        return zzg;
    }

    static /* synthetic */ void zze(zzazr zzazrVar, boolean z) {
        zzazrVar.zzb |= 1;
        zzazrVar.zze = z;
    }

    static /* synthetic */ void zzf(zzazr zzazrVar, int i) {
        zzazrVar.zzb |= 2;
        zzazrVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzazr();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzazq(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
