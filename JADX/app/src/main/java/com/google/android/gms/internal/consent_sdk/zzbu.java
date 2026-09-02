package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbu {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final /* synthetic */ int[] zzo = {1, 2, 3};
    public static final int zzd = 1;
    public static final int zze = 2;
    public static final int zzf = 3;
    private static final /* synthetic */ int[] zzp = {1, 2, 3};
    public static final int zzg = 1;
    public static final int zzh = 2;
    public static final int zzi = 3;
    public static final int zzj = 4;
    public static final int zzk = 5;
    public static final int zzl = 6;
    public static final int zzm = 7;
    public static final int zzn = 8;
    private static final /* synthetic */ int[] zzq = {1, 2, 3, 4, 5, 6, 7, 8};

    public static int[] zza() {
        return (int[]) zzo.clone();
    }

    public static void zza(int i, JsonWriter jsonWriter) throws IOException {
        if (i == 0) {
            throw null;
        }
        int i2 = zzbq.zza[i - 1];
        if (i2 == 1) {
            jsonWriter.value("UNKNOWN");
        } else if (i2 == 2) {
            jsonWriter.value("ANDROID");
        } else {
            if (i2 != 3) {
                return;
            }
            jsonWriter.value("IOS");
        }
    }

    public static int[] zzb() {
        return (int[]) zzp.clone();
    }

    public static int zza(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        strNextString.hashCode();
        switch (strNextString) {
            case "CLEAR":
                return zzf;
            case "WRITE":
                return zze;
            case "UNKNOWN_ACTION_TYPE":
                return zzd;
            default:
                String strValueOf = String.valueOf(strNextString);
                throw new IOException(strValueOf.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strValueOf) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
        }
    }

    public static int[] zzc() {
        return (int[]) zzq.clone();
    }

    public static int zzb(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        strNextString.hashCode();
        switch (strNextString) {
            case "CONSENT_SIGNAL_COLLECT_CONSENT":
                return zzk;
            case "CONSENT_SIGNAL_ERROR":
                return zzm;
            case "CONSENT_SIGNAL_UNKNOWN":
                return zzg;
            case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                return zzi;
            case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                return zzn;
            case "CONSENT_SIGNAL_SUFFICIENT":
                return zzj;
            case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                return zzh;
            case "CONSENT_SIGNAL_NOT_REQUIRED":
                return zzl;
            default:
                String strValueOf = String.valueOf(strNextString);
                throw new IOException(strValueOf.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strValueOf) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
        }
    }
}
