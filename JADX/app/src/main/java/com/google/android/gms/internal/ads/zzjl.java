package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjl implements Comparable<zzjl> {
    private final boolean zza;
    private final boolean zzb;

    public zzjl(zzafv zzafvVar, int i) {
        this.zza = 1 == (zzafvVar.zzd & 1);
        this.zzb = zzjt.zzf(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzjl zzjlVar) {
        return zzfny.zzj().zzd(this.zzb, zzjlVar.zzb).zzd(this.zza, zzjlVar.zza).zze();
    }
}
