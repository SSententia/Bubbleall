package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoa implements zzery<zzeob> {
    private final zzfsn zza;
    private final Context zzb;

    public zzeoa(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeob> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzenz
            private final zzeoa zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    final /* synthetic */ zzeob zzb() throws Exception {
        double intExtra;
        Intent intentRegisterReceiver = this.zzb.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            int intExtra2 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            intExtra = ((double) intentRegisterReceiver.getIntExtra("level", -1)) / ((double) intentRegisterReceiver.getIntExtra("scale", -1));
            if (intExtra2 == 2 || intExtra2 == 5) {
                z = true;
            }
        } else {
            intExtra = -1.0d;
        }
        return new zzeob(intExtra, z);
    }
}
