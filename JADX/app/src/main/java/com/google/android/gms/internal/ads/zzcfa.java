package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcfa {
    private final AtomicReference<ExecutorService> zzb = new AtomicReference<>(null);
    private final Object zzc = new Object();
    private String zzd = null;
    private String zze = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference<Object> zzg = new AtomicReference<>(null);
    private final AtomicReference<Object> zzh = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> zzi = new ConcurrentHashMap(9);
    private final AtomicReference<zzcod> zzj = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> zzk = new ArrayBlockingQueue(20);
    private final Object zzl = new Object();

    private final void zzA(String str, boolean z) {
        if (this.zza.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final ExecutorService zzB() {
        ExecutorService threadPoolExecutor;
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfkz.zza().zza(((Integer) zzbet.zzc().zzc(zzbjl.zzab)).intValue(), new zzcex(this), 2);
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbet.zzc().zzc(zzbjl.zzab)).intValue(), ((Integer) zzbet.zzc().zzc(zzbjl.zzab)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcex(this));
            }
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m258m(this.zzb, null, threadPoolExecutor);
        }
        return this.zzb.get();
    }

    private final boolean zzC(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m258m(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzA("getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zzD(final String str, final zzcez zzcezVar) {
        synchronized (this.zzj) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, zzcezVar, str) { // from class: com.google.android.gms.internal.ads.zzcen
                private final zzcfa zza;
                private final zzcez zzb;
                private final String zzc;

                {
                    this.zza = this;
                    this.zzb = zzcezVar;
                    this.zzc = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(this.zzb, this.zzc);
                }
            }, null);
            if (this.zzj.get() != null) {
                futureTask.run();
            } else {
                this.zzk.offer(futureTask);
            }
        }
    }

    private final <T> T zzE(String str, T t, zzcey<T> zzceyVar) {
        synchronized (this.zzj) {
            if (this.zzj.get() != null) {
                try {
                    return zzceyVar.zza(this.zzj.get());
                } catch (Exception unused) {
                    zzA(str, false);
                }
            }
            return t;
        }
    }

    static final boolean zzv(Context context) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzac)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzbet.zzc().zzc(zzbjl.zzad)).intValue()) {
            return false;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzae)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzw(Context context, final String str, String str2, Bundle bundle) {
        if (zzb(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String strValueOf = String.valueOf(str2);
                com.google.android.gms.ads.internal.util.zze.zzg(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzv(context)) {
                zzD("logEventInternal", new zzcez(str, bundle2) { // from class: com.google.android.gms.internal.ads.zzcem
                    private final String zza;
                    private final Bundle zzb;

                    {
                        this.zza = str;
                        this.zzb = bundle2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcez
                    public final void zza(zzcod zzcodVar) throws RemoteException {
                        zzcodVar.zzd("am", this.zza, this.zzb);
                    }
                });
                return;
            }
            if (zzC(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method declaredMethod = this.zzi.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzA("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzA("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzx(Context context, String str) {
        Method method = this.zzi.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzi.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzA(str, false);
            return null;
        }
    }

    private final void zzy(Context context, String str, String str2) {
        if (zzC(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method declaredMethod = this.zzi.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzi.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzA(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            } catch (Exception unused2) {
                zzA(str2, false);
            }
        }
    }

    private final Object zzz(String str, Context context) {
        if (!zzC(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return null;
        }
        try {
            return zzx(context, str).invoke(this.zzg.get(), new Object[0]);
        } catch (Exception unused) {
            zzA(str, true);
            return null;
        }
    }

    public final boolean zza() {
        synchronized (this.zzl) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean zzb(Context context) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzV)).booleanValue() && !this.zza.get()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaf)).booleanValue()) {
                return true;
            }
            if (this.zzf.get() == -1) {
                zzber.zza();
                if (zzcgm.zzn(context, 12451000)) {
                    this.zzf.set(1);
                } else {
                    zzber.zza();
                    if (zzcgm.zzo(context)) {
                        com.google.android.gms.ads.internal.util.zze.zzi("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzf.set(0);
                    } else {
                        this.zzf.set(1);
                    }
                }
            }
            if (this.zzf.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void zzc(Context context, zzbim zzbimVar) {
        zzcfb.zzd(context).zzb().zzc(zzbimVar);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzah)).booleanValue() && zzb(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzd(Context context, zzbdg zzbdgVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzah)).booleanValue() && zzb(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zze(final Bundle bundle) {
        zzD("setConsent", new zzcez(bundle) { // from class: com.google.android.gms.internal.ads.zzcej
            private final Bundle zza;

            {
                this.zza = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzcez
            public final void zza(zzcod zzcodVar) throws RemoteException {
                zzcodVar.zzp(this.zza);
            }
        });
    }

    public final void zzf(Context context, final String str) {
        if (zzb(context)) {
            if (zzv(context)) {
                zzD("beginAdUnitExposure", new zzcez(str) { // from class: com.google.android.gms.internal.ads.zzcep
                    private final String zza;

                    {
                        this.zza = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcez
                    public final void zza(zzcod zzcodVar) throws RemoteException {
                        zzcodVar.zzn(this.zza);
                    }
                });
            } else {
                zzy(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzg(Context context, final String str) {
        if (zzb(context)) {
            if (zzv(context)) {
                zzD("endAdUnitExposure", new zzcez(str) { // from class: com.google.android.gms.internal.ads.zzceq
                    private final String zza;

                    {
                        this.zza = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcez
                    public final void zza(zzcod zzcodVar) throws RemoteException {
                        zzcodVar.zzo(this.zza);
                    }
                });
            } else {
                zzy(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String zzh(Context context) {
        if (!zzb(context)) {
            return "";
        }
        if (zzv(context)) {
            return (String) zzE("getCurrentScreenNameOrScreenClass", "", zzcer.zza);
        }
        if (!zzC(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return "";
        }
        try {
            String str = (String) zzx(context, "getCurrentScreenName").invoke(this.zzg.get(), new Object[0]);
            if (str == null) {
                str = (String) zzx(context, "getCurrentScreenClass").invoke(this.zzg.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            zzA("getCurrentScreenName", false);
            return "";
        }
    }

    @Deprecated
    public final void zzi(final Context context, final String str) {
        if (zzb(context) && (context instanceof Activity)) {
            if (zzv(context)) {
                zzD("setScreenName", new zzcez(context, str) { // from class: com.google.android.gms.internal.ads.zzces
                    private final Context zza;
                    private final String zzb;

                    {
                        this.zza = context;
                        this.zzb = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcez
                    public final void zza(zzcod zzcodVar) throws RemoteException {
                        Context context2 = this.zza;
                        zzcodVar.zzq(ObjectWrapper.wrap(context2), this.zzb, context2.getPackageName());
                    }
                });
                return;
            }
            if (zzC(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
                Method declaredMethod = this.zzi.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.zzi.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        zzA("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    zzA("setCurrentScreen", false);
                }
            }
        }
    }

    public final String zzj(Context context) {
        if (!zzb(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zzd = (String) zzE("getGmpAppId", this.zzd, zzcet.zza);
            } else {
                this.zzd = (String) zzz("getGmpAppId", context);
            }
            return this.zzd;
        }
    }

    public final String zzk(final Context context) {
        if (!zzb(context)) {
            return null;
        }
        long jLongValue = ((Long) zzbet.zzc().zzc(zzbjl.zzaa)).longValue();
        if (zzv(context)) {
            try {
                return jLongValue < 0 ? (String) zzE("getAppInstanceId", null, zzceu.zza) : (String) zzB().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcev
                    private final zzcfa zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzu();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) zzz("getAppInstanceId", context);
        }
        try {
            return (String) zzB().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzcew
                private final zzcfa zza;
                private final Context zzb;

                {
                    this.zza = this;
                    this.zzb = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzt(this.zzb);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzl(Context context) {
        if (!zzb(context)) {
            return null;
        }
        if (zzv(context)) {
            Long l = (Long) zzE("getAdEventId", null, zzcek.zza);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objZzz = zzz("generateEventId", context);
        if (objZzz != null) {
            return objZzz.toString();
        }
        return null;
    }

    public final String zzm(Context context) {
        if (!zzb(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zze;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zze = (String) zzE("getAppIdOrigin", this.zze, zzcel.zza);
            } else {
                this.zze = "fa";
            }
            return this.zze;
        }
    }

    public final void zzn(Context context, String str) {
        zzw(context, "_ac", str, null);
    }

    public final void zzo(Context context, String str) {
        zzw(context, "_ai", str, null);
    }

    public final void zzp(Context context, String str) {
        zzw(context, "_aq", str, null);
    }

    public final void zzq(Context context, String str) {
        zzw(context, "_aa", str, null);
    }

    public final void zzr(Context context, String str, String str2, String str3, int i) {
        if (zzb(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzw(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    final /* synthetic */ void zzs(zzcez zzcezVar, String str) {
        if (this.zzj.get() != null) {
            try {
                zzcezVar.zza(this.zzj.get());
            } catch (Exception unused) {
                zzA(str, false);
            }
        }
    }

    final /* synthetic */ String zzt(Context context) throws Exception {
        return (String) zzz("getAppInstanceId", context);
    }

    final /* synthetic */ String zzu() throws Exception {
        return (String) zzE("getAppInstanceId", null, zzceo.zza);
    }
}
