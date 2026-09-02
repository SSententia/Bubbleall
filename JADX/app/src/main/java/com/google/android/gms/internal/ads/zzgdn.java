package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdn implements zzfxc {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgdn(byte[] bArr) throws GeneralSecurityException {
        zzgdu.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZza = zzgcn.zza(cipherZzb.doFinal(new byte[16]));
        this.zzb = bArrZza;
        this.zzc = zzgcn.zza(bArrZza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzfvw.zza(1)) {
            return zzgdb.zza.zzb("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, this.zza);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        byte[] bArrZzb = iMax * 16 == length ? zzgco.zzb(bArr, (iMax - 1) * 16, this.zzb, 0, 16) : zzgco.zzd(zzgcn.zzb(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.zzc);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherZzb.doFinal(zzgco.zzb(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherZzb.doFinal(zzgco.zzd(bArrZzb, bArrDoFinal)), i);
    }
}
