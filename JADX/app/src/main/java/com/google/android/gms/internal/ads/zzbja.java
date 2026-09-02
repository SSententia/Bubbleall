package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbja extends zzbjd<Float> {
    zzbja(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zza(Bundle bundle) {
        String strZze = zze();
        if (!bundle.containsKey(strZze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze) : new String("com.google.android.gms.ads.flag."))) {
            return zzf();
        }
        String strZze2 = zze();
        return Float.valueOf(bundle.getFloat(strZze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(zze(), f.floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zzc(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zze(), zzf().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Float zzd(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zze(), zzf().floatValue()));
    }
}
