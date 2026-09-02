package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzesd implements zzerx<Bundle> {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList<String> zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;

    public zzesd(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z6;
        this.zzm = str6;
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.zza);
        bundle2.putBoolean("coh", this.zzb);
        bundle2.putString("gl", this.zzc);
        bundle2.putBoolean("simulator", this.zzd);
        bundle2.putBoolean("is_latchsky", this.zze);
        bundle2.putBoolean("is_sidewinder", this.zzf);
        bundle2.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.zzh);
        }
        bundle2.putString("mv", this.zzi);
        bundle2.putString("submodel", this.zzm);
        Bundle bundleZza = zzfbd.zza(bundle2, "device");
        bundle2.putBundle("device", bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundleZza2 = zzfbd.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (TextUtils.isEmpty(this.zzj)) {
            return;
        }
        Bundle bundleZza3 = zzfbd.zza(bundleZza, "play_store");
        bundleZza.putBundle("play_store", bundleZza3);
        bundleZza3.putString("package_version", this.zzj);
    }
}
