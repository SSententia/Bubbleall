package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoh implements zzdbw {
    private final zzdmm zza;
    private final zzdmr zzb;

    public zzdoh(zzdmm zzdmmVar, zzdmr zzdmrVar) {
        this.zza = zzdmmVar;
        this.zzb = zzdmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (this.zza.zzU() == null) {
            return;
        }
        zzcml zzcmlVarZzT = this.zza.zzT();
        zzcml zzcmlVarZzR = this.zza.zzR();
        if (zzcmlVarZzT == null) {
            zzcmlVarZzT = zzcmlVarZzR != null ? zzcmlVarZzR : null;
        }
        if (!this.zzb.zzd() || zzcmlVarZzT == null) {
            return;
        }
        zzcmlVarZzT.zze("onSdkImpression", new ArrayMap());
    }
}
