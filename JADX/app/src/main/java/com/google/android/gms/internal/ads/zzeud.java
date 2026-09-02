package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeud implements zzerx {
    static final zzerx zza = new zzeud();

    private zzeud() {
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final void zzf(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
        } catch (JSONException unused) {
        }
    }
}
