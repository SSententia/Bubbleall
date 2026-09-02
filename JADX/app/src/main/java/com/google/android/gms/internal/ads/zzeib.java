package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeib implements zzeek<zzdrw, zzbxn, zzefy> {
    private final Context zza;
    private final zzdsb zzb;

    public zzeib(Context context, zzdsb zzdsbVar) {
        this.zza = context;
        this.zzb = zzdsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzbxn, zzefy> zzeefVar) throws zzfaw {
        try {
            zzeefVar.zzb.zzo(zzezzVar.zzV);
            if (zzfalVar.zza.zza.zzo.zza == 3) {
                zzeefVar.zzb.zzp(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzeefVar, null), (zzbvm) zzeefVar.zzc);
            } else {
                zzeefVar.zzb.zzl(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzeefVar, null), (zzbvm) zzeefVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdrw zzb(zzfal zzfalVar, zzezz zzezzVar, zzeef zzeefVar) throws zzehs, zzfaw {
        zzegh zzeghVar = new zzegh(zzezzVar, (zzbxn) zzeefVar.zzb, true);
        zzdrx zzdrxVarZzU = this.zzb.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdry(zzeghVar));
        zzeghVar.zzb(zzdrxVarZzU.zzd());
        ((zzefy) zzeefVar.zzc).zzc(zzdrxVarZzU.zzn());
        return zzdrxVarZzU.zzh();
    }
}
