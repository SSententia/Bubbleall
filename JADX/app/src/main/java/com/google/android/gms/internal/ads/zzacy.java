package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacy {
    protected static final String zza = "zzacy";
    private final zzabr zzb;
    private final String zzc;
    private final String zzd;
    private final Class<?>[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzacy(zzabr zzabrVar, String str, String str2, Class<?>... clsArr) {
        this.zzb = zzabrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzabrVar.zze().submit(new zzacx(this));
    }

    static /* synthetic */ void zza(zzacy zzacyVar) {
        CountDownLatch countDownLatch;
        try {
            try {
                Class clsLoadClass = zzacyVar.zzb.zzf().loadClass(zzacyVar.zzc(zzacyVar.zzb.zzh(), zzacyVar.zzc));
                if (clsLoadClass == null) {
                    countDownLatch = zzacyVar.zzg;
                } else {
                    zzacyVar.zze = clsLoadClass.getMethod(zzacyVar.zzc(zzacyVar.zzb.zzh(), zzacyVar.zzd), zzacyVar.zzf);
                    countDownLatch = zzacyVar.zze == null ? zzacyVar.zzg : zzacyVar.zzg;
                }
            } catch (NullPointerException unused) {
                countDownLatch = zzacyVar.zzg;
            } catch (Throwable th) {
                zzacyVar.zzg.countDown();
                throw th;
            }
        } catch (zzaaw | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaaw, UnsupportedEncodingException {
        return new String(this.zzb.zzg().zzb(bArr, str), Key.STRING_CHARSET_NAME);
    }

    public final Method zzb() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
