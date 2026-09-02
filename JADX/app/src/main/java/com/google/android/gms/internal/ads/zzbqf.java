package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media2.session.MediaConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbqf implements zzbpr<Object> {
    private final Object zza = new Object();
    private final Map<String, zzbqe> zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        String strConcat;
        String str = map.get(MediaConstants.MEDIA_URI_QUERY_ID);
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(str4);
            strConcat = strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n");
        }
        synchronized (this.zza) {
            zzbqe zzbqeVarRemove = this.zzb.remove(str);
            if (zzbqeVarRemove == null) {
                String strValueOf2 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.zze.zzi(strValueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String strValueOf3 = String.valueOf(str3);
                String strValueOf4 = String.valueOf(strConcat);
                zzbqeVarRemove.zzb(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            } else {
                if (str5 == null) {
                    zzbqeVarRemove.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String strValueOf5 = String.valueOf(jSONObject.toString(2));
                        com.google.android.gms.ads.internal.util.zze.zza(strValueOf5.length() != 0 ? "Result GMSG: ".concat(strValueOf5) : new String("Result GMSG: "));
                    }
                    zzbqeVarRemove.zza(jSONObject);
                } catch (JSONException e) {
                    zzbqeVarRemove.zzb(e.getMessage());
                }
            }
        }
    }

    public final void zzb(String str, zzbqe zzbqeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqeVar);
        }
    }

    public final <EngineT extends zzbsw> zzfsm<JSONObject> zzc(EngineT enginet, String str, JSONObject jSONObject) {
        zzchl zzchlVar = new zzchl();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbqd(this, zzchlVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MediaConstants.MEDIA_URI_QUERY_ID, string);
            jSONObject2.put("args", jSONObject);
            enginet.zzr(str, jSONObject2);
        } catch (Exception e) {
            zzchlVar.zzd(e);
        }
        return zzchlVar;
    }
}
