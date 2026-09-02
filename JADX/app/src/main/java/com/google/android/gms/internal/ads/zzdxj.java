package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdxj extends zzbro {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzchl zzd;
    final /* synthetic */ zzdxk zze;

    zzdxj(zzdxk zzdxkVar, Object obj, String str, long j, zzchl zzchlVar) {
        this.zze = zzdxkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze() {
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzc));
            this.zze.zzl.zzb(this.zzb);
            this.zze.zzo.zzb(this.zzb);
            this.zzd.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf(String str) {
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzc));
            this.zze.zzl.zzc(this.zzb, "error");
            this.zze.zzo.zzc(this.zzb, "error");
            this.zzd.zzc(false);
        }
    }
}
