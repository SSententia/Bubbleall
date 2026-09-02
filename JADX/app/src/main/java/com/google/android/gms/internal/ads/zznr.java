package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznr {
    public final String zza;

    private zznr(int i, int i2, String str) {
        this.zza = str;
    }

    public static zznr zza(zzamf zzamfVar) {
        String str;
        zzamfVar.zzk(2);
        int iZzn = zzamfVar.zzn();
        int i = iZzn >> 1;
        int iZzn2 = (zzamfVar.zzn() >> 3) | ((iZzn & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iZzn2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(iZzn2);
        return new zznr(i, iZzn2, sb.toString());
    }
}
