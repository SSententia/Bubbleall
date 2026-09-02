package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqr {
    private static final int zza = zzave.zzl("vide");
    private static final int zzb = zzave.zzl("soun");
    private static final int zzc = zzave.zzl("text");
    private static final int zzd = zzave.zzl("sbtl");
    private static final int zze = zzave.zzl("subt");
    private static final int zzf = zzave.zzl("clcp");
    private static final int zzg = zzave.zzl("cenc");
    private static final int zzh = zzave.zzl("meta");

    /* JADX WARN: Code duplicated, block: B:57:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    public static zzarc zza(zzaqi zzaqiVar, zzaqj zzaqjVar, long j, zzapk zzapkVar, boolean z) throws zzanp {
        int i;
        long jZzp;
        int i2;
        zzarc zzarcVar;
        Pair pairCreate;
        zzaqj zzaqjVarZzc;
        zzaqn zzaqnVar;
        int i3;
        String str;
        int i4;
        int i5;
        Pair pair;
        int i6;
        int i7;
        int i8;
        char c;
        zzaux zzauxVar;
        int i9;
        int i10;
        int i11;
        boolean z2;
        byte[] bArrCopyOfRange;
        int iZzm;
        int iZzt;
        int iZzu;
        int i12;
        String str2;
        int i13;
        int i14;
        zzaux zzauxVar2;
        int i15;
        int i16;
        String str3;
        zzaqn zzaqnVar2;
        int iZzg;
        String str4;
        int i17;
        int i18;
        String str5;
        boolean z3;
        List listSingletonList;
        zzaqi zzaqiVarZzd = zzaqiVar.zzd(zzaqk.zzH);
        zzaux zzauxVar3 = zzaqiVarZzd.zzc(zzaqk.zzV).zza;
        zzauxVar3.zzi(16);
        int iZzr = zzauxVar3.zzr();
        int i19 = -1;
        if (iZzr == zzb) {
            i = 1;
        } else if (iZzr == zza) {
            i = 2;
        } else if (iZzr == zzc || iZzr == zzd || iZzr == zze || iZzr == zzf) {
            i = 3;
        } else {
            i = iZzr == zzh ? 4 : -1;
        }
        if (i == -1) {
            return null;
        }
        zzaux zzauxVar4 = zzaqiVar.zzc(zzaqk.zzR).zza;
        zzauxVar4.zzi(8);
        int iZze = zzaqk.zze(zzauxVar4.zzr());
        zzauxVar4.zzj(iZze == 0 ? 8 : 16);
        int iZzr2 = zzauxVar4.zzr();
        zzauxVar4.zzj(4);
        int iZzg2 = zzauxVar4.zzg();
        int i20 = iZze == 0 ? 4 : 8;
        int i21 = 0;
        while (true) {
            if (i21 >= i20) {
                zzauxVar4.zzj(i20);
            } else {
                if (zzauxVar4.zza[iZzg2 + i21] != -1) {
                    jZzp = iZze == 0 ? zzauxVar4.zzp() : zzauxVar4.zzv();
                    if (jZzp != 0) {
                        break;
                    }
                    break;
                }
                i21++;
            }
            jZzp = -9223372036854775807L;
            break;
        }
        zzauxVar4.zzj(16);
        int iZzr3 = zzauxVar4.zzr();
        int iZzr4 = zzauxVar4.zzr();
        zzauxVar4.zzj(4);
        int iZzr5 = zzauxVar4.zzr();
        int iZzr6 = zzauxVar4.zzr();
        int i22 = 65536;
        if (iZzr3 != 0) {
            if (iZzr3 == 0) {
                if (iZzr4 == -65536) {
                    if (iZzr5 == 65536) {
                        i22 = iZzr5;
                    } else if (iZzr6 == 0) {
                        i2 = 270;
                    }
                    iZzr4 = -65536;
                } else {
                    i22 = iZzr5;
                }
                iZzr3 = 0;
            } else {
                i22 = iZzr5;
            }
            if (iZzr3 != -65536 && iZzr4 == 0 && i22 == 0 && iZzr6 == -65536) {
                i2 = 180;
            } else {
                i2 = 0;
            }
        } else {
            if (iZzr4 == 65536) {
                if (iZzr5 != -65536) {
                    iZzr4 = 65536;
                } else if (iZzr6 == 0) {
                    i2 = 90;
                } else {
                    iZzr4 = 65536;
                    iZzr5 = -65536;
                }
            }
            iZzr3 = 0;
            if (iZzr3 == 0) {
                if (iZzr4 == -65536) {
                    if (iZzr5 == 65536) {
                        i22 = iZzr5;
                    } else if (iZzr6 == 0) {
                        i2 = 270;
                    }
                    iZzr4 = -65536;
                } else {
                    i22 = iZzr5;
                }
                iZzr3 = 0;
            } else {
                i22 = iZzr5;
            }
            if (iZzr3 != -65536) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        }
        zzaqq zzaqqVar = new zzaqq(iZzr2, jZzp, i2);
        long j2 = j == -9223372036854775807L ? zzaqqVar.zzb : j;
        zzaux zzauxVar5 = zzaqjVar.zza;
        zzauxVar5.zzi(8);
        zzauxVar5.zzj(zzaqk.zze(zzauxVar5.zzr()) == 0 ? 8 : 16);
        long jZzp2 = zzauxVar5.zzp();
        long jZzj = j2 == -9223372036854775807L ? -9223372036854775807L : zzave.zzj(j2, 1000000L, jZzp2);
        zzaqi zzaqiVarZzd2 = zzaqiVarZzd.zzd(zzaqk.zzI).zzd(zzaqk.zzJ);
        zzaux zzauxVar6 = zzaqiVarZzd.zzc(zzaqk.zzU).zza;
        zzauxVar6.zzi(8);
        int iZze2 = zzaqk.zze(zzauxVar6.zzr());
        zzauxVar6.zzj(iZze2 == 0 ? 8 : 16);
        long jZzp3 = zzauxVar6.zzp();
        zzauxVar6.zzj(iZze2 == 0 ? 4 : 8);
        int iZzm2 = zzauxVar6.zzm();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((iZzm2 >> 10) & 31) + 96));
        sb.append((char) (((iZzm2 >> 5) & 31) + 96));
        sb.append((char) ((iZzm2 & 31) + 96));
        Pair pairCreate2 = Pair.create(Long.valueOf(jZzp3), sb.toString());
        zzaux zzauxVar7 = zzaqiVarZzd2.zzc(zzaqk.zzW).zza;
        int i23 = zzaqqVar.zza;
        int i24 = zzaqqVar.zzc;
        String str6 = (String) pairCreate2.second;
        zzauxVar7.zzi(12);
        int iZzr7 = zzauxVar7.zzr();
        zzaqn zzaqnVar3 = new zzaqn(iZzr7);
        int i25 = 0;
        while (i25 < iZzr7) {
            int iZzg3 = zzauxVar7.zzg();
            int iZzr8 = zzauxVar7.zzr();
            zzaup.zzb(iZzr8 > 0, "childAtomSize should be positive");
            int iZzr9 = zzauxVar7.zzr();
            if (iZzr9 == zzaqk.zze || iZzr9 == zzaqk.zzf || iZzr9 == zzaqk.zzac || iZzr9 == zzaqk.zzan || iZzr9 == zzaqk.zzg || iZzr9 == zzaqk.zzh || iZzr9 == zzaqk.zzi || iZzr9 == zzaqk.zzaM || iZzr9 == zzaqk.zzaN) {
                int i26 = i25;
                zzaqnVar = zzaqnVar3;
                i3 = iZzr7;
                str = str6;
                zzaux zzauxVar8 = zzauxVar7;
                i4 = i;
                i5 = i19;
                pair = pairCreate2;
                zzaqqVar = zzaqqVar;
                zzauxVar8.zzi(iZzg3 + 16);
                zzauxVar8.zzj(16);
                int iZzm3 = zzauxVar8.zzm();
                int iZzm4 = zzauxVar8.zzm();
                zzauxVar8.zzj(50);
                int iZzg4 = zzauxVar8.zzg();
                if (iZzr9 == zzaqk.zzac) {
                    i6 = i26;
                    i7 = iZzr8;
                    iZzr9 = zze(zzauxVar8, iZzg3, i7, zzaqnVar, i6);
                    zzauxVar8.zzi(iZzg4);
                } else {
                    i6 = i26;
                    i7 = iZzr8;
                }
                float fZzu = 1.0f;
                int i27 = i5;
                boolean z4 = false;
                String str7 = null;
                List<byte[]> listSingletonList2 = null;
                byte[] bArr = null;
                while (iZzg4 - iZzg3 < i7) {
                    zzauxVar8.zzi(iZzg4);
                    int iZzg5 = zzauxVar8.zzg();
                    int iZzr10 = zzauxVar8.zzr();
                    if (iZzr10 == 0) {
                        if (zzauxVar8.zzg() - iZzg3 == i7) {
                            break;
                        }
                        iZzr10 = 0;
                    }
                    zzaup.zzb(iZzr10 > 0, "childAtomSize should be positive");
                    int iZzr11 = zzauxVar8.zzr();
                    int i28 = i7;
                    if (iZzr11 == zzaqk.zzK) {
                        zzaup.zzd(str7 == null);
                        zzauxVar8.zzi(iZzg5 + 8);
                        zzavf zzavfVarZza = zzavf.zza(zzauxVar8);
                        listSingletonList2 = zzavfVarZza.zza;
                        zzaqnVar.zzc = zzavfVarZza.zzb;
                        if (!z4) {
                            fZzu = zzavfVarZza.zzc;
                        }
                        str7 = "video/avc";
                    } else if (iZzr11 == zzaqk.zzL) {
                        zzaup.zzd(str7 == null);
                        zzauxVar8.zzi(iZzg5 + 8);
                        zzavl zzavlVarZza = zzavl.zza(zzauxVar8);
                        listSingletonList2 = zzavlVarZza.zza;
                        zzaqnVar.zzc = zzavlVarZza.zzb;
                        str7 = "video/hevc";
                    } else if (iZzr11 == zzaqk.zzaO) {
                        zzaup.zzd(str7 == null);
                        str7 = iZzr9 == zzaqk.zzaM ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else {
                        if (iZzr11 == zzaqk.zzj) {
                            zzaup.zzd(str7 == null);
                            str7 = "video/3gpp";
                        } else if (iZzr11 == zzaqk.zzM) {
                            zzaup.zzd(str7 == null);
                            Pair<String, byte[]> pairZzd = zzd(zzauxVar8, iZzg5);
                            String str8 = (String) pairZzd.first;
                            listSingletonList2 = Collections.singletonList((byte[]) pairZzd.second);
                            i11 = iZzr9;
                            str7 = str8;
                        } else if (iZzr11 == zzaqk.zzal) {
                            zzauxVar8.zzi(iZzg5 + 8);
                            fZzu = zzauxVar8.zzu() / zzauxVar8.zzu();
                            i11 = iZzr9;
                            z4 = true;
                        } else if (iZzr11 == zzaqk.zzaK) {
                            int i29 = iZzg5 + 8;
                            while (true) {
                                if (i29 - iZzg5 >= iZzr10) {
                                    i11 = iZzr9;
                                    z2 = z4;
                                    bArrCopyOfRange = null;
                                    break;
                                }
                                zzauxVar8.zzi(i29);
                                int iZzr12 = zzauxVar8.zzr();
                                i11 = iZzr9;
                                z2 = z4;
                                if (zzauxVar8.zzr() == zzaqk.zzaL) {
                                    bArrCopyOfRange = Arrays.copyOfRange(zzauxVar8.zza, i29, iZzr12 + i29);
                                    break;
                                }
                                i29 += iZzr12;
                                z4 = z2;
                                iZzr9 = i11;
                            }
                            z4 = z2;
                            bArr = bArrCopyOfRange;
                        } else {
                            i11 = iZzr9;
                            boolean z5 = z4;
                            if (iZzr11 == zzaqk.zzaJ) {
                                int iZzl = zzauxVar8.zzl();
                                zzauxVar8.zzj(3);
                                if (iZzl == 0) {
                                    int iZzl2 = zzauxVar8.zzl();
                                    if (iZzl2 == 0) {
                                        z4 = z5;
                                        i27 = 0;
                                    } else if (iZzl2 == 1) {
                                        z4 = z5;
                                        i27 = 1;
                                    } else if (iZzl2 == 2) {
                                        z4 = z5;
                                        i27 = 2;
                                    } else if (iZzl2 == 3) {
                                        z4 = z5;
                                        i27 = 3;
                                    }
                                }
                            }
                            z4 = z5;
                        }
                        iZzg4 += iZzr10;
                        iZzr9 = i11;
                        i7 = i28;
                    }
                    i11 = iZzr9;
                    iZzg4 += iZzr10;
                    iZzr9 = i11;
                    i7 = i28;
                }
                int i30 = i7;
                if (str7 != null) {
                    i10 = i30;
                    i8 = i6;
                    c = 3;
                    zzauxVar = zzauxVar8;
                    i9 = iZzg3;
                    zzaqnVar.zzb = zzanm.zza(Integer.toString(i23), str7, null, -1, -1, iZzm3, iZzm4, -1.0f, listSingletonList2, i24, fZzu, bArr, i27, null, zzapkVar);
                } else {
                    i8 = i6;
                    c = 3;
                    zzauxVar = zzauxVar8;
                    i9 = iZzg3;
                    i10 = i30;
                }
            } else {
                if (iZzr9 == zzaqk.zzl || iZzr9 == zzaqk.zzad || iZzr9 == zzaqk.zzq || iZzr9 == zzaqk.zzs || iZzr9 == zzaqk.zzu || iZzr9 == zzaqk.zzx || iZzr9 == zzaqk.zzv || iZzr9 == zzaqk.zzw || iZzr9 == zzaqk.zzaA || iZzr9 == zzaqk.zzaB || iZzr9 == zzaqk.zzo || iZzr9 == zzaqk.zzp || iZzr9 == zzaqk.zzm || iZzr9 == zzaqk.zzaQ) {
                    int i31 = i25;
                    zzaqn zzaqnVar4 = zzaqnVar3;
                    i3 = iZzr7;
                    String str9 = str6;
                    zzaux zzauxVar9 = zzauxVar7;
                    i4 = i;
                    Pair pair2 = pairCreate2;
                    int i32 = iZzr8;
                    int i33 = iZzg3;
                    zzaux zzauxVar10 = zzauxVar9;
                    zzauxVar10.zzi(i33 + 16);
                    if (z) {
                        iZzm = zzauxVar10.zzm();
                        zzauxVar10.zzj(6);
                    } else {
                        zzauxVar10.zzj(8);
                        iZzm = 0;
                    }
                    if (iZzm == 0 || iZzm == 1) {
                        int iZzm5 = zzauxVar10.zzm();
                        zzauxVar10.zzj(6);
                        iZzt = zzauxVar10.zzt();
                        if (iZzm == 1) {
                            zzauxVar10.zzj(16);
                        }
                        iZzu = iZzm5;
                    } else if (iZzm == 2) {
                        zzauxVar10.zzj(16);
                        iZzt = (int) Math.round(Double.longBitsToDouble(zzauxVar10.zzs()));
                        iZzu = zzauxVar10.zzu();
                        zzauxVar10.zzj(20);
                    } else {
                        pair = pair2;
                        zzauxVar = zzauxVar10;
                        i9 = i33;
                        zzaqnVar = zzaqnVar4;
                        i10 = i32;
                        i8 = i31;
                        str = str9;
                    }
                    int iZzg6 = zzauxVar10.zzg();
                    if (iZzr9 == zzaqk.zzad) {
                        i12 = i31;
                        iZzr9 = zze(zzauxVar10, i33, i32, zzaqnVar4, i12);
                        zzauxVar10.zzi(iZzg6);
                    } else {
                        i12 = i31;
                    }
                    if (iZzr9 == zzaqk.zzq) {
                        str2 = "audio/ac3";
                    } else if (iZzr9 == zzaqk.zzs) {
                        str2 = "audio/eac3";
                    } else if (iZzr9 == zzaqk.zzu) {
                        str2 = "audio/vnd.dts";
                    } else if (iZzr9 == zzaqk.zzv || iZzr9 == zzaqk.zzw) {
                        str2 = "audio/vnd.dts.hd";
                    } else if (iZzr9 == zzaqk.zzx) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iZzr9 == zzaqk.zzaA) {
                        str2 = "audio/3gpp";
                    } else if (iZzr9 == zzaqk.zzaB) {
                        str2 = "audio/amr-wb";
                    } else if (iZzr9 == zzaqk.zzo || iZzr9 == zzaqk.zzp) {
                        str2 = "audio/raw";
                    } else if (iZzr9 == zzaqk.zzm) {
                        str2 = "audio/mpeg";
                    } else {
                        str2 = iZzr9 == zzaqk.zzaQ ? "audio/alac" : null;
                    }
                    String str10 = str2;
                    int i34 = iZzt;
                    int iIntValue = iZzu;
                    byte[] bArr2 = null;
                    while (iZzg6 - i33 < i32) {
                        zzauxVar10.zzi(iZzg6);
                        int iZzr13 = zzauxVar10.zzr();
                        zzaup.zzb(iZzr13 > 0, "childAtomSize should be positive");
                        int iZzr14 = zzauxVar10.zzr();
                        if (iZzr14 == zzaqk.zzM || (z && iZzr14 == zzaqk.zzn)) {
                            i13 = iZzr13;
                            i14 = i12;
                            String str11 = str10;
                            zzauxVar2 = zzauxVar10;
                            i15 = i33;
                            i16 = i32;
                            str3 = str9;
                            zzaqnVar2 = zzaqnVar4;
                            if (iZzr14 != zzaqk.zzM) {
                                iZzg = zzauxVar2.zzg();
                                while (true) {
                                    if (iZzg - iZzg6 >= i13) {
                                        iZzg = -1;
                                        break;
                                    }
                                    zzauxVar2.zzi(iZzg);
                                    int iZzr15 = zzauxVar2.zzr();
                                    zzaup.zzb(iZzr15 > 0, "childAtomSize should be positive");
                                    if (zzauxVar2.zzr() == zzaqk.zzM) {
                                        break;
                                    }
                                    iZzg += iZzr15;
                                }
                            } else {
                                iZzg = iZzg6;
                            }
                            if (iZzg != -1) {
                                Pair<String, byte[]> pairZzd2 = zzd(zzauxVar2, iZzg);
                                String str12 = (String) pairZzd2.first;
                                bArr2 = (byte[]) pairZzd2.second;
                                if ("audio/mp4a-latm".equals(str12)) {
                                    Pair<Integer, Integer> pairZza = zzauq.zza(bArr2);
                                    int iIntValue2 = ((Integer) pairZza.first).intValue();
                                    iIntValue = ((Integer) pairZza.second).intValue();
                                    str10 = str12;
                                    i34 = iIntValue2;
                                } else {
                                    str10 = str12;
                                }
                            } else {
                                str10 = str11;
                            }
                        } else {
                            if (iZzr14 == zzaqk.zzr) {
                                zzauxVar10.zzi(iZzg6 + 8);
                                str4 = str9;
                                zzaqnVar4.zzb = zzany.zza(zzauxVar10, Integer.toString(i23), str4, zzapkVar);
                            } else {
                                str4 = str9;
                                if (iZzr14 == zzaqk.zzt) {
                                    zzauxVar10.zzi(iZzg6 + 8);
                                    zzaqnVar4.zzb = zzany.zzb(zzauxVar10, Integer.toString(i23), str4, zzapkVar);
                                } else {
                                    if (iZzr14 == zzaqk.zzy) {
                                        str3 = str4;
                                        i17 = iZzr13;
                                        i14 = i12;
                                        str5 = str10;
                                        i18 = iZzg6;
                                        zzauxVar2 = zzauxVar10;
                                        i15 = i33;
                                        i16 = i32;
                                        zzaqnVar2 = zzaqnVar4;
                                        zzaqnVar2.zzb = zzanm.zzb(Integer.toString(i23), str10, null, -1, -1, iIntValue, i34, null, zzapkVar, 0, str3);
                                    } else {
                                        str3 = str4;
                                        i17 = iZzr13;
                                        i18 = iZzg6;
                                        i14 = i12;
                                        str5 = str10;
                                        zzauxVar2 = zzauxVar10;
                                        i15 = i33;
                                        i16 = i32;
                                        zzaqnVar2 = zzaqnVar4;
                                        if (iZzr14 == zzaqk.zzaQ) {
                                            i13 = i17;
                                            byte[] bArr3 = new byte[i13];
                                            iZzg6 = i18;
                                            zzauxVar2.zzi(iZzg6);
                                            zzauxVar2.zzk(bArr3, 0, i13);
                                            bArr2 = bArr3;
                                        }
                                    }
                                    i13 = i17;
                                    iZzg6 = i18;
                                }
                                str10 = str5;
                            }
                            str3 = str4;
                            i13 = iZzr13;
                            i14 = i12;
                            str5 = str10;
                            zzauxVar2 = zzauxVar10;
                            i15 = i33;
                            i16 = i32;
                            zzaqnVar2 = zzaqnVar4;
                            str10 = str5;
                        }
                        iZzg6 += i13;
                        zzaqnVar4 = zzaqnVar2;
                        zzauxVar10 = zzauxVar2;
                        i32 = i16;
                        str9 = str3;
                        i12 = i14;
                        i33 = i15;
                        zzapkVar = zzapkVar;
                    }
                    int i35 = i12;
                    String str13 = str10;
                    zzaux zzauxVar11 = zzauxVar10;
                    int i36 = i33;
                    i10 = i32;
                    str = str9;
                    zzaqn zzaqnVar5 = zzaqnVar4;
                    if (zzaqnVar5.zzb != null || str13 == null) {
                        pair = pair2;
                        i5 = -1;
                        zzaqnVar = zzaqnVar5;
                        zzaqqVar = zzaqqVar;
                        zzauxVar = zzauxVar11;
                        i8 = i35;
                        i9 = i36;
                        c = 3;
                    } else {
                        int i37 = true != "audio/raw".equals(str13) ? -1 : 2;
                        i5 = -1;
                        pair = pair2;
                        zzaqnVar = zzaqnVar5;
                        zzaqqVar = zzaqqVar;
                        zzaqnVar.zzb = zzanm.zzc(Integer.toString(i23), str13, null, -1, -1, iIntValue, i34, i37, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), zzapkVar, 0, str, null);
                        i8 = i35;
                        i9 = i36;
                        zzauxVar = zzauxVar11;
                        c = 3;
                    }
                } else if (iZzr9 == zzaqk.zzam || iZzr9 == zzaqk.zzaw || iZzr9 == zzaqk.zzax || iZzr9 == zzaqk.zzay || iZzr9 == zzaqk.zzaz) {
                    zzauxVar7.zzi(iZzg3 + 16);
                    String str14 = "application/ttml+xml";
                    long j3 = Long.MAX_VALUE;
                    if (iZzr9 == zzaqk.zzam) {
                        listSingletonList = null;
                        z3 = true;
                    } else {
                        if (iZzr9 == zzaqk.zzaw) {
                            int i38 = iZzr8 - 16;
                            byte[] bArr4 = new byte[i38];
                            zzauxVar7.zzk(bArr4, 0, i38);
                            listSingletonList = Collections.singletonList(bArr4);
                            str14 = "application/x-quicktime-tx3g";
                        } else if (iZzr9 == zzaqk.zzax) {
                            str14 = "application/x-mp4-vtt";
                            listSingletonList = null;
                        } else if (iZzr9 == zzaqk.zzay) {
                            listSingletonList = null;
                            j3 = 0;
                        } else {
                            if (iZzr9 != zzaqk.zzaz) {
                                throw new IllegalStateException();
                            }
                            z3 = true;
                            zzaqnVar3.zzd = 1;
                            str14 = "application/x-mp4-cea-608";
                            listSingletonList = null;
                        }
                        z3 = true;
                    }
                    zzaqn zzaqnVar6 = zzaqnVar3;
                    i3 = iZzr7;
                    i4 = i;
                    zzaqnVar6.zzb = zzanm.zzd(Integer.toString(i23), str14, null, -1, 0, str6, -1, zzapkVar, j3, listSingletonList);
                    pair = pairCreate2;
                    zzaqnVar = zzaqnVar6;
                    i10 = iZzr8;
                    i9 = iZzg3;
                    i8 = i25;
                    str = str6;
                    zzauxVar = zzauxVar7;
                } else {
                    if (iZzr9 == zzaqk.zzaP) {
                        zzaqnVar3.zzb = zzanm.zzf(Integer.toString(i23), "application/x-camera-motion", null, i19, zzapkVar);
                    }
                    i10 = iZzr8;
                    i9 = iZzg3;
                    i8 = i25;
                    zzaqnVar = zzaqnVar3;
                    i3 = iZzr7;
                    str = str6;
                    zzauxVar = zzauxVar7;
                    i4 = i;
                    i5 = i19;
                    pair = pairCreate2;
                    zzaqqVar = zzaqqVar;
                    c = 3;
                }
                c = 3;
                i5 = -1;
            }
            zzaux zzauxVar12 = zzauxVar;
            zzauxVar12.zzi(i9 + i10);
            i25 = i8 + 1;
            zzaqnVar3 = zzaqnVar;
            zzauxVar7 = zzauxVar12;
            zzaqqVar = zzaqqVar;
            iZzr7 = i3;
            i = i4;
            i19 = i5;
            str6 = str;
            pairCreate2 = pair;
        }
        zzaqn zzaqnVar7 = zzaqnVar3;
        int i39 = i;
        Pair pair3 = pairCreate2;
        zzaqq zzaqqVar2 = zzaqqVar;
        zzaqi zzaqiVarZzd3 = zzaqiVar.zzd(zzaqk.zzS);
        if (zzaqiVarZzd3 == null || (zzaqjVarZzc = zzaqiVarZzd3.zzc(zzaqk.zzT)) == null) {
            zzarcVar = null;
            pairCreate = Pair.create(null, null);
        } else {
            zzaux zzauxVar13 = zzaqjVarZzc.zza;
            zzauxVar13.zzi(8);
            int iZze3 = zzaqk.zze(zzauxVar13.zzr());
            int iZzu2 = zzauxVar13.zzu();
            long[] jArr = new long[iZzu2];
            long[] jArr2 = new long[iZzu2];
            for (int i40 = 0; i40 < iZzu2; i40++) {
                jArr[i40] = iZze3 == 1 ? zzauxVar13.zzv() : zzauxVar13.zzp();
                jArr2[i40] = iZze3 == 1 ? zzauxVar13.zzs() : zzauxVar13.zzr();
                if (zzauxVar13.zzo() != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                zzauxVar13.zzj(2);
            }
            pairCreate = Pair.create(jArr, jArr2);
            zzarcVar = null;
        }
        return zzaqnVar7.zzb == null ? zzarcVar : new zzarc(zzaqqVar2.zza, i39, ((Long) pair3.first).longValue(), jZzp2, jZzj, zzaqnVar7.zzb, zzaqnVar7.zzd, zzaqnVar7.zza, zzaqnVar7.zzc, (long[]) pairCreate.first, (long[]) pairCreate.second);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0243  */
    /* JADX WARN: Code duplicated, block: B:106:0x0247  */
    /* JADX WARN: Code duplicated, block: B:107:0x024e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0257  */
    /* JADX WARN: Code duplicated, block: B:242:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x015b A[PHI: r8
  0x015b: PHI (r8v4 int) = (r8v3 int), (r8v3 int), (r8v3 int), (r8v25 int) binds: [B:36:0x00b3, B:38:0x00bf, B:39:0x00c1, B:56:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0173 A[ADDED_TO_REGION, LOOP:10: B:59:0x0173->B:60:0x0175, LOOP_START, PHI: r14 r15 r22 r25
  0x0173: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0175 A[LOOP:10: B:59:0x0173->B:60:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0193 A[ADDED_TO_REGION, LOOP:11: B:63:0x0193->B:65:0x0197, LOOP_START, PHI: r16 r21 r23
  0x0193: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:62:0x0191, B:65:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r21v3 int) = (r21v1 int), (r21v7 int) binds: [B:62:0x0191, B:65:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r23v8 int) = (r23v1 int), (r23v9 int) binds: [B:62:0x0191, B:65:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0197 A[LOOP:11: B:63:0x0193->B:65:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x021b  */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0223  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x022b  */
    public static zzarf zzb(zzarc zzarcVar, zzaqi zzaqiVar, zzaps zzapsVar) throws zzanp {
        zzaqm zzaqpVar;
        boolean z;
        int iZzu;
        int iZzu2;
        int iZzu3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i;
        int[] iArr2;
        long j;
        long j2;
        int i2;
        int i3;
        int iZzu4;
        int i4;
        int iZzr;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr3;
        long[] jArr3;
        long[] jArr4;
        int[] iArr4;
        boolean z3;
        int i10;
        int iZzb;
        int i11;
        int i12;
        int iZzu5;
        int iZzu6;
        int[] iArr5;
        long[] jArr5;
        int[] iArr6;
        int[] iArr7;
        int length;
        zzaqj zzaqjVarZzc = zzaqiVar.zzc(zzaqk.zzas);
        if (zzaqjVarZzc != null) {
            zzaqpVar = new zzaqo(zzaqjVarZzc);
        } else {
            zzaqj zzaqjVarZzc2 = zzaqiVar.zzc(zzaqk.zzat);
            if (zzaqjVarZzc2 == null) {
                throw new zzanp("Track has no sample table size information");
            }
            zzaqpVar = new zzaqp(zzaqjVarZzc2);
        }
        int iZza = zzaqpVar.zza();
        if (iZza == 0) {
            return new zzarf(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzaqj zzaqjVarZzc3 = zzaqiVar.zzc(zzaqk.zzau);
        if (zzaqjVarZzc3 == null) {
            zzaqjVarZzc3 = zzaqiVar.zzc(zzaqk.zzav);
            z = true;
        } else {
            z = false;
        }
        zzaux zzauxVar = zzaqjVarZzc3.zza;
        zzaux zzauxVar2 = zzaqiVar.zzc(zzaqk.zzar).zza;
        zzaux zzauxVar3 = zzaqiVar.zzc(zzaqk.zzao).zza;
        zzaqj zzaqjVarZzc4 = zzaqiVar.zzc(zzaqk.zzap);
        zzaux zzauxVar4 = zzaqjVarZzc4 != null ? zzaqjVarZzc4.zza : null;
        zzaqj zzaqjVarZzc5 = zzaqiVar.zzc(zzaqk.zzaq);
        zzaux zzauxVar5 = zzaqjVarZzc5 != null ? zzaqjVarZzc5.zza : null;
        zzaql zzaqlVar = new zzaql(zzauxVar2, zzauxVar, z);
        zzauxVar3.zzi(12);
        int iZzu7 = zzauxVar3.zzu() - 1;
        int iZzu8 = zzauxVar3.zzu();
        int iZzu9 = zzauxVar3.zzu();
        if (zzauxVar5 != null) {
            zzauxVar5.zzi(12);
            iZzu = zzauxVar5.zzu();
        } else {
            iZzu = 0;
        }
        if (zzauxVar4 != null) {
            zzauxVar4.zzi(12);
            iZzu2 = zzauxVar4.zzu();
            if (iZzu2 > 0) {
                iZzu3 = zzauxVar4.zzu() - 1;
            } else {
                zzauxVar4 = null;
            }
            if (zzaqpVar.zzc() || !"audio/raw".equals(zzarcVar.zzf.zzf) || iZzu7 != 0) {
                jArr = new long[iZza];
                iArr = new int[iZza];
                jArr2 = new long[iZza];
                i = iZzu2;
                iArr2 = new int[iZza];
                j = 0;
                j2 = 0;
                i2 = 0;
                i3 = 0;
                iZzu4 = 0;
                i4 = 0;
                iZzr = 0;
                while (i3 < iZza) {
                    while (i4 == 0) {
                        zzaup.zzd(zzaqlVar.zza());
                        j = zzaqlVar.zzd;
                        i4 = zzaqlVar.zzc;
                        iZzu8 = iZzu8;
                        iZzu9 = iZzu9;
                    }
                    int i13 = iZzu8;
                    i10 = iZzu9;
                    if (zzauxVar5 != null) {
                        while (iZzu4 == 0) {
                            if (iZzu > 0) {
                                iZzu4 = 0;
                                break;
                            }
                            iZzu4 = zzauxVar5.zzu();
                            iZzr = zzauxVar5.zzr();
                            iZzu--;
                        }
                        iZzu4--;
                    }
                    int i14 = iZzr;
                    jArr[i3] = j;
                    iZzb = zzaqpVar.zzb();
                    iArr[i3] = iZzb;
                    if (iZzb > i2) {
                        i2 = iZzb;
                    }
                    jArr2[i3] = j2 + ((long) i14);
                    if (zzauxVar4 == null) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    iArr2[i3] = i11;
                    if (i3 == iZzu3) {
                        iArr2[i3] = 1;
                        i--;
                        if (i > 0) {
                            iZzu3 = zzauxVar4.zzu() - 1;
                        }
                    }
                    int[] iArr8 = iArr2;
                    j2 += (long) i10;
                    i12 = i13 - 1;
                    if (i12 == 0) {
                        iZzu5 = i10;
                        iZzu6 = i12;
                    } else if (iZzu7 > 0) {
                        iZzu6 = zzauxVar3.zzu();
                        iZzu5 = zzauxVar3.zzu();
                        iZzu7--;
                    } else {
                        iZzu5 = i10;
                        iZzu6 = 0;
                    }
                    int i15 = iZzu6;
                    int i16 = iZzu5;
                    j += (long) iArr[i3];
                    i4--;
                    i3++;
                    zzaqpVar = zzaqpVar;
                    jArr = jArr;
                    iArr2 = iArr8;
                    iZzu9 = i16;
                    iZzr = i14;
                    iZzu8 = i15;
                }
                long[] jArr6 = jArr;
                int[] iArr9 = iArr2;
                i5 = iZzu8;
                if (iZzu4 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzaup.zza(z2);
                while (iZzu > 0) {
                    if (zzauxVar5.zzu() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzaup.zza(z3);
                    zzauxVar5.zzr();
                    iZzu--;
                }
                if (i == 0) {
                    if (i5 == 0) {
                        i7 = i4;
                        i8 = i5;
                    } else if (i4 == 0) {
                        if (iZzu7 != 0) {
                            i8 = 0;
                            i7 = 0;
                        } else {
                            zzarcVar = zzarcVar;
                            i2 = i2;
                        }
                        i9 = i2;
                        iArr3 = iArr;
                        jArr3 = jArr2;
                        jArr4 = jArr6;
                        iArr4 = iArr9;
                    } else {
                        i8 = 0;
                        i7 = i4;
                    }
                    i6 = 0;
                } else {
                    zzarcVar = zzarcVar;
                    i2 = i2;
                    i6 = i;
                    i7 = i4;
                    i8 = i5;
                }
                int i17 = zzarcVar.zza;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i17);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i6);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i8);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i7);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(iZzu7);
                Log.w("AtomParsers", sb.toString());
                i9 = i2;
                iArr3 = iArr;
                jArr3 = jArr2;
                jArr4 = jArr6;
                iArr4 = iArr9;
            } else if (iZzu == 0 && iZzu2 == 0) {
                int i18 = zzaqlVar.zza;
                long[] jArr7 = new long[i18];
                int[] iArr10 = new int[i18];
                while (zzaqlVar.zza()) {
                    int i19 = zzaqlVar.zzb;
                    jArr7[i19] = zzaqlVar.zzd;
                    iArr10[i19] = zzaqlVar.zzc;
                }
                int iZzb2 = zzaqpVar.zzb();
                long j3 = iZzu9;
                int i20 = 8192 / iZzb2;
                int iZze = 0;
                for (int i21 = 0; i21 < i18; i21++) {
                    iZze += zzave.zze(iArr10[i21], i20);
                }
                jArr4 = new long[iZze];
                int[] iArr11 = new int[iZze];
                jArr3 = new long[iZze];
                int[] iArr12 = new int[iZze];
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i22 < i18) {
                    int i26 = iArr10[i22];
                    long j4 = jArr7[i22];
                    int i27 = i23;
                    int i28 = i24;
                    int i29 = i18;
                    int i30 = i28;
                    long[] jArr8 = jArr7;
                    int i31 = i26;
                    while (i31 > 0) {
                        int iMin = Math.min(i20, i31);
                        jArr4[i25] = j4;
                        int[] iArr13 = iArr10;
                        int i32 = iZzb2 * iMin;
                        iArr11[i25] = i32;
                        int iMax = Math.max(i27, i32);
                        jArr3[i25] = ((long) i30) * j3;
                        iArr12[i25] = 1;
                        j4 += (long) iArr11[i25];
                        i30 += iMin;
                        i31 -= iMin;
                        i25++;
                        iArr10 = iArr13;
                        i27 = iMax;
                    }
                    i22++;
                    i23 = i27;
                    jArr7 = jArr8;
                    i24 = i30;
                    i18 = i29;
                }
                zzarcVar = zzarcVar;
                iArr4 = iArr12;
                iArr3 = iArr11;
                i9 = i23;
                j2 = 0;
            } else {
                iZzu7 = 0;
                jArr = new long[iZza];
                iArr = new int[iZza];
                jArr2 = new long[iZza];
                i = iZzu2;
                iArr2 = new int[iZza];
                j = 0;
                j2 = 0;
                i2 = 0;
                i3 = 0;
                iZzu4 = 0;
                i4 = 0;
                iZzr = 0;
                while (i3 < iZza) {
                    while (i4 == 0) {
                        zzaup.zzd(zzaqlVar.zza());
                        j = zzaqlVar.zzd;
                        i4 = zzaqlVar.zzc;
                        iZzu8 = iZzu8;
                        iZzu9 = iZzu9;
                    }
                    int i110 = iZzu8;
                    i10 = iZzu9;
                    if (zzauxVar5 != null) {
                        while (iZzu4 == 0) {
                            if (iZzu > 0) {
                                iZzu4 = 0;
                                break;
                            }
                            iZzu4 = zzauxVar5.zzu();
                            iZzr = zzauxVar5.zzr();
                            iZzu--;
                        }
                        iZzu4--;
                    }
                    int i111 = iZzr;
                    jArr[i3] = j;
                    iZzb = zzaqpVar.zzb();
                    iArr[i3] = iZzb;
                    if (iZzb > i2) {
                        i2 = iZzb;
                    }
                    jArr2[i3] = j2 + ((long) i111);
                    if (zzauxVar4 == null) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    iArr2[i3] = i11;
                    if (i3 == iZzu3) {
                        iArr2[i3] = 1;
                        i--;
                        if (i > 0) {
                            iZzu3 = zzauxVar4.zzu() - 1;
                        }
                    }
                    int[] iArr14 = iArr2;
                    j2 += (long) i10;
                    i12 = i110 - 1;
                    if (i12 == 0) {
                        iZzu5 = i10;
                        iZzu6 = i12;
                    } else if (iZzu7 > 0) {
                        iZzu6 = zzauxVar3.zzu();
                        iZzu5 = zzauxVar3.zzu();
                        iZzu7--;
                    } else {
                        iZzu5 = i10;
                        iZzu6 = 0;
                    }
                    int i112 = iZzu6;
                    int i113 = iZzu5;
                    j += (long) iArr[i3];
                    i4--;
                    i3++;
                    zzaqpVar = zzaqpVar;
                    jArr = jArr;
                    iArr2 = iArr14;
                    iZzu9 = i113;
                    iZzr = i111;
                    iZzu8 = i112;
                }
                long[] jArr9 = jArr;
                int[] iArr15 = iArr2;
                i5 = iZzu8;
                if (iZzu4 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzaup.zza(z2);
                while (iZzu > 0) {
                    if (zzauxVar5.zzu() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzaup.zza(z3);
                    zzauxVar5.zzr();
                    iZzu--;
                }
                if (i == 0) {
                    if (i5 == 0) {
                        i7 = i4;
                        i8 = i5;
                    } else if (i4 == 0) {
                        if (iZzu7 != 0) {
                            i8 = 0;
                            i7 = 0;
                        } else {
                            zzarcVar = zzarcVar;
                            i2 = i2;
                        }
                        i9 = i2;
                        iArr3 = iArr;
                        jArr3 = jArr2;
                        jArr4 = jArr9;
                        iArr4 = iArr15;
                    } else {
                        i8 = 0;
                        i7 = i4;
                    }
                    i6 = 0;
                } else {
                    zzarcVar = zzarcVar;
                    i2 = i2;
                    i6 = i;
                    i7 = i4;
                    i8 = i5;
                }
                int i114 = zzarcVar.zza;
                StringBuilder sb2 = new StringBuilder(215);
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(i114);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i6);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i8);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i7);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(iZzu7);
                Log.w("AtomParsers", sb2.toString());
                i9 = i2;
                iArr3 = iArr;
                jArr3 = jArr2;
                jArr4 = jArr9;
                iArr4 = iArr15;
            }
            if (zzarcVar.zzi != null || zzapsVar.zzb()) {
                zzave.zzk(jArr3, 1000000L, zzarcVar.zzc);
                return new zzarf(jArr4, iArr3, i9, jArr3, iArr4);
            }
            long[] jArr10 = zzarcVar.zzi;
            if (jArr10.length == 1 && zzarcVar.zzb == 1 && (length = jArr3.length) >= 2) {
                long j5 = zzarcVar.zzj[0];
                long jZzj = j5 + zzave.zzj(jArr10[0], zzarcVar.zzc, zzarcVar.zzd);
                long j6 = jArr3[0];
                if (j6 <= j5 && j5 < jArr3[1] && jArr3[length - 1] < jZzj && jZzj <= j2) {
                    long jZzj2 = zzave.zzj(j5 - j6, zzarcVar.zzf.zzs, zzarcVar.zzc);
                    long jZzj3 = zzave.zzj(j2 - jZzj, zzarcVar.zzf.zzs, zzarcVar.zzc);
                    if ((jZzj2 != 0 || jZzj3 != 0) && jZzj2 <= 2147483647L && jZzj3 <= 2147483647L) {
                        zzapsVar.zzb = (int) jZzj2;
                        zzapsVar.zzc = (int) jZzj3;
                        zzave.zzk(jArr3, 1000000L, zzarcVar.zzc);
                        return new zzarf(jArr4, iArr3, i9, jArr3, iArr4);
                    }
                }
            }
            long[] jArr11 = zzarcVar.zzi;
            if (jArr11.length == 1) {
                char c = 0;
                if (jArr11[0] == 0) {
                    int i33 = 0;
                    while (i33 < jArr3.length) {
                        jArr3[i33] = zzave.zzj(jArr3[i33] - zzarcVar.zzj[c], 1000000L, zzarcVar.zzc);
                        i33++;
                        c = 0;
                    }
                    return new zzarf(jArr4, iArr3, i9, jArr3, iArr4);
                }
            }
            boolean z4 = zzarcVar.zzb == 1;
            int i34 = 0;
            int i35 = 0;
            boolean z5 = false;
            int i36 = 0;
            while (true) {
                long[] jArr12 = zzarcVar.zzi;
                if (i36 >= jArr12.length) {
                    break;
                }
                int[] iArr16 = iArr3;
                int i37 = i9;
                long j7 = zzarcVar.zzj[i36];
                if (j7 != -1) {
                    long jZzj4 = zzave.zzj(jArr12[i36], zzarcVar.zzc, zzarcVar.zzd);
                    int iZzi = zzave.zzi(jArr3, j7, true, true);
                    int iZzi2 = zzave.zzi(jArr3, j7 + jZzj4, z4, false);
                    i34 += iZzi2 - iZzi;
                    z5 = (i35 != iZzi) | z5;
                    i35 = iZzi2;
                }
                i36++;
                iArr3 = iArr16;
                jArr4 = jArr4;
                i9 = i37;
            }
            long[] jArr13 = jArr4;
            int[] iArr17 = iArr3;
            int i38 = i9;
            boolean z6 = (i34 != iZza) | z5;
            long[] jArr14 = z6 ? new long[i34] : jArr13;
            int[] iArr18 = z6 ? new int[i34] : iArr17;
            int i39 = true == z6 ? 0 : i38;
            int[] iArr19 = z6 ? new int[i34] : iArr4;
            long[] jArr15 = new long[i34];
            int i40 = i39;
            long j8 = 0;
            int i41 = 0;
            int i42 = 0;
            while (true) {
                long[] jArr16 = zzarcVar.zzi;
                if (i41 >= jArr16.length) {
                    break;
                }
                long j9 = j8;
                long j10 = zzarcVar.zzj[i41];
                long j11 = jArr16[i41];
                if (j10 != -1) {
                    int[] iArr20 = iArr19;
                    long jZzj5 = zzave.zzj(j11, zzarcVar.zzc, zzarcVar.zzd);
                    int iZzi3 = zzave.zzi(jArr3, j10, true, true);
                    int iZzi4 = zzave.zzi(jArr3, jZzj5 + j10, z4, false);
                    if (z6) {
                        int i43 = iZzi4 - iZzi3;
                        System.arraycopy(jArr13, iZzi3, jArr14, i42, i43);
                        iArr5 = iArr17;
                        System.arraycopy(iArr5, iZzi3, iArr18, i42, i43);
                        iArr7 = iArr20;
                        System.arraycopy(iArr4, iZzi3, iArr7, i42, i43);
                    } else {
                        iArr5 = iArr17;
                        iArr7 = iArr20;
                    }
                    int i44 = i40;
                    while (iZzi3 < iZzi4) {
                        long[] jArr17 = jArr13;
                        int[] iArr21 = iArr7;
                        long j12 = j10;
                        jArr15[i42] = zzave.zzj(j9, 1000000L, zzarcVar.zzd) + zzave.zzj(jArr3[iZzi3] - j10, 1000000L, zzarcVar.zzc);
                        if (z6 && iArr18[i42] > i44) {
                            i44 = iArr5[iZzi3];
                        }
                        i42++;
                        iZzi3++;
                        j10 = j12;
                        iArr7 = iArr21;
                        jArr13 = jArr17;
                    }
                    jArr5 = jArr13;
                    iArr6 = iArr7;
                    i40 = i44;
                } else {
                    iArr5 = iArr17;
                    jArr5 = jArr13;
                    z4 = z4;
                    iArr6 = iArr19;
                }
                j8 = j9 + j11;
                i41++;
                iArr17 = iArr5;
                iArr19 = iArr6;
                z4 = z4;
                jArr13 = jArr5;
            }
            int[] iArr22 = iArr19;
            int i45 = 0;
            for (int i46 : iArr22) {
                if (i45 != 0) {
                    return new zzarf(jArr14, iArr18, i40, jArr15, iArr22);
                }
                i45 = i46 & 1;
            }
            if (i45 == 0) {
                throw new zzanp("The edited sample sequence does not contain a sync sample.");
            }
            return new zzarf(jArr14, iArr18, i40, jArr15, iArr22);
        }
        iZzu2 = 0;
        iZzu3 = -1;
        if (zzaqpVar.zzc()) {
            jArr = new long[iZza];
            iArr = new int[iZza];
            jArr2 = new long[iZza];
            i = iZzu2;
            iArr2 = new int[iZza];
            j = 0;
            j2 = 0;
            i2 = 0;
            i3 = 0;
            iZzu4 = 0;
            i4 = 0;
            iZzr = 0;
            while (i3 < iZza) {
                while (i4 == 0) {
                    zzaup.zzd(zzaqlVar.zza());
                    j = zzaqlVar.zzd;
                    i4 = zzaqlVar.zzc;
                    iZzu8 = iZzu8;
                    iZzu9 = iZzu9;
                }
                int i115 = iZzu8;
                i10 = iZzu9;
                if (zzauxVar5 != null) {
                    while (iZzu4 == 0) {
                        if (iZzu > 0) {
                            iZzu4 = 0;
                            break;
                        }
                        iZzu4 = zzauxVar5.zzu();
                        iZzr = zzauxVar5.zzr();
                        iZzu--;
                    }
                    iZzu4--;
                }
                int i116 = iZzr;
                jArr[i3] = j;
                iZzb = zzaqpVar.zzb();
                iArr[i3] = iZzb;
                if (iZzb > i2) {
                    i2 = iZzb;
                }
                jArr2[i3] = j2 + ((long) i116);
                if (zzauxVar4 == null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                iArr2[i3] = i11;
                if (i3 == iZzu3) {
                    iArr2[i3] = 1;
                    i--;
                    if (i > 0) {
                        iZzu3 = zzauxVar4.zzu() - 1;
                    }
                }
                int[] iArr110 = iArr2;
                j2 += (long) i10;
                i12 = i115 - 1;
                if (i12 == 0) {
                    iZzu5 = i10;
                    iZzu6 = i12;
                } else if (iZzu7 > 0) {
                    iZzu6 = zzauxVar3.zzu();
                    iZzu5 = zzauxVar3.zzu();
                    iZzu7--;
                } else {
                    iZzu5 = i10;
                    iZzu6 = 0;
                }
                int i117 = iZzu6;
                int i118 = iZzu5;
                j += (long) iArr[i3];
                i4--;
                i3++;
                zzaqpVar = zzaqpVar;
                jArr = jArr;
                iArr2 = iArr110;
                iZzu9 = i118;
                iZzr = i116;
                iZzu8 = i117;
            }
            long[] jArr18 = jArr;
            int[] iArr111 = iArr2;
            i5 = iZzu8;
            if (iZzu4 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzaup.zza(z2);
            while (iZzu > 0) {
                if (zzauxVar5.zzu() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzaup.zza(z3);
                zzauxVar5.zzr();
                iZzu--;
            }
            if (i == 0) {
                if (i5 == 0) {
                    i7 = i4;
                    i8 = i5;
                } else if (i4 == 0) {
                    if (iZzu7 != 0) {
                        i8 = 0;
                        i7 = 0;
                    } else {
                        zzarcVar = zzarcVar;
                        i2 = i2;
                    }
                    i9 = i2;
                    iArr3 = iArr;
                    jArr3 = jArr2;
                    jArr4 = jArr18;
                    iArr4 = iArr111;
                } else {
                    i8 = 0;
                    i7 = i4;
                }
                i6 = 0;
            } else {
                zzarcVar = zzarcVar;
                i2 = i2;
                i6 = i;
                i7 = i4;
                i8 = i5;
            }
            int i119 = zzarcVar.zza;
            StringBuilder sb3 = new StringBuilder(215);
            sb3.append("Inconsistent stbl box for track ");
            sb3.append(i119);
            sb3.append(": remainingSynchronizationSamples ");
            sb3.append(i6);
            sb3.append(", remainingSamplesAtTimestampDelta ");
            sb3.append(i8);
            sb3.append(", remainingSamplesInChunk ");
            sb3.append(i7);
            sb3.append(", remainingTimestampDeltaChanges ");
            sb3.append(iZzu7);
            Log.w("AtomParsers", sb3.toString());
            i9 = i2;
            iArr3 = iArr;
            jArr3 = jArr2;
            jArr4 = jArr18;
            iArr4 = iArr111;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            jArr2 = new long[iZza];
            i = iZzu2;
            iArr2 = new int[iZza];
            j = 0;
            j2 = 0;
            i2 = 0;
            i3 = 0;
            iZzu4 = 0;
            i4 = 0;
            iZzr = 0;
            while (i3 < iZza) {
                while (i4 == 0) {
                    zzaup.zzd(zzaqlVar.zza());
                    j = zzaqlVar.zzd;
                    i4 = zzaqlVar.zzc;
                    iZzu8 = iZzu8;
                    iZzu9 = iZzu9;
                }
                int i1110 = iZzu8;
                i10 = iZzu9;
                if (zzauxVar5 != null) {
                    while (iZzu4 == 0) {
                        if (iZzu > 0) {
                            iZzu4 = 0;
                            break;
                        }
                        iZzu4 = zzauxVar5.zzu();
                        iZzr = zzauxVar5.zzr();
                        iZzu--;
                    }
                    iZzu4--;
                }
                int i1111 = iZzr;
                jArr[i3] = j;
                iZzb = zzaqpVar.zzb();
                iArr[i3] = iZzb;
                if (iZzb > i2) {
                    i2 = iZzb;
                }
                jArr2[i3] = j2 + ((long) i1111);
                if (zzauxVar4 == null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                iArr2[i3] = i11;
                if (i3 == iZzu3) {
                    iArr2[i3] = 1;
                    i--;
                    if (i > 0) {
                        iZzu3 = zzauxVar4.zzu() - 1;
                    }
                }
                int[] iArr112 = iArr2;
                j2 += (long) i10;
                i12 = i1110 - 1;
                if (i12 == 0) {
                    iZzu5 = i10;
                    iZzu6 = i12;
                } else if (iZzu7 > 0) {
                    iZzu6 = zzauxVar3.zzu();
                    iZzu5 = zzauxVar3.zzu();
                    iZzu7--;
                } else {
                    iZzu5 = i10;
                    iZzu6 = 0;
                }
                int i1112 = iZzu6;
                int i1113 = iZzu5;
                j += (long) iArr[i3];
                i4--;
                i3++;
                zzaqpVar = zzaqpVar;
                jArr = jArr;
                iArr2 = iArr112;
                iZzu9 = i1113;
                iZzr = i1111;
                iZzu8 = i1112;
            }
            long[] jArr19 = jArr;
            int[] iArr113 = iArr2;
            i5 = iZzu8;
            if (iZzu4 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzaup.zza(z2);
            while (iZzu > 0) {
                if (zzauxVar5.zzu() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzaup.zza(z3);
                zzauxVar5.zzr();
                iZzu--;
            }
            if (i == 0) {
                if (i5 == 0) {
                    i7 = i4;
                    i8 = i5;
                } else if (i4 == 0) {
                    if (iZzu7 != 0) {
                        i8 = 0;
                        i7 = 0;
                    } else {
                        zzarcVar = zzarcVar;
                        i2 = i2;
                    }
                    i9 = i2;
                    iArr3 = iArr;
                    jArr3 = jArr2;
                    jArr4 = jArr19;
                    iArr4 = iArr113;
                } else {
                    i8 = 0;
                    i7 = i4;
                }
                i6 = 0;
            } else {
                zzarcVar = zzarcVar;
                i2 = i2;
                i6 = i;
                i7 = i4;
                i8 = i5;
            }
            int i1114 = zzarcVar.zza;
            StringBuilder sb4 = new StringBuilder(215);
            sb4.append("Inconsistent stbl box for track ");
            sb4.append(i1114);
            sb4.append(": remainingSynchronizationSamples ");
            sb4.append(i6);
            sb4.append(", remainingSamplesAtTimestampDelta ");
            sb4.append(i8);
            sb4.append(", remainingSamplesInChunk ");
            sb4.append(i7);
            sb4.append(", remainingTimestampDeltaChanges ");
            sb4.append(iZzu7);
            Log.w("AtomParsers", sb4.toString());
            i9 = i2;
            iArr3 = iArr;
            jArr3 = jArr2;
            jArr4 = jArr19;
            iArr4 = iArr113;
        }
        if (zzarcVar.zzi != null) {
        }
        zzave.zzk(jArr3, 1000000L, zzarcVar.zzc);
        return new zzarf(jArr4, iArr3, i9, jArr3, iArr4);
    }

    public static zzaru zzc(zzaqj zzaqjVar, boolean z) {
        if (z) {
            return null;
        }
        zzaux zzauxVar = zzaqjVar.zza;
        zzauxVar.zzi(8);
        while (zzauxVar.zzd() >= 8) {
            int iZzg = zzauxVar.zzg();
            int iZzr = zzauxVar.zzr();
            if (zzauxVar.zzr() == zzaqk.zzaD) {
                zzauxVar.zzi(iZzg);
                int i = iZzg + iZzr;
                zzauxVar.zzj(12);
                while (zzauxVar.zzg() < i) {
                    int iZzg2 = zzauxVar.zzg();
                    int iZzr2 = zzauxVar.zzr();
                    if (zzauxVar.zzr() == zzaqk.zzaE) {
                        zzauxVar.zzi(iZzg2);
                        int i2 = iZzg2 + iZzr2;
                        zzauxVar.zzj(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzauxVar.zzg() < i2) {
                            zzart zzartVarZza = zzaqx.zza(zzauxVar);
                            if (zzartVarZza != null) {
                                arrayList.add(zzartVarZza);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaru(arrayList);
                    }
                    zzauxVar.zzj(iZzr2 - 8);
                }
                return null;
            }
            zzauxVar.zzj(iZzr - 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    private static Pair<String, byte[]> zzd(zzaux zzauxVar, int i) {
        String str;
        zzauxVar.zzi(i + 12);
        zzauxVar.zzj(1);
        zzf(zzauxVar);
        zzauxVar.zzj(2);
        int iZzl = zzauxVar.zzl();
        if ((iZzl & 128) != 0) {
            zzauxVar.zzj(2);
        }
        if ((iZzl & 64) != 0) {
            zzauxVar.zzj(zzauxVar.zzm());
        }
        if ((iZzl & 32) != 0) {
            zzauxVar.zzj(2);
        }
        zzauxVar.zzj(1);
        zzf(zzauxVar);
        int iZzl2 = zzauxVar.zzl();
        if (iZzl2 == 32) {
            str = "video/mp4v-es";
        } else if (iZzl2 == 33) {
            str = "video/avc";
        } else if (iZzl2 == 35) {
            str = "video/hevc";
        } else if (iZzl2 != 64) {
            str = null;
            if (iZzl2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iZzl2 == 165) {
                str = "audio/ac3";
            } else if (iZzl2 != 166) {
                switch (iZzl2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iZzl2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            } else {
                str = "audio/eac3";
            }
        } else {
            str = "audio/mp4a-latm";
        }
        zzauxVar.zzj(12);
        zzauxVar.zzj(1);
        int iZzf = zzf(zzauxVar);
        byte[] bArr = new byte[iZzf];
        zzauxVar.zzk(bArr, 0, iZzf);
        return Pair.create(str, bArr);
    }

    private static int zze(zzaux zzauxVar, int i, int i2, zzaqn zzaqnVar, int i3) {
        int iZzg = zzauxVar.zzg();
        while (true) {
            if (iZzg - i >= i2) {
                return 0;
            }
            zzauxVar.zzi(iZzg);
            int iZzr = zzauxVar.zzr();
            zzaup.zzb(iZzr > 0, "childAtomSize should be positive");
            if (zzauxVar.zzr() == zzaqk.zzY) {
                int i4 = iZzg + 8;
                Pair pairCreate = null;
                boolean z = false;
                Integer numValueOf = null;
                zzard zzardVar = null;
                while (i4 - iZzg < iZzr) {
                    zzauxVar.zzi(i4);
                    int iZzr2 = zzauxVar.zzr();
                    int iZzr3 = zzauxVar.zzr();
                    if (iZzr3 == zzaqk.zzae) {
                        numValueOf = Integer.valueOf(zzauxVar.zzr());
                    } else if (iZzr3 == zzaqk.zzZ) {
                        zzauxVar.zzj(4);
                        z = zzauxVar.zzr() == zzg;
                    } else if (iZzr3 == zzaqk.zzaa) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= iZzr2) {
                                zzardVar = null;
                                break;
                            }
                            zzauxVar.zzi(i5);
                            int iZzr4 = zzauxVar.zzr();
                            if (zzauxVar.zzr() == zzaqk.zzab) {
                                zzauxVar.zzj(6);
                                boolean z2 = zzauxVar.zzl() == 1;
                                int iZzl = zzauxVar.zzl();
                                byte[] bArr = new byte[16];
                                zzauxVar.zzk(bArr, 0, 16);
                                zzardVar = new zzard(z2, iZzl, bArr);
                                break;
                            }
                            i5 += iZzr4;
                        }
                    }
                    i4 += iZzr2;
                }
                if (z) {
                    zzaup.zzb(numValueOf != null, "frma atom is mandatory");
                    zzaup.zzb(zzardVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, zzardVar);
                }
                if (pairCreate != null) {
                    zzaqnVar.zza[i3] = (zzard) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            iZzg += iZzr;
        }
    }

    private static int zzf(zzaux zzauxVar) {
        int iZzl = zzauxVar.zzl();
        int i = iZzl & 127;
        while ((iZzl & 128) == 128) {
            iZzl = zzauxVar.zzl();
            i = (i << 7) | (iZzl & 127);
        }
        return i;
    }
}
