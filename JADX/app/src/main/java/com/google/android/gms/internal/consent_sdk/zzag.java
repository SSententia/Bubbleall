package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzag extends zzc {
    private zzct<Application> zza;
    private zzct<zzal> zzb;
    private zzct<zzab> zzc;
    private zzct<zzau> zzd;
    private zzct<zzaz> zze;
    private zzct<zzb> zzf;
    private zzct<zzn> zzg;
    private zzct<zze> zzh;
    private zzct<zzaj> zzi;
    private zzct<zzz> zzj;
    private zzct<zzp> zzk;
    private zzct<zzj> zzl;

    private zzag(Application application) {
        zzcp zzcpVarZza = zzcs.zza(application);
        this.zza = zzcpVarZza;
        this.zzb = zzcq.zza(new zzao(zzcpVarZza));
        this.zzc = zzcq.zza(zzad.zza);
        zzaf zzafVar = new zzaf(this);
        this.zzd = zzafVar;
        this.zze = zzcq.zza(new zzbc(zzafVar));
        zzd zzdVar = new zzd(this.zza);
        this.zzf = zzdVar;
        this.zzg = new zzq(this.zza, zzdVar, this.zzb);
        this.zzh = zzcq.zza(new zzh(zzas.zza));
        zzam zzamVar = new zzam(this.zza, this.zzb, zzas.zza);
        this.zzi = zzamVar;
        this.zzj = new zzac(this.zzh, zzamVar, this.zzb);
        zzv zzvVar = new zzv(this.zza, this.zzc, zzaq.zza, zzas.zza, this.zzb, this.zze, this.zzg, this.zzj, this.zzh);
        this.zzk = zzvVar;
        this.zzl = zzcq.zza(new zzm(this.zzb, zzvVar, this.zze));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc
    public final zzj zza() {
        return this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc
    public final zzaz zzb() {
        return this.zze.zza();
    }

    /* synthetic */ zzag(Application application, zzaf zzafVar) {
        this(application);
    }
}
