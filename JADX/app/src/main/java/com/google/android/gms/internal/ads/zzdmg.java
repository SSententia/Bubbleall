package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdmg implements zzawd {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdmh zzb;

    zzdmg(zzdmh zzdmhVar, String str) {
        this.zzb = zzdmhVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzc(zzawc zzawcVar) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbf)).booleanValue()) {
            if (zzawcVar.zzj) {
                this.zzb.zzx.put(this.zza, true);
                zzdmh zzdmhVar = this.zzb;
                zzdmhVar.zzr(zzdmhVar.zzn.zzbx(), this.zzb.zzn.zzj(), this.zzb.zzn.zzk(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzawcVar.zzj) {
                if (this.zzb.zzn == null) {
                    return;
                }
                this.zzb.zzx.put(this.zza, true);
                zzdmh zzdmhVar2 = this.zzb;
                zzdmhVar2.zzr(zzdmhVar2.zzn.zzbx(), this.zzb.zzn.zzj(), this.zzb.zzn.zzk(), true);
            }
        }
    }
}
