package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbd extends zzgga<zzbbd, zzbaw> implements zzghj {
    private static final zzbbd zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbbd zzbbdVar = new zzbbd();
        zzg = zzbbdVar;
        zzgga.zzay(zzbbd.class, zzbbdVar);
    }

    private zzbbd() {
    }

    public static zzbaw zzd() {
        return zzg.zzas();
    }

    public static zzbbd zze() {
        return zzg;
    }

    static /* synthetic */ void zzi(zzbbd zzbbdVar, int i) {
        zzbbdVar.zze = i - 1;
        zzbbdVar.zzb |= 1;
    }

    static /* synthetic */ void zzj(zzbbd zzbbdVar, int i) {
        zzbbdVar.zzf = i - 1;
        zzbbdVar.zzb |= 2;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", zzbbb.zza, "zzf", zzbay.zza});
        }
        if (i2 == 3) {
            return new zzbbd();
        }
        zzazg zzazgVar = null;
        if (i2 == 4) {
            return new zzbaw(zzazgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final int zzg() {
        int iZza = zzbbc.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzh() {
        int iZza = zzbaz.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
