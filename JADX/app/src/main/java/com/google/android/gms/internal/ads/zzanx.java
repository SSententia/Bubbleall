package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzanx {
    public static final zzanx zza = new zzanu();

    public abstract int zza();

    public abstract zzanw zzb(int i, zzanw zzanwVar, boolean z, long j);

    public abstract int zzc();

    public abstract zzanv zzd(int i, zzanv zzanvVar, boolean z);

    public abstract int zze(Object obj);

    public final boolean zzf() {
        return zza() == 0;
    }

    public final zzanw zzg(int i, zzanw zzanwVar, boolean z) {
        return zzb(i, zzanwVar, false, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final int zzh(int i, zzanv zzanvVar, zzanw zzanwVar, int i2) {
        zzd(i, zzanvVar, false);
        zzg(0, zzanwVar, false);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 0;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                if (zza() - 1 == 0) {
                    i3 = 0;
                }
            }
        } else if (zza() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        zzg(i3, zzanwVar, false);
        return 0;
    }
}
