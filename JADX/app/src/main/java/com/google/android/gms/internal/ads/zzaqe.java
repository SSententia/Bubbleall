package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqe {
    public boolean zzL;
    public zzapx zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzapw zzg;
    public byte[] zzh;
    public zzapk zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaqe() {
    }

    /* synthetic */ zzaqe(zzaqd zzaqdVar) {
    }

    private static List<byte[]> zzc(zzaux zzauxVar) throws zzanp {
        try {
            zzauxVar.zzj(16);
            if (zzauxVar.zzq() != 826496599) {
                return null;
            }
            int iZzg = zzauxVar.zzg() + 20;
            byte[] bArr = zzauxVar.zza;
            while (true) {
                int length = bArr.length;
                if (iZzg >= length - 4) {
                    throw new zzanp("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[iZzg] == 0 && bArr[iZzg + 1] == 0 && bArr[iZzg + 2] == 1 && bArr[iZzg + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, iZzg, length));
                }
                iZzg++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzanp {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new zzanp("Error parsing vorbis codec private");
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                i = bArr[i4];
                if (i != -1) {
                    break;
                }
                i3 += 255;
                i4++;
            }
            int i5 = i4 + 1;
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                i2 = bArr[i5];
                if (i2 != -1) {
                    break;
                }
                i7 += 255;
                i5++;
            }
            int i8 = i5 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw new zzanp("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i8, bArr2, 0, i6);
            int i10 = i8 + i6;
            if (bArr[i10] != 3) {
                throw new zzanp("Error parsing vorbis codec private");
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new zzanp("Error parsing vorbis codec private");
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzaux zzauxVar) throws zzanp {
        try {
            int iZzn = zzauxVar.zzn();
            if (iZzn == 1) {
                return true;
            }
            if (iZzn == 65534) {
                zzauxVar.zzi(24);
                if (zzauxVar.zzs() == zzaqf.zzd.getMostSignificantBits() && zzauxVar.zzs() == zzaqf.zzd.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01c2 A[PHI: r1
  0x01c2: PHI (r1v87 int) = (r1v84 int), (r1v90 int) binds: [B:105:0x01db, B:99:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:149:0x031f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0325  */
    /* JADX WARN: Code duplicated, block: B:153:0x0329  */
    /* JADX WARN: Code duplicated, block: B:155:0x032e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0336  */
    /* JADX WARN: Code duplicated, block: B:160:0x033b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0342  */
    /* JADX WARN: Code duplicated, block: B:166:0x0352  */
    /* JADX WARN: Code duplicated, block: B:169:0x0358  */
    /* JADX WARN: Code duplicated, block: B:171:0x035e  */
    /* JADX WARN: Code duplicated, block: B:191:0x040a  */
    /* JADX WARN: Code duplicated, block: B:193:0x041a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0445  */
    /* JADX WARN: Code duplicated, block: B:197:0x044b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0470  */
    /* JADX WARN: Code duplicated, block: B:201:0x0476  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    public final void zzb(zzapp zzappVar, int i) throws zzanp {
        byte b;
        List<byte[]> listSingletonList;
        List<byte[]> list;
        int i2;
        int i3;
        int i4;
        int iZzo;
        int i5;
        int i6;
        zzanm zzanmVarZze;
        int i7;
        int i8;
        float f;
        zzavh zzavhVar;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        int i12 = 2;
        switch (this.zza) {
            case "V_MPEG4/ISO/AP":
                b = 5;
                break;
            case "V_MPEG4/ISO/SP":
                b = 3;
                break;
            case "A_MS/ACM":
                b = 22;
                break;
            case "A_TRUEHD":
                b = 17;
                break;
            case "A_VORBIS":
                b = 10;
                break;
            case "A_MPEG/L2":
                b = 13;
                break;
            case "A_MPEG/L3":
                b = 14;
                break;
            case "V_MS/VFW/FOURCC":
                b = 8;
                break;
            case "S_DVBSUB":
                b = 27;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 4;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 6;
                break;
            case "S_VOBSUB":
                b = 25;
                break;
            case "A_DTS/LOSSLESS":
                b = 20;
                break;
            case "A_AAC":
                b = 12;
                break;
            case "A_AC3":
                b = 15;
                break;
            case "A_DTS":
                b = 18;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 26;
                break;
            case "V_THEORA":
                b = 9;
                break;
            case "A_DTS/EXPRESS":
                b = 19;
                break;
            case "A_PCM/INT/LIT":
                b = 23;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 7;
                break;
            case "S_TEXT/UTF8":
                b = 24;
                break;
            case "V_MPEG2":
                b = 2;
                break;
            case "A_EAC3":
                b = 16;
                break;
            case "A_FLAC":
                b = 21;
                break;
            case "A_OPUS":
                b = 11;
                break;
            default:
                b = -1;
                break;
        }
        String str = "audio/raw";
        switch (b) {
            case 0:
                str = "video/x-vnd.on2.vp8";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                } else if (zzauu.zzb(str)) {
                    if (this.zzn == 0) {
                        i10 = this.zzl;
                        i7 = -1;
                        if (i10 == -1) {
                            i10 = this.zzj;
                        }
                        this.zzl = i10;
                        i11 = this.zzm;
                        if (i11 == -1) {
                            i11 = this.zzk;
                        }
                        this.zzm = i11;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.zzl;
                    if (i8 != i7 || (i9 = this.zzm) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.zzk * i8) / (this.zzj * i9);
                    }
                    if (this.zzq) {
                        if (this.zzw != -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            byteBufferWrap.put((byte) 0);
                            byteBufferWrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) (this.zzE + 0.5f));
                            byteBufferWrap.putShort((short) (this.zzF + 0.5f));
                            byteBufferWrap.putShort((short) this.zzu);
                            byteBufferWrap.putShort((short) this.zzv);
                        }
                        zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                    } else {
                        zzavhVar = null;
                    }
                    zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                } else {
                    if ("application/x-subrip".equals(str)) {
                        zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if ("application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                            throw new zzanp("Unexpected MIME type.");
                        }
                        zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                    }
                    i12 = 3;
                }
                zzapx zzapxVarZzbf = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf;
                zzapxVarZzbf.zza(zzanmVarZze);
                return;
            case 1:
                str = "video/x-vnd.on2.vp9";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z2 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z2 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf2 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf2;
                zzapxVarZzbf2.zza(zzanmVarZze);
                return;
            case 2:
                str = "video/mpeg2";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z3 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z3 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf3 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf3;
                zzapxVarZzbf3.zza(zzanmVarZze);
                return;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str = "video/mp4v-es";
                i4 = -1;
                i3 = -1;
                boolean z4 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z4 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf4 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf4;
                zzapxVarZzbf4.zza(zzanmVarZze);
                return;
            case 6:
                zzavf zzavfVarZza = zzavf.zza(new zzaux(this.zzh));
                list = zzavfVarZza.zza;
                this.zzO = zzavfVarZza.zzb;
                str = "video/avc";
                listSingletonList = list;
                i4 = -1;
                i3 = -1;
                boolean z5 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z5 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf5 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf5;
                zzapxVarZzbf5.zza(zzanmVarZze);
                return;
            case 7:
                zzavl zzavlVarZza = zzavl.zza(new zzaux(this.zzh));
                list = zzavlVarZza.zza;
                this.zzO = zzavlVarZza.zzb;
                str = "video/hevc";
                listSingletonList = list;
                i4 = -1;
                i3 = -1;
                boolean z6 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z6 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf6 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf6;
                zzapxVarZzbf6.zza(zzanmVarZze);
                return;
            case 8:
                listSingletonList = zzc(new zzaux(this.zzh));
                if (listSingletonList != null) {
                    str = "video/wvc1";
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str = "video/x-unknown";
                }
                i4 = -1;
                i3 = -1;
                boolean z7 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z7 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf7 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf7;
                zzapxVarZzbf7.zza(zzanmVarZze);
                return;
            case 9:
                str = "video/x-unknown";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z8 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z8 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf8 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf8;
                zzapxVarZzbf8.zza(zzanmVarZze);
                return;
            case 10:
                listSingletonList = zzd(this.zzh);
                str = "audio/vorbis";
                i2 = 8192;
                i3 = i2;
                i4 = -1;
                boolean z9 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z9 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf9 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf9;
                zzapxVarZzbf9.zza(zzanmVarZze);
                return;
            case 11:
                listSingletonList = new ArrayList<>(3);
                listSingletonList.add(this.zzh);
                listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str = "audio/opus";
                i2 = 5760;
                i3 = i2;
                i4 = -1;
                boolean z10 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z10 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf10 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf10;
                zzapxVarZzbf10.zza(zzanmVarZze);
                return;
            case 12:
                listSingletonList = Collections.singletonList(this.zzh);
                str = "audio/mp4a-latm";
                i4 = -1;
                i3 = -1;
                boolean z11 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z11 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf11 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf11;
                zzapxVarZzbf11.zza(zzanmVarZze);
                return;
            case 13:
                str = "audio/mpeg-L2";
                i3 = 4096;
                listSingletonList = null;
                i4 = -1;
                boolean z12 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z12 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf12 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf12;
                zzapxVarZzbf12.zza(zzanmVarZze);
                return;
            case 14:
                str = "audio/mpeg";
                i3 = 4096;
                listSingletonList = null;
                i4 = -1;
                boolean z13 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z13 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf13 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf13;
                zzapxVarZzbf13.zza(zzanmVarZze);
                return;
            case 15:
                str = "audio/ac3";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z14 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z14 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf14 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf14;
                zzapxVarZzbf14.zza(zzanmVarZze);
                return;
            case 16:
                str = "audio/eac3";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z15 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z15 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf15 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf15;
                zzapxVarZzbf15.zza(zzanmVarZze);
                return;
            case 17:
                str = "audio/true-hd";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z16 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z16 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf16 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf16;
                zzapxVarZzbf16.zza(zzanmVarZze);
                return;
            case 18:
            case 19:
                str = "audio/vnd.dts";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z17 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z17 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf17 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf17;
                zzapxVarZzbf17.zza(zzanmVarZze);
                return;
            case 20:
                str = "audio/vnd.dts.hd";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z18 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z18 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf18 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf18;
                zzapxVarZzbf18.zza(zzanmVarZze);
                return;
            case 21:
                listSingletonList = Collections.singletonList(this.zzh);
                str = "audio/x-flac";
                i4 = -1;
                i3 = -1;
                boolean z19 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z19 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf19 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf19;
                zzapxVarZzbf19.zza(zzanmVarZze);
                return;
            case 22:
                if (zze(new zzaux(this.zzh))) {
                    iZzo = zzave.zzo(this.zzH);
                    if (iZzo == 0) {
                        int i13 = this.zzH;
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i13);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb.toString());
                    } else {
                        i4 = iZzo;
                        listSingletonList = null;
                    }
                    i3 = -1;
                    boolean z110 = this.zzM;
                    if (true != this.zzL) {
                        i5 = 0;
                    } else {
                        i5 = 2;
                    }
                    i6 = (z110 ? 1 : 0) | i5;
                    if (!zzauu.zza(str)) {
                        if (zzauu.zzb(str)) {
                            if (this.zzn == 0) {
                                i10 = this.zzl;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.zzj;
                                }
                                this.zzl = i10;
                                i11 = this.zzm;
                                if (i11 == -1) {
                                    i11 = this.zzk;
                                }
                                this.zzm = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.zzl;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzq) {
                                if (this.zzw != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                            } else {
                                zzavhVar = null;
                            }
                            zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                        } else {
                            if ("application/x-subrip".equals(str)) {
                                zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                            } else {
                                if ("application/vobsub".equals(str)) {
                                }
                                zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                        i12 = 1;
                    }
                    zzapx zzapxVarZzbf110 = zzappVar.zzbf(this.zzb, i12);
                    this.zzN = zzapxVarZzbf110;
                    zzapxVarZzbf110.zza(zzanmVarZze);
                    return;
                }
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str = "audio/x-unknown";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z111 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z111 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf111 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf111;
                zzapxVarZzbf111.zza(zzanmVarZze);
                return;
            case 23:
                iZzo = zzave.zzo(this.zzH);
                if (iZzo == 0) {
                    int i14 = this.zzH;
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Unsupported PCM bit depth: ");
                    sb2.append(i14);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb2.toString());
                    str = "audio/x-unknown";
                    listSingletonList = null;
                    i4 = -1;
                } else {
                    i4 = iZzo;
                    listSingletonList = null;
                }
                i3 = -1;
                boolean z112 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z112 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf112 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf112;
                zzapxVarZzbf112.zza(zzanmVarZze);
                return;
            case 24:
                str = "application/x-subrip";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z113 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z113 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf113 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf113;
                zzapxVarZzbf113.zza(zzanmVarZze);
                return;
            case 25:
                listSingletonList = Collections.singletonList(this.zzh);
                str = "application/vobsub";
                i4 = -1;
                i3 = -1;
                boolean z114 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z114 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf114 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf114;
                zzapxVarZzbf114.zza(zzanmVarZze);
                return;
            case 26:
                str = "application/pgs";
                listSingletonList = null;
                i4 = -1;
                i3 = -1;
                boolean z115 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z115 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf115 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf115;
                zzapxVarZzbf115.zza(zzanmVarZze);
                return;
            case 27:
                byte[] bArr3 = this.zzh;
                listSingletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str = "application/dvbsubs";
                i4 = -1;
                i3 = -1;
                boolean z116 = this.zzM;
                if (true != this.zzL) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                i6 = (z116 ? 1 : 0) | i5;
                if (!zzauu.zza(str)) {
                    if (zzauu.zzb(str)) {
                        if (this.zzn == 0) {
                            i10 = this.zzl;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.zzj;
                            }
                            this.zzl = i10;
                            i11 = this.zzm;
                            if (i11 == -1) {
                                i11 = this.zzk;
                            }
                            this.zzm = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.zzl;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzq) {
                            if (this.zzw != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
                        } else {
                            zzavhVar = null;
                        }
                        zzanmVarZze = zzanm.zza(Integer.toString(i), str, null, -1, i3, this.zzj, this.zzk, -1.0f, listSingletonList, -1, f, this.zzo, this.zzp, zzavhVar, this.zzi);
                    } else {
                        if ("application/x-subrip".equals(str)) {
                            zzanmVarZze = zzanm.zzd(Integer.toString(i), str, null, -1, i6, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str)) {
                            }
                            zzanmVarZze = zzanm.zze(Integer.toString(i), str, null, -1, listSingletonList, this.zzP, this.zzi);
                        }
                        i12 = 3;
                    }
                    break;
                } else {
                    zzanmVarZze = zzanm.zzc(Integer.toString(i), str, null, -1, i3, this.zzG, this.zzI, i4, -1, -1, listSingletonList, this.zzi, i6, this.zzP, null);
                    i12 = 1;
                }
                zzapx zzapxVarZzbf116 = zzappVar.zzbf(this.zzb, i12);
                this.zzN = zzapxVarZzbf116;
                zzapxVarZzbf116.zza(zzanmVarZze);
                return;
            default:
                throw new zzanp("Unrecognized codec identifier.");
        }
    }
}
