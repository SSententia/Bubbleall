package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjk extends zzgga<zzgjk, zzgjj> implements zzghj {
    private static final zzgjk zzf;
    private int zzb;
    private String zze = "";

    static {
        zzgjk zzgjkVar = new zzgjk();
        zzf = zzgjkVar;
        zzgga.zzay(zzgjk.class, zzgjkVar);
    }

    private zzgjk() {
    }

    public static zzgjj zza() {
        return zzf.zzas();
    }

    static /* synthetic */ void zzd(zzgjk zzgjkVar, String str) {
        zzgjkVar.zzb |= 1;
        zzgjkVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzgjk();
        }
        zzgjg zzgjgVar = null;
        if (i2 == 4) {
            return new zzgjj(zzgjgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
