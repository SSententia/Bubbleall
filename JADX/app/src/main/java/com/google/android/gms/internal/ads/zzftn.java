package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftn<KeyFormatProtoT extends zzghi, KeyProtoT extends zzghi> {
    final zzfts<KeyFormatProtoT, KeyProtoT> zza;

    zzftn(zzfts<KeyFormatProtoT, KeyProtoT> zzftsVar) {
        this.zza = zzftsVar;
    }

    final KeyProtoT zza(zzgex zzgexVar) throws GeneralSecurityException, zzggm {
        zzghi zzghiVarZzc = this.zza.zzc(zzgexVar);
        this.zza.zzb(zzghiVarZzc);
        return this.zza.zzd(zzghiVarZzc);
    }
}
