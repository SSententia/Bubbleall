package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpx<E> extends zzfoj<E> {
    static final zzfoj<Object> zza = new zzfpx(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzfpx(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzflx.zze(i, this.zzc, "index");
        E e = (E) this.zzb[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj, com.google.android.gms.internal.ads.zzfoe
    final int zzg(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }
}
