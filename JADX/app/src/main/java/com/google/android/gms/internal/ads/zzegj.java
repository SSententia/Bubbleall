package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegj implements zzeek<zzdji, zzfbi, zzefy> {
    private final Context zza;
    private final zzdkf zzb;
    private final zzcgz zzc;
    private final Executor zzd;

    public zzegj(Context context, zzcgz zzcgzVar, zzdkf zzdkfVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcgzVar;
        this.zzb = zzdkfVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw {
        zzeefVar.zzb.zzh(this.zza, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), (zzbvm) zzeefVar.zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdji zzb(zzfal zzfalVar, zzezz zzezzVar, final zzeef zzeefVar) throws zzehs, zzfaw {
        zzdjj zzdjjVarZzQ = this.zzb.zzQ(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdjm(new zzdkn(this, zzeefVar) { // from class: com.google.android.gms.internal.ads.zzegi
            private final zzegj zza;
            private final zzeef zzb;

            {
                this.zza = this;
                this.zzb = zzeefVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdkn
            public final void zza(boolean z, Context context, zzdbp zzdbpVar) throws zzdkm {
                this.zza.zzc(this.zzb, z, context, zzdbpVar);
            }
        }, null));
        zzdjjVarZzQ.zza().zzi(new zzcsw((zzfbi) zzeefVar.zzb), this.zzd);
        ((zzefy) zzeefVar.zzc).zzc(zzdjjVarZzQ.zzf());
        return zzdjjVarZzQ.zzh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzc(zzeef zzeefVar, boolean z, Context context, zzdbp zzdbpVar) throws zzdkm {
        try {
            ((zzfbi) zzeefVar.zzb).zzs(z);
            if (this.zzc.zzc < ((Integer) zzbet.zzc().zzc(zzbjl.zzau)).intValue()) {
                ((zzfbi) zzeefVar.zzb).zzd();
            } else {
                ((zzfbi) zzeefVar.zzb).zze(context);
            }
        } catch (zzfaw e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Cannot show interstitial.");
            throw new zzdkm(e.getCause());
        }
    }
}
