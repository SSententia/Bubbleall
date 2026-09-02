package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzats {
    private int zza;
    private final zzatk[] zzb;

    public zzats(zzatk[] zzatkVarArr, byte... bArr) {
        this.zzb = zzatkVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzats) obj).zzb);
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

    public final zzatk zza(int i) {
        return this.zzb[i];
    }

    public final zzatk[] zzb() {
        return (zzatk[]) this.zzb.clone();
    }
}
