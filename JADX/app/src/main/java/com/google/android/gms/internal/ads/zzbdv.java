package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbdv extends zzbeq<zzbzq> {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbep zzb;

    zzbdv(zzbep zzbepVar, Activity activity) {
        this.zzb = zzbepVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbzq zza() {
        zzbep.zzi(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbzq zzb() throws RemoteException {
        zzbjl.zza(this.zza);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            return this.zzb.zzf.zza(this.zza);
        }
        try {
            return zzbzp.zzF(((zzbzt) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzbdu.zza)).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzcgw | NullPointerException e) {
            this.zzb.zzh = zzcar.zza(this.zza.getApplicationContext());
            this.zzb.zzh.zzd(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbzq zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
