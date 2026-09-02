package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoh<E> extends zzfml<E> {
    private final zzfoj<E> zza;

    zzfoh(zzfoj<E> zzfojVar, int i) {
        super(zzfojVar.size(), i);
        this.zza = zzfojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
