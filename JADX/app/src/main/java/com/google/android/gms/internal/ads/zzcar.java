package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import androidx.media2.session.MediaConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcar implements zzcat {
    static zzcat zza;
    static zzcat zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcgz zzh;
    private final Object zzd = new Object();
    private final WeakHashMap<Thread, Boolean> zzf = new WeakHashMap<>();

    protected zzcar(Context context, zzcgz zzcgzVar) {
        zzfkz.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcgzVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    public static zzcat zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (zzblf.zze.zze().booleanValue()) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfz)).booleanValue()) {
                        zza = new zzcas();
                    } else {
                        zza = new zzcar(context, zzcgz.zza());
                    }
                } else {
                    zza = new zzcas();
                }
            }
        }
        return zza;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x006e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0044, B:20:0x0053, B:21:0x0054, B:22:0x0063, B:23:0x006a, B:14:0x0039, B:15:0x0043), top: B:31:0x0003, inners: #0 }] */
    public static zzcat zzb(Context context, zzcgz zzcgzVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (zzblf.zze.zze().booleanValue()) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfz)).booleanValue()) {
                        zzb = new zzcas();
                    } else {
                        zzcar zzcarVar = new zzcar(context, zzcgzVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzcarVar.zzd) {
                                zzcarVar.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzcaq(zzcarVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzcap(zzcarVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzcarVar;
                    }
                } else {
                    zzb = new zzcas();
                }
            }
        }
        return zzb;
    }

    protected final void zzc(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzi = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzi |= zzcgm.zzi(stackTraceElement.getClassName());
                    zEquals |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzi || zEquals) {
                return;
            }
            zze(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zze(Throwable th, String str, float f) {
        boolean zIsCallerInstantApp;
        String packageName;
        if (zzcgm.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzged.zzc(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzcgt.zzg("Error fetching instant app info", th2);
                zIsCallerInstantApp = false;
            }
            try {
                packageName = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcgt.zzi("Cannot obtain package name, proceeding.");
                packageName = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter(MediaConstants.MEDIA_URI_QUERY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String string2 = Build.MODEL;
            if (!string2.startsWith(str2)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                sb.append(str2);
                sb.append(" ");
                sb.append(string2);
                string2 = sb.toString();
            }
            arrayList.add(builderAppendQueryParameter.appendQueryParameter("device", string2).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", string).appendQueryParameter("eids", TextUtils.join(",", zzbjl.zzc())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "407425155").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzblf.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1").toString());
            for (final String str3 : arrayList) {
                final zzcgy zzcgyVar = new zzcgy(null);
                this.zzg.execute(new Runnable(zzcgyVar, str3) { // from class: com.google.android.gms.internal.ads.zzcao
                    private final zzcgy zza;
                    private final String zzb;

                    {
                        this.zza = zzcgyVar;
                        this.zzb = str3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(this.zzb);
                    }
                });
            }
        }
    }
}
