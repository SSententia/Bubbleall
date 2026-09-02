package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvn implements Runnable {
    final /* synthetic */ zzwc zza;
    final /* synthetic */ zzvo zzb;

    zzvn(zzvo zzvoVar, zzwc zzwcVar) {
        this.zzb = zzvoVar;
        this.zza = zzwcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
