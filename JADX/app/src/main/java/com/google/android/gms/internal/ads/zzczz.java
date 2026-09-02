package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczz implements zzgla<zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav>> {
    private final zzgln<Context> zza;
    private final zzgln<zzcgz> zzb;
    private final zzgln<zzfar> zzc;

    public zzczz(zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<zzfar> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context contextZzb = this.zza.zzb();
        final zzcgz zzcgzVarZza = ((zzcox) this.zzb).zza();
        final zzfar zzfarVarZza = ((zzdat) this.zzc).zza();
        return new zzfln(contextZzb, zzcgzVarZza, zzfarVarZza) { // from class: com.google.android.gms.internal.ads.zzczy
            private final Context zza;
            private final zzcgz zzb;
            private final zzfar zzc;

            {
                this.zza = contextZzb;
                this.zzb = zzcgzVarZza;
                this.zzc = zzfarVarZza;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                Context context = this.zza;
                zzcgz zzcgzVar = this.zzb;
                zzfar zzfarVar = this.zzc;
                zzezz zzezzVar = (zzezz) obj;
                com.google.android.gms.ads.internal.util.zzav zzavVar = new com.google.android.gms.ads.internal.util.zzav(context);
                zzavVar.zze(zzezzVar.zzB);
                zzavVar.zzf(zzezzVar.zzC.toString());
                zzavVar.zzd(zzcgzVar.zza);
                zzavVar.zzc(zzfarVar.zzf);
                return zzavVar;
            }
        };
    }
}
