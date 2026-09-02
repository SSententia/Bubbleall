package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzfal;
import com.google.android.gms.internal.ads.zzfar;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public static boolean zza(zzfal zzfalVar) {
        if (!zze(zzfalVar)) {
            return false;
        }
        zzbdg zzbdgVar = zzfalVar.zza.zza.zzd;
        return (zzbdgVar.zzs == null && zzbdgVar.zzx == null) ? false : true;
    }

    public static String zzb(zzfal zzfalVar) {
        return !zze(zzfalVar) ? "" : zzfalVar.zza.zza.zzd.zzp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    public static String zzc(zzfal zzfalVar) {
        if (!zze(zzfalVar)) {
            return "unspecified";
        }
        String strZzd = zzd(zzfalVar.zza.zza);
        if (TextUtils.isEmpty(strZzd)) {
            return "unspecified";
        }
        switch (strZzd) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            default:
                return strZzd;
        }
    }

    public static String zzd(zzfar zzfarVar) {
        Bundle bundle = zzfarVar.zzd.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    private static boolean zze(zzfal zzfalVar) {
        return zzfalVar != null;
    }
}
