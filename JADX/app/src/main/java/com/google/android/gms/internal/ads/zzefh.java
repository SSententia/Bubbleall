package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefh implements zzeek<zzcvh, zzfbi, zzefy> {
    private final Context zza;
    private final zzcwe zzb;
    private final Executor zzc;

    public zzefh(Context context, zzcwe zzcweVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcweVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw {
        zzbdl zzbdlVar;
        zzbdl zzbdlVar2 = zzfalVar.zza.zza.zze;
        if (zzbdlVar2.zzn) {
            zzbdlVar = new zzbdl(this.zza, com.google.android.gms.ads.zza.zzb(zzbdlVar2.zze, zzbdlVar2.zzb));
        } else {
            zzbdlVar = (((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() && zzezzVar.zzad) ? new zzbdl(this.zza, com.google.android.gms.ads.zza.zzc(zzbdlVar2.zze, zzbdlVar2.zzb)) : zzfav.zzb(this.zza, zzezzVar.zzu);
        }
        zzbdl zzbdlVar3 = zzbdlVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() && zzezzVar.zzad) {
            zzeefVar.zzb.zzb(this.zza, zzbdlVar3, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), (zzbvm) zzeefVar.zzc);
        } else {
            zzeefVar.zzb.zzg(this.zza, zzbdlVar3, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), (zzbvm) zzeefVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzcvh zzb(zzfal zzfalVar, final zzezz zzezzVar, zzeef zzeefVar) throws zzehs, zzfaw {
        final View viewZza;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() && zzezzVar.zzad) {
            zzbvp zzbvpVarZzc = ((zzfbi) zzeefVar.zzb).zzc();
            if (zzbvpVarZzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfaw(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbvpVarZzc.zze());
                boolean zZzf = zzbvpVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfaw(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, viewZza, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzefg
                            private final zzefh zza;
                            private final View zzb;
                            private final zzezz zzc;

                            {
                                this.zza = this;
                                this.zzb = viewZza;
                                this.zzc = zzezzVar;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfrk
                            public final zzfsm zza(Object obj) {
                                return this.zza.zzc(this.zzb, this.zzc, obj);
                            }
                        }, zzchg.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfaw(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfaw(e2);
            }
        } else {
            viewZza = ((zzfbi) zzeefVar.zzb).zza();
        }
        zzcvi zzcviVarZzaa = this.zzb.zzaa(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzcvo(viewZza, null, zzeff.zzb((zzfbi) zzeefVar.zzb), zzezzVar.zzu.get(0)));
        zzcviVarZzaa.zzj().zza(viewZza);
        zzcviVarZzaa.zza().zzi(new zzcsw((zzfbi) zzeefVar.zzb), this.zzc);
        ((zzefy) zzeefVar.zzc).zzc(zzcviVarZzaa.zzf());
        return zzcviVarZzaa.zzh();
    }

    final /* synthetic */ zzfsm zzc(View view, zzezz zzezzVar, Object obj) throws Exception {
        return zzfsd.zza(zzcwv.zza(this.zza, view, zzezzVar));
    }
}
