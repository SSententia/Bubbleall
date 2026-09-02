package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzewi implements zzfrz<zzcvh> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzcwe zzb;
    final /* synthetic */ zzewj zzc;

    zzewi(zzewj zzewjVar, zzelx zzelxVar, zzcwe zzcweVar) {
        this.zzc = zzewjVar;
        this.zza = zzelxVar;
        this.zzb = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        final zzbcz zzbczVarZzh = this.zzb.zzY().zzh(th);
        synchronized (this.zzc) {
            zzewj.zzh(this.zzc, null);
            this.zzb.zzX().zzbD(zzbczVarZzh);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfO)).booleanValue()) {
                this.zzc.zzb.execute(new Runnable(this, zzbczVarZzh) { // from class: com.google.android.gms.internal.ads.zzewh
                    private final zzewi zza;
                    private final zzbcz zzb;

                    {
                        this.zza = this;
                        this.zzb = zzbczVarZzh;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzewi zzewiVar = this.zza;
                        zzewiVar.zzc.zzd.zzbD(this.zzb);
                    }
                });
            }
            this.zzc.zzh.zzd(60);
            zzfbh.zza(zzbczVarZzh.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcvh zzcvhVar) {
        zzcvh zzcvhVar2 = zzcvhVar;
        synchronized (this.zzc) {
            zzewj.zzh(this.zzc, null);
            this.zzc.zzf.removeAllViews();
            if (zzcvhVar2.zza() != null) {
                ViewParent parent = zzcvhVar2.zza().getParent();
                if (parent instanceof ViewGroup) {
                    String strZze = zzcvhVar2.zzm() != null ? zzcvhVar2.zzm().zze() : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(strZze);
                    sb.append(" already has a parent view. Removing its old parent.");
                    com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                    ((ViewGroup) parent).removeView(zzcvhVar2.zza());
                }
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfO)).booleanValue()) {
                zzdfj zzdfjVarZzo = zzcvhVar2.zzo();
                zzdfjVarZzo.zza(this.zzc.zzd);
                zzdfjVarZzo.zzb(this.zzc.zze);
            }
            this.zzc.zzf.addView(zzcvhVar2.zza());
            this.zza.zzb(zzcvhVar2);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfO)).booleanValue()) {
                Executor executor = this.zzc.zzb;
                zzeli zzeliVar = this.zzc.zzd;
                zzeliVar.getClass();
                executor.execute(zzewg.zza(zzeliVar));
            }
            this.zzc.zzh.zzd(zzcvhVar2.zzg());
        }
    }
}
