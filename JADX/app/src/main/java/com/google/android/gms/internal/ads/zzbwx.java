package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbwx {
    public static int zza(AdRequest.ErrorCode errorCode) {
        AdRequest.ErrorCode errorCode2 = AdRequest.ErrorCode.INVALID_REQUEST;
        AdRequest.Gender gender = AdRequest.Gender.UNKNOWN;
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 0 : 2;
        }
        return 3;
    }

    public static MediationAdRequest zzb(zzbdg zzbdgVar, boolean z) {
        AdRequest.Gender gender;
        List<String> list = zzbdgVar.zze;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzbdgVar.zzb);
        int i = zzbdgVar.zzd;
        if (i != 1) {
            gender = i != 2 ? AdRequest.Gender.UNKNOWN : AdRequest.Gender.FEMALE;
        } else {
            gender = AdRequest.Gender.MALE;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzbdgVar.zzk);
    }
}
