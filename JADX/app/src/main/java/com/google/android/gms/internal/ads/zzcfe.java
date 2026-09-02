package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfe implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcfg zza;
    private final String zzb;

    public zzcfe(zzcfg zzcfgVar, String str) {
        this.zza = zzcfgVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            Iterator it = this.zza.zzb.iterator();
            while (it.hasNext()) {
                ((zzcff) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
