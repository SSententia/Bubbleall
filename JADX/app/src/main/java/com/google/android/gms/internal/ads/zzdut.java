package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdut implements zzdfx, zzbcv, zzdbw, zzdbg {
    private final Context zza;
    private final zzfbe zzb;
    private final zzdvi zzc;
    private final zzfal zzd;
    private final zzezz zze;
    private final zzedq zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzbet.zzc().zzc(zzbjl.zzfc)).booleanValue();

    public zzdut(Context context, zzfbe zzfbeVar, zzdvi zzdviVar, zzfal zzfalVar, zzezz zzezzVar, zzedq zzedqVar) {
        this.zza = context;
        this.zzb = zzfbeVar;
        this.zzc = zzdviVar;
        this.zzd = zzfalVar;
        this.zze = zzezzVar;
        this.zzf = zzedqVar;
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) zzbet.zzc().zzc(zzbjl.zzaY);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String strZzv = com.google.android.gms.ads.internal.util.zzs.zzv(this.zza);
                    boolean zMatches = false;
                    if (str != null && strZzv != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzv);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    private final zzdvh zzh(String str) {
        zzdvh zzdvhVarZzd = this.zzc.zzd();
        zzdvhVarZzd.zzb(this.zzd.zzb.zzb);
        zzdvhVarZzd.zzc(this.zze);
        zzdvhVarZzd.zzd("action", str);
        if (!this.zze.zzt.isEmpty()) {
            zzdvhVarZzd.zzd("ancn", this.zze.zzt.get(0));
        }
        if (this.zze.zzaf) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdvhVarZzd.zzd("device_connectivity", true != com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) ? "offline" : "online");
            zzdvhVarZzd.zzd("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            zzdvhVarZzd.zzd("offline_ad", "1");
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zze.zza(this.zzd);
            zzdvhVarZzd.zzd("scar", String.valueOf(zZza));
            if (zZza) {
                String strZzb = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzb(this.zzd);
                if (!TextUtils.isEmpty(strZzb)) {
                    zzdvhVarZzd.zzd("ragent", strZzb);
                }
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzc(this.zzd);
                if (!TextUtils.isEmpty(strZzc)) {
                    zzdvhVarZzd.zzd("rtype", strZzc);
                }
            }
        }
        return zzdvhVarZzd;
    }

    private final void zzi(zzdvh zzdvhVar) {
        if (!this.zze.zzaf) {
            zzdvhVar.zze();
            return;
        }
        this.zzf.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdvhVar.zzf(), 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        if (this.zze.zzaf) {
            zzi(zzh("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza(zzbcz zzbczVar) {
        zzbcz zzbczVar2;
        if (this.zzh) {
            zzdvh zzdvhVarZzh = zzh("ifts");
            zzdvhVarZzh.zzd("reason", "adapter");
            int i = zzbczVar.zza;
            String str = zzbczVar.zzb;
            if (zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzbczVar2 = zzbczVar.zzd) != null && !zzbczVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzbcz zzbczVar3 = zzbczVar.zzd;
                i = zzbczVar3.zza;
                str = zzbczVar3.zzb;
            }
            if (i >= 0) {
                zzdvhVarZzh.zzd("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdvhVarZzh.zzd("areec", strZza);
            }
            zzdvhVarZzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzb(zzdkm zzdkmVar) {
        if (this.zzh) {
            zzdvh zzdvhVarZzh = zzh("ifts");
            zzdvhVarZzh.zzd("reason", "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                zzdvhVarZzh.zzd(NotificationCompat.CATEGORY_MESSAGE, zzdkmVar.getMessage());
            }
            zzdvhVarZzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzc() {
        if (zzf()) {
            zzh("adapter_impression").zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzd() {
        if (this.zzh) {
            zzdvh zzdvhVarZzh = zzh("ifts");
            zzdvhVarZzh.zzd("reason", "blocked");
            zzdvhVarZzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zze() {
        if (zzf()) {
            zzh("adapter_shown").zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (zzf() || this.zze.zzaf) {
            zzi(zzh("impression"));
        }
    }
}
