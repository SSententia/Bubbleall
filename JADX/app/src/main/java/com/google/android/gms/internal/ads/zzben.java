package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzben extends zzbeq<zzbmr> {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzbep zzd;

    zzben(zzbep zzbepVar, View view, HashMap map, HashMap map2) {
        this.zzd = zzbepVar;
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    protected final /* bridge */ /* synthetic */ zzbmr zza() {
        zzbep.zzi(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzbih();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbmr zzb() throws RemoteException {
        zzbjl.zza(this.zza.getContext());
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgW)).booleanValue()) {
            return this.zzd.zzg.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbmq.zze(((zzbmu) zzcgx.zza(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzbem.zza)).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzcgw | NullPointerException e) {
            this.zzd.zzh = zzcar.zza(this.zza.getContext());
            this.zzd.zzh.zzd(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final /* bridge */ /* synthetic */ zzbmr zzc(zzbfx zzbfxVar) throws RemoteException {
        return zzbfxVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }
}
