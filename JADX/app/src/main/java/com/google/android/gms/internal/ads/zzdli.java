package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdli implements zzbpr<Object> {
    private final WeakReference<zzdlm> zza;

    /* synthetic */ zzdli(zzdlm zzdlmVar, zzdll zzdllVar) {
        this.zza = new WeakReference<>(zzdlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        zzdlm zzdlmVar = this.zza.get();
        if (zzdlmVar != null && "_ac".equals(map.get("eventName"))) {
            zzdlmVar.zzh.onAdClicked();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzhb)).booleanValue()) {
                zzdlmVar.zzi.zzb();
            }
        }
    }
}
