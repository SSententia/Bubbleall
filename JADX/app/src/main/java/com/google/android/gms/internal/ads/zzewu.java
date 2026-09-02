package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewu<R extends zzdal<AdT>, AdT extends zzcxg> implements zzexo<R, AdT> {
    private final zzexo<R, AdT> zza;
    private final zzexo<R, zzewz<R, AdT>> zzb;
    private final zzfcy<R, AdT> zzc;
    private final String zzd;
    private R zze;
    private final Executor zzf;

    public zzewu(zzexo<R, AdT> zzexoVar, zzexo<R, zzewz<R, AdT>> zzexoVar2, zzfcy<R, AdT> zzfcyVar, String str, Executor executor) {
        this.zza = zzexoVar;
        this.zzb = zzexoVar2;
        this.zzc = zzfcyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfsm<AdT> zzg(zzfcl<R, AdT> zzfclVar, zzexp zzexpVar) {
        R r = zzfclVar.zza;
        this.zze = r;
        if (zzfclVar.zzc != null) {
            if (r.zzQ() != null) {
                zzfclVar.zzc.zzn().zzq(zzfclVar.zza.zzQ());
            }
            return zzfsd.zza(zzfclVar.zzc);
        }
        r.zzP().zzi(zzfclVar.zzb);
        return ((zzexe) this.zza).zzb(zzexpVar, null, zzfclVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized R zzd() {
        return this.zze;
    }

    public final synchronized zzfsm<AdT> zzb(final zzexp zzexpVar, final zzexn<R> zzexnVar, R r) {
        zzdak<R> zzdakVarZza = zzexnVar.zza(zzexpVar.zzb);
        zzdakVarZza.zzg(new zzewv(this.zzd));
        final R rZzf = zzdakVarZza.zzf();
        rZzf.zzN();
        rZzf.zzN();
        zzbdg zzbdgVar = rZzf.zzN().zzd;
        if (zzbdgVar.zzs == null && zzbdgVar.zzx == null) {
            zzfar zzfarVarZzN = rZzf.zzN();
            final zzewt zzewtVar = new zzewt(zzexnVar, zzexpVar, zzfarVarZzN.zzd, zzfarVarZzN.zzf, this.zzf, zzfarVarZzN.zzj, null);
            return zzfsd.zzi(zzfru.zzw((zzfsm) ((zzexa) this.zzb).zza(zzexpVar, zzexnVar, rZzf)), new zzfrk(this, zzexpVar, zzewtVar, zzexnVar, rZzf) { // from class: com.google.android.gms.internal.ads.zzewq
                private final zzewu zza;
                private final zzexp zzb;
                private final zzewt zzc;
                private final zzexn zzd;
                private final zzdal zze;

                {
                    this.zza = this;
                    this.zzb = zzexpVar;
                    this.zzc = zzewtVar;
                    this.zzd = zzexnVar;
                    this.zze = rZzf;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzf(this.zzb, this.zzc, this.zzd, this.zze, (zzewz) obj);
                }
            }, this.zzf);
        }
        this.zze = rZzf;
        return ((zzexe) this.zza).zzb(zzexpVar, zzexnVar, rZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfsm zze(zzfcv zzfcvVar) throws Exception {
        Object obj;
        if (zzfcvVar == null || zzfcvVar.zza == null || (obj = zzfcvVar.zzb) == null) {
            throw new zzdym(1, "Empty prefetch");
        }
        zzazo zzazoVarZza = zzazu.zza();
        zzazm zzazmVarZza = zzazn.zza();
        zzazmVarZza.zzd(2);
        zzazmVarZza.zza(zzazr.zzc());
        zzazoVarZza.zza(zzazmVarZza);
        zzfcvVar.zza.zza.zzP().zze().zze(zzazoVarZza.zzah());
        return zzg(zzfcvVar.zza, ((zzewt) obj).zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfsm zzf(zzexp zzexpVar, zzewt zzewtVar, zzexn zzexnVar, zzdal zzdalVar, zzewz zzewzVar) throws Exception {
        if (zzewzVar != null) {
            zzewt zzewtVar2 = new zzewt(zzewtVar.zza, zzewtVar.zzb, zzewtVar.zzc, zzewtVar.zzd, zzewtVar.zze, zzewtVar.zzf, zzewzVar.zza);
            if (zzewzVar.zzc != null) {
                this.zze = null;
                this.zzc.zzc(zzewtVar2);
                return zzg(zzewzVar.zzc, zzexpVar);
            }
            zzfsm<zzfcv<R, AdT>> zzfsmVarZzd = this.zzc.zzd(zzewtVar2);
            if (zzfsmVarZzd != null) {
                this.zze = null;
                return zzfsd.zzi(zzfsmVarZzd, new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzewr
                    private final zzewu zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfrk
                    public final zzfsm zza(Object obj) {
                        return this.zza.zze((zzfcv) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zzc(zzewtVar2);
            zzexpVar = new zzexp(zzexpVar.zzb, zzewzVar.zzb);
        }
        zzfsm zzfsmVarZzb = ((zzexe) this.zza).zzb(zzexpVar, zzexnVar, zzdalVar);
        this.zze = zzdalVar;
        return zzfsmVarZzb;
    }
}
