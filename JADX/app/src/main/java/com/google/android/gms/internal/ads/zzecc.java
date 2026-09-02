package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecc implements zzdhv {
    private final String zzc;
    private final zzffc zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzg().zzp();

    public zzecc(String str, zzffc zzffcVar) {
        this.zzc = str;
        this.zzd = zzffcVar;
    }

    private final zzffb zzf(String str) {
        String str2 = this.zze.zzC() ? "" : this.zzc;
        zzffb zzffbVarZza = zzffb.zza(str);
        zzffbVarZza.zzc("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime(), 10));
        zzffbVarZza.zzc("tid", str2);
        return zzffbVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zza(String str) {
        zzffc zzffcVar = this.zzd;
        zzffb zzffbVarZzf = zzf("adapter_init_started");
        zzffbVarZzf.zzc("ancn", str);
        zzffcVar.zza(zzffbVarZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzb(String str) {
        zzffc zzffcVar = this.zzd;
        zzffb zzffbVarZzf = zzf("adapter_init_finished");
        zzffbVarZzf.zzc("ancn", str);
        zzffcVar.zza(zzffbVarZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzc(String str, String str2) {
        zzffc zzffcVar = this.zzd;
        zzffb zzffbVarZzf = zzf("adapter_init_finished");
        zzffbVarZzf.zzc("ancn", str);
        zzffbVarZzf.zzc("rqe", str2);
        zzffcVar.zza(zzffbVarZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final synchronized void zzd() {
        if (this.zza) {
            return;
        }
        this.zzd.zza(zzf("init_started"));
        this.zza = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zza(zzf("init_finished"));
        this.zzb = true;
    }
}
