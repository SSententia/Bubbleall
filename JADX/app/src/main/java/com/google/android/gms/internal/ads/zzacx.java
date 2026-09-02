package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacx implements Runnable {
    final /* synthetic */ zzacy zza;

    zzacx(zzacy zzacyVar) {
        this.zza = zzacyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzacy.zza(this.zza);
    }
}
