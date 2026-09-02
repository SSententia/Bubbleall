package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwn implements zzftl {
    final zzfud<zzftl> zza;

    public zzfwn(zzfud<zzftl> zzfudVar) {
        this.zza = zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(bArr, bArr2));
    }
}
