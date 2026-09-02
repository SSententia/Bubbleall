package com.google.android.gms.internal.ads;

import androidx.media2.session.SessionCommand;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsi extends zzsm {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean zzb;

    zzsi() {
    }

    public static boolean zzd(zzamf zzamfVar) {
        if (zzamfVar.zzd() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        zzamfVar.zzm(bArr, 0, 8);
        return Arrays.equals(bArr, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        int i;
        int i2;
        byte[] bArrZzi = zzamfVar.zzi();
        byte b = bArrZzi[0];
        int i3 = b & UByte.MAX_VALUE;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArrZzi[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = SessionCommand.COMMAND_CODE_PLAYER_PLAY << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : SessionCommand.COMMAND_CODE_PLAYER_PLAY << i6;
        }
        return zzi(((long) i) * ((long) i2));
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) {
        if (this.zzb) {
            zzskVar.zza.getClass();
            boolean z = zzamfVar.zzv() == 1332770163;
            zzamfVar.zzh(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze());
        byte b = bArrCopyOf[9];
        List<byte[]> listZza = zzop.zza(bArrCopyOf);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/opus");
        zzaftVar.zzaa(b & UByte.MAX_VALUE);
        zzaftVar.zzab(48000);
        zzaftVar.zzP(listZza);
        zzskVar.zza = zzaftVar.zzah();
        this.zzb = true;
        return true;
    }
}
