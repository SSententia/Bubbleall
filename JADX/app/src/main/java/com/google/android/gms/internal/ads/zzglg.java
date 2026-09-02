package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglg<K, V> extends zzgkv<K, V, zzgln<V>> {
    /* synthetic */ zzglg(int i, zzglf zzglfVar) {
        super(1);
    }

    public final zzglg<K, V> zzb(K k, zzgln<V> zzglnVar) {
        super.zza("Network", zzglnVar);
        return this;
    }

    public final zzglh<K, V> zzc() {
        return new zzglh<>(this.zza, null);
    }
}
