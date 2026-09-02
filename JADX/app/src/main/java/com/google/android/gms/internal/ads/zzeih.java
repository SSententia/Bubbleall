package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeih implements Runnable {
    private final zzdsw zza;

    private zzeih(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    static Runnable zza(zzdsw zzdswVar) {
        return new zzeih(zzdswVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
