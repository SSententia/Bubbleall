package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpw implements zzot {
    final /* synthetic */ zzot zza;
    final /* synthetic */ zzpx zzb;

    zzpw(zzpx zzpxVar, zzot zzotVar) {
        this.zzb = zzpxVar;
        this.zza = zzotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        zzor zzorVarZzf = this.zza.zzf(j);
        zzou zzouVar = zzorVarZzf.zza;
        zzou zzouVar2 = new zzou(zzouVar.zzb, zzouVar.zzc + this.zzb.zzb);
        zzou zzouVar3 = zzorVarZzf.zzb;
        return new zzor(zzouVar2, new zzou(zzouVar3.zzb, zzouVar3.zzc + this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zzg();
    }
}
