package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvg extends zzftu<zzfys> {
    zzfvg() {
        super(zzfys.class, new zzfve(zzftg.class));
    }

    public static void zzk(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzfum.zzc(new zzfvg(), true);
        }
    }

    static /* synthetic */ zzftr<zzfyv> zzl(int i, int i2) {
        zzfyu zzfyuVarZzd = zzfyv.zzd();
        zzfyuVarZzd.zza(i);
        return new zzftr<>(zzfyuVarZzd.zzah(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfys.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfys zzfysVar = (zzfys) zzghiVar;
        zzgdu.zzb(zzfysVar.zza(), 0);
        zzgdu.zza(zzfysVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfyv, zzfys> zzh() {
        return new zzfvf(this, zzfyv.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }
}
