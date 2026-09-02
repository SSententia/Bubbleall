package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvr {
    private final String zze;
    private final zzdvn zzf;
    private final List<Map<String, String>> zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzg().zzp();

    public zzdvr(String str, zzdvn zzdvnVar) {
        this.zze = str;
        this.zzf = zzdvnVar;
    }

    private final Map<String, String> zzf() {
        Map<String, String> mapZza = this.zzf.zza();
        mapZza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime(), 10));
        mapZza.put("tid", this.zza.zzC() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                Map<String, String> mapZzf = zzf();
                mapZzf.put("action", "adapter_init_started");
                mapZzf.put("ancn", str);
                this.zzb.add(mapZzf);
            }
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                Map<String, String> mapZzf = zzf();
                mapZzf.put("action", "adapter_init_finished");
                mapZzf.put("ancn", str);
                this.zzb.add(mapZzf);
            }
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                Map<String, String> mapZzf = zzf();
                mapZzf.put("action", "adapter_init_finished");
                mapZzf.put("ancn", str);
                mapZzf.put("rqe", str2);
                this.zzb.add(mapZzf);
            }
        }
    }

    public final synchronized void zzd() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                if (this.zzc) {
                    return;
                }
                Map<String, String> mapZzf = zzf();
                mapZzf.put("action", "init_started");
                this.zzb.add(mapZzf);
                this.zzc = true;
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                if (this.zzd) {
                    return;
                }
                Map<String, String> mapZzf = zzf();
                mapZzf.put("action", "init_finished");
                this.zzb.add(mapZzf);
                Iterator<Map<String, String>> it = this.zzb.iterator();
                while (it.hasNext()) {
                    this.zzf.zzb(it.next());
                }
                this.zzd = true;
            }
        }
    }
}
