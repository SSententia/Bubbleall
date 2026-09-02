package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtf {
    private final zzdtc zza;
    private final AtomicReference<zzbvg> zzb = new AtomicReference<>();

    zzdtf(zzdtc zzdtcVar) {
        this.zza = zzdtcVar;
    }

    private final zzbvg zze() throws RemoteException {
        zzbvg zzbvgVar = this.zzb.get();
        if (zzbvgVar != null) {
            return zzbvgVar;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final void zza(zzbvg zzbvgVar) {
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m258m(this.zzb, null, zzbvgVar);
    }

    public final zzfbi zzb(String str, JSONObject jSONObject) throws zzfaw {
        zzbvj zzbvjVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbvjVarZzb = new zzbwf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzbvjVarZzb = new zzbwf(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbvjVarZzb = new zzbwf(new zzbye());
            } else {
                zzbvg zzbvgVarZze = zze();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbvgVarZze.zzc(string)) {
                            zzbvjVarZzb = zzbvgVarZze.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbvjVarZzb = zzbvgVarZze.zzd(string) ? zzbvgVarZze.zzb(string) : zzbvgVarZze.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Invalid custom event.", e);
                        zzbvjVarZzb = zzbvgVarZze.zzb(str);
                    }
                } else {
                    zzbvjVarZzb = zzbvgVarZze.zzb(str);
                }
            }
            zzfbi zzfbiVar = new zzfbi(zzbvjVarZzb);
            this.zza.zza(str, zzfbiVar);
            return zzfbiVar;
        } catch (Throwable th) {
            throw new zzfaw(th);
        }
    }

    public final zzbxn zzc(String str) throws RemoteException {
        zzbxn zzbxnVarZzf = zze().zzf(str);
        this.zza.zzb(str, zzbxnVarZzf);
        return zzbxnVarZzf;
    }

    public final boolean zzd() {
        return this.zzb.get() != null;
    }
}
