package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private int zza;
    private final zzjg[] zzb;

    public zzt(zzjg[] zzjgVarArr, byte... bArr) {
        this.zzb = zzjgVarArr;
        int length = zzjgVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzt) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzb) + 527;
        this.zza = iHashCode;
        return iHashCode;
    }
}
