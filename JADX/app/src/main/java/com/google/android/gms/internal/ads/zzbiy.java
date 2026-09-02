package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbiy extends zzbjd<Integer> {
    zzbiy(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Integer zza(Bundle bundle) {
        String strZze = zze();
        if (!bundle.containsKey(strZze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze) : new String("com.google.android.gms.ads.flag."))) {
            return zzf();
        }
        String strZze2 = zze();
        return Integer.valueOf(bundle.getInt(strZze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strZze2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(zze(), num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Integer zzc(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(zze(), zzf().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjd
    public final /* bridge */ /* synthetic */ Integer zzd(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zze(), zzf().intValue()));
    }
}
