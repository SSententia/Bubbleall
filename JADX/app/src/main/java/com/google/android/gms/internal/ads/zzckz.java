package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcla zze;

    zzckz(zzcla zzclaVar, String str, String str2, String str3, String str4) {
        this.zze = zzclaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        map.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            map.put("cachedSrc", this.zzb);
        }
        switch (this.zzc) {
            case "interrupted":
                b = 3;
                break;
            case "badUrl":
                b = 8;
                break;
            case "inProgress":
                b = 2;
                break;
            case "downloadTimeout":
                b = 9;
                break;
            case "contentLengthMissing":
                b = 0;
                break;
            case "playerFailed":
                b = 5;
                break;
            case "sizeExceeded":
                b = 11;
                break;
            case "externalAbort":
                b = 10;
                break;
            case "noop":
                b = 4;
                break;
            case "error":
                b = 1;
                break;
            case "expireFailed":
                b = 6;
                break;
            case "noCacheDir":
                b = 7;
                break;
            default:
                b = -1;
                break;
        }
        String str = "internal";
        switch (b) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        map.put("type", str);
        map.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            map.put("message", this.zzd);
        }
        zzcla.zzs(this.zze, "onPrecacheEvent", map);
    }
}
