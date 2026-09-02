package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdak;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzevf<AppOpenAd extends zzcxg, AppOpenRequestComponent extends zzcup<AppOpenAd>, AppOpenRequestComponentBuilder extends zzdak<AppOpenRequestComponent>> implements zzely<AppOpenAd> {
    protected final zzcoj zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzevv zzd;
    private final zzexo<AppOpenRequestComponent, AppOpenAd> zze;
    private final ViewGroup zzf;
    private final zzfap zzg;

    @Nullable
    private zzfsm<AppOpenAd> zzh;

    protected zzevf(Context context, Executor executor, zzcoj zzcojVar, zzexo<AppOpenRequestComponent, AppOpenAd> zzexoVar, zzevv zzevvVar, zzfap zzfapVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcojVar;
        this.zze = zzexoVar;
        this.zzd = zzevvVar;
        this.zzg = zzfapVar;
        this.zzf = new FrameLayout(context);
    }

    static /* synthetic */ zzfsm zzg(zzevf zzevfVar, zzfsm zzfsmVar) {
        zzevfVar.zzh = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized AppOpenRequestComponentBuilder zzk(zzexm zzexmVar) {
        zzevd zzevdVar = (zzevd) zzexmVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfP)).booleanValue()) {
            zzcve zzcveVar = new zzcve(this.zzf);
            zzdam zzdamVar = new zzdam();
            zzdamVar.zze(this.zzb);
            zzdamVar.zzf(zzevdVar.zza);
            zzdao zzdaoVarZzh = zzdamVar.zzh();
            zzdgn zzdgnVar = new zzdgn();
            zzdgnVar.zzs(this.zzd, this.zzc);
            zzdgnVar.zzv(this.zzd, this.zzc);
            return (AppOpenRequestComponentBuilder) zzc(zzcveVar, zzdaoVarZzh, zzdgnVar.zzC());
        }
        zzevv zzevvVarZzg = zzevv.zzg(this.zzd);
        zzdgn zzdgnVar2 = new zzdgn();
        zzdgnVar2.zzr(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzx(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzy(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzz(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzs(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzv(zzevvVarZzg, this.zzc);
        zzdgnVar2.zzA(zzevvVarZzg);
        zzcve zzcveVar2 = new zzcve(this.zzf);
        zzdam zzdamVar2 = new zzdam();
        zzdamVar2.zze(this.zzb);
        zzdamVar2.zzf(zzevdVar.zza);
        return (AppOpenRequestComponentBuilder) zzc(zzcveVar2, zzdamVar2.zzh(), zzdgnVar2.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final synchronized boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super AppOpenAd> zzelxVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeuz
                private final zzevf zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            });
            return false;
        }
        if (this.zzh != null) {
            return false;
        }
        zzfbh.zzb(this.zzb, zzbdgVar.zzf);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzbdgVar.zzf) {
            this.zza.zzz().zzc(true);
        }
        zzfap zzfapVar = this.zzg;
        zzfapVar.zzw(str);
        zzfapVar.zzt(zzbdl.zzd());
        zzfapVar.zzr(zzbdgVar);
        zzfar zzfarVarZzL = zzfapVar.zzL();
        zzevd zzevdVar = new zzevd(null);
        zzevdVar.zza = zzfarVarZzL;
        zzfsm<AppOpenAd> zzfsmVarZzc = this.zze.zzc(new zzexp(zzevdVar, null), new zzexn(this) { // from class: com.google.android.gms.internal.ads.zzeva
            private final zzevf zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzexn
            public final zzdak zza(zzexm zzexmVar) {
                return this.zza.zzk(zzexmVar);
            }
        }, null);
        this.zzh = zzfsmVarZzc;
        zzfsd.zzp(zzfsmVarZzc, new zzevc(this, zzelxVar, zzevdVar), this.zzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzfsm<AppOpenAd> zzfsmVar = this.zzh;
        return (zzfsmVar == null || zzfsmVar.isDone()) ? false : true;
    }

    protected abstract AppOpenRequestComponentBuilder zzc(zzcve zzcveVar, zzdao zzdaoVar, zzdgp zzdgpVar);

    public final void zzi(zzbdr zzbdrVar) {
        this.zzg.zzF(zzbdrVar);
    }

    final /* synthetic */ void zzj() {
        this.zzd.zzbD(zzfbm.zzd(6, null, null));
    }
}
