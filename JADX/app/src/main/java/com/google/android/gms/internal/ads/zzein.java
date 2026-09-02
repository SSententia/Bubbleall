package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzein implements zzeec<zzdrw> {
    private final Context zza;
    private final zzdss zzb;
    private final zzdsb zzc;
    private final zzfar zzd;
    private final Executor zze;
    private final zzcgz zzf;
    private final zzbpu zzg;
    private final boolean zzh = ((Boolean) zzbet.zzc().zzc(zzbjl.zzgo)).booleanValue();

    public zzein(Context context, zzcgz zzcgzVar, zzfar zzfarVar, Executor executor, zzdsb zzdsbVar, zzdss zzdssVar, zzbpu zzbpuVar) {
        this.zza = context;
        this.zzd = zzfarVar;
        this.zzc = zzdsbVar;
        this.zze = executor;
        this.zzf = zzcgzVar;
        this.zzb = zzdssVar;
        this.zzg = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        zzfae zzfaeVar = zzezzVar.zzs;
        return (zzfaeVar == null || zzfaeVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<zzdrw> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        final zzdsw zzdswVar = new zzdsw();
        zzfsm<zzdrw> zzfsmVarZzi = zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zzezzVar, zzfalVar, zzdswVar) { // from class: com.google.android.gms.internal.ads.zzeig
            private final zzein zza;
            private final zzezz zzb;
            private final zzfal zzc;
            private final zzdsw zzd;

            {
                this.zza = this;
                this.zzb = zzezzVar;
                this.zzc = zzfalVar;
                this.zzd = zzdswVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
            }
        }, this.zze);
        zzfsmVarZzi.zze(zzeih.zza(zzdswVar), this.zze);
        return zzfsmVarZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfsm zzc(final zzezz zzezzVar, zzfal zzfalVar, zzdsw zzdswVar, Object obj) throws Exception {
        final zzcml zzcmlVarZzb = this.zzb.zzb(this.zzd.zze, zzezzVar, zzfalVar.zzb.zzb);
        zzcmlVarZzb.zzav(zzezzVar.zzS);
        zzdswVar.zza(this.zza, (View) zzcmlVarZzb);
        zzchl zzchlVar = new zzchl();
        final zzdrx zzdrxVarZzU = this.zzc.zzU(new zzcxv(zzfalVar, zzezzVar, null), new zzdry(new zzeim(this.zza, this.zzb, this.zzd, this.zzf, zzezzVar, zzchlVar, zzcmlVarZzb, this.zzg, this.zzh), zzcmlVarZzb));
        zzchlVar.zzc(zzdrxVarZzU);
        zzbqh.zzb(zzcmlVarZzb, zzdrxVarZzU.zzk());
        zzdrxVarZzU.zzd().zzi(new zzdbw(zzcmlVarZzb) { // from class: com.google.android.gms.internal.ads.zzeii
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
        zzdrxVarZzU.zzl().zzi(zzcmlVarZzb, true, this.zzh ? this.zzg : null);
        zzdrxVarZzU.zzl();
        zzfae zzfaeVar = zzezzVar.zzs;
        return zzfsd.zzj(zzdsr.zzj(zzcmlVarZzb, zzfaeVar.zzb, zzfaeVar.zza), new zzfln(this, zzcmlVarZzb, zzezzVar, zzdrxVarZzU) { // from class: com.google.android.gms.internal.ads.zzeij
            private final zzein zza;
            private final zzcml zzb;
            private final zzezz zzc;
            private final zzdrx zzd;

            {
                this.zza = this;
                this.zzb = zzcmlVarZzb;
                this.zzc = zzezzVar;
                this.zzd = zzdrxVarZzU;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj2) {
                zzcml zzcmlVar = this.zzb;
                zzezz zzezzVar2 = this.zzc;
                zzdrx zzdrxVar = this.zzd;
                if (zzezzVar2.zzI) {
                    zzcmlVar.zzau();
                }
                zzcmlVar.zzL();
                zzcmlVar.onPause();
                return zzdrxVar.zzh();
            }
        }, this.zze);
    }
}
