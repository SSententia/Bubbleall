package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfcd implements zzfcc {
    private final ConcurrentHashMap<zzfcm, zzfcb> zza;
    private final zzfcj zzb;
    private final zzfcf zzc = new zzfcf();

    public zzfcd(zzfcj zzfcjVar) {
        this.zza = new ConcurrentHashMap<>(zzfcjVar.zzd);
        this.zzb = zzfcjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfcj> creator = zzfcj.CREATOR;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeG)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry<zzfcm, zzfcb> entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzc = entry.getValue().zzc(); iZzc < this.zzb.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized zzfcl<?, ?> zza(zzfcm zzfcmVar) {
        zzfcl<?, ?> zzfclVarZzb;
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            zzfclVarZzb = zzfcbVar.zzb();
            if (zzfclVarZzb == null) {
                this.zzc.zzb();
            }
            zzfcz zzfczVarZzh = zzfcbVar.zzh();
            if (zzfclVarZzb != null) {
                zzazo zzazoVarZza = zzazu.zza();
                zzazm zzazmVarZza = zzazn.zza();
                zzazmVarZza.zzd(2);
                zzazq zzazqVarZza = zzazr.zza();
                zzazqVarZza.zza(zzfczVarZzh.zza);
                zzazqVarZza.zzb(zzfczVarZzh.zzb);
                zzazmVarZza.zzb(zzazqVarZza);
                zzazoVarZza.zza(zzazmVarZza);
                zzfclVarZzb.zza.zzP().zze().zzc(zzazoVarZza.zzah());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfclVarZzb = null;
        }
        return zzfclVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zzb(zzfcm zzfcmVar, zzfcl<?, ?> zzfclVar) {
        boolean zZza;
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        zzfclVar.zzd = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        if (zzfcbVar == null) {
            zzfcj zzfcjVar = this.zzb;
            zzfcbVar = new zzfcb(zzfcjVar.zzd, zzfcjVar.zze * 1000);
            int size = this.zza.size();
            zzfcj zzfcjVar2 = this.zzb;
            if (size == zzfcjVar2.zzc) {
                int i = zzfcjVar2.zzg;
                int i2 = i - 1;
                zzfcm key = null;
                if (i == 0) {
                    throw null;
                }
                long jZzd = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry<zzfcm, zzfcb> entry : this.zza.entrySet()) {
                        if (entry.getValue().zzd() < jZzd) {
                            jZzd = entry.getValue().zzd();
                            key = entry.getKey();
                        }
                    }
                    if (key != null) {
                        this.zza.remove(key);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry<zzfcm, zzfcb> entry2 : this.zza.entrySet()) {
                        if (entry2.getValue().zze() < jZzd) {
                            jZzd = entry2.getValue().zze();
                            key = entry2.getKey();
                        }
                    }
                    if (key != null) {
                        this.zza.remove(key);
                    }
                } else if (i2 == 2) {
                    int iZzf = Integer.MAX_VALUE;
                    for (Map.Entry<zzfcm, zzfcb> entry3 : this.zza.entrySet()) {
                        if (entry3.getValue().zzf() < iZzf) {
                            iZzf = entry3.getValue().zzf();
                            key = entry3.getKey();
                        }
                    }
                    if (key != null) {
                        this.zza.remove(key);
                    }
                }
                this.zzc.zzd();
            }
            this.zza.put(zzfcmVar, zzfcbVar);
            this.zzc.zzc();
        }
        zZza = zzfcbVar.zza(zzfclVar);
        this.zzc.zze();
        zzfce zzfceVarZzf = this.zzc.zzf();
        zzfcz zzfczVarZzh = zzfcbVar.zzh();
        if (zzfclVar != null) {
            zzazo zzazoVarZza = zzazu.zza();
            zzazm zzazmVarZza = zzazn.zza();
            zzazmVarZza.zzd(2);
            zzazs zzazsVarZza = zzazt.zza();
            zzazsVarZza.zza(zzfceVarZzf.zza);
            zzazsVarZza.zzb(zzfceVarZzf.zzb);
            zzazsVarZza.zzc(zzfczVarZzh.zzb);
            zzazmVarZza.zzc(zzazsVarZza);
            zzazoVarZza.zza(zzazmVarZza);
            zzfclVar.zza.zzP().zze().zzd(zzazoVarZza.zzah());
        }
        zzf();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zzc(zzfcm zzfcmVar) {
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            return zzfcbVar.zzc() < this.zzb.zzd;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    @Deprecated
    public final zzfcm zzd(zzbdg zzbdgVar, String str, zzbdr zzbdrVar) {
        return new zzfcn(zzbdgVar, str, new zzcbn(this.zzb.zza).zza().zzk, this.zzb.zzf, zzbdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzfcj zze() {
        return this.zzb;
    }
}
