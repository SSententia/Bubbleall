package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflc {
    public static <V> zzfsm<V> zza(Task<V> task) {
        final zzfsu zzfsuVarZza = zzfsu.zza();
        task.addOnCompleteListener(zzfst.zza(), new OnCompleteListener(zzfsuVarZza) { // from class: com.google.android.gms.internal.ads.zzflb
            private final zzfsu zza;

            {
                this.zza = zzfsuVarZza;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfsu zzfsuVar = this.zza;
                if (task2.isCanceled()) {
                    zzfsuVar.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfsuVar.zzp(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfsuVar.zzq(exception);
            }
        });
        return zzfsuVarZza;
    }
}
