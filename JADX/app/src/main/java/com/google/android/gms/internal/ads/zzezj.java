package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzezj implements zzfrz<zzdrw> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzezl zzb;
    final /* synthetic */ zzezm zzc;

    zzezj(zzezm zzezmVar, zzelx zzelxVar, zzezl zzezlVar) {
        this.zzc = zzezmVar;
        this.zza = zzelxVar;
        this.zzb = zzezlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzdsb zzdsbVar = (zzdsb) this.zzc.zze.zzd();
        final zzbcz zzbczVarZzb = zzdsbVar == null ? zzfbm.zzb(th, null) : zzdsbVar.zzP().zzh(th);
        synchronized (this.zzc) {
            try {
                if (zzdsbVar != null) {
                    zzdsbVar.zzT().zzbD(zzbczVarZzb);
                    this.zzc.zzb.execute(new Runnable(this, zzbczVarZzb) { // from class: com.google.android.gms.internal.ads.zzezi
                        private final zzezj zza;
                        private final zzbcz zzb;

                        {
                            this.zza = this;
                            this.zzb = zzbczVarZzb;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezj zzezjVar = this.zza;
                            zzezjVar.zzc.zzd.zzbD(this.zzb);
                        }
                    });
                } else {
                    this.zzc.zzd.zzbD(zzbczVarZzb);
                    this.zzc.zzh(this.zzb).zzf().zzP().zze().zzp();
                }
                zzfbh.zza(zzbczVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzdrw zzdrwVar) {
        zzdrw zzdrwVar2 = zzdrwVar;
        synchronized (this.zzc) {
            zzdrwVar2.zzo().zzd(this.zzc.zzd);
            this.zza.zzb(zzdrwVar2);
            Executor executor = this.zzc.zzb;
            zzezc zzezcVar = this.zzc.zzd;
            zzezcVar.getClass();
            executor.execute(zzezh.zza(zzezcVar));
            this.zzc.zzd.zzu();
        }
    }
}
