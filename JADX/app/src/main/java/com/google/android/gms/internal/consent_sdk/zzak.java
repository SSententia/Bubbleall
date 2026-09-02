package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzak implements zzar {
    private zzct<zzbh> zza;
    private zzct<zzbb> zzb;
    private zzct<zzat> zzc;
    private zzct zzd;
    private zzct<zzbe> zze;
    private final /* synthetic */ zzag zzf;

    private zzak(zzag zzagVar, zzbb zzbbVar) {
        this.zzf = zzagVar;
        this.zza = zzcq.zza(new zzbk(zzagVar.zza));
        this.zzb = zzcs.zza(zzbbVar);
        this.zzc = new zzcn();
        this.zzd = new zzbo(zzagVar.zza, this.zza, zzaq.zza, zzas.zza, zzagVar.zzh, zzagVar.zzi, this.zzc);
        this.zze = new zzbi(this.zza, zzaq.zza, this.zzd);
        zzcn.zza(this.zzc, zzcq.zza(new zzba(zzagVar.zza, zzagVar.zzc, this.zza, zzagVar.zzb, this.zzb, this.zze)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzar
    public final zzat zza() {
        return this.zzc.zza();
    }

    /* synthetic */ zzak(zzag zzagVar, zzbb zzbbVar, zzaf zzafVar) {
        this(zzagVar, zzbbVar);
    }
}
