package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwt implements zzdwh {
    private final long zza;
    private final zzelq zzb;

    zzdwt(long j, Context context, zzdwm zzdwmVar, zzcoj zzcojVar, String str) {
        this.zza = j;
        zzeye zzeyeVarZzq = zzcojVar.zzq();
        zzeyeVarZzq.zzd(context);
        zzeyeVarZzq.zzb(new zzbdl());
        zzeyeVarZzq.zzc(str);
        zzelq zzelqVarZza = zzeyeVarZzq.zza().zza();
        this.zzb = zzelqVarZza;
        zzelqVarZza.zzo(new zzdws(this, zzdwmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zza(zzbdg zzbdgVar) {
        this.zzb.zzl(zzbdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzb() {
        this.zzb.zzZ(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzc() {
        this.zzb.zzj();
    }
}
