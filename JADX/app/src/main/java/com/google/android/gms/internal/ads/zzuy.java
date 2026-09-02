package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuy {
    public static zzuw zza(zznv zznvVar) throws IOException {
        byte[] bArr;
        zzamf zzamfVar = new zzamf(16);
        if (zzux.zza(zznvVar, zzamfVar).zza != 1380533830) {
            return null;
        }
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(zzamfVar.zzi(), 0, 4, false);
        zzamfVar.zzh(0);
        int iZzv = zzamfVar.zzv();
        if (iZzv != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(iZzv);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        zzux zzuxVarZza = zzux.zza(zznvVar, zzamfVar);
        while (zzuxVarZza.zza != 1718449184) {
            zznpVar.zzj((int) zzuxVarZza.zzb, false);
            zzuxVarZza = zzux.zza(zznvVar, zzamfVar);
        }
        zzakt.zzd(zzuxVarZza.zzb >= 16);
        zznpVar.zzh(zzamfVar.zzi(), 0, 16, false);
        zzamfVar.zzh(0);
        int iZzp = zzamfVar.zzp();
        int iZzp2 = zzamfVar.zzp();
        int iZzC = zzamfVar.zzC();
        int iZzC2 = zzamfVar.zzC();
        int iZzp3 = zzamfVar.zzp();
        int iZzp4 = zzamfVar.zzp();
        int i = ((int) zzuxVarZza.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zznpVar.zzh(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzamq.zzf;
        }
        return new zzuw(iZzp, iZzp2, iZzC, iZzC2, iZzp3, iZzp4, bArr);
    }
}
