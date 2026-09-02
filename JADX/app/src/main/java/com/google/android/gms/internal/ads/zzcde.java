package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcde {
    public static final zzccs zza(Context context, String str, zzbvg zzbvgVar) {
        try {
            IBinder iBinderZze = ((zzccw) zzcgx.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcdd.zza)).zze(ObjectWrapper.wrap(context), str, zzbvgVar, 213806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzccs ? (zzccs) iInterfaceQueryLocalInterface : new zzccq(iBinderZze);
        } catch (RemoteException | zzcgw e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
