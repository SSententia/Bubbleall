package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhr extends zzbrr {
    final /* synthetic */ zzbhs zza;

    /* synthetic */ zzbhr(zzbhs zzbhsVar, zzbhp zzbhpVar) {
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzb(List<zzbrl> list) throws RemoteException {
        zzbhs.zzb(this.zza, false);
        zzbhs.zzc(this.zza, true);
        zzbhs zzbhsVar = this.zza;
        InitializationStatus initializationStatusZzx = zzbhs.zzx(list);
        ArrayList arrayList = zzbhs.zze().zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusZzx);
        }
        zzbhs.zze().zza.clear();
    }
}
