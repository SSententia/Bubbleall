package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzetn implements zzery<zzeto> {
    final zzfsn zza;
    final String zzb;
    final zzcft zzc;

    public zzetn(zzcft zzcftVar, zzfsn zzfsnVar, String str, byte[] bArr) {
        this.zzc = zzcftVar;
        this.zza = zzfsnVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeto> zza() {
        new zzchl();
        final zzfsm zzfsmVarZza = zzfsd.zza(null);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzee)).booleanValue()) {
            zzfsmVarZza = zzfsd.zza(null);
        }
        final zzfsm zzfsmVarZza2 = zzfsd.zza(null);
        return zzfsd.zzn(zzfsmVarZza, zzfsmVarZza2).zza(new Callable(zzfsmVarZza, zzfsmVarZza2) { // from class: com.google.android.gms.internal.ads.zzetm
            private final zzfsm zza;
            private final zzfsm zzb;

            {
                this.zza = zzfsmVarZza;
                this.zzb = zzfsmVarZza2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeto((String) this.zza.get(), (String) this.zzb.get());
            }
        }, zzchg.zza);
    }
}
