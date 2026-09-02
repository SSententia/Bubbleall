package com.google.android.gms.internal.ads;

import android.util.Log;
import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajw {
    public static final zzaju zza = zzajt.zza;

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0112 A[SYNTHETIC] */
    public static final zzaiv zza(byte[] bArr, int i, zzaju zzajuVar, zzaix zzaixVar) throws Throwable {
        boolean z;
        zzajv zzajvVar;
        int i2;
        int iZzd;
        zzajx zzajxVarZzc;
        ArrayList arrayList = new ArrayList();
        zzamf zzamfVar = new zzamf(bArr, i);
        boolean z2 = false;
        if (zzamfVar.zzd() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzr = zzamfVar.zzr();
            if (iZzr == 4801587) {
                int iZzn = zzamfVar.zzn();
                zzamfVar.zzk(1);
                int iZzn2 = zzamfVar.zzn();
                int iZzA = zzamfVar.zzA();
                if (iZzn != 2) {
                    if (iZzn == 3) {
                        if ((iZzn2 & 64) != 0) {
                            int iZzv = zzamfVar.zzv();
                            zzamfVar.zzk(iZzv);
                            iZzA -= iZzv + 4;
                        }
                    } else if (iZzn == 4) {
                        if ((iZzn2 & 64) != 0) {
                            int iZzA2 = zzamfVar.zzA();
                            zzamfVar.zzk(iZzA2 - 4);
                            iZzA -= iZzA2;
                        }
                        if ((iZzn2 & 16) != 0) {
                            iZzA -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(57);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(iZzn);
                        Log.w("Id3Decoder", sb.toString());
                    }
                    if (iZzn < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zzajvVar = new zzajv(iZzn, z, iZzA);
                } else if ((iZzn2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzn < 4 || (iZzn2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zzajvVar = new zzajv(iZzn, z, iZzA);
                }
                if (zzajvVar == null) {
                    return null;
                }
                int iZzg = zzamfVar.zzg();
                i2 = zzajvVar.zza == 2 ? 6 : 10;
                iZzd = zzajvVar.zzc;
                if (zzajvVar.zzb) {
                    iZzd = zzd(zzamfVar, zzajvVar.zzc);
                }
                zzamfVar.zzf(iZzg + iZzd);
                if (!zzb(zzamfVar, zzajvVar.zza, i2, false)) {
                    if (zzajvVar.zza == 4 || !zzb(zzamfVar, 4, i2, true)) {
                        int i3 = zzajvVar.zza;
                        StringBuilder sb2 = new StringBuilder(56);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(i3);
                        Log.w("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z2 = true;
                }
                while (zzamfVar.zzd() >= i2) {
                    zzajxVarZzc = zzc(zzajvVar.zza, zzamfVar, z2, i2, zzajuVar);
                    if (zzajxVarZzc != null) {
                        arrayList.add(zzajxVarZzc);
                    }
                }
                return new zzaiv(arrayList);
            }
            String strValueOf = String.valueOf(String.format("%06X", Integer.valueOf(iZzr)));
            Log.w("Id3Decoder", strValueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(strValueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
        }
        zzajvVar = null;
        if (zzajvVar == null) {
            return null;
        }
        int iZzg2 = zzamfVar.zzg();
        if (zzajvVar.zza == 2) {
        }
        iZzd = zzajvVar.zzc;
        if (zzajvVar.zzb) {
            iZzd = zzd(zzamfVar, zzajvVar.zzc);
        }
        zzamfVar.zzf(iZzg2 + iZzd);
        if (!zzb(zzamfVar, zzajvVar.zza, i2, false)) {
            if (zzajvVar.zza == 4) {
            }
            int i4 = zzajvVar.zza;
            StringBuilder sb3 = new StringBuilder(56);
            sb3.append("Failed to validate ID3 tag with majorVersion=");
            sb3.append(i4);
            Log.w("Id3Decoder", sb3.toString());
            return null;
        }
        while (zzamfVar.zzd() >= i2) {
            zzajxVarZzc = zzc(zzajvVar.zza, zzamfVar, z2, i2, zzajuVar);
            if (zzajxVarZzc != null) {
                arrayList.add(zzajxVarZzc);
            }
        }
        return new zzaiv(arrayList);
    }

    private static boolean zzb(zzamf zzamfVar, int i, int i2, boolean z) {
        int iZzr;
        long jZzr;
        int iZzo;
        int i3;
        int iZzg = zzamfVar.zzg();
        while (true) {
            try {
                int i4 = 1;
                if (zzamfVar.zzd() < i2) {
                    zzamfVar.zzh(iZzg);
                    return true;
                }
                if (i >= 3) {
                    iZzr = zzamfVar.zzv();
                    jZzr = zzamfVar.zzt();
                    iZzo = zzamfVar.zzo();
                } else {
                    iZzr = zzamfVar.zzr();
                    jZzr = zzamfVar.zzr();
                    iZzo = 0;
                }
                if (iZzr == 0 && jZzr == 0 && iZzo == 0) {
                    zzamfVar.zzh(iZzg);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZzr) != 0) {
                        zzamfVar.zzh(iZzg);
                        return false;
                    }
                    jZzr = ((jZzr >> 24) << 21) | ((255 & (jZzr >> 16)) << 14) | (jZzr & 255) | (((jZzr >> 8) & 255) << 7);
                }
                if (i == 4) {
                    i4 = iZzo & 1;
                    i3 = (iZzo & 64) == 0 ? 0 : 1;
                } else if (i == 3) {
                    i3 = (iZzo & 32) != 0 ? 1 : 0;
                    if ((iZzo & 128) == 0) {
                        i4 = 0;
                    }
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (i4 != 0) {
                    i3 += 4;
                }
                if (jZzr < i3) {
                    zzamfVar.zzh(iZzg);
                    return false;
                }
                if (zzamfVar.zzd() < jZzr) {
                    zzamfVar.zzh(iZzg);
                    return false;
                }
                zzamfVar.zzk((int) jZzr);
            } catch (Throwable th) {
                zzamfVar.zzh(iZzg);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0260  */
    /* JADX WARN: Code duplicated, block: B:137:0x0264  */
    /* JADX WARN: Code duplicated, block: B:141:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x028c A[Catch: UnsupportedEncodingException -> 0x030d, all -> 0x055a, TRY_LEAVE, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4 A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02a9 A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ba A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3 A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02df A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02e4 A[Catch: all -> 0x055a, UnsupportedEncodingException -> 0x0569, TryCatch #3 {all -> 0x055a, blocks: (B:242:0x052d, B:244:0x0556, B:128:0x021e, B:146:0x0279, B:148:0x028c, B:150:0x0293, B:152:0x02a4, B:154:0x02ae, B:164:0x02e9, B:153:0x02a9, B:158:0x02ba, B:160:0x02d3, B:162:0x02df, B:163:0x02e4, B:177:0x032c, B:187:0x0376, B:190:0x03a9, B:193:0x03ba, B:194:0x03c2, B:196:0x03c8, B:198:0x03cf, B:199:0x03d3, B:206:0x03f5, B:210:0x041e, B:212:0x0428, B:213:0x0459, B:214:0x0465, B:216:0x046b, B:218:0x0472, B:219:0x0476, B:223:0x048b, B:232:0x04b7, B:234:0x04f2, B:235:0x0501, B:238:0x0519), top: B:265:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0310  */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:180:0x0368 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x036a  */
    /* JADX WARN: Code duplicated, block: B:201:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:224:0x049d  */
    /* JADX WARN: Code duplicated, block: B:226:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:228:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:230:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:236:0x050e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0513  */
    /* JADX WARN: Code duplicated, block: B:241:0x052b  */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x056b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:252:0x0569 */
    private static zzajx zzc(int i, zzamf zzamfVar, boolean z, int i2, zzaju zzajuVar) throws Throwable {
        int iZzB;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        String str;
        int i5;
        String str2;
        int i6;
        String str3;
        int i7;
        int i8;
        zzajx zzajmVar;
        byte[] bArr;
        int iZzh;
        String strZza;
        String strValueOf;
        String strValueOf2;
        zzajx zzakdVar;
        int iZzn = zzamfVar.zzn();
        int iZzn2 = zzamfVar.zzn();
        int iZzn3 = zzamfVar.zzn();
        int iZzn4 = i >= 3 ? zzamfVar.zzn() : 0;
        if (i == 4) {
            iZzB = zzamfVar.zzB();
            if (!z) {
                iZzB = ((iZzB >> 24) << 21) | (iZzB & 255) | (((iZzB >> 8) & 255) << 7) | (((iZzB >> 16) & 255) << 14);
            }
        } else {
            iZzB = i == 3 ? zzamfVar.zzB() : zzamfVar.zzr();
        }
        int iZzo = i >= 3 ? zzamfVar.zzo() : 0;
        zzajx zzajkVar = null;
        if (iZzn == 0 && iZzn2 == 0 && iZzn3 == 0 && iZzn4 == 0 && iZzB == 0 && iZzo == 0) {
            zzamfVar.zzh(zzamfVar.zze());
            return null;
        }
        int iZzg = zzamfVar.zzg() + iZzB;
        if (iZzg > zzamfVar.zze()) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            zzamfVar.zzh(zzamfVar.zze());
            return null;
        }
        if (zzajuVar != null) {
            zzamfVar.zzh(iZzg);
            return null;
        }
        if (i == 3) {
            i3 = (iZzo & 128) != 0 ? 1 : 0;
            boolean z5 = (iZzo & 64) != 0;
            z2 = (iZzo & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (iZzo & 64) != 0;
            i4 = (iZzo & 8) != 0 ? 1 : 0;
            z3 = (iZzo & 4) != 0;
            z4 = (iZzo & 2) != 0;
            int i9 = iZzo & 1;
            z2 = z6;
            i3 = i9;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzamfVar.zzh(iZzg);
            return null;
        }
        if (z2) {
            iZzB--;
            zzamfVar.zzk(1);
        }
        if (i3 != 0) {
            iZzB -= 4;
            zzamfVar.zzk(4);
        }
        if (z4) {
            iZzB = zzd(zzamfVar, iZzB);
        }
        try {
            try {
                try {
                    if (iZzn == 84 && iZzn2 == 88 && iZzn3 == 88 && (i == 2 || iZzn4 == 88)) {
                        if (iZzB > 0) {
                            int iZzn5 = zzamfVar.zzn();
                            String strZze = zze(iZzn5);
                            int i10 = iZzB - 1;
                            byte[] bArr2 = new byte[i10];
                            zzamfVar.zzm(bArr2, 0, i10);
                            int iZzg2 = zzg(bArr2, 0, iZzn5);
                            String str4 = new String(bArr2, 0, iZzg2, strZze);
                            int iZzi = iZzg2 + zzi(iZzn5);
                            zzakdVar = new zzakf("TXXX", str4, zzk(bArr2, iZzi, zzg(bArr2, iZzi, iZzn5), strZze));
                            zzajkVar = zzakdVar;
                        }
                        i6 = iZzn;
                        iZzn2 = iZzn2;
                        iZzn3 = iZzn3;
                        str3 = "Id3Decoder";
                        i8 = iZzn4;
                        iZzg = iZzg;
                        if (zzajkVar == null) {
                            String strZzf = zzf(i, i6, iZzn2, iZzn3, i8);
                            StringBuilder sb = new StringBuilder(String.valueOf(strZzf).length() + 50);
                            sb.append("Failed to decode frame: id=");
                            sb.append(strZzf);
                            sb.append(", frameSize=");
                            sb.append(iZzB);
                            str = str3;
                            Log.w(str, sb.toString());
                        }
                        zzamfVar.zzh(iZzg);
                        return zzajkVar;
                    }
                    if (iZzn == 84) {
                        String strZzf2 = zzf(i, 84, iZzn2, iZzn3, iZzn4);
                        if (iZzB > 0) {
                            int iZzn6 = zzamfVar.zzn();
                            String strZze2 = zze(iZzn6);
                            int i11 = iZzB - 1;
                            byte[] bArr3 = new byte[i11];
                            zzamfVar.zzm(bArr3, 0, i11);
                            zzakdVar = new zzakf(strZzf2, null, new String(bArr3, 0, zzg(bArr3, 0, iZzn6), strZze2));
                            zzajkVar = zzakdVar;
                        }
                        i6 = iZzn;
                        iZzn2 = iZzn2;
                        iZzn3 = iZzn3;
                        str3 = "Id3Decoder";
                        i8 = iZzn4;
                        iZzg = iZzg;
                        if (zzajkVar == null) {
                            try {
                                String strZzf3 = zzf(i, i6, iZzn2, iZzn3, i8);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strZzf3).length() + 50);
                                sb2.append("Failed to decode frame: id=");
                                sb2.append(strZzf3);
                                sb2.append(", frameSize=");
                                sb2.append(iZzB);
                                str = str3;
                                try {
                                    Log.w(str, sb2.toString());
                                } catch (UnsupportedEncodingException unused) {
                                }
                            } catch (UnsupportedEncodingException unused2) {
                                str = str3;
                            }
                        }
                        zzamfVar.zzh(iZzg);
                        return zzajkVar;
                    }
                    if (iZzn == 87) {
                        if (iZzn2 != 88 || iZzn3 != 88 || (i != 2 && iZzn4 != 88)) {
                            i5 = 87;
                        } else if (iZzB > 0) {
                            int iZzn7 = zzamfVar.zzn();
                            String strZze3 = zze(iZzn7);
                            int i12 = iZzB - 1;
                            byte[] bArr4 = new byte[i12];
                            zzamfVar.zzm(bArr4, 0, i12);
                            int iZzg3 = zzg(bArr4, 0, iZzn7);
                            String str5 = new String(bArr4, 0, iZzg3, strZze3);
                            int iZzi2 = iZzg3 + zzi(iZzn7);
                            zzakdVar = new zzakh("WXXX", str5, zzk(bArr4, iZzi2, zzh(bArr4, iZzi2), "ISO-8859-1"));
                            zzajkVar = zzakdVar;
                        }
                        i6 = iZzn;
                        iZzn2 = iZzn2;
                        iZzn3 = iZzn3;
                        str3 = "Id3Decoder";
                        i8 = iZzn4;
                        iZzg = iZzg;
                        if (zzajkVar == null) {
                            String strZzf4 = zzf(i, i6, iZzn2, iZzn3, i8);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strZzf4).length() + 50);
                            sb3.append("Failed to decode frame: id=");
                            sb3.append(strZzf4);
                            sb3.append(", frameSize=");
                            sb3.append(iZzB);
                            str = str3;
                            Log.w(str, sb3.toString());
                        }
                        zzamfVar.zzh(iZzg);
                        return zzajkVar;
                    }
                    i5 = iZzn;
                    if (i5 == 87) {
                        String strZzf5 = zzf(i, 87, iZzn2, iZzn3, iZzn4);
                        byte[] bArr5 = new byte[iZzB];
                        zzamfVar.zzm(bArr5, 0, iZzB);
                        zzakdVar = new zzakh(strZzf5, null, new String(bArr5, 0, zzh(bArr5, 0), "ISO-8859-1"));
                    } else {
                        if (i5 == 80) {
                            if (iZzn2 == 82 && iZzn3 == 73 && iZzn4 == 86) {
                                byte[] bArr6 = new byte[iZzB];
                                zzamfVar.zzm(bArr6, 0, iZzB);
                                int iZzh2 = zzh(bArr6, 0);
                                zzakdVar = new zzakd(new String(bArr6, 0, iZzh2, "ISO-8859-1"), zzj(bArr6, iZzh2 + 1, iZzB));
                            } else {
                                i5 = 80;
                            }
                        }
                        try {
                            if (i5 != 71) {
                                try {
                                    if (i == 2) {
                                        if (i5 != 80 && iZzn2 == 73 && iZzn3 == 67) {
                                            int iZzn8 = zzamfVar.zzn();
                                            String strZze4 = zze(iZzn8);
                                            int i13 = iZzB - 1;
                                            bArr = new byte[i13];
                                            zzamfVar.zzm(bArr, 0, i13);
                                            if (i == 2) {
                                                str3 = "Id3Decoder";
                                                strValueOf2 = String.valueOf(zzflf.zza(new String(bArr, 0, 3, "ISO-8859-1")));
                                                if (strValueOf2.length() != 0) {
                                                    strZza = "image/".concat(strValueOf2);
                                                } else {
                                                    strZza = new String("image/");
                                                }
                                                if ("image/jpg".equals(strZza)) {
                                                    strZza = "image/jpeg";
                                                }
                                                iZzh = 2;
                                            } else {
                                                str3 = "Id3Decoder";
                                                iZzh = zzh(bArr, 0);
                                                strZza = zzflf.zza(new String(bArr, 0, iZzh, "ISO-8859-1"));
                                                if (strZza.indexOf(47) == -1) {
                                                    strValueOf = String.valueOf(strZza);
                                                    if (strValueOf.length() != 0) {
                                                        strZza = "image/".concat(strValueOf);
                                                    } else {
                                                        strZza = new String("image/");
                                                    }
                                                }
                                            }
                                            int i14 = bArr[iZzh + 1] & UByte.MAX_VALUE;
                                            int i15 = iZzh + 2;
                                            int iZzg4 = zzg(bArr, i15, iZzn8);
                                            i6 = iZzn;
                                            zzajmVar = new zzaji(strZza, new String(bArr, i15, iZzg4 - i15, strZze4), i14, zzj(bArr, iZzg4 + zzi(iZzn8), i13));
                                            zzajkVar = zzajmVar;
                                        } else {
                                            i6 = iZzn;
                                            str3 = "Id3Decoder";
                                            if (i5 != 67 && iZzn2 == 79 && iZzn3 == 77 && (iZzn4 == 77 || i == 2)) {
                                                if (iZzB < 4) {
                                                    iZzn2 = iZzn2;
                                                    iZzn3 = iZzn3;
                                                    i8 = iZzn4;
                                                    zzajkVar = null;
                                                } else {
                                                    int iZzn9 = zzamfVar.zzn();
                                                    String strZze5 = zze(iZzn9);
                                                    byte[] bArr7 = new byte[3];
                                                    zzamfVar.zzm(bArr7, 0, 3);
                                                    String str6 = new String(bArr7, 0, 3);
                                                    int i16 = iZzB - 4;
                                                    byte[] bArr8 = new byte[i16];
                                                    zzamfVar.zzm(bArr8, 0, i16);
                                                    int iZzg5 = zzg(bArr8, 0, iZzn9);
                                                    String str7 = new String(bArr8, 0, iZzg5, strZze5);
                                                    int iZzi3 = iZzg5 + zzi(iZzn9);
                                                    zzajmVar = new zzajq(str6, str7, zzk(bArr8, iZzi3, zzg(bArr8, iZzi3, iZzn9), strZze5));
                                                    zzajkVar = zzajmVar;
                                                }
                                            } else if (i5 != 67 && iZzn2 == 72 && iZzn3 == 65 && iZzn4 == 80) {
                                                int iZzg6 = zzamfVar.zzg();
                                                int iZzh3 = zzh(zzamfVar.zzi(), iZzg6);
                                                String str8 = new String(zzamfVar.zzi(), iZzg6, iZzh3 - iZzg6, "ISO-8859-1");
                                                zzamfVar.zzh(iZzh3 + 1);
                                                int iZzv = zzamfVar.zzv();
                                                int iZzv2 = zzamfVar.zzv();
                                                long jZzt = zzamfVar.zzt();
                                                if (jZzt == 4294967295L) {
                                                    jZzt = -1;
                                                }
                                                long j = jZzt;
                                                long jZzt2 = zzamfVar.zzt();
                                                if (jZzt2 == 4294967295L) {
                                                    jZzt2 = -1;
                                                }
                                                long j2 = jZzt2;
                                                ArrayList arrayList = new ArrayList();
                                                int i17 = iZzg6 + iZzB;
                                                while (zzamfVar.zzg() < i17) {
                                                    zzajx zzajxVarZzc = zzc(i, zzamfVar, z, i2, null);
                                                    if (zzajxVarZzc != null) {
                                                        arrayList.add(zzajxVarZzc);
                                                    }
                                                }
                                                zzajmVar = new zzajm(str8, iZzv, iZzv2, j, j2, (zzajx[]) arrayList.toArray(new zzajx[0]));
                                                zzajkVar = zzajmVar;
                                            } else if (i5 != 67 && iZzn2 == 84 && iZzn3 == 79 && iZzn4 == 67) {
                                                int iZzg7 = zzamfVar.zzg();
                                                int iZzh4 = zzh(zzamfVar.zzi(), iZzg7);
                                                String str9 = new String(zzamfVar.zzi(), iZzg7, iZzh4 - iZzg7, "ISO-8859-1");
                                                zzamfVar.zzh(iZzh4 + 1);
                                                int iZzn10 = zzamfVar.zzn();
                                                boolean z7 = (iZzn10 & 2) != 0;
                                                int i18 = iZzn10 & 1;
                                                int iZzn11 = zzamfVar.zzn();
                                                String[] strArr = new String[iZzn11];
                                                int i19 = 0;
                                                while (i19 < iZzn11) {
                                                    int iZzg8 = zzamfVar.zzg();
                                                    int i20 = iZzn11;
                                                    int iZzh5 = zzh(zzamfVar.zzi(), iZzg8);
                                                    strArr[i19] = new String(zzamfVar.zzi(), iZzg8, iZzh5 - iZzg8, "ISO-8859-1");
                                                    zzamfVar.zzh(iZzh5 + 1);
                                                    i19++;
                                                    iZzn11 = i20;
                                                    iZzn4 = iZzn4;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                int i21 = iZzn2;
                                                int i22 = iZzn3;
                                                int i23 = iZzn4;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i24 = iZzg7 + iZzB;
                                                while (zzamfVar.zzg() < i24) {
                                                    zzajx zzajxVarZzc2 = zzc(i, zzamfVar, z, i2, null);
                                                    if (zzajxVarZzc2 != null) {
                                                        arrayList2.add(zzajxVarZzc2);
                                                    }
                                                }
                                                zzajkVar = new zzajo(str9, z7, 1 == i18, strArr, (zzajx[]) arrayList2.toArray(new zzajx[0]));
                                                i8 = i23;
                                                iZzn3 = i22;
                                                iZzn2 = i21;
                                            } else {
                                                i7 = iZzn4;
                                                if (i5 == 77) {
                                                    iZzn2 = iZzn2;
                                                    if (iZzn2 == 76) {
                                                        iZzn3 = iZzn3;
                                                        i8 = i7;
                                                        if (iZzn3 != 76 && i8 == 84) {
                                                            int iZzo2 = zzamfVar.zzo();
                                                            int iZzr = zzamfVar.zzr();
                                                            int iZzr2 = zzamfVar.zzr();
                                                            int iZzn12 = zzamfVar.zzn();
                                                            int iZzn13 = zzamfVar.zzn();
                                                            zzame zzameVar = new zzame();
                                                            zzameVar.zza(zzamfVar.zzi(), zzamfVar.zze());
                                                            zzameVar.zzd(zzamfVar.zzg() * 8);
                                                            int i25 = ((iZzB - 10) * 8) / (iZzn12 + iZzn13);
                                                            int[] iArr = new int[i25];
                                                            int[] iArr2 = new int[i25];
                                                            for (int i26 = 0; i26 < i25; i26++) {
                                                                int iZzh6 = zzameVar.zzh(iZzn12);
                                                                int iZzh7 = zzameVar.zzh(iZzn13);
                                                                iArr[i26] = iZzh6;
                                                                iArr2[i26] = iZzh7;
                                                            }
                                                            zzajkVar = new zzakb(iZzo2, iZzr, iZzr2, iArr, iArr2);
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        iZzn3 = iZzn3;
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                String strZzf6 = zzf(i, i5, iZzn2, iZzn3, i8);
                                                byte[] bArr9 = new byte[iZzB];
                                                zzamfVar.zzm(bArr9, 0, iZzB);
                                                zzajkVar = new zzajk(strZzf6, bArr9);
                                            }
                                        }
                                        if (zzajkVar == null) {
                                            String strZzf7 = zzf(i, i6, iZzn2, iZzn3, i8);
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strZzf7).length() + 50);
                                            sb4.append("Failed to decode frame: id=");
                                            sb4.append(strZzf7);
                                            sb4.append(", frameSize=");
                                            sb4.append(iZzB);
                                            str = str3;
                                            Log.w(str, sb4.toString());
                                        }
                                        zzamfVar.zzh(iZzg);
                                        return zzajkVar;
                                    }
                                    if (i5 == 65 || iZzn2 != 80 || iZzn3 != 73 || iZzn4 != 67) {
                                        i6 = iZzn;
                                        str3 = "Id3Decoder";
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                            }
                                            if (i5 != 67) {
                                                i7 = iZzn4;
                                                if (i5 == 77) {
                                                    iZzn2 = iZzn2;
                                                    if (iZzn2 == 76) {
                                                        iZzn3 = iZzn3;
                                                        i8 = i7;
                                                        if (iZzn3 != 76) {
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        iZzn3 = iZzn3;
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                String strZzf8 = zzf(i, i5, iZzn2, iZzn3, i8);
                                                byte[] bArr10 = new byte[iZzB];
                                                zzamfVar.zzm(bArr10, 0, iZzB);
                                                zzajkVar = new zzajk(strZzf8, bArr10);
                                            } else {
                                                i7 = iZzn4;
                                                if (i5 == 77) {
                                                    iZzn2 = iZzn2;
                                                    if (iZzn2 == 76) {
                                                        iZzn3 = iZzn3;
                                                        i8 = i7;
                                                        if (iZzn3 != 76) {
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        iZzn3 = iZzn3;
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                String strZzf9 = zzf(i, i5, iZzn2, iZzn3, i8);
                                                byte[] bArr11 = new byte[iZzB];
                                                zzamfVar.zzm(bArr11, 0, iZzB);
                                                zzajkVar = new zzajk(strZzf9, bArr11);
                                            }
                                        } else {
                                            if (i5 != 67) {
                                            }
                                            if (i5 != 67) {
                                                i7 = iZzn4;
                                                if (i5 == 77) {
                                                    iZzn2 = iZzn2;
                                                    if (iZzn2 == 76) {
                                                        iZzn3 = iZzn3;
                                                        i8 = i7;
                                                        if (iZzn3 != 76) {
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        iZzn3 = iZzn3;
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                String strZzf10 = zzf(i, i5, iZzn2, iZzn3, i8);
                                                byte[] bArr12 = new byte[iZzB];
                                                zzamfVar.zzm(bArr12, 0, iZzB);
                                                zzajkVar = new zzajk(strZzf10, bArr12);
                                            } else {
                                                i7 = iZzn4;
                                                if (i5 == 77) {
                                                    iZzn2 = iZzn2;
                                                    if (iZzn2 == 76) {
                                                        iZzn3 = iZzn3;
                                                        i8 = i7;
                                                        if (iZzn3 != 76) {
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        iZzn3 = iZzn3;
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                    iZzn2 = iZzn2;
                                                }
                                                String strZzf11 = zzf(i, i5, iZzn2, iZzn3, i8);
                                                byte[] bArr13 = new byte[iZzB];
                                                zzamfVar.zzm(bArr13, 0, iZzB);
                                                zzajkVar = new zzajk(strZzf11, bArr13);
                                            }
                                        }
                                        if (zzajkVar == null) {
                                            String strZzf12 = zzf(i, i6, iZzn2, iZzn3, i8);
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(strZzf12).length() + 50);
                                            sb5.append("Failed to decode frame: id=");
                                            sb5.append(strZzf12);
                                            sb5.append(", frameSize=");
                                            sb5.append(iZzB);
                                            str = str3;
                                            Log.w(str, sb5.toString());
                                        }
                                        zzamfVar.zzh(iZzg);
                                        return zzajkVar;
                                    }
                                    int iZzn14 = zzamfVar.zzn();
                                    String strZze6 = zze(iZzn14);
                                    int i110 = iZzB - 1;
                                    bArr = new byte[i110];
                                    zzamfVar.zzm(bArr, 0, i110);
                                    if (i == 2) {
                                        str3 = "Id3Decoder";
                                        strValueOf2 = String.valueOf(zzflf.zza(new String(bArr, 0, 3, "ISO-8859-1")));
                                        if (strValueOf2.length() != 0) {
                                            strZza = "image/".concat(strValueOf2);
                                        } else {
                                            strZza = new String("image/");
                                        }
                                        if ("image/jpg".equals(strZza)) {
                                            strZza = "image/jpeg";
                                        }
                                        iZzh = 2;
                                    } else {
                                        str3 = "Id3Decoder";
                                        iZzh = zzh(bArr, 0);
                                        strZza = zzflf.zza(new String(bArr, 0, iZzh, "ISO-8859-1"));
                                        if (strZza.indexOf(47) == -1) {
                                            strValueOf = String.valueOf(strZza);
                                            if (strValueOf.length() != 0) {
                                                strZza = "image/".concat(strValueOf);
                                            } else {
                                                strZza = new String("image/");
                                            }
                                        }
                                    }
                                    int i111 = bArr[iZzh + 1] & UByte.MAX_VALUE;
                                    int i112 = iZzh + 2;
                                    int iZzg9 = zzg(bArr, i112, iZzn14);
                                    i6 = iZzn;
                                    zzajmVar = new zzaji(strZza, new String(bArr, i112, iZzg9 - i112, strZze6), i111, zzj(bArr, iZzg9 + zzi(iZzn14), i110));
                                    zzajkVar = zzajmVar;
                                } catch (UnsupportedEncodingException unused3) {
                                    iZzg = iZzg;
                                    str = str2;
                                }
                                iZzg = iZzg;
                            } else if (iZzn2 != 69 || iZzn3 != 79) {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    i6 = iZzn;
                                    str3 = "Id3Decoder";
                                    if (i5 != 67) {
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf13 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr14 = new byte[iZzB];
                                            zzamfVar.zzm(bArr14, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf13, bArr14);
                                        } else {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf14 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr15 = new byte[iZzB];
                                            zzamfVar.zzm(bArr15, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf14, bArr15);
                                        }
                                    } else {
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf15 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr16 = new byte[iZzB];
                                            zzamfVar.zzm(bArr16, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf15, bArr16);
                                        } else {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf16 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr17 = new byte[iZzB];
                                            zzamfVar.zzm(bArr17, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf16, bArr17);
                                        }
                                    }
                                    if (zzajkVar == null) {
                                        String strZzf17 = zzf(i, i6, iZzn2, iZzn3, i8);
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(strZzf17).length() + 50);
                                        sb6.append("Failed to decode frame: id=");
                                        sb6.append(strZzf17);
                                        sb6.append(", frameSize=");
                                        sb6.append(iZzB);
                                        str = str3;
                                        Log.w(str, sb6.toString());
                                    }
                                    zzamfVar.zzh(iZzg);
                                    return zzajkVar;
                                }
                                if (i5 == 65) {
                                }
                                i6 = iZzn;
                                str3 = "Id3Decoder";
                                if (i5 != 67) {
                                    if (i5 != 67) {
                                    }
                                    if (i5 != 67) {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf18 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr18 = new byte[iZzB];
                                        zzamfVar.zzm(bArr18, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf18, bArr18);
                                    } else {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf19 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr19 = new byte[iZzB];
                                        zzamfVar.zzm(bArr19, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf19, bArr19);
                                    }
                                } else {
                                    if (i5 != 67) {
                                    }
                                    if (i5 != 67) {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf110 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr110 = new byte[iZzB];
                                        zzamfVar.zzm(bArr110, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf110, bArr110);
                                    } else {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf111 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr111 = new byte[iZzB];
                                        zzamfVar.zzm(bArr111, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf111, bArr111);
                                    }
                                }
                                if (zzajkVar == null) {
                                    String strZzf112 = zzf(i, i6, iZzn2, iZzn3, i8);
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(strZzf112).length() + 50);
                                    sb7.append("Failed to decode frame: id=");
                                    sb7.append(strZzf112);
                                    sb7.append(", frameSize=");
                                    sb7.append(iZzB);
                                    str = str3;
                                    Log.w(str, sb7.toString());
                                }
                                zzamfVar.zzh(iZzg);
                                return zzajkVar;
                                iZzg = iZzg;
                            } else if (iZzn4 == 66 || i == 2) {
                                try {
                                    int iZzn15 = zzamfVar.zzn();
                                    String strZze7 = zze(iZzn15);
                                    int i27 = iZzB - 1;
                                    byte[] bArr20 = new byte[i27];
                                    zzamfVar.zzm(bArr20, 0, i27);
                                    int iZzh8 = zzh(bArr20, 0);
                                    iZzg = iZzg;
                                    String str10 = new String(bArr20, 0, iZzh8, "ISO-8859-1");
                                    int i28 = iZzh8 + 1;
                                    int iZzg10 = zzg(bArr20, i28, iZzn15);
                                    String strZzk = zzk(bArr20, i28, iZzg10, strZze7);
                                    int iZzi4 = iZzg10 + zzi(iZzn15);
                                    int iZzg11 = zzg(bArr20, iZzi4, iZzn15);
                                    i6 = iZzn;
                                    str3 = "Id3Decoder";
                                    zzajkVar = new zzajs(str10, strZzk, zzk(bArr20, iZzi4, iZzg11, strZze7), zzj(bArr20, iZzg11 + zzi(iZzn15), i27));
                                } catch (Throwable th) {
                                    th = th;
                                    zzamfVar.zzh(iZzg);
                                    throw th;
                                }
                            } else {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    i6 = iZzn;
                                    str3 = "Id3Decoder";
                                    if (i5 != 67) {
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf113 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr112 = new byte[iZzB];
                                            zzamfVar.zzm(bArr112, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf113, bArr112);
                                        } else {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf114 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr113 = new byte[iZzB];
                                            zzamfVar.zzm(bArr113, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf114, bArr113);
                                        }
                                    } else {
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf115 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr114 = new byte[iZzB];
                                            zzamfVar.zzm(bArr114, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf115, bArr114);
                                        } else {
                                            i7 = iZzn4;
                                            if (i5 == 77) {
                                                iZzn2 = iZzn2;
                                                if (iZzn2 == 76) {
                                                    iZzn3 = iZzn3;
                                                    i8 = i7;
                                                    if (iZzn3 != 76) {
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    iZzn3 = iZzn3;
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                                iZzn2 = iZzn2;
                                            }
                                            String strZzf116 = zzf(i, i5, iZzn2, iZzn3, i8);
                                            byte[] bArr115 = new byte[iZzB];
                                            zzamfVar.zzm(bArr115, 0, iZzB);
                                            zzajkVar = new zzajk(strZzf116, bArr115);
                                        }
                                    }
                                    if (zzajkVar == null) {
                                        String strZzf117 = zzf(i, i6, iZzn2, iZzn3, i8);
                                        StringBuilder sb8 = new StringBuilder(String.valueOf(strZzf117).length() + 50);
                                        sb8.append("Failed to decode frame: id=");
                                        sb8.append(strZzf117);
                                        sb8.append(", frameSize=");
                                        sb8.append(iZzB);
                                        str = str3;
                                        Log.w(str, sb8.toString());
                                    }
                                    zzamfVar.zzh(iZzg);
                                    return zzajkVar;
                                }
                                if (i5 == 65) {
                                }
                                i6 = iZzn;
                                str3 = "Id3Decoder";
                                if (i5 != 67) {
                                    if (i5 != 67) {
                                    }
                                    if (i5 != 67) {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf118 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr116 = new byte[iZzB];
                                        zzamfVar.zzm(bArr116, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf118, bArr116);
                                    } else {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf119 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr117 = new byte[iZzB];
                                        zzamfVar.zzm(bArr117, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf119, bArr117);
                                    }
                                } else {
                                    if (i5 != 67) {
                                    }
                                    if (i5 != 67) {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf1110 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr118 = new byte[iZzB];
                                        zzamfVar.zzm(bArr118, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf1110, bArr118);
                                    } else {
                                        i7 = iZzn4;
                                        if (i5 == 77) {
                                            iZzn2 = iZzn2;
                                            if (iZzn2 == 76) {
                                                iZzn3 = iZzn3;
                                                i8 = i7;
                                                if (iZzn3 != 76) {
                                                }
                                            } else {
                                                i8 = i7;
                                                iZzn3 = iZzn3;
                                            }
                                        } else {
                                            i8 = i7;
                                            iZzn3 = iZzn3;
                                            iZzn2 = iZzn2;
                                        }
                                        String strZzf1111 = zzf(i, i5, iZzn2, iZzn3, i8);
                                        byte[] bArr119 = new byte[iZzB];
                                        zzamfVar.zzm(bArr119, 0, iZzB);
                                        zzajkVar = new zzajk(strZzf1111, bArr119);
                                    }
                                }
                                if (zzajkVar == null) {
                                    String strZzf1112 = zzf(i, i6, iZzn2, iZzn3, i8);
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(strZzf1112).length() + 50);
                                    sb9.append("Failed to decode frame: id=");
                                    sb9.append(strZzf1112);
                                    sb9.append(", frameSize=");
                                    sb9.append(iZzB);
                                    str = str3;
                                    Log.w(str, sb9.toString());
                                }
                                zzamfVar.zzh(iZzg);
                                return zzajkVar;
                                iZzg = iZzg;
                            }
                            i8 = iZzn4;
                            if (zzajkVar == null) {
                                String strZzf1113 = zzf(i, i6, iZzn2, iZzn3, i8);
                                StringBuilder sb10 = new StringBuilder(String.valueOf(strZzf1113).length() + 50);
                                sb10.append("Failed to decode frame: id=");
                                sb10.append(strZzf1113);
                                sb10.append(", frameSize=");
                                sb10.append(iZzB);
                                str = str3;
                                Log.w(str, sb10.toString());
                            }
                            zzamfVar.zzh(iZzg);
                            return zzajkVar;
                        } catch (UnsupportedEncodingException unused4) {
                            str = "Id3Decoder";
                        }
                    }
                    zzajkVar = zzakdVar;
                    i6 = iZzn;
                    iZzn2 = iZzn2;
                    iZzn3 = iZzn3;
                    str3 = "Id3Decoder";
                    i8 = iZzn4;
                    iZzg = iZzg;
                    if (zzajkVar == null) {
                        String strZzf1114 = zzf(i, i6, iZzn2, iZzn3, i8);
                        StringBuilder sb11 = new StringBuilder(String.valueOf(strZzf1114).length() + 50);
                        sb11.append("Failed to decode frame: id=");
                        sb11.append(strZzf1114);
                        sb11.append(", frameSize=");
                        sb11.append(iZzB);
                        str = str3;
                        Log.w(str, sb11.toString());
                    }
                    zzamfVar.zzh(iZzg);
                    return zzajkVar;
                } catch (Throwable th2) {
                    th = th2;
                    iZzg = iZzg;
                }
            } catch (UnsupportedEncodingException unused5) {
                str = "Id3Decoder";
            }
        } catch (Throwable th3) {
            th = th3;
        }
        Log.w(str, "Unsupported character encoding");
        zzamfVar.zzh(iZzg);
        return null;
    }

    private static int zzd(zzamf zzamfVar, int i) {
        byte[] bArrZzi = zzamfVar.zzi();
        int iZzg = zzamfVar.zzg();
        int i2 = iZzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzg + i) {
                return i;
            }
            if ((bArrZzi[i2] & UByte.MAX_VALUE) == 255 && bArrZzi[i3] == 0) {
                System.arraycopy(bArrZzi, i2 + 2, bArrZzi, i3, (i - (i2 - iZzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zze(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : Key.STRING_CHARSET_NAME;
        }
        return "UTF-16BE";
    }

    private static String zzf(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzg(byte[] bArr, int i, int i2) {
        int iZzh = zzh(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZzh;
        }
        while (true) {
            int length = bArr.length;
            if (iZzh >= length - 1) {
                return length;
            }
            if ((iZzh - i) % 2 == 0 && bArr[iZzh + 1] == 0) {
                return iZzh;
            }
            iZzh = zzh(bArr, iZzh + 1);
        }
    }

    private static int zzh(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzi(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzj(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzamq.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzk(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}
