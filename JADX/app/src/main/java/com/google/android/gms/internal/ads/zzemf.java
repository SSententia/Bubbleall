package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemf implements zzely<zzcxg> {
    private final zzfap zza;
    private final zzcoj zzb;
    private final Context zzc;
    private final zzelv zzd;
    private zzcxu zze;

    public zzemf(zzcoj zzcojVar, Context context, zzelv zzelvVar, zzfap zzfapVar) {
        this.zzb = zzcojVar;
        this.zzc = context;
        this.zzd = zzelvVar;
        this.zza = zzfapVar;
        zzfapVar.zzJ(zzelvVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super zzcxg> zzelxVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) && zzbdgVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzema
                private final zzemf zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzemb
                private final zzemf zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
            return false;
        }
        zzfbh.zzb(this.zzc, zzbdgVar.zzf);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzbdgVar.zzf) {
            this.zzb.zzz().zzc(true);
        }
        int i = ((zzelz) zzelwVar).zza;
        zzfap zzfapVar = this.zza;
        zzfapVar.zzr(zzbdgVar);
        zzfapVar.zzB(i);
        zzfar zzfarVarZzL = zzfapVar.zzL();
        if (zzfarVarZzL.zzn != null) {
            this.zzd.zzc().zzp(zzfarVarZzL.zzn);
        }
        zzdla zzdlaVarZzr = this.zzb.zzr();
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zzc);
        zzdamVar.zzf(zzfarVarZzL);
        zzdlaVarZzr.zzd(zzdamVar.zzh());
        zzdgn zzdgnVar = new zzdgn();
        zzdgnVar.zzt(this.zzd.zzc(), this.zzb.zze());
        zzdlaVarZzr.zze(zzdgnVar.zzC());
        zzdlaVarZzr.zzc(this.zzd.zzb());
        zzdlaVarZzr.zzb(new zzcve(null));
        zzdlb zzdlbVarZza = zzdlaVarZzr.zza();
        this.zzb.zzy().zza(1);
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        ScheduledExecutorService scheduledExecutorServiceZzf = this.zzb.zzf();
        zzcyj<zzcxn> zzcyjVarZzR = zzdlbVarZza.zzR();
        zzcxu zzcxuVar = new zzcxu(zzfsnVar, scheduledExecutorServiceZzf, zzcyjVarZzR.zzd(zzcyjVarZzR.zzc()));
        this.zze = zzcxuVar;
        zzcxuVar.zza(new zzeme(this, zzelxVar, zzdlbVarZza));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzcxu zzcxuVar = this.zze;
        return zzcxuVar != null && zzcxuVar.zzc();
    }

    final /* synthetic */ void zze() {
        this.zzd.zze().zzbD(zzfbm.zzd(6, null, null));
    }

    final /* synthetic */ void zzf() {
        this.zzd.zze().zzbD(zzfbm.zzd(4, null, null));
    }
}
