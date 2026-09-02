package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfun {
    public static final Charset zza = Charset.forName(Key.STRING_CHARSET_NAME);

    public static zzgbh zza(zzgbc zzgbcVar) {
        zzgbe zzgbeVarZza = zzgbh.zza();
        zzgbeVarZza.zza(zzgbcVar.zza());
        for (zzgbb zzgbbVar : zzgbcVar.zzc()) {
            zzgbf zzgbfVarZza = zzgbg.zza();
            zzgbfVarZza.zza(zzgbbVar.zzc().zza());
            zzgbfVarZza.zzc(zzgbbVar.zzf());
            zzgbfVarZza.zzd(zzgbbVar.zzg());
            zzgbfVarZza.zzb(zzgbbVar.zzd());
            zzgbeVarZza.zzb(zzgbfVarZza.zzah());
        }
        return zzgbeVarZza.zzah();
    }

    public static void zzb(zzgbc zzgbcVar) throws GeneralSecurityException {
        int iZza = zzgbcVar.zza();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgbb zzgbbVar : zzgbcVar.zzc()) {
            if (zzgbbVar.zzf() == 3) {
                if (!zzgbbVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgbbVar.zzd())));
                }
                if (zzgbbVar.zzg() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgbbVar.zzd())));
                }
                if (zzgbbVar.zzf() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgbbVar.zzd())));
                }
                if (zzgbbVar.zzd() == iZza) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgbbVar.zzc().zzi() == 5;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
