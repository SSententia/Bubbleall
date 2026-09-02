package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnv extends zzfny {
    zzfnv() {
        super(null);
    }

    static final zzfny zzf(int i) {
        if (i < 0) {
            return zzfny.zzb;
        }
        return i > 0 ? zzfny.zzc : zzfny.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final <T> zzfny zza(T t, T t2, Comparator<T> comparator) {
        return zzf(comparator.compare(t, t2));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzb(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzc(boolean z, boolean z2) {
        return zzf(zzfqq.zza(false, false));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny zzd(boolean z, boolean z2) {
        return zzf(zzfqq.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final int zze() {
        return 0;
    }
}
