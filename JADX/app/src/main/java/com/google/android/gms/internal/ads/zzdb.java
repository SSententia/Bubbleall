package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdb {
    public static final zzdb zza = new zzdb(new int[]{2}, 8);
    private static final zzdb zzb = new zzdb(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzdb(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        if (!Arrays.equals(this.zzc, zzdbVar.zzc)) {
            return false;
        }
        int i = zzdbVar.zzd;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=8, supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
