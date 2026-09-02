package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyv implements zzgla<zzfsm<String>> {
    private final zzgln<zzaas> zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzfsn> zzc;

    public zzdyv(zzgln<zzaas> zzglnVar, zzgln<Context> zzglnVar2, zzgln<zzfsn> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaas zzaasVarZzb = this.zza.zzb();
        final Context contextZza = ((zzfbv) this.zzb).zza();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzfsm zzfsmVarZzb = zzfsnVar.zzb(new Callable(zzaasVarZzb, contextZza) { // from class: com.google.android.gms.internal.ads.zzdyu
            private final zzaas zza;
            private final Context zzb;

            {
                this.zza = zzaasVarZzb;
                this.zzb = contextZza;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaas zzaasVar = this.zza;
                return zzaasVar.zzb().zzp(this.zzb);
            }
        });
        zzgli.zzb(zzfsmVarZzb);
        return zzfsmVarZzb;
    }
}
