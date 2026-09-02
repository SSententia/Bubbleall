package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeit implements zzeek<zzdrw, zzfbi, zzefz> {
    private final Context zza;
    private final Executor zzb;
    private final zzdsb zzc;

    public zzeit(Context context, Executor executor, zzdsb zzdsbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefz> zzeefVar) {
        try {
            zzeefVar.zzb.zzl(zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString());
        } catch (Exception e) {
            String strValueOf = String.valueOf(zzeefVar.zza);
            com.google.android.gms.ads.internal.util.zze.zzj(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefz> zzeefVar) throws zzfaw {
        if (zzeefVar.zzb.zzn()) {
            zze(zzfalVar, zzezzVar, zzeefVar);
            return;
        }
        ((zzefz) zzeefVar.zzc).zzd(new zzeir(this, zzfalVar, zzezzVar, zzeefVar));
        zzeefVar.zzb.zzk(this.zza, zzfalVar.zza.zza.zzd, null, (zzcck) zzeefVar.zzc, zzezzVar.zzv.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdrw zzb(zzfal zzfalVar, zzezz zzezzVar, final zzeef zzeefVar) throws zzehs, zzfaw {
        zzdrx zzdrxVarZzU = this.zzc.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdry(new zzdkn(zzeefVar) { // from class: com.google.android.gms.internal.ads.zzeip
            private final zzeef zza;

            {
                this.zza = zzeefVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.zzdkn
            public final void zza(boolean z, Context context, zzdbp zzdbpVar) throws zzdkm {
                zzeef zzeefVar2 = this.zza;
                try {
                    ((zzfbi) zzeefVar2.zzb).zzs(z);
                    ((zzfbi) zzeefVar2.zzb).zzm();
                } catch (zzfaw e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Cannot show rewarded video.", e);
                    throw new zzdkm(e.getCause());
                }
            }
        }));
        zzdrxVarZzU.zza().zzi(new zzcsw((zzfbi) zzeefVar.zzb), this.zzb);
        zzdcj zzdcjVarZzb = zzdrxVarZzU.zzb();
        zzdba zzdbaVarZzc = zzdrxVarZzU.zzc();
        ((zzefz) zzeefVar.zzc).zzc(new zzeis(this, zzdrxVarZzU.zzi(), zzdbaVarZzc, zzdcjVarZzb, zzdrxVarZzU.zzk()));
        return zzdrxVarZzU.zzh();
    }
}
