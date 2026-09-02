package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgef;
import com.google.android.gms.internal.ads.zzgeg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgef<MessageType extends zzgeg<MessageType, BuilderType>, BuilderType extends zzgef<MessageType, BuilderType>> implements zzghh {
    @Override // 
    public abstract BuilderType zzab();

    protected abstract BuilderType zzac(MessageType messagetype);

    @Override // com.google.android.gms.internal.ads.zzghh
    public final /* bridge */ /* synthetic */ zzghh zzad(zzghi zzghiVar) {
        if (zzbe().getClass().isInstance(zzghiVar)) {
            return zzac((zzgeg) zzghiVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
