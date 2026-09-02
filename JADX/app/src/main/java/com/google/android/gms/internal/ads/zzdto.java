package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdto implements zzgla<zzazb> {
    private final zzgln<Context> zza;
    private final zzgln<String> zzb;
    private final zzgln<zzcgz> zzc;
    private final zzgln<zzazj> zzd;
    private final zzgln<String> zze;

    public zzdto(zzgln<Context> zzglnVar, zzgln<String> zzglnVar2, zzgln<zzcgz> zzglnVar3, zzgln<zzazj> zzglnVar4, zzgln<String> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoo) this.zza).zza();
        final String strZzb = ((zzdze) this.zzb).zzb();
        zzcgz zzcgzVarZza = ((zzcox) this.zzc).zza();
        final zzazj zzazjVarZzb = this.zzd.zzb();
        final String strZzb2 = this.zze.zzb();
        zzazb zzazbVar = new zzazb(new zzazf(contextZza));
        zzbby zzbbyVarZza = zzbbz.zza();
        zzbbyVarZza.zza(zzcgzVarZza.zzb);
        zzbbyVarZza.zzb(zzcgzVarZza.zzc);
        zzbbyVarZza.zzc(true != zzcgzVarZza.zzd ? 2 : 0);
        final zzbbz zzbbzVarZzah = zzbbyVarZza.zzah();
        zzazbVar.zzb(new zzaza(zzazjVarZzb, strZzb, zzbbzVarZzah, strZzb2) { // from class: com.google.android.gms.internal.ads.zzdtn
            private final zzazj zza;
            private final String zzb;
            private final zzbbz zzc;
            private final String zzd;

            {
                this.zza = zzazjVarZzb;
                this.zzb = strZzb;
                this.zzc = zzbbzVarZzah;
                this.zzd = strZzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                zzazj zzazjVar = this.zza;
                String str = this.zzb;
                zzbbz zzbbzVar = this.zzc;
                String str2 = this.zzd;
                zzazk zzazkVarZzau = zzbaoVar.zzg().zzau();
                zzazkVarZzau.zza(zzazjVar);
                zzbaoVar.zzh(zzazkVarZzau);
                zzbag zzbagVarZzau = zzbaoVar.zze().zzau();
                zzbagVarZzau.zza(str);
                zzbagVarZzau.zzb(zzbbzVar);
                zzbaoVar.zzf(zzbagVarZzau);
                zzbaoVar.zzb(str2);
            }
        });
        return zzazbVar;
    }
}
