package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaeg extends zzahc {
    public static final zzadw<zzaeg> zzh = zzaef.zza;
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final zzafv zzd;
    public final int zze;
    public final zzo zzf;
    final boolean zzg;

    private zzaeg(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzaeg zza(IOException iOException, int i) {
        return new zzaeg(0, iOException, i);
    }

    public static zzaeg zzb(Throwable th, String str, int i, zzafv zzafvVar, int i2, boolean z, int i3) {
        return new zzaeg(1, th, null, i3, str, i, zzafvVar, zzafvVar == null ? 4 : i2, z);
    }

    public static zzaeg zzc(RuntimeException runtimeException, int i) {
        return new zzaeg(2, runtimeException, i);
    }

    final zzaeg zzd(zzo zzoVar) {
        String message = getMessage();
        int i = zzamq.zza;
        return new zzaeg(message, getCause(), this.zzi, this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzoVar, this.zzj, this.zzg);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzaeg(int i, Throwable th, String str, int i2, String str2, int i3, zzafv zzafvVar, int i4, boolean z) {
        String string;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzafvVar);
            String strZzd = zzadx.zzd(i4);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53 + String.valueOf(strValueOf).length() + strZzd.length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strZzd);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str2, i3, zzafvVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private zzaeg(String str, Throwable th, int i, int i2, String str2, int i3, zzafv zzafvVar, int i4, zzo zzoVar, long j, boolean z) {
        int i5;
        boolean z2;
        super(str, th, i, j);
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzakt.zza(z2);
        zzakt.zza(th != null);
        this.zza = i5;
        this.zzb = str2;
        this.zzc = i3;
        this.zzd = zzafvVar;
        this.zze = i4;
        this.zzf = zzoVar;
        this.zzg = z;
    }
}
