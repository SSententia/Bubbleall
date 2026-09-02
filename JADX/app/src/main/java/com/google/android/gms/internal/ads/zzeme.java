package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeme implements zzfrz<zzcxg> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzdlb zzb;
    final /* synthetic */ zzemf zzc;

    zzeme(zzemf zzemfVar, zzelx zzelxVar, zzdlb zzdlbVar) {
        this.zzc = zzemfVar;
        this.zza = zzelxVar;
        this.zzb = zzdlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        final zzbcz zzbczVarZzh = this.zzb.zzR().zzh(th);
        this.zzb.zzS().zzbD(zzbczVarZzh);
        this.zzc.zzb.zze().execute(new Runnable(this, zzbczVarZzh) { // from class: com.google.android.gms.internal.ads.zzemd
            private final zzeme zza;
            private final zzbcz zzb;

            {
                this.zza = this;
                this.zzb = zzbczVarZzh;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzeme zzemeVar = this.zza;
                zzemeVar.zzc.zzd.zze().zzbD(this.zzb);
            }
        });
        zzfbh.zza(zzbczVarZzh.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcxg zzcxgVar) {
        zzcxg zzcxgVar2 = zzcxgVar;
        synchronized (this.zzc) {
            zzcxgVar2.zzo().zza(this.zzc.zzd.zzc());
            this.zza.zzb(zzcxgVar2);
            this.zzc.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzemc
                private final zzeme zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc.zzd.zzd().zzf();
                }
            });
        }
    }
}
