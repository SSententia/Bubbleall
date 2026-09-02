package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbm {
    public static zzbcz zza(Throwable th) {
        if (th instanceof zzeeg) {
            zzeeg zzeegVar = (zzeeg) th;
            return zzc(zzeegVar.zza(), zzeegVar.zzb());
        }
        if (th instanceof zzdym) {
            return th.getMessage() == null ? zzd(((zzdym) th).zza(), null, null) : zzd(((zzdym) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzbb)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) th;
        return new zzbcz(zzbbVar.zza(), zzfmi.zza(zzbbVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static zzbcz zzb(Throwable th, zzeeh zzeehVar) {
        zzbcz zzbczVar;
        zzbcz zzbczVarZza = zza(th);
        int i = zzbczVarZza.zza;
        if ((i == 3 || i == 0) && (zzbczVar = zzbczVarZza.zzd) != null && !zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzbczVarZza.zzd = null;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue() && zzeehVar != null) {
            zzbczVarZza.zze = zzeehVar.zzd();
        }
        return zzbczVarZza;
    }

    public static zzbcz zzc(int i, zzbcz zzbczVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) zzbet.zzc().zzc(zzbjl.zzfU)).intValue() > 0) {
                return zzbczVar;
            }
            i = 8;
        }
        return zzd(i, null, zzbczVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    public static zzbcz zzd(int i, String str, zzbcz zzbczVar) {
        String str2;
        int i2;
        String str3;
        if (str == null) {
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    str2 = str;
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    str2 = str;
                    break;
                case 4:
                    str = "Network error.";
                    str2 = str;
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    str2 = str;
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    str2 = str;
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    str2 = str;
                    break;
                case 8:
                    str = "The ad is not ready.";
                    str2 = str;
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    str2 = str;
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    str2 = str;
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    str2 = str;
                    break;
                case 12:
                    if (((Integer) zzbet.zzc().zzc(zzbjl.zzfY)).intValue() > 0) {
                        str2 = "No fill.";
                    } else {
                        str = "The mediation adapter did not return an ad.";
                        str2 = str;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    str2 = str;
                    break;
                case 14:
                    str = "Invalid ad string.";
                    str2 = str;
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    str2 = str;
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    str2 = str;
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    str2 = str;
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    str2 = str;
                    break;
            }
        } else {
            str2 = str;
        }
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i5 = 0;
        switch (i4) {
            case 0:
            case 11:
            case 15:
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i5 = 1;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 2:
            case 10:
            case 18:
                i5 = 3;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 3:
                i2 = 8;
                i5 = i2;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 4:
            case 8:
            case 17:
                i5 = 2;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 7:
                i2 = 4;
                i5 = i2;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 12:
                if (((Integer) zzbet.zzc().zzc(zzbjl.zzfY)).intValue() <= 0) {
                    i2 = 9;
                    i5 = i2;
                } else {
                    i5 = 3;
                }
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 13:
                i2 = 10;
                i5 = i2;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            case 14:
                i2 = 11;
                i5 = i2;
                return new zzbcz(i5, str2, MobileAds.ERROR_DOMAIN, zzbczVar, null);
            default:
                switch (i) {
                    case 1:
                        str3 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str3 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str3 = "NO_FILL";
                        break;
                    case 4:
                        str3 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str3 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str3 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str3 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str3 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str3 = "NOT_READY";
                        break;
                    case 10:
                        str3 = "AD_REUSED";
                        break;
                    case 11:
                        str3 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str3 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str3 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str3 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str3 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str3 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str3));
        }
    }
}
