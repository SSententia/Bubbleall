package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeim implements zzdkn {
    private final Context zza;
    private final zzdss zzb;
    private final zzfar zzc;
    private final zzcgz zzd;
    private final zzezz zze;
    private final zzfsm<zzdrx> zzf;
    private final zzcml zzg;
    private final zzbpu zzh;
    private final boolean zzi;

    zzeim(Context context, zzdss zzdssVar, zzfar zzfarVar, zzcgz zzcgzVar, zzezz zzezzVar, zzfsm<zzdrx> zzfsmVar, zzcml zzcmlVar, zzbpu zzbpuVar, boolean z) {
        this.zza = context;
        this.zzb = zzdssVar;
        this.zzc = zzfarVar;
        this.zzd = zzcgzVar;
        this.zze = zzezzVar;
        this.zzf = zzfsmVar;
        this.zzg = zzcmlVar;
        this.zzh = zzbpuVar;
        this.zzi = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zza(boolean z, Context context, zzdbp zzdbpVar) {
        zzcml zzcmlVar;
        zzcml zzcmlVar2;
        boolean zZzc;
        boolean zZzd;
        float fZze;
        zzdrx zzdrxVar = (zzdrx) zzfsd.zzr(this.zzf);
        try {
            zzezz zzezzVar = this.zze;
            if (this.zzg.zzaA()) {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzay)).booleanValue()) {
                    final zzcml zzcmlVarZzb = this.zzb.zzb(this.zzc.zze, null, null);
                    zzbqh.zzb(zzcmlVarZzb, zzdrxVar.zzk());
                    final zzdsw zzdswVar = new zzdsw();
                    zzdswVar.zza(this.zza, (View) zzcmlVarZzb);
                    zzdrxVar.zzl().zzi(zzcmlVarZzb, true, this.zzi ? this.zzh : null);
                    zzcmlVarZzb.zzR().zzy(new zzcnx(zzdswVar, zzcmlVarZzb) { // from class: com.google.android.gms.internal.ads.zzeik
                        private final zzdsw zza;
                        private final zzcml zzb;

                        {
                            this.zza = zzdswVar;
                            this.zzb = zzcmlVarZzb;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcnx
                        public final void zza(boolean z2) {
                            zzdsw zzdswVar2 = this.zza;
                            zzcml zzcmlVar3 = this.zzb;
                            zzdswVar2.zzb();
                            zzcmlVar3.zzL();
                            zzcmlVar3.zzR().zzj();
                        }
                    });
                    zzcmlVarZzb.zzR().zzz(zzeil.zza(zzcmlVarZzb));
                    zzfae zzfaeVar = zzezzVar.zzs;
                    zzcmlVarZzb.zzat(zzfaeVar.zzb, zzfaeVar.zza, null);
                    zzcmlVar = zzcmlVarZzb;
                } else {
                    zzcmlVar2 = this.zzg;
                }
                zzcmlVar.zzag(true);
                if (this.zzi) {
                    zZzc = this.zzh.zzc(false);
                } else {
                    zZzc = false;
                }
                com.google.android.gms.ads.internal.zzt.zzc();
                boolean zZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
                if (this.zzi) {
                    zZzd = this.zzh.zzd();
                } else {
                    zZzd = false;
                }
                if (this.zzi) {
                    fZze = this.zzh.zze();
                } else {
                    fZze = 0.0f;
                }
                float f = fZze;
                zzezz zzezzVar2 = this.zze;
                com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZzc, zZzL, zZzd, f, -1, z, zzezzVar2.zzK, zzezzVar2.zzL);
                if (zzdbpVar != null) {
                    zzdbpVar.zze();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                zzdkc zzdkcVarZzj = zzdrxVar.zzj();
                zzezz zzezzVar3 = this.zze;
                int i = zzezzVar3.zzM;
                zzcgz zzcgzVar = this.zzd;
                String str = zzezzVar3.zzB;
                zzfae zzfaeVar2 = zzezzVar3.zzs;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzbcv) null, zzdkcVarZzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcmlVar, i, zzcgzVar, str, zzjVar, zzfaeVar2.zzb, zzfaeVar2.zza, this.zzc.zzf, zzdbpVar), true);
            }
            zzcmlVar2 = this.zzg;
            zzcmlVar = zzcmlVar2;
            zzcmlVar.zzag(true);
            if (this.zzi) {
                zZzc = this.zzh.zzc(false);
            } else {
                zZzc = false;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzL2 = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (this.zzi) {
                zZzd = this.zzh.zzd();
            } else {
                zZzd = false;
            }
            if (this.zzi) {
                fZze = this.zzh.zze();
            } else {
                fZze = 0.0f;
            }
            float f2 = fZze;
            zzezz zzezzVar4 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zZzc, zZzL2, zZzd, f2, -1, z, zzezzVar4.zzK, zzezzVar4.zzL);
            if (zzdbpVar != null) {
                zzdbpVar.zze();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdkc zzdkcVarZzj2 = zzdrxVar.zzj();
            zzezz zzezzVar5 = this.zze;
            int i2 = zzezzVar5.zzM;
            zzcgz zzcgzVar2 = this.zzd;
            String str2 = zzezzVar5.zzB;
            zzfae zzfaeVar3 = zzezzVar5.zzs;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzbcv) null, zzdkcVarZzj2, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcmlVar, i2, zzcgzVar2, str2, zzjVar2, zzfaeVar3.zzb, zzfaeVar3.zza, this.zzc.zzf, zzdbpVar), true);
        } catch (zzcmw e) {
            zzcgt.zzg("", e);
        }
    }
}
