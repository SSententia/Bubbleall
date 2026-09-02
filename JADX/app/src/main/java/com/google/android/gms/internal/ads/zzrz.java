package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrz implements zzot {
    final /* synthetic */ zzsa zza;

    /* synthetic */ zzrz(zzsa zzsaVar, zzry zzryVar) {
        this.zza = zzsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        zzou zzouVar = new zzou(j, zzamq.zzy((-30000) + this.zza.zzb + ((this.zza.zzd.zzi(j) * (this.zza.zzc - this.zza.zzb)) / this.zza.zzf), this.zza.zzb, this.zza.zzc - 1));
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zzd.zzh(this.zza.zzf);
    }
}
