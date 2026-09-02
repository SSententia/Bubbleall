package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfva extends zzftu<zzfyd> {
    zzfva() {
        super(zzfyd.class, new zzfuy(zzftg.class));
    }

    static /* synthetic */ zzftr<zzfyg> zzk(int i, int i2, int i3) {
        zzfyf zzfyfVarZze = zzfyg.zze();
        zzfyfVarZze.zzb(i);
        zzfyi zzfyiVarZzc = zzfyj.zzc();
        zzfyiVarZzc.zza(16);
        zzfyfVarZze.zza(zzfyiVarZzc.zzah());
        return new zzftr<>(zzfyfVarZze.zzah(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfyd.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyd zzfydVar = (zzfyd) zzghiVar;
        zzgdu.zzb(zzfydVar.zza(), 0);
        zzgdu.zza(zzfydVar.zzd().zzc());
        if (zzfydVar.zzc().zza() != 12 && zzfydVar.zzc().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfyg, zzfyd> zzh() {
        return new zzfuz(this, zzfyg.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 3;
    }
}
