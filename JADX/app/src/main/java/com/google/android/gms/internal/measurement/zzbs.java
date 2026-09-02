package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbs {
    private static volatile zzbs zzc;
    protected final Clock zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final AppMeasurementSdk zze;
    private final List<Pair<com.google.android.gms.measurement.internal.zzgq, zzbj>> zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzq zzj;

    protected zzbs(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzV(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = DefaultClock.getInstance();
        this.zzb = zzl.zza().zzb(new zzaw(this), 1);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzhx.zza(context, "google_app_id", zzfh.zza(context)) != null && !zzR()) {
                this.zzi = null;
                this.zzh = true;
                Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (zzV(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        zzS(new zzal(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzbr(this));
        }
    }

    protected static final boolean zzR() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS(zzbh zzbhVar) {
        this.zzb.execute(zzbhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzC(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zzS(new zzbf(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzV(String str, String str2) {
        return (str2 == null || str == null || zzR()) ? false : true;
    }

    public static zzbs zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzbs.class) {
                if (zzc == null) {
                    zzc = new zzbs(context, str, str2, str3, bundle);
                }
            }
        }
        return zzc;
    }

    public final String zzA() {
        zzn zznVar = new zzn();
        zzS(new zzas(this, zznVar));
        return zznVar.zzc(500L);
    }

    public final Map<String, Object> zzB(String str, String str2, boolean z) {
        zzn zznVar = new zzn();
        zzS(new zzat(this, str, str2, z, zznVar));
        Bundle bundleZzd = zznVar.zzd(5000L);
        if (bundleZzd == null || bundleZzd.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZzd.size());
        for (String str3 : bundleZzd.keySet()) {
            Object obj = bundleZzd.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzC(int i, String str, Object obj, Object obj2, Object obj3) {
        zzS(new zzau(this, false, 5, str, obj, null, null));
    }

    public final Bundle zzD(Bundle bundle, boolean z) {
        zzn zznVar = new zzn();
        zzS(new zzav(this, bundle, zznVar));
        if (z) {
            return zznVar.zzd(5000L);
        }
        return null;
    }

    public final int zzE(String str) {
        zzn zznVar = new zzn();
        zzS(new zzax(this, str, zznVar));
        Integer num = (Integer) zzn.zze(zznVar.zzd(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String zzF() {
        zzn zznVar = new zzn();
        zzS(new zzay(this, zznVar));
        return zznVar.zzc(120000L);
    }

    public final String zzG() {
        return this.zzi;
    }

    public final Object zzH(int i) {
        zzn zznVar = new zzn();
        zzS(new zzaz(this, zznVar, i));
        return zzn.zze(zznVar.zzd(15000L), Object.class);
    }

    public final void zzI(boolean z) {
        zzS(new zzba(this, z));
    }

    public final void zzJ(Bundle bundle) {
        zzS(new zzbb(this, bundle));
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    protected final zzq zzc(Context context, boolean z) {
        try {
            return zzp.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zzT(e, true, false);
            return null;
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzgp zzgpVar) {
        zzbi zzbiVar = new zzbi(zzgpVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzbiVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzS(new zzbc(this, zzbiVar));
    }

    public final void zze(com.google.android.gms.measurement.internal.zzgq zzgqVar) {
        Preconditions.checkNotNull(zzgqVar);
        synchronized (this.zzf) {
            for (int i = 0; i < this.zzf.size(); i++) {
                if (zzgqVar.equals(this.zzf.get(i).first)) {
                    Log.w(this.zzd, "OnEventListener already registered.");
                    return;
                }
            }
            zzbj zzbjVar = new zzbj(zzgqVar);
            this.zzf.add(new Pair<>(zzgqVar, zzbjVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzbjVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzS(new zzbd(this, zzbjVar));
        }
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzgq zzgqVar) {
        Pair<com.google.android.gms.measurement.internal.zzgq, zzbj> pair;
        Preconditions.checkNotNull(zzgqVar);
        synchronized (this.zzf) {
            int i = 0;
            while (true) {
                if (i >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzgqVar.equals(this.zzf.get(i).first)) {
                        pair = this.zzf.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzbj zzbjVar = (zzbj) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzbjVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzS(new zzbe(this, zzbjVar));
        }
    }

    public final void zzg(String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzh(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }

    public final void zzi(String str, String str2, Bundle bundle, long j) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zzj(String str, String str2, Object obj, boolean z) {
        zzS(new zzbg(this, str, str2, obj, z));
    }

    public final void zzk(Bundle bundle) {
        zzS(new zzab(this, bundle));
    }

    public final void zzl(String str, String str2, Bundle bundle) {
        zzS(new zzac(this, str, str2, bundle));
    }

    public final List<Bundle> zzm(String str, String str2) {
        zzn zznVar = new zzn();
        zzS(new zzad(this, str, str2, zznVar));
        List<Bundle> list = (List) zzn.zze(zznVar.zzd(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void zzn(String str) {
        zzS(new zzae(this, str));
    }

    public final void zzo(Activity activity, String str, String str2) {
        zzS(new zzaf(this, activity, str, str2));
    }

    public final void zzp(Boolean bool) {
        zzS(new zzag(this, bool));
    }

    public final void zzq(Bundle bundle) {
        zzS(new zzah(this, bundle));
    }

    public final void zzr(Bundle bundle) {
        zzS(new zzai(this, bundle));
    }

    public final void zzs() {
        zzS(new zzaj(this));
    }

    public final void zzt(long j) {
        zzS(new zzak(this, j));
    }

    public final void zzu(String str) {
        zzS(new zzam(this, str));
    }

    public final void zzv(String str) {
        zzS(new zzan(this, str));
    }

    public final String zzw() {
        zzn zznVar = new zzn();
        zzS(new zzao(this, zznVar));
        return zznVar.zzc(500L);
    }

    public final String zzx() {
        zzn zznVar = new zzn();
        zzS(new zzap(this, zznVar));
        return zznVar.zzc(50L);
    }

    public final long zzy() {
        zzn zznVar = new zzn();
        zzS(new zzaq(this, zznVar));
        Long l = (Long) zzn.zze(zznVar.zzd(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return jNextLong + ((long) i);
    }

    public final String zzz() {
        zzn zznVar = new zzn();
        zzS(new zzar(this, zznVar));
        return zznVar.zzc(500L);
    }
}
