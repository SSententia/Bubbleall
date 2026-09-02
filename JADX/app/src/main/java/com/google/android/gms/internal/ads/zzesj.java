package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesj implements zzery<zzesh> {
    private final zzfsn zza;
    private final Context zzb;

    public zzesj(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesh> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzesi
            private final zzesj zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    final /* synthetic */ zzesh zzb() throws Exception {
        int networkType;
        int i;
        boolean zIsActiveNetworkMetered;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgd)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzE(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = iOrdinal;
            } else {
                i2 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i = -1;
            zIsActiveNetworkMetered = false;
            i2 = -2;
        }
        return new zzesh(networkOperator, i2, networkType, phoneType, zIsActiveNetworkMetered, i);
    }
}
