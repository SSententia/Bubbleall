package com.google.android.gms.internal.ads;

import androidx.media2.widget.Cea708CCParser;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzna {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, Cea708CCParser.Const.CODE_C1_TGW, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzafv zza(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        int i = zzc[(zzamfVar.zzn() & 192) >> 6];
        int iZzn = zzamfVar.zzn();
        int i2 = zze[(iZzn & 56) >> 3];
        if ((iZzn & 4) != 0) {
            i2++;
        }
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN("audio/ac3");
        zzaftVar.zzaa(i2);
        zzaftVar.zzab(i);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    public static zzafv zzb(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        zzamfVar.zzk(2);
        int i = zzc[(zzamfVar.zzn() & 192) >> 6];
        int iZzn = zzamfVar.zzn();
        int i2 = zze[(iZzn & 14) >> 1];
        if ((iZzn & 1) != 0) {
            i2++;
        }
        if (((zzamfVar.zzn() & 30) >> 1) > 0 && (2 & zzamfVar.zzn()) != 0) {
            i2 += 2;
        }
        String str3 = (zzamfVar.zzd() <= 0 || (zzamfVar.zzn() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN(str3);
        zzaftVar.zzaa(i2);
        zzaftVar.zzab(i);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    public static zzmz zzc(zzame zzameVar) {
        int iZze;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iZzh;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzc = zzameVar.zzc();
        zzameVar.zzf(40);
        int iZzh2 = zzameVar.zzh(5);
        zzameVar.zzd(iZzc);
        int i10 = -1;
        if (iZzh2 > 10) {
            zzameVar.zzf(16);
            int iZzh3 = zzameVar.zzh(2);
            if (iZzh3 == 0) {
                i10 = 0;
            } else if (iZzh3 == 1) {
                i10 = 1;
            } else if (iZzh3 == 2) {
                i10 = 2;
            }
            zzameVar.zzf(3);
            int iZzh4 = zzameVar.zzh(11) + 1;
            iZze = iZzh4 + iZzh4;
            int iZzh5 = zzameVar.zzh(2);
            if (iZzh5 == 3) {
                i5 = 6;
                i = zzd[zzameVar.zzh(2)];
                iZzh = 3;
            } else {
                iZzh = zzameVar.zzh(2);
                i5 = zzb[iZzh];
                i = zzc[iZzh5];
            }
            i3 = i5 * 256;
            int iZzh6 = zzameVar.zzh(3);
            boolean zZzg = zzameVar.zzg();
            i2 = zze[iZzh6] + (zZzg ? 1 : 0);
            zzameVar.zzf(10);
            if (zzameVar.zzg()) {
                zzameVar.zzf(8);
            }
            if (iZzh6 == 0) {
                zzameVar.zzf(5);
                if (zzameVar.zzg()) {
                    zzameVar.zzf(8);
                }
                i6 = 0;
                iZzh6 = 0;
            } else {
                i6 = iZzh6;
            }
            if (i10 == 1) {
                if (zzameVar.zzg()) {
                    zzameVar.zzf(16);
                }
                i7 = 1;
            } else {
                i7 = i10;
            }
            if (zzameVar.zzg()) {
                if (i6 > 2) {
                    zzameVar.zzf(2);
                }
                if ((i6 & 1) != 0 && i6 > 2) {
                    zzameVar.zzf(6);
                }
                if ((i6 & 4) != 0) {
                    zzameVar.zzf(6);
                }
                if (zZzg && zzameVar.zzg()) {
                    zzameVar.zzf(5);
                }
                if (i7 == 0) {
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    if (i6 == 0 && zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    int iZzh7 = zzameVar.zzh(2);
                    if (iZzh7 == 1) {
                        zzameVar.zzf(5);
                    } else if (iZzh7 == 2) {
                        zzameVar.zzf(12);
                    } else if (iZzh7 == 3) {
                        int iZzh8 = zzameVar.zzh(5);
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(5);
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(4);
                                }
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(4);
                                }
                            }
                        }
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(5);
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(7);
                                if (zzameVar.zzg()) {
                                    i9 = 8;
                                    zzameVar.zzf(8);
                                } else {
                                    i9 = 8;
                                }
                            } else {
                                i9 = 8;
                            }
                        } else {
                            i9 = 8;
                        }
                        zzameVar.zzf((iZzh8 + 2) * i9);
                        zzameVar.zzj();
                    }
                    if (i6 < 2) {
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(14);
                        }
                        if (iZzh6 == 0 && zzameVar.zzg()) {
                            zzameVar.zzf(14);
                        }
                    }
                    if (!zzameVar.zzg()) {
                        i7 = 0;
                    } else if (iZzh == 0) {
                        zzameVar.zzf(5);
                        i7 = 0;
                        iZzh = 0;
                    } else {
                        for (int i11 = 0; i11 < i5; i11++) {
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(5);
                            }
                        }
                        i7 = 0;
                    }
                }
            }
            if (zzameVar.zzg()) {
                zzameVar.zzf(5);
                if (i6 == 2) {
                    zzameVar.zzf(4);
                    i6 = 2;
                }
                if (i6 >= 6) {
                    zzameVar.zzf(2);
                }
                if (zzameVar.zzg()) {
                    i8 = 8;
                    zzameVar.zzf(8);
                } else {
                    i8 = 8;
                }
                if (i6 == 0 && zzameVar.zzg()) {
                    zzameVar.zzf(i8);
                }
                if (iZzh5 < 3) {
                    zzameVar.zze();
                }
            }
            if (i7 == 0 && iZzh != 3) {
                zzameVar.zze();
            }
            if (i7 == 2 && (iZzh == 3 || zzameVar.zzg())) {
                zzameVar.zzf(6);
            }
            str = (zzameVar.zzg() && zzameVar.zzh(6) == 1 && zzameVar.zzh(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i10;
        } else {
            zzameVar.zzf(32);
            int iZzh9 = zzameVar.zzh(2);
            String str2 = iZzh9 == 3 ? null : "audio/ac3";
            iZze = zze(iZzh9, zzameVar.zzh(6));
            zzameVar.zzf(8);
            int iZzh10 = zzameVar.zzh(3);
            if ((iZzh10 & 1) != 0 && iZzh10 != 1) {
                zzameVar.zzf(2);
            }
            if ((iZzh10 & 4) != 0) {
                zzameVar.zzf(2);
            }
            if (iZzh10 == 2) {
                zzameVar.zzf(2);
            }
            i = iZzh9 < 3 ? zzc[iZzh9] : -1;
            i2 = zze[iZzh10] + (zzameVar.zzg() ? 1 : 0);
            i3 = 1536;
            i4 = -1;
            str = str2;
        }
        return new zzmz(str, i4, i2, i, iZze, i3, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zze((b & 192) >> 6, b & 63);
        }
        int i = ((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    private static int zze(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
