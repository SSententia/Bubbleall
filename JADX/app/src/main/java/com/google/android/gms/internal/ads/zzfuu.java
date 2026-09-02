package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuu extends zzftu<zzfxo> {
    zzfuu() {
        super(zzfxo.class, new zzfus(zzftg.class));
    }

    static /* synthetic */ zzftr<zzfxr> zzk(int i, int i2, int i3, int i4, int i5, int i6) {
        zzfxw zzfxwVarZze = zzfxx.zze();
        zzfxz zzfxzVarZzc = zzfya.zzc();
        zzfxzVarZzc.zza(16);
        zzfxwVarZze.zza(zzfxzVarZzc.zzah());
        zzfxwVarZze.zzb(i);
        zzfxx zzfxxVarZzah = zzfxwVarZze.zzah();
        zzgak zzgakVarZze = zzgal.zze();
        zzgan zzganVarZzc = zzgao.zzc();
        zzganVarZzc.zzb(5);
        zzganVarZzc.zza(i4);
        zzgakVarZze.zza(zzganVarZzc.zzah());
        zzgakVarZze.zzb(32);
        zzgal zzgalVarZzah = zzgakVarZze.zzah();
        zzfxq zzfxqVarZze = zzfxr.zze();
        zzfxqVarZze.zza(zzfxxVarZzah);
        zzfxqVarZze.zzb(zzgalVarZzah);
        return new zzftr<>(zzfxqVarZze.zzah(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfxo.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxo zzfxoVar = (zzfxo) zzghiVar;
        zzgdu.zzb(zzfxoVar.zza(), 0);
        new zzfux();
        zzfux.zzl(zzfxoVar.zzc());
        new zzfwx();
        zzfwx.zzl(zzfxoVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzfxr, zzfxo> zzh() {
        return new zzfut(this, zzfxr.class);
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
