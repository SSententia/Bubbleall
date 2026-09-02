package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafh implements zzahu {
    final /* synthetic */ zzafp zza;

    zzafh(zzafp zzafpVar) {
        this.zza = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zza(long j) {
        if (j >= 2000) {
            zzafp.zzd(this.zza, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzb() {
        this.zza.zzh.zzf(2);
    }
}
