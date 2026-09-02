package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzaxn extends zzaxe {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzaxn(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            MessageDigest messageDigestZzb = zzb();
            this.zzb = messageDigestZzb;
            if (messageDigestZzb == null) {
                return new byte[0];
            }
            messageDigestZzb.reset();
            this.zzb.update(str.getBytes(Charset.forName(Key.STRING_CHARSET_NAME)));
            byte[] bArrDigest = this.zzb.digest();
            int length = bArrDigest.length;
            int i = this.zzc;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.zzd & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += (long) (bArr[i2] & UByte.MAX_VALUE);
                }
                long j2 = j >>> (8 - (this.zzd & 7));
                int i3 = this.zzc;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
