package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvn implements zzftg {
    private static final byte[] zza = new byte[0];
    private final zzgau zzb;
    private final zzftg zzc;

    public zzfvn(zzgau zzgauVar, zzftg zzftgVar) {
        this.zzb = zzgauVar;
        this.zzc = zzftgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzao = zzfum.zzh(this.zzb).zzao();
        byte[] bArrZza = this.zzc.zza(bArrZzao, zza);
        byte[] bArrZza2 = ((zzftg) zzfum.zzj(this.zzb.zza(), bArrZzao, zzftg.class)).zza(bArr, bArr2);
        int length = bArrZza.length;
        return ByteBuffer.allocate(length + 4 + bArrZza2.length).putInt(length).put(bArrZza).put(bArrZza2).array();
    }
}
