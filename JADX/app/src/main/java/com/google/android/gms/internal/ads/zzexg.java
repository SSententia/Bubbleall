package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexg implements zzfln<zzeap, zzexj> {
    final /* synthetic */ zzexk zza;

    zzexg(zzexk zzexkVar) {
        this.zza = zzexkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    @NullableDecl
    public final /* bridge */ /* synthetic */ zzexj apply(@NullableDecl zzeap zzeapVar) {
        zzcgt.zzg("", zzeapVar);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzexk zzexkVar = this.zza;
        zzexkVar.zzd = new zzexj(null, zzexkVar.zze(), null);
        return this.zza.zzd;
    }
}
