package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeso implements zzerx<JSONObject> {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;

    public zzeso(AdvertisingIdClient.Info info, String str) {
        this.zza = info;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(jSONObject, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                jSONObjectZzg.put("pdid", this.zzb);
                jSONObjectZzg.put("pdidtype", "ssaid");
            } else {
                jSONObjectZzg.put("rdid", this.zza.getId());
                jSONObjectZzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                jSONObjectZzg.put("idtype", "adid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
