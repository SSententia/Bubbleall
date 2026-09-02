package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbm implements Executor {
    private final Handler zza;

    private zzbm(Handler handler) {
        this.zza = handler;
    }

    static Executor zza(Handler handler) {
        return new zzbm(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
