package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadm extends zzaiq {
    private final int zza;
    private final zzix zzb;

    public zzadm(boolean z, zzix zzixVar, byte[] bArr) {
        this.zzb = zzixVar;
        this.zza = zzixVar.zza();
    }

    private final int zzs(int i, boolean z) {
        if (z) {
            return this.zzb.zzb(i);
        }
        if (i >= this.zza - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzb.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzb(int i, int i2, boolean z) {
        int iZzm = zzm(i);
        int iZzq = zzq(iZzm);
        int iZzb = zzo(iZzm).zzb(i - iZzq, i2 == 2 ? 0 : i2, z);
        if (iZzb != -1) {
            return iZzq + iZzb;
        }
        int iZzs = zzs(iZzm, z);
        while (iZzs != -1 && zzo(iZzs).zzt()) {
            iZzs = zzs(iZzs, z);
        }
        if (iZzs != -1) {
            return zzq(iZzs) + zzo(iZzs).zze(z);
        }
        if (i2 == 2) {
            return zze(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzc(int i, int i2, boolean z) {
        int iZzm = zzm(i);
        int iZzq = zzq(iZzm);
        int iZzc = zzo(iZzm).zzc(i - iZzq, 0, false);
        if (iZzc != -1) {
            return iZzq + iZzc;
        }
        int iZzx = zzx(iZzm, false);
        while (iZzx != -1 && zzo(iZzx).zzt()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx != -1) {
            return zzq(iZzx) + zzo(iZzx).zzd(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzd(boolean z) {
        int i = this.zza;
        if (i == 0) {
            return -1;
        }
        int iZzd = z ? this.zzb.zzd() : i - 1;
        while (zzo(iZzd).zzt()) {
            iZzd = zzx(iZzd, z);
            if (iZzd == -1) {
                return -1;
            }
        }
        return zzq(iZzd) + zzo(iZzd).zzd(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zze(boolean z) {
        if (this.zza == 0) {
            return -1;
        }
        int iZze = z ? this.zzb.zze() : 0;
        while (zzo(iZze).zzt()) {
            iZze = zzs(iZze, z);
            if (iZze == -1) {
                return -1;
            }
        }
        return zzq(iZze) + zzo(iZze).zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzaip zzf(int i, zzaip zzaipVar, long j) {
        int iZzm = zzm(i);
        int iZzq = zzq(iZzm);
        int iZzp = zzp(iZzm);
        zzo(iZzm).zzf(i - iZzq, zzaipVar, j);
        Object objZzr = zzr(iZzm);
        if (!zzaip.zza.equals(zzaipVar.zzb)) {
            objZzr = Pair.create(objZzr, zzaipVar.zzb);
        }
        zzaipVar.zzb = objZzr;
        zzaipVar.zzn += iZzp;
        zzaipVar.zzo += iZzp;
        return zzaipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzain zzh(int i, zzain zzainVar, boolean z) {
        int iZzl = zzl(i);
        int iZzq = zzq(iZzl);
        zzo(iZzl).zzh(i - zzp(iZzl), zzainVar, z);
        zzainVar.zzc += iZzq;
        if (z) {
            Object objZzr = zzr(iZzl);
            Object obj = zzainVar.zzb;
            obj.getClass();
            zzainVar.zzb = Pair.create(objZzr, obj);
        }
        return zzainVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzi(Object obj) {
        int iZzi;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzn = zzn(obj2);
        if (iZzn == -1 || (iZzi = zzo(iZzn).zzi(obj3)) == -1) {
            return -1;
        }
        return zzp(iZzn) + iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final Object zzj(int i) {
        int iZzl = zzl(i);
        return Pair.create(zzr(iZzl), zzo(iZzl).zzj(i - zzp(iZzl)));
    }

    protected abstract int zzl(int i);

    protected abstract int zzm(int i);

    protected abstract int zzn(Object obj);

    protected abstract zzaiq zzo(int i);

    protected abstract int zzp(int i);

    protected abstract int zzq(int i);

    protected abstract Object zzr(int i);

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzain zzy(Object obj, zzain zzainVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzn = zzn(obj2);
        int iZzq = zzq(iZzn);
        zzo(iZzn).zzy(obj3, zzainVar);
        zzainVar.zzc += iZzq;
        zzainVar.zzb = obj;
        return zzainVar;
    }
}
