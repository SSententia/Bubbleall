package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeev implements zzeec<zzcuq> {
    private final zzcuk zza;
    private final Context zzb;
    private final zzdss zzc;
    private final Executor zzd;

    public zzeev(zzcuk zzcukVar, Context context, Executor executor, zzdss zzdssVar) {
        this.zzb = context;
        this.zza = zzcukVar;
        this.zzd = executor;
        this.zzc = zzdssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        zzfae zzfaeVar = zzezzVar.zzs;
        return (zzfaeVar == null || zzfaeVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<zzcuq> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        return zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zzfalVar, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzees
            private final zzeev zza;
            private final zzfal zzb;
            private final zzezz zzc;

            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, obj);
            }
        }, this.zzd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfsm zzc(zzfal zzfalVar, zzezz zzezzVar, Object obj) throws Exception {
        zzbdl zzbdlVarZzb = zzfav.zzb(this.zzb, zzezzVar.zzu);
        final zzcml zzcmlVarZzb = this.zzc.zzb(zzbdlVarZzb, zzezzVar, zzfalVar.zzb.zzb);
        final zzcud zzcudVarZzR = this.zza.zzR(new zzcxv(zzfalVar, zzezzVar, null), new zzcue((View) zzcmlVarZzb, zzcmlVarZzb, zzfav.zzc(zzbdlVarZzb), zzezzVar.zzW, zzezzVar.zzaa, zzezzVar.zzK));
        zzcudVarZzR.zzi().zzi(zzcmlVarZzb, false, null);
        zzcudVarZzR.zzd().zzi(new zzdbw(zzcmlVarZzb) { // from class: com.google.android.gms.internal.ads.zzeet
            private final zzcml zza;

            {
                this.zza = zzcmlVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzdbw
            public final void zzg() {
                zzcml zzcmlVar = this.zza;
                if (zzcmlVar.zzR() != null) {
                    zzcmlVar.zzR().zzj();
                }
            }
        }, zzchg.zzf);
        zzcudVarZzR.zzi();
        zzfae zzfaeVar = zzezzVar.zzs;
        return zzfsd.zzj(zzdsr.zzj(zzcmlVarZzb, zzfaeVar.zzb, zzfaeVar.zza), new zzfln(zzcudVarZzR) { // from class: com.google.android.gms.internal.ads.zzeeu
            private final zzcud zza;

            {
                this.zza = zzcudVarZzR;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj2) {
                return this.zza.zzh();
            }
        }, zzchg.zzf);
    }
}
