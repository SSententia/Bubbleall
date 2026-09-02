package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdo extends ThreadLocal<Mac> {
    final /* synthetic */ zzgdp zza;

    zzgdo(zzgdp zzgdpVar) {
        this.zza = zzgdpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac macZzb = zzgdb.zzb.zzb(this.zza.zzb);
            macZzb.init(this.zza.zzc);
            return macZzb;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
