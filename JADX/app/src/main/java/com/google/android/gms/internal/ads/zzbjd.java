package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbjd<T> {
    private final int zza;
    private final String zzb;
    private final T zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzbjd(int i, int i2, String str, T t) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        zzbet.zzb().zza(this);
    }

    public static zzbjd<Boolean> zzg(int i, String str, Boolean bool) {
        return new zzbix(i, str, bool);
    }

    public static zzbjd<Integer> zzh(int i, String str, int i2) {
        return new zzbiy(1, str, Integer.valueOf(i2));
    }

    public static zzbjd<Long> zzi(int i, String str, long j) {
        return new zzbiz(1, str, Long.valueOf(j));
    }

    public static zzbjd<Float> zzj(int i, String str, float f) {
        return new zzbja(1, str, Float.valueOf(f));
    }

    public static zzbjd<String> zzk(int i, String str, String str2) {
        return new zzbjb(1, str, str2);
    }

    public static zzbjd<String> zzl(int i, String str) {
        zzbjd<String> zzbjdVarZzk = zzk(1, "gads:sdk_core_constants:experiment_id", null);
        zzbet.zzb().zzb(zzbjdVarZzk);
        return zzbjdVarZzk;
    }

    public abstract T zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, T t);

    protected abstract T zzc(JSONObject jSONObject);

    protected abstract T zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final T zzf() {
        return this.zzc;
    }

    public final int zzm() {
        return this.zza;
    }
}
