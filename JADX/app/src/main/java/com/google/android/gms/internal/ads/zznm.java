package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznm {
    public static void zza(long j, zzamf zzamfVar, zzox[] zzoxVarArr) {
        int iZzv;
        while (true) {
            if (zzamfVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzamfVar);
            int iZzc2 = zzc(zzamfVar);
            int iZzg = zzamfVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzamfVar.zzd()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzamfVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzn = zzamfVar.zzn();
                int iZzo = zzamfVar.zzo();
                if (iZzo == 49) {
                    iZzv = zzamfVar.zzv();
                    iZzo = 49;
                } else {
                    iZzv = 0;
                }
                int iZzn2 = zzamfVar.zzn();
                if (iZzo == 47) {
                    zzamfVar.zzk(1);
                    iZzo = 47;
                }
                boolean z = iZzn == 181 && (iZzo == 49 || iZzo == 47) && iZzn2 == 3;
                if (iZzo == 49) {
                    z &= iZzv == 1195456820;
                }
                if (z) {
                    zzb(j, zzamfVar, zzoxVarArr);
                }
            }
            zzamfVar.zzh(iZzg);
        }
    }

    public static void zzb(long j, zzamf zzamfVar, zzox[] zzoxVarArr) {
        int iZzn = zzamfVar.zzn();
        if ((iZzn & 64) != 0) {
            zzamfVar.zzk(1);
            int i = (iZzn & 31) * 3;
            int iZzg = zzamfVar.zzg();
            for (zzox zzoxVar : zzoxVarArr) {
                zzamfVar.zzh(iZzg);
                zzoxVar.zzy(zzamfVar, i);
                if (j != -9223372036854775807L) {
                    zzoxVar.zzv(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int zzc(zzamf zzamfVar) {
        int i = 0;
        while (zzamfVar.zzd() != 0) {
            int iZzn = zzamfVar.zzn();
            i += iZzn;
            if (iZzn != 255) {
                return i;
            }
        }
        return -1;
    }
}
