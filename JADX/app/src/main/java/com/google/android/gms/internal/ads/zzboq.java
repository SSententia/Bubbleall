package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboq implements zzbpr<Object> {
    private final zzbor zza;

    public zzboq(zzbor zzborVar) {
        this.zza = zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zza == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZzk = null;
        if (map.containsKey("info")) {
            try {
                bundleZzk = com.google.android.gms.ads.internal.util.zzbx.zzk(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZzk == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundleZzk);
        }
    }
}
