package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzboj extends zzbnk {
    final /* synthetic */ zzbol zza;

    /* synthetic */ zzboj(zzbol zzbolVar, zzboi zzboiVar) {
        this.zza = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbnb zzbnbVar, String str) {
        if (this.zza.zzb == null) {
            return;
        }
        this.zza.zzb.onCustomClick(this.zza.zzf(zzbnbVar), str);
    }
}
