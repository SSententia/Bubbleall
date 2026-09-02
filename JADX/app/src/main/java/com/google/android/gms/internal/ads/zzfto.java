package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzfto<PrimitiveT, KeyProtoT extends zzghi> implements zzftm<PrimitiveT> {
    private final zzftu<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzfto(zzftu<KeyProtoT> zzftuVar, Class<PrimitiveT> cls) {
        if (!zzftuVar.zzf().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzftuVar.toString(), cls.getName()));
        }
        this.zza = zzftuVar;
        this.zzb = cls;
    }

    private final PrimitiveT zzg(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zzd(keyprotot);
        return (PrimitiveT) this.zza.zze(keyprotot, this.zzb);
    }

    private final zzftn<?, KeyProtoT> zzh() {
        return new zzftn<>(this.zza.zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final PrimitiveT zza(zzgex zzgexVar) throws GeneralSecurityException {
        try {
            return zzg(this.zza.zzc(zzgexVar));
        } catch (zzggm e) {
            String strValueOf = String.valueOf(this.zza.zza().getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "Failures parsing proto of type ".concat(strValueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final PrimitiveT zzb(zzghi zzghiVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(this.zza.zza().getName());
        String strConcat = strValueOf.length() != 0 ? "Expected proto of type ".concat(strValueOf) : new String("Expected proto of type ");
        if (this.zza.zza().isInstance(zzghiVar)) {
            return zzg(zzghiVar);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzghi zzc(zzgex zzgexVar) throws GeneralSecurityException {
        try {
            return zzh().zza(zzgexVar);
        } catch (zzggm e) {
            String strValueOf = String.valueOf(this.zza.zzh().zza().getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "Failures parsing proto of type ".concat(strValueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final String zzd() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Class<PrimitiveT> zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzgar zzf(zzgex zzgexVar) throws GeneralSecurityException {
        try {
            zzghi zzghiVarZza = zzh().zza(zzgexVar);
            zzgaq zzgaqVarZzd = zzgar.zzd();
            zzgaqVarZzd.zza(this.zza.zzb());
            zzgaqVarZzd.zzb(zzghiVarZza.zzan());
            zzgaqVarZzd.zzc(this.zza.zzi());
            return zzgaqVarZzd.zzah();
        } catch (zzggm e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
