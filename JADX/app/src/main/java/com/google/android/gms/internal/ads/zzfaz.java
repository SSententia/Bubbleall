package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfaz implements zzfrz<String> {
    final /* synthetic */ zzcml zza;
    final /* synthetic */ zzffu zzb;
    final /* synthetic */ zzedq zzc;

    zzfaz(zzcml zzcmlVar, zzffu zzffuVar, zzedq zzedqVar) {
        this.zza = zzcmlVar;
        this.zzb = zzffuVar;
        this.zzc = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        if (!this.zza.zzF().zzaf) {
            this.zzb.zzb(str2);
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        String str3 = this.zza.zzaB().zzb;
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 2;
        if (!com.google.android.gms.ads.internal.util.zzs.zzI(this.zza.getContext())) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeC)).booleanValue() || !this.zza.zzF().zzO) {
                i = 1;
            }
        }
        this.zzc.zze(new zzeds(jCurrentTimeMillis, str3, str2, i));
    }
}
