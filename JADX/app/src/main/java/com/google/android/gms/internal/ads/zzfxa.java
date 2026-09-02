package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxa implements zzfty {
    private final zzfud<zzfty> zza;
    private final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzfty
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza().zzd() == 4 ? zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(zzgco.zza(bArr, this.zzb))) : zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(bArr));
    }
}
