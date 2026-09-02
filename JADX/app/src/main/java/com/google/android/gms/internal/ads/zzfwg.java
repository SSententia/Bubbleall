package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwg extends zzfug<zzfzv, zzfzy> {
    private static final byte[] zza = new byte[0];

    zzfwg() {
        super(zzfzv.class, zzfzy.class, new zzfwe(zzftk.class));
    }

    static /* synthetic */ zzftr<zzfzp> zzl(int i, int i2, int i3, zzftp zzftpVar, byte[] bArr, int i4) {
        zzfzo zzfzoVarZzd = zzfzp.zzd();
        zzgaa zzgaaVarZzc = zzgab.zzc();
        int i5 = 4;
        zzgaaVarZzc.zzb(4);
        zzgaaVarZzc.zzc(5);
        zzgaaVarZzc.zza(zzgex.zzt(bArr));
        zzgab zzgabVarZzah = zzgaaVarZzc.zzah();
        zzgat zzgatVarZzd = zzgau.zzd();
        zzgatVarZzd.zza(zzftpVar.zza());
        zzgatVarZzd.zzb(zzgex.zzt(zzftpVar.zzb()));
        int iZzd = zzftpVar.zzd() - 1;
        if (iZzd == 0) {
            i5 = 3;
        } else if (iZzd != 1) {
            i5 = iZzd != 2 ? 6 : 5;
        }
        zzgatVarZzd.zzc(i5);
        zzgau zzgauVarZzah = zzgatVarZzd.zzah();
        zzfzl zzfzlVarZzc = zzfzm.zzc();
        zzfzlVarZzc.zza(zzgauVarZzah);
        zzfzm zzfzmVarZzah = zzfzlVarZzc.zzah();
        zzfzr zzfzrVarZzd = zzfzs.zzd();
        zzfzrVarZzd.zza(zzgabVarZzah);
        zzfzrVarZzd.zzb(zzfzmVarZzah);
        zzfzrVarZzd.zzc(i3);
        zzfzoVarZzd.zza(zzfzrVarZzd.zzah());
        return new zzftr<>(zzfzoVarZzd.zzah(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfzv.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfzv zzfzvVar = (zzfzv) zzghiVar;
        if (zzfzvVar.zzd().zzr()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgdu.zzb(zzfzvVar.zza(), 0);
        zzfwp.zza(zzfzvVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfzp, zzfzv> zzh() {
        return new zzfwf(this, zzfzp.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 4;
    }
}
