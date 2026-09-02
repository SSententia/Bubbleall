package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehc implements zzeek<zzdmh, zzbxn, zzefy> {
    private final Context zza;
    private final zzdlb zzb;
    private zzbvv zzc;
    private final zzcgz zzd;

    public zzehc(Context context, zzdlb zzdlbVar, zzcgz zzcgzVar) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzd = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzbxn, zzefy> zzeefVar) throws zzfaw {
        try {
            zzeefVar.zzb.zzo(zzezzVar.zzV);
            zzehb zzehbVar = null;
            if (this.zzd.zzc < ((Integer) zzbet.zzc().zzc(zzbjl.zzbd)).intValue()) {
                zzeefVar.zzb.zzn(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeha(this, zzeefVar, zzehbVar), (zzbvm) zzeefVar.zzc);
            } else {
                zzeefVar.zzb.zzr(zzezzVar.zzQ, zzezzVar.zzv.toString(), zzfalVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeha(this, zzeefVar, zzehbVar), (zzbvm) zzeefVar.zzc, zzfalVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfaw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdmh zzb(zzfal zzfalVar, zzezz zzezzVar, zzeef zzeefVar) throws zzehs, zzfaw {
        if (!zzfalVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzehs(2, "Unified must be used for RTB.");
        }
        zzdmm zzdmmVarZzaa = zzdmm.zzaa(this.zzc);
        if (!zzfalVar.zza.zza.zzg.contains(Integer.toString(zzdmmVarZzaa.zzv()))) {
            throw new zzehs(1, "No corresponding native ad listener");
        }
        zzdmo zzdmoVarZzU = this.zzb.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdmy(zzdmmVarZzaa), new zzdol(null, null, this.zzc, null));
        ((zzefy) zzeefVar.zzc).zzc(zzdmoVarZzU.zzg());
        return zzdmoVarZzU.zzh();
    }
}
