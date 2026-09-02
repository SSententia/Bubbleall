package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfc {
    public static String zza(String str, Context context, boolean z) {
        String strZzl;
        if ((((Boolean) zzbet.zzc().zzc(zzbjl.zzag)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzA().zzb(context) || TextUtils.isEmpty(str) || (strZzl = com.google.android.gms.ads.internal.zzt.zzA().zzl(context)) == null) {
            return str;
        }
        String str2 = (String) zzbet.zzc().zzc(zzbjl.zzZ);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzY)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzp(str)) {
                com.google.android.gms.ads.internal.zzt.zzA().zzn(context, strZzl);
                return zzd(str, context).replace(str2, strZzl);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzq(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzA().zzo(context, strZzl);
            return zzd(str, context).replace(str2, strZzl);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzp(str)) {
            com.google.android.gms.ads.internal.zzt.zzA().zzn(context, strZzl);
            return zzc(zzd(str, context), "fbs_aeid", strZzl).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzq(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzo(context, strZzl);
        return zzc(zzd(str, context), "fbs_aeid", strZzl).toString();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzb(context)) {
            return uri.toString();
        }
        String strZzl = com.google.android.gms.ads.internal.zzt.zzA().zzl(context);
        if (strZzl == null) {
            return uri.toString();
        }
        String str = (String) zzbet.zzc().zzc(zzbjl.zzZ);
        String string = uri.toString();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzY)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzA().zzn(context, strZzl);
            return zzd(string, context).replace(str, strZzl);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = zzc(zzd(string, context), "fbs_aeid", strZzl).toString();
        com.google.android.gms.ads.internal.zzt.zzA().zzn(context, strZzl);
        return string2;
    }

    static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    private static String zzd(String str, Context context) {
        String strZzj = com.google.android.gms.ads.internal.zzt.zzA().zzj(context);
        String strZzk = com.google.android.gms.ads.internal.zzt.zzA().zzk(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzj)) {
            str = zzc(str, "gmp_app_id", strZzj).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzk)) ? str : zzc(str, "fbs_aiid", strZzk).toString();
    }
}
