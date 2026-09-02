package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwu extends zzftu<zzfxf> {
    zzfwu() {
        super(zzfxf.class, new zzfws(zzfty.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzfxl zzfxlVar) throws GeneralSecurityException {
        if (zzfxlVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzfxlVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfxf.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxf zzfxfVar = (zzfxf) zzghiVar;
        zzgdu.zzb(zzfxfVar.zza(), 0);
        zzn(zzfxfVar.zzc().zzc());
        zzm(zzfxfVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfxi, zzfxf> zzh() {
        return new zzfwt(this, zzfxi.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }
}
