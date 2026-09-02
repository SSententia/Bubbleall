package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdal;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewp<R extends zzdal<AdT>, AdT extends zzcxg> implements zzexo<R, zzfcl<R, AdT>> {
    private R zza;
    private final Executor zzb = zzfst.zza();

    public final R zza() {
        return this.zza;
    }

    public final zzfsm<zzfcl<R, AdT>> zzb(zzexp zzexpVar, zzexn<R> zzexnVar, R r) {
        zzdak<R> zzdakVarZza = zzexnVar.zza(zzexpVar.zzb);
        zzdakVarZza.zzh(new zzexu(true));
        R rZzf = zzdakVarZza.zzf();
        this.zza = rZzf;
        final zzcyj zzcyjVarZzP = rZzf.zzP();
        final zzfcl zzfclVar = new zzfcl();
        return zzfsd.zzj(zzfsd.zzi(zzfru.zzw((zzfsm) zzcyjVarZzP.zzc()), new zzfrk(this, zzfclVar, zzcyjVarZzP) { // from class: com.google.android.gms.internal.ads.zzewn
            private final zzewp zza;
            private final zzfcl zzb;
            private final zzcyj zzc;

            {
                this.zza = this;
                this.zzb = zzfclVar;
                this.zzc = zzcyjVarZzP;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                zzfcl zzfclVar2 = this.zzb;
                zzcyj zzcyjVar = this.zzc;
                zzfal zzfalVar = (zzfal) obj;
                zzfclVar2.zzb = zzfalVar;
                Iterator<zzezz> it = zzfalVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator<String> it2 = it.next().zza.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            return zzfsd.zza(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzcyjVar.zzd(zzfsd.zza(zzfalVar));
                }
                return zzfsd.zza(null);
            }
        }, this.zzb), new zzfln(zzfclVar) { // from class: com.google.android.gms.internal.ads.zzewo
            private final zzfcl zza;

            {
                this.zza = zzfclVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                zzfcl zzfclVar2 = this.zza;
                zzfclVar2.zzc = (AdT) obj;
                return zzfclVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ Object zzd() {
        return this.zza;
    }
}
