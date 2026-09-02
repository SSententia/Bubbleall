package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgda implements zzftg {
    private final zzgdl zza;
    private final zzfty zzb;

    public zzgda(zzgdl zzgdlVar, zzfty zzftyVar, int i) {
        this.zza = zzgdlVar;
        this.zzb = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza = this.zza.zza(bArr);
        return zzgco.zza(bArrZza, this.zzb.zza(zzgco.zza(bArr2, bArrZza, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
