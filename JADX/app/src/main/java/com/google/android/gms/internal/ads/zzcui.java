package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcui {
    private final zzffc zza;
    private final zzdvi zzb;
    private final zzfal zzc;

    public zzcui(zzdvi zzdviVar, zzfal zzfalVar, zzffc zzffcVar) {
        this.zza = zzffcVar;
        this.zzb = zzdviVar;
        this.zzc = zzfalVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "h";
        }
        if (i2 == 1) {
            return "bb";
        }
        if (i2 == 2) {
            return "cc";
        }
        if (i2 != 3) {
            return i2 != 4 ? "u" : "ac";
        }
        return "cb";
    }

    public final void zza(long j, int i) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffc zzffcVar = this.zza;
            zzffb zzffbVarZza = zzffb.zza("ad_closed");
            zzffbVarZza.zzh(this.zzc.zzb.zzb);
            zzffbVarZza.zzc("show_time", String.valueOf(j));
            zzffbVarZza.zzc("ad_format", "app_open_ad");
            zzffbVarZza.zzc("acr", zzb(i));
            zzffcVar.zza(zzffbVarZza);
            return;
        }
        zzdvh zzdvhVarZzd = this.zzb.zzd();
        zzdvhVarZzd.zzb(this.zzc.zzb.zzb);
        zzdvhVarZzd.zzd("action", "ad_closed");
        zzdvhVarZzd.zzd("show_time", String.valueOf(j));
        zzdvhVarZzd.zzd("ad_format", "app_open_ad");
        zzdvhVarZzd.zzd("acr", zzb(i));
        zzdvhVarZzd.zze();
    }
}
