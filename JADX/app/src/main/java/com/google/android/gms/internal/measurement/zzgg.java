package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgg {
    static int zza(byte[] bArr, int i, zzgf zzgfVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzgfVar);
        }
        zzgfVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzgf zzgfVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgfVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgfVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgfVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgfVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgfVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzgf zzgfVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgfVar.zzb = j;
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
        zzgfVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    static long zze(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int zzf(byte[] bArr, int i, zzgf zzgfVar) throws zzib {
        int iZza = zza(bArr, i, zzgfVar);
        int i2 = zzgfVar.zza;
        if (i2 < 0) {
            throw zzib.zzb();
        }
        if (i2 == 0) {
            zzgfVar.zzc = "";
            return iZza;
        }
        zzgfVar.zzc = new String(bArr, iZza, i2, zzhz.zza);
        return iZza + i2;
    }

    static int zzg(byte[] bArr, int i, zzgf zzgfVar) throws zzib {
        int iZza = zza(bArr, i, zzgfVar);
        int i2 = zzgfVar.zza;
        if (i2 < 0) {
            throw zzib.zzb();
        }
        if (i2 == 0) {
            zzgfVar.zzc = "";
            return iZza;
        }
        zzgfVar.zzc = zzkk.zze(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzh(byte[] bArr, int i, zzgf zzgfVar) throws zzib {
        int iZza = zza(bArr, i, zzgfVar);
        int i2 = zzgfVar.zza;
        if (i2 < 0) {
            throw zzib.zzb();
        }
        if (i2 > bArr.length - iZza) {
            throw zzib.zza();
        }
        if (i2 == 0) {
            zzgfVar.zzc = zzgr.zzb;
            return iZza;
        }
        zzgfVar.zzc = zzgr.zzj(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzi(zzjh zzjhVar, byte[] bArr, int i, int i2, zzgf zzgfVar) throws IOException {
        int iZzb = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzb = zzb(i3, bArr, iZzb, zzgfVar);
            i3 = zzgfVar.zza;
        }
        int i4 = iZzb;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzib.zza();
        }
        Object objZza = zzjhVar.zza();
        int i5 = i3 + i4;
        zzjhVar.zzh(objZza, bArr, i4, i5, zzgfVar);
        zzjhVar.zzi(objZza);
        zzgfVar.zzc = objZza;
        return i5;
    }

    static int zzj(zzjh zzjhVar, byte[] bArr, int i, int i2, int i3, zzgf zzgfVar) throws IOException {
        zziz zzizVar = (zziz) zzjhVar;
        Object objZza = zzizVar.zza();
        int iZzg = zzizVar.zzg(objZza, bArr, i, i2, i3, zzgfVar);
        zzizVar.zzi(objZza);
        zzgfVar.zzc = objZza;
        return iZzg;
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzhy<?> zzhyVar, zzgf zzgfVar) {
        zzhs zzhsVar = (zzhs) zzhyVar;
        int iZza = zza(bArr, i2, zzgfVar);
        zzhsVar.zzh(zzgfVar.zza);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzgfVar);
            if (i != zzgfVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzgfVar);
            zzhsVar.zzh(zzgfVar.zza);
        }
        return iZza;
    }

    static int zzl(byte[] bArr, int i, zzhy<?> zzhyVar, zzgf zzgfVar) throws IOException {
        zzhs zzhsVar = (zzhs) zzhyVar;
        int iZza = zza(bArr, i, zzgfVar);
        int i2 = zzgfVar.zza + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzgfVar);
            zzhsVar.zzh(zzgfVar.zza);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw zzib.zza();
    }

    static int zzm(zzjh<?> zzjhVar, int i, byte[] bArr, int i2, int i3, zzhy<?> zzhyVar, zzgf zzgfVar) throws IOException {
        int iZzi = zzi(zzjhVar, bArr, i2, i3, zzgfVar);
        zzhyVar.add(zzgfVar.zzc);
        while (iZzi < i3) {
            int iZza = zza(bArr, iZzi, zzgfVar);
            if (i != zzgfVar.zza) {
                break;
            }
            iZzi = zzi(zzjhVar, bArr, iZza, i3, zzgfVar);
            zzhyVar.add(zzgfVar.zzc);
        }
        return iZzi;
    }

    static int zzn(int i, byte[] bArr, int i2, int i3, zzjw zzjwVar, zzgf zzgfVar) throws zzib {
        if ((i >>> 3) == 0) {
            throw zzib.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzc = zzc(bArr, i2, zzgfVar);
            zzjwVar.zzh(i, Long.valueOf(zzgfVar.zzb));
            return iZzc;
        }
        if (i4 == 1) {
            zzjwVar.zzh(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zzgfVar);
            int i5 = zzgfVar.zza;
            if (i5 < 0) {
                throw zzib.zzb();
            }
            if (i5 > bArr.length - iZza) {
                throw zzib.zza();
            }
            if (i5 == 0) {
                zzjwVar.zzh(i, zzgr.zzb);
            } else {
                zzjwVar.zzh(i, zzgr.zzj(bArr, iZza, i5));
            }
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzib.zzc();
            }
            zzjwVar.zzh(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzjw zzjwVarZzb = zzjw.zzb();
        int i7 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zzgfVar);
            int i8 = zzgfVar.zza;
            if (i8 == i6) {
                i7 = i8;
                i2 = iZza2;
                break;
            }
            i7 = i8;
            i2 = zzn(i8, bArr, iZza2, i3, zzjwVarZzb, zzgfVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzib.zze();
        }
        zzjwVar.zzh(i, zzjwVarZzb);
        return i2;
    }
}
