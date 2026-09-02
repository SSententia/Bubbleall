package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbrg implements zzfrk<zzbre, ParcelFileDescriptor> {
    final /* synthetic */ zzbqy zza;

    zzbrg(zzbrk zzbrkVar, zzbqy zzbqyVar) {
        this.zza = zzbqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final /* bridge */ /* synthetic */ zzfsm<ParcelFileDescriptor> zza(zzbre zzbreVar) throws Exception {
        zzchl zzchlVar = new zzchl();
        zzbreVar.zze(this.zza, new zzbrf(this, zzchlVar));
        return zzchlVar;
    }
}
