package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdwk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdwk(String str, zzdwl zzdwlVar) {
        this.zzb = str;
    }

    static /* synthetic */ String zzf(zzdwk zzdwkVar) {
        String str = (String) zzbet.zzc().zzc(zzbjl.zzgM);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdwkVar.zza);
            jSONObject.put("eventCategory", zzdwkVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdwkVar.zzc);
            jSONObject.putOpt("errorCode", zzdwkVar.zzd);
            jSONObject.putOpt("rewardType", zzdwkVar.zze);
            jSONObject.putOpt("rewardAmount", zzdwkVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(string);
        sb.append(");");
        return sb.toString();
    }
}
