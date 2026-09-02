package com.android.billingclient.api;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcv {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final ProductDetails.PricingPhase zzf;

    zzcv(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("productId");
        this.zzb = jSONObject.optString("title");
        this.zzc = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.zzd = jSONObject.optString("description");
        this.zze = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.zzf = jSONObjectOptJSONObject == null ? null : new ProductDetails.PricingPhase(jSONObjectOptJSONObject);
    }
}
