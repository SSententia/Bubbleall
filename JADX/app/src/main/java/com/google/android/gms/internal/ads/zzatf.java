package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatf {
    public final int zza = 1;
    private final zzanm[] zzb;
    private int zzc;

    public zzatf(zzanm... zzanmVarArr) {
        this.zzb = zzanmVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zzb, ((zzatf) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzb) + 527;
        this.zzc = iHashCode;
        return iHashCode;
    }

    public final zzanm zza(int i) {
        return this.zzb[i];
    }

    public final int zzb(zzanm zzanmVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzanmVar == this.zzb[i]) {
                return i;
            }
        }
        return -1;
    }
}
