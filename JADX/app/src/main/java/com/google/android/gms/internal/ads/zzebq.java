package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebq extends zzcba {
    private final Context zza;
    private final Executor zzb;
    private final zzcbu zzc;
    private final zzcrz zzd;
    private final ArrayDeque<zzebn> zze;
    private final zzcbv zzf;
    private final zzebv zzg;

    /* JADX WARN: Multi-variable type inference failed */
    public zzebq(Context context, Context context2, Executor executor, zzcbv zzcbvVar, zzcrz zzcrzVar, zzcbu zzcbuVar, ArrayDeque<zzebn> arrayDeque, zzebv zzebvVar) {
        zzbjl.zza(context);
        this.zza = context;
        this.zzb = context2;
        this.zzf = executor;
        this.zzc = zzcrzVar;
        this.zzd = zzcbvVar;
        this.zze = zzcbuVar;
        this.zzg = arrayDeque;
    }

    private static zzfsm<JSONObject> zzl(zzcbj zzcbjVar, zzfes zzfesVar, final zzesq zzesqVar) {
        zzfrk zzfrkVar = new zzfrk(zzesqVar) { // from class: com.google.android.gms.internal.ads.zzebe
            private final zzesq zza;

            {
                this.zza = zzesqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zza().zza(com.google.android.gms.ads.internal.zzt.zzc().zzl((Bundle) obj));
            }
        };
        return zzfesVar.zze(zzfem.GMS_SIGNALS, zzfsd.zza(zzcbjVar.zza)).zzc(zzfrkVar).zzb(zzebf.zza).zzi();
    }

    private static zzfsm<zzcbm> zzm(zzfsm<JSONObject> zzfsmVar, zzfes zzfesVar, zzbug zzbugVar) {
        return zzfesVar.zze(zzfem.BUILD_URL, zzfsmVar).zzc(zzbugVar.zza("AFMA_getAdDictionary", zzbud.zza, zzebg.zza)).zzi();
    }

    private final void zzn(zzfsm<InputStream> zzfsmVar, zzcbf zzcbfVar) {
        zzfsd.zzp(zzfsd.zzi(zzfsmVar, new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzebk
            private final zzebq zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return zzfsd.zza(zzfbl.zza((InputStream) obj));
            }
        }, zzchg.zza), new zzebm(this, zzcbfVar), zzchg.zzf);
    }

    private final synchronized void zzo() {
        int iIntValue = zzbld.zzc.zze().intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final synchronized void zzp(zzebn zzebnVar) {
        zzo();
        this.zze.addLast(zzebnVar);
    }

    private final synchronized zzebn zzq(String str) {
        Iterator<zzebn> it = this.zze.iterator();
        while (it.hasNext()) {
            zzebn next = it.next();
            if (next.zzc.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private final synchronized zzebn zzr(String str) {
        Iterator<zzebn> it = this.zze.iterator();
        while (it.hasNext()) {
            zzebn next = it.next();
            if (next.zzd.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    public final zzfsm<InputStream> zzb(zzcbj zzcbjVar, int i) {
        zzebn zzebnVarZzr;
        zzbug zzbugVarZza = com.google.android.gms.ads.internal.zzt.zzp().zza(this.zza, zzcgz.zza());
        zzesq zzesqVarZzA = this.zzd.zzA(zzcbjVar, i);
        zzbtw zzbtwVarZza = zzbugVarZza.zza("google.afma.response.normalize", zzebp.zzd, zzbud.zzb);
        zzebx zzebxVar = new zzebx(zzcbjVar.zzg);
        zzebu zzebuVar = new zzebu(this.zza, zzcbjVar.zzb.zza, this.zzf, i, null);
        zzfes zzfesVarZzc = zzesqVarZzA.zzc();
        zzebn zzebnVar = null;
        if (zzbld.zza.zze().booleanValue()) {
            if (zzbld.zzd.zze().booleanValue()) {
                zzebnVarZzr = zzq(zzcbjVar.zzh);
            } else if (!TextUtils.isEmpty(zzcbjVar.zzj)) {
                zzebnVarZzr = zzr(zzcbjVar.zzj);
            } else if (zzebnVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
            zzebnVar = zzebnVarZzr;
            if (zzebnVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbjVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        if (zzebnVar != null) {
            final zzfdy zzfdyVarZzi = zzfesVarZzc.zze(zzfem.HTTP, zzfsd.zza(new zzebw(zzebnVar.zzb, zzebnVar.zza))).zzb(zzebxVar).zzb(zzebuVar).zzi();
            final zzfsm<?> zzfsmVarZza = zzfsd.zza(zzebnVar);
            return zzfesVarZzc.zzf(zzfem.PRE_PROCESS, zzfdyVarZzi, zzfsmVarZza).zza(new Callable(zzfdyVarZzi, zzfsmVarZza) { // from class: com.google.android.gms.internal.ads.zzebd
                private final zzfsm zza;
                private final zzfsm zzb;

                {
                    this.zza = zzfdyVarZzi;
                    this.zzb = zzfsmVarZza;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfsm zzfsmVar = this.zza;
                    zzfsm zzfsmVar2 = this.zzb;
                    return new zzebp((zzebt) zzfsmVar.get(), ((zzebn) zzfsmVar2.get()).zzb, ((zzebn) zzfsmVar2.get()).zza);
                }
            }).zzc(zzbtwVarZza).zzi();
        }
        final zzfsm<JSONObject> zzfsmVarZzl = zzl(zzcbjVar, zzfesVarZzc, zzesqVarZzA);
        final zzfsm<zzcbm> zzfsmVarZzm = zzm(zzfsmVarZzl, zzfesVarZzc, zzbugVarZza);
        final zzfdy zzfdyVarZzi2 = zzfesVarZzc.zzf(zzfem.HTTP, zzfsmVarZzm, zzfsmVarZzl).zza(new Callable(zzfsmVarZzl, zzfsmVarZzm) { // from class: com.google.android.gms.internal.ads.zzebb
            private final zzfsm zza;
            private final zzfsm zzb;

            {
                this.zza = zzfsmVarZzl;
                this.zzb = zzfsmVarZzm;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzebw((JSONObject) this.zza.get(), (zzcbm) this.zzb.get());
            }
        }).zzb(zzebxVar).zzb(zzebuVar).zzi();
        return zzfesVarZzc.zzf(zzfem.PRE_PROCESS, zzfsmVarZzl, zzfsmVarZzm, zzfdyVarZzi2).zza(new Callable(zzfdyVarZzi2, zzfsmVarZzl, zzfsmVarZzm) { // from class: com.google.android.gms.internal.ads.zzebc
            private final zzfsm zza;
            private final zzfsm zzb;
            private final zzfsm zzc;

            {
                this.zza = zzfdyVarZzi2;
                this.zzb = zzfsmVarZzl;
                this.zzc = zzfsmVarZzm;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzebp((zzebt) this.zza.get(), (JSONObject) this.zzb.get(), (zzcbm) this.zzc.get());
            }
        }).zzc(zzbtwVarZza).zzi();
    }

    public final zzfsm<InputStream> zzc(final zzcbj zzcbjVar, int i) {
        if (!zzbld.zza.zze().booleanValue()) {
            return zzfsd.zzc(new Exception("Split request is disabled."));
        }
        zzfcj zzfcjVar = zzcbjVar.zzi;
        if (zzfcjVar == null) {
            return zzfsd.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfcjVar.zzc == 0 || zzfcjVar.zzd == 0) {
            return zzfsd.zzc(new Exception("Caching is disabled."));
        }
        zzbug zzbugVarZza = com.google.android.gms.ads.internal.zzt.zzp().zza(this.zza, zzcgz.zza());
        zzesq zzesqVarZzA = this.zzd.zzA(zzcbjVar, i);
        zzfes zzfesVarZzc = zzesqVarZzA.zzc();
        final zzfsm<JSONObject> zzfsmVarZzl = zzl(zzcbjVar, zzfesVarZzc, zzesqVarZzA);
        final zzfsm<zzcbm> zzfsmVarZzm = zzm(zzfsmVarZzl, zzfesVarZzc, zzbugVarZza);
        return zzfesVarZzc.zzf(zzfem.GET_URL_AND_CACHE_KEY, zzfsmVarZzl, zzfsmVarZzm).zza(new Callable(this, zzfsmVarZzm, zzfsmVarZzl, zzcbjVar) { // from class: com.google.android.gms.internal.ads.zzebi
            private final zzebq zza;
            private final zzfsm zzb;
            private final zzfsm zzc;
            private final zzcbj zzd;

            {
                this.zza = this;
                this.zzb = zzfsmVarZzm;
                this.zzc = zzfsmVarZzl;
                this.zzd = zzcbjVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(this.zzb, this.zzc, this.zzd);
            }
        }).zzi();
    }

    public final zzfsm<InputStream> zzd(String str) {
        if (!zzbld.zza.zze().booleanValue()) {
            return zzfsd.zzc(new Exception("Split request is disabled."));
        }
        zzebl zzeblVar = new zzebl(this);
        if ((zzbld.zzd.zze().booleanValue() ? zzq(str) : zzr(str)) != null) {
            return zzfsd.zza(zzeblVar);
        }
        String strValueOf = String.valueOf(str);
        return zzfsd.zzc(new Exception(strValueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(strValueOf) : new String("URL to be removed not found for cache key: ")));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzfsm<InputStream> zzfsmVarZzb = zzb(zzcbjVar, Binder.getCallingUid());
        zzn(zzfsmVarZzb, zzcbfVar);
        zzfsmVarZzb.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzebh
            private final zzebq zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzn(zzi(zzcbjVar, Binder.getCallingUid()), zzcbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzn(zzc(zzcbjVar, Binder.getCallingUid()), zzcbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzh(String str, zzcbf zzcbfVar) {
        zzn(zzd(str), zzcbfVar);
    }

    public final zzfsm<InputStream> zzi(zzcbj zzcbjVar, int i) {
        zzbug zzbugVarZza = com.google.android.gms.ads.internal.zzt.zzp().zza(this.zza, zzcgz.zza());
        if (!zzbli.zza.zze().booleanValue()) {
            return zzfsd.zzc(new Exception("Signal collection disabled."));
        }
        zzesq zzesqVarZzA = this.zzd.zzA(zzcbjVar, i);
        final zzesb<JSONObject> zzesbVarZzb = zzesqVarZzA.zzb();
        return zzesqVarZzA.zzc().zze(zzfem.GET_SIGNALS, zzfsd.zza(zzcbjVar.zza)).zzc(new zzfrk(zzesbVarZzb) { // from class: com.google.android.gms.internal.ads.zzebj
            private final zzesb zza;

            {
                this.zza = zzesbVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zza(com.google.android.gms.ads.internal.zzt.zzc().zzl((Bundle) obj));
            }
        }).zzj(zzfem.JS_SIGNALS).zzc(zzbugVarZza.zza("google.afma.request.getSignals", zzbud.zza, zzbud.zzb)).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(zzfsm zzfsmVar, zzfsm zzfsmVar2, zzcbj zzcbjVar) throws Exception {
        String strZzi = ((zzcbm) zzfsmVar.get()).zzi();
        zzp(new zzebn((zzcbm) zzfsmVar.get(), (JSONObject) zzfsmVar2.get(), zzcbjVar.zzh, strZzi));
        return new ByteArrayInputStream(strZzi.getBytes(zzfll.zzc));
    }

    final /* synthetic */ void zzk() {
        zzchj.zza(this.zzc.zza(), "persistFlags");
    }
}
