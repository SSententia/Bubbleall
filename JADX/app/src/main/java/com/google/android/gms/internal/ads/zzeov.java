package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeov implements zzery<zzeow> {
    private final Context zza;
    private final zzfsn zzb;

    public zzeov(Context context, zzfsn zzfsnVar) {
        this.zza = context;
        this.zzb = zzfsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeow> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeou
            private final zzeov zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzf;
                String strZzj;
                String strZzc;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzaxc zzaxcVarZzb = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzb();
                Bundle bundle = null;
                if (zzaxcVarZzb != null && (!com.google.android.gms.ads.internal.zzt.zzg().zzp().zzd() || !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzh())) {
                    if (zzaxcVarZzb.zzh()) {
                        zzaxcVarZzb.zzf();
                    }
                    zzaws zzawsVarZze = zzaxcVarZzb.zze();
                    if (zzawsVarZze != null) {
                        strZzf = zzawsVarZze.zzb();
                        strZzc = zzawsVarZze.zzc();
                        strZzj = zzawsVarZze.zzd();
                        if (strZzf != null) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzp().zze(strZzf);
                        }
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzp().zzi(strZzj);
                        }
                    } else {
                        strZzf = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzf();
                        strZzj = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzj();
                        strZzc = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzg().zzp().zzh()) {
                        if (strZzj == null || TextUtils.isEmpty(strZzj)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzj);
                        }
                    }
                    if (strZzf != null && !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzd()) {
                        bundle2.putString("fingerprint", strZzf);
                        if (!strZzf.equals(strZzc)) {
                            bundle2.putString("v_fp", strZzc);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeow(bundle);
            }
        });
    }
}
