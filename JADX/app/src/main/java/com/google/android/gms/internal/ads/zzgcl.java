package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcl implements zzftg {
    private static final ThreadLocal<Cipher> zza = new zzgck();
    private final SecretKey zzb;

    public zzgcl(byte[] bArr) throws GeneralSecurityException {
        if (!zzfvw.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgdu.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrZza = zzgds.zza(12);
        System.arraycopy(bArrZza, 0, bArr3, 0, 12);
        int length2 = bArrZza.length;
        AlgorithmParameterSpec gCMParameterSpec = (!zzgdt.zza() || zzgdt.zzb() > 19) ? new GCMParameterSpec(128, bArrZza, 0, length2) : new IvParameterSpec(bArrZza, 0, length2);
        ThreadLocal<Cipher> threadLocal = zza;
        threadLocal.get().init(1, this.zzb, gCMParameterSpec);
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
