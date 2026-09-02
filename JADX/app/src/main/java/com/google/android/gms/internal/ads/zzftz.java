package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzftz {
    @Deprecated
    public static final zzftv zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgbc zzgbcVarZze = zzgbc.zze(bArr, zzgfm.zza());
            for (zzgbb zzgbbVar : zzgbcVarZze.zzc()) {
                if (zzgbbVar.zzc().zzi() == 2 || zzgbbVar.zzc().zzi() == 3 || zzgbbVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzftv.zza(zzgbcVarZze);
        } catch (zzggm unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
