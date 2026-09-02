package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxk {
    private final Context zzf;
    private final WeakReference<Context> zzg;
    private final zzdtf zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvr zzl;
    private final zzcgz zzm;
    private final zzdht zzo;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzchl<Boolean> zze = new zzchl<>();
    private final Map<String, zzbrl> zzn = new ConcurrentHashMap();
    private boolean zzp = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();

    public zzdxk(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzdtf zzdtfVar, ScheduledExecutorService scheduledExecutorService, zzdvr zzdvrVar, zzcgz zzcgzVar, zzdht zzdhtVar) {
        this.zzh = zzdtfVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdvrVar;
        this.zzm = zzcgzVar;
        this.zzo = zzdhtVar;
        zzu("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* synthetic */ boolean zza(zzdxk zzdxkVar, boolean z) {
        zzdxkVar.zzc = true;
        return true;
    }

    static /* synthetic */ void zzk(final zzdxk zzdxkVar, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final Object obj = new Object();
                final zzchl zzchlVar = new zzchl();
                zzfsm zzfsmVarZzh = zzfsd.zzh(zzchlVar, ((Long) zzbet.zzc().zzc(zzbjl.zzbj)).longValue(), TimeUnit.SECONDS, zzdxkVar.zzk);
                zzdxkVar.zzl.zza(next);
                zzdxkVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
                Iterator<String> it = itKeys;
                zzfsmVarZzh.zze(new Runnable(zzdxkVar, obj, zzchlVar, next, jElapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzdxd
                    private final zzdxk zza;
                    private final Object zzb;
                    private final zzchl zzc;
                    private final String zzd;
                    private final long zze;

                    {
                        this.zza = zzdxkVar;
                        this.zzb = obj;
                        this.zzc = zzchlVar;
                        this.zzd = next;
                        this.zze = jElapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzp(this.zzb, this.zzc, this.zzd, this.zze);
                    }
                }, zzdxkVar.zzi);
                arrayList.add(zzfsmVarZzh);
                final zzdxj zzdxjVar = new zzdxj(zzdxkVar, obj, next, jElapsedRealtime, zzchlVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzbrv(strOptString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdxkVar.zzu(next, false, "", 0);
                try {
                    try {
                        final zzfbi zzfbiVarZzb = zzdxkVar.zzh.zzb(next, new JSONObject());
                        zzdxkVar.zzj.execute(new Runnable(zzdxkVar, zzfbiVarZzb, zzdxjVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzdxf
                            private final zzdxk zza;
                            private final zzfbi zzb;
                            private final zzbrp zzc;
                            private final List zzd;
                            private final String zze;

                            {
                                this.zza = zzdxkVar;
                                this.zzb = zzfbiVarZzb;
                                this.zzc = zzdxjVar;
                                this.zzd = arrayList2;
                                this.zze = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
                            }
                        });
                    } catch (zzfaw unused2) {
                        zzdxjVar.zzf("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzcgt.zzg("", e);
                }
                itKeys = it;
            }
            zzfsd.zzm(arrayList).zza(new Callable(zzdxkVar) { // from class: com.google.android.gms.internal.ads.zzdxe
                private final zzdxk zza;

                {
                    this.zza = zzdxkVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzo();
                    return null;
                }
            }, zzdxkVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
        }
    }

    private final synchronized zzfsm<String> zzt() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzfsd.zza(strZzd);
        }
        final zzchl zzchlVar = new zzchl();
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzp(new Runnable(this, zzchlVar) { // from class: com.google.android.gms.internal.ads.zzdxb
            private final zzdxk zza;
            private final zzchl zzb;

            {
                this.zza = this;
                this.zzb = zzchlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr(this.zzb);
            }
        });
        return zzchlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbrl(str, z, i, str2));
    }

    public final void zzg() {
        this.zzp = false;
    }

    public final void zzh(final zzbrs zzbrsVar) {
        this.zze.zze(new Runnable(this, zzbrsVar) { // from class: com.google.android.gms.internal.ads.zzdwz
            private final zzdxk zza;
            private final zzbrs zzb;

            {
                this.zza = this;
                this.zzb = zzbrsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdxk zzdxkVar = this.zza;
                try {
                    this.zzb.zzb(zzdxkVar.zzj());
                } catch (RemoteException e) {
                    zzcgt.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzi() {
        if (!zzblc.zza.zze().booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzbet.zzc().zzc(zzbjl.zzbi)).intValue() && this.zzp) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzd();
                    this.zzo.zzd();
                    this.zze.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdxa
                        private final zzdxk zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzs();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfsm<String> zzfsmVarZzt = zzt();
                    this.zzk.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdxc
                        private final zzdxk zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzq();
                        }
                    }, ((Long) zzbet.zzc().zzc(zzbjl.zzbk)).longValue(), TimeUnit.SECONDS);
                    zzfsd.zzp(zzfsmVarZzt, new zzdxi(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzu("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final List<zzbrl> zzj() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbrl zzbrlVar = this.zzn.get(str);
            arrayList.add(new zzbrl(str, zzbrlVar.zzb, zzbrlVar.zzc, zzbrlVar.zzd));
        }
        return arrayList;
    }

    public final boolean zzm() {
        return this.zzb;
    }

    final /* synthetic */ void zzn(zzfbi zzfbiVar, zzbrp zzbrpVar, List list, String str) {
        try {
            try {
                Context context = this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfbiVar.zzy(context, zzbrpVar, list);
            } catch (RemoteException e) {
                zzcgt.zzg("", e);
            }
        } catch (zzfaw unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbrpVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ Object zzo() throws Exception {
        this.zze.zzc(true);
        return null;
    }

    final /* synthetic */ void zzp(Object obj, zzchl zzchlVar, String str, long j) {
        synchronized (obj) {
            if (!zzchlVar.isDone()) {
                zzu(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzchlVar.zzc(false);
            }
        }
    }

    final /* synthetic */ void zzq() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzu("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zzd));
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzr(final zzchl zzchlVar) {
        this.zzi.execute(new Runnable(this, zzchlVar) { // from class: com.google.android.gms.internal.ads.zzdxg
            private final zzdxk zza;
            private final zzchl zzb;

            {
                this.zza = this;
                this.zzb = zzchlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzchl zzchlVar2 = this.zzb;
                String strZzd = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzd();
                if (TextUtils.isEmpty(strZzd)) {
                    zzchlVar2.zzd(new Exception());
                } else {
                    zzchlVar2.zzc(strZzd);
                }
            }
        });
    }

    final /* synthetic */ void zzs() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }
}
