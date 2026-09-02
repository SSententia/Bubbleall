package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgn implements MuteThisAdReason {
    private final String zza;
    private final zzbgm zzb;

    public zzbgn(zzbgm zzbgmVar) {
        String strZze;
        this.zzb = zzbgmVar;
        try {
            strZze = zzbgmVar.zze();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            strZze = null;
        }
        this.zza = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzbgm zza() {
        return this.zzb;
    }
}
