package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzena implements zzery<zzenb> {
    private final zzfsn zza;
    private final zzdtf zzb;
    private final zzdxk zzc;
    private final zzenc zzd;

    public zzena(zzfsn zzfsnVar, zzdtf zzdtfVar, zzdxk zzdxkVar, zzenc zzencVar) {
        this.zza = zzfsnVar;
        this.zzb = zzdtfVar;
        this.zzc = zzdxkVar;
        this.zzd = zzencVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzenb> zza() {
        if (zzfmi.zzc((String) zzbet.zzc().zzc(zzbjl.zzaW)) || this.zzd.zzb() || !this.zzc.zzm()) {
            return zzfsd.zza(new zzenb(new Bundle(), null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemz
            private final zzena zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    final /* synthetic */ zzenb zzb() throws Exception {
        List<String> listAsList = Arrays.asList(((String) zzbet.zzc().zzc(zzbjl.zzaW)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfbi zzfbiVarZzb = this.zzb.zzb(str, new JSONObject());
                zzfbiVarZzb.zzn();
                Bundle bundle2 = new Bundle();
                try {
                    zzbya zzbyaVarZzA = zzfbiVarZzb.zzA();
                    if (zzbyaVarZzA != null) {
                        bundle2.putString("sdk_version", zzbyaVarZzA.toString());
                    }
                } catch (zzfaw unused) {
                }
                try {
                    zzbya zzbyaVarZzz = zzfbiVarZzb.zzz();
                    if (zzbyaVarZzz != null) {
                        bundle2.putString("adapter_version", zzbyaVarZzz.toString());
                    }
                } catch (zzfaw unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfaw unused3) {
            }
        }
        return new zzenb(bundle, null);
    }
}
