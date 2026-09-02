package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdws extends zzbez {
    final /* synthetic */ zzdwm zza;
    final /* synthetic */ zzdwt zzb;

    zzdws(zzdwt zzdwtVar, zzdwm zzdwmVar) {
        this.zzb = zzdwtVar;
        this.zza = zzdwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb() throws RemoteException {
        this.zza.zzi(this.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i) throws RemoteException {
        this.zza.zzf(this.zzb.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zzbcz zzbczVar) throws RemoteException {
        this.zza.zzf(this.zzb.zza, zzbczVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzf() throws RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzg() throws RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzh() throws RemoteException {
        this.zza.zzh(this.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzi() {
    }
}
