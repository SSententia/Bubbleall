package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpf implements zzbpr<zzcml> {
    zzbpf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        JSONObject jSONObjectZzc;
        zzcml zzcmlVar2 = zzcmlVar;
        zzblt zzbltVarZzaq = zzcmlVar2.zzaq();
        if (zzbltVarZzaq == null || (jSONObjectZzc = zzbltVarZzaq.zzc()) == null) {
            zzcmlVar2.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcmlVar2.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
