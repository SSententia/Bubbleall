package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbjb extends zzbjd<String> {
    zzbjb(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zza(Bundle bundle) {
        String strZze = zze();
        if (!bundle.containsKey(strZze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze) : new String("com.google.android.gms.ads.flag."))) {
            return zzf();
        }
        String strZze2 = zze();
        return bundle.getString(strZze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, String str) {
        editor.putString(zze(), str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zzc(JSONObject jSONObject) {
        return jSONObject.optString(zze(), zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ String zzd(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zze(), zzf());
    }
}
