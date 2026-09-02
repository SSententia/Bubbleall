package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexe<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    private final zzexo<RequestComponentT, AdT> zza;
    private RequestComponentT zzb;

    public zzexe(zzexo<RequestComponentT, AdT> zzexoVar) {
        this.zza = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzd() {
        return this.zzb;
    }

    public final synchronized zzfsm<AdT> zzb(zzexp zzexpVar, zzexn<RequestComponentT> zzexnVar, RequestComponentT requestcomponentt) {
        this.zzb = requestcomponentt;
        if (zzexpVar.zza == null) {
            return ((zzexd) this.zza).zzb(zzexpVar, zzexnVar, requestcomponentt);
        }
        zzcyj<AdT> zzcyjVarZzP = this.zzb.zzP();
        return zzcyjVarZzP.zzd(zzcyjVarZzP.zzb(zzfsd.zza(zzexpVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }
}
