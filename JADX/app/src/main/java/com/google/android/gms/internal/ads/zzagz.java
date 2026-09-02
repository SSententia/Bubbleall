package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagz {
    private final zzagy zzd;
    private final zzho zze;
    private final zzfa zzf;
    private final HashMap<zzagx, zzagw> zzg;
    private final Set<zzagx> zzh;
    private boolean zzi;
    private zzay zzj;
    private zzix zzk = new zzix(0);
    private final IdentityHashMap<zzhe, zzagx> zzb = new IdentityHashMap<>();
    private final Map<Object, zzagx> zzc = new HashMap();
    private final List<zzagx> zza = new ArrayList();

    public zzagz(zzagy zzagyVar, zzcy zzcyVar, Handler handler) {
        this.zzd = zzagyVar;
        zzho zzhoVar = new zzho();
        this.zze = zzhoVar;
        zzfa zzfaVar = new zzfa();
        this.zzf = zzfaVar;
        this.zzg = new HashMap<>();
        this.zzh = new HashSet();
        zzhoVar.zzb(handler, zzcyVar);
        zzfaVar.zzb(handler, zzcyVar);
    }

    private final void zzp() {
        Iterator<zzagx> it = this.zzh.iterator();
        while (it.hasNext()) {
            zzagx next = it.next();
            if (next.zzc.isEmpty()) {
                zzq(next);
                it.remove();
            }
        }
    }

    private final void zzq(zzagx zzagxVar) {
        zzagw zzagwVar = this.zzg.get(zzagxVar);
        if (zzagwVar != null) {
            zzagwVar.zza.zzq(zzagwVar.zzb);
        }
    }

    private final void zzr(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzagx zzagxVarRemove = this.zza.remove(i2);
            this.zzc.remove(zzagxVarRemove.zzb);
            zzs(i2, -zzagxVarRemove.zza.zzy().zza());
            zzagxVarRemove.zze = true;
            if (this.zzi) {
                zzu(zzagxVarRemove);
            }
        }
    }

    private final void zzs(int i, int i2) {
        while (i < this.zza.size()) {
            this.zza.get(i).zzd += i2;
            i++;
        }
    }

    private final void zzt(zzagx zzagxVar) {
        zzhb zzhbVar = zzagxVar.zza;
        zzhg zzhgVar = new zzhg(this) { // from class: com.google.android.gms.internal.ads.zzagu
            private final zzagz zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzhg
            public final void zza(zzhh zzhhVar, zzaiq zzaiqVar) {
                this.zza.zzi(zzhhVar, zzaiqVar);
            }
        };
        zzagv zzagvVar = new zzagv(this, zzagxVar);
        this.zzg.put(zzagxVar, new zzagw(zzhbVar, zzhgVar, zzagvVar));
        zzhbVar.zzk(new Handler(zzamq.zzk(), null), zzagvVar);
        zzhbVar.zzm(new Handler(zzamq.zzk(), null), zzagvVar);
        zzhbVar.zzo(zzhgVar, this.zzj);
    }

    private final void zzu(zzagx zzagxVar) {
        if (zzagxVar.zze && zzagxVar.zzc.isEmpty()) {
            zzagw zzagwVarRemove = this.zzg.remove(zzagxVar);
            zzagwVarRemove.getClass();
            zzagwVarRemove.zza.zzr(zzagwVarRemove.zzb);
            zzagwVarRemove.zza.zzl(zzagwVarRemove.zzc);
            zzagwVarRemove.zza.zzn(zzagwVarRemove.zzc);
            this.zzh.remove(zzagxVar);
        }
    }

    public final boolean zzc() {
        return this.zzi;
    }

    public final int zzd() {
        return this.zza.size();
    }

    public final void zze(zzay zzayVar) {
        zzakt.zzd(!this.zzi);
        this.zzj = zzayVar;
        for (int i = 0; i < this.zza.size(); i++) {
            zzagx zzagxVar = this.zza.get(i);
            zzt(zzagxVar);
            this.zzh.add(zzagxVar);
        }
        this.zzi = true;
    }

    public final void zzf(zzhe zzheVar) {
        zzagx zzagxVarRemove = this.zzb.remove(zzheVar);
        zzagxVarRemove.getClass();
        zzagxVarRemove.zza.zzA(zzheVar);
        zzagxVarRemove.zzc.remove(((zzgy) zzheVar).zza);
        if (!this.zzb.isEmpty()) {
            zzp();
        }
        zzu(zzagxVarRemove);
    }

    public final void zzg() {
        for (zzagw zzagwVar : this.zzg.values()) {
            try {
                zzagwVar.zza.zzr(zzagwVar.zzb);
            } catch (RuntimeException e) {
                zzaln.zzb("MediaSourceList", "Failed to release child source.", e);
            }
            zzagwVar.zza.zzl(zzagwVar.zzc);
            zzagwVar.zza.zzn(zzagwVar.zzc);
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzi = false;
    }

    public final zzaiq zzh() {
        if (this.zza.isEmpty()) {
            return zzaiq.zzc;
        }
        int iZza = 0;
        for (int i = 0; i < this.zza.size(); i++) {
            zzagx zzagxVar = this.zza.get(i);
            zzagxVar.zzd = iZza;
            iZza += zzagxVar.zza.zzy().zza();
        }
        return new zzaht(this.zza, this.zzk, null);
    }

    final /* synthetic */ void zzi(zzhh zzhhVar, zzaiq zzaiqVar) {
        this.zzd.zzl();
    }

    public final zzaiq zzj(List<zzagx> list, zzix zzixVar) {
        zzr(0, this.zza.size());
        return zzk(this.zza.size(), list, zzixVar);
    }

    public final zzaiq zzk(int i, List<zzagx> list, zzix zzixVar) {
        if (!list.isEmpty()) {
            this.zzk = zzixVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzagx zzagxVar = list.get(i2 - i);
                if (i2 > 0) {
                    zzagx zzagxVar2 = this.zza.get(i2 - 1);
                    zzagxVar.zza(zzagxVar2.zzd + zzagxVar2.zza.zzy().zza());
                } else {
                    zzagxVar.zza(0);
                }
                zzs(i2, zzagxVar.zza.zzy().zza());
                this.zza.add(i2, zzagxVar);
                this.zzc.put(zzagxVar.zzb, zzagxVar);
                if (this.zzi) {
                    zzt(zzagxVar);
                    if (this.zzb.isEmpty()) {
                        this.zzh.add(zzagxVar);
                    } else {
                        zzq(zzagxVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzaiq zzl(int i, int i2, zzix zzixVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzd()) {
            z = true;
        }
        zzakt.zza(z);
        this.zzk = zzixVar;
        zzr(i, i2);
        return zzh();
    }

    public final zzaiq zzm(int i, int i2, int i3, zzix zzixVar) {
        zzakt.zza(zzd() >= 0);
        this.zzk = null;
        return zzh();
    }

    public final zzaiq zzn(zzix zzixVar) {
        int iZzd = zzd();
        if (zzixVar.zza() != iZzd) {
            zzixVar = zzixVar.zzh().zzf(0, iZzd);
        }
        this.zzk = zzixVar;
        return zzh();
    }

    public final zzhe zzo(zzhf zzhfVar, zzko zzkoVar, long j) {
        Object obj = ((Pair) zzhfVar.zza).first;
        zzhf zzhfVarZzc = zzhfVar.zzc(((Pair) zzhfVar.zza).second);
        zzagx zzagxVar = this.zzc.get(obj);
        zzagxVar.getClass();
        this.zzh.add(zzagxVar);
        zzagw zzagwVar = this.zzg.get(zzagxVar);
        if (zzagwVar != null) {
            zzagwVar.zza.zzp(zzagwVar.zzb);
        }
        zzagxVar.zzc.add(zzhfVarZzc);
        zzgy zzgyVarZzC = zzagxVar.zza.zzC(zzhfVarZzc, zzkoVar, j);
        this.zzb.put(zzgyVarZzC, zzagxVar);
        zzp();
        return zzgyVarZzC;
    }
}
