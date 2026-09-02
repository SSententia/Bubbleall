package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeby implements zzdfx, zzbcv, zzdbw, zzdbg {
    private final Context zza;
    private final zzfbe zzb;
    private final zzfal zzc;
    private final zzezz zzd;
    private final zzedq zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzfc)).booleanValue();
    private final zzffc zzh;
    private final String zzi;

    public zzeby(Context context, zzfbe zzfbeVar, zzfal zzfalVar, zzezz zzezzVar, zzedq zzedqVar, zzffc zzffcVar, String str) {
        this.zza = context;
        this.zzb = zzfbeVar;
        this.zzc = zzfalVar;
        this.zzd = zzezzVar;
        this.zze = zzedqVar;
        this.zzh = zzffcVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    private final zzffb zzh(String str) {
        zzffb zzffbVarZza = zzffb.zza(str);
        zzffbVarZza.zzg(this.zzc, null);
        zzffbVarZza.zzi(this.zzd);
        zzffbVarZza.zzc("request_id", this.zzi);
        if (!this.zzd.zzt.isEmpty()) {
            zzffbVarZza.zzc("ancn", this.zzd.zzt.get(0));
        }
        if (this.zzd.zzaf) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzffbVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) ? "offline" : "online");
            zzffbVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            zzffbVarZza.zzc("offline_ad", "1");
        }
        return zzffbVarZza;
    }

    private final void zzi(zzffb zzffbVar) {
        if (!this.zzd.zzaf) {
            this.zzh.zza(zzffbVar);
            return;
        }
        this.zze.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zzb(zzffbVar), 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        if (this.zzd.zzaf) {
            zzi(zzh("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza(zzbcz zzbczVar) {
        zzbcz zzbczVar2;
        if (this.zzg) {
            int i = zzbczVar.zza;
            String str = zzbczVar.zzb;
            if (zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzbczVar2 = zzbczVar.zzd) != null && !zzbczVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzbcz zzbczVar3 = zzbczVar.zzd;
                i = zzbczVar3.zza;
                str = zzbczVar3.zzb;
            }
            String strZza = this.zzb.zza(str);
            zzffb zzffbVarZzh = zzh("ifts");
            zzffbVarZzh.zzc("reason", "adapter");
            if (i >= 0) {
                zzffbVarZzh.zzc("arec", String.valueOf(i));
            }
            if (strZza != null) {
                zzffbVarZzh.zzc("areec", strZza);
            }
            this.zzh.zza(zzffbVarZzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzb(zzdkm zzdkmVar) {
        if (this.zzg) {
            zzffb zzffbVarZzh = zzh("ifts");
            zzffbVarZzh.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                zzffbVarZzh.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdkmVar.getMessage());
            }
            this.zzh.zza(zzffbVarZzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzc() {
        if (zzf()) {
            this.zzh.zza(zzh("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzd() {
        if (this.zzg) {
            zzffc zzffcVar = this.zzh;
            zzffb zzffbVarZzh = zzh("ifts");
            zzffbVarZzh.zzc("reason", "blocked");
            zzffcVar.zza(zzffbVarZzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zze() {
        if (zzf()) {
            this.zzh.zza(zzh("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (zzf() || this.zzd.zzaf) {
            zzi(zzh("impression"));
        }
    }
}
