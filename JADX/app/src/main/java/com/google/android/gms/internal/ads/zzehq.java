package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehq {
    private final zzfbe zza;
    private final zzdtc zzb;
    private final zzdvi zzc;
    private final zzffc zzd;

    public zzehq(zzfbe zzfbeVar, zzdtc zzdtcVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = zzfbeVar;
        this.zzb = zzdtcVar;
        this.zzc = zzdviVar;
        this.zzd = zzffcVar;
    }

    public final void zza(zzfac zzfacVar, zzezz zzezzVar, int i, @Nullable zzeeg zzeegVar, long j) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffb zzffbVarZza = zzffb.zza("adapter_status");
            zzffbVarZza.zzh(zzfacVar);
            zzffbVarZza.zzi(zzezzVar);
            zzffbVarZza.zzc("adapter_l", String.valueOf(j));
            zzffbVarZza.zzc("sc", Integer.toString(i));
            if (zzeegVar != null) {
                zzffbVarZza.zzc("arec", Integer.toString(zzeegVar.zzb().zza));
                String strZza = this.zza.zza(zzeegVar.getMessage());
                if (strZza != null) {
                    zzffbVarZza.zzc("areec", strZza);
                }
            }
            zzdtb zzdtbVarZzd = this.zzb.zzd(zzezzVar.zzt);
            if (zzdtbVarZzd != null) {
                zzffbVarZza.zzc("ancn", zzdtbVarZzd.zza);
                zzbya zzbyaVar = zzdtbVarZzd.zzb;
                if (zzbyaVar != null) {
                    zzffbVarZza.zzc("adapter_v", zzbyaVar.toString());
                }
                zzbya zzbyaVar2 = zzdtbVarZzd.zzc;
                if (zzbyaVar2 != null) {
                    zzffbVarZza.zzc("adapter_sv", zzbyaVar2.toString());
                }
            }
            this.zzd.zza(zzffbVarZza);
            return;
        }
        zzdvh zzdvhVarZzd = this.zzc.zzd();
        zzdvhVarZzd.zzb(zzfacVar);
        zzdvhVarZzd.zzc(zzezzVar);
        zzdvhVarZzd.zzd("action", "adapter_status");
        zzdvhVarZzd.zzd("adapter_l", String.valueOf(j));
        zzdvhVarZzd.zzd("sc", Integer.toString(i));
        if (zzeegVar != null) {
            zzdvhVarZzd.zzd("arec", Integer.toString(zzeegVar.zzb().zza));
            String strZza2 = this.zza.zza(zzeegVar.getMessage());
            if (strZza2 != null) {
                zzdvhVarZzd.zzd("areec", strZza2);
            }
        }
        zzdtb zzdtbVarZzd2 = this.zzb.zzd(zzezzVar.zzt);
        if (zzdtbVarZzd2 != null) {
            zzdvhVarZzd.zzd("ancn", zzdtbVarZzd2.zza);
            zzbya zzbyaVar3 = zzdtbVarZzd2.zzb;
            if (zzbyaVar3 != null) {
                zzdvhVarZzd.zzd("adapter_v", zzbyaVar3.toString());
            }
            zzbya zzbyaVar4 = zzdtbVarZzd2.zzc;
            if (zzbyaVar4 != null) {
                zzdvhVarZzd.zzd("adapter_sv", zzbyaVar4.toString());
            }
        }
        zzdvhVarZzd.zze();
    }
}
