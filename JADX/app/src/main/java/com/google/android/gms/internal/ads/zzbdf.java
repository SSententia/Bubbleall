package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdf extends RemoteCreator<zzbfo> {
    private zzcat zza;

    public zzbdf() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbfo getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbfo ? (zzbfo) iInterfaceQueryLocalInterface : new zzbfo(iBinder);
    }

    public final zzbfn zza(Context context, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) {
        zzbjl.zza(context);
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            try {
                IBinder iBinderZze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(iBinderZze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                zzcgt.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbfo) zzcgx.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzbde.zza)).zze(ObjectWrapper.wrap(context), zzbdlVar, str, zzbvgVar, 213806000, i);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface2 : new zzbfl(iBinderZze2);
        } catch (RemoteException | zzcgw | NullPointerException e2) {
            zzcat zzcatVarZza = zzcar.zza(context);
            this.zza = zzcatVarZza;
            zzcatVarZza.zzd(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
