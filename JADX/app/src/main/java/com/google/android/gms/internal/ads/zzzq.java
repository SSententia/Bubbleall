package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzq implements Runnable {
    private zzzq() {
    }

    /* synthetic */ zzzq(zzzr zzzrVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            MessageDigest unused = zzzs.zzc = MessageDigest.getInstance("MD5");
            countDownLatch = zzzs.zzb;
        } catch (NoSuchAlgorithmException unused2) {
            countDownLatch = zzzs.zzb;
        } catch (Throwable th) {
            zzzs.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
