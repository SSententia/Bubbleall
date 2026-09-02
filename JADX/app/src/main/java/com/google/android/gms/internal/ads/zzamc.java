package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamc extends PhoneStateListener {
    final /* synthetic */ zzamd zza;

    /* synthetic */ zzamc(zzamd zzamdVar, zzama zzamaVar) {
        this.zza = zzamdVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        zzamd.zzd(this.zza, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String string = serviceState == null ? "" : serviceState.toString();
        zzamd.zzd(this.zza, true != (string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
