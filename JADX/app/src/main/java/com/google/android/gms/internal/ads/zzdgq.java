package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgq implements zzgla<zzdbe> {
    private final zzdgp zza;
    private final zzgln<Set<zzdih<zzdbf>>> zzb;

    public zzdgq(zzdgp zzdgpVar, zzgln<Set<zzdih<zzdbf>>> zzglnVar) {
        this.zza = zzdgpVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdbe zzdbeVarZzp = this.zza.zzp(((zzgll) this.zzb).zzb());
        zzgli.zzb(zzdbeVarZzp);
        return zzdbeVarZzp;
    }
}
