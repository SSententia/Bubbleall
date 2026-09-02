package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdou {
    private final com.google.android.gms.ads.internal.util.zzbr zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdou(com.google.android.gms.ads.internal.util.zzbr zzbrVar, Clock clock, Executor executor) {
        this.zza = zzbrVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    static /* synthetic */ Bitmap zzb(zzdou zzdouVar, byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeu)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdouVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzbet.zzc().zzc(zzbjl.zzev)).intValue())) / 2);
            }
        }
        return zzdouVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.zzb.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j = jElapsedRealtime2 - jElapsedRealtime;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final zzfsm<Bitmap> zza(String str, double d, boolean z) {
        return zzfsd.zzj(this.zza.zza(str), new zzdot(this, d, z), this.zzc);
    }
}
