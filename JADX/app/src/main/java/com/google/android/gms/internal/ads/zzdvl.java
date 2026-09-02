package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvl implements zzfet {
    private final zzdve zzb;
    private final Clock zzc;
    private final Map<zzfem, Long> zza = new HashMap();
    private final Map<zzfem, zzdvk> zzd = new HashMap();

    public zzdvl(zzdve zzdveVar, Set<zzdvk> set, Clock clock) {
        this.zzb = zzdveVar;
        for (zzdvk zzdvkVar : set) {
            this.zzd.put(zzdvkVar.zzc, zzdvkVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfem zzfemVar, boolean z) {
        zzfem zzfemVar2 = this.zzd.get(zzfemVar).zzb;
        String str = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzfemVar2)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar2).longValue();
            Map<String, String> mapZzc = this.zzb.zzc();
            String str2 = this.zzd.get(zzfemVar).zza;
            String strConcat = str2.length() != 0 ? "label.".concat(str2) : new String("label.");
            String strValueOf = String.valueOf(Long.toString(jElapsedRealtime));
            mapZzc.put(strConcat, strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbE(zzfem zzfemVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbF(zzfem zzfemVar, String str) {
        this.zza.put(zzfemVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzc(zzfem zzfemVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfemVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar).longValue();
            Map<String, String> mapZzc = this.zzb.zzc();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jElapsedRealtime));
            mapZzc.put(strConcat, strValueOf2.length() != 0 ? "f.".concat(strValueOf2) : new String("f."));
        }
        if (this.zzd.containsKey(zzfemVar)) {
            zze(zzfemVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzd(zzfem zzfemVar, String str) {
        if (this.zza.containsKey(zzfemVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzfemVar).longValue();
            Map<String, String> mapZzc = this.zzb.zzc();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jElapsedRealtime));
            mapZzc.put(strConcat, strValueOf2.length() != 0 ? "s.".concat(strValueOf2) : new String("s."));
        }
        if (this.zzd.containsKey(zzfemVar)) {
            zze(zzfemVar, true);
        }
    }
}
