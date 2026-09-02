package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezm implements zzely<zzdrw> {
    private final Context zza;
    private final Executor zzb;
    private final zzcoj zzc;
    private final zzezc zzd;
    private final zzexo<zzdsb, zzdrw> zze;
    private final zzfam zzf;
    private final zzfap zzg;
    private zzfsm<zzdrw> zzh;

    public zzezm(Context context, Executor executor, zzcoj zzcojVar, zzexo<zzdsb, zzdrw> zzexoVar, zzezc zzezcVar, zzfap zzfapVar, zzfam zzfamVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcojVar;
        this.zze = zzexoVar;
        this.zzd = zzezcVar;
        this.zzg = zzfapVar;
        this.zzf = zzfamVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzdsa zzh(zzexm zzexmVar) {
        zzezl zzezlVar = (zzezl) zzexmVar;
        zzdsa zzdsaVarZzs = this.zzc.zzs();
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zza);
        zzdamVar.zzf(zzezlVar.zza);
        String str = zzezlVar.zzb;
        zzdamVar.zzi(this.zzf);
        zzdsaVarZzs.zzb(zzdamVar.zzh());
        zzdsaVarZzs.zzc(new zzdgn().zzC());
        return zzdsaVarZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super zzdrw> zzelxVar) throws RemoteException {
        zzccg zzccgVar = new zzccg(zzbdgVar, str);
        boolean z = false;
        if (zzccgVar.zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzezf
                private final zzezm zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
        } else {
            zzfsm<zzdrw> zzfsmVar = this.zzh;
            if (zzfsmVar == null || zzfsmVar.isDone()) {
                zzfbh.zzb(this.zza, zzccgVar.zza.zzf);
                z = true;
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzccgVar.zza.zzf) {
                    this.zzc.zzz().zzc(true);
                }
                zzfap zzfapVar = this.zzg;
                zzfapVar.zzw(zzccgVar.zzb);
                zzfapVar.zzt(zzbdl.zzc());
                zzfapVar.zzr(zzccgVar.zza);
                zzfar zzfarVarZzL = zzfapVar.zzL();
                zzezl zzezlVar = new zzezl(null);
                zzezlVar.zza = zzfarVarZzL;
                zzezlVar.zzb = null;
                zzfsm<zzdrw> zzfsmVarZzc = this.zze.zzc(new zzexp(zzezlVar, null), new zzexn(this) { // from class: com.google.android.gms.internal.ads.zzezg
                    private final zzezm zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzexn
                    public final zzdak zza(zzexm zzexmVar) {
                        return this.zza.zzh(zzexmVar);
                    }
                }, null);
                this.zzh = zzfsmVarZzc;
                zzfsd.zzp(zzfsmVarZzc, new zzezj(this, zzelxVar, zzezlVar), this.zzb);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzg() {
        this.zzd.zzbD(zzfbm.zzd(6, null, null));
    }

    final void zzi(int i) {
        this.zzg.zzz().zzb(i);
    }
}
