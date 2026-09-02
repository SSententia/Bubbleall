package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpx implements zzbpr<Object> {
    private final Context zza;

    public zzbpx(Context context) {
        this.zza = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        byte b;
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zza)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                com.google.android.gms.ads.internal.zzt.zzA().zzn(this.zza, str2);
                return;
            }
            if (b == 1) {
                com.google.android.gms.ads.internal.zzt.zzA().zzo(this.zza, str2);
            } else if (b != 2) {
                com.google.android.gms.ads.internal.util.zze.zzf("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzt.zzA().zzq(this.zza, str2);
            }
        }
    }
}
