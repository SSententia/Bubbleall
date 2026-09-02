package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqg {
    public byte[] zzM;
    public zzqh zzS;
    public boolean zzT;
    public zzox zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzow zzi;
    public byte[] zzj;
    public zzn zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private zzqg() {
    }

    /* synthetic */ zzqg(zzqf zzqfVar) {
    }

    private static Pair<String, List<byte[]>> zzf(zzamf zzamfVar) throws zzaha {
        try {
            zzamfVar.zzk(16);
            long jZzu = zzamfVar.zzu();
            if (jZzu == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (jZzu == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (jZzu != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            }
            int iZzg = zzamfVar.zzg() + 20;
            byte[] bArrZzi = zzamfVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzaha.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrZzi[iZzg] == 0 && bArrZzi[iZzg + 1] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List<byte[]> zzg(byte[] bArr) throws zzaha {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzaha.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                i = bArr[i4] & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
                i4++;
            }
            int i5 = i4 + 1;
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                i2 = bArr[i5] & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
                i5++;
            }
            int i8 = i5 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw zzaha.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i8, bArr2, 0, i6);
            int i10 = i8 + i6;
            if (bArr[i10] != 3) {
                throw zzaha.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzaha.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzamf zzamfVar) throws zzaha {
        try {
            int iZzp = zzamfVar.zzp();
            if (iZzp == 1) {
                return true;
            }
            if (iZzp == 65534) {
                zzamfVar.zzh(24);
                if (zzamfVar.zzx() == zzqi.zze.getMostSignificantBits() && zzamfVar.zzx() == zzqi.zze.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzaha {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        String strValueOf = String.valueOf(str);
        throw zzaha.zzb(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "), null);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x024d A[PHI: r8
  0x024d: PHI (r8v10 int) = (r8v6 int), (r8v7 int), (r8v8 int), (r8v9 int), (r8v0 int) binds: [B:128:0x0265, B:122:0x022f, B:119:0x020c, B:117:0x0208, B:112:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:170:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:171:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:177:0x03df  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:191:0x0407  */
    /* JADX WARN: Code duplicated, block: B:194:0x040c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0412  */
    /* JADX WARN: Code duplicated, block: B:216:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:245:0x0543  */
    /* JADX WARN: Code duplicated, block: B:247:0x0563  */
    /* JADX WARN: Code duplicated, block: B:249:0x0569  */
    /* JADX WARN: Code duplicated, block: B:263:0x0591  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zzd(zznx zznxVar, int i) throws zzaha {
        byte b;
        List<byte[]> listSingletonList;
        List<byte[]> list;
        String str;
        List<byte[]> listZzk;
        String str2;
        int i2;
        List<byte[]> listZzg;
        int i3;
        byte[] bArr;
        String str3;
        int i4;
        zzaft zzaftVar;
        int i5;
        float f;
        zzj zzjVar;
        byte[] bArr2;
        int i6;
        int i7;
        int i8;
        zznr zznrVarZza;
        String str4 = this.zzb;
        int i9 = 1;
        int iZzO = 4;
        int i10 = 0;
        int iIntValue = -1;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = 14;
                break;
            case "A_MPEG/L3":
                b = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 31;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 29;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = 13;
                break;
            case "A_AC3":
                b = 16;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 30;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        String str5 = "audio/raw";
        switch (b) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null && (zznrVarZza = zznr.zza(new zzamf(bArr))) != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11 = (z ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                } else if (zzalt.zzb(str3)) {
                    if (this.zzp == 0) {
                        i7 = this.zzn;
                        if (i7 == -1) {
                            i7 = this.zzl;
                        }
                        this.zzn = i7;
                        i8 = this.zzo;
                        if (i8 == -1) {
                            i8 = this.zzm;
                        }
                        this.zzo = i8;
                    }
                    i5 = this.zzn;
                    if (i5 != -1 || (i6 = this.zzo) == -1) {
                        f = -1.0f;
                    } else {
                        f = (this.zzm * i5) / (this.zzl * i6);
                    }
                    if (this.zzw) {
                        if (this.zzC != -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                            bArr2 = null;
                        } else {
                            bArr2 = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzK + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) this.zzA);
                            byteBufferOrder.putShort((short) this.zzB);
                        }
                        zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                    } else {
                        zzjVar = null;
                    }
                    if (this.zza != null && zzqi.zzf.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                    }
                    if (this.zzq == 0 || Float.compare(this.zzr, 0.0f) != 0 || Float.compare(this.zzs, 0.0f) != 0) {
                        i10 = iIntValue;
                    } else if (Float.compare(this.zzt, 0.0f) != 0) {
                        if (Float.compare(this.zzs, 90.0f) == 0) {
                            i10 = 90;
                        } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                            i10 = 180;
                        } else if (Float.compare(this.zzs, -90.0f) == 0) {
                            i10 = 270;
                        } else {
                            i10 = iIntValue;
                        }
                    }
                    zzaftVar.zzS(this.zzl);
                    zzaftVar.zzT(this.zzm);
                    zzaftVar.zzW(f);
                    zzaftVar.zzV(i10);
                    zzaftVar.zzX(this.zzu);
                    zzaftVar.zzY(this.zzv);
                    zzaftVar.zzZ(zzjVar);
                    i9 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzaha.zzb("Unexpected MIME type.", null);
                    }
                    i9 = 3;
                }
                if (this.zza != null && !zzqi.zzf.containsKey(this.zza)) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i11);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah = zzaftVar.zzah();
                zzox zzoxVarZzB = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB;
                zzoxVarZzB.zzs(zzafvVarZzah);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z2 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i12 = (z2 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i12);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah2 = zzaftVar.zzah();
                zzox zzoxVarZzB2 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB2;
                zzoxVarZzB2.zzs(zzafvVarZzah2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z3 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i13 = (z3 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i13);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah3 = zzaftVar.zzah();
                zzox zzoxVarZzB3 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB3;
                zzoxVarZzB3.zzs(zzafvVarZzah3);
                return;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i14 = (z4 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i14);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah4 = zzaftVar.zzah();
                zzox zzoxVarZzB4 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB4;
                zzoxVarZzB4.zzs(zzafvVarZzah4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str5 = "video/mp4v-es";
                listZzk = listSingletonList;
                i2 = -1;
                iZzO = -1;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z5 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i15 = (z5 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i15);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah5 = zzaftVar.zzah();
                zzox zzoxVarZzB5 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB5;
                zzoxVarZzB5.zzs(zzafvVarZzah5);
                return;
            case 7:
                zzne zzneVarZza = zzne.zza(new zzamf(zzi(str4)));
                list = zzneVarZza.zza;
                this.zzW = zzneVarZza.zzb;
                str = zzneVarZza.zzf;
                str5 = "video/avc";
                listZzk = list;
                iZzO = -1;
                str2 = str;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z6 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i16 = (z6 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i16);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah6 = zzaftVar.zzah();
                zzox zzoxVarZzB6 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB6;
                zzoxVarZzB6.zzs(zzafvVarZzah6);
                return;
            case 8:
                zzok zzokVarZza = zzok.zza(new zzamf(zzi(str4)));
                list = zzokVarZza.zza;
                this.zzW = zzokVarZza.zzb;
                str = zzokVarZza.zzc;
                str5 = "video/hevc";
                listZzk = list;
                iZzO = -1;
                str2 = str;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z7 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i17 = (z7 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i17);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah7 = zzaftVar.zzah();
                zzox zzoxVarZzB7 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB7;
                zzoxVarZzB7.zzs(zzafvVarZzah7);
                return;
            case 9:
                Pair<String, List<byte[]>> pairZzf = zzf(new zzamf(zzi(str4)));
                str5 = (String) pairZzf.first;
                listSingletonList = (List) pairZzf.second;
                listZzk = listSingletonList;
                i2 = -1;
                iZzO = -1;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z8 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i18 = (z8 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i18);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah8 = zzaftVar.zzah();
                zzox zzoxVarZzB8 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB8;
                zzoxVarZzB8.zzs(zzafvVarZzah8);
                return;
            case 10:
                str5 = "video/x-unknown";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z9 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i19 = (z9 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i19);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah9 = zzaftVar.zzah();
                zzox zzoxVarZzB9 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB9;
                zzoxVarZzB9.zzs(zzafvVarZzah9);
                return;
            case 11:
                listZzg = zzg(zzi(str4));
                str5 = "audio/vorbis";
                i3 = 8192;
                listZzk = listZzg;
                iZzO = -1;
                i2 = i3;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i110 = (z10 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i110);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah10 = zzaftVar.zzah();
                zzox zzoxVarZzB10 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB10;
                zzoxVarZzB10.zzs(zzafvVarZzah10);
                return;
            case 12:
                listZzg = new ArrayList<>(3);
                listZzg.add(zzi(this.zzb));
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                str5 = "audio/opus";
                i3 = 5760;
                listZzk = listZzg;
                iZzO = -1;
                i2 = i3;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i111 = (z11 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i111);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah11 = zzaftVar.zzah();
                zzox zzoxVarZzB11 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB11;
                zzoxVarZzB11.zzs(zzafvVarZzah11);
                return;
            case 13:
                List<byte[]> listSingletonList2 = Collections.singletonList(zzi(str4));
                zzmv zzmvVarZza = zzmx.zza(this.zzj);
                this.zzP = zzmvVarZza.zza;
                this.zzN = zzmvVarZza.zzb;
                str2 = zzmvVarZza.zzc;
                str5 = "audio/mp4a-latm";
                listZzk = listSingletonList2;
                i2 = -1;
                iZzO = -1;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i112 = (z12 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i112);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah12 = zzaftVar.zzah();
                zzox zzoxVarZzB12 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB12;
                zzoxVarZzB12.zzs(zzafvVarZzah12);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                iZzO = -1;
                i2 = 4096;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i113 = (z13 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i113);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah13 = zzaftVar.zzah();
                zzox zzoxVarZzB13 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB13;
                zzoxVarZzB13.zzs(zzafvVarZzah13);
                return;
            case 15:
                str5 = "audio/mpeg";
                iZzO = -1;
                i2 = 4096;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i114 = (z14 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i114);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah14 = zzaftVar.zzah();
                zzox zzoxVarZzB14 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB14;
                zzoxVarZzB14.zzs(zzafvVarZzah14);
                return;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i115 = (z15 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i115);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah15 = zzaftVar.zzah();
                zzox zzoxVarZzB15 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB15;
                zzoxVarZzB15.zzs(zzafvVarZzah15);
                return;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i116 = (z16 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i116);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah16 = zzaftVar.zzah();
                zzox zzoxVarZzB16 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB16;
                zzoxVarZzB16.zzs(zzafvVarZzah16);
                return;
            case 18:
                this.zzS = new zzqh();
                str5 = "audio/true-hd";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i117 = (z17 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i117);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah17 = zzaftVar.zzah();
                zzox zzoxVarZzB17 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB17;
                zzoxVarZzB17.zzs(zzafvVarZzah17);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i118 = (z18 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i118);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah18 = zzaftVar.zzah();
                zzox zzoxVarZzB18 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB18;
                zzoxVarZzB18.zzs(zzafvVarZzah18);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                iZzO = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i119 = (z19 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i119);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah19 = zzaftVar.zzah();
                zzox zzoxVarZzB19 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB19;
                zzoxVarZzB19.zzs(zzafvVarZzah19);
                return;
            case 22:
                listSingletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                listZzk = listSingletonList;
                i2 = -1;
                iZzO = -1;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1110 = (z110 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1110);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah110 = zzaftVar.zzah();
                zzox zzoxVarZzB110 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB110;
                zzoxVarZzB110.zzs(zzafvVarZzah110);
                return;
            case 23:
                if (zzh(new zzamf(zzi(str4)))) {
                    iZzO = zzamq.zzO(this.zzO);
                    if (iZzO == 0) {
                        int i20 = this.zzO;
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i20);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb.toString());
                    } else {
                        i2 = -1;
                    }
                    str2 = null;
                    listZzk = null;
                    bArr = this.zzM;
                    if (bArr != null) {
                        str2 = zznrVarZza.zza;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.zzU;
                    if (true != this.zzT) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                    int i1111 = (z111 ? 1 : 0) | i4;
                    zzaftVar = new zzaft();
                    if (zzalt.zza(str3)) {
                        if (zzalt.zzb(str3)) {
                            if (this.zzp == 0) {
                                i7 = this.zzn;
                                if (i7 == -1) {
                                    i7 = this.zzl;
                                }
                                this.zzn = i7;
                                i8 = this.zzo;
                                if (i8 == -1) {
                                    i8 = this.zzm;
                                }
                                this.zzo = i8;
                            }
                            i5 = this.zzn;
                            if (i5 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzw) {
                                if (this.zzC != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                            } else {
                                zzjVar = null;
                            }
                            if (this.zza != null) {
                                iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                            }
                            if (this.zzq == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            zzaftVar.zzS(this.zzl);
                            zzaftVar.zzT(this.zzm);
                            zzaftVar.zzW(f);
                            zzaftVar.zzV(i10);
                            zzaftVar.zzX(this.zzu);
                            zzaftVar.zzY(this.zzv);
                            zzaftVar.zzZ(zzjVar);
                            i9 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i9 = 3;
                        }
                        break;
                    } else {
                        zzaftVar.zzaa(this.zzN);
                        zzaftVar.zzab(this.zzP);
                        zzaftVar.zzac(iZzO);
                    }
                    if (this.zza != null) {
                        zzaftVar.zzF(this.zza);
                    }
                    zzaftVar.zzE(i);
                    zzaftVar.zzN(str3);
                    zzaftVar.zzO(i2);
                    zzaftVar.zzG(this.zzY);
                    zzaftVar.zzH(i1111);
                    zzaftVar.zzP(listZzk);
                    zzaftVar.zzK(str2);
                    zzaftVar.zzQ(this.zzk);
                    zzafv zzafvVarZzah111 = zzaftVar.zzah();
                    zzox zzoxVarZzB111 = zznxVar.zzB(this.zzc, i9);
                    this.zzV = zzoxVarZzB111;
                    zzoxVarZzB111.zzs(zzafvVarZzah111);
                    return;
                }
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                i2 = -1;
                iZzO = -1;
                str5 = "audio/x-unknown";
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1112 = (z112 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1112);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah112 = zzaftVar.zzah();
                zzox zzoxVarZzB112 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB112;
                zzoxVarZzB112.zzs(zzafvVarZzah112);
                return;
            case 24:
                iZzO = zzamq.zzO(this.zzO);
                if (iZzO == 0) {
                    int i21 = this.zzO;
                    StringBuilder sb2 = new StringBuilder(89);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i21);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb2.toString());
                    i2 = -1;
                    iZzO = -1;
                    str5 = "audio/x-unknown";
                } else {
                    i2 = -1;
                }
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1113 = (z113 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1113);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah113 = zzaftVar.zzah();
                zzox zzoxVarZzB113 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB113;
                zzoxVarZzB113.zzs(zzafvVarZzah113);
                return;
            case 25:
                int i22 = this.zzO;
                if (i22 == 8) {
                    iZzO = 3;
                } else {
                    if (i22 != 16) {
                        StringBuilder sb3 = new StringBuilder(86);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i22);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb3.toString());
                        i2 = -1;
                        iZzO = -1;
                        str5 = "audio/x-unknown";
                        str2 = null;
                        listZzk = null;
                        bArr = this.zzM;
                        if (bArr != null) {
                            str2 = zznrVarZza.zza;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z114 = this.zzU;
                        if (true != this.zzT) {
                            i4 = 0;
                        } else {
                            i4 = 2;
                        }
                        int i1114 = (z114 ? 1 : 0) | i4;
                        zzaftVar = new zzaft();
                        if (zzalt.zza(str3)) {
                            if (zzalt.zzb(str3)) {
                                if (this.zzp == 0) {
                                    i7 = this.zzn;
                                    if (i7 == -1) {
                                        i7 = this.zzl;
                                    }
                                    this.zzn = i7;
                                    i8 = this.zzo;
                                    if (i8 == -1) {
                                        i8 = this.zzm;
                                    }
                                    this.zzo = i8;
                                }
                                i5 = this.zzn;
                                if (i5 != -1) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.zzw) {
                                    if (this.zzC != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                                } else {
                                    zzjVar = null;
                                }
                                if (this.zza != null) {
                                    iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                                }
                                if (this.zzq == 0) {
                                    i10 = iIntValue;
                                } else {
                                    i10 = iIntValue;
                                }
                                zzaftVar.zzS(this.zzl);
                                zzaftVar.zzT(this.zzm);
                                zzaftVar.zzW(f);
                                zzaftVar.zzV(i10);
                                zzaftVar.zzX(this.zzu);
                                zzaftVar.zzY(this.zzv);
                                zzaftVar.zzZ(zzjVar);
                                i9 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i9 = 3;
                            }
                            break;
                        } else {
                            zzaftVar.zzaa(this.zzN);
                            zzaftVar.zzab(this.zzP);
                            zzaftVar.zzac(iZzO);
                        }
                        if (this.zza != null) {
                            zzaftVar.zzF(this.zza);
                        }
                        zzaftVar.zzE(i);
                        zzaftVar.zzN(str3);
                        zzaftVar.zzO(i2);
                        zzaftVar.zzG(this.zzY);
                        zzaftVar.zzH(i1114);
                        zzaftVar.zzP(listZzk);
                        zzaftVar.zzK(str2);
                        zzaftVar.zzQ(this.zzk);
                        zzafv zzafvVarZzah114 = zzaftVar.zzah();
                        zzox zzoxVarZzB114 = zznxVar.zzB(this.zzc, i9);
                        this.zzV = zzoxVarZzB114;
                        zzoxVarZzB114.zzs(zzafvVarZzah114);
                        return;
                    }
                    iZzO = 268435456;
                }
                i2 = -1;
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1115 = (z115 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1115);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah115 = zzaftVar.zzah();
                zzox zzoxVarZzB115 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB115;
                zzoxVarZzB115.zzs(zzafvVarZzah115);
                return;
            case 26:
                int i23 = this.zzO;
                if (i23 == 32) {
                    i2 = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder(90);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i23);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb4.toString());
                    i2 = -1;
                    iZzO = -1;
                    str5 = "audio/x-unknown";
                }
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1116 = (z116 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1116);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah116 = zzaftVar.zzah();
                zzox zzoxVarZzB116 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB116;
                zzoxVarZzB116.zzs(zzafvVarZzah116);
                return;
            case 27:
                i2 = -1;
                iZzO = -1;
                str5 = "application/x-subrip";
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1117 = (z117 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1117);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah117 = zzaftVar.zzah();
                zzox zzoxVarZzB117 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB117;
                zzoxVarZzB117.zzs(zzafvVarZzah117);
                return;
            case 28:
                listZzk = zzfoj.zzk(zzqi.zzc, zzi(this.zzb));
                i2 = -1;
                iZzO = -1;
                str5 = "text/x-ssa";
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1118 = (z118 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1118);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah118 = zzaftVar.zzah();
                zzox zzoxVarZzB118 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB118;
                zzoxVarZzB118.zzs(zzafvVarZzah118);
                return;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                listZzk = zzfoj.zzj(zzi(str4));
                i2 = -1;
                iZzO = -1;
                str5 = "application/vobsub";
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z119 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1119 = (z119 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i1119);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah119 = zzaftVar.zzah();
                zzox zzoxVarZzB119 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB119;
                zzoxVarZzB119.zzs(zzafvVarZzah119);
                return;
            case 30:
                i2 = -1;
                iZzO = -1;
                str5 = "application/pgs";
                str2 = null;
                listZzk = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11110 = (z1110 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i11110);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah1110 = zzaftVar.zzah();
                zzox zzoxVarZzB1110 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB1110;
                zzoxVarZzB1110.zzs(zzafvVarZzah1110);
                return;
            case 31:
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr4, 0, 4);
                listSingletonList = zzfoj.zzj(bArr4);
                str5 = "application/dvbsubs";
                listZzk = listSingletonList;
                i2 = -1;
                iZzO = -1;
                str2 = null;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zznrVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.zzU;
                if (true != this.zzT) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11111 = (z1111 ? 1 : 0) | i4;
                zzaftVar = new zzaft();
                if (zzalt.zza(str3)) {
                    if (zzalt.zzb(str3)) {
                        if (this.zzp == 0) {
                            i7 = this.zzn;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzn = i7;
                            i8 = this.zzo;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzo = i8;
                        }
                        i5 = this.zzn;
                        if (i5 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = null;
                            } else {
                                bArr2 = null;
                            }
                            zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
                        } else {
                            zzjVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzqi.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zzaftVar.zzS(this.zzl);
                        zzaftVar.zzT(this.zzm);
                        zzaftVar.zzW(f);
                        zzaftVar.zzV(i10);
                        zzaftVar.zzX(this.zzu);
                        zzaftVar.zzY(this.zzv);
                        zzaftVar.zzZ(zzjVar);
                        i9 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i9 = 3;
                    }
                    break;
                } else {
                    zzaftVar.zzaa(this.zzN);
                    zzaftVar.zzab(this.zzP);
                    zzaftVar.zzac(iZzO);
                }
                if (this.zza != null) {
                    zzaftVar.zzF(this.zza);
                }
                zzaftVar.zzE(i);
                zzaftVar.zzN(str3);
                zzaftVar.zzO(i2);
                zzaftVar.zzG(this.zzY);
                zzaftVar.zzH(i11111);
                zzaftVar.zzP(listZzk);
                zzaftVar.zzK(str2);
                zzaftVar.zzQ(this.zzk);
                zzafv zzafvVarZzah1111 = zzaftVar.zzah();
                zzox zzoxVarZzB1111 = zznxVar.zzB(this.zzc, i9);
                this.zzV = zzoxVarZzB1111;
                zzoxVarZzB1111.zzs(zzafvVarZzah1111);
                return;
            default:
                throw zzaha.zzb("Unrecognized codec identifier.", null);
        }
    }
}
