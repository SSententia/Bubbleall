package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzce {
    private final Context zza;
    private final Map<String, SharedPreferences.Editor> zzb = new HashMap();

    public zzce(Context context) {
        this.zza = context;
    }

    public final boolean zza(String str, Object obj) {
        zzcb zzcbVarZza = zzcc.zza(this.zza, str);
        if (zzcbVarZza == null) {
            return false;
        }
        SharedPreferences.Editor editorZza = zza(zzcbVarZza.zza);
        if (obj instanceof Integer) {
            editorZza.putInt(zzcbVarZza.zzb, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorZza.putLong(zzcbVarZza.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            editorZza.putFloat(zzcbVarZza.zzb, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            editorZza.putFloat(zzcbVarZza.zzb, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            editorZza.putBoolean(zzcbVarZza.zzb, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        editorZza.putString(zzcbVarZza.zzb, (String) obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor zza(String str) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, this.zza.getSharedPreferences(str, 0).edit());
        }
        return this.zzb.get(str);
    }

    public final void zza() {
        Iterator<SharedPreferences.Editor> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
    }
}
