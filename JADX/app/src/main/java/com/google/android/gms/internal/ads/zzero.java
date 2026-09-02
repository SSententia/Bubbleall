package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzero implements zzerx<Bundle> {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    public zzero(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.zzc);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzbet.zzc().zzc(zzbjl.zzcg));
        bundle2.putInt("target_api", this.zze);
        bundle2.putInt("dv", this.zzf);
        bundle2.putInt("lv", this.zzg);
        Bundle bundleZza = zzfbd.zza(bundle2, "sdk_env");
        bundleZza.putBoolean("mf", zzbky.zza.zze().booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle2.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfbd.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "407425155");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
