package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexd<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    private RequestComponentT zza;

    @Override // com.google.android.gms.internal.ads.zzexo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }

    public final synchronized zzfsm<AdT> zzb(zzexp zzexpVar, zzexn<RequestComponentT> zzexnVar, RequestComponentT requestcomponentt) {
        zzcyj<AdT> zzcyjVarZzP;
        try {
            if (requestcomponentt != null) {
                this.zza = requestcomponentt;
            } else {
                this.zza = zzexnVar.zza(zzexpVar.zzb).zzf();
            }
            zzcyjVarZzP = this.zza.zzP();
        } catch (Throwable th) {
            throw th;
        }
        return zzcyjVarZzP.zzd(zzcyjVarZzP.zzc());
    }
}
