package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerj implements zzery<zzerk> {
    private final zzcfa zza;
    private final zzfsn zzb;
    private final Context zzc;

    public zzerj(zzcfa zzcfaVar, zzfsn zzfsnVar, Context context) {
        this.zza = zzcfaVar;
        this.zzb = zzfsnVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerk> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeri
            private final zzerj zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    final /* synthetic */ zzerk zzb() throws Exception {
        Long l;
        if (!this.zza.zzb(this.zzc)) {
            return new zzerk(null, null, null, null, null);
        }
        String strZzj = this.zza.zzj(this.zzc);
        String str = strZzj == null ? "" : strZzj;
        String strZzk = this.zza.zzk(this.zzc);
        String str2 = strZzk == null ? "" : strZzk;
        String strZzl = this.zza.zzl(this.zzc);
        String str3 = strZzl == null ? "" : strZzl;
        String strZzm = this.zza.zzm(this.zzc);
        String str4 = strZzm == null ? "" : strZzm;
        if ("TIME_OUT".equals(str2)) {
            l = (Long) zzbet.zzc().zzc(zzbjl.zzaa);
        } else {
            l = null;
        }
        return new zzerk(str, str2, str3, str4, l);
    }
}
