package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefd implements zzeec<zzcvh> {
    private final zzcwe zza;
    private final Context zzb;
    private final zzdss zzc;
    private final zzfar zzd;
    private final Executor zze;
    private final zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav> zzf;

    public zzefd(zzcwe zzcweVar, Context context, Executor executor, zzdss zzdssVar, zzfar zzfarVar, zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav> zzflnVar) {
        this.zzb = context;
        this.zza = zzcweVar;
        this.zze = executor;
        this.zzc = zzdssVar;
        this.zzd = zzfarVar;
        this.zzf = zzflnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        zzfae zzfaeVar = zzezzVar.zzs;
        return (zzfaeVar == null || zzfaeVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<zzcvh> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        return zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zzfalVar, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzeex
            private final zzefd zza;
            private final zzfal zzb;
            private final zzezz zzc;

            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzd(this.zzb, this.zzc, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ void zzc(zzcml zzcmlVar) {
        zzcmlVar.zzL();
        zzcnh zzcnhVarZzh = zzcmlVar.zzh();
        zzbis zzbisVar = this.zzd.zza;
        if (zzbisVar == null || zzcnhVarZzh == null) {
            return;
        }
        zzcnhVarZzh.zzc(zzbisVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfsm zzd(zzfal zzfalVar, zzezz zzezzVar, Object obj) throws Exception {
        View zzdsvVar;
        zzbdl zzbdlVarZzb = zzfav.zzb(this.zzb, zzezzVar.zzu);
        final zzcml zzcmlVarZzb = this.zzc.zzb(zzbdlVarZzb, zzezzVar, zzfalVar.zzb.zzb);
        zzcmlVarZzb.zzav(zzezzVar.zzS);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfB)).booleanValue() && zzezzVar.zzad) {
            zzdsvVar = zzcwv.zza(this.zzb, (View) zzcmlVarZzb, zzezzVar);
        } else {
            zzdsvVar = new zzdsv(this.zzb, (View) zzcmlVarZzb, this.zzf.apply(zzezzVar));
        }
        final zzcvi zzcviVarZzaa = this.zza.zzaa(new zzcxv(zzfalVar, zzezzVar, null), new zzcvo(zzdsvVar, zzcmlVarZzb, zzeey.zzb(zzcmlVarZzb), zzfav.zzc(zzbdlVarZzb)));
        zzcviVarZzaa.zzi().zzi(zzcmlVarZzb, false, null);
        zzcviVarZzaa.zzd().zzi(new zzdbw(zzcmlVarZzb) { // from class: com.google.android.gms.internal.ads.zzeez
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
        zzcviVarZzaa.zzi();
        zzfae zzfaeVar = zzezzVar.zzs;
        zzfsm<?> zzfsmVarZzj = zzdsr.zzj(zzcmlVarZzb, zzfaeVar.zzb, zzfaeVar.zza);
        if (zzezzVar.zzI) {
            zzfsmVarZzj.zze(zzefa.zza(zzcmlVarZzb), this.zze);
        }
        zzfsmVarZzj.zze(new Runnable(this, zzcmlVarZzb) { // from class: com.google.android.gms.internal.ads.zzefb
            private final zzefd zza;
            private final zzcml zzb;

            {
                this.zza = this;
                this.zzb = zzcmlVarZzb;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb);
            }
        }, this.zze);
        return zzfsd.zzj(zzfsmVarZzj, new zzfln(zzcviVarZzaa) { // from class: com.google.android.gms.internal.ads.zzefc
            private final zzcvi zza;

            {
                this.zza = zzcviVarZzaa;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj2) {
                return this.zza.zzh();
            }
        }, zzchg.zzf);
    }
}
