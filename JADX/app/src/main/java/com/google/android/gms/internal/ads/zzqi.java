package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.media2.widget.Cea708CCParser;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqi implements zznu {
    public static final zzoa zza = zzqd.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzamq.zzs("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> zzf;
    private boolean zzA;
    private int zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private zzalo zzH;
    private zzalo zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private int[] zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private boolean zzab;
    private int zzac;
    private byte zzad;
    private boolean zzae;
    private zznx zzaf;
    private final zzqb zzag;
    private final zzqk zzg;
    private final SparseArray<zzqg> zzh;
    private final boolean zzi;
    private final zzamf zzj;
    private final zzamf zzk;
    private final zzamf zzl;
    private final zzamf zzm;
    private final zzamf zzn;
    private final zzamf zzo;
    private final zzamf zzp;
    private final zzamf zzq;
    private final zzamf zzr;
    private final zzamf zzs;
    private ByteBuffer zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private zzqg zzz;

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(map);
    }

    public zzqi() {
        this(0);
    }

    protected static final int zzn(int i) {
        switch (i) {
            case Cea708CCParser.Const.CODE_C1_CW3 /* 131 */:
            case 136:
            case Cea708CCParser.Const.CODE_C1_DF3 /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case Cea708CCParser.Const.CODE_C1_CW6 /* 134 */:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzp(int i) throws zzaha {
        if (this.zzz != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzaha.zzb(sb.toString(), null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzaha {
        if (this.zzH == null || this.zzI == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw zzaha.zzb(sb.toString(), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    @RequiresNonNull({"#1.output"})
    private final void zzr(zzqg zzqgVar, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrZzw;
        int i4;
        int iZze;
        int i5;
        int i6;
        zzqh zzqhVar = zzqgVar.zzS;
        if (zzqhVar != null) {
            zzqhVar.zzc(zzqgVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(zzqgVar.zzb) || "S_TEXT/ASS".equals(zzqgVar.zzb)) {
                if (this.zzP > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzN;
                    if (j2 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzqgVar.zzb;
                        byte[] bArrZzi = this.zzp.zzi();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrZzw = zzw(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else {
                            if (b != 1) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzw = zzw(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                            i4 = 21;
                        }
                        System.arraycopy(bArrZzw, 0, bArrZzi, i4, bArrZzw.length);
                        for (int iZzg = this.zzp.zzg(); iZzg < this.zzp.zze(); iZzg++) {
                            if (this.zzp.zzi()[iZzg] == 0) {
                                this.zzp.zzf(iZzg);
                                break;
                            }
                        }
                        zzox zzoxVar = zzqgVar.zzV;
                        zzamf zzamfVar = this.zzp;
                        zzov.zzb(zzoxVar, zzamfVar, zzamfVar.zze());
                        iZze = i2 + this.zzp.zze();
                    }
                }
                iZze = i2;
            } else {
                iZze = i2;
            }
            if ((i & 268435456) == 0) {
                i5 = i;
                i6 = iZze;
            } else if (this.zzP > 1) {
                i6 = iZze;
                i5 = i & (-268435457);
            } else {
                int iZze2 = this.zzs.zze();
                zzqgVar.zzV.zzu(this.zzs, iZze2, 2);
                iZze += iZze2;
                i5 = i;
                i6 = iZze;
            }
            zzqgVar.zzV.zzv(j, i5, i6, i3, zzqgVar.zzi);
        }
        this.zzK = true;
    }

    private final void zzs(zznv zznvVar, int i) throws IOException {
        if (this.zzl.zze() >= i) {
            return;
        }
        if (this.zzl.zzj() < i) {
            zzamf zzamfVar = this.zzl;
            int iZzj = zzamfVar.zzj();
            zzamfVar.zzc(Math.max(iZzj + iZzj, i));
        }
        ((zznp) zznvVar).zza(this.zzl.zzi(), this.zzl.zze(), i - this.zzl.zze(), false);
        this.zzl.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzt(zznv zznvVar, zzqg zzqgVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzqgVar.zzb)) {
            zzv(zznvVar, zzb, i);
            int i3 = this.zzX;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzqgVar.zzb)) {
            zzv(zznvVar, zzd, i);
            int i4 = this.zzX;
            zzu();
            return i4;
        }
        zzox zzoxVar = zzqgVar.zzV;
        if (!this.zzZ) {
            if (zzqgVar.zzg) {
                this.zzT &= -1073741825;
                if (!this.zzaa) {
                    ((zznp) zznvVar).zza(this.zzl.zzi(), 0, 1, false);
                    this.zzW++;
                    if ((this.zzl.zzi()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw zzaha.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzad = this.zzl.zzi()[0];
                    this.zzaa = true;
                }
                byte b = this.zzad;
                if ((b & 1) == 1) {
                    int i5 = b & 2;
                    this.zzT |= BasicMeasure.EXACTLY;
                    if (!this.zzae) {
                        ((zznp) zznvVar).zza(this.zzq.zzi(), 0, 8, false);
                        this.zzW += 8;
                        this.zzae = true;
                        this.zzl.zzi()[0] = (byte) ((i5 != 2 ? 0 : 128) | 8);
                        this.zzl.zzh(0);
                        zzoxVar.zzu(this.zzl, 1, 1);
                        this.zzX++;
                        this.zzq.zzh(0);
                        zzoxVar.zzu(this.zzq, 8, 1);
                        this.zzX += 8;
                    }
                    if (i5 == 2) {
                        if (!this.zzab) {
                            ((zznp) zznvVar).zza(this.zzl.zzi(), 0, 1, false);
                            this.zzW++;
                            this.zzl.zzh(0);
                            this.zzac = this.zzl.zzn();
                            this.zzab = true;
                        }
                        int i6 = this.zzac * 4;
                        this.zzl.zza(i6);
                        ((zznp) zznvVar).zza(this.zzl.zzi(), 0, i6, false);
                        this.zzW += i6;
                        int i7 = (this.zzac >> 1) + 1;
                        int i8 = (i7 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzt;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.zzt = ByteBuffer.allocate(i8);
                        }
                        this.zzt.position(0);
                        this.zzt.putShort((short) i7);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i2 = this.zzac;
                            if (i9 >= i2) {
                                break;
                            }
                            int iZzB = this.zzl.zzB();
                            if (i9 % 2 == 0) {
                                this.zzt.putShort((short) (iZzB - i10));
                            } else {
                                this.zzt.putInt(iZzB - i10);
                            }
                            i9++;
                            i10 = iZzB;
                        }
                        int i11 = (i - this.zzW) - i10;
                        if ((i2 & 1) == 1) {
                            this.zzt.putInt(i11);
                        } else {
                            this.zzt.putShort((short) i11);
                            this.zzt.putInt(0);
                        }
                        this.zzr.zzb(this.zzt.array(), i8);
                        zzoxVar.zzu(this.zzr, i8, 1);
                        this.zzX += i8;
                    }
                }
            } else {
                byte[] bArr = zzqgVar.zzh;
                if (bArr != null) {
                    this.zzo.zzb(bArr, bArr.length);
                }
            }
            if (zzqgVar.zzf > 0) {
                this.zzT |= 268435456;
                this.zzs.zza(0);
                this.zzl.zza(4);
                this.zzl.zzi()[0] = (byte) ((i >> 24) & 255);
                this.zzl.zzi()[1] = (byte) ((i >> 16) & 255);
                this.zzl.zzi()[2] = (byte) ((i >> 8) & 255);
                this.zzl.zzi()[3] = (byte) (i & 255);
                zzoxVar.zzu(this.zzl, 4, 2);
                this.zzX += 4;
            }
            this.zzZ = true;
        }
        int iZze = i + this.zzo.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzqgVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzqgVar.zzb)) {
            if (zzqgVar.zzS != null) {
                zzakt.zzd(this.zzo.zze() == 0);
                zzqgVar.zzS.zzb(zznvVar);
            }
            while (true) {
                int i12 = this.zzW;
                if (i12 >= iZze) {
                    break;
                }
                int iZzx = zzx(zznvVar, zzoxVar, iZze - i12);
                this.zzW += iZzx;
                this.zzX += iZzx;
            }
        } else {
            byte[] bArrZzi = this.zzk.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i13 = zzqgVar.zzW;
            int i14 = 4 - i13;
            while (this.zzW < iZze) {
                int i15 = this.zzY;
                if (i15 == 0) {
                    int iMin = Math.min(i13, this.zzo.zzd());
                    ((zznp) zznvVar).zza(bArrZzi, i14 + iMin, i13 - iMin, false);
                    if (iMin > 0) {
                        this.zzo.zzm(bArrZzi, i14, iMin);
                    }
                    this.zzW += i13;
                    this.zzk.zzh(0);
                    this.zzY = this.zzk.zzB();
                    this.zzj.zzh(0);
                    zzov.zzb(zzoxVar, this.zzj, 4);
                    this.zzX += 4;
                } else {
                    int iZzx2 = zzx(zznvVar, zzoxVar, i15);
                    this.zzW += iZzx2;
                    this.zzX += iZzx2;
                    this.zzY -= iZzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzqgVar.zzb)) {
            this.zzm.zzh(0);
            zzov.zzb(zzoxVar, this.zzm, 4);
            this.zzX += 4;
        }
        int i16 = this.zzX;
        zzu();
        return i16;
    }

    private final void zzu() {
        this.zzW = 0;
        this.zzX = 0;
        this.zzY = 0;
        this.zzZ = false;
        this.zzaa = false;
        this.zzab = false;
        this.zzac = 0;
        this.zzad = (byte) 0;
        this.zzae = false;
        this.zzo.zza(0);
    }

    private final void zzv(zznv zznvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.zzp.zzj() < i2) {
            zzamf zzamfVar = this.zzp;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzamfVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzp.zzi(), 0, 32);
        }
        ((zznp) zznvVar).zza(this.zzp.zzi(), 32, i, false);
        this.zzp.zzh(0);
        this.zzp.zzf(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzakt.zza(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return zzamq.zzs(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private final int zzx(zznv zznvVar, zzox zzoxVar, int i) throws IOException {
        int iZzd = this.zzo.zzd();
        if (iZzd <= 0) {
            return zzov.zza(zzoxVar, zznvVar, i, false);
        }
        int iMin = Math.min(i, iZzd);
        zzov.zzb(zzoxVar, this.zzo, iMin);
        return iMin;
    }

    private final long zzy(long j) throws zzaha {
        long j2 = this.zzw;
        if (j2 != -9223372036854775807L) {
            return zzamq.zzH(j, j2, 1000L);
        }
        throw zzaha.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return new zzqj().zza(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzaf = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        this.zzK = false;
        while (!this.zzK) {
            if (!this.zzag.zzc(zznvVar)) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    zzqg zzqgVarValueAt = this.zzh.valueAt(i);
                    zzqgVarValueAt.zzV.getClass();
                    zzqh zzqhVar = zzqgVarValueAt.zzS;
                    if (zzqhVar != null) {
                        zzqhVar.zzd(zzqgVarValueAt);
                    }
                }
                return -1;
            }
            long jZzn = zznvVar.zzn();
            if (this.zzD) {
                this.zzF = jZzn;
                zzoqVar.zza = this.zzE;
                this.zzD = false;
                return 1;
            }
            if (this.zzA) {
                long j = this.zzF;
                if (j != -1) {
                    zzoqVar.zza = j;
                    this.zzF = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzG = -9223372036854775807L;
        this.zzL = 0;
        this.zzag.zzb();
        this.zzg.zza();
        zzu();
        for (int i = 0; i < this.zzh.size(); i++) {
            zzqh zzqhVar = this.zzh.valueAt(i).zzS;
            if (zzqhVar != null) {
                zzqhVar.zza();
            }
        }
    }

    protected final void zzh(int i, long j, long j2) throws zzaha {
        zzakt.zze(this.zzaf);
        if (i == 160) {
            this.zzV = false;
            return;
        }
        zzqf zzqfVar = null;
        if (i == 174) {
            this.zzz = new zzqg(zzqfVar);
            return;
        }
        if (i == 187) {
            this.zzJ = false;
            return;
        }
        if (i == 19899) {
            this.zzB = -1;
            this.zzC = -1L;
            return;
        }
        if (i == 20533) {
            zzp(i);
            this.zzz.zzg = true;
            return;
        }
        if (i == 21968) {
            zzp(i);
            this.zzz.zzw = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzv;
            if (j3 != -1 && j3 != j) {
                throw zzaha.zzb("Multiple Segment elements not supported", null);
            }
            this.zzv = j;
            this.zzu = j2;
            return;
        }
        if (i == 475249515) {
            this.zzH = new zzalo(32);
            this.zzI = new zzalo(32);
        } else if (i == 524531317 && !this.zzA) {
            if (this.zzi && this.zzE != -1) {
                this.zzD = true;
            } else {
                this.zzaf.zzD(new zzos(this.zzy, 0L));
                this.zzA = true;
            }
        }
    }

    protected final void zzi(int i) throws zzaha {
        int i2;
        int i3;
        zzot zzosVar;
        int i4;
        zzakt.zze(this.zzaf);
        if (i == 160) {
            if (this.zzL == 2) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzP; i6++) {
                    i5 += this.zzQ[i6];
                }
                zzqg zzqgVar = this.zzh.get(this.zzR);
                zzqgVar.zzV.getClass();
                int i7 = 0;
                while (i7 < this.zzP) {
                    long j = this.zzM + ((long) ((zzqgVar.zze * i7) / 1000));
                    int i8 = this.zzT;
                    if (i7 == 0) {
                        if (!this.zzV) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzQ[i2];
                    int i10 = i5 - i9;
                    zzr(zzqgVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzL = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzB;
                if (i11 != -1) {
                    long j2 = this.zzC;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzE = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzaha.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzp(i);
                zzqg zzqgVar2 = this.zzz;
                if (zzqgVar2.zzg) {
                    if (zzqgVar2.zzi == null) {
                        throw zzaha.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzqgVar2.zzk = new zzn(null, new zzm(zzadx.zza, null, "video/webm", this.zzz.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzp(i);
                zzqg zzqgVar3 = this.zzz;
                if (zzqgVar3.zzg && zzqgVar3.zzh != null) {
                    throw zzaha.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzw == -9223372036854775807L) {
                    this.zzw = 1000000L;
                }
                long j3 = this.zzx;
                if (j3 != -9223372036854775807L) {
                    this.zzy = zzy(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzh.size() == 0) {
                    throw zzaha.zzb("No valid tracks were found", null);
                }
                this.zzaf.zzC();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzA) {
                zznx zznxVar = this.zzaf;
                zzalo zzaloVar = this.zzH;
                zzalo zzaloVar2 = this.zzI;
                if (this.zzv == -1 || this.zzy == -9223372036854775807L || zzaloVar == null || zzaloVar.zzc() == 0 || zzaloVar2 == null || zzaloVar2.zzc() != zzaloVar.zzc()) {
                    zzosVar = new zzos(this.zzy, 0L);
                } else {
                    int iZzc = zzaloVar.zzc();
                    int[] iArrCopyOf = new int[iZzc];
                    long[] jArrCopyOf = new long[iZzc];
                    long[] jArrCopyOf2 = new long[iZzc];
                    long[] jArrCopyOf3 = new long[iZzc];
                    for (int i12 = 0; i12 < iZzc; i12++) {
                        jArrCopyOf3[i12] = zzaloVar.zzb(i12);
                        jArrCopyOf[i12] = this.zzv + zzaloVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = iZzc - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArrCopyOf[i13] = (int) (jArrCopyOf[i14] - jArrCopyOf[i13]);
                        jArrCopyOf2[i13] = jArrCopyOf3[i14] - jArrCopyOf3[i13];
                        i13 = i14;
                    }
                    iArrCopyOf[i4] = (int) ((this.zzv + this.zzu) - jArrCopyOf[i4]);
                    long j4 = this.zzy - jArrCopyOf3[i4];
                    jArrCopyOf2[i4] = j4;
                    if (j4 <= 0) {
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Discarding last cue point with unexpected duration: ");
                        sb.append(j4);
                        Log.w("MatroskaExtractor", sb.toString());
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i4);
                    }
                    zzosVar = new zznn(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zznxVar.zzD(zzosVar);
                this.zzA = true;
            }
            this.zzH = null;
            this.zzI = null;
            return;
        }
        zzqg zzqgVar4 = this.zzz;
        zzakt.zze(zzqgVar4);
        String str = zzqgVar4.zzb;
        if (str == null) {
            throw zzaha.zzb("CodecId is missing in TrackEntry element", null);
        }
        switch (str) {
            case "V_VP8":
            case "V_VP9":
            case "V_AV1":
            case "V_MPEG2":
            case "V_MPEG4/ISO/SP":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/AVC":
            case "V_MPEGH/ISO/HEVC":
            case "V_MS/VFW/FOURCC":
            case "V_THEORA":
            case "A_OPUS":
            case "A_VORBIS":
            case "A_AAC":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "A_AC3":
            case "A_EAC3":
            case "A_TRUEHD":
            case "A_DTS":
            case "A_DTS/EXPRESS":
            case "A_DTS/LOSSLESS":
            case "A_FLAC":
            case "A_MS/ACM":
            case "A_PCM/INT/LIT":
            case "A_PCM/INT/BIG":
            case "A_PCM/FLOAT/IEEE":
            case "S_TEXT/UTF8":
            case "S_TEXT/ASS":
            case "S_VOBSUB":
            case "S_HDMV/PGS":
            case "S_DVBSUB":
                zzqgVar4.zzd(this.zzaf, zzqgVar4.zzc);
                this.zzh.put(zzqgVar4.zzc, zzqgVar4);
                break;
        }
        this.zzz = null;
    }

    public zzqi(int i) {
        zzqb zzqbVar = new zzqb();
        this.zzv = -1L;
        this.zzw = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzE = -1L;
        this.zzF = -1L;
        this.zzG = -9223372036854775807L;
        this.zzag = zzqbVar;
        zzqbVar.zza(new zzqe(this, null));
        this.zzi = true;
        this.zzg = new zzqk();
        this.zzh = new SparseArray<>();
        this.zzl = new zzamf(4);
        this.zzm = new zzamf(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzn = new zzamf(4);
        this.zzj = new zzamf(zzalw.zza);
        this.zzk = new zzamf(4);
        this.zzo = new zzamf();
        this.zzp = new zzamf();
        this.zzq = new zzamf(8);
        this.zzr = new zzamf();
        this.zzs = new zzamf();
        this.zzQ = new int[1];
    }

    protected final void zzl(int i, String str) throws zzaha {
        if (i == 134) {
            zzp(i);
            this.zzz.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw zzaha.zzb(sb.toString(), null);
        }
        if (i == 21358) {
            zzp(i);
            this.zzz.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzp(i);
            this.zzz.zzY = str;
        }
    }

    protected final void zzm(int i, int i2, zznv zznvVar) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        Throwable th = null;
        int i10 = 1;
        int i11 = 0;
        if (i9 != 161 && i9 != 163) {
            if (i9 == 165) {
                if (this.zzL != 2) {
                    return;
                }
                zzqg zzqgVar = this.zzh.get(this.zzR);
                if (this.zzU != 4 || !"V_VP9".equals(zzqgVar.zzb)) {
                    ((zznp) zznvVar).zzd(i2, false);
                    return;
                }
                this.zzs.zza(i2);
                ((zznp) zznvVar).zza(this.zzs.zzi(), 0, i2, false);
                return;
            }
            if (i9 == 16877) {
                zzp(i);
                zzqg zzqgVar2 = this.zzz;
                if (zzqgVar2.zzX != 1685485123 && zzqgVar2.zzX != 1685480259) {
                    ((zznp) zznvVar).zzd(i2, false);
                    return;
                }
                zzqgVar2.zzM = new byte[i2];
                ((zznp) zznvVar).zza(zzqgVar2.zzM, 0, i2, false);
                return;
            }
            if (i9 == 16981) {
                zzp(i);
                zzqg zzqgVar3 = this.zzz;
                zzqgVar3.zzh = new byte[i2];
                ((zznp) zznvVar).zza(zzqgVar3.zzh, 0, i2, false);
                return;
            }
            if (i9 == 18402) {
                byte[] bArr = new byte[i2];
                ((zznp) zznvVar).zza(bArr, 0, i2, false);
                zzp(i);
                this.zzz.zzi = new zzow(1, bArr, 0, 0);
                return;
            }
            if (i9 == 21419) {
                Arrays.fill(this.zzn.zzi(), (byte) 0);
                ((zznp) zznvVar).zza(this.zzn.zzi(), 4 - i2, i2, false);
                this.zzn.zzh(0);
                this.zzB = (int) this.zzn.zzt();
                return;
            }
            if (i9 == 25506) {
                zzp(i);
                zzqg zzqgVar4 = this.zzz;
                zzqgVar4.zzj = new byte[i2];
                ((zznp) zznvVar).zza(zzqgVar4.zzj, 0, i2, false);
                return;
            }
            if (i9 != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i9);
                throw zzaha.zzb(sb.toString(), null);
            }
            zzp(i);
            zzqg zzqgVar5 = this.zzz;
            zzqgVar5.zzu = new byte[i2];
            ((zznp) zznvVar).zza(zzqgVar5.zzu, 0, i2, false);
            return;
        }
        if (this.zzL == 0) {
            this.zzR = (int) this.zzg.zzb(zznvVar, false, true, 8);
            this.zzS = this.zzg.zzc();
            this.zzN = -9223372036854775807L;
            this.zzL = 1;
            this.zzl.zza(0);
        }
        zzqg zzqgVar6 = this.zzh.get(this.zzR);
        if (zzqgVar6 == null) {
            ((zznp) zznvVar).zzd(i2 - this.zzS, false);
            this.zzL = 0;
            return;
        }
        zzqgVar6.zzV.getClass();
        if (this.zzL == 1) {
            zzs(zznvVar, 3);
            int i12 = (this.zzl.zzi()[2] & 6) >> 1;
            byte b = UByte.MAX_VALUE;
            if (i12 == 0) {
                this.zzP = 1;
                int[] iArrZzz = zzz(this.zzQ, 1);
                this.zzQ = iArrZzz;
                iArrZzz[0] = (i2 - this.zzS) - 3;
            } else {
                zzs(zznvVar, 4);
                int i13 = (this.zzl.zzi()[3] & UByte.MAX_VALUE) + 1;
                this.zzP = i13;
                int[] iArrZzz2 = zzz(this.zzQ, i13);
                this.zzQ = iArrZzz2;
                if (i12 == 2) {
                    int i14 = this.zzS;
                    int i15 = this.zzP;
                    Arrays.fill(iArrZzz2, 0, i15, ((i2 - i14) - 4) / i15);
                } else if (i12 == 1) {
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 4;
                    while (true) {
                        i5 = this.zzP - 1;
                        if (i16 >= i5) {
                            break;
                        }
                        this.zzQ[i16] = 0;
                        while (true) {
                            i6 = i18 + 1;
                            zzs(zznvVar, i6);
                            int i19 = this.zzl.zzi()[i18] & UByte.MAX_VALUE;
                            int[] iArr = this.zzQ;
                            i7 = iArr[i16] + i19;
                            iArr[i16] = i7;
                            if (i19 != 255) {
                                break;
                            } else {
                                i18 = i6;
                            }
                        }
                        i17 += i7;
                        i16++;
                        i18 = i6;
                    }
                    this.zzQ[i5] = ((i2 - this.zzS) - i18) - i17;
                } else {
                    if (i12 != 3) {
                        throw zzaha.zzb("Unexpected lacing value: 2", null);
                    }
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 4;
                    while (true) {
                        int i23 = this.zzP - 1;
                        if (i20 >= i23) {
                            this.zzQ[i23] = ((i2 - this.zzS) - i22) - i21;
                            break;
                        }
                        this.zzQ[i20] = i11;
                        int i24 = i22 + 1;
                        zzs(zznvVar, i24);
                        if (this.zzl.zzi()[i22] == 0) {
                            throw zzaha.zzb("No valid varint length mask found", th);
                        }
                        int i25 = i11;
                        while (true) {
                            if (i25 >= 8) {
                                j = 0;
                                i4 = i24;
                                break;
                            }
                            int i26 = i10 << (7 - i25);
                            if ((this.zzl.zzi()[i22] & i26) != 0) {
                                int i27 = i24 + i25;
                                zzs(zznvVar, i27);
                                int i28 = i22 + 1;
                                j = this.zzl.zzi()[i22] & b & (~i26);
                                while (i28 < i27) {
                                    j = (j << 8) | ((long) (this.zzl.zzi()[i28] & b));
                                    i28++;
                                    i27 = i27;
                                    b = UByte.MAX_VALUE;
                                }
                                i4 = i27;
                                if (i20 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i25 * 7) + 6)) - 1;
                                break;
                            }
                            i25++;
                            i10 = 1;
                            b = UByte.MAX_VALUE;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw zzaha.zzb("EBML lacing sample size out of range.", null);
                        }
                        int i29 = (int) j;
                        int[] iArr2 = this.zzQ;
                        if (i20 != 0) {
                            i29 += iArr2[i20 - 1];
                        }
                        iArr2[i20] = i29;
                        i21 += i29;
                        i20++;
                        i22 = i4;
                        th = null;
                        i10 = 1;
                        i11 = 0;
                        b = UByte.MAX_VALUE;
                    }
                }
            }
            this.zzM = this.zzG + zzy((this.zzl.zzi()[0] << 8) | (this.zzl.zzi()[1] & UByte.MAX_VALUE));
            if (zzqgVar6.zzd == 2) {
                i8 = 1;
            } else {
                if (i9 == 163) {
                    if ((this.zzl.zzi()[2] & ByteCompanionObject.MIN_VALUE) == 128) {
                        i9 = 163;
                        i8 = 1;
                    } else {
                        i9 = 163;
                    }
                }
                i8 = 0;
            }
            this.zzT = i8;
            this.zzL = 2;
            this.zzO = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i9 == i3) {
            while (true) {
                int i30 = this.zzO;
                if (i30 >= this.zzP) {
                    this.zzL = 0;
                    return;
                }
                zzr(zzqgVar6, ((long) ((this.zzO * zzqgVar6.zze) / 1000)) + this.zzM, this.zzT, zzt(zznvVar, zzqgVar6, this.zzQ[i30]), 0);
                this.zzO++;
            }
        } else {
            while (true) {
                int i31 = this.zzO;
                if (i31 >= this.zzP) {
                    return;
                }
                int[] iArr3 = this.zzQ;
                iArr3[i31] = zzt(zznvVar, zzqgVar6, iArr3[i31]);
                this.zzO++;
            }
        }
    }

    protected final void zzk(int i, double d) throws zzaha {
        if (i == 181) {
            zzp(i);
            this.zzz.zzP = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzx = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzp(i);
                this.zzz.zzC = (float) d;
                break;
            case 21970:
                zzp(i);
                this.zzz.zzD = (float) d;
                break;
            case 21971:
                zzp(i);
                this.zzz.zzE = (float) d;
                break;
            case 21972:
                zzp(i);
                this.zzz.zzF = (float) d;
                break;
            case 21973:
                zzp(i);
                this.zzz.zzG = (float) d;
                break;
            case 21974:
                zzp(i);
                this.zzz.zzH = (float) d;
                break;
            case 21975:
                zzp(i);
                this.zzz.zzI = (float) d;
                break;
            case 21976:
                zzp(i);
                this.zzz.zzJ = (float) d;
                break;
            case 21977:
                zzp(i);
                this.zzz.zzK = (float) d;
                break;
            case 21978:
                zzp(i);
                this.zzz.zzL = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzp(i);
                        this.zzz.zzr = (float) d;
                        break;
                    case 30324:
                        zzp(i);
                        this.zzz.zzs = (float) d;
                        break;
                    case 30325:
                        zzp(i);
                        this.zzz.zzt = (float) d;
                        break;
                }
                break;
        }
    }

    protected final void zzj(int i, long j) throws zzaha {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzaha.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzaha.zzb(sb2.toString(), null);
        }
        switch (i) {
            case Cea708CCParser.Const.CODE_C1_CW3 /* 131 */:
                zzp(i);
                this.zzz.zzd = (int) j;
                return;
            case 136:
                zzp(i);
                this.zzz.zzU = j == 1;
                return;
            case Cea708CCParser.Const.CODE_C1_DF3 /* 155 */:
                this.zzN = zzy(j);
                return;
            case 159:
                zzp(i);
                this.zzz.zzN = (int) j;
                return;
            case 176:
                zzp(i);
                this.zzz.zzl = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzH.zza(zzy(j));
                return;
            case 186:
                zzp(i);
                this.zzz.zzm = (int) j;
                return;
            case 215:
                zzp(i);
                this.zzz.zzc = (int) j;
                return;
            case 231:
                this.zzG = zzy(j);
                return;
            case 238:
                this.zzU = (int) j;
                return;
            case 241:
                if (this.zzJ) {
                    return;
                }
                zzq(i);
                this.zzI.zza(j);
                this.zzJ = true;
                return;
            case 251:
                this.zzV = true;
                return;
            case 16871:
                zzp(i);
                this.zzz.zzX = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzaha.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzaha.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzaha.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzaha.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzaha.zzb(sb7.toString(), null);
            case 21420:
                this.zzC = j + this.zzv;
                return;
            case 21432:
                zzp(i);
                int i2 = (int) j;
                if (i2 == 0) {
                    this.zzz.zzv = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzz.zzv = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzz.zzv = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzz.zzv = 3;
                    return;
                }
            case 21680:
                zzp(i);
                this.zzz.zzn = (int) j;
                return;
            case 21682:
                zzp(i);
                this.zzz.zzp = (int) j;
                return;
            case 21690:
                zzp(i);
                this.zzz.zzo = (int) j;
                return;
            case 21930:
                zzp(i);
                this.zzz.zzT = j == 1;
                return;
            case 21998:
                zzp(i);
                this.zzz.zzf = (int) j;
                return;
            case 22186:
                zzp(i);
                this.zzz.zzQ = j;
                return;
            case 22203:
                zzp(i);
                this.zzz.zzR = j;
                return;
            case 25188:
                zzp(i);
                this.zzz.zzO = (int) j;
                return;
            case 30321:
                zzp(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.zzz.zzq = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzz.zzq = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzz.zzq = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzz.zzq = 3;
                    return;
                }
            case 2352003:
                zzp(i);
                this.zzz.zze = (int) j;
                return;
            case 2807729:
                this.zzw = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        zzp(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.zzz.zzz = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzz.zzz = 1;
                            return;
                        }
                    case 21946:
                        zzp(i);
                        int iZzb = zzj.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzz.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i);
                        this.zzz.zzw = true;
                        int iZza = zzj.zza((int) j);
                        if (iZza != -1) {
                            this.zzz.zzx = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i);
                        this.zzz.zzA = (int) j;
                        return;
                    case 21949:
                        zzp(i);
                        this.zzz.zzB = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
