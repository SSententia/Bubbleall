package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalt {
    private static final ArrayList<zzalr> zza = new ArrayList<>();
    private static final Pattern zzb = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzi(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzi(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    public static boolean zzc(String str, String str2) {
        zzals zzalsVarZzh;
        if (str == null) {
            return false;
        }
        char c = '\n';
        switch (str) {
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null || (zzalsVarZzh = zzh(str2)) == null) {
                    return false;
                }
                int i = zzalsVarZzh.zzb;
                if (i != 2) {
                    if (i == 5) {
                        c = 11;
                    } else if (i == 29) {
                        c = '\f';
                    } else if (i == 42) {
                        c = 16;
                    } else if (i != 22) {
                        c = i != 23 ? (char) 0 : (char) 15;
                    } else {
                        c = CharCompanionObject.MIN_VALUE;
                    }
                }
                return (c == 0 || c == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String zzd(String str) {
        zzals zzalsVarZzh;
        String strZza = zzflf.zza(str.trim());
        if (strZza.startsWith("avc1") || strZza.startsWith("avc3")) {
            return "video/avc";
        }
        if (strZza.startsWith("hev1") || strZza.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strZza.startsWith("dvav") || strZza.startsWith("dva1") || strZza.startsWith("dvhe") || strZza.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strZza.startsWith("av01")) {
            return "video/av01";
        }
        if (strZza.startsWith("vp9") || strZza.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strZza.startsWith("vp8") || strZza.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String strZze = null;
        if (strZza.startsWith("mp4a")) {
            if (strZza.startsWith("mp4a.") && (zzalsVarZzh = zzh(strZza)) != null) {
                strZze = zze(zzalsVarZzh.zza);
            }
            return strZze == null ? "audio/mp4a-latm" : strZze;
        }
        if (strZza.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strZza.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strZza.startsWith("ac-3") || strZza.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strZza.startsWith("ec-3") || strZza.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strZza.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strZza.startsWith("ac-4") || strZza.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strZza.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strZza.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strZza.startsWith("dtsh") || strZza.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strZza.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd";
        }
        if (strZza.startsWith("opus")) {
            return "audio/opus";
        }
        if (strZza.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strZza.startsWith("flac")) {
            return "audio/flac";
        }
        if (strZza.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strZza.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strZza.contains("cea708")) {
            return "application/cea-708";
        }
        if (strZza.contains("eia608") || strZza.contains("cea608")) {
            return "application/cea-608";
        }
        int size = zza.size();
        for (int i = 0; i < size; i++) {
            zzalr zzalrVar = zza.get(i);
            String str2 = zzalrVar.zzb;
            if (strZza.startsWith(null)) {
                String str3 = zzalrVar.zza;
                break;
            }
        }
        return null;
    }

    public static String zze(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case LocationRequest.PRIORITY_NO_POWER /* 105 */:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzi(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zza.size();
        for (int i = 0; i < size; i++) {
            zzalr zzalrVar = zza.get(i);
            String str2 = zzalrVar.zza;
            if (str.equals(null)) {
                int i2 = zzalrVar.zzc;
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public static String zzg(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1007807498) {
            if (iHashCode != -586683234) {
                if (iHashCode == 187090231 && str.equals("audio/mp3")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("audio/x-wav")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("audio/x-flac")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return "audio/flac";
        }
        if (b != 1) {
            return b != 2 ? str : "audio/wav";
        }
        return "audio/mpeg";
    }

    static zzals zzh(String str) {
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzals(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzi(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
