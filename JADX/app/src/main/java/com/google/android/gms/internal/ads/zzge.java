package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzge {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzfx, List<zzfo>> zzc = new HashMap<>();
    private static int zzd = -1;

    public static zzfo zza() throws zzfy {
        return zzb("audio/raw", false, false);
    }

    public static zzfo zzb(String str, boolean z, boolean z2) throws zzfy {
        List<zzfo> listZzc = zzc(str, false, false);
        if (listZzc.isEmpty()) {
            return null;
        }
        return listZzc.get(0);
    }

    public static synchronized List<zzfo> zzc(String str, boolean z, boolean z2) throws zzfy {
        zzfx zzfxVar = new zzfx(str, z, z2);
        HashMap<zzfx, List<zzfo>> map = zzc;
        List<zzfo> list = map.get(zzfxVar);
        if (list != null) {
            return list;
        }
        ArrayList<zzfo> arrayListZzg = zzg(zzfxVar, zzamq.zza >= 21 ? new zzgb(z, z2) : new zzga(null));
        if (z && arrayListZzg.isEmpty() && zzamq.zza >= 21 && zzamq.zza <= 23) {
            arrayListZzg = zzg(zzfxVar, new zzga(null));
            if (!arrayListZzg.isEmpty()) {
                String str2 = arrayListZzg.get(0).zza;
                StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        if ("audio/raw".equals(str)) {
            if (zzamq.zza < 26 && zzamq.zzb.equals("R9") && arrayListZzg.size() == 1 && arrayListZzg.get(0).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzg.add(zzfo.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzi(arrayListZzg, zzfu.zza);
        }
        if (zzamq.zza < 21 && arrayListZzg.size() > 1) {
            String str3 = arrayListZzg.get(0).zza;
            if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                zzi(arrayListZzg, zzfv.zza);
            }
        }
        if (zzamq.zza < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(arrayListZzg.get(0).zza)) {
            arrayListZzg.add(arrayListZzg.remove(0));
        }
        List<zzfo> listUnmodifiableList = Collections.unmodifiableList(arrayListZzg);
        map.put(zzfxVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static List<zzfo> zzd(List<zzfo> list, final zzafv zzafvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzgd(zzafvVar) { // from class: com.google.android.gms.internal.ads.zzft
            private final zzafv zza;

            {
                this.zza = zzafvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzgd
            public final int zza(Object obj) {
                zzafv zzafvVar2 = this.zza;
                zzfo zzfoVar = (zzfo) obj;
                int i = zzge.zza;
                try {
                    return !zzfoVar.zzc(zzafvVar2) ? 0 : 1;
                } catch (zzfy unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static int zze() throws zzfy {
        int i;
        if (zzd == -1) {
            int iMax = 0;
            zzfo zzfoVarZzb = zzb("video/avc", false, false);
            if (zzfoVarZzb != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzfoVarZzb.zzb();
                int length = codecProfileLevelArrZzb.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArrZzb[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, zzamq.zza >= 21 ? 345600 : 172800);
            }
            zzd = iMax;
        }
        return zzd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x027a  */
    /* JADX WARN: Code duplicated, block: B:197:0x02fd A[Catch: NumberFormatException -> 0x030d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x030d, blocks: (B:168:0x02a6, B:170:0x02b8, B:181:0x02d4, B:197:0x02fd), top: B:557:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:290:0x049a  */
    /* JADX WARN: Code duplicated, block: B:372:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:515:0x0834  */
    /* JADX WARN: Code duplicated, block: B:516:0x0849  */
    /* JADX WARN: Code duplicated, block: B:517:0x084c  */
    /* JADX WARN: Code duplicated, block: B:518:0x084f  */
    /* JADX WARN: Code duplicated, block: B:519:0x0852  */
    /* JADX WARN: Code duplicated, block: B:520:0x0855  */
    /* JADX WARN: Code duplicated, block: B:521:0x0858  */
    /* JADX WARN: Code duplicated, block: B:522:0x085a  */
    /* JADX WARN: Code duplicated, block: B:523:0x085d  */
    /* JADX WARN: Code duplicated, block: B:524:0x0861  */
    /* JADX WARN: Code duplicated, block: B:525:0x0864  */
    /* JADX WARN: Code duplicated, block: B:526:0x0867  */
    /* JADX WARN: Code duplicated, block: B:527:0x0869  */
    /* JADX WARN: Code duplicated, block: B:528:0x086c  */
    /* JADX WARN: Code duplicated, block: B:529:0x086e  */
    /* JADX WARN: Code duplicated, block: B:530:0x0870  */
    /* JADX WARN: Code duplicated, block: B:531:0x0872  */
    /* JADX WARN: Code duplicated, block: B:532:0x0874  */
    /* JADX WARN: Code duplicated, block: B:533:0x0877  */
    /* JADX WARN: Code duplicated, block: B:534:0x0879  */
    /* JADX WARN: Code duplicated, block: B:535:0x087b  */
    /* JADX WARN: Code duplicated, block: B:536:0x087e  */
    /* JADX WARN: Code duplicated, block: B:537:0x0880  */
    /* JADX WARN: Code duplicated, block: B:540:0x0884  */
    /* JADX WARN: Code duplicated, block: B:541:0x089a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v109 int, still in use, count: 1, list:
  (r1v109 int) from 0x0150: SWITCH (r1v109 int)
 case 1567: goto B:93:0x0182
 case 1568: goto B:90:0x0172
 case 1569: goto B:87:0x0162
 case 1570: goto B:84:0x0154
 default: goto B:79:0x0146 A[RegionRef:SW:82]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair<Integer, Integer> zzf(zzafv zzafvVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer num2;
        Integer num3;
        String str = zzafvVar.zzi;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i14 = 2;
        int i15 = 1;
        if ("video/dolby-vision".equals(zzafvVar.zzl)) {
            String str2 = zzafvVar.zzi;
            if (strArrSplit.length < 3) {
                String strValueOf = String.valueOf(str2);
                Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            } else {
                Matcher matcher = zzb.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                num2 = 1;
                                break;
                            case "01":
                                num2 = 2;
                                break;
                            case "02":
                                num2 = 4;
                                break;
                            case "03":
                                num2 = 8;
                                break;
                            case "04":
                                num2 = 16;
                                break;
                            case "05":
                                num2 = 32;
                                break;
                            case "06":
                                num2 = 64;
                                break;
                            case "07":
                                num2 = 128;
                                break;
                            case "08":
                                num2 = 256;
                                break;
                            case "09":
                                num2 = 512;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        String strValueOf2 = String.valueOf(strGroup);
                        Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf2) : new String("Unknown Dolby Vision profile string: "));
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    num3 = 1;
                                    break;
                                case "02":
                                    num3 = 2;
                                    break;
                                case "03":
                                    num3 = 4;
                                    break;
                                case "04":
                                    num3 = 8;
                                    break;
                                case "05":
                                    num3 = 16;
                                    break;
                                case "06":
                                    num3 = 32;
                                    break;
                                case "07":
                                    num3 = 64;
                                    break;
                                case "08":
                                    num3 = 128;
                                    break;
                                case "09":
                                    num3 = 256;
                                    break;
                                default:
                                    switch (str3) {
                                        case 1567:
                                            if (!str3.equals("10")) {
                                                num3 = null;
                                            } else {
                                                num3 = 512;
                                            }
                                            break;
                                        case 1568:
                                            if (!str3.equals("11")) {
                                                num3 = null;
                                            } else {
                                                num3 = 1024;
                                            }
                                            break;
                                        case 1569:
                                            if (!str3.equals("12")) {
                                                num3 = null;
                                            } else {
                                                num3 = 2048;
                                            }
                                            break;
                                        case 1570:
                                            if (!str3.equals("13")) {
                                                num3 = null;
                                            } else {
                                                num3 = 4096;
                                            }
                                            break;
                                        default:
                                            num3 = null;
                                            break;
                                    }
                            }
                        } else {
                            num3 = null;
                        }
                        if (num3 != null) {
                            return new Pair<>(num2, num3);
                        }
                        String strValueOf3 = String.valueOf(str3);
                        Log.w("MediaCodecUtil", strValueOf3.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf3) : new String("Unknown Dolby Vision level string: "));
                    }
                } else {
                    String strValueOf4 = String.valueOf(str2);
                    Log.w("MediaCodecUtil", strValueOf4.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf4) : new String("Ignoring malformed Dolby Vision codec string: "));
                }
            }
            return null;
        }
        switch (strArrSplit[0]) {
            case "avc1":
            case "avc2":
                String str4 = zzafvVar.zzi;
                int length = strArrSplit.length;
                if (length < 2) {
                    String strValueOf5 = String.valueOf(str4);
                    Log.w("MediaCodecUtil", strValueOf5.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf5) : new String("Ignoring malformed AVC codec string: "));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i = 16;
                            i2 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i3 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            i = 16;
                            if (length >= 3) {
                                i2 = Integer.parseInt(strArrSplit[1]);
                                i3 = Integer.parseInt(strArrSplit[2]);
                            } else {
                                String strValueOf6 = String.valueOf(str4);
                                Log.w("MediaCodecUtil", strValueOf6.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf6) : new String("Ignoring malformed AVC codec string: "));
                            }
                        }
                        if (i2 != 66) {
                            if (i2 != 77) {
                                if (i2 == 88) {
                                    i14 = 4;
                                } else if (i2 == 100) {
                                    i4 = -1;
                                    i14 = 8;
                                } else if (i2 == 110) {
                                    i14 = i;
                                } else if (i2 == 122) {
                                    i14 = 32;
                                } else if (i2 != 244) {
                                    i4 = -1;
                                    i14 = -1;
                                } else {
                                    i14 = 64;
                                }
                            }
                            if (i14 == i4) {
                                StringBuilder sb = new StringBuilder(32);
                                sb.append("Unknown AVC profile: ");
                                sb.append(i2);
                                Log.w("MediaCodecUtil", sb.toString());
                            } else {
                                switch (i3) {
                                    case 10:
                                        i5 = 1;
                                        break;
                                    case 11:
                                        i5 = 4;
                                        break;
                                    case 12:
                                        i5 = 8;
                                        break;
                                    case 13:
                                        i5 = i;
                                        break;
                                    default:
                                        switch (i3) {
                                            case 20:
                                                i5 = 32;
                                                break;
                                            case 21:
                                                i5 = 64;
                                                break;
                                            case 22:
                                                i5 = 128;
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 30:
                                                        i5 = 256;
                                                        break;
                                                    case 31:
                                                        i5 = 512;
                                                        break;
                                                    case 32:
                                                        i5 = 1024;
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 40:
                                                                i5 = 2048;
                                                                break;
                                                            case 41:
                                                                i5 = 4096;
                                                                break;
                                                            case 42:
                                                                i5 = 8192;
                                                                break;
                                                            default:
                                                                switch (i3) {
                                                                    case 50:
                                                                        i5 = 16384;
                                                                        break;
                                                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                        i5 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i5 = 65536;
                                                                        break;
                                                                    default:
                                                                        i5 = -1;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                if (i5 == -1) {
                                    return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i5));
                                }
                                StringBuilder sb2 = new StringBuilder(30);
                                sb2.append("Unknown AVC level: ");
                                sb2.append(i3);
                                Log.w("MediaCodecUtil", sb2.toString());
                            }
                        } else {
                            i14 = 1;
                        }
                        i4 = -1;
                        if (i14 == i4) {
                            StringBuilder sb3 = new StringBuilder(32);
                            sb3.append("Unknown AVC profile: ");
                            sb3.append(i2);
                            Log.w("MediaCodecUtil", sb3.toString());
                        } else {
                            switch (i3) {
                                case 10:
                                    i5 = 1;
                                    break;
                                case 11:
                                    i5 = 4;
                                    break;
                                case 12:
                                    i5 = 8;
                                    break;
                                case 13:
                                    i5 = i;
                                    break;
                                default:
                                    switch (i3) {
                                        case 20:
                                            i5 = 32;
                                            break;
                                        case 21:
                                            i5 = 64;
                                            break;
                                        case 22:
                                            i5 = 128;
                                            break;
                                        default:
                                            switch (i3) {
                                                case 30:
                                                    i5 = 256;
                                                    break;
                                                case 31:
                                                    i5 = 512;
                                                    break;
                                                case 32:
                                                    i5 = 1024;
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 40:
                                                            i5 = 2048;
                                                            break;
                                                        case 41:
                                                            i5 = 4096;
                                                            break;
                                                        case 42:
                                                            i5 = 8192;
                                                            break;
                                                        default:
                                                            switch (i3) {
                                                                case 50:
                                                                    i5 = 16384;
                                                                    break;
                                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                    i5 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i5 = 65536;
                                                                    break;
                                                                default:
                                                                    i5 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i5 == -1) {
                                return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i5));
                            }
                            StringBuilder sb4 = new StringBuilder(30);
                            sb4.append("Unknown AVC level: ");
                            sb4.append(i3);
                            Log.w("MediaCodecUtil", sb4.toString());
                        }
                    } catch (NumberFormatException unused) {
                        String strValueOf7 = String.valueOf(str4);
                        Log.w("MediaCodecUtil", strValueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf7) : new String("Ignoring malformed AVC codec string: "));
                    }
                }
                return null;
            case "vp09":
                String str5 = zzafvVar.zzi;
                if (strArrSplit.length < 3) {
                    String strValueOf8 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf8.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf8) : new String("Ignoring malformed VP9 codec string: "));
                } else {
                    try {
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2]);
                        if (i16 == 0) {
                            i6 = 1;
                        } else if (i16 == 1) {
                            i6 = 2;
                        } else if (i16 != 2) {
                            i6 = i16 != 3 ? -1 : 8;
                        } else {
                            i6 = 4;
                        }
                        if (i6 == -1) {
                            StringBuilder sb5 = new StringBuilder(32);
                            sb5.append("Unknown VP9 profile: ");
                            sb5.append(i16);
                            Log.w("MediaCodecUtil", sb5.toString());
                        } else {
                            if (i17 == 10) {
                                i7 = -1;
                            } else {
                                if (i17 == 11) {
                                    i15 = 2;
                                } else if (i17 == 20) {
                                    i15 = 4;
                                } else if (i17 == 21) {
                                    i15 = 8;
                                } else if (i17 == 30) {
                                    i7 = -1;
                                    i15 = 16;
                                } else if (i17 == 31) {
                                    i15 = 32;
                                } else if (i17 == 40) {
                                    i15 = 64;
                                } else if (i17 == 41) {
                                    i15 = 128;
                                } else if (i17 == 50) {
                                    i15 = 256;
                                } else if (i17 != 51) {
                                    switch (i17) {
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                            i7 = -1;
                                            i15 = 2048;
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            i15 = 4096;
                                            break;
                                        case 62:
                                            i15 = 8192;
                                            break;
                                        default:
                                            i7 = -1;
                                            i15 = -1;
                                            break;
                                    }
                                } else {
                                    i15 = 512;
                                }
                                i7 = -1;
                            }
                            if (i15 != i7) {
                                return new Pair<>(Integer.valueOf(i6), Integer.valueOf(i15));
                            }
                            StringBuilder sb6 = new StringBuilder(30);
                            sb6.append("Unknown VP9 level: ");
                            sb6.append(i17);
                            Log.w("MediaCodecUtil", sb6.toString());
                        }
                    } catch (NumberFormatException unused2) {
                        String strValueOf9 = String.valueOf(str5);
                        Log.w("MediaCodecUtil", strValueOf9.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf9) : new String("Ignoring malformed VP9 codec string: "));
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                String str6 = zzafvVar.zzi;
                if (strArrSplit.length < 4) {
                    String strValueOf10 = String.valueOf(str6);
                    Log.w("MediaCodecUtil", strValueOf10.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf10) : new String("Ignoring malformed HEVC codec string: "));
                } else {
                    Matcher matcher2 = zzb.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i8 = 1;
                        } else if ("2".equals(strGroup2)) {
                            i8 = 2;
                        } else {
                            String strValueOf11 = String.valueOf(strGroup2);
                            Log.w("MediaCodecUtil", strValueOf11.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf11) : new String("Unknown HEVC profile string: "));
                        }
                        String str7 = strArrSplit[3];
                        if (str7 != null) {
                            switch (str7) {
                                case "L30":
                                    num = 1;
                                    break;
                                case "L60":
                                    num = 4;
                                    break;
                                case "L63":
                                    num = 16;
                                    break;
                                case "L90":
                                    num = 64;
                                    break;
                                case "L93":
                                    num = 256;
                                    break;
                                case "L120":
                                    num = 1024;
                                    break;
                                case "L123":
                                    num = 4096;
                                    break;
                                case "L150":
                                    num = 16384;
                                    break;
                                case "L153":
                                    num = 65536;
                                    break;
                                case "L156":
                                    num = 262144;
                                    break;
                                case "L180":
                                    num = 1048576;
                                    break;
                                case "L183":
                                    num = 4194304;
                                    break;
                                case "L186":
                                    num = 16777216;
                                    break;
                                case "H30":
                                    num = 2;
                                    break;
                                case "H60":
                                    num = 8;
                                    break;
                                case "H63":
                                    num = 32;
                                    break;
                                case "H90":
                                    num = 128;
                                    break;
                                case "H93":
                                    num = 512;
                                    break;
                                case "H120":
                                    num = 2048;
                                    break;
                                case "H123":
                                    num = 8192;
                                    break;
                                case "H150":
                                    num = 32768;
                                    break;
                                case "H153":
                                    num = 131072;
                                    break;
                                case "H156":
                                    num = 524288;
                                    break;
                                case "H180":
                                    num = 2097152;
                                    break;
                                case "H183":
                                    num = 8388608;
                                    break;
                                case "H186":
                                    num = 33554432;
                                    break;
                                default:
                                    num = null;
                                    break;
                            }
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return new Pair<>(Integer.valueOf(i8), num);
                        }
                        String strValueOf12 = String.valueOf(str7);
                        Log.w("MediaCodecUtil", strValueOf12.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf12) : new String("Unknown HEVC level string: "));
                    } else {
                        String strValueOf13 = String.valueOf(str6);
                        Log.w("MediaCodecUtil", strValueOf13.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf13) : new String("Ignoring malformed HEVC codec string: "));
                    }
                }
                return null;
            case "av01":
                String str8 = zzafvVar.zzi;
                zzj zzjVar = zzafvVar.zzx;
                if (strArrSplit.length < 4) {
                    String strValueOf14 = String.valueOf(str8);
                    Log.w("MediaCodecUtil", strValueOf14.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf14) : new String("Ignoring malformed AV1 codec string: "));
                } else {
                    try {
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        int i19 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i20 = Integer.parseInt(strArrSplit[3]);
                        if (i18 != 0) {
                            StringBuilder sb7 = new StringBuilder(32);
                            sb7.append("Unknown AV1 profile: ");
                            sb7.append(i18);
                            Log.w("MediaCodecUtil", sb7.toString());
                        } else {
                            if (i20 == 8) {
                                i9 = 1;
                            } else if (i20 != 10) {
                                StringBuilder sb8 = new StringBuilder(34);
                                sb8.append("Unknown AV1 bit depth: ");
                                sb8.append(i20);
                                Log.w("MediaCodecUtil", sb8.toString());
                            } else {
                                i9 = (zzjVar == null || !(zzjVar.zzd != null || (i11 = zzjVar.zzc) == 7 || i11 == 6)) ? 2 : 4096;
                            }
                            switch (i19) {
                                case 0:
                                    i10 = 1;
                                    break;
                                case 1:
                                    i10 = 2;
                                    break;
                                case 2:
                                    i10 = 4;
                                    break;
                                case 3:
                                    i10 = 8;
                                    break;
                                case 4:
                                    i10 = 16;
                                    break;
                                case 5:
                                    i10 = 32;
                                    break;
                                case 6:
                                    i10 = 64;
                                    break;
                                case 7:
                                    i10 = 128;
                                    break;
                                case 8:
                                    i10 = 256;
                                    break;
                                case 9:
                                    i10 = 512;
                                    break;
                                case 10:
                                    i10 = 1024;
                                    break;
                                case 11:
                                    i10 = 2048;
                                    break;
                                case 12:
                                    i10 = 4096;
                                    break;
                                case 13:
                                    i10 = 8192;
                                    break;
                                case 14:
                                    i10 = 16384;
                                    break;
                                case 15:
                                    i10 = 32768;
                                    break;
                                case 16:
                                    i10 = 65536;
                                    break;
                                case 17:
                                    i10 = 131072;
                                    break;
                                case 18:
                                    i10 = 262144;
                                    break;
                                case 19:
                                    i10 = 524288;
                                    break;
                                case 20:
                                    i10 = 1048576;
                                    break;
                                case 21:
                                    i10 = 2097152;
                                    break;
                                case 22:
                                    i10 = 4194304;
                                    break;
                                case 23:
                                    i10 = 8388608;
                                    break;
                                default:
                                    i10 = -1;
                                    break;
                            }
                            if (i10 != -1) {
                                return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i10));
                            }
                            StringBuilder sb9 = new StringBuilder(30);
                            sb9.append("Unknown AV1 level: ");
                            sb9.append(i19);
                            Log.w("MediaCodecUtil", sb9.toString());
                        }
                    } catch (NumberFormatException unused3) {
                        String strValueOf15 = String.valueOf(str8);
                        Log.w("MediaCodecUtil", strValueOf15.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf15) : new String("Ignoring malformed AV1 codec string: "));
                    }
                }
                return null;
            case "mp4a":
                String str9 = zzafvVar.zzi;
                if (strArrSplit.length != 3) {
                    String strValueOf16 = String.valueOf(str9);
                    Log.w("MediaCodecUtil", strValueOf16.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf16) : new String("Ignoring malformed MP4A codec string: "));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzalt.zze(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i21 = Integer.parseInt(strArrSplit[2]);
                            if (i21 == 17) {
                                i12 = 17;
                            } else if (i21 == 20) {
                                i12 = 20;
                            } else if (i21 == 23) {
                                i12 = 23;
                            } else if (i21 == 29) {
                                i12 = 29;
                            } else if (i21 == 39) {
                                i12 = 39;
                            } else if (i21 != 42) {
                                switch (i21) {
                                    case 1:
                                        i12 = 1;
                                        break;
                                    case 2:
                                        i12 = 2;
                                        break;
                                    case 3:
                                        i13 = -1;
                                        i12 = 3;
                                        break;
                                    case 4:
                                        i12 = 4;
                                        break;
                                    case 5:
                                        i13 = -1;
                                        i12 = 5;
                                        break;
                                    case 6:
                                        i13 = -1;
                                        i12 = 6;
                                        break;
                                    default:
                                        i13 = -1;
                                        i12 = -1;
                                        break;
                                }
                                if (i12 != i13) {
                                    return new Pair<>(Integer.valueOf(i12), 0);
                                }
                            } else {
                                i12 = 42;
                            }
                            i13 = -1;
                            if (i12 != i13) {
                                return new Pair<>(Integer.valueOf(i12), 0);
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        String strValueOf17 = String.valueOf(str9);
                        Log.w("MediaCodecUtil", strValueOf17.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf17) : new String("Ignoring malformed MP4A codec string: "));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02a2 A[EDGE_INSN: B:159:0x02a2->B:160:0x02a3 BREAK  A[LOOP:1: B:133:0x0247->B:137:0x0253]] */
    /* JADX WARN: Code duplicated, block: B:169:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d7 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x02dd A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f2 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x02f7 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0307 A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x031a  */
    /* JADX WARN: Code duplicated, block: B:192:0x031e A[Catch: Exception -> 0x0368, TryCatch #0 {Exception -> 0x0368, blocks: (B:161:0x02a5, B:167:0x02bc, B:173:0x02d1, B:175:0x02d7, B:180:0x02e8, B:182:0x02f2, B:192:0x031e, B:195:0x0324, B:183:0x02f7, B:185:0x0307, B:187:0x030f, B:176:0x02dd), top: B:221:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x03d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static ArrayList<zzfo> zzg(zzfx zzfxVar, zzfz zzfzVar) throws zzfy {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        boolean zZzd;
        boolean zZze;
        boolean zIsHardwareAccelerated;
        String strZza;
        boolean zIsVendor;
        try {
            ArrayList<zzfo> arrayList = new ArrayList<>();
            String str5 = zzfxVar.zza;
            boolean zZzc = zzfzVar.zzc();
            int i3 = 0;
            for (int iZza = zzfzVar.zza(); i3 < iZza; iZza = i2) {
                MediaCodecInfo mediaCodecInfoZzb = zzfzVar.zzb(i3);
                if (zzamq.zza < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZzc && name.endsWith(".secure")) || ((zzamq.zza < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) || ((zzamq.zza < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name) && ("a70".equals(zzamq.zzb) || ("Xiaomi".equals(zzamq.zzc) && zzamq.zzb.startsWith("HM")))) || ((zzamq.zza == 16 && "OMX.qcom.audio.decoder.mp3".equals(name) && ("dlxu".equals(zzamq.zzb) || "protou".equals(zzamq.zzb) || "ville".equals(zzamq.zzb) || "villeplus".equals(zzamq.zzb) || "villec2".equals(zzamq.zzb) || zzamq.zzb.startsWith("gee") || "C6602".equals(zzamq.zzb) || "C6603".equals(zzamq.zzb) || "C6606".equals(zzamq.zzb) || "C6616".equals(zzamq.zzb) || "L36h".equals(zzamq.zzb) || "SO-02E".equals(zzamq.zzb))) || ((zzamq.zza == 16 && "OMX.qcom.audio.decoder.aac".equals(name) && ("C1504".equals(zzamq.zzb) || "C1505".equals(zzamq.zzb) || "C1604".equals(zzamq.zzb) || "C1605".equals(zzamq.zzb))) || ((zzamq.zza < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzamq.zzc) && (zzamq.zzb.startsWith("zeroflte") || zzamq.zzb.startsWith("zerolte") || zzamq.zzb.startsWith("zenlte") || "SC-05G".equals(zzamq.zzb) || "marinelteatt".equals(zzamq.zzb) || "404SC".equals(zzamq.zzb) || "SC-04G".equals(zzamq.zzb) || "SCV31".equals(zzamq.zzb)))) || ((zzamq.zza <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzamq.zzc) && (zzamq.zzb.startsWith("d2") || zzamq.zzb.startsWith("serrano") || zzamq.zzb.startsWith("jflte") || zzamq.zzb.startsWith("santos") || zzamq.zzb.startsWith("t0"))) || ((zzamq.zza <= 19 && zzamq.zzb.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) || ("audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))))))))) {
                        i = i3;
                        i2 = iZza;
                        str4 = str5;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (!str.equalsIgnoreCase(str5)) {
                                    i4++;
                                }
                            } else if (str5.equals("video/dolby-vision")) {
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                } else {
                                    str = "video/hevcdv";
                                }
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else {
                                if (!str5.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "audio/x-lg-flac";
                            }
                            str2 = str;
                            break;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzfzVar.zzd("tunneled-playback", str2, capabilitiesForType);
                                boolean zZze2 = zzfzVar.zze("tunneled-playback", str2, capabilitiesForType);
                                if (zzfxVar.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzfzVar.zzd("secure-playback", str2, capabilitiesForType);
                                        zZze = zzfzVar.zze("secure-playback", str2, capabilitiesForType);
                                        if (zzfxVar.zzb) {
                                            if (zZzd) {
                                                zZzd = true;
                                                if (zzamq.zza >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzh(mediaCodecInfoZzb)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                boolean zZzh = zzh(mediaCodecInfoZzb);
                                                if (zzamq.zza >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzflf.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZzc) {
                                                    str3 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    if (zZzc) {
                                                        continue;
                                                    }
                                                } else {
                                                    str3 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    if (zZzc) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZze) {
                                            if (zzamq.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzh(mediaCodecInfoZzb)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            boolean zZzh2 = zzh(mediaCodecInfoZzb);
                                            if (zzamq.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzflf.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZzc) {
                                                str3 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            } else {
                                                str3 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZzc) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZze2) {
                                    zZzd = zzfzVar.zzd("secure-playback", str2, capabilitiesForType);
                                    zZze = zzfzVar.zze("secure-playback", str2, capabilitiesForType);
                                    if (zzfxVar.zzb) {
                                        if (!zZze) {
                                            if (zzamq.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzh(mediaCodecInfoZzb)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            boolean zZzh3 = zzh(mediaCodecInfoZzb);
                                            if (zzamq.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzflf.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = true;
                                                }
                                            }
                                            if ((zZzc || zzfxVar.zzb != zZzd) && (zZzc || zzfxVar.zzb)) {
                                                str3 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZzc && zZzd) {
                                                    arrayList.add(zzfo.zza(String.valueOf(str3).concat(".secure"), str4, str2, capabilitiesForType, zIsHardwareAccelerated, zZzh3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                str3 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                try {
                                                    arrayList.add(zzfo.zza(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzh3, zIsVendor, false, false));
                                                } catch (Exception e) {
                                                    e = e;
                                                    if (zzamq.zza > 23 || arrayList.isEmpty()) {
                                                        String str6 = str3;
                                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 25 + str2.length());
                                                        sb.append("Failed to query codec ");
                                                        sb.append(str6);
                                                        sb.append(" (");
                                                        sb.append(str2);
                                                        sb.append(")");
                                                        Log.e("MediaCodecUtil", sb.toString());
                                                        throw e;
                                                    }
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 46);
                                                    sb2.append("Skipping codec ");
                                                    sb2.append(str3);
                                                    sb2.append(" (failed to query capabilities)");
                                                    Log.e("MediaCodecUtil", sb2.toString());
                                                }
                                            }
                                        }
                                    } else if (zZzd) {
                                        zZzd = true;
                                        if (zzamq.zza >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzh(mediaCodecInfoZzb)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        boolean zZzh4 = zzh(mediaCodecInfoZzb);
                                        if (zzamq.zza >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzflf.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZzc) {
                                            str3 = name;
                                            i = i3;
                                            i2 = iZza;
                                            str4 = str5;
                                            if (zZzc) {
                                                continue;
                                            }
                                        } else {
                                            str3 = name;
                                            i = i3;
                                            i2 = iZza;
                                            str4 = str5;
                                            if (zZzc) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i3;
                                i2 = iZza;
                                str4 = str5;
                            } catch (Exception e2) {
                                e = e2;
                                str3 = name;
                                i = i3;
                                i2 = iZza;
                                str4 = str5;
                            }
                        } else {
                            i = i3;
                            i2 = iZza;
                            str4 = str5;
                        }
                    }
                } else {
                    i = i3;
                    i2 = iZza;
                    str4 = str5;
                }
                i3 = i + 1;
                str5 = str4;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new zzfy(e3, null);
        }
    }

    private static boolean zzh(MediaCodecInfo mediaCodecInfo) {
        if (zzamq.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String strZza = zzflf.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        return strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || (strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.") || !(strZza.startsWith("omx.") || strZza.startsWith("c2."));
    }

    private static <T> void zzi(List<T> list, final zzgd<T> zzgdVar) {
        Collections.sort(list, new Comparator(zzgdVar) { // from class: com.google.android.gms.internal.ads.zzfw
            private final zzgd zza;

            {
                this.zza = zzgdVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzgd zzgdVar2 = this.zza;
                int i = zzge.zza;
                return zzgdVar2.zza(obj2) - zzgdVar2.zza(obj);
            }
        });
    }
}
