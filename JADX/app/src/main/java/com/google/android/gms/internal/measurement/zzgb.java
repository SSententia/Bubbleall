package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgb<MessageType extends zzgc<MessageType, BuilderType>, BuilderType extends zzgb<MessageType, BuilderType>> implements zziv {
    @Override // 
    public abstract BuilderType zzaq();

    public BuilderType zzar(byte[] bArr, int i, int i2) throws zzib {
        throw null;
    }

    public BuilderType zzas(byte[] bArr, int i, int i2, zzhd zzhdVar) throws zzib {
        throw null;
    }

    protected abstract BuilderType zzat(MessageType messagetype);

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* bridge */ /* synthetic */ zziv zzau(zziw zziwVar) {
        if (zzbK().getClass().isInstance(zziwVar)) {
            return zzat((zzgc) zziwVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* bridge */ /* synthetic */ zziv zzav(byte[] bArr, zzhd zzhdVar) throws zzib {
        return zzas(bArr, 0, bArr.length, zzhdVar);
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* bridge */ /* synthetic */ zziv zzaw(byte[] bArr) throws zzib {
        return zzar(bArr, 0, bArr.length);
    }
}
