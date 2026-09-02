package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrr {
    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    public static UUID zza(byte[] bArr) {
        zzrq zzrqVar;
        zzamf zzamfVar = new zzamf(bArr);
        if (zzamfVar.zze() < 32) {
            zzrqVar = null;
        } else {
            zzamfVar.zzh(0);
            if (zzamfVar.zzv() == zzamfVar.zzd() + 4 && zzamfVar.zzv() == 1886614376) {
                int iZze = zzqx.zze(zzamfVar.zzv());
                if (iZze > 1) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported pssh version: ");
                    sb.append(iZze);
                    Log.w("PsshAtomUtil", sb.toString());
                } else {
                    UUID uuid = new UUID(zzamfVar.zzx(), zzamfVar.zzx());
                    if (iZze == 1) {
                        zzamfVar.zzk(zzamfVar.zzB() * 16);
                    }
                    int iZzB = zzamfVar.zzB();
                    if (iZzB == zzamfVar.zzd()) {
                        byte[] bArr2 = new byte[iZzB];
                        zzamfVar.zzm(bArr2, 0, iZzB);
                        zzrqVar = new zzrq(uuid, iZze, bArr2);
                    }
                }
                zzrqVar = null;
            } else {
                zzrqVar = null;
            }
        }
        if (zzrqVar == null) {
            return null;
        }
        return zzrqVar.zza;
    }
}
