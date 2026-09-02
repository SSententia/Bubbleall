package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfej<O> {
    final /* synthetic */ zzfek zza;
    private final Object zzb;
    private final String zzc;
    private final zzfsm<?> zzd;
    private final List<zzfsm<?>> zze;
    private final zzfsm<O> zzf;

    private zzfej(zzfek zzfekVar, zzfek zzfekVar2, String str, zzfsm zzfsmVar, List<zzfsm> list, zzfsm<O> zzfsmVar2) {
        this.zza = zzfekVar;
        this.zzb = zzfekVar2;
        this.zzc = str;
        this.zzd = zzfsmVar;
        this.zze = list;
        this.zzf = zzfsmVar2;
    }

    public final zzfej<O> zza(String str) {
        return new zzfej<>(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final <O2> zzfej<O2> zzb(final zzfdw<O, O2> zzfdwVar) {
        return zzc(new zzfrk(zzfdwVar) { // from class: com.google.android.gms.internal.ads.zzfee
            private final zzfdw zza;

            {
                this.zza = zzfdwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return zzfsd.zza(this.zza.zza(obj));
            }
        });
    }

    public final <O2> zzfej<O2> zzc(zzfrk<O, O2> zzfrkVar) {
        return zzd(zzfrkVar, this.zza.zzb);
    }

    public final <O2> zzfej<O2> zzd(zzfrk<O, O2> zzfrkVar, Executor executor) {
        return new zzfej<>(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfsd.zzi(this.zzf, zzfrkVar, executor));
    }

    public final <O2> zzfej<O2> zze(final zzfsm<O2> zzfsmVar) {
        return zzd(new zzfrk(zzfsmVar) { // from class: com.google.android.gms.internal.ads.zzfef
            private final zzfsm zza;

            {
                this.zza = zzfsmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza;
            }
        }, zzchg.zzf);
    }

    public final <T extends Throwable> zzfej<O> zzf(Class<T> cls, final zzfdw<T, O> zzfdwVar) {
        return zzg(cls, new zzfrk(zzfdwVar) { // from class: com.google.android.gms.internal.ads.zzfeg
            private final zzfdw zza;

            {
                this.zza = zzfdwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return zzfsd.zza("");
            }
        });
    }

    public final <T extends Throwable> zzfej<O> zzg(Class<T> cls, zzfrk<T, O> zzfrkVar) {
        zzfek zzfekVar = this.zza;
        return new zzfej<>(zzfekVar, this.zzb, this.zzc, this.zzd, this.zze, zzfsd.zzg(this.zzf, cls, zzfrkVar, zzfekVar.zzb));
    }

    public final zzfej<O> zzh(long j, TimeUnit timeUnit) {
        zzfek zzfekVar = this.zza;
        return new zzfej<>(zzfekVar, this.zzb, this.zzc, this.zzd, this.zze, zzfsd.zzh(this.zzf, j, timeUnit, zzfekVar.zzc));
    }

    public final zzfdy zzi() {
        Object obj = this.zzb;
        String strZzg = this.zzc;
        if (strZzg == null) {
            strZzg = this.zza.zzg(obj);
        }
        final zzfdy zzfdyVar = new zzfdy(obj, strZzg, this.zzf);
        this.zza.zzd.zza(zzfdyVar);
        this.zzd.zze(new Runnable(this, zzfdyVar) { // from class: com.google.android.gms.internal.ads.zzfeh
            private final zzfej zza;
            private final zzfdy zzb;

            {
                this.zza = this;
                this.zzb = zzfdyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfej zzfejVar = this.zza;
                zzfejVar.zza.zzd.zzb(this.zzb);
            }
        }, zzchg.zzf);
        zzfsd.zzp(zzfdyVar, new zzfei(this, zzfdyVar), zzchg.zzf);
        return zzfdyVar;
    }

    public final zzfej<O> zzj(Object obj) {
        return this.zza.zze(obj, zzi());
    }
}
