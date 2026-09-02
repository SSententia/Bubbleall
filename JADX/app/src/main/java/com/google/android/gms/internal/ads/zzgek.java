package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgek {
    static int zza(byte[] bArr, int i, zzgej zzgejVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzgejVar);
        }
        zzgejVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzgej zzgejVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgejVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgejVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgejVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgejVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgejVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzgej zzgejVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgejVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            b = b2;
            i3 = i5;
        }
        zzgejVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    static long zze(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int zzf(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int iZza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 < 0) {
            throw zzggm.zze();
        }
        if (i2 == 0) {
            zzgejVar.zzc = "";
            return iZza;
        }
        zzgejVar.zzc = new String(bArr, iZza, i2, zzggk.zza);
        return iZza + i2;
    }

    static int zzg(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int iZza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 < 0) {
            throw zzggm.zze();
        }
        if (i2 == 0) {
            zzgejVar.zzc = "";
            return iZza;
        }
        zzgejVar.zzc = zzgjd.zzj(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzh(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int iZza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 < 0) {
            throw zzggm.zze();
        }
        if (i2 > bArr.length - iZza) {
            throw zzggm.zzd();
        }
        if (i2 == 0) {
            zzgejVar.zzc = zzgex.zzb;
            return iZza;
        }
        zzgejVar.zzc = zzgex.zzs(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzi(zzghz zzghzVar, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
        int iZzb = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzb = zzb(i3, bArr, iZzb, zzgejVar);
            i3 = zzgejVar.zza;
        }
        int i4 = iZzb;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzggm.zzd();
        }
        Object objZza = zzghzVar.zza();
        int i5 = i3 + i4;
        zzghzVar.zzi(objZza, bArr, i4, i5, zzgejVar);
        zzghzVar.zzj(objZza);
        zzgejVar.zzc = objZza;
        return i5;
    }

    static int zzj(zzghz zzghzVar, byte[] bArr, int i, int i2, int i3, zzgej zzgejVar) throws IOException {
        zzghl zzghlVar = (zzghl) zzghzVar;
        Object objZza = zzghlVar.zza();
        int iZzh = zzghlVar.zzh(objZza, bArr, i, i2, i3, zzgejVar);
        zzghlVar.zzj(objZza);
        zzgejVar.zzc = objZza;
        return iZzh;
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzggj<?> zzggjVar, zzgej zzgejVar) {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int iZza = zza(bArr, i2, zzgejVar);
        zzggbVar.zzh(zzgejVar.zza);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzgejVar);
            if (i != zzgejVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        return iZza;
    }

    static int zzl(byte[] bArr, int i, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int iZza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw zzggm.zzd();
    }

    static int zzm(zzghz<?> zzghzVar, int i, byte[] bArr, int i2, int i3, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        int iZzi = zzi(zzghzVar, bArr, i2, i3, zzgejVar);
        zzggjVar.add(zzgejVar.zzc);
        while (iZzi < i3) {
            int iZza = zza(bArr, iZzi, zzgejVar);
            if (i != zzgejVar.zza) {
                break;
            }
            iZzi = zzi(zzghzVar, bArr, iZza, i3, zzgejVar);
            zzggjVar.add(zzgejVar.zzc);
        }
        return iZzi;
    }

    static int zzn(int i, byte[] bArr, int i2, int i3, zzgip zzgipVar, zzgej zzgejVar) throws zzggm {
        if ((i >>> 3) == 0) {
            throw zzggm.zzg();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzc = zzc(bArr, i2, zzgejVar);
            zzgipVar.zzh(i, Long.valueOf(zzgejVar.zzb));
            return iZzc;
        }
        if (i4 == 1) {
            zzgipVar.zzh(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zzgejVar);
            int i5 = zzgejVar.zza;
            if (i5 < 0) {
                throw zzggm.zze();
            }
            if (i5 > bArr.length - iZza) {
                throw zzggm.zzd();
            }
            if (i5 == 0) {
                zzgipVar.zzh(i, zzgex.zzb);
            } else {
                zzgipVar.zzh(i, zzgex.zzs(bArr, iZza, i5));
            }
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzggm.zzg();
            }
            zzgipVar.zzh(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgip zzgipVarZzb = zzgip.zzb();
        int i7 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zzgejVar);
            int i8 = zzgejVar.zza;
            if (i8 == i6) {
                i7 = i8;
                i2 = iZza2;
                break;
            }
            i7 = i8;
            i2 = zzn(i8, bArr, iZza2, i3, zzgipVarZzb, zzgejVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzggm.zzk();
        }
        zzgipVar.zzh(i, zzgipVarZzb);
        return i2;
    }
}
