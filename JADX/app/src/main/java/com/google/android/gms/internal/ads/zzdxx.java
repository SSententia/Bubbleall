package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxx {
    private final zzdxk zza;
    private final zzdtc zzb;
    private final Object zzc = new Object();
    private final List<zzdxw> zzd = new ArrayList();
    private boolean zze;

    zzdxx(zzdxk zzdxkVar, zzdtc zzdtcVar) {
        this.zza = zzdxkVar;
        this.zzb = zzdtcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List<zzbrl> list) {
        zzbya zzbyaVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            for (zzbrl zzbrlVar : list) {
                List<zzdxw> list2 = this.zzd;
                String str = zzbrlVar.zza;
                zzdtb zzdtbVarZzc = this.zzb.zzc(str);
                String string = (zzdtbVarZzc == null || (zzbyaVar = zzdtbVarZzc.zzb) == null) ? "" : zzbyaVar.toString();
                list2.add(new zzdxw(str, string, zzbrlVar.zzb ? 1 : 0, zzbrlVar.zzd, zzbrlVar.zzc));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzh(new zzdxv(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzm()) {
                    zza();
                    return jSONArray;
                }
                zzd(this.zza.zzj());
            }
            Iterator<zzdxw> it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().zza());
            }
            return jSONArray;
        }
    }
}
