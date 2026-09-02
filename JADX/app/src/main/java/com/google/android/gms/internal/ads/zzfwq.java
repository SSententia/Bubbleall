package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwq implements zzgct {
    private final String zza;
    private final int zzb;
    private zzfym zzc;
    private zzfxo zzd;
    private int zze;
    private zzfyy zzf;

    zzfwq(zzgau zzgauVar) throws GeneralSecurityException {
        String strZza = zzgauVar.zza();
        this.zza = strZza;
        if (strZza.equals(zzfuo.zzb)) {
            try {
                zzfyp zzfypVarZzc = zzfyp.zzc(zzgauVar.zzc(), zzgfm.zza());
                this.zzc = (zzfym) zzfum.zzh(zzgauVar);
                this.zzb = zzfypVarZzc.zza();
                return;
            } catch (zzggm e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strZza.equals(zzfuo.zza)) {
            try {
                zzfxr zzfxrVarZzd = zzfxr.zzd(zzgauVar.zzc(), zzgfm.zza());
                this.zzd = (zzfxo) zzfum.zzh(zzgauVar);
                this.zze = zzfxrVarZzd.zza().zzc();
                this.zzb = this.zze + zzfxrVarZzd.zzc().zzc();
                return;
            } catch (zzggm e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!strZza.equals(zzfwb.zza)) {
            String strValueOf = String.valueOf(strZza);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            zzfzb zzfzbVarZzc = zzfzb.zzc(zzgauVar.zzc(), zzgfm.zza());
            this.zzf = (zzfyy) zzfum.zzh(zzgauVar);
            this.zzb = zzfzbVarZzc.zza();
        } catch (zzggm e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final zzfwr zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzfuo.zzb)) {
            zzfyl zzfylVarZze = zzfym.zze();
            zzfylVarZze.zzai(this.zzc);
            zzfylVarZze.zzb(zzgex.zzs(bArr, 0, this.zzb));
            return new zzfwr((zzftg) zzfum.zzi(this.zza, zzfylVarZze.zzah(), zzftg.class));
        }
        if (!this.zza.equals(zzfuo.zza)) {
            if (!this.zza.equals(zzfwb.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzfyx zzfyxVarZze = zzfyy.zze();
            zzfyxVarZze.zzai(this.zzf);
            zzfyxVarZze.zzb(zzgex.zzs(bArr, 0, this.zzb));
            return new zzfwr((zzftj) zzfum.zzi(this.zza, zzfyxVarZze.zzah(), zzftj.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzfxt zzfxtVarZzf = zzfxu.zzf();
        zzfxtVarZzf.zzai(this.zzd.zzc());
        zzfxtVarZzf.zzc(zzgex.zzt(bArrCopyOfRange));
        zzfxu zzfxuVarZzah = zzfxtVarZzf.zzah();
        zzgah zzgahVarZzf = zzgai.zzf();
        zzgahVarZzf.zzai(this.zzd.zzd());
        zzgahVarZzf.zzc(zzgex.zzt(bArrCopyOfRange2));
        zzgai zzgaiVarZzah = zzgahVarZzf.zzah();
        zzfxn zzfxnVarZzf = zzfxo.zzf();
        zzfxnVarZzf.zza(this.zzd.zza());
        zzfxnVarZzf.zzb(zzfxuVarZzah);
        zzfxnVarZzf.zzc(zzgaiVarZzah);
        return new zzfwr((zzftg) zzfum.zzi(this.zza, zzfxnVarZzf.zzah(), zzftg.class));
    }
}
