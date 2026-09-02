package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvd extends zzftu<zzfym> {
    zzfvd() {
        super(zzfym.class, new zzfvb(zzftg.class));
    }

    static /* synthetic */ zzftr<zzfyp> zzk(int i, int i2) {
        zzfyo zzfyoVarZzd = zzfyp.zzd();
        zzfyoVarZzd.zza(i);
        return new zzftr<>(zzfyoVarZzd.zzah(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfym.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfym zzfymVar = (zzfym) zzghiVar;
        zzgdu.zzb(zzfymVar.zza(), 0);
        zzgdu.zza(zzfymVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfyp, zzfym> zzh() {
        return new zzfvc(this, zzfyp.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzj() {
        return 2;
    }
}
