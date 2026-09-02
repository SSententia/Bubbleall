package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewj implements zzely<zzcvh> {
    private final Context zza;
    private final Executor zzb;
    private final zzcoj zzc;
    private final zzeli zzd;
    private final zzelm zze;
    private final ViewGroup zzf;
    private zzbkg zzg;
    private final zzddr zzh;
    private final zzfap zzi;
    private zzfsm<zzcvh> zzj;

    public zzewj(Context context, Executor executor, zzbdl zzbdlVar, zzcoj zzcojVar, zzeli zzeliVar, zzelm zzelmVar, zzfap zzfapVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcojVar;
        this.zzd = zzeliVar;
        this.zze = zzelmVar;
        this.zzi = zzfapVar;
        this.zzh = zzcojVar.zzh();
        this.zzf = new FrameLayout(context);
        zzfapVar.zzt(zzbdlVar);
    }

    static /* synthetic */ zzfsm zzh(zzewj zzewjVar, zzfsm zzfsmVar) {
        zzewjVar.zzj = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super zzcvh> zzelxVar) throws RemoteException {
        zzcwe zzcweVarZza;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzewf
                private final zzewj zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp();
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
        zzfap zzfapVar = this.zzi;
        zzfapVar.zzw(str);
        zzfapVar.zzr(zzbdgVar);
        zzfar zzfarVarZzL = zzfapVar.zzL();
        if (zzblc.zzc.zze().booleanValue() && this.zzi.zzv().zzk) {
            zzeli zzeliVar = this.zzd;
            if (zzeliVar != null) {
                zzeliVar.zzbD(zzfbm.zzd(7, null, null));
            }
            return false;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfO)).booleanValue()) {
            zzcwd zzcwdVarZzk = this.zzc.zzk();
            zzdam zzdamVar = new zzdam();
            zzdamVar.zze(this.zza);
            zzdamVar.zzf(zzfarVarZzL);
            zzcwdVarZzk.zzi(zzdamVar.zzh());
            zzdgn zzdgnVar = new zzdgn();
            zzdgnVar.zzB(this.zzd, this.zzb);
            zzdgnVar.zzt(this.zzd, this.zzb);
            zzcwdVarZzk.zzj(zzdgnVar.zzC());
            zzcwdVarZzk.zze(new zzejq(this.zzg));
            zzcwdVarZzk.zzb(new zzdkw(zzdmx.zza, null));
            zzcwdVarZzk.zzd(new zzcxa(this.zzh));
            zzcwdVarZzk.zzc(new zzcve(this.zzf));
            zzcweVarZza = zzcwdVarZzk.zza();
        } else {
            zzcwd zzcwdVarZzk2 = this.zzc.zzk();
            zzdam zzdamVar2 = new zzdam();
            zzdamVar2.zze(this.zza);
            zzdamVar2.zzf(zzfarVarZzL);
            zzcwdVarZzk2.zzi(zzdamVar2.zzh());
            zzdgn zzdgnVar2 = new zzdgn();
            zzdgnVar2.zzB(this.zzd, this.zzb);
            zzdgnVar2.zzu(this.zzd, this.zzb);
            zzdgnVar2.zzu(this.zze, this.zzb);
            zzdgnVar2.zzv(this.zzd, this.zzb);
            zzdgnVar2.zzw(this.zzd, this.zzb);
            zzdgnVar2.zzp(this.zzd, this.zzb);
            zzdgnVar2.zzq(this.zzd, this.zzb);
            zzdgnVar2.zzr(this.zzd, this.zzb);
            zzdgnVar2.zzt(this.zzd, this.zzb);
            zzdgnVar2.zzz(this.zzd, this.zzb);
            zzcwdVarZzk2.zzj(zzdgnVar2.zzC());
            zzcwdVarZzk2.zze(new zzejq(this.zzg));
            zzcwdVarZzk2.zzb(new zzdkw(zzdmx.zza, null));
            zzcwdVarZzk2.zzd(new zzcxa(this.zzh));
            zzcwdVarZzk2.zzc(new zzcve(this.zzf));
            zzcweVarZza = zzcwdVarZzk2.zza();
        }
        zzcyj<zzcvh> zzcyjVarZzY = zzcweVarZza.zzY();
        zzfsm<zzcvh> zzfsmVarZzd = zzcyjVarZzY.zzd(zzcyjVarZzY.zzc());
        this.zzj = zzfsmVarZzd;
        zzfsd.zzp(zzfsmVarZzd, new zzewi(this, zzelxVar, zzcweVarZza), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzfsm<zzcvh> zzfsmVar = this.zzj;
        return (zzfsmVar == null || zzfsmVar.isDone()) ? false : true;
    }

    public final ViewGroup zzi() {
        return this.zzf;
    }

    public final void zzj(zzbkg zzbkgVar) {
        this.zzg = zzbkgVar;
    }

    public final void zzk(zzbex zzbexVar) {
        this.zze.zza(zzbexVar);
    }

    public final zzfap zzl() {
        return this.zzi;
    }

    public final boolean zzm() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzZ(view, view.getContext());
    }

    public final void zzn(zzdds zzddsVar) {
        this.zzh.zzi(zzddsVar, this.zzb);
    }

    public final void zzo() {
        this.zzh.zzd(60);
    }

    final /* synthetic */ void zzp() {
        this.zzd.zzbD(zzfbm.zzd(6, null, null));
    }
}
