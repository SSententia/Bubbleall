package com.google.android.gms.internal.ads;

import androidx.media2.widget.Cea708CCParser;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzon {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zzoo.zzl(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        this.zzb = zzoo.zza[3 - i3];
        int i6 = zzoo.zzb[i5];
        this.zzd = i6;
        if (i2 == 2) {
            this.zzd = i6 / 2;
        } else if (i2 == 0) {
            this.zzd = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        this.zzg = zzoo.zzm(i2, i3);
        if (i3 == 3) {
            int i8 = i2 == 3 ? zzoo.zzc[i4 - 1] : zzoo.zzd[i4 - 1];
            this.zzf = i8;
            this.zzc = (((i8 * 12) / this.zzd) + i7) * 4;
        } else {
            int i9 = Cea708CCParser.Const.CODE_C1_SPA;
            if (i2 == 3) {
                int i10 = i3 == 2 ? zzoo.zze[i4 - 1] : zzoo.zzf[i4 - 1];
                this.zzf = i10;
                this.zzc = ((i10 * Cea708CCParser.Const.CODE_C1_SPA) / this.zzd) + i7;
            } else {
                int i11 = zzoo.zzg[i4 - 1];
                this.zzf = i11;
                if (i3 == 1) {
                    i9 = 72;
                }
                this.zzc = ((i9 * i11) / this.zzd) + i7;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
