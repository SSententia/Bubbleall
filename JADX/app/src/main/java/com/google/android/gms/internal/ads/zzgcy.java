package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcy {
    private final ECPublicKey zza;

    public zzgcy(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0323  */
    /* JADX WARN: Code duplicated, block: B:119:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0205 A[Catch: IllegalStateException -> 0x033b, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x033b, blocks: (B:12:0x0090, B:14:0x00ab, B:16:0x00b5, B:18:0x00db, B:20:0x00e9, B:65:0x01fe, B:67:0x0205, B:22:0x00ee, B:24:0x00f4, B:26:0x00fa, B:59:0x01e5, B:62:0x01f4, B:63:0x01fb, B:27:0x010b, B:29:0x0112, B:31:0x0118, B:32:0x0125, B:34:0x0139, B:36:0x0149, B:38:0x015e, B:40:0x0188, B:42:0x01a8, B:44:0x01af, B:47:0x01b9, B:49:0x01c5, B:52:0x01ce, B:53:0x01d3, B:55:0x01da, B:56:0x01df, B:102:0x032b, B:103:0x0332, B:104:0x0333, B:105:0x033a), top: B:116:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0232  */
    /* JADX WARN: Code duplicated, block: B:72:0x0235  */
    /* JADX WARN: Code duplicated, block: B:74:0x0251  */
    /* JADX WARN: Code duplicated, block: B:75:0x0253  */
    /* JADX WARN: Code duplicated, block: B:77:0x0257  */
    /* JADX WARN: Code duplicated, block: B:79:0x0266  */
    /* JADX WARN: Code duplicated, block: B:82:0x0277  */
    /* JADX WARN: Code duplicated, block: B:85:0x028c  */
    /* JADX WARN: Code duplicated, block: B:88:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x0310 A[LOOP:0: B:95:0x02fb->B:97:0x0310, LOOP_END] */
    public final zzgcx zza(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger;
        int i3;
        ECPoint w;
        int iBitLength;
        int i4;
        char c;
        int i5;
        byte[] bArr3;
        int i6;
        byte[] bArrZza;
        Mac macZzb;
        byte[] bArr4;
        byte[] bArr5;
        int i7;
        byte[] bArrDoFinal;
        int length;
        int i8;
        byte[] bArr6;
        byte[] byteArray;
        int length2;
        byte[] byteArray2;
        int length3;
        byte b;
        KeyPair keyPairZzc = zzgcz.zzc(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzc.getPrivate();
        ECPublicKey eCPublicKey2 = this.zza;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w2 = eCPublicKey2.getW();
            zzgcz.zza(w2, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = zzgdb.zzg.zzb("EC").generatePublic(new ECPublicKeySpec(w2, eCPrivateKey.getParams()));
            KeyAgreement keyAgreementZzb = zzgdb.zze.zzb("ECDH");
            keyAgreementZzb.init(eCPrivateKey);
            int i9 = 1;
            try {
                keyAgreementZzb.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreementZzb.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzgcz.zzb(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger bigIntegerZzb = zzgcz.zzb(curve);
                BigInteger bigIntegerMod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(bigIntegerZzb);
                if (bigIntegerZzb.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZzb);
                int i10 = 0;
                if (bigIntegerMod2.equals(BigInteger.ZERO)) {
                    bigInteger = BigInteger.ZERO;
                } else {
                    if (bigIntegerZzb.testBit(0) && bigIntegerZzb.testBit(1)) {
                        bigIntegerModPow = bigIntegerMod2.modPow(bigIntegerZzb.add(BigInteger.ONE).shiftRight(2), bigIntegerZzb);
                    } else {
                        bigIntegerModPow = null;
                        if (bigIntegerZzb.testBit(0) && !bigIntegerZzb.testBit(1)) {
                            BigInteger bigIntegerAdd = BigInteger.ONE;
                            BigInteger bigIntegerShiftRight = bigIntegerZzb.subtract(BigInteger.ONE).shiftRight(1);
                            int i11 = 0;
                            while (true) {
                                BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZzb);
                                if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                                    bigInteger = bigIntegerAdd;
                                } else {
                                    BigInteger bigIntegerModPow2 = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZzb);
                                    if (bigIntegerModPow2.add(BigInteger.ONE).equals(bigIntegerZzb)) {
                                        BigInteger bigIntegerShiftRight2 = bigIntegerZzb.add(BigInteger.ONE).shiftRight(i9);
                                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                                        BigInteger bigInteger3 = bigIntegerAdd;
                                        for (int iBitLength2 = bigIntegerShiftRight2.bitLength() - 2; iBitLength2 >= 0; iBitLength2--) {
                                            BigInteger bigIntegerMultiply = bigInteger3.multiply(bigIntegerMod4);
                                            BigInteger bigIntegerMod5 = bigInteger3.multiply(bigInteger3).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZzb).multiply(bigIntegerMod3)).mod(bigIntegerZzb);
                                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZzb);
                                            if (bigIntegerShiftRight2.testBit(iBitLength2)) {
                                                BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZzb);
                                                bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZzb);
                                                bigInteger3 = bigIntegerMod7;
                                            } else {
                                                bigInteger3 = bigIntegerMod5;
                                                bigIntegerMod4 = bigIntegerMod6;
                                            }
                                        }
                                        bigIntegerModPow = bigInteger3;
                                    } else {
                                        if (!bigIntegerModPow2.equals(BigInteger.ONE)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                                        i11++;
                                        if (i11 == 128 && !bigIntegerZzb.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        i9 = 1;
                                        i10 = 0;
                                    }
                                }
                            }
                        }
                    }
                    if (bigIntegerModPow != null && bigIntegerModPow.multiply(bigIntegerModPow).mod(bigIntegerZzb).compareTo(bigIntegerMod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                    bigInteger = bigIntegerModPow;
                    i3 = 0;
                    if (!bigInteger.testBit(i3)) {
                        bigIntegerZzb.subtract(bigInteger).mod(bigIntegerZzb);
                    }
                    EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                    w = eCPublicKey.getW();
                    zzgcz.zza(w, curve2);
                    iBitLength = (zzgcz.zzb(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                    i4 = i2 - 1;
                    if (i4 != 0) {
                        if (i4 != 2) {
                            int i12 = iBitLength + 1;
                            bArr6 = new byte[i12];
                            byte[] byteArray3 = w.getAffineX().toByteArray();
                            int length4 = byteArray3.length;
                            c = 0;
                            System.arraycopy(byteArray3, 0, bArr6, i12 - length4, length4);
                            if (true != w.getAffineY().testBit(0)) {
                                b = 2;
                            } else {
                                b = 3;
                            }
                            bArr6[0] = b;
                        } else {
                            int i13 = iBitLength + iBitLength;
                            bArr6 = new byte[i13];
                            byteArray = w.getAffineX().toByteArray();
                            length2 = byteArray.length;
                            if (length2 > iBitLength) {
                                byteArray = Arrays.copyOfRange(byteArray, length2 - iBitLength, length2);
                            }
                            byteArray2 = w.getAffineY().toByteArray();
                            length3 = byteArray2.length;
                            if (length3 > iBitLength) {
                                byteArray2 = Arrays.copyOfRange(byteArray2, length3 - iBitLength, length3);
                            }
                            int length5 = byteArray2.length;
                            c = 0;
                            System.arraycopy(byteArray2, 0, bArr6, i13 - length5, length5);
                            int length6 = byteArray.length;
                            System.arraycopy(byteArray, 0, bArr6, iBitLength - length6, length6);
                        }
                        bArr3 = bArr6;
                        i6 = 2;
                        i5 = 1;
                    } else {
                        c = 0;
                        i5 = 1;
                        int i14 = iBitLength + iBitLength + 1;
                        bArr3 = new byte[i14];
                        byte[] byteArray4 = w.getAffineX().toByteArray();
                        byte[] byteArray5 = w.getAffineY().toByteArray();
                        int length7 = byteArray5.length;
                        System.arraycopy(byteArray5, 0, bArr3, i14 - length7, length7);
                        int length8 = byteArray4.length;
                        System.arraycopy(byteArray4, 0, bArr3, (iBitLength + 1) - length8, length8);
                        bArr3[0] = 4;
                        i6 = 2;
                    }
                    byte[][] bArr7 = new byte[i6][];
                    bArr7[c] = bArr3;
                    bArr7[i5] = bArrGenerateSecret;
                    bArrZza = zzgco.zza(bArr7);
                    macZzb = zzgdb.zzb.zzb(str);
                    if (i <= macZzb.getMacLength() * 255) {
                        throw new GeneralSecurityException("size too large");
                    }
                    if (bArr != null || bArr.length == 0) {
                        macZzb.init(new SecretKeySpec(new byte[macZzb.getMacLength()], str));
                    } else {
                        macZzb.init(new SecretKeySpec(bArr, str));
                    }
                    byte[] bArrDoFinal2 = macZzb.doFinal(bArrZza);
                    bArr4 = new byte[i];
                    macZzb.init(new SecretKeySpec(bArrDoFinal2, str));
                    bArr5 = new byte[0];
                    i7 = 0;
                    while (true) {
                        macZzb.update(bArr5);
                        macZzb.update(bArr2);
                        macZzb.update((byte) i5);
                        bArrDoFinal = macZzb.doFinal();
                        length = bArrDoFinal.length;
                        i8 = i7 + length;
                        if (i8 < i) {
                            System.arraycopy(bArrDoFinal, 0, bArr4, i7, i - i7);
                            return new zzgcx(bArr3, bArr4);
                        }
                        System.arraycopy(bArrDoFinal, 0, bArr4, i7, length);
                        i5++;
                        bArr5 = bArrDoFinal;
                        i7 = i8;
                    }
                }
                i3 = i10;
                if (!bigInteger.testBit(i3)) {
                    bigIntegerZzb.subtract(bigInteger).mod(bigIntegerZzb);
                }
                EllipticCurve curve3 = eCPublicKey.getParams().getCurve();
                w = eCPublicKey.getW();
                zzgcz.zza(w, curve3);
                iBitLength = (zzgcz.zzb(curve3).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                i4 = i2 - 1;
                if (i4 != 0) {
                    if (i4 != 2) {
                        int i15 = iBitLength + 1;
                        bArr6 = new byte[i15];
                        byte[] byteArray6 = w.getAffineX().toByteArray();
                        int length9 = byteArray6.length;
                        c = 0;
                        System.arraycopy(byteArray6, 0, bArr6, i15 - length9, length9);
                        if (true != w.getAffineY().testBit(0)) {
                            b = 2;
                        } else {
                            b = 3;
                        }
                        bArr6[0] = b;
                    } else {
                        int i16 = iBitLength + iBitLength;
                        bArr6 = new byte[i16];
                        byteArray = w.getAffineX().toByteArray();
                        length2 = byteArray.length;
                        if (length2 > iBitLength) {
                            byteArray = Arrays.copyOfRange(byteArray, length2 - iBitLength, length2);
                        }
                        byteArray2 = w.getAffineY().toByteArray();
                        length3 = byteArray2.length;
                        if (length3 > iBitLength) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length3 - iBitLength, length3);
                        }
                        int length10 = byteArray2.length;
                        c = 0;
                        System.arraycopy(byteArray2, 0, bArr6, i16 - length10, length10);
                        int length11 = byteArray.length;
                        System.arraycopy(byteArray, 0, bArr6, iBitLength - length11, length11);
                    }
                    bArr3 = bArr6;
                    i6 = 2;
                    i5 = 1;
                } else {
                    c = 0;
                    i5 = 1;
                    int i17 = iBitLength + iBitLength + 1;
                    bArr3 = new byte[i17];
                    byte[] byteArray7 = w.getAffineX().toByteArray();
                    byte[] byteArray8 = w.getAffineY().toByteArray();
                    int length12 = byteArray8.length;
                    System.arraycopy(byteArray8, 0, bArr3, i17 - length12, length12);
                    int length13 = byteArray7.length;
                    System.arraycopy(byteArray7, 0, bArr3, (iBitLength + 1) - length13, length13);
                    bArr3[0] = 4;
                    i6 = 2;
                }
                byte[][] bArr8 = new byte[i6][];
                bArr8[c] = bArr3;
                bArr8[i5] = bArrGenerateSecret;
                bArrZza = zzgco.zza(bArr8);
                macZzb = zzgdb.zzb.zzb(str);
                if (i <= macZzb.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr != null) {
                    macZzb.init(new SecretKeySpec(new byte[macZzb.getMacLength()], str));
                } else {
                    macZzb.init(new SecretKeySpec(new byte[macZzb.getMacLength()], str));
                }
                byte[] bArrDoFinal3 = macZzb.doFinal(bArrZza);
                bArr4 = new byte[i];
                macZzb.init(new SecretKeySpec(bArrDoFinal3, str));
                bArr5 = new byte[0];
                i7 = 0;
                while (true) {
                    macZzb.update(bArr5);
                    macZzb.update(bArr2);
                    macZzb.update((byte) i5);
                    bArrDoFinal = macZzb.doFinal();
                    length = bArrDoFinal.length;
                    i8 = i7 + length;
                    if (i8 < i) {
                        System.arraycopy(bArrDoFinal, 0, bArr4, i7, i - i7);
                        return new zzgcx(bArr3, bArr4);
                    }
                    System.arraycopy(bArrDoFinal, 0, bArr4, i7, length);
                    i5++;
                    bArr5 = bArrDoFinal;
                    i7 = i8;
                }
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}
