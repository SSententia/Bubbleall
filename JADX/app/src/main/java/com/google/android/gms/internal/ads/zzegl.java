package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzegl extends zzbxd {
    private final zzeef<zzbxn, zzefy> zza;

    /* synthetic */ zzegl(zzegn zzegnVar, zzeef zzeefVar, zzegm zzegmVar) {
        this.zza = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zze() throws RemoteException {
        ((zzefy) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zzf(String str) throws RemoteException {
        ((zzefy) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        ((zzefy) this.zza.zzc).zzx(zzbczVar);
    }
}
