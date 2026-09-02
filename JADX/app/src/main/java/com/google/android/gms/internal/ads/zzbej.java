package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbej extends zzbeq<zzbge> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbep zzb;

    zzbej(zzbep zzbepVar, Context context) {
        this.zzb = zzbepVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbge zza() {
        zzbep.zzi(this.zza, "mobile_ads_settings");
        return new zzbif();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzb() throws RemoteException {
        zzbjl.zza(this.zza);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder iBinderZze = ((zzbgf) zzcgx.zza(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzbei.zza)).zze(ObjectWrapper.wrap(this.zza), 213806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzbge ? (zzbge) iInterfaceQueryLocalInterface : new zzbgc(iBinderZze);
        } catch (RemoteException | zzcgw | NullPointerException e) {
            this.zzb.zzh = zzcar.zza(this.zza);
            this.zzb.zzh.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbge zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzh(ObjectWrapper.wrap(this.zza), 213806000);
    }
}
