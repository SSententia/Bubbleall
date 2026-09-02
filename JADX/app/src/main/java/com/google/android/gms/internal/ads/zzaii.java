package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaii extends BroadcastReceiver {
    final /* synthetic */ zzaij zza;

    /* synthetic */ zzaii(zzaij zzaijVar, zzaig zzaigVar) {
        this.zza = zzaijVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler = this.zza.zzb;
        final zzaij zzaijVar = this.zza;
        handler.post(new Runnable(zzaijVar) { // from class: com.google.android.gms.internal.ads.zzaih
            private final zzaij zza;

            {
                this.zza = zzaijVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }
}
