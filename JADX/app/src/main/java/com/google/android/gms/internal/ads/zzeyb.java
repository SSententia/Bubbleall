package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeyb implements zzfrz<zzdji> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzdkf zzb;
    final /* synthetic */ zzeyc zzc;

    zzeyb(zzeyc zzeycVar, zzelx zzelxVar, zzdkf zzdkfVar) {
        this.zzc = zzeycVar;
        this.zza = zzelxVar;
        this.zzb = zzdkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        final zzbcz zzbczVarZzh = this.zzb.zzP().zzh(th);
        synchronized (this.zzc) {
            zzeyc.zzf(this.zzc, null);
            this.zzb.zzO().zzbD(zzbczVarZzh);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfQ)).booleanValue()) {
                this.zzc.zzb.execute(new Runnable(this, zzbczVarZzh) { // from class: com.google.android.gms.internal.ads.zzexz
                    private final zzeyb zza;
                    private final zzbcz zzb;

                    {
                        this.zza = this;
                        this.zzb = zzbczVarZzh;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyb zzeybVar = this.zza;
                        zzeybVar.zzc.zzd.zzbD(this.zzb);
                    }
                });
                this.zzc.zzb.execute(new Runnable(this, zzbczVarZzh) { // from class: com.google.android.gms.internal.ads.zzeya
                    private final zzeyb zza;
                    private final zzbcz zzb;

                    {
                        this.zza = this;
                        this.zzb = zzbczVarZzh;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyb zzeybVar = this.zza;
                        zzeybVar.zzc.zze.zzbD(this.zzb);
                    }
                });
            }
            zzfbh.zza(zzbczVarZzh.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzdji zzdjiVar) {
        zzdji zzdjiVar2 = zzdjiVar;
        synchronized (this.zzc) {
            zzeyc.zzf(this.zzc, null);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfQ)).booleanValue()) {
                zzdfj zzdfjVarZzo = zzdjiVar2.zzo();
                zzdfjVarZzo.zza(this.zzc.zzd);
                zzdfjVarZzo.zzd(this.zzc.zze);
            }
            this.zza.zzb(zzdjiVar2);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfQ)).booleanValue()) {
                this.zzc.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzexx
                    private final zzeyb zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc.zzd.zzf();
                    }
                });
                this.zzc.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzexy
                    private final zzeyb zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc.zze.zzf();
                    }
                });
            }
        }
    }
}
