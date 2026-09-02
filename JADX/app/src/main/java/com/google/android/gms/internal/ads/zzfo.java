package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfo {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    private final boolean zzg;

    public static zzfo zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new zzfo(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities != null && zzamq.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback") && (zzamq.zza > 22 || !(("ODROID-XU3".equals(zzamq.zzd) || "Nexus 10".equals(zzamq.zzd)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)))), codecCapabilities != null && zzamq.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && zzamq.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzamq.zze;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointZzj = zzj(videoCapabilities, i, i2);
        int i3 = pointZzj.x;
        int i4 = pointZzj.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzamq.zzw(i, widthAlignment) * widthAlignment, zzamq.zzw(i2, heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    public final boolean zzc(zzafv zzafvVar) throws zzfy {
        String strZzd;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = zzafvVar.zzi;
        int i3 = 16;
        if (str != null && (strZzd = zzalt.zzd(str)) != null) {
            if (this.zzb.equals(strZzd)) {
                Pair<Integer, Integer> pairZzf = zzge.zzf(zzafvVar);
                if (pairZzf != null) {
                    int iIntValue2 = ((Integer) pairZzf.first).intValue();
                    int iIntValue3 = ((Integer) pairZzf.second).intValue();
                    if (this.zzg) {
                        codecProfileLevelArrZzb = zzb();
                        if (zzamq.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzb.length == 0) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                            }
                            if (iIntValue >= 180000000) {
                                i2 = 1024;
                            } else if (iIntValue >= 120000000) {
                                i2 = 512;
                            } else if (iIntValue >= 60000000) {
                                i2 = 256;
                            } else if (iIntValue >= 30000000) {
                                i2 = 128;
                            } else if (iIntValue >= 18000000) {
                                i2 = 64;
                            } else if (iIntValue >= 12000000) {
                                i2 = 32;
                            } else if (iIntValue >= 7200000) {
                                i2 = 16;
                            } else if (iIntValue >= 3600000) {
                                i2 = 8;
                            } else if (iIntValue >= 1800000) {
                                i2 = 4;
                            } else if (iIntValue >= 800000) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 1;
                            codecProfileLevel2.level = i2;
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                        }
                        length = codecProfileLevelArrZzb.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                codecProfileLevel = codecProfileLevelArrZzb[i];
                                if (codecProfileLevel.profile != iIntValue2 && codecProfileLevel.level >= iIntValue3) {
                                    break;
                                }
                                i++;
                            } else {
                                String str2 = zzafvVar.zzi;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 22 + strZzd.length());
                                sb.append("codec.profileLevel, ");
                                sb.append(str2);
                                sb.append(", ");
                                sb.append(strZzd);
                                zzh(sb.toString());
                            }
                        }
                    } else if (iIntValue2 == 42) {
                        iIntValue2 = 42;
                        codecProfileLevelArrZzb = zzb();
                        if (zzamq.zza <= 23) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue >= 180000000) {
                                i2 = 1024;
                            } else if (iIntValue >= 120000000) {
                                i2 = 512;
                            } else if (iIntValue >= 60000000) {
                                i2 = 256;
                            } else if (iIntValue >= 30000000) {
                                i2 = 128;
                            } else if (iIntValue >= 18000000) {
                                i2 = 64;
                            } else if (iIntValue >= 12000000) {
                                i2 = 32;
                            } else if (iIntValue >= 7200000) {
                                i2 = 16;
                            } else if (iIntValue >= 3600000) {
                                i2 = 8;
                            } else if (iIntValue >= 1800000) {
                                i2 = 4;
                            } else if (iIntValue >= 800000) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel3.profile = 1;
                            codecProfileLevel3.level = i2;
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                        }
                        length = codecProfileLevelArrZzb.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                codecProfileLevel = codecProfileLevelArrZzb[i];
                                if (codecProfileLevel.profile != iIntValue2) {
                                }
                                i++;
                            } else {
                                String str3 = zzafvVar.zzi;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + strZzd.length());
                                sb2.append("codec.profileLevel, ");
                                sb2.append(str3);
                                sb2.append(", ");
                                sb2.append(strZzd);
                                zzh(sb2.toString());
                            }
                        }
                    }
                }
            } else {
                String str4 = zzafvVar.zzi;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 13 + strZzd.length());
                sb3.append("codec.mime ");
                sb3.append(str4);
                sb3.append(", ");
                sb3.append(strZzd);
                zzh(sb3.toString());
            }
            return false;
        }
        if (this.zzg) {
            if (zzafvVar.zzq <= 0 || zzafvVar.zzr <= 0) {
                return true;
            }
            if (zzamq.zza >= 21) {
                return zzf(zzafvVar.zzq, zzafvVar.zzr, zzafvVar.zzs);
            }
            boolean z = zzafvVar.zzq * zzafvVar.zzr <= zzge.zze();
            if (!z) {
                int i4 = zzafvVar.zzq;
                int i5 = zzafvVar.zzr;
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("legacyFrameSize, ");
                sb4.append(i4);
                sb4.append("x");
                sb4.append(i5);
                zzh(sb4.toString());
            }
            return z;
        }
        if (zzamq.zza >= 21) {
            int i6 = zzafvVar.zzz;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzh("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzh("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    StringBuilder sb5 = new StringBuilder(31);
                    sb5.append("sampleRate.support, ");
                    sb5.append(i6);
                    zzh(sb5.toString());
                    return false;
                }
            }
            int i7 = zzafvVar.zzy;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    zzh("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzh("channelCount.aCaps");
                    } else {
                        String str5 = this.zza;
                        String str6 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((zzamq.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str6) && !"audio/3gpp".equals(str6) && !"audio/amr-wb".equals(str6) && !"audio/mp4a-latm".equals(str6) && !"audio/vorbis".equals(str6) && !"audio/opus".equals(str6) && !"audio/raw".equals(str6) && !"audio/flac".equals(str6) && !"audio/g711-alaw".equals(str6) && !"audio/g711-mlaw".equals(str6) && !"audio/gsm".equals(str6))) {
                            if ("audio/ac3".equals(str6)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str6)) {
                                i3 = 30;
                            }
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str5).length() + 59);
                            sb6.append("AssumedMaxChannelAdjustment: ");
                            sb6.append(str5);
                            sb6.append(", [");
                            sb6.append(maxInputChannelCount);
                            sb6.append(" to ");
                            sb6.append(i3);
                            sb6.append("]");
                            Log.w("MediaCodecInfo", sb6.toString());
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i7) {
                            StringBuilder sb7 = new StringBuilder(33);
                            sb7.append("channelCount.support, ");
                            sb7.append(i7);
                            zzh(sb7.toString());
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzafv zzafvVar) {
        if (this.zzg) {
            return this.zze;
        }
        Pair<Integer, Integer> pairZzf = zzge.zzf(zzafvVar);
        return pairZzf != null && ((Integer) pairZzf.first).intValue() == 42;
    }

    public final zzba zze(zzafv zzafvVar, zzafv zzafvVar2) {
        int i = true != zzamq.zzc(zzafvVar.zzl, zzafvVar2.zzl) ? 8 : 0;
        if (this.zzg) {
            if (zzafvVar.zzt != zzafvVar2.zzt) {
                i |= 1024;
            }
            if (!this.zze && (zzafvVar.zzq != zzafvVar2.zzq || zzafvVar.zzr != zzafvVar2.zzr)) {
                i |= 512;
            }
            if (!zzamq.zzc(zzafvVar.zzx, zzafvVar2.zzx)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzamq.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafvVar.zzd(zzafvVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzba(this.zza, zzafvVar, zzafvVar2, true != zzafvVar.zzd(zzafvVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafvVar.zzy != zzafvVar2.zzy) {
                i |= 4096;
            }
            if (zzafvVar.zzz != zzafvVar2.zzz) {
                i |= 8192;
            }
            if (zzafvVar.zzA != zzafvVar2.zzA) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair<Integer, Integer> pairZzf = zzge.zzf(zzafvVar);
                Pair<Integer, Integer> pairZzf2 = zzge.zzf(zzafvVar2);
                if (pairZzf != null && pairZzf2 != null) {
                    int iIntValue = ((Integer) pairZzf.first).intValue();
                    int iIntValue2 = ((Integer) pairZzf2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzba(this.zza, zzafvVar, zzafvVar2, 3, 0);
                    }
                }
            }
            if (!zzafvVar.zzd(zzafvVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzba(this.zza, zzafvVar, zzafvVar2, 1, 0);
            }
        }
        return new zzba(this.zza, zzafvVar, zzafvVar2, 0, i);
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        }
        if (zzi(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzamq.zzb)) || !zzi(videoCapabilities, i2, i, d))) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.support, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("x");
            sb.append(d);
            zzh(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.rotated, ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(d);
        String string = sb2.toString();
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = zzamq.zze;
        int length = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(string.length() + 25 + length + str2.length() + String.valueOf(str3).length());
        sb3.append("AssumedSupport [");
        sb3.append(string);
        sb3.append("] [");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append("] [");
        sb3.append(str3);
        sb3.append("]");
        Log.d("MediaCodecInfo", sb3.toString());
        return true;
    }

    public final Point zzg(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i, i2);
    }

    zzfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zze = z4;
        this.zzf = z6;
        this.zzg = zzalt.zzb(str2);
    }
}
