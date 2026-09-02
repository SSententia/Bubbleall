package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpg implements zzbpr<zzcml> {
    zzbpg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        JSONObject jSONObjectZzd;
        zzcml zzcmlVar2 = zzcmlVar;
        zzblt zzbltVarZzaq = zzcmlVar2.zzaq();
        if (zzbltVarZzaq == null || (jSONObjectZzd = zzbltVarZzaq.zzd()) == null) {
            zzcmlVar2.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcmlVar2.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
