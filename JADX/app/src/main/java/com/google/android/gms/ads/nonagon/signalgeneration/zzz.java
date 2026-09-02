package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzazj;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz {
    private final String zza;

    /* synthetic */ zzz(zzx zzxVar, zzy zzyVar) {
        this.zza = zzxVar.zza;
    }

    public final Set<String> zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzazj zzc() {
        byte b;
        switch (this.zza) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return zzazj.BANNER;
        }
        if (b == 1) {
            return zzazj.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? zzazj.AD_INITIATER_UNSPECIFIED : zzazj.REWARD_BASED_VIDEO_AD;
        }
        return zzazj.AD_LOADER;
    }
}
