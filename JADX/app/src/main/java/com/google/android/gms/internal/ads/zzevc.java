package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzevc implements zzfrz {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzevd zzb;
    final /* synthetic */ zzevf zzc;

    zzevc(zzevf zzevfVar, zzelx zzelxVar, zzevd zzevdVar) {
        this.zzc = zzevfVar;
        this.zza = zzelxVar;
        this.zzb = zzevdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzcup zzcupVar = (zzcup) this.zzc.zze.zzd();
        final zzbcz zzbczVarZzb = zzcupVar == null ? zzfbm.zzb(th, null) : zzcupVar.zzP().zzh(th);
        synchronized (this.zzc) {
            zzevf.zzg(this.zzc, null);
            if (zzcupVar != null) {
                zzcupVar.zzO().zzbD(zzbczVarZzb);
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfP)).booleanValue()) {
                    this.zzc.zzc.execute(new Runnable(this, zzbczVarZzb) { // from class: com.google.android.gms.internal.ads.zzevb
                        private final zzevc zza;
                        private final zzbcz zzb;

                        {
                            this.zza = this;
                            this.zzb = zzbczVarZzb;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevc zzevcVar = this.zza;
                            zzevcVar.zzc.zzd.zzbD(this.zzb);
                        }
                    });
                }
            } else {
                this.zzc.zzd.zzbD(zzbczVarZzb);
                ((zzcup) this.zzc.zzk(this.zzb).zzf()).zzP().zze().zzp();
            }
            zzfbh.zza(zzbczVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcxg zzcxgVar = (zzcxg) obj;
        synchronized (this.zzc) {
            zzevf.zzg(this.zzc, null);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfP)).booleanValue()) {
                zzcxgVar.zzo().zzc(this.zzc.zzd);
            }
            this.zza.zzb(zzcxgVar);
        }
    }
}
