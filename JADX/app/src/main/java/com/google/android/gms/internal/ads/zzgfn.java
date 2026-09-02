package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfq;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgfn<T extends zzgfq<T>> {
    zzgfn() {
    }

    abstract boolean zza(zzghi zzghiVar);

    abstract zzgfr<T> zzb(Object obj);

    abstract zzgfr<T> zzc(Object obj);

    abstract void zzd(Object obj);

    abstract <UT, UB> UB zze(zzght zzghtVar, Object obj, zzgfm zzgfmVar, zzgfr<T> zzgfrVar, UB ub, zzgio<UT, UB> zzgioVar) throws IOException;

    abstract Object zzf(zzgfm zzgfmVar, zzghi zzghiVar, int i);

    abstract void zzg(zzght zzghtVar, Object obj, zzgfm zzgfmVar, zzgfr<T> zzgfrVar) throws IOException;

    abstract void zzh(zzgex zzgexVar, Object obj, zzgfm zzgfmVar, zzgfr<T> zzgfrVar) throws IOException;
}
