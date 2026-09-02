package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwb implements zzgla<zzdih<zzdfs>> {
    private final zzcvo zza;
    private final zzgln<zzddr> zzb;

    public zzcwb(zzcvo zzcvoVar, zzgln<zzddr> zzglnVar) {
        this.zza = zzcvoVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzddr zzddrVarZza = ((zzcxb) this.zzb).zza();
        return new zzdih(new zzdfs(zzddrVarZza) { // from class: com.google.android.gms.internal.ads.zzcvn
            private final zzddr zza;

            {
                this.zza = zzddrVarZza;
            }

            @Override // com.google.android.gms.internal.ads.zzdfs
            public final void zza() {
                this.zza.zzc();
            }
        }, zzchg.zzf);
    }
}
