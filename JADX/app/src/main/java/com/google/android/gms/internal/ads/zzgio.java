package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgio<T, B> {
    zzgio() {
    }

    abstract boolean zza(zzght zzghtVar);

    abstract void zzb(B b, int i, long j);

    abstract void zzc(B b, int i, int i2);

    abstract void zzd(B b, int i, long j);

    abstract void zze(B b, int i, zzgex zzgexVar);

    abstract void zzf(B b, int i, T t);

    abstract B zzg();

    abstract T zzh(B b);

    abstract void zzi(Object obj, T t);

    abstract T zzj(Object obj);

    abstract B zzk(Object obj);

    abstract void zzl(Object obj, B b);

    abstract void zzm(Object obj);

    abstract T zzo(T t, T t2);

    abstract int zzp(T t);

    abstract int zzq(T t);

    abstract void zzr(T t, zzgfi zzgfiVar) throws IOException;

    final boolean zzn(B b, zzght zzghtVar) throws IOException {
        int iZzc = zzghtVar.zzc();
        int i = iZzc >>> 3;
        int i2 = iZzc & 7;
        if (i2 == 0) {
            zzb(b, i, zzghtVar.zzh());
            return true;
        }
        if (i2 == 1) {
            zzd(b, i, zzghtVar.zzj());
            return true;
        }
        if (i2 == 2) {
            zze(b, i, zzghtVar.zzq());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzggm.zzi();
            }
            zzc(b, i, zzghtVar.zzk());
            return true;
        }
        B bZzg = zzg();
        int i3 = 4 | (i << 3);
        while (zzghtVar.zzb() != Integer.MAX_VALUE && zzn(bZzg, zzghtVar)) {
        }
        if (i3 != zzghtVar.zzc()) {
            throw zzggm.zzh();
        }
        zzh(bZzg);
        zzf(b, i, bZzg);
        return true;
    }
}
