package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeho implements zzfrz {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzezz zzc;
    final /* synthetic */ zzfac zzd;
    final /* synthetic */ zzehp zze;

    zzeho(zzehp zzehpVar, long j, String str, zzezz zzezzVar, zzfac zzfacVar) {
        this.zze = zzehpVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzezzVar;
        this.zzd = zzfacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        int i;
        zzbcz zzbczVar;
        long jElapsedRealtime = this.zze.zza.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzehe) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfaw) {
            i = 5;
        } else {
            i = ((th instanceof zzdym) && zzfbm.zza(th).zza == 3) ? 1 : 6;
        }
        zzehp.zzf(this.zze, this.zzb, i, jElapsedRealtime, this.zzc.zzac);
        if (this.zze.zzd) {
            this.zze.zzb.zza(this.zzd, this.zzc, i, th instanceof zzeeg ? (zzeeg) th : null, jElapsedRealtime);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            zzbcz zzbczVarZza = zzfbm.zza(th);
            int i2 = zzbczVarZza.zza;
            if ((i2 == 3 || i2 == 0) && (zzbczVar = zzbczVarZza.zzd) != null && !zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzbczVarZza = zzfbm.zza(new zzeeg(13, zzbczVarZza.zzd));
            }
            this.zze.zze.zzc(this.zzc, jElapsedRealtime, zzbczVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zze.zza.elapsedRealtime() - this.zza;
        zzehp.zzf(this.zze, this.zzb, 0, jElapsedRealtime, this.zzc.zzac);
        if (this.zze.zzd) {
            this.zze.zzb.zza(this.zzd, this.zzc, 0, null, jElapsedRealtime);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            this.zze.zze.zzc(this.zzc, jElapsedRealtime, null);
        }
    }
}
