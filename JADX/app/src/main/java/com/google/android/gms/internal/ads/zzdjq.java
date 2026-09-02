package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjq implements zzgla<zzdih<zzdcq>> {
    private final zzdjm zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzcgz> zzc;
    private final zzgln<zzezz> zzd;
    private final zzgln<zzfar> zze;

    public zzdjq(zzdjm zzdjmVar, zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<zzezz> zzglnVar3, zzgln<zzfar> zzglnVar4) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
        this.zzd = zzglnVar3;
        this.zze = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context contextZzb = this.zzb.zzb();
        final zzcgz zzcgzVarZza = ((zzcox) this.zzc).zza();
        final zzezz zzezzVarZza = ((zzcxw) this.zzd).zza();
        final zzfar zzfarVarZza = ((zzdat) this.zze).zza();
        return new zzdih(new zzdcq(contextZzb, zzcgzVarZza, zzezzVarZza, zzfarVarZza) { // from class: com.google.android.gms.internal.ads.zzdjk
            private final Context zza;
            private final zzcgz zzb;
            private final zzezz zzc;
            private final zzfar zzd;

            {
                this.zza = contextZzb;
                this.zzb = zzcgzVarZza;
                this.zzc = zzezzVarZza;
                this.zzd = zzfarVarZza;
            }

            @Override // com.google.android.gms.internal.ads.zzdcq
            public final void zzf() {
                com.google.android.gms.ads.internal.zzt.zzm().zzg(this.zza, this.zzb.zza, this.zzc.zzC.toString(), this.zzd.zzf);
            }
        }, zzchg.zzf);
    }
}
