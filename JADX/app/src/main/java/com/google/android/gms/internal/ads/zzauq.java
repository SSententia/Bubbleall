package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauq {
    private static final byte[] zza = {0, 0, 0, 1};
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zza(byte[] bArr) {
        zzauw zzauwVar = new zzauw(bArr, bArr.length);
        int iZzc = zzc(zzauwVar);
        int iZzd = zzd(zzauwVar);
        int iZza = zzauwVar.zza(4);
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzauwVar);
            if (zzc(zzauwVar) == 22) {
                iZza = zzauwVar.zza(4);
            }
        }
        int i = zzc[iZza];
        zzaup.zza(i != -1);
        return Pair.create(Integer.valueOf(iZzd), Integer.valueOf(i));
    }

    public static byte[] zzb(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zza, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static int zzc(zzauw zzauwVar) {
        int iZza = zzauwVar.zza(5);
        return iZza == 31 ? zzauwVar.zza(6) + 32 : iZza;
    }

    private static int zzd(zzauw zzauwVar) {
        int iZza = zzauwVar.zza(4);
        if (iZza == 15) {
            return zzauwVar.zza(24);
        }
        zzaup.zza(iZza < 13);
        return zzb[iZza];
    }
}
