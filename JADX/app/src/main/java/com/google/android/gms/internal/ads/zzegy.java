package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegy implements zzeek<zzdmh, zzfbi, zzefy> {
    private final Context zza;
    private final zzdlb zzb;
    private final Executor zzc;

    public zzegy(Context context, zzdlb zzdlbVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfal zzfalVar, int i) {
        return zzfalVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw {
        zzfbi zzfbiVar = zzeefVar.zzb;
        Context context = this.zza;
        zzbdg zzbdgVar = zzfalVar.zza.zza.zzd;
        String string = zzezzVar.zzv.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs);
        zzbvm zzbvmVar = (zzbvm) zzeefVar.zzc;
        zzfar zzfarVar = zzfalVar.zza.zza;
        zzfbiVar.zzo(context, zzbdgVar, string, strZzl, zzbvmVar, zzfarVar.zzi, zzfarVar.zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdmh zzb(zzfal zzfalVar, zzezz zzezzVar, zzeef zzeefVar) throws zzehs, zzfaw {
        zzdmm zzdmmVarZzab;
        zzbvr zzbvrVarZzB = ((zzfbi) zzeefVar.zzb).zzB();
        zzbvs zzbvsVarZzC = ((zzfbi) zzeefVar.zzb).zzC();
        zzbvv zzbvvVarZzu = ((zzfbi) zzeefVar.zzb).zzu();
        if (zzbvvVarZzu != null && zzc(zzfalVar, 6)) {
            zzdmmVarZzab = zzdmm.zzaa(zzbvvVarZzu);
        } else if (zzbvrVarZzB != null && zzc(zzfalVar, 6)) {
            zzdmmVarZzab = zzdmm.zzad(zzbvrVarZzB);
        } else if (zzbvrVarZzB != null && zzc(zzfalVar, 2)) {
            zzdmmVarZzab = zzdmm.zzac(zzbvrVarZzB);
        } else if (zzbvsVarZzC != null && zzc(zzfalVar, 6)) {
            zzdmmVarZzab = zzdmm.zzae(zzbvsVarZzC);
        } else {
            if (zzbvsVarZzC == null || !zzc(zzfalVar, 1)) {
                throw new zzehs(1, "No native ad mappers");
            }
            zzdmmVarZzab = zzdmm.zzab(zzbvsVarZzC);
        }
        if (!zzfalVar.zza.zza.zzg.contains(Integer.toString(zzdmmVarZzab.zzv()))) {
            throw new zzehs(1, "No corresponding native ad listener");
        }
        zzdmo zzdmoVarZzU = this.zzb.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdmy(zzdmmVarZzab), new zzdol(zzbvsVarZzC, zzbvrVarZzB, zzbvvVarZzu, null));
        ((zzefy) zzeefVar.zzc).zzc(zzdmoVarZzU.zzf());
        zzdmoVarZzU.zza().zzi(new zzcsw((zzfbi) zzeefVar.zzb), this.zzc);
        return zzdmoVarZzU.zzh();
    }
}
