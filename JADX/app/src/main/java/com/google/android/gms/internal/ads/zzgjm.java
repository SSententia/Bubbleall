package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjm extends zzgga<zzgjm, zzgjl> implements zzghj {
    private static final zzgjm zzh;
    private int zzb;
    private byte zzg = 2;
    private zzgex zze = zzgex.zzb;
    private zzgex zzf = zzgex.zzb;

    static {
        zzgjm zzgjmVar = new zzgjm();
        zzh = zzgjmVar;
        zzgga.zzay(zzgjm.class, zzgjmVar);
    }

    private zzgjm() {
    }

    public static zzgjl zza() {
        return zzh.zzas();
    }

    static /* synthetic */ void zzd(zzgjm zzgjmVar, zzgex zzgexVar) {
        zzgjmVar.zzb |= 1;
        zzgjmVar.zze = zzgexVar;
    }

    static /* synthetic */ void zze(zzgjm zzgjmVar, zzgex zzgexVar) {
        zzgjmVar.zzb |= 2;
        zzgjmVar.zzf = zzgexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzaz(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgjm();
        }
        zzgjg zzgjgVar = null;
        if (i2 == 4) {
            return new zzgjl(zzgjgVar);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
