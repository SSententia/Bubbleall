package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanz {
    public static final zzanz zza = new zzanz(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    zzanz(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.zzb = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzanz)) {
            return false;
        }
        zzanz zzanzVar = (zzanz) obj;
        if (!Arrays.equals(this.zzb, zzanzVar.zzb)) {
            return false;
        }
        int i = zzanzVar.zzc;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=2, supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
