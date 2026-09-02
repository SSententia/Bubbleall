package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsr extends zzfqw.zzj<Void> implements Runnable {
    private final Runnable zza;

    public zzfsr(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final String zzc() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzq(th);
            zzfmk.zza(th);
            throw new RuntimeException(th);
        }
    }
}
