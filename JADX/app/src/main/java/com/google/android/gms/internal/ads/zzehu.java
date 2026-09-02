package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehu<AdT> implements zzfrk<zzfal, AdT> {
    private final zzfes zza;
    private final zzdbe zzb;
    private final zzffr zzc;
    private final zzffu zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxj<AdT> zzg;
    private final zzehp zzh;
    private final zzeeh zzi;

    public zzehu(zzfes zzfesVar, zzehp zzehpVar, zzdbe zzdbeVar, zzffr zzffrVar, zzffu zzffuVar, zzcxj<AdT> zzcxjVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeeh zzeehVar) {
        this.zza = zzfesVar;
        this.zzh = zzehpVar;
        this.zzb = zzdbeVar;
        this.zzc = zzffrVar;
        this.zzd = zzffuVar;
        this.zzg = zzcxjVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeehVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    @Override // com.google.android.gms.internal.ads.zzfrk
    public final /* bridge */ /* synthetic */ zzfsm zza(zzfal zzfalVar) throws Exception {
        String strZza;
        int i;
        final zzfal zzfalVar2 = zzfalVar;
        int i2 = zzfalVar2.zzb.zzb.zze;
        if (i2 == 0) {
            strZza = "No ad config.";
        } else if (i2 < 200 || i2 >= 300) {
            if (i2 < 300 || i2 >= 400) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Received error HTTP response code: ");
                sb.append(i2);
                strZza = sb.toString();
            } else {
                strZza = "No location header to follow redirect or too many redirects.";
            }
        } else if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdN)).booleanValue()) {
            strZza = "No ad config.";
        } else {
            strZza = "No fill.";
        }
        zzfab zzfabVar = zzfalVar2.zzb.zzb.zzi;
        if (zzfabVar != null) {
            strZza = zzfabVar.zza();
        }
        this.zzi.zza(zzfalVar2.zzb.zzb);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfW)).booleanValue() && (i = zzfalVar2.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzfsd.zzc(new zzehs(3, strZza));
        }
        zzfdy zzfdyVarZzi = zzfed.zza(zzfsd.zzc(new zzehs(3, strZza)), zzfem.RENDER_CONFIG_INIT, this.zza).zzi();
        this.zzb.zzi(new zzcsx(zzfalVar2, this.zzd, this.zzc), this.zze);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            for (zzezz zzezzVar : zzfalVar2.zzb.zza) {
                this.zzi.zzb(zzezzVar);
                Iterator<String> it = zzezzVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.zzi.zzc(zzezzVar, 0L, zzfbm.zzd(1, null, null));
                        break;
                    }
                    zzeec<AdT> zzeecVarZza = this.zzg.zza(zzezzVar.zzb, it.next());
                    if (zzeecVarZza != null && zzeecVarZza.zza(zzfalVar2, zzezzVar)) {
                        break;
                    }
                }
            }
        }
        int i3 = 0;
        for (final zzezz zzezzVar2 : zzfalVar2.zzb.zza) {
            for (String str : zzezzVar2.zza) {
                final zzeec<AdT> zzeecVarZza2 = this.zzg.zza(zzezzVar2.zzb, str);
                if (zzeecVarZza2 != null && zzeecVarZza2.zza(zzfalVar2, zzezzVar2)) {
                    zzfej<I> zzfejVarZze = this.zza.zze(zzfem.RENDER_CONFIG_WATERFALL, zzfdyVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
                    sb2.append("render-config-");
                    sb2.append(i3);
                    sb2.append("-");
                    sb2.append(str);
                    zzfdyVarZzi = zzfejVarZze.zza(sb2.toString()).zzg(Throwable.class, new zzfrk(this, zzfalVar2, zzezzVar2, zzeecVarZza2) { // from class: com.google.android.gms.internal.ads.zzeht
                        private final zzehu zza;
                        private final zzfal zzb;
                        private final zzezz zzc;
                        private final zzeec zzd;

                        {
                            this.zza = this;
                            this.zzb = zzfalVar2;
                            this.zzc = zzezzVar2;
                            this.zzd = zzeecVarZza2;
                        }

                        @Override // com.google.android.gms.internal.ads.zzfrk
                        public final zzfsm zza(Object obj) {
                            return this.zza.zzb(this.zzb, this.zzc, this.zzd, (Throwable) obj);
                        }
                    }).zzi();
                    break;
                }
            }
            i3++;
        }
        return zzfdyVarZzi;
    }

    final /* synthetic */ zzfsm zzb(zzfal zzfalVar, zzezz zzezzVar, zzeec zzeecVar, Throwable th) throws Exception {
        zzehp zzehpVar = this.zzh;
        zzfac zzfacVar = zzfalVar.zzb.zzb;
        zzfsm zzfsmVarZzh = zzfsd.zzh(zzeecVar.zzb(zzfalVar, zzezzVar), zzezzVar.zzN, TimeUnit.MILLISECONDS, this.zzf);
        zzehpVar.zze(zzfacVar, zzezzVar, zzfsmVarZzh);
        return zzfsmVarZzh;
    }
}
