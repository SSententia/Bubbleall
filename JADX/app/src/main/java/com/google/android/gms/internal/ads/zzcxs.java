package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcxs implements zzfrz<zzcxn> {
    final /* synthetic */ zzfrz zza;
    final /* synthetic */ zzcxu zzb;

    zzcxs(zzcxu zzcxuVar, zzfrz zzfrzVar) {
        this.zzb = zzcxuVar;
        this.zza = zzfrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzchg.zze.execute(new Runnable(this.zzb) { // from class: com.google.android.gms.internal.ads.zzcxr
            private final zzcxu zza;

            {
                this.zza = zzcxuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcxn zzcxnVar) {
        zzcxu.zzb(this.zzb, zzcxnVar.zza, this.zza);
    }
}
