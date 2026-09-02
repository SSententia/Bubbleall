package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftv {
    private final zzgbc zza;

    private zzftv(zzgbc zzgbcVar) {
        this.zza = zzgbcVar;
    }

    static final zzftv zza(zzgbc zzgbcVar) throws GeneralSecurityException {
        if (zzgbcVar == null || zzgbcVar.zzd() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzftv(zzgbcVar);
    }

    public final String toString() {
        return zzfun.zza(this.zza).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P zzb(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsZzn = zzfum.zzn(cls);
        if (clsZzn == null) {
            String strValueOf = String.valueOf(cls.getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No wrapper found for ".concat(strValueOf) : new String("No wrapper found for "));
        }
        zzfun.zzb(this.zza);
        zzfud zzfudVarZzb = zzfud.zzb(clsZzn);
        for (zzgbb zzgbbVar : this.zza.zzc()) {
            if (zzgbbVar.zzf() == 3) {
                zzfua zzfuaVarZzd = zzfudVarZzb.zzd(zzfum.zzk(zzgbbVar.zzc(), clsZzn), zzgbbVar);
                if (zzgbbVar.zzd() == this.zza.zza()) {
                    zzfudVarZzb.zzc(zzfuaVarZzd);
                }
            }
        }
        return (P) zzfum.zzl(zzfudVarZzb, cls);
    }
}
