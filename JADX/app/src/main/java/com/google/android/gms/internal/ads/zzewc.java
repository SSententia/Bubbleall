package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzewc implements zzelx<zzcva> {
    final /* synthetic */ zzewd zza;

    zzewc(zzewd zzewdVar) {
        this.zza = zzewdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzcva zzcvaVar) {
        zzcva zzcvaVar2 = zzcvaVar;
        synchronized (this.zza) {
            zzcva zzcvaVar3 = this.zza.zza;
            if (zzcvaVar3 != null) {
                zzcvaVar3.zzT();
            }
            zzewd zzewdVar = this.zza;
            zzewdVar.zza = zzcvaVar2;
            zzcvaVar2.zza(zzewdVar);
            zzevv zzevvVar = this.zza.zzg;
            zzewd zzewdVar2 = this.zza;
            zzevvVar.zzm(new zzcvb(zzcvaVar2, zzewdVar2, zzewdVar2.zzg));
            zzcvaVar2.zzS();
        }
    }
}
