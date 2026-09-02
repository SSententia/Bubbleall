package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghm<T> implements zzghz<T> {
    private final zzghi zza;
    private final zzgio<?, ?> zzb;
    private final boolean zzc;
    private final zzgfn<?> zzd;

    private zzghm(zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghi zzghiVar) {
        this.zzb = zzgioVar;
        this.zzc = zzgfnVar.zza(zzghiVar);
        this.zzd = zzgfnVar;
        this.zza = zzghiVar;
    }

    static <T> zzghm<T> zzg(zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghi zzghiVar) {
        return new zzghm<>(zzgioVar, zzgfnVar, zzghiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final T zza() {
        return (T) this.zza.zzaM().zzak();
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzj(t).equals(this.zzb.zzj(t2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(t);
        this.zzd.zzb(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zzc(T t) {
        int iHashCode = this.zzb.zzj(t).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzd(T t, T t2) {
        zzgib.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzgib.zzE(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zze(T t) {
        zzgio<?, ?> zzgioVar = this.zzb;
        int iZzp = zzgioVar.zzp(zzgioVar.zzj(t));
        if (!this.zzc) {
            return iZzp;
        }
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzf(T t, zzght zzghtVar, zzgfm zzgfmVar) throws IOException {
        boolean zZzd;
        zzgio<?, ?> zzgioVar = this.zzb;
        zzgfn<?> zzgfnVar = this.zzd;
        Object objZzk = zzgioVar.zzk(t);
        zzgfr<T> zzgfrVarZzc = zzgfnVar.zzc(t);
        while (zzghtVar.zzb() != Integer.MAX_VALUE) {
            try {
                int iZzc = zzghtVar.zzc();
                if (iZzc != 11) {
                    if ((iZzc & 7) == 2) {
                        Object objZzf = zzgfnVar.zzf(zzgfmVar, this.zza, iZzc >>> 3);
                        if (objZzf != null) {
                            zzgfnVar.zzg(zzghtVar, objZzf, zzgfmVar, zzgfrVarZzc);
                        } else {
                            zZzd = zzgioVar.zzn(objZzk, zzghtVar);
                        }
                    } else {
                        zZzd = zzghtVar.zzd();
                    }
                    if (!zZzd) {
                        zzgioVar.zzl(t, objZzk);
                        return;
                    }
                } else {
                    Object objZzf2 = null;
                    int iZzr = 0;
                    zzgex zzgexVarZzq = null;
                    while (zzghtVar.zzb() != Integer.MAX_VALUE) {
                        int iZzc2 = zzghtVar.zzc();
                        if (iZzc2 == 16) {
                            iZzr = zzghtVar.zzr();
                            objZzf2 = zzgfnVar.zzf(zzgfmVar, this.zza, iZzr);
                        } else if (iZzc2 == 26) {
                            if (objZzf2 != null) {
                                zzgfnVar.zzg(zzghtVar, objZzf2, zzgfmVar, zzgfrVarZzc);
                            } else {
                                zzgexVarZzq = zzghtVar.zzq();
                            }
                        } else if (!zzghtVar.zzd()) {
                            break;
                        }
                    }
                    if (zzghtVar.zzc() != 12) {
                        throw zzggm.zzh();
                    }
                    if (zzgexVarZzq != null) {
                        if (objZzf2 != null) {
                            zzgfnVar.zzh(zzgexVarZzq, objZzf2, zzgfmVar, zzgfrVarZzc);
                        } else {
                            zzgioVar.zze(objZzk, iZzr, zzgexVarZzq);
                        }
                    }
                }
            } catch (Throwable th) {
                zzgioVar.zzl(t, objZzk);
                throw th;
            }
        }
        zzgioVar.zzl(t, objZzk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzi(T t, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
        zzgga zzggaVar = (zzgga) t;
        if (zzggaVar.zzc == zzgip.zza()) {
            zzggaVar.zzc = zzgip.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzj(T t) {
        this.zzb.zzm(t);
        this.zzd.zzd(t);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzk(T t) {
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzn(T t, zzgfi zzgfiVar) throws IOException {
        this.zzd.zzb(t);
        throw null;
    }
}
