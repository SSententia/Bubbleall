package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarr {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map<String, Integer> zzf;
    private static final zzarg zza = zzarg.zza("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzarl, List<zzarg>> zzc = new HashMap<>();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        zzf = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    public static zzarg zza(String str, boolean z) throws zzarm {
        List<zzarg> listZzb = zzb(str, z);
        if (listZzb.isEmpty()) {
            return null;
        }
        return listZzb.get(0);
    }

    public static synchronized List<zzarg> zzb(String str, boolean z) throws zzarm {
        zzarl zzarlVar = new zzarl(str, z);
        HashMap<zzarl, List<zzarg>> map = zzc;
        List<zzarg> list = map.get(zzarlVar);
        if (list != null) {
            return list;
        }
        List<zzarg> listZze = zze(zzarlVar, zzave.zza >= 21 ? new zzarp(z) : new zzaro(null));
        if (z && listZze.isEmpty() && zzave.zza >= 21 && zzave.zza <= 23) {
            listZze = zze(zzarlVar, new zzaro(null));
            if (!listZze.isEmpty()) {
                String str2 = listZze.get(0).zza;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        List<zzarg> listUnmodifiableList = Collections.unmodifiableList(listZze);
        map.put(zzarlVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static int zzc() throws zzarm {
        if (zzg == -1) {
            int iMax = 0;
            zzarg zzargVarZza = zza("video/avc", false);
            if (zzargVarZza != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzc = zzargVarZza.zzc();
                int length = codecProfileLevelArrZzc.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i = codecProfileLevelArrZzc[iMax].level;
                    int i2 = 25344;
                    if (i != 1 && i != 2) {
                        i2 = 9437184;
                        switch (i) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, zzave.zza >= 21 ? 345600 : 172800);
            }
            zzg = iMax;
        }
        return zzg;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public static Pair<Integer, Integer> zzd(String str) {
        byte b;
        Integer numValueOf;
        Integer numValueOf2;
        String[] strArrSplit = str.split("\\.");
        int i = 2;
        switch (strArrSplit[0]) {
            case "avc1":
                b = 2;
                break;
            case "avc2":
                b = 3;
                break;
            case "hev1":
                b = 0;
                break;
            case "hvc1":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b != 0 && b != 1) {
            if (b != 2 && b != 3) {
                return null;
            }
            int length = strArrSplit.length;
            if (length < 2) {
                Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            try {
                if (strArrSplit[1].length() == 6) {
                    numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                } else {
                    if (length < 3) {
                        Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                        return null;
                    }
                    numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                }
                return new Pair<>(Integer.valueOf(zzd.get(numValueOf.intValue())), Integer.valueOf(zze.get(numValueOf2.intValue())));
            } catch (NumberFormatException unused) {
                Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
        }
        if (strArrSplit.length < 4) {
            Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        Matcher matcher = zzb.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else if (!"2".equals(strGroup)) {
            String strValueOf = String.valueOf(strGroup);
            Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf) : new String("Unknown HEVC profile string: "));
            return null;
        }
        Integer num = zzf.get(strArrSplit[3]);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        String strValueOf2 = String.valueOf(matcher.group(1));
        Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf2) : new String("Unknown HEVC level string: "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    private static List<zzarg> zze(zzarl zzarlVar, zzarn zzarnVar) throws zzarm {
        int i;
        MediaCodecInfo mediaCodecInfo;
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            String str = zzarlVar.zza;
            int iZza = zzarnVar.zza();
            boolean zZzc = zzarnVar.zzc();
            int i2 = 0;
            while (i2 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzarnVar.zzb(i2);
                String name = mediaCodecInfoZzb.getName();
                if (!mediaCodecInfoZzb.isEncoder() && ((zZzc || !name.endsWith(".secure")) && ((zzave.zza >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((zzave.zza >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && ((zzave.zza >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(zzave.zzb)) && ((zzave.zza != 16 || !"OMX.qcom.audio.decoder.mp3".equals(name) || (!"dlxu".equals(zzave.zzb) && !"protou".equals(zzave.zzb) && !"ville".equals(zzave.zzb) && !"villeplus".equals(zzave.zzb) && !"villec2".equals(zzave.zzb) && !zzave.zzb.startsWith("gee") && !"C6602".equals(zzave.zzb) && !"C6603".equals(zzave.zzb) && !"C6606".equals(zzave.zzb) && !"C6616".equals(zzave.zzb) && !"L36h".equals(zzave.zzb) && !"SO-02E".equals(zzave.zzb))) && ((zzave.zza != 16 || !"OMX.qcom.audio.decoder.aac".equals(name) || (!"C1504".equals(zzave.zzb) && !"C1505".equals(zzave.zzb) && !"C1604".equals(zzave.zzb) && !"C1605".equals(zzave.zzb))) && ((zzave.zza > 19 || !"OMX.SEC.vp8.dec".equals(name) || !"samsung".equals(zzave.zzc) || (!zzave.zzb.startsWith("d2") && !zzave.zzb.startsWith("serrano") && !zzave.zzb.startsWith("jflte") && !zzave.zzb.startsWith("santos") && !zzave.zzb.startsWith("t0"))) && (zzave.zza > 19 || !zzave.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)))))))))) {
                    String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str2 = supportedTypes[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd = zzarnVar.zzd(str, capabilitiesForType);
                                i = iZza;
                                mediaCodecInfo = mediaCodecInfoZzb;
                                if (zzave.zza <= 22) {
                                    try {
                                        if ((zzave.zzd.equals("ODROID-XU3") || zzave.zzd.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        if (zzave.zza <= 23 || arrayList.isEmpty()) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(str2).length());
                                            sb.append("Failed to query codec ");
                                            sb.append(name);
                                            sb.append(" (");
                                            sb.append(str2);
                                            sb.append(")");
                                            Log.e("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 46);
                                        sb2.append("Skipping codec ");
                                        sb2.append(name);
                                        sb2.append(" (failed to query capabilities)");
                                        Log.e("MediaCodecUtil", sb2.toString());
                                        i3++;
                                        zzarnVar = zzarnVar;
                                        iZza = i;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                } else {
                                    z = false;
                                }
                                if (zZzc && zzarlVar.zzb == zZzd) {
                                    arrayList.add(zzarg.zzb(name, str, capabilitiesForType, z, false));
                                } else if (!zZzc && !zzarlVar.zzb) {
                                    try {
                                        arrayList.add(zzarg.zzb(name, str, capabilitiesForType, z, false));
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (zzave.zza <= 23) {
                                        }
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(str2).length());
                                        sb3.append("Failed to query codec ");
                                        sb3.append(name);
                                        sb3.append(" (");
                                        sb3.append(str2);
                                        sb3.append(")");
                                        Log.e("MediaCodecUtil", sb3.toString());
                                        throw e;
                                    }
                                } else if (!zZzc && zZzd) {
                                    arrayList.add(zzarg.zzb(String.valueOf(name).concat(".secure"), str, capabilitiesForType, z, true));
                                    return arrayList;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i = iZza;
                                mediaCodecInfo = mediaCodecInfoZzb;
                            }
                        } else {
                            i = iZza;
                            mediaCodecInfo = mediaCodecInfoZzb;
                        }
                        i3++;
                        zzarnVar = zzarnVar;
                        iZza = i;
                        mediaCodecInfoZzb = mediaCodecInfo;
                    }
                }
                i2++;
                iZza = iZza;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzarm(e4, null);
        }
    }
}
