package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyc implements zzely<zzdji> {
    private final Context zza;
    private final Executor zzb;
    private final zzcoj zzc;
    private final zzeli zzd;
    private final zzezc zze;
    private zzbkg zzf;
    private final zzfap zzg;
    private zzfsm<zzdji> zzh;

    public zzeyc(Context context, Executor executor, zzcoj zzcojVar, zzeli zzeliVar, zzezc zzezcVar, zzfap zzfapVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcojVar;
        this.zzd = zzeliVar;
        this.zzg = zzfapVar;
        this.zze = zzezcVar;
    }

    static /* synthetic */ zzfsm zzf(zzeyc zzeycVar, zzfsm zzfsmVar) {
        zzeycVar.zzh = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super zzdji> zzelxVar) {
        zzdkf zzdkfVarZza;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzexw
                private final zzeyc zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzbdgVar.zzf) {
            this.zzc.zzz().zzc(true);
        }
        zzbdl zzbdlVar = ((zzexv) zzelwVar).zza;
        zzfap zzfapVar = this.zzg;
        zzfapVar.zzw(str);
        zzfapVar.zzt(zzbdlVar);
        zzfapVar.zzr(zzbdgVar);
        zzfar zzfarVarZzL = zzfapVar.zzL();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfQ)).booleanValue()) {
            zzdke zzdkeVarZzp = this.zzc.zzp();
            zzdam zzdamVar = new zzdam();
            zzdamVar.zze(this.zza);
            zzdamVar.zzf(zzfarVarZzL);
            zzdkeVarZzp.zzc(zzdamVar.zzh());
            zzdgn zzdgnVar = new zzdgn();
            zzdgnVar.zzB(this.zzd, this.zzb);
            zzdgnVar.zzt(this.zzd, this.zzb);
            zzdkeVarZzp.zzd(zzdgnVar.zzC());
            zzdkeVarZzp.zzb(new zzejq(this.zzf));
            zzdkfVarZza = zzdkeVarZzp.zza();
        } else {
            zzdgn zzdgnVar2 = new zzdgn();
            zzezc zzezcVar = this.zze;
            if (zzezcVar != null) {
                zzdgnVar2.zzp(zzezcVar, this.zzb);
                zzdgnVar2.zzq(this.zze, this.zzb);
                zzdgnVar2.zzr(this.zze, this.zzb);
            }
            zzdke zzdkeVarZzp2 = this.zzc.zzp();
            zzdam zzdamVar2 = new zzdam();
            zzdamVar2.zze(this.zza);
            zzdamVar2.zzf(zzfarVarZzL);
            zzdkeVarZzp2.zzc(zzdamVar2.zzh());
            zzdgnVar2.zzB(this.zzd, this.zzb);
            zzdgnVar2.zzp(this.zzd, this.zzb);
            zzdgnVar2.zzq(this.zzd, this.zzb);
            zzdgnVar2.zzr(this.zzd, this.zzb);
            zzdgnVar2.zzu(this.zzd, this.zzb);
            zzdgnVar2.zzv(this.zzd, this.zzb);
            zzdgnVar2.zzt(this.zzd, this.zzb);
            zzdgnVar2.zzz(this.zzd, this.zzb);
            zzdgnVar2.zzs(this.zzd, this.zzb);
            zzdkeVarZzp2.zzd(zzdgnVar2.zzC());
            zzdkeVarZzp2.zzb(new zzejq(this.zzf));
            zzdkfVarZza = zzdkeVarZzp2.zza();
        }
        zzcyj<zzdji> zzcyjVarZzP = zzdkfVarZza.zzP();
        zzfsm<zzdji> zzfsmVarZzd = zzcyjVarZzP.zzd(zzcyjVarZzP.zzc());
        this.zzh = zzfsmVarZzd;
        zzfsd.zzp(zzfsmVarZzd, new zzeyb(this, zzelxVar, zzdkfVarZza), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzfsm<zzdji> zzfsmVar = this.zzh;
        return (zzfsmVar == null || zzfsmVar.isDone()) ? false : true;
    }

    public final void zzg(zzbkg zzbkgVar) {
        this.zzf = zzbkgVar;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzbD(zzfbm.zzd(6, null, null));
    }
}
