package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcc {
    public static zzcb zza(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length != 1) {
            if (strArrSplit.length == 2) {
                strConcat = strArrSplit[0];
                str2 = strArrSplit[1];
            }
            return null;
        }
        strConcat = String.valueOf(context.getPackageName()).concat("_preferences");
        str2 = strArrSplit[0];
        if (!TextUtils.isEmpty(strConcat) && !TextUtils.isEmpty(str2)) {
            return new zzcb(strConcat, str2);
        }
        return null;
    }

    public static void zza(Context context, Set<String> set) {
        zzce zzceVar = new zzce(context);
        for (String str : set) {
            zzcb zzcbVarZza = zza(context, str);
            if (zzcbVarZza == null) {
                String strValueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "clearKeys: unable to process key: ".concat(strValueOf) : new String("clearKeys: unable to process key: "));
            } else {
                zzceVar.zza(zzcbVarZza.zza).remove(zzcbVarZza.zzb);
            }
        }
        zzceVar.zza();
    }
}
