package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo extends ConnectivityManager.NetworkCallback {
    zzo(zzs zzsVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (zzs.class) {
            boolean unused = zzs.zzd = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzs.class) {
            boolean unused = zzs.zzd = false;
        }
    }
}
