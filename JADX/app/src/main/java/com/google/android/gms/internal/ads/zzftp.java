package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftp {
    private final zzgau zza;

    private zzftp(zzgau zzgauVar) {
        this.zza = zzgauVar;
    }

    public static zzftp zzc(String str, byte[] bArr, int i) {
        int i2;
        zzgat zzgatVarZzd = zzgau.zzd();
        zzgatVarZzd.zza(str);
        zzgatVarZzd.zzb(zzgex.zzt(bArr));
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = i3 != 1 ? 5 : 4;
        } else {
            i2 = 3;
        }
        zzgatVarZzd.zzc(i2);
        return new zzftp(zzgatVarZzd.zzah());
    }

    public final String zza() {
        return this.zza.zza();
    }

    public final byte[] zzb() {
        return this.zza.zzc().zzz();
    }

    public final int zzd() {
        int iZzi = this.zza.zzi() - 2;
        int i = 1;
        if (iZzi != 1) {
            i = 2;
            if (iZzi != 2) {
                i = 3;
                if (iZzi != 3) {
                    if (iZzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
