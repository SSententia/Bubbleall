package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzs {
    static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    static void zzb() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzzq(null)).start();
            }
        }
    }

    static String zzc(zzyz zzyzVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrZzg;
        byte[] bArrZzao = zzyzVar.zzao();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbR)).booleanValue()) {
            Vector<byte[]> vectorZzd = zzd(bArrZzao, 255);
            if (vectorZzd == null || vectorZzd.size() == 0) {
                bArrZzg = zzg(zzf(4096).zzao(), str, true);
            } else {
                zzzl zzzlVarZza = zzzm.zza();
                int size = vectorZzd.size();
                for (int i = 0; i < size; i++) {
                    zzzlVarZza.zza(zzgex.zzt(zzg(vectorZzd.get(i), str, false)));
                }
                zzzlVarZza.zzb(zzgex.zzt(zze(bArrZzao)));
                bArrZzg = zzzlVarZza.zzah().zzao();
            }
        } else {
            if (zzabs.zza == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrZza = zzabs.zza.zza(bArrZzao, str != null ? str.getBytes() : new byte[0]);
            zzzl zzzlVarZza2 = zzzm.zza();
            zzzlVarZza2.zza(zzgex.zzt(bArrZza));
            zzzlVarZza2.zzc(3);
            bArrZzg = zzzlVarZza2.zzah().zzao();
        }
        return zzzo.zza(bArrZzg, true);
    }

    static Vector<byte[]> zzd(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zzd) {
            zzb();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzc) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = zzc.digest();
        }
        return bArrDigest;
    }

    static zzyz zzf(int i) {
        zzyj zzyjVarZzi = zzyz.zzi();
        zzyjVarZzi.zzl(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return zzyjVarZzi.zzah();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = zzf(4096).zzao();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzzt[] zzztVarArr = new zzaah().zzcG;
        int length2 = zzztVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzztVarArr[i2].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgee(str.getBytes(Key.STRING_CHARSET_NAME)).zza(bArr3);
        }
        return bArr3;
    }
}
