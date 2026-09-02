package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaj implements zzi {
    private final Application zza;
    private final zzal zzb;
    private final Executor zzc;

    public zzaj(Application application, zzal zzalVar, Executor executor) {
        this.zza = application;
        this.zzb = zzalVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final boolean zza(String str, JSONObject jSONObject) {
        str.hashCode();
        if (str.equals("clear")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                String strValueOf = String.valueOf(jSONObject.toString());
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Action[clear]: wrong args.".concat(strValueOf) : new String("Action[clear]: wrong args."));
            } else {
                HashSet hashSet = new HashSet();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (TextUtils.isEmpty(strOptString)) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Action[clear]: empty key at index: ");
                        sb.append(i);
                        Log.d("UserMessagingPlatform", sb.toString());
                    } else {
                        hashSet.add(strOptString);
                    }
                }
                zzcc.zza(this.zza, hashSet);
            }
            return true;
        }
        if (!str.equals("write")) {
            return false;
        }
        zzce zzceVar = new zzce(this.zza);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            String strValueOf2 = String.valueOf(objOpt);
            StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 23 + String.valueOf(strValueOf2).length());
            sb2.append("Writing to storage: [");
            sb2.append(next);
            sb2.append("] ");
            sb2.append(strValueOf2);
            Log.d("UserMessagingPlatform", sb2.toString());
            if (zzceVar.zza(next, objOpt)) {
                this.zzb.zzd().add(next);
            } else {
                String strValueOf3 = String.valueOf(next);
                Log.d("UserMessagingPlatform", strValueOf3.length() != 0 ? "Failed writing key: ".concat(strValueOf3) : new String("Failed writing key: "));
            }
        }
        this.zzb.zze();
        zzceVar.zza();
        return true;
    }
}
