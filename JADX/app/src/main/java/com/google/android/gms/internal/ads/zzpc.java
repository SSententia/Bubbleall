package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpc {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzoz zzb(zzamf zzamfVar, boolean z, boolean z2) throws zzaha {
        if (z) {
            zzc(3, zzamfVar, false);
        }
        String strZzE = zzamfVar.zzE((int) zzamfVar.zzu(), zzfll.zzc);
        long jZzu = zzamfVar.zzu();
        String[] strArr = new String[(int) jZzu];
        int length = strZzE.length() + 15;
        for (int i = 0; i < jZzu; i++) {
            String strZzE2 = zzamfVar.zzE((int) zzamfVar.zzu(), zzfll.zzc);
            strArr[i] = strZzE2;
            length = length + 4 + strZzE2.length();
        }
        if (z2 && (zzamfVar.zzn() & 1) == 0) {
            throw zzaha.zzb("framing bit expected to be set", null);
        }
        return new zzoz(strZzE, strArr, length + 1);
    }

    public static boolean zzc(int i, zzamf zzamfVar, boolean z) throws zzaha {
        if (zzamfVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int iZzd = zzamfVar.zzd();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iZzd);
            throw zzaha.zzb(sb.toString(), null);
        }
        if (zzamfVar.zzn() != i) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw zzaha.zzb(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "), null);
        }
        if (zzamfVar.zzn() == 118 && zzamfVar.zzn() == 111 && zzamfVar.zzn() == 114 && zzamfVar.zzn() == 98 && zzamfVar.zzn() == 105 && zzamfVar.zzn() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzaha.zzb("expected characters 'vorbis'", null);
    }
}
