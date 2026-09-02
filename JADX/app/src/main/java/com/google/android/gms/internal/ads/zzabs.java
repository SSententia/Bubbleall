package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabs {
    static zzftl zza;

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0035 A[EXC_TOP_SPLITTER, PHI: r0
  0x0035: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v3 java.lang.String) binds: [B:16:0x0033, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6 A[SYNTHETIC] */
    static boolean zza(zzabr zzabrVar) throws IllegalAccessException, GeneralSecurityException, InvocationTargetException {
        Method methodZzq;
        zzftl zzftlVarZza;
        if (zza != null) {
            return true;
        }
        String str = (String) zzbet.zzc().zzc(zzbjl.zzbQ);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzabrVar != null && (methodZzq = zzabrVar.zzq("wC9I8kYd+RKAHfQkBEAJYQw7avQUH+U9s6BQ/SJiEcKjDl2sT+FDEb6J3VYVY+ui", "FSkZmgTbP/gL1jHU7M+TcfgVpePk57vWMdHk6knGCa4=")) != null) {
                str = (String) methodZzq.invoke(null, new Object[0]);
            }
            if (str != null) {
                try {
                    zzftv zzftvVarZza = zzftz.zza(zzzo.zzb(str, true));
                    for (zzgax zzgaxVar : zzfwj.zza.zza()) {
                        if (!zzgaxVar.zzc().isEmpty()) {
                            throw new GeneralSecurityException("Missing type_url.");
                        }
                        if (!zzgaxVar.zza().isEmpty()) {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        }
                        if (!zzgaxVar.zzf().isEmpty()) {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        }
                        if (zzgaxVar.zzf().equals("TinkAead") && !zzgaxVar.zzf().equals("TinkMac") && !zzgaxVar.zzf().equals("TinkHybridDecrypt") && !zzgaxVar.zzf().equals("TinkHybridEncrypt") && !zzgaxVar.zzf().equals("TinkPublicKeySign") && !zzgaxVar.zzf().equals("TinkPublicKeyVerify") && !zzgaxVar.zzf().equals("TinkStreamingAead") && !zzgaxVar.zzf().equals("TinkDeterministicAead")) {
                            zzfth<?> zzfthVarZza = zzfum.zza(zzgaxVar.zzf());
                            zzfum.zze(zzfthVarZza.zza());
                            zzgaxVar.zzc();
                            zzgaxVar.zza();
                            zzgaxVar.zzd();
                            zzfum.zzb(zzfthVarZza.zzb(), zzgaxVar.zze());
                        }
                    }
                    zzftlVarZza = zzfwm.zza(zzftvVarZza);
                    zza = zzftlVarZza;
                    if (zzftlVarZza != null) {
                        return true;
                    }
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
            }
        } else {
            zzftv zzftvVarZza2 = zzftz.zza(zzzo.zzb(str, true));
            while (r0.hasNext()) {
                if (!zzgaxVar.zzc().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (!zzgaxVar.zza().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (!zzgaxVar.zzf().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (zzgaxVar.zzf().equals("TinkAead")) {
                }
            }
            zzftlVarZza = zzfwm.zza(zzftvVarZza2);
            zza = zzftlVarZza;
            if (zzftlVarZza != null) {
                return true;
            }
        }
        return false;
    }
}
