package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhr implements Runnable {
    zzfhr() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfhu.zzc != null) {
            zzfhu.zzc.post(zzfhu.zzj);
            zzfhu.zzc.postDelayed(zzfhu.zzk, 200L);
        }
    }
}
