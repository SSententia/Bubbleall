package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzz {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzh(Integer.MIN_VALUE);
    }

    public final boolean zzc() {
        return zzh(4);
    }

    public final boolean zzd() {
        return zzh(1);
    }

    public final boolean zze() {
        return zzh(268435456);
    }

    public final void zzf(int i) {
        this.zza = i;
    }

    public final void zzg(int i) {
        this.zza |= Integer.MIN_VALUE;
    }

    protected final boolean zzh(int i) {
        return (this.zza & i) == i;
    }
}
