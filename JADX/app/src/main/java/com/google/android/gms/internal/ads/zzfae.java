package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfae {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfae(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
        this.zzd = jSONObjectZzc;
        this.zza = jSONObjectZzc.optString("ad_html", null);
        this.zzb = jSONObjectZzc.optString("ad_base_url", null);
        this.zzc = jSONObjectZzc.optJSONObject("ad_json");
    }
}
