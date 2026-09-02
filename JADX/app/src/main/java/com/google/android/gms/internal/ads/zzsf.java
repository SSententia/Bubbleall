package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsf {
    private final zzsg zza = new zzsg();
    private final zzamf zzb = new zzamf(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzsf() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzsg zzsgVar = this.zza;
            if (i5 >= zzsgVar.zzc) {
                break;
            }
            int[] iArr = zzsgVar.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzsg zzc() {
        return this.zza;
    }

    public final zzamf zzd() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zzb.zzi().length == 65025) {
            return;
        }
        zzamf zzamfVar = this.zzb;
        zzamfVar.zzb(Arrays.copyOf(zzamfVar.zzi(), Math.max(65025, this.zzb.zze())), this.zzb.zze());
    }

    public final boolean zzb(zznv zznvVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzb(zznvVar, -1L) || !this.zza.zzc(zznvVar, true)) {
                    return false;
                }
                zzsg zzsgVar = this.zza;
                int iZzf = zzsgVar.zzd;
                if ((zzsgVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzny.zzd(zznvVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzamf zzamfVar = this.zzb;
                zzamfVar.zzc(zzamfVar.zze() + iZzf2);
                if (!zzny.zzc(zznvVar, this.zzb.zzi(), this.zzb.zze(), iZzf2)) {
                    return false;
                }
                zzamf zzamfVar2 = this.zzb;
                zzamfVar2.zzf(zzamfVar2.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}
